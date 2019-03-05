// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/wdd1labs/2ndYearProject/2ndYearProject/conf/routes
// @DATE:Tue Mar 05 15:21:33 GMT 2019


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
