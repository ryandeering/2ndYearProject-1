package controllers;

import controllers.*;

import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;
import play.api.Environment;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import play.Logger;

import java.io.IOException;
import java.awt.image.*;
import javax.imageio.*;



import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;


// Import models and views
import models.users.*;
import models.products.*;

import views.html.AdminPanel.*;



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

        newProduct.update();

        MultipartFormData<File> data = request().body().asMultipartFormData();
        FilePart<File> image = data.getFile("upload");

       String saveImageMsg = saveFile(newProduct.getId(), image); ///fixed! - ryan

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
        Product.find.ref(id).delete();
        flash("success", "Product has been deleted");
        return redirect(routes.AdminProductCtrl.index());
    }

    public String saveFile(Long id, FilePart<File> image) {
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
                op.resize(300,200);
                // Save the  image
                op.addImage("public/images/productImages/" + id + ".jpg");
                // thumbnail
                IMOperation thumb = new IMOperation();
                // Get the uploaded image file
                thumb.addImage(file.getAbsolutePath());
                thumb.thumbnail(60);
                // Save the  image
                thumb.addImage("public/images/productImages/thumbnails/" + id + ".jpg");
                // execute the operation
                try{
                    cmd.run(op);
                    cmd.run(thumb);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                return " and image saved";
            }
        }
        return "image file missing";
    }
}