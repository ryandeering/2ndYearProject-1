package controllers;

import models.products.Product;
import models.reviews.BadWords;
import models.reviews.Review;
import models.users.*;
import org.mindrot.jbcrypt.BCrypt;
import play.api.Environment;
import play.data.Form;
import play.data.FormFactory;
import play.db.ebean.Transactional;
import play.mvc.*;
import views.html.AdminPanel.*;
import views.html.*;

import javax.inject.Inject;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class HomeController extends Controller {


    private FormFactory formFactory;
    private Environment e;


    @Inject
    public HomeController(FormFactory f, Environment env) {
        this.formFactory = f;
        this.e = env;
    }
	
	@Transactional
	public Result home() {
		Form<User> pf = formFactory.form(User.class); // hack 
		return ok(home.render(e, User.getUserById(session().get("email")), pf));
	}


    public Result index() {
        return ok(index.render(User.getUserById(session().get("email"))));
    }

    public Result error() {
        return ok(errora.render(User.getUserById(session().get("email"))));
    }


    public Result registerUser() {
        Form<Customer> userForm = formFactory.form(Customer.class);
        Form<Valid> vf = formFactory.form(Valid.class);
        Form<Address> addressForm = formFactory.form(Address.class);
        return ok(registerUser.render(vf, userForm, addressForm, User.getUserById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result profile() {
        Form<User> pf = formFactory.form(User.class); // hack
        return ok(profile.render(e, User.getUserById(session().get("email")), pf));
    }


    @Transactional
    public Result contact() {
        Form<User> pf = formFactory.form(User.class); // hack
        return ok(contact.render(e, User.getUserById(session().get("email")), pf));
    }


    public Result registerUserSubmit() {
        Form<Customer> customerForm = formFactory.form(Customer.class).bindFromRequest();
        Form<Valid> vf = formFactory.form(Valid.class).bindFromRequest();
        Form<Address> af = formFactory.form(Address.class).bindFromRequest();
        if (customerForm.hasErrors()) {
            return badRequest(registerUser.render(vf, customerForm, af, User.getUserById(session().get("email"))));
        }

        if (af.hasErrors()) {
            return badRequest(registerUser.render(vf, customerForm, af, User.getUserById(session().get("email"))));
        }


        if (vf.hasErrors()) {
            return badRequest(registerUser.render(vf, customerForm, af, User.getUserById(session().get("email"))));
        }


        Customer newCustomer = customerForm.get();
        Address afa = af.get();
        Valid vfa = vf.get();

        String salt = BCrypt.gensalt();
        try {
            newCustomer.setPassword(BCrypt.hashpw(newCustomer.getPassword(), salt));
            vfa.setPassword2(BCrypt.hashpw(vfa.getPassword2(), salt));
            newCustomer.setAddress(afa);

            if (newCustomer.getPassword().equals(vfa.getPassword2()) == false) {
                flash("error", "Passwords must match.");
                return badRequest(registerUser.render(vf, customerForm, af, User.getUserById(session().get("email"))));
            }

            newCustomer.save();
        } catch (Exception e) {
            String error = "";
            if (e.getMessage().contains("PRIMARY_KEY")) {
                error = "Email is already used.";
            }


            flash("error", "An error has occurred." + " " + error);
            return redirect(routes.HomeController.registerUser());
        }


        flash("success", "Congratulations, " + newCustomer.getfName() + " ! You're now part of the CDR Games family. Login, set your address in the profile settings and shop to your heart's content!");
        return redirect(routes.LoginController.login());
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

        Admin u = (Admin) User.getUserById(email);
        Form<Admin> userForm = formFactory.form(Admin.class).fill(u);
        try {
            u.update();
        } catch (Exception ex) {
            return badRequest("error");
        }
        return ok(updateAdmin.render(userForm, User.getUserById(session().get("email"))));
    }


    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result addAdmin() {
        Form<Admin> userForm = formFactory.form(Admin.class);
        return ok(addAdmin.render(userForm, User.getUserById(session().get("email"))));
    }


    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result addAdminSubmit() {


        Form<Admin> newUserForm = formFactory.form(Admin.class).bindFromRequest();
        if (newUserForm.hasErrors()) {
            return badRequest(addAdmin.render(newUserForm, User.getUserById(session().get("email"))));
        } else {
            Admin newUser = newUserForm.get();
            if (User.getUserById(newUser.getEmail()) == null) {
                newUser.setPassword(BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt()));
                newUser.save();
            } else {
                if (!User.getUserById(newUser.getEmail()).getPassword().equals(newUser.getPassword())) {
                    newUser.setPassword(BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt()));
                    newUser.update();
                }
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
        return ok(addCustomer.render(cForm, User.getUserById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result addCustomerSubmit(String email) {


        Form<Customer> newUserForm = formFactory.form(Customer.class).bindFromRequest();
        if (newUserForm.hasErrors()) {
            return badRequest(addCustomer.render(newUserForm, User.getUserById(session().get("email"))));
        } else {
            Customer newUser = newUserForm.get();
            newUser.setAddress(new Address());
            if (User.getUserById(newUser.getEmail()) == null) {
                newUser.setPassword(BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt()));
                newUser.save();
            } else {

                if (!User.getUserById(newUser.getEmail()).getPassword().equals(newUser.getPassword())) {
                    newUser.setPassword(BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt()));
                }

                newUser.update();
            }
            flash("success", "User " + newUser.getfName() + " " + newUser.getlName() + " was added/updated.");
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
        Customer u = (Customer) User.getUserById(email);
        Form<Customer> userForm = userForm = formFactory.form(Customer.class).fill(u);
        String em = email;
        try {
            u.update();
        } catch (Exception ex) {
            flash("error", "An error occured.");
            return badRequest(updateCustomer.render(userForm, User.getUserById(session().get("email"))));
        }
        return ok(updateCustomer.render(userForm, User.getUserById(session().get("email"))));
    }


    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result usersAdmin() {
        List<Admin> userList = null;
        userList = Admin.findAll();
        return ok(admin.render(userList, User.getUserById(session().get("email"))));

    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result usersCustomer() {
        List<Customer> cList = null;
        cList = Customer.findAll();
        return ok(customers.render(cList, User.getUserById(session().get("email"))));
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
        return ok(product.render(p, filter, User.getUserById(session().get("email")), e));
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


        if (newReviewForm.get().getContent().getBytes().length > 255) {
            flash("error", "Your review has too many characters, we're sorry but please trim it down.");
            return redirect("/product/" + prodId);

        }


        Product p = Product.find.byId(prodId);
        List<Review> rList = p.getReviews();
        System.out.println();
        for (int i = 0; i < rList.size(); i++) {
            if (rList.get(i).getCustomer().equals(getCurrentUser())) {
                flash("error", "Chill, you reviewed already.");
                return redirect("/product/" + prodId);
            }
        }


        BadWords bw = new BadWords();
        BadWords.loadConfigs();
        ArrayList<String> curses = BadWords.badWordsFound(newReviewForm.get().getContent());

        if (curses.size() > 0) {
            flash("error", "This is a family friendly website. NO cursing. Thank you.");
            return redirect("/product/" + prodId);
        }


        if (newReviewForm.hasErrors()) {
            return badRequest(addReview.render(newReviewForm,
                    getCurrentUser(), prodId));
        }


        newReview = newReviewForm.get();
        if (between(newReview.getRating(), 1, 5) == false) {
            flash("error", "Rating not between 1 and 5.");
            return badRequest(addReview.render(newReviewForm, getCurrentUser(), prodId));
        }
        newReview.save();


        newReview.setAuthor((Customer) getCurrentUser());
        newReview.setProduct(p);
        newReview.setDate();
        p.getReviews().add(newReview);

        p.update();
        newReview.update();


        flash("success", "Review has been created");

        return redirect(routes.HomeController.product(prodId, ""));
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

        return redirect(routes.HomeController.product(prodId, ""));
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
        saveImageMsg = AdminProductCtrl.saveFile("profileImages/", (u.getEmail()), image);


        flash("success", "Profile picture has been created" + " " + saveImageMsg);

        return redirect(routes.HomeController.profile());
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result changePassword() {
        Form<User> userForm = formFactory.form(User.class);
        Form<Valid> vf = formFactory.form(Valid.class);
        return ok(changePassword.render(userForm, vf, getCurrentUser()));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result changePasswordSubmit() {

        Form<User> userForm = formFactory.form(User.class).bindFromRequest();
        Form<Valid> vf = formFactory.form(Valid.class).bindFromRequest();

        User u = userForm.get();
        Valid vfa = vf.get();

        String salt = BCrypt.gensalt();

        u.setPassword(BCrypt.hashpw(u.getPassword(), salt));
        vfa.setPassword2(BCrypt.hashpw(vfa.getPassword2(), salt));

        if (!u.getPassword().equals(vfa.getPassword2())) {
            flash("error", "Your passwords are not the same.");
            return ok(profile.render(e, getCurrentUser(), userForm));
        }

        u.update();

        flash("success", "Password successfully changed.");
        return ok(profile.render(e, getCurrentUser(), userForm));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result changeAddress() {
        Form<Address> addressForm = formFactory.form(Address.class);
        return ok(changeAddress.render(addressForm, (Customer) getCurrentUser()));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result changeAddressSubmit() {

        Form<User> userForm = formFactory.form(User.class);
        Form<Address> addressForm = formFactory.form(Address.class).bindFromRequest();

        try {
            if (addressForm.hasErrors()) {
                flash("error", "Something went wrong.");
                return badRequest(changeAddress.render(addressForm, (Customer) getCurrentUser()));
            }


            if (addressForm.get().getCountry().equals("Ireland")) {
                if (Address.eircodeCheck(addressForm.get().getEircode()) == false) {
                    flash("error", "Eircode doesn't match the format. Example: A65 F4E2.");
                    return badRequest(changeAddress.render(addressForm, (Customer) getCurrentUser()));
                }
            }


            Address a = addressForm.get();


            Customer u = (Customer) getCurrentUser();
            Address ao = u.getAddress();
            ao.setfName(a.getfName());
            ao.setlName(a.getlName());
            ao.setStreetAddress(a.getStreetAddress());
            ao.setCountry(a.getCountry());
            ao.setEircode(a.getEircode());
            ao.setTown(a.getTown());
            u.setAddress(ao);
            u.save();

        } catch (io.ebean.DataIntegrityException e) {
            flash("error", "One of your forms input had too much data in it.");
            return badRequest(changeAddress.render(addressForm, (Customer) getCurrentUser()));
        }

        flash("success", "Address successfully changed.");
        return ok(profile.render(e, getCurrentUser(), userForm));
    }


    @Security.Authenticated(Secured.class)
    public Result deleteUser() {




        User u = User.getUserById(getCurrentUser().getEmail());
        session().clear();
        u.delete();
        flash("success", "Your account has been deleted. We're sorry to see you go.");

        return redirect(routes.HomeController.index());

    }

}






