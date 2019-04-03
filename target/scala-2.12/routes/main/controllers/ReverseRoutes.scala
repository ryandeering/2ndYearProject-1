// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/a/2ndYearProject/conf/routes
// @DATE:Wed Apr 03 23:20:40 BST 2019

import _root_.controllers.Assets.Asset
import play.api.mvc.Call

// @LINE:6
package controllers {

  // @LINE:8
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
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
  
    // @LINE:13
    def listProducts(cat:Long = 0, filter:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "listProducts" + play.core.routing.queryString(List(if(cat == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
  }

  // @LINE:21
  class ReverseAdminProductCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def addProductSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/addProductSubmit")
    }
  
    // @LINE:22
    def listProducts(cat:Long): Call = {
    
      (cat: @unchecked) match {
      
        // @LINE:22
        case (cat) if cat == 0 =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("cat", 0))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "admin/listProducts")
      
        // @LINE:23
        case (cat)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "admin/listProducts/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("cat", cat)))
      
      }
    
    }
  
    // @LINE:57
    def statistics(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/statistics")
    }
  
    // @LINE:28
    def deleteProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/delProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:26
    def updateProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/updateProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:61
    def adminPanel(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/panel")
    }
  
    // @LINE:24
    def addProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/addProduct")
    }
  
    // @LINE:52
    def updateDiscount(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/updateDiscount/" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("id", id)))))
    }
  
    // @LINE:49
    def discount(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/discounts/")
    }
  
    // @LINE:27
    def updateProductSubmit(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/updateProductSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:21
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin")
    }
  
    // @LINE:51
    def addDiscountSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/addDiscountSubmit/")
    }
  
    // @LINE:50
    def addDiscount(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/addDiscount/")
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def addCustomer(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/addCustomer")
    }
  
    // @LINE:45
    def deleteCustomer(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/deleteCustomer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:41
    def addCustomerSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/addCustomerSubmit")
    }
  
    // @LINE:29
    def profile(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profile")
    }
  
    // @LINE:42
    def usersAdmin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/admin")
    }
  
    // @LINE:36
    def registerUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "registerUser")
    }
  
    // @LINE:38
    def addAdmin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/addAdmin")
    }
  
    // @LINE:58
    def addReview(prodId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addReview/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("prodId", prodId)))
    }
  
    // @LINE:59
    def addReviewSubmit(prodId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addReviewSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("prodId", prodId)))
    }
  
    // @LINE:60
    def deleteReview(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteReview/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:46
    def updateAdmin(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/updateAdmin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:47
    def deleteAdmin(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/deleteAdmin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:48
    def product(id:Long, filter:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + play.core.routing.queryString(List(if(filter == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:37
    def registerUserSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "registerUserSubmit")
    }
  
    // @LINE:43
    def usersCustomer(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/customers")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:44
    def updateCustomer(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/updateCustomer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:39
    def addAdminSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/addAdminSubmit")
    }
  
  }

  // @LINE:33
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def loginSubmit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:35
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:33
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:14
  class ReverseShoppingCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def addToBasket(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addToBasket/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:54
    def viewOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewOrders")
    }
  
    // @LINE:56
    def applyDiscountSubmit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "applyDiscountSubmit/")
    }
  
    // @LINE:53
    def cancelOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cancelOrder" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:16
    def addOne(itemId:Long, pid:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addOne/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("pid", pid)))))
    }
  
    // @LINE:17
    def removeOne(itemId:Long, pid:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "removeOne/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("pid", pid)))))
    }
  
    // @LINE:20
    def viewOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewOrder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:19
    def placeOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "placeOrder")
    }
  
    // @LINE:55
    def applyDiscount(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "applyDiscount/")
    }
  
    // @LINE:14
    def showBasket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "showBasket")
    }
  
    // @LINE:18
    def emptyBasket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "emptyBasket")
    }
  
  }


}
