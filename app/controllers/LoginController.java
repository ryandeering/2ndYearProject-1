package controllers;

import models.users.User;
import play.mvc.*;

import views.html.*;

import play.data.*;

import javax.inject.Inject;

import models.users.Login;

public class LoginController extends Controller {
    private FormFactory formFactory;

@Inject
public LoginController(FormFactory f){
    this.formFactory = f;
}


public Result login() {
    Form<Login> loginForm = formFactory.form(Login.class);
    return ok(login.render(loginForm, User.getUserById(session().get("email"))));
 }



public Result loginSubmit(){
    Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

    if (loginForm.hasErrors()){
        return badRequest(login.render(loginForm, User.getUserById(session().get("email"))));
    } else {
        session().clear();
        session("email", loginForm.get().getEmail());
        return redirect(controllers.routes.HomeController.index());
    }
}


public Result logout(){
    session().clear();
    flash("success", "You have been logged out");
    return redirect(routes.LoginController.login());
}





}
