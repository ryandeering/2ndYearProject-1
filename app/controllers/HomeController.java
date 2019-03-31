package controllers;

import models.products.Product;
import models.reviews.Review;
import models.users.Admin;
import models.users.Customer;
import models.users.User;
import org.mindrot.jbcrypt.BCrypt;
import play.api.Environment;
import play.data.Form;
import play.data.FormFactory;
import play.db.ebean.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import play.mvc.With;
import views.html.AdminPanel.addAdmin;
import views.html.AdminPanel.addCustomer;
import views.html.AdminPanel.admin;
import views.html.AdminPanel.customers;
import views.html.addReview;
import views.html.index;
import views.html.product;
import views.html.registerUser;

import javax.inject.Inject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class HomeController extends Controller {


    private FormFactory formFactory;
    private Environment e;


    @Inject
    public HomeController (FormFactory f, Environment env){
        this.formFactory = f;
        this.e = env;
    }

    public Result index() {
        return ok(index.render(User.getUserById(session().get("email"))));
    }



    public Result registerUser() {
        Form<Customer> userForm = formFactory.form(Customer.class);
        return ok(registerUser.render(userForm, User.getUserById(session().get("email"))));
    }



    public Result registerUserSubmit(){
        Form<Customer> customerForm = formFactory.form(Customer.class).bindFromRequest();

        if(customerForm.hasErrors()){
            return badRequest(registerUser.render(customerForm, User.getUserById(session().get("email"))));
        }else{
            Customer newCustomer = customerForm.get();
            newCustomer.setPassword(BCrypt.hashpw(newCustomer.getPassword(), BCrypt.gensalt()));
            newCustomer.save();
            flash("You have Successfully registered!");
            return redirect(controllers.routes.HomeController.index());}
        }


    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result deleteAdmin(String email) {

        Admin u = (Admin) User.getUserById(email);
        u.delete();

        flash("success", "User has been deleted.");
        return redirect(controllers.routes.HomeController.usersAdmin());
    }


    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result updateAdmin(String email) {
        Admin u;
        Form<Admin> userForm;
        try {
            u = (Admin)User.getUserById(email);
            u.update();
            userForm = formFactory.form(Admin.class).fill(u);
        } catch (Exception ex) {
            return badRequest("error");
        }
        return ok(addAdmin.render(userForm,User.getUserById(session().get("email"))));
    }


    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result addAdmin() {
        Form<Admin> userForm = formFactory.form(Admin.class);
        return ok(addAdmin.render(userForm,User.getUserById(session().get("email"))));
    }


    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result addAdminSubmit() {
        Form<Admin> newUserForm = formFactory.form(Admin.class).bindFromRequest();
        if (newUserForm.hasErrors()) {
            return badRequest(addAdmin.render(newUserForm,User.getUserById(session().get("email"))));
        } else {
            Admin newUser = newUserForm.get();
            newUser.setPassword(BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt())); // uses bcrypt to generate hashed password
            if (User.getUserById(newUser.getEmail())==null){
                newUser.save();
            } else {
                newUser.update();
            }

            flash("success", "User " + newUser.getfName() + newUser.getlName() + " was added/updated.");
            return redirect(controllers.routes.HomeController.usersAdmin());
        }
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result addCustomer() {
        Form<Customer> cForm = formFactory.form(Customer.class);
        return ok(addCustomer.render(cForm,User.getUserById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result addCustomerSubmit() {
        Form<Customer> newUserForm = formFactory.form(Customer.class).bindFromRequest();
        if (newUserForm.hasErrors()) {

            return badRequest(addCustomer.render(newUserForm,User.getUserById(session().get("email"))));
        } else {
            Customer newUser = newUserForm.get();
            newUser.setPassword(BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt()));
            if (User.getUserById(newUser.getEmail())==null){
                newUser.save();
            } else {
                newUser.update();
            }
            flash("success", "User " + newUser.getfName() + newUser.getlName() + " was added/updated.");
            return redirect(controllers.routes.HomeController.usersCustomer());
        }
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result deleteCustomer(String email) {
        Customer u = (Customer) User.getUserById(email);
        u.delete();
        flash("success", "User has been deleted.");
        return redirect(controllers.routes.HomeController.usersCustomer());
    }



    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result updateCustomer(String email) {
        Customer u;
        Form<Customer> userForm;
        try {
            u = (Customer) User.getUserById(email);
            u.setPassword(BCrypt.hashpw(u.getPassword(), BCrypt.gensalt()));
            u.update();
            userForm = formFactory.form(Customer.class).fill(u);
        } catch (Exception ex) {
            return badRequest("error");
        }
        return ok(addCustomer.render(userForm,User.getUserById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result usersAdmin() {
        List<Admin> userList = null;
        userList = Admin.findAll();
        return ok(admin.render(userList,User.getUserById(session().get("email"))));

    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result usersCustomer() {
        List<Customer> cList = null;
        cList = Customer.findAll();
        return ok(customers.render(cList,User.getUserById(session().get("email"))));
    }


  //  @Security.Authenticated(Secured.class)
//    @Transactional
//    public Result product(Long id) {
 //       List<Product> productList = null;
  //      Product products = Product.find.byId(id);
     //   if (id.equals(null)) {
   //         return redirect(controllers.routes.HomeController.index());
   //     } else {
  //          productList = products.getProjects();
    //    }
      //  return ok(employeeProjects.render(projList, tempEmployee, User.getUserById(session().get("email"))));
    //}



    public Result product(Long id, String filter) {

        List<Product> productList = null;
        Product p;

        p = Product.find.byId(id);
        return ok(product.render(p, filter, User.getUserById(session().get("email")),e));
    }


    public static void log(String activity) {
        User u = User.getLoggedIn(session().get("email"));

        try {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            String content = (dateFormat.format(date)) + " | " + u.getfName() + " " + u.getlName() + " " + activity + " under role " + u.getRole() + "\n";
            Files.write(Paths.get("logfile.txt"), content.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthCustomer.class)
    public Result addReview(Long prodId) {
        Form<Review> rForm = formFactory.form(Review.class);
        return ok(addReview.render(rForm, getCurrentUser(), prodId));
    }

    @Transactional
    public Result addReviewSubmit(Long prodId) {
        Review newReview;

        Form<Review> newReviewForm = formFactory.form(Review.class).bindFromRequest();


        Product p = Product.find.byId(prodId);
        List<Review> rList = p.getReviews();

        for (int i = 0; i < rList.size(); i++) {
            if(rList.get(i).getCustomer().equals(getCurrentUser())) {
                flash("error", "Chill, you reviewed already.");
                return redirect("/product/" + prodId );
            }
        }




        if (newReviewForm.hasErrors()) {
            return badRequest(addReview.render(newReviewForm,
                    getCurrentUser(), prodId));
        }

        else {
            newReview = newReviewForm.get();
            if (newReview.getRating() <= 1 && newReview.getRating() <= 5){
                //if (angle <= 90 && angle <= 180) {
                flash("error", "Rating not between 1 and 5.");
                return badRequest(addReview.render(newReviewForm, getCurrentUser(), prodId));
            }
            newReview.save();



            newReview.setAuthor(getCurrentUser());
            newReview.setProduct(p);
            newReview.setDate();
            p.getReviews().add(newReview);

            p.update();
            newReview.update();

        }
        flash("success", "Review has been created");

        return redirect(routes.HomeController.product(prodId,""));
    }

    public Customer getCurrentUser() {
        Customer u = (Customer) User.getLoggedIn(session().get("email"));
        return u;
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteReview(Long id) {
        Long prodId = Review.find.ref(id).getProduct().getId();
        Review.find.ref(id).delete();

        flash("success", "Review has been deleted");

        return redirect(routes.HomeController.product(prodId,""));
    }
}



