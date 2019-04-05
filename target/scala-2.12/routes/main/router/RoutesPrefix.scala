// @GENERATOR:play-routes-compiler
// @SOURCE:F:/dsad/2ndYearProject2/conf/routes
// @DATE:Fri Apr 05 19:03:41 BST 2019


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
