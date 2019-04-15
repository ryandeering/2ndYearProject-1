package controllers;

import models.users.Login;
import models.users.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.login;

import javax.inject.Inject;

public class LoginController extends Controller {
    private FormFactory formFactory;

    @Inject
    public LoginController(FormFactory f) {
        this.formFactory = f;
    }

    public Result login() {
        Form<Login> loginForm = formFactory.form(Login.class);
        return ok(login.render(loginForm, User.getUserById(session().get("email"))));
    }

    public Result loginSubmit() {
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

        if (loginForm.hasErrors()) {
            return badRequest(login.render(loginForm, User.getUserById(session().get("email"))));
        } else {
            session().clear();
            session("email", loginForm.get().getEmail());

            User u = User.getLoggedIn(loginForm.get().getEmail());


            HomeController.log("logged in");


            if (u != null && "admin".equals(u.getRole())) {
                return redirect(routes.AdminProductCtrl.adminPanel());
            }
            return redirect(controllers.routes.ProductCtrl.index());
        }
    }

    public Result logout() {

        HomeController.log("logged out");
        session().clear();
        flash("success", "You have been logged out");
        return redirect(routes.LoginController.login());
    }


}

