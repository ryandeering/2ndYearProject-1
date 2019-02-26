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


/* - Docs -
http://superuser.com/questions/163818/how-to-install-rmagick-on-ubuntu-10-04
http://im4java.sourceforge.net/
*/

// Authenticate user
@Security.Authenticated(Secured.class)
// Authorise user (check if admin)
@With(AuthAdmin.class)

public class AdminProductCtrl extends Controller {

    /** Dependency Injection **/

    /**
     * http://stackoverflow.com/questions/15600186/play-framework-dependency-injection
     **/
    private FormFactory formFactory;

    /**
     * http://stackoverflow.com/a/37024198
     **/
    private Environment env;

    /**
     * http://stackoverflow.com/a/10159220/6322856
     **/
    @Inject
    public AdminProductCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }


    // Get a user - if logged in email will be set in the session
    private User getCurrentUser() {
        User u = User.getLoggedIn(session().get("email"));
        return u;
    }

    public Result index() {
        return redirect(controllers.routes.AdminProductCtrl.listProducts(0));
    }

    // Get a list of products
    // If cat parameter is 0 then return all products
    // Otherwise return products for a category (by id)
    @Transactional
    public Result listProducts(Long cat) {
        // Get list of categories in ascending order
        List<Category> categories = Category.find.query().where().orderBy("name asc").findList();
        // Instantiate products, an Array list of products			
        List<Product> products = new ArrayList<Product>();

        if (cat == 0) {
            // Get the list of ALL products with filter
            products = Product.findAll("");
        } else {
            // Get products for the selected category and filter (search field)
            products = Product.findFilter(cat, "");
        }
        // Render the list products view, passing parameters
        // categories and products lists
        // current user - if one is logged in
        return ok(listProducts.render(env, categories, products, getCurrentUser()));
    }

    // Load the add product view
    // Display an empty form in the view
    @Transactional
    public Result addProduct() {
        // Instantiate a form object based on the Product class
        Form<Product> addProductForm = formFactory.form(Product.class);
        // Render the Add Product View, passing the form object
        return ok(addProduct.render(addProductForm, getCurrentUser()));
    }

    // Handle the form data when a new product is submitted
    @Transactional
    public Result addProductSubmit() {



        // Create a product form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form)
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        // Check for errors (based on Product class annotations)	
        if (newProductForm.hasErrors()) {
            // Display the form again
            return badRequest(addProduct.render(newProductForm, getCurrentUser()));
        }

        Product newProduct = newProductForm.get();

        // Save product now to set id (needed to update manytomany)
        newProduct.save();

        // Get category ids (checked boxes from form)
        // Find category objects and set categories list for this product
        for (Long cat : newProduct.getCatSelect()) {
            newProduct.getCategories().add(Category.find.byId(cat));
        }

        // Update the new Product to save categories
        newProduct.update();

        // Get image data
        MultipartFormData<File> data = request().body().asMultipartFormData();
        FilePart<File> image = data.getFile("upload");

        // Save the image file
       String saveImageMsg = saveFile(newProduct.getId(), image); ///NEEDS FIXING

        // Set a success message in temporary flash
        flash("success", "Product " + newProduct.getName() + " has been created" + " " + saveImageMsg);

        // Redirect to the admin home
        return redirect(controllers.routes.AdminProductCtrl.index());
    }

    // Update a product by ID
    // called when edit button is pressed
    @Transactional
    public Result updateProduct(Long id) {
        // Retrieve the product by id
        // Create a form based on the Product class
        Product p = Product.find.byId(id);
        Form<Product> productForm = formFactory.form(Product.class).fill(p);
        // Render the updateProduct view
        // pass the id and form as parameters
        return ok(updateProduct.render(id, productForm, User.getLoggedIn(session().get("email"))));
    }


    // Handle the form data when an updated product is submitted
    @Transactional
    public Result updateProductSubmit(Long id) {

        String saveImageMsg;

        // Create a product form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form)
        Form<Product> updateProductForm = formFactory.form(Product.class).bindFromRequest();

        // Check for errors (based on Product class annotations)	
        if (updateProductForm.hasErrors()) {
            // Display the form again
            return badRequest(updateProduct.render(id, updateProductForm, getCurrentUser()));
        }

        // Update the Product (using its ID to select the existing object))
        Product p = updateProductForm.get();
        p.setId(id);

        // Get category ids (checked boxes from form)
        // Find category objects and set categories list for this product
        List<Category> newCats = new ArrayList<Category>();
        for (Long cat : p.getCatSelect()) {
            newCats.add(Category.find.byId(cat));
        }
        p.setCategories(newCats);

        // update (save) this product            
        p.update();

        // Get image data
        Http.MultipartFormData body = request().body().asMultipartFormData();
       Http.MultipartFormData.FilePart file = body.getFile("file");

    //    saveImageMsg = saveFile(p.getId(), file);   //////////////////////NEEDS FIX LATER

        // Add a success message to the flash session
       // flash("success", "Product " + updateProductForm.get().getName() + " has been updates" + " " + saveImageMsg);

        // Return to admin home
        return redirect(controllers.routes.AdminProductCtrl.index());
    }


    // Delete Product
    @Transactional
    public Result deleteProduct(Long id) {
        // Call delete method
        Product.find.ref(id).delete();
        // Add message to flash session 
        flash("success", "Product has been deleted");
        // Redirect home
        return redirect(routes.AdminProductCtrl.index());
    }

    // Save an image file


    public String saveFile(Long id, FilePart<File> uploaded) {
        // Make sure that the file exists.
        if (uploaded != null) {
            // Make sure that the content is actually an image.
            String mimeType = uploaded.getContentType();
            if (mimeType.startsWith("image/")) {
                // Get the file name.
                String fileName = uploaded.getFilename();
                // Extract the extension from the file name.
                String extension = "";
                int i = fileName.lastIndexOf('.');
                if (i >= 0) {
                    extension = fileName.substring(i + 1);
                }
                // Now we save the file (not that if the file is saved without
                // a path specified, it is saved to a default location,
                // usually the temp or tmp directory).
                // 1) Create a file object from the uploaded file part.
                File file = uploaded.getFile();
                // 2) Make sure that our destination directory exists and if
                //    not create it.
                File dir = new File("public/images/productImages");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                // 3) Actually save the file.
                File newFile = new File("public/images/productImages/", id + "." + extension);
                if (file.renameTo(newFile)) {
                    try {
                        BufferedImage img = ImageIO.read(newFile);
                        BufferedImage scaledImg = Scalr.resize(img, 90);

                        if (ImageIO.write(scaledImg, extension, new File("public/images/productImages/thumbnails", id + "thumb.jpg"))) {
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