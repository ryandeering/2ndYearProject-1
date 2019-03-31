// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Ryan3/Desktop/2ndYearProject/conf/routes
// @DATE:Sun Mar 31 19:47:59 BST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
