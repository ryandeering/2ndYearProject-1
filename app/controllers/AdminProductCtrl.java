package controllers;

import models.products.Category;
import models.products.Product;
import models.shopping.Discount;
import models.shopping.ShopOrder;
import models.users.User;
import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;
import play.api.Environment;
import play.data.Form;
import play.data.FormFactory;
import play.db.ebean.Transactional;
import play.mvc.*;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;
import views.html.AdminPanel.*;

import javax.inject.Inject;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

// Import models and views


@Security.Authenticated(Secured.class)
@With(AuthAdmin.class)

public class AdminProductCtrl extends Controller {


    private FormFactory formFactory;

    private Environment env;

    @Inject
    public AdminProductCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }


    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result adminPanel() {
        return ok(adminpanel.render(User.getUserById(session().get("email"))));
    }

    private User getCurrentUser() { // returns user for session
        User u = User.getLoggedIn(session().get("email"));
        return u;
    }

    public Result index() {
        return redirect(controllers.routes.AdminProductCtrl.listProducts(0));
    }

    @Transactional
    public Result listProducts(Long cat) {
        List<Category> categories = Category.find.query().where().orderBy("name asc").findList();
        List<Product> products = new ArrayList<Product>();

        if (cat == 0) {
            products = Product.findAll("");
        } else {
            products = Product.findFilter(cat, "");
        }

        return ok(listProducts.render(env, categories, products, getCurrentUser()));
    }


    @Transactional
    public Result addProduct() {
        Form<Product> addProductForm = formFactory.form(Product.class);
        return ok(addProduct.render(addProductForm, getCurrentUser()));
    }

    @Transactional
    public Result addProductSubmit() {

        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        if (newProductForm.hasErrors()) {
            return badRequest(addProduct.render(newProductForm, getCurrentUser()));
        }

        Product newProduct = newProductForm.get();

        newProduct.save();

        for (Long cat : newProduct.getCatSelect()) {
            newProduct.getCategories().add(Category.find.byId(cat));
        }

        HomeController.log("added a product " + newProduct.getName());
        newProduct.update();
        MultipartFormData<File> data = request().body().asMultipartFormData();
        FilePart<File> image = data.getFile("upload");

        String saveImageMsg = saveFile("productImages/", Long.toString(newProduct.getId()), image); ///fixed! - ryan

        flash("success", "Product " + newProduct.getName() + " has been created" + " " + saveImageMsg);

        return redirect(controllers.routes.AdminProductCtrl.index());
    }


    @Transactional
    public Result updateProduct(Long id) {
        Product p = Product.find.byId(id);
        Form<Product> productForm = formFactory.form(Product.class).fill(p);

        return ok(updateProduct.render(id, productForm, User.getLoggedIn(session().get("email"))));
    }


    @Transactional
    public Result updateProductSubmit(Long id) {

        String saveImageMsg;

        Form<Product> updateProductForm = formFactory.form(Product.class).bindFromRequest();

        if (updateProductForm.hasErrors()) {
            return badRequest(updateProduct.render(id, updateProductForm, getCurrentUser()));
        }

        Product p = updateProductForm.get();
        p.setId(id);
        HomeController.log("updated a product");
        List<Category> newCats = new ArrayList<Category>();
        for (Long cat : p.getCatSelect()) {
            newCats.add(Category.find.byId(cat));
        }
        p.setCategories(newCats);


        p.update();

        Http.MultipartFormData body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart file = body.getFile("upload");

        return redirect(controllers.routes.AdminProductCtrl.index());
    }

    @Transactional
    public Result deleteProduct(Long id) {
        HomeController.log("deleted product " + Product.find.ref(id).getName());
        Product.find.ref(id).delete();
        flash("success", "Product has been deleted");

        return redirect(routes.AdminProductCtrl.index());
    }

    public static String saveFile(String dir, String id, FilePart<File> image) {
        if (image != null) {
            // Get mimetype from image
            String mimeType = image.getContentType();
            // Check if uploaded file is an image
            if (mimeType.startsWith("image/")) {
                // Create file from uploaded image
                File file = image.getFile();
                // create ImageMagick command instance
                ConvertCmd cmd = new ConvertCmd();
                // create the operation, add images and operators/options
                IMOperation op = new IMOperation();
                // Get the uploaded image file
                op.addImage(file.getAbsolutePath());
                // Resize using height and width constraints
                op.resize(300, 400);
                // Save the  image
                op.addImage("public/images/" + dir + id + ".jpg");
                // thumbnail
                IMOperation thumb = new IMOperation();
                // Get the uploaded image file
                thumb.addImage(file.getAbsolutePath());
                thumb.thumbnail(60);
                // Save the  image
                thumb.addImage("public/images/" + dir + "thumbnails/" + id + ".jpg");
                // execute the operation
                try {
                    cmd.run(op);
                    cmd.run(thumb);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return " and image saved";
            }
        }
        return "image file missing";
    }


    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result statistics() {
        List<Product> productList = null;
        List<ShopOrder> orderList = null;
        productList = Product.findAll();
        orderList = ShopOrder.findAll();
        return ok(statistics.render(productList, orderList, User.getUserById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result discount() {
        List<Discount> dList = null;
        dList = Discount.findAll();
        return ok(discount.render(dList, User.getUserById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result addDiscount() {
        Form<Discount> dForm = formFactory.form(Discount.class);
        return ok(addDiscount.render(dForm, User.getUserById(session().get("email"))));
    }


    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result addDiscountSubmit() {
        List<Discount> a = Discount.findAll();
        Form<Discount> newdForm = formFactory.form(Discount.class).bindFromRequest();

        System.out.println(newdForm.get().getDiscountID());

        if (newdForm.hasErrors()) {
            return badRequest(addDiscount.render(newdForm, User.getUserById(session().get("email"))));
        } else {
            Discount d = newdForm.get();

            if (d.getAmount() < 1) {
                flash("success", "Under 0. Invalid.");
                return badRequest(discount.render(a, User.getUserById(session().get("email"))));
            }

            if (Discount.getDiscountById(d.getDiscountID()) == null) {
                d.save();
            } else {
                d.setValid(false);
                d.update();
            }

            flash("success", "Discount added.");
            return redirect(routes.AdminProductCtrl.discount());
        }
    }

    @Transactional
    public Result updateDiscount(String id) {
        Discount d = Discount.find.byId(id);
        Form<Discount> dForm = formFactory.form(Discount.class).fill(d);

        return ok(addDiscount.render(dForm, User.getUserById(session().get("email"))));
    }


}
