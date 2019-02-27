package controllers;

import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;
import javax.inject.Inject;
import views.html.*;
import models.users.*;
import java.util.*;
import org.mindrot.jbcrypt.BCrypt;


public class HomeController extends Controller {


    private FormFactory formFactory;


    @Inject
    public HomeController (FormFactory f){
        this.formFactory = f;
    }

    public Result index() {
        return ok(index.render(User.getUserById(session().get("email"))));
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

}



