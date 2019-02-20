// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ryan/Documents/2ndYearProject/conf/routes
// @DATE:Wed Feb 20 15:21:10 GMT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
          }
        
        }
      """
    )
  
  }

  // @LINE:29
  class ReverseProductCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductCtrl.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:30
    def listProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductCtrl.listProducts",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listProducts" + _qS([(cat0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
  }

  // @LINE:42
  class ReverseAdminProductCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def addProductSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.addProductSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/addProductSubmit"})
        }
      """
    )
  
    // @LINE:44
    def listProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.listProducts",
      """
        function(cat0) {
        
          if (cat0 == """ + implicitly[play.api.mvc.JavascriptLiteral[Long]].to(0) + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/listProducts"})
          }
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/listProducts/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("cat", cat0))})
          }
        
        }
      """
    )
  
    // @LINE:53
    def deleteProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.deleteProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/delProduct/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:50
    def updateProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.updateProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/updateProduct/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:47
    def addProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.addProduct",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/addProduct"})
        }
      """
    )
  
    // @LINE:51
    def updateProductSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.updateProductSubmit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/updateProductSubmit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:42
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def loginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.loginSubmit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loginSubmit"})
        }
      """
    )
  
    // @LINE:22
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:18
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:33
  class ReverseShoppingCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def addOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.addOne",
      """
        function(itemId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addOne/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("itemId", itemId0))})
        }
      """
    )
  
    // @LINE:34
    def addToBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.addToBasket",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addToBasket/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:39
    def viewOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.viewOrder",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewOrder/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:38
    def placeOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.placeOrder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "placeOrder"})
        }
      """
    )
  
    // @LINE:36
    def removeOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.removeOne",
      """
        function(itemId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removeOne/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("itemId", itemId0))})
        }
      """
    )
  
    // @LINE:33
    def showBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.showBasket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showBasket"})
        }
      """
    )
  
    // @LINE:37
    def emptyBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.emptyBasket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "emptyBasket"})
        }
      """
    )
  
  }


}
