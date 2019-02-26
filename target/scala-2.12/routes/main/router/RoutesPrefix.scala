// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Ryan3/Downloads/2ndYearProject (1)/2ndYearProject/conf/routes
// @DATE:Mon Feb 25 23:53:10 GMT 2019


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
