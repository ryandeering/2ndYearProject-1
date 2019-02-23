// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/GameShop_Project_hack/conf/routes
// @DATE:Sat Feb 23 21:07:38 GMT 2019


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
