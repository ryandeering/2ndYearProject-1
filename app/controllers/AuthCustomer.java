package controllers;
import play.mvc.*;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import models.users.*;

public class AuthCustomer extends Action.Simple{
    public CompletionStage<Result> call(Http.Context ctx){

        String id = ctx.session().get("email");
        if (id != null) {
            User u = User.getUserById(id);
            if (u instanceof Customer) {
                return delegate.call(ctx);
            }
        }
        ctx.flash().put("error", "Customer login required");
        return CompletableFuture.completedFuture(redirect(routes.LoginController.login()));
    }
}