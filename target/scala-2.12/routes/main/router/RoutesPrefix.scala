// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/2ndYearProject/2ndYearProject/conf/routes
// @DATE:Tue Apr 02 21:47:55 IST 2019


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
