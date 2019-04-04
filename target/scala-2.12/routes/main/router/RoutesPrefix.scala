// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ryan/Downloads/aa/2ndYearProject/conf/routes
// @DATE:Thu Apr 04 21:01:49 IST 2019


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
