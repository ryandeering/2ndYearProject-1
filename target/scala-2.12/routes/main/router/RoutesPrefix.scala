// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ryan/rawr/2ndYearProject2/conf/routes
// @DATE:Tue Mar 19 16:44:10 GMT 2019


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
