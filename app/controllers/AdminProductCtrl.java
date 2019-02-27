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
import org.imgscalr.*;


// Import models and views
import models.users.*;
import models.products.*;

import views.html.productAdmin.*;



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
       Http.MultipartFormData.FilePart file = body.getFile("file");

        return redirect(controllers.routes.AdminProductCtrl.index());
    }

    @Transactional
    public Result deleteProduct(Long id) {
        Product.find.ref(id).delete();
        flash("success", "Product has been deleted");
        return redirect(routes.AdminProductCtrl.index());
    }

    public String saveFile(Long id, FilePart<File> uploaded) {
        if (uploaded != null) {
            String mimeType = uploaded.getContentType();
            if (mimeType.startsWith("image/")) {
                String fileName = uploaded.getFilename();
                String extension = "";
                int i = fileName.lastIndexOf('.');
                if (i >= 0) {
                    extension = fileName.substring(i + 1);
                }

                File file = uploaded.getFile();

                File dir = new File("public/images/productImages");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                File newFile = new File("public/images/productImages/", id + "." + extension);
                if (file.renameTo(newFile)) {
                    try {
                        BufferedImage img = ImageIO.read(newFile);
                        BufferedImage scaledImg = Scalr.resize(img, 90);

                        if (ImageIO.write(scaledImg, extension, new File("public/images/productImages/thumbnails", id + ".jpg"))) {
                            return "/ file uploaded and thumbnail created.";
                        } else {
                            return "/ file uploaded but thumbnail creation failed.";
                        }
                    } catch (IOException e) {
                        return "/ file uploaded but thumbnail creation failed.";
                    }
                } else {
                    return "/ file upload failed.";
                }

            }
        }
        return "/ no image file.";
    }
}