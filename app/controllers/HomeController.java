package controllers;

import models.products.Category;
import models.products.Product;
import models.reviews.Review;
import models.users.Admin;
import models.users.Customer;
import models.users.User;
import models.users.Valid;
import org.mindrot.jbcrypt.BCrypt;
import play.api.Environment;
import play.data.Form;
import play.data.FormFactory;
import play.db.ebean.Transactional;
import play.mvc.*;
import views.html.*;
import views.html.AdminPanel.*;

import javax.inject.Inject;
import java.io.File;
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
        Form<Valid> vf = formFactory.form(Valid.class);
        return ok(registerUser.render(vf, userForm, User.getUserById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result profile() {
        Form<User> pf = formFactory.form(User.class); // hack
        return ok(profile.render(e,User.getUserById(session().get("email")),pf));
    }


    public Result registerUserSubmit(){
        Form<Customer> customerForm = formFactory.form(Customer.class).bindFromRequest();
        Form<Valid> vf = formFactory.form(Valid.class).bindFromRequest();

        if(customerForm.hasErrors()){
            return badRequest(registerUser.render(vf,customerForm, User.getUserById(session().get("email"))));
        }

        if(vf.hasErrors()) {
            return badRequest(registerUser.render(vf,customerForm, User.getUserById(session().get("email"))));
        }

        Customer newCustomer = customerForm.get();
        Valid vfa = vf.get();

        String salt = BCrypt.gensalt();

        newCustomer.setPassword(BCrypt.hashpw(newCustomer.getPassword(), salt));
        vfa.setPassword2(BCrypt.hashpw(vfa.getPassword2(), salt));

        if(newCustomer.getPassword().equals(vfa.getPassword2()) == false){
                flash("error", "Passwords must match.");
                return badRequest(registerUser.render(vf,customerForm, User.getUserById(session().get("email"))));
            }



            newCustomer.save();
            flash("success","Congratulations, " + newCustomer.getfName()+ " ! You're now part of the CDR Games family. Login, set your address in the profile settings and shop to your heart's content!");
            return redirect(routes.LoginController.login());}



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
        return ok(addReview.render(rForm, (Customer)getCurrentUser(), prodId));
    }

    @Transactional
    public Result addReviewSubmit(Long prodId) {
        Review newReview;

        Form<Review> newReviewForm = formFactory.form(Review.class).bindFromRequest();


        Product p = Product.find.byId(prodId);
        List<Review> rList = p.getReviews();

        for (int i = 0; i < rList.size(); i++) {
            if(rList.get(i).getCustomer().equals((Customer)getCurrentUser())) {
                flash("error", "Chill, you reviewed already.");
                return redirect("/product/" + prodId );
            }
        }




        if (newReviewForm.hasErrors()) {
            return badRequest(addReview.render(newReviewForm,
                    (Customer)getCurrentUser(), prodId));
        }


        newReview = newReviewForm.get();
        if (between(newReview.getRating(),1,5) == false){
            flash("error", "Rating not between 1 and 5.");
            return badRequest(addReview.render(newReviewForm, (Customer)getCurrentUser(), prodId));
        }
        newReview.save();



        newReview.setAuthor((Customer)getCurrentUser());
        newReview.setProduct(p);
        newReview.setDate();
        p.getReviews().add(newReview);

        p.update();
        newReview.update();


        flash("success", "Review has been created");

        return redirect(routes.HomeController.product(prodId,""));
    }

    public User getCurrentUser() {
        User u = User.getLoggedIn(session().get("email"));
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

    public static boolean between(int i, int minValueInclusive, int maxValueInclusive) {
        return i >= minValueInclusive && i <= maxValueInclusive;
    }



    @Security.Authenticated(Secured.class)
    @Transactional
    public Result changeProfilePic() {

        Form<User> User = formFactory.form(User.class).bindFromRequest();
        User u = getCurrentUser();

        Http.MultipartFormData<File> data = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart<File> image = data.getFile("upload");

        String saveImageMsg;
	saveImageMsg = AdminProductCtrl.saveFile("profileImages/",(u.getEmail()), image);
        

        flash("success", "Profile picture has been created" + " " + saveImageMsg);

        return redirect(routes.HomeController.profile());
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result changePassword(){
        Form<User> userForm = formFactory.form(User.class);
        Form<Valid> vf = formFactory.form(Valid.class);
        return ok(changePassword.render(userForm, vf, getCurrentUser()));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result changePasswordSubmit(){

        Form<User> userForm = formFactory.form(User.class).bindFromRequest();
        Form<Valid> vf = formFactory.form(Valid.class).bindFromRequest();

        User u = userForm.get();
        Valid vfa = vf.get();

        String salt = BCrypt.gensalt();

        u.setPassword(BCrypt.hashpw(u.getPassword(), salt));
        vfa.setPassword2(BCrypt.hashpw(vfa.getPassword2(), salt));

        u.update();

        flash("success", "Password successfully changed.");
        return ok(profile.render(e, getCurrentUser(), userForm));
    }


}







