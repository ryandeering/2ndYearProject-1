// @GENERATOR:play-routes-compiler
// @SOURCE:/run/media/ryan/BEECC945ECC8F923/dsad/2ndYearProject2/conf/routes
// @DATE:Sun Apr 07 12:28:03 IST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ProductCtrl_1: controllers.ProductCtrl,
  // @LINE:7
  HomeController_0: controllers.HomeController,
  // @LINE:8
  Assets_4: controllers.Assets,
  // @LINE:14
  ShoppingCtrl_2: controllers.ShoppingCtrl,
  // @LINE:21
  AdminProductCtrl_3: controllers.AdminProductCtrl,
  // @LINE:33
  LoginController_5: controllers.LoginController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ProductCtrl_1: controllers.ProductCtrl,
    // @LINE:7
    HomeController_0: controllers.HomeController,
    // @LINE:8
    Assets_4: controllers.Assets,
    // @LINE:14
    ShoppingCtrl_2: controllers.ShoppingCtrl,
    // @LINE:21
    AdminProductCtrl_3: controllers.AdminProductCtrl,
    // @LINE:33
    LoginController_5: controllers.LoginController
  ) = this(errorHandler, ProductCtrl_1, HomeController_0, Assets_4, ShoppingCtrl_2, AdminProductCtrl_3, LoginController_5, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProductCtrl_1, HomeController_0, Assets_4, ShoppingCtrl_2, AdminProductCtrl_3, LoginController_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ProductCtrl.index()"""),
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listProducts""", """controllers.ProductCtrl.listProducts(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showBasket""", """controllers.ShoppingCtrl.showBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToBasket/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.addToBasket(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.addOne(itemId:Long, pid:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.removeOne(itemId:Long, pid:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emptyBasket""", """controllers.ShoppingCtrl.emptyBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """placeOrder""", """controllers.ShoppingCtrl.placeOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrder/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.viewOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.AdminProductCtrl.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/listProducts""", """controllers.AdminProductCtrl.listProducts(cat:Long = 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/listProducts/""" + "$" + """cat<[^/]+>""", """controllers.AdminProductCtrl.listProducts(cat:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addProduct""", """controllers.AdminProductCtrl.addProduct()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addProductSubmit""", """controllers.AdminProductCtrl.addProductSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.updateProduct(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateProductSubmit/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.updateProductSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/delProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.deleteProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.HomeController.profile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registerUser""", """controllers.HomeController.registerUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registerUserSubmit""", """controllers.HomeController.registerUserSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addAdmin""", """controllers.HomeController.addAdmin"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addAdminSubmit""", """controllers.HomeController.addAdminSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addCustomer""", """controllers.HomeController.addCustomer"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addCustomerSubmit""", """controllers.HomeController.addCustomerSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/admin""", """controllers.HomeController.usersAdmin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/customers""", """controllers.HomeController.usersCustomer"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateCustomer/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateCustomer(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/deleteCustomer/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteCustomer(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateAdmin/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateAdmin(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/deleteAdmin/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteAdmin(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/""" + "$" + """id<[^/]+>""", """controllers.HomeController.product(id:Long, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/discounts/""", """controllers.AdminProductCtrl.discount()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addDiscount/""", """controllers.AdminProductCtrl.addDiscount()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addDiscountSubmit/""", """controllers.AdminProductCtrl.addDiscountSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateDiscount/""", """controllers.AdminProductCtrl.updateDiscount(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cancelOrder""", """controllers.ShoppingCtrl.cancelOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrders""", """controllers.ShoppingCtrl.viewOrders()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """applyDiscount/""", """controllers.ShoppingCtrl.applyDiscount()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """applyDiscountSubmit/""", """controllers.ShoppingCtrl.applyDiscountSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/statistics""", """controllers.AdminProductCtrl.statistics()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addReview/""" + "$" + """prodId<[^/]+>""", """controllers.HomeController.addReview(prodId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addReviewSubmit/""" + "$" + """prodId<[^/]+>""", """controllers.HomeController.addReviewSubmit(prodId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteReview/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteReview(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/panel""", """controllers.AdminProductCtrl.adminPanel"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile/changeProfilePic""", """controllers.HomeController.changeProfilePic()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """changePassword""", """controllers.HomeController.changePassword()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """changePasswordSubmit""", """controllers.HomeController.changePasswordSubmit"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ProductCtrl_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ProductCtrl_index0_invoker = createInvoker(
    ProductCtrl_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index1_invoker = createInvoker(
    HomeController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Assets_versioned2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned2_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ProductCtrl_listProducts3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listProducts")))
  )
  private[this] lazy val controllers_ProductCtrl_listProducts3_invoker = createInvoker(
    ProductCtrl_1.listProducts(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "listProducts",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """listProducts""",
      """Daria""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ShoppingCtrl_showBasket4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_showBasket4_invoker = createInvoker(
    ShoppingCtrl_2.showBasket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "showBasket",
      Nil,
      "GET",
      this.prefix + """showBasket""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ShoppingCtrl_addToBasket5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToBasket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addToBasket5_invoker = createInvoker(
    ShoppingCtrl_2.addToBasket(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addToBasket",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """addToBasket/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ShoppingCtrl_addOne6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addOne6_invoker = createInvoker(
    ShoppingCtrl_2.addOne(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addOne",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      this.prefix + """addOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ShoppingCtrl_removeOne7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_removeOne7_invoker = createInvoker(
    ShoppingCtrl_2.removeOne(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "removeOne",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      this.prefix + """removeOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket8_invoker = createInvoker(
    ShoppingCtrl_2.emptyBasket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "emptyBasket",
      Nil,
      "GET",
      this.prefix + """emptyBasket""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ShoppingCtrl_placeOrder9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("placeOrder")))
  )
  private[this] lazy val controllers_ShoppingCtrl_placeOrder9_invoker = createInvoker(
    ShoppingCtrl_2.placeOrder(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "placeOrder",
      Nil,
      "GET",
      this.prefix + """placeOrder""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ShoppingCtrl_viewOrder10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_viewOrder10_invoker = createInvoker(
    ShoppingCtrl_2.viewOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "viewOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """viewOrder/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_AdminProductCtrl_index11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_AdminProductCtrl_index11_invoker = createInvoker(
    AdminProductCtrl_3.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "index",
      Nil,
      "GET",
      this.prefix + """admin""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_AdminProductCtrl_listProducts12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/listProducts")))
  )
  private[this] lazy val controllers_AdminProductCtrl_listProducts12_invoker = createInvoker(
    AdminProductCtrl_3.listProducts(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "listProducts",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """admin/listProducts""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_AdminProductCtrl_listProducts13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/listProducts/"), DynamicPart("cat", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_listProducts13_invoker = createInvoker(
    AdminProductCtrl_3.listProducts(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "listProducts",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """admin/listProducts/""" + "$" + """cat<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_AdminProductCtrl_addProduct14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addProduct")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addProduct14_invoker = createInvoker(
    AdminProductCtrl_3.addProduct(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "addProduct",
      Nil,
      "GET",
      this.prefix + """admin/addProduct""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_AdminProductCtrl_addProductSubmit15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addProductSubmit")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addProductSubmit15_invoker = createInvoker(
    AdminProductCtrl_3.addProductSubmit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "addProductSubmit",
      Nil,
      "POST",
      this.prefix + """admin/addProductSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_AdminProductCtrl_updateProduct16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_updateProduct16_invoker = createInvoker(
    AdminProductCtrl_3.updateProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "updateProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """admin/updateProduct/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_AdminProductCtrl_updateProductSubmit17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateProductSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_updateProductSubmit17_invoker = createInvoker(
    AdminProductCtrl_3.updateProductSubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "updateProductSubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """admin/updateProductSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_AdminProductCtrl_deleteProduct18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/delProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_deleteProduct18_invoker = createInvoker(
    AdminProductCtrl_3.deleteProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "deleteProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """admin/delProduct/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_HomeController_profile19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_HomeController_profile19_invoker = createInvoker(
    HomeController_0.profile,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "profile",
      Nil,
      "GET",
      this.prefix + """profile""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_LoginController_login20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login20_invoker = createInvoker(
    LoginController_5.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """Ryan""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_LoginController_loginSubmit21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit21_invoker = createInvoker(
    LoginController_5.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "GET",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_LoginController_logout22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout22_invoker = createInvoker(
    LoginController_5.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_HomeController_registerUser23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registerUser")))
  )
  private[this] lazy val controllers_HomeController_registerUser23_invoker = createInvoker(
    HomeController_0.registerUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "registerUser",
      Nil,
      "GET",
      this.prefix + """registerUser""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_HomeController_registerUserSubmit24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registerUserSubmit")))
  )
  private[this] lazy val controllers_HomeController_registerUserSubmit24_invoker = createInvoker(
    HomeController_0.registerUserSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "registerUserSubmit",
      Nil,
      "POST",
      this.prefix + """registerUserSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_HomeController_addAdmin25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addAdmin")))
  )
  private[this] lazy val controllers_HomeController_addAdmin25_invoker = createInvoker(
    HomeController_0.addAdmin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addAdmin",
      Nil,
      "GET",
      this.prefix + """admin/addAdmin""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_HomeController_addAdminSubmit26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addAdminSubmit")))
  )
  private[this] lazy val controllers_HomeController_addAdminSubmit26_invoker = createInvoker(
    HomeController_0.addAdminSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addAdminSubmit",
      Nil,
      "POST",
      this.prefix + """admin/addAdminSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_HomeController_addCustomer27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addCustomer")))
  )
  private[this] lazy val controllers_HomeController_addCustomer27_invoker = createInvoker(
    HomeController_0.addCustomer,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addCustomer",
      Nil,
      "GET",
      this.prefix + """admin/addCustomer""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_HomeController_addCustomerSubmit28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addCustomerSubmit")))
  )
  private[this] lazy val controllers_HomeController_addCustomerSubmit28_invoker = createInvoker(
    HomeController_0.addCustomerSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addCustomerSubmit",
      Nil,
      "POST",
      this.prefix + """admin/addCustomerSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_HomeController_usersAdmin29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/admin")))
  )
  private[this] lazy val controllers_HomeController_usersAdmin29_invoker = createInvoker(
    HomeController_0.usersAdmin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "usersAdmin",
      Nil,
      "GET",
      this.prefix + """admin/admin""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_HomeController_usersCustomer30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/customers")))
  )
  private[this] lazy val controllers_HomeController_usersCustomer30_invoker = createInvoker(
    HomeController_0.usersCustomer,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "usersCustomer",
      Nil,
      "GET",
      this.prefix + """admin/customers""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_HomeController_updateCustomer31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateCustomer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateCustomer31_invoker = createInvoker(
    HomeController_0.updateCustomer(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateCustomer",
      Seq(classOf[String]),
      "GET",
      this.prefix + """admin/updateCustomer/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_HomeController_deleteCustomer32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/deleteCustomer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteCustomer32_invoker = createInvoker(
    HomeController_0.deleteCustomer(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteCustomer",
      Seq(classOf[String]),
      "GET",
      this.prefix + """admin/deleteCustomer/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_HomeController_updateAdmin33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateAdmin/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateAdmin33_invoker = createInvoker(
    HomeController_0.updateAdmin(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateAdmin",
      Seq(classOf[String]),
      "GET",
      this.prefix + """admin/updateAdmin/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_HomeController_deleteAdmin34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/deleteAdmin/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteAdmin34_invoker = createInvoker(
    HomeController_0.deleteAdmin(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteAdmin",
      Seq(classOf[String]),
      "GET",
      this.prefix + """admin/deleteAdmin/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_HomeController_product35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_product35_invoker = createInvoker(
    HomeController_0.product(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "product",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """product/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_AdminProductCtrl_discount36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/discounts/")))
  )
  private[this] lazy val controllers_AdminProductCtrl_discount36_invoker = createInvoker(
    AdminProductCtrl_3.discount(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "discount",
      Nil,
      "GET",
      this.prefix + """admin/discounts/""",
      """""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_AdminProductCtrl_addDiscount37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addDiscount/")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addDiscount37_invoker = createInvoker(
    AdminProductCtrl_3.addDiscount(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "addDiscount",
      Nil,
      "GET",
      this.prefix + """admin/addDiscount/""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_AdminProductCtrl_addDiscountSubmit38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addDiscountSubmit/")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addDiscountSubmit38_invoker = createInvoker(
    AdminProductCtrl_3.addDiscountSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "addDiscountSubmit",
      Nil,
      "POST",
      this.prefix + """admin/addDiscountSubmit/""",
      """""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_AdminProductCtrl_updateDiscount39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateDiscount/")))
  )
  private[this] lazy val controllers_AdminProductCtrl_updateDiscount39_invoker = createInvoker(
    AdminProductCtrl_3.updateDiscount(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "updateDiscount",
      Seq(classOf[String]),
      "GET",
      this.prefix + """admin/updateDiscount/""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_ShoppingCtrl_cancelOrder40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cancelOrder")))
  )
  private[this] lazy val controllers_ShoppingCtrl_cancelOrder40_invoker = createInvoker(
    ShoppingCtrl_2.cancelOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "cancelOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """cancelOrder""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_ShoppingCtrl_viewOrders41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrders")))
  )
  private[this] lazy val controllers_ShoppingCtrl_viewOrders41_invoker = createInvoker(
    ShoppingCtrl_2.viewOrders(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "viewOrders",
      Nil,
      "GET",
      this.prefix + """viewOrders""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_ShoppingCtrl_applyDiscount42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("applyDiscount/")))
  )
  private[this] lazy val controllers_ShoppingCtrl_applyDiscount42_invoker = createInvoker(
    ShoppingCtrl_2.applyDiscount(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "applyDiscount",
      Nil,
      "GET",
      this.prefix + """applyDiscount/""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_ShoppingCtrl_applyDiscountSubmit43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("applyDiscountSubmit/")))
  )
  private[this] lazy val controllers_ShoppingCtrl_applyDiscountSubmit43_invoker = createInvoker(
    ShoppingCtrl_2.applyDiscountSubmit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "applyDiscountSubmit",
      Nil,
      "GET",
      this.prefix + """applyDiscountSubmit/""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_AdminProductCtrl_statistics44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/statistics")))
  )
  private[this] lazy val controllers_AdminProductCtrl_statistics44_invoker = createInvoker(
    AdminProductCtrl_3.statistics(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "statistics",
      Nil,
      "GET",
      this.prefix + """admin/statistics""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_HomeController_addReview45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addReview/"), DynamicPart("prodId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addReview45_invoker = createInvoker(
    HomeController_0.addReview(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addReview",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """addReview/""" + "$" + """prodId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_HomeController_addReviewSubmit46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addReviewSubmit/"), DynamicPart("prodId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addReviewSubmit46_invoker = createInvoker(
    HomeController_0.addReviewSubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addReviewSubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """addReviewSubmit/""" + "$" + """prodId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_HomeController_deleteReview47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteReview/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteReview47_invoker = createInvoker(
    HomeController_0.deleteReview(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteReview",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """deleteReview/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val controllers_AdminProductCtrl_adminPanel48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/panel")))
  )
  private[this] lazy val controllers_AdminProductCtrl_adminPanel48_invoker = createInvoker(
    AdminProductCtrl_3.adminPanel,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "adminPanel",
      Nil,
      "GET",
      this.prefix + """admin/panel""",
      """""",
      Seq()
    )
  )

  // @LINE:62
  private[this] lazy val controllers_HomeController_changeProfilePic49_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile/changeProfilePic")))
  )
  private[this] lazy val controllers_HomeController_changeProfilePic49_invoker = createInvoker(
    HomeController_0.changeProfilePic(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "changeProfilePic",
      Nil,
      "POST",
      this.prefix + """profile/changeProfilePic""",
      """""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_HomeController_changePassword50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("changePassword")))
  )
  private[this] lazy val controllers_HomeController_changePassword50_invoker = createInvoker(
    HomeController_0.changePassword(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "changePassword",
      Nil,
      "GET",
      this.prefix + """changePassword""",
      """""",
      Seq()
    )
  )

  // @LINE:64
  private[this] lazy val controllers_HomeController_changePasswordSubmit51_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("changePasswordSubmit")))
  )
  private[this] lazy val controllers_HomeController_changePasswordSubmit51_invoker = createInvoker(
    HomeController_0.changePasswordSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "changePasswordSubmit",
      Nil,
      "POST",
      this.prefix + """changePasswordSubmit""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ProductCtrl_index0_route(params@_) =>
      call { 
        controllers_ProductCtrl_index0_invoker.call(ProductCtrl_1.index())
      }
  
    // @LINE:7
    case controllers_HomeController_index1_route(params@_) =>
      call { 
        controllers_HomeController_index1_invoker.call(HomeController_0.index())
      }
  
    // @LINE:8
    case controllers_Assets_versioned2_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned2_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:13
    case controllers_ProductCtrl_listProducts3_route(params@_) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_ProductCtrl_listProducts3_invoker.call(ProductCtrl_1.listProducts(cat, filter))
      }
  
    // @LINE:14
    case controllers_ShoppingCtrl_showBasket4_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_showBasket4_invoker.call(ShoppingCtrl_2.showBasket())
      }
  
    // @LINE:15
    case controllers_ShoppingCtrl_addToBasket5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_addToBasket5_invoker.call(ShoppingCtrl_2.addToBasket(id))
      }
  
    // @LINE:16
    case controllers_ShoppingCtrl_addOne6_route(params@_) =>
      call(params.fromPath[Long]("itemId", None), params.fromQuery[Long]("pid", None)) { (itemId, pid) =>
        controllers_ShoppingCtrl_addOne6_invoker.call(ShoppingCtrl_2.addOne(itemId, pid))
      }
  
    // @LINE:17
    case controllers_ShoppingCtrl_removeOne7_route(params@_) =>
      call(params.fromPath[Long]("itemId", None), params.fromQuery[Long]("pid", None)) { (itemId, pid) =>
        controllers_ShoppingCtrl_removeOne7_invoker.call(ShoppingCtrl_2.removeOne(itemId, pid))
      }
  
    // @LINE:18
    case controllers_ShoppingCtrl_emptyBasket8_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_emptyBasket8_invoker.call(ShoppingCtrl_2.emptyBasket())
      }
  
    // @LINE:19
    case controllers_ShoppingCtrl_placeOrder9_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_placeOrder9_invoker.call(ShoppingCtrl_2.placeOrder())
      }
  
    // @LINE:20
    case controllers_ShoppingCtrl_viewOrder10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_viewOrder10_invoker.call(ShoppingCtrl_2.viewOrder(id))
      }
  
    // @LINE:21
    case controllers_AdminProductCtrl_index11_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_index11_invoker.call(AdminProductCtrl_3.index())
      }
  
    // @LINE:22
    case controllers_AdminProductCtrl_listProducts12_route(params@_) =>
      call(Param[Long]("cat", Right(0))) { (cat) =>
        controllers_AdminProductCtrl_listProducts12_invoker.call(AdminProductCtrl_3.listProducts(cat))
      }
  
    // @LINE:23
    case controllers_AdminProductCtrl_listProducts13_route(params@_) =>
      call(params.fromPath[Long]("cat", None)) { (cat) =>
        controllers_AdminProductCtrl_listProducts13_invoker.call(AdminProductCtrl_3.listProducts(cat))
      }
  
    // @LINE:24
    case controllers_AdminProductCtrl_addProduct14_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_addProduct14_invoker.call(AdminProductCtrl_3.addProduct())
      }
  
    // @LINE:25
    case controllers_AdminProductCtrl_addProductSubmit15_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_addProductSubmit15_invoker.call(AdminProductCtrl_3.addProductSubmit())
      }
  
    // @LINE:26
    case controllers_AdminProductCtrl_updateProduct16_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_updateProduct16_invoker.call(AdminProductCtrl_3.updateProduct(id))
      }
  
    // @LINE:27
    case controllers_AdminProductCtrl_updateProductSubmit17_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_updateProductSubmit17_invoker.call(AdminProductCtrl_3.updateProductSubmit(id))
      }
  
    // @LINE:28
    case controllers_AdminProductCtrl_deleteProduct18_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_deleteProduct18_invoker.call(AdminProductCtrl_3.deleteProduct(id))
      }
  
    // @LINE:29
    case controllers_HomeController_profile19_route(params@_) =>
      call { 
        controllers_HomeController_profile19_invoker.call(HomeController_0.profile)
      }
  
    // @LINE:33
    case controllers_LoginController_login20_route(params@_) =>
      call { 
        controllers_LoginController_login20_invoker.call(LoginController_5.login)
      }
  
    // @LINE:34
    case controllers_LoginController_loginSubmit21_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit21_invoker.call(LoginController_5.loginSubmit)
      }
  
    // @LINE:35
    case controllers_LoginController_logout22_route(params@_) =>
      call { 
        controllers_LoginController_logout22_invoker.call(LoginController_5.logout)
      }
  
    // @LINE:36
    case controllers_HomeController_registerUser23_route(params@_) =>
      call { 
        controllers_HomeController_registerUser23_invoker.call(HomeController_0.registerUser)
      }
  
    // @LINE:37
    case controllers_HomeController_registerUserSubmit24_route(params@_) =>
      call { 
        controllers_HomeController_registerUserSubmit24_invoker.call(HomeController_0.registerUserSubmit)
      }
  
    // @LINE:38
    case controllers_HomeController_addAdmin25_route(params@_) =>
      call { 
        controllers_HomeController_addAdmin25_invoker.call(HomeController_0.addAdmin)
      }
  
    // @LINE:39
    case controllers_HomeController_addAdminSubmit26_route(params@_) =>
      call { 
        controllers_HomeController_addAdminSubmit26_invoker.call(HomeController_0.addAdminSubmit)
      }
  
    // @LINE:40
    case controllers_HomeController_addCustomer27_route(params@_) =>
      call { 
        controllers_HomeController_addCustomer27_invoker.call(HomeController_0.addCustomer)
      }
  
    // @LINE:41
    case controllers_HomeController_addCustomerSubmit28_route(params@_) =>
      call { 
        controllers_HomeController_addCustomerSubmit28_invoker.call(HomeController_0.addCustomerSubmit)
      }
  
    // @LINE:42
    case controllers_HomeController_usersAdmin29_route(params@_) =>
      call { 
        controllers_HomeController_usersAdmin29_invoker.call(HomeController_0.usersAdmin)
      }
  
    // @LINE:43
    case controllers_HomeController_usersCustomer30_route(params@_) =>
      call { 
        controllers_HomeController_usersCustomer30_invoker.call(HomeController_0.usersCustomer)
      }
  
    // @LINE:44
    case controllers_HomeController_updateCustomer31_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_updateCustomer31_invoker.call(HomeController_0.updateCustomer(id))
      }
  
    // @LINE:45
    case controllers_HomeController_deleteCustomer32_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_deleteCustomer32_invoker.call(HomeController_0.deleteCustomer(id))
      }
  
    // @LINE:46
    case controllers_HomeController_updateAdmin33_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_updateAdmin33_invoker.call(HomeController_0.updateAdmin(id))
      }
  
    // @LINE:47
    case controllers_HomeController_deleteAdmin34_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_deleteAdmin34_invoker.call(HomeController_0.deleteAdmin(id))
      }
  
    // @LINE:48
    case controllers_HomeController_product35_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[String]("filter", Some(""))) { (id, filter) =>
        controllers_HomeController_product35_invoker.call(HomeController_0.product(id, filter))
      }
  
    // @LINE:49
    case controllers_AdminProductCtrl_discount36_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_discount36_invoker.call(AdminProductCtrl_3.discount())
      }
  
    // @LINE:50
    case controllers_AdminProductCtrl_addDiscount37_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_addDiscount37_invoker.call(AdminProductCtrl_3.addDiscount())
      }
  
    // @LINE:51
    case controllers_AdminProductCtrl_addDiscountSubmit38_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_addDiscountSubmit38_invoker.call(AdminProductCtrl_3.addDiscountSubmit)
      }
  
    // @LINE:52
    case controllers_AdminProductCtrl_updateDiscount39_route(params@_) =>
      call(params.fromQuery[String]("id", None)) { (id) =>
        controllers_AdminProductCtrl_updateDiscount39_invoker.call(AdminProductCtrl_3.updateDiscount(id))
      }
  
    // @LINE:53
    case controllers_ShoppingCtrl_cancelOrder40_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_cancelOrder40_invoker.call(ShoppingCtrl_2.cancelOrder(id))
      }
  
    // @LINE:54
    case controllers_ShoppingCtrl_viewOrders41_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_viewOrders41_invoker.call(ShoppingCtrl_2.viewOrders())
      }
  
    // @LINE:55
    case controllers_ShoppingCtrl_applyDiscount42_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_applyDiscount42_invoker.call(ShoppingCtrl_2.applyDiscount())
      }
  
    // @LINE:56
    case controllers_ShoppingCtrl_applyDiscountSubmit43_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_applyDiscountSubmit43_invoker.call(ShoppingCtrl_2.applyDiscountSubmit())
      }
  
    // @LINE:57
    case controllers_AdminProductCtrl_statistics44_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_statistics44_invoker.call(AdminProductCtrl_3.statistics())
      }
  
    // @LINE:58
    case controllers_HomeController_addReview45_route(params@_) =>
      call(params.fromPath[Long]("prodId", None)) { (prodId) =>
        controllers_HomeController_addReview45_invoker.call(HomeController_0.addReview(prodId))
      }
  
    // @LINE:59
    case controllers_HomeController_addReviewSubmit46_route(params@_) =>
      call(params.fromPath[Long]("prodId", None)) { (prodId) =>
        controllers_HomeController_addReviewSubmit46_invoker.call(HomeController_0.addReviewSubmit(prodId))
      }
  
    // @LINE:60
    case controllers_HomeController_deleteReview47_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteReview47_invoker.call(HomeController_0.deleteReview(id))
      }
  
    // @LINE:61
    case controllers_AdminProductCtrl_adminPanel48_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_adminPanel48_invoker.call(AdminProductCtrl_3.adminPanel)
      }
  
    // @LINE:62
    case controllers_HomeController_changeProfilePic49_route(params@_) =>
      call { 
        controllers_HomeController_changeProfilePic49_invoker.call(HomeController_0.changeProfilePic())
      }
  
    // @LINE:63
    case controllers_HomeController_changePassword50_route(params@_) =>
      call { 
        controllers_HomeController_changePassword50_invoker.call(HomeController_0.changePassword())
      }
  
    // @LINE:64
    case controllers_HomeController_changePasswordSubmit51_route(params@_) =>
      call { 
        controllers_HomeController_changePasswordSubmit51_invoker.call(HomeController_0.changePasswordSubmit)
      }
  }
}
