// @GENERATOR:play-routes-compiler
// @SOURCE:/run/media/ryan/BEECC945ECC8F923/dsad/2ndYearProject2/conf/routes
// @DATE:Sun Apr 07 12:28:03 IST 2019


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
