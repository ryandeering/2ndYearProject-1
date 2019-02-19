package controllers;

import play.mvc.*;
import play.data.*;
import javax.inject.Inject;

import views.html.*;
import play.db.ebean.Transactional;
import play.api.Environment;

import models.users.*;
import models.products.*;
import models.shopping.*;

import controllers.security.*;

@Security.Authenticated(Secured.class)
// check if user is a customer
@With(CheckIfCustomer.class)

public class ShoppingCtrl extends Controller {


    private FormFactory formFactory;

    private Environment env;

    @Inject
    public ShoppingCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }


    
    // Get a user
	private Customer getCurrentUser() {
		return (Customer)User.getLoggedIn(session().get("email"));
	}

    @Transactional
    public Result showBasket() {
        return ok(basket.render(getCurrentUser()));
    }
    
    // Add item to customer basket
    @Transactional
    public Result addToBasket(Long id) {
        
        Product p = Product.find.byId(id);
        
        Customer customer = (Customer)User.getLoggedIn(session().get("email"));
        
        // Check if item in basket
        if (customer.getBasket() == null) {
            // If no basket, create one
            customer.setBasket(new Basket());
            customer.getBasket().setCustomer(customer);
            customer.update();
        }
        // Add product to basket and save
        customer.getBasket().addProduct(p);
        customer.update();
        
        // basket contents
        return ok(basket.render(customer));
    }
    
    // Add item to basket
    @Transactional
    public Result addOne(Long itemId) {
        
        // Get the order item
        OrderItem item = OrderItem.find.byId(itemId);
        // Increment quantity
        item.increaseQty();
        // Save
        item.update();
        // Show updated basket
        return redirect(routes.ShoppingCtrl.showBasket());
    }

    @Transactional
    public Result removeOne(Long itemId) {
        
        OrderItem item = OrderItem.find.byId(itemId);
        // Get user
        Customer c = getCurrentUser();
        c.getBasket().removeItem(item);
        c.getBasket().update();
        return ok(basket.render(c));
    }

    @Transactional
    public Result emptyBasket() {
        
        Customer c = getCurrentUser();
        c.getBasket().removeAllItems();
        c.getBasket().update();
        
        return ok(basket.render(c));
    }

    @Transactional
    public Result placeOrder() {
        Customer c = getCurrentUser();
        
        ShopOrder order = new ShopOrder();
        
        order.setCustomer(c);
        
        order.setItems(c.getBasket().getBasketItems());
        
        order.save();
       
        for (OrderItem i: order.getItems()) {
            i.setOrder(order);
            i.setBasket(null);
            i.update();
        }
        
        order.update();
        
        c.getBasket().setBasketItems(null);
        c.getBasket().update();
        
        return ok(orderConfirmed.render(c, order));
    }
    
    @Transactional
    public Result viewOrder(long id) {
        ShopOrder order = ShopOrder.find.byId(id);
        return ok(orderConfirmed.render(getCurrentUser(), order));
    }

}