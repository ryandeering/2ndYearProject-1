package controllers;

import play.mvc.*;
import play.data.*;
import javax.inject.Inject;

import views.html.*;
import play.db.ebean.Transactional;
import play.api.Environment;

// Import models
import models.users.*;
import models.products.*;
import models.shopping.*;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;



// Import security controllers
import controllers.*;

// Authenticate user
@Security.Authenticated(Secured.class)
// Authorise user (check if user is a customer)
@With(AuthCustomer.class)

public class ShoppingCtrl extends Controller {


    /** Dependency Injection **/

    /** http://stackoverflow.com/questions/15600186/play-framework-dependency-injection **/
    private FormFactory formFactory;
    private final MailerClient mailer;

    /** http://stackoverflow.com/a/37024198 **/
    private Environment env;

    /** http://stackoverflow.com/a/10159220/6322856 **/
    @Inject
    public ShoppingCtrl(Environment e, FormFactory f, MailerClient m) {
        this.env = e;
        this.formFactory = f;
        this.mailer = m;
    }

// @inputText(discountForm("discount.discountID"), '_label -> "Discount Voucher", 'class -> "form-control") </p>

    // Get a user - if logged in email will be set in the session
    private Customer getCurrentUser() {
        return (Customer)User.getLoggedIn(session().get("email"));
    }

    @Transactional
    public Result showBasket() {
        Form<Discount> discountForm = formFactory.form(Discount.class).bindFromRequest();
        Customer c = (Customer) User.getLoggedIn(session().get("email"));
        c.getBasket().getDiscount();
        return ok(basket.render(getCurrentUser(), discountForm));
    }

    // Add item to customer basket
    @Transactional
    public Result addToBasket(Long id) {
        // Find the product
        Form<Discount> discountForm = formFactory.form(Discount.class).bindFromRequest();
        Product p = Product.find.byId(id);

        // Get basket for logged in customer
        Customer customer = (Customer) User.getLoggedIn(session().get("email"));

        // Check if item in basket
        if (customer.getBasket() == null) {
            // If no basket, create one
            customer.setBasket(new Basket());
            customer.getBasket().setCustomer(customer);
            customer.getBasket().setDiscount(new Discount());
            customer.update();

        }
        // Add product to the basket and save
        customer.getBasket().addProduct(p);
        customer.getBasket().getDiscount();
        customer.update();

        p.decrementStock();
        p.update();


        // Show the basket contents
        return ok(basket.render(customer, discountForm));
    }

    // Add an item to the basket
    @Transactional
    public Result addOne(Long itemId, Long pid) {

        // Get the order item
        OrderItem item = OrderItem.find.byId(itemId);

        Product ios = Product.find.byId(pid);
        // Increment quantity
        if(ios.getStock()>0){
            item.increaseQty();
            // Save
            item.update();
            ios.decrementStock();
            ios.update();
        }else{
            flash("error","Sorry,no more of these items left");
        }
        // Show updated basket
        return redirect(routes.ShoppingCtrl.showBasket());
    }

    @Transactional
    public Result removeOne(Long itemId, Long pid) {
        Form<Discount> discountForm = formFactory.form(Discount.class).bindFromRequest();
        // Get the order item
        OrderItem item = OrderItem.find.byId(itemId);
        Product ios = Product.find.byId(pid);
        // Get user

        Customer c = getCurrentUser();
        // Call basket remove item method
        c.getBasket().removeItem(item,ios);
        c.getBasket().getDiscount();
        c.getBasket().update();
        // back to basket
        return ok(basket.render(c, discountForm));
    }

    // Empty Basket
    @Transactional
    public Result emptyBasket() {
        Form<Discount> discountForm = formFactory.form(Discount.class).bindFromRequest();
        Customer c = getCurrentUser();
        c.getBasket().removeAllItems();
        c.getBasket().setDiscount(new Discount());
        c.getBasket().update();

        return ok(basket.render(c, discountForm));
    }                           //, discountForm

    @Transactional
    public Result placeOrder() {

        Customer c = getCurrentUser();


        // Create an order instance
        ShopOrder order = new ShopOrder();


        // Associate order with customer
        order.setCustomer(c);



        // Copy basket to order
        order.setItems(c.getBasket().getBasketItems());

        // Save the order now to generate a new id for this order
        order.save();

        // Move items from basket to order
        for (OrderItem i: order.getItems()) {

            // Associate with order
            i.setOrder(order);

            // Remove from basket
            i.setBasket(null);

            i.setDiscount(c.getBasket().getDiscount());

            // update item
            i.update();
        }

        // Update the order
        order.update();

        // Clear and update the shopping basket
        c.getBasket().setBasketItems(null);
        // c.getBasket().setDiscount(new Discount()); This will be needed when Daria sorts out the order confirmed properly.
        c.getBasket().update();

        //send email

        String cid = c.getEmail();
        final Email email = new Email()
                .setSubject("Order ID:" + order.getId() + " | " + order.getOrderDate())
                .setFrom("CDR Games <cdrgamescdr@email.com>")
                .addTo(c.getfName() + " " + c.getlName() + "<" + c.getEmail() + ">")
                .setBodyText(c.getEmail())
                .setBodyHtml("<html><body><p>An <b>html</b> message with cid <img src=\"cid:" + c.getEmail() + "\"></p></body></html>");
             mailer.send(email);


        // Show order confirmed view
        return ok(orderConfirmed.render(c, order));
    }

    // View an individual order
    @Transactional
    public Result viewOrder(long id) {
        ShopOrder order = ShopOrder.find.byId(id);
        return ok(orderConfirmed.render(getCurrentUser(), order));
    }



    @Transactional
    public Result viewOrders() {
        Customer c = (Customer) User.getLoggedIn(session().get("email"));
        return ok(viewOrders.render((Customer)User.getUserById(session().get("email"))));
    }


    @Transactional
    public Result cancelOrder(Long orderId){
        ShopOrder order = ShopOrder.find.byId(orderId);
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        c1=order.toCalendar();
        if(compareDates(c1,c2)){
            // order.removeAllItems(orderId);
            order.adjustStock();
            order.delete();

            flash("success", "Your order has been cancelled");
        }else {
            flash("success", "Sorry, it is too late to cancel this order");
        }
        return ok(viewOrders.render((Customer)User.getUserById(session().get("email"))));
    }


    public boolean compareDates(Calendar c1, Calendar c2){
        boolean allowed = true;
        long miliSecondForDate1 = c1.getTimeInMillis();
        long miliSecondForDate2 = c2.getTimeInMillis();
        // Calculate the difference in millisecond between two dates
        long diffInMilis = miliSecondForDate2 - miliSecondForDate1;

        long diffInMinutes = diffInMilis / (60 * 1000);
        if(diffInMinutes >60){
            allowed=false;
        }
        return allowed;
    }

    @Transactional
    public Result setDiscount(){
        Customer c = getCurrentUser();
        Form<Discount> discountForm = formFactory.form(Discount.class).bindFromRequest();
        Discount d = discountForm.get();
        Basket b = c.getBasket();
        b.setDiscount(d);


        if (d.getDiscountID() == null){
            return badRequest(basket.render(c, discountForm));
        }

        return ok(basket.render(c, discountForm));
    }







}
