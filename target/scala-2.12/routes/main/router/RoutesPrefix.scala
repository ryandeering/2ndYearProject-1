// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/2ndYrProject/2ndYearProject/conf/routes
// @DATE:Sun Mar 10 22:47:50 GMT 2019


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
