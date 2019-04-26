package controllers;

import models.products.Category;
import models.products.Product;
import models.users.User;
import play.api.Environment;
import play.data.FormFactory;
import play.db.ebean.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.listProducts;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

// Import models


public class ProductCtrl extends Controller {

    private FormFactory formFactory;

    private play.api.Environment env;

    @Inject
    public ProductCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    // Get a user - if logged in email will be set in the session
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
        } else {
            products = Product.findFilter(cat, filter);
        }
        return ok(listProducts.render(env, categories, products, cat, filter, getCurrentUser()));

    }
}
