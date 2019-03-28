// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/conf/routes
// @DATE:Thu Mar 28 18:31:17 GMT 2019


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
