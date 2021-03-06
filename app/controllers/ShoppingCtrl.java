package controllers;

import models.products.Product;
import models.shopping.Basket;
import models.shopping.Discount;
import models.shopping.OrderItem;
import models.shopping.ShopOrder;
import models.users.Customer;
import models.users.User;
import play.api.Environment;
import play.data.Form;
import play.data.FormFactory;
import play.db.ebean.Transactional;
import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import play.mvc.With;
import views.html.applyDiscount;
import views.html.basket;
import views.html.orderConfirmed;
import views.html.viewOrders;

import javax.inject.Inject;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

// Import models
// Import security controllers

// Authenticate user
@Security.Authenticated(Secured.class)
// Authorise user (check if user is a customer)
@With(AuthCustomer.class)

public class ShoppingCtrl extends Controller {


    /** Dependency Injection **/

    /**
     * http://stackoverflow.com/questions/15600186/play-framework-dependency-injection
     **/
    private FormFactory formFactory;
    private final MailerClient mailer;


    /**
     * http://stackoverflow.com/a/37024198
     **/
    private Environment env;

    /**
     * http://stackoverflow.com/a/10159220/6322856
     **/
    @Inject
    public ShoppingCtrl(Environment e, FormFactory f, MailerClient m) {
        this.env = e;
        this.formFactory = f;
        this.mailer = m;
    }

// @inputText(discountForm("discount.discountID"), '_label -> "Discount Voucher", 'class -> "form-control") </p>

    // Get a user - if logged in email will be set in the session
    private Customer getCurrentUser() {
        return (Customer) User.getLoggedIn(session().get("email"));
    }

    @Transactional
    public Result showBasket() {
        Form<Discount> discountForm = formFactory.form(Discount.class).bindFromRequest();
        Customer c = (Customer) User.getLoggedIn(session().get("email"));
        if (c.getBasket() == null) {
            // If no basket, create one
            c.setBasket(new Basket());
            c.getBasket().setCustomer(c);
            c.getBasket().setDiscount(new Discount());
            c.update();

        }
        c.getBasket().getDiscount();
        return ok(basket.render(getCurrentUser()));
    }

    // Add item to customer basket
    @Transactional
    public Result addToBasket(Long id) {
        // Find the product
        Form<Discount> discountForm = formFactory.form(Discount.class).bindFromRequest();
        Product p = Product.find.byId(id);


        // Get basket for logged in customer
        Customer customer = (Customer) User.getLoggedIn(session().get("email"));


        if (p.getStock() <= 0) {
            flash("success", "Product out of stock.");
            return redirect("/showBasket");
        }


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
        return ok(basket.render(customer));
    }

    // Add an item to the basket
    @Transactional
    public Result addOne(Long itemId, Long pid) {

        // Get the order item
        OrderItem item = OrderItem.find.byId(itemId);

        Product ios = Product.find.byId(pid);

        if (ios.getStock() == 0) {
            flash("error", "No more of these items left.");
        }


        // Increment quantity
        if (ios.getStock() > 0) {
            item.increaseQty();
            // Save
            item.update();
            ios.decrementStock();
            ios.update();
        } else {
            flash("error", "Sorry,no more of these items left");
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
        c.getBasket().removeItem(item, ios);
        c.getBasket().getDiscount();
        c.getBasket().update();
        // back to basket
        return ok(basket.render(c));
    }

    // Empty Basket
    @Transactional
    public Result emptyBasket() {
        Form<Discount> discountForm = formFactory.form(Discount.class).bindFromRequest();
        Customer c = getCurrentUser();
        c.getBasket().removeAllItems();
        c.getBasket().setDiscount(new Discount());
        c.getBasket().setDiscountSet(false);
        c.getBasket().update();

        return ok(basket.render(c));
    }                           //, discountForm

    @Transactional
    public Result placeOrder() {


        Customer c = getCurrentUser();


        if (c.getBasket().getBasketTotal() == 0.00) {
            flash("success", "Your basket is empty. ");
            return badRequest(basket.render(c));
        }
        if (c.getAddress().getStreetAddress().equals("")) {
            flash("error", "You've probably not set your address. Go to your profile and set it!");
            return badRequest(basket.render(c));
        }


        // Create an order instance
        ShopOrder order = new ShopOrder();
        try {

            // Associate order with customer
            order.setCustomer(c);


            // Copy basket to order
            order.setItems(c.getBasket().getBasketItems());

            // Save the order now to generate a new id for this order
            order.save();


            // Move items from basket to order
            for (OrderItem i : order.getItems()) {

                i.setOrder(order);
                i.setBasket(null);
                i.setDiscount(c.getBasket().getDiscount());
                i.update();
            }

            String itable = "";

            // Update the order
            order.update();
            List<OrderItem> copy = order.getItems();
            HomeController.log("placed order" + order.getId());
            // Clear and update the shopping basket
            c.getBasket().setBasketItems(null);
            c.getBasket().setDiscount(new Discount());
            c.getBasket().setDiscountSet(false);
            c.getBasket().update();

            for (OrderItem i : copy) {
                itable = itable + "<tr><td>" + i.getProduct().getName() + "</td><td>" + i.getQuantity() + "</td><td> " + i.getPrice() + " Euro</td><td>" + i.getItemTotal() + " Euro</td></tr>";
            }
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            //send email
            String cid = c.getEmail();
            final Email email = new Email()
                    .setSubject("Order ID:" + order.getId() + " | " + format.format(order.getOrderDate()))
                    .setFrom("CDR Games <cdrgamescdr@email.com>")
                    .addTo(c.getfName() + " " + c.getlName() + "<" + c.getEmail() + ">")
                    .setBodyHtml("<html> <body style=' border: 1px solid black; background-color:grey;'><center><h1>CDR Games</h1></center> <h2> Name: " + c.getfName() + " " + c.getlName() + " <br/> Address: " + c.getAddress().getStreetAddress() + "\n" + c.getAddress().getTown() + "\n" + c.getAddress().getCountry() + "\n" + " <br/> Order Total: " + order.getOrderTotal() + "</h2><br/><h2>ORDER RECEIPT: <br/>  Order Info:  <table style=' border: 1px solid black;'>" + itable + " <br/> </table></h2></body></html>");
            mailer.send(email);
        } catch (Exception e) {
            e.printStackTrace();
        }

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
        try {
            Customer c = (Customer) User.getLoggedIn(session().get("email"));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ok(viewOrders.render((Customer) User.getUserById(session().get("email"))));
    }


    @Transactional
    public Result cancelOrder(Long orderId) {
        ShopOrder order = ShopOrder.find.byId(orderId);

        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        c1 = order.toCalendar();
        if (compareDates(c1, c2)) {
            // order.removeAllItems(orderId);
            order.adjustStock();
            order.delete();

            flash("success", "Your order has been cancelled");
            HomeController.log("cancelled order " + order.getId());
        } else {
            flash("success", "Sorry, it is too late to cancel this order");
        }
        return ok(viewOrders.render((Customer) User.getUserById(session().get("email"))));
    }


    public boolean compareDates(Calendar c1, Calendar c2) {
        boolean allowed = true;
        long miliSecondForDate1 = c1.getTimeInMillis();
        long miliSecondForDate2 = c2.getTimeInMillis();
        // Calculate the difference in millisecond between two dates
        long diffInMilis = miliSecondForDate2 - miliSecondForDate1;

        long diffInMinutes = diffInMilis / (60 * 1000);
        if (diffInMinutes > 60) {
            allowed = false;
        }
        return allowed;
    }

//    @Transactional
//    public Result setDiscount(){
//        Customer c = getCurrentUser();
//        Form<Discount> discountForm = formFactory.form(Discount.class).bindFromRequest();
//        Discount d = discountForm.get();
//        Basket b = c.getBasket();
//        b.setDiscount(d);
//
//
//
//
//        if (d.getDiscountID() == null){
//            return badRequest(basket.render(c, discountForm));
//        }
//
//        return ok(basket.render(c, discountForm));
//    }


    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthCustomer.class)
    public Result applyDiscount() {
        Form<Discount> dForm = formFactory.form(Discount.class);
        return ok(applyDiscount.render(dForm, getCurrentUser()));
    }

    @Transactional
    public Result applyDiscountSubmit() {


        Discount d = new Discount();
        Form<Discount> newDiscountForm = formFactory.form(Discount.class).bindFromRequest();
        List<Discount> all = Discount.findAll();

        Customer c = getCurrentUser();
        Basket b = c.getBasket();


        if (newDiscountForm.hasErrors()) {
            flash("error", "Error");
            return badRequest(basket.render(c));
        }


        if (c.getBasket().isDiscountSet() == true) {
            flash("error", "This is awkward...discount already applied.");
            return badRequest(basket.render(c));
        }

//        if(d.valid == false){
//            flash("error", "Discount is out of date and not valid anymore, sorry!");
//            return badRequest(basket.render(c));
//        }


        d = Discount.find.byId(newDiscountForm.get().getDiscountID());


        if (d.valid == false) {
            flash("error", "Discount is out of date and not valid anymore, sorry!");
            return badRequest(basket.render(c));
        }


        b.setDiscountSet(true);
        b.setDiscount(d);

        for (int i = 0; i < b.getBasketItems().size(); i++) {
            b.getBasketItems().get(i).setDiscount(d);
        }


        b.update();

        flash("success", "Discount has been applied.");

        return redirect(routes.ShoppingCtrl.showBasket());
    }


}
