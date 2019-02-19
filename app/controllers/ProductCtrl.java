package controllers;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;

import models.users.*;
import models.products.*;


public class ProductCtrl extends Controller {

    private FormFactory formFactory;
    private play.api.Environment env;

    @Inject
    public ProductCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    // Get a user
    @Transactional
	public User getCurrentUser() {
		User u = User.getLoggedIn(session().get("email"));
		return u;
	}

    public Result index() {
		return redirect(routes.ProductCtrl.listProducts(0, ""));
    }

    @Transactional
    public Result listProducts(Long cat, String filter) {
        List<Category> categories = Category.findAll();			
        List<Product> products = new ArrayList<Product>();
    
        if (cat == 0) {
            products = Product.findAll(filter);
        }
        else {
            products = Product.findFilter(cat, filter);
        }
        return ok(listProducts.render(env, categories, products, cat, filter, getCurrentUser()));
    }
}
