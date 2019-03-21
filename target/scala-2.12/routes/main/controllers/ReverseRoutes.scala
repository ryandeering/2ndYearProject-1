// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ryan/rawr/2ndYearProject2/conf/routes
// @DATE:Thu Mar 21 19:55:55 GMT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:37
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseProductCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:11
    def listProducts(cat:Long = 0, filter:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "listProducts" + play.core.routing.queryString(List(if(cat == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
  }

  // @LINE:25
  class ReverseAdminProductCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def addProductSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Admin/addProductSubmit")
    }
  
    // @LINE:26
    def listProducts(cat:Long): Call = {
    
      (cat: @unchecked) match {
      
        // @LINE:26
        case (cat) if cat == 0 =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("cat", 0))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "Admin/listProducts")
      
        // @LINE:27
        case (cat)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "Admin/listProducts/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("cat", cat)))
      
      }
    
    }
  
    // @LINE:32
    def deleteProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/delProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:30
    def updateProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/updateProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:28
    def addProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/addProduct")
    }
  
    // @LINE:31
    def updateProductSubmit(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Admin/updateProductSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:25
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin")
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def addCustomer(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/addCustomer")
    }
  
    // @LINE:54
    def deleteCustomer(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/deleteCustomer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:50
    def addCustomerSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/addCustomerSubmit")
    }
  
    // @LINE:51
    def usersAdmin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/admin")
    }
  
    // @LINE:45
    def registerUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "registerUser")
    }
  
    // @LINE:47
    def addAdmin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/addAdmin")
    }
  
    // @LINE:55
    def updateAdmin(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/updateAdmin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:56
    def deleteAdmin(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/deleteAdmin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:57
    def product(id:Long, filter:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + play.core.routing.queryString(List(if(filter == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:46
    def registerUserSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "registerUserSubmit")
    }
  
    // @LINE:52
    def usersCustomer(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/customers")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:53
    def updateCustomer(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/updateCustomer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:48
    def addAdminSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/addAdminSubmit")
    }
  
  }

  // @LINE:42
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def loginSubmit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:44
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:42
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:15
  class ReverseShoppingCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def addToBasket(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addToBasket/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:60
    def viewOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewOrders")
    }
  
    // @LINE:59
    def cancelOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cancelOrder" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:17
    def addOne(itemId:Long, pid:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addOne/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("pid", pid)))))
    }
  
    // @LINE:18
    def removeOne(itemId:Long, pid:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "removeOne/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("pid", pid)))))
    }
  
    // @LINE:21
    def viewOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewOrder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:20
    def placeOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "placeOrder")
    }
  
    // @LINE:15
    def showBasket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "showBasket")
    }
  
    // @LINE:19
    def emptyBasket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "emptyBasket")
    }
  
  }


}
