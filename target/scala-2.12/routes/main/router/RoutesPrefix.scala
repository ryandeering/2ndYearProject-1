// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ryan/2ndyearproj/2ndYearProject/conf/routes
// @DATE:Sat Mar 30 20:54:02 GMT 2019


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
