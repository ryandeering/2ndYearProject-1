// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/conf/routes
// @DATE:Thu Apr 04 11:22:56 BST 2019


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
