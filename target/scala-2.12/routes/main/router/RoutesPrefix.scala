// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/wdd1labs/2ndYearProject/GameShop_Project/conf/routes
// @DATE:Mon Feb 18 13:20:57 GMT 2019


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
