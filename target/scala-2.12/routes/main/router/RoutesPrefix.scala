// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ryan/Documents/2ndYearProject/conf/routes
// @DATE:Wed Feb 27 19:39:40 GMT 2019


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
