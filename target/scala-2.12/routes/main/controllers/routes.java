// @GENERATOR:play-routes-compiler
// @SOURCE:D:/dsad/2ndYearProject2/conf/routes
// @DATE:Sat Apr 13 21:14:39 BST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseProductCtrl ProductCtrl = new controllers.ReverseProductCtrl(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAdminProductCtrl AdminProductCtrl = new controllers.ReverseAdminProductCtrl(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLoginController LoginController = new controllers.ReverseLoginController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseShoppingCtrl ShoppingCtrl = new controllers.ReverseShoppingCtrl(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseProductCtrl ProductCtrl = new controllers.javascript.ReverseProductCtrl(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAdminProductCtrl AdminProductCtrl = new controllers.javascript.ReverseAdminProductCtrl(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLoginController LoginController = new controllers.javascript.ReverseLoginController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseShoppingCtrl ShoppingCtrl = new controllers.javascript.ReverseShoppingCtrl(RoutesPrefix.byNamePrefix());
  }

}
