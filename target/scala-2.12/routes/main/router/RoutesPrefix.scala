// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ryan/Documents/2ndYearProject/conf/routes
// @DATE:Wed Feb 20 15:21:10 GMT 2019


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
