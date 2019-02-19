package controllers;

import controllers.security.*;

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

// File upload and image editing :D
import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;

import models.users.*;
import models.products.*;

import views.html.productAdmin.*;

@Security.Authenticated(Secured.class)
@With(CheckIfAdmin.class)

public class AdminProductCtrl extends Controller {
    private FormFactory formFactory;
    private Environment env;
    @Inject
    public AdminProductCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }
	
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
        List<Product> products = new ArrayList<Product>();

         if (cat == 0) {
            // ALL products with filter
            products = Product.findAll("");
        }
        else {
            // Get products for the selected category and filter (search field)
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

        String saveImageMsg;

        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        	
        if(newProductForm.hasErrors()) {
            
            return badRequest(addProduct.render(newProductForm, getCurrentUser()));
        }
     
        Product newProduct = newProductForm.get();
        
        newProduct.save();
        
        for (Long cat : newProduct.getCatSelect()) {
            newProduct.getCategories().add(Category.find.byId(cat));
        }

        
        newProduct.update();

        // Get image
        MultipartFormData data = request().body().asMultipartFormData();
        FilePart image = data.getFile("upload");
        
        // Save image
        saveImageMsg = saveFile(newProduct.getId(), image);

        // success message
        flash("success", "Product " + newProduct.getName() + " has been created" + " " + saveImageMsg);
            
        // Redirect to admin home
        return redirect(controllers.routes.AdminProductCtrl.index());
    }
        
    // Update a product by ID
    @Transactional
    public Result updateProduct(Long id) {
        // Retrieve the product by id
        Product p = Product.find.byId(id);
        Form<Product> productForm = formFactory.form(Product.class).fill(p);
        return ok(updateProduct.render(id, productForm, User.getLoggedIn(session().get("email"))));		
    }


    @Transactional
    public Result updateProductSubmit(Long id) {

        String saveImageMsg;

        Form<Product> updateProductForm = formFactory.form(Product.class).bindFromRequest();

        	
        if(updateProductForm.hasErrors()) {
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

        MultipartFormData data = request().body().asMultipartFormData();
        FilePart image = data.getFile("upload");

        saveImageMsg = saveFile(p.getId(), image);

        flash("success", "Product " + updateProductForm.get().getName() + " has been updates" + " " + saveImageMsg);
        
        return redirect(controllers.routes.AdminProductCtrl.index());
    }


    // Delete Product
    @Transactional
    public Result deleteProduct(Long id) {
        // Call delete method
        Product.find.ref(id).delete();
        
        flash("success", "Product has been deleted");
        // Redirect home
        return redirect(routes.AdminProductCtrl.index());
    }
    
    // Save an image file
    public String saveFile(Long id, FilePart<File> image) {
        if (image != null) {            
            String mimeType = image.getContentType();            
            if (mimeType.startsWith("image/")) {                
                File file = image.getFile();
                ConvertCmd cmd = new ConvertCmd();
                IMOperation op = new IMOperation();
                op.addImage(file.getAbsolutePath());
                op.resize(300,200);
                op.addImage("public/images/productImages/" + id + ".jpg");
                // thumbnail
                IMOperation thumb = new IMOperation();
                thumb.addImage(file.getAbsolutePath());
                thumb.thumbnail(60);
                thumb.addImage("public/images/productImages/thumbnails/" + id + ".jpg");
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
