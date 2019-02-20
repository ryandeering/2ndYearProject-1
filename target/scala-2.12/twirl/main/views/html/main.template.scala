
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import models.users.User

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(pagename: String, user: User)(content:Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta charset="UTF-8"/>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="icon" type="image/png" href=""""),_display_(/*9.44*/routes/*9.50*/.Assets.versioned("images/favicon.png")),format.raw/*9.89*/("""">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<style>
				.footer """),format.raw/*13.13*/("""{"""),format.raw/*13.14*/(""" """),format.raw/*13.15*/("""font-weight: bold; color: white; background-color: black; i"""),format.raw/*13.74*/("""}"""),format.raw/*13.75*/("""
				"""),format.raw/*14.5*/(""".sidecol """),format.raw/*14.14*/("""{"""),format.raw/*14.15*/(""" """),format.raw/*14.16*/("""font-weight: bold; background-color: steelblue; """),format.raw/*14.64*/("""}"""),format.raw/*14.65*/("""
				"""),format.raw/*15.5*/(""".sidecol h2 """),format.raw/*15.17*/("""{"""),format.raw/*15.18*/(""" """),format.raw/*15.19*/("""font-weight: bold; """),format.raw/*15.38*/("""}"""),format.raw/*15.39*/("""
				"""),format.raw/*16.5*/(""".midcol h1 """),format.raw/*16.16*/("""{"""),format.raw/*16.17*/(""" """),format.raw/*16.18*/("""margin-top: 2em; text-align: center; font-weight: bold; """),format.raw/*16.74*/("""}"""),format.raw/*16.75*/("""
				"""),format.raw/*17.5*/(""".midcol h3 """),format.raw/*17.16*/("""{"""),format.raw/*17.17*/(""" """),format.raw/*17.18*/("""text-align: center; color: steelblue; """),format.raw/*17.56*/("""}"""),format.raw/*17.57*/("""
				"""),format.raw/*18.5*/(""".redtext """),format.raw/*18.14*/("""{"""),format.raw/*18.15*/(""" """),format.raw/*18.16*/("""color: red; """),format.raw/*18.28*/("""}"""),format.raw/*18.29*/("""

				"""),format.raw/*20.5*/(""".navbar """),format.raw/*20.13*/("""{"""),format.raw/*20.14*/("""background-color: #2D2D2D; color: #A5A5A5; """),format.raw/*20.57*/("""}"""),format.raw/*20.58*/("""
				"""),format.raw/*21.5*/(""".sidecol """),format.raw/*21.14*/("""{"""),format.raw/*21.15*/("""background-color: #2D2D2D; color: #A5A5A5; """),format.raw/*21.58*/("""}"""),format.raw/*21.59*/("""
				"""),format.raw/*22.5*/(""".footer """),format.raw/*22.13*/("""{"""),format.raw/*22.14*/("""background-color: #2D2D2D; color: #A5A5A5; """),format.raw/*22.57*/("""}"""),format.raw/*22.58*/("""
				"""),format.raw/*23.5*/(""".sidebar """),format.raw/*23.14*/("""{"""),format.raw/*23.15*/(""" """),format.raw/*23.16*/("""width: 33%; float: right;"""),format.raw/*23.41*/("""}"""),format.raw/*23.42*/("""
				"""),format.raw/*24.5*/(""".dropdown """),format.raw/*24.15*/("""{"""),format.raw/*24.16*/("""  """),format.raw/*24.18*/("""}"""),format.raw/*24.19*/("""
				"""),format.raw/*25.5*/(""".navbar-right"""),format.raw/*25.18*/("""{"""),format.raw/*25.19*/("""  """),format.raw/*25.21*/("""}"""),format.raw/*25.22*/("""
				"""),format.raw/*26.5*/(""".headerImg """),format.raw/*26.16*/("""{"""),format.raw/*26.17*/(""" """),format.raw/*26.18*/("""width: 100%; text-align: center; """),format.raw/*26.51*/("""}"""),format.raw/*26.52*/("""



		"""),format.raw/*30.3*/("""</style>
		<title>OFM """),_display_(/*31.15*/pagename),format.raw/*31.23*/("""</title>
	</head>
	<body>

		<div class = "headerImg">
			<p> Header Img Goes Here </p>
		</div>

		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<ul class="nav navbar-nav">

					<li class="dropdown">
						<a class="dropdown-toggle" data-toggle="dropdown" href="#">PlayStation
							<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li """),_display_(/*47.13*/if(pagename == "Playstation FPS")/*47.46*/{_display_(Seq[Any](format.raw/*47.47*/("""class="active"""")))}),format.raw/*47.62*/("""><a href=""""),_display_(/*47.73*/routes/*47.79*/.HomeController.index()),format.raw/*47.102*/("""">FPS</a></li>
							<li """),_display_(/*48.13*/if(pagename == "Playstation Platformer")/*48.53*/{_display_(Seq[Any](format.raw/*48.54*/("""class="active"""")))}),format.raw/*48.69*/("""><a href=""""),_display_(/*48.80*/routes/*48.86*/.HomeController.index()),format.raw/*48.109*/("""">Platformer</a></li>
							<li """),_display_(/*49.13*/if(pagename == "Playstation Horror")/*49.49*/{_display_(Seq[Any](format.raw/*49.50*/("""class="active"""")))}),format.raw/*49.65*/("""><a href=""""),_display_(/*49.76*/routes/*49.82*/.HomeController.index()),format.raw/*49.105*/("""">Horror</a></li>
						</ul>
					</li>

					<li class="dropdown">
						<a class="dropdown-toggle" data-toggle="dropdown" href="#">XBOX
							<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li """),_display_(/*57.13*/if(pagename == "XBOX FPS")/*57.39*/{_display_(Seq[Any](format.raw/*57.40*/("""class="active"""")))}),format.raw/*57.55*/("""><a href=""""),_display_(/*57.66*/routes/*57.72*/.HomeController.index()),format.raw/*57.95*/("""">FPS</a></li>
							<li """),_display_(/*58.13*/if(pagename == "XBOX Platformer")/*58.46*/{_display_(Seq[Any](format.raw/*58.47*/("""class="active"""")))}),format.raw/*58.62*/("""><a href=""""),_display_(/*58.73*/routes/*58.79*/.HomeController.index()),format.raw/*58.102*/("""">Platformer</a></li>
							<li """),_display_(/*59.13*/if(pagename == "XBOX Horror")/*59.42*/{_display_(Seq[Any](format.raw/*59.43*/("""class="active"""")))}),format.raw/*59.58*/("""><a href=""""),_display_(/*59.69*/routes/*59.75*/.HomeController.index()),format.raw/*59.98*/("""">Horror</a></li>
						</ul>
					</li>
					<li class="dropdown">
						<a class="dropdown-toggle" data-toggle="dropdown" href="#">Nintendo
							<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li """),_display_(/*66.13*/if(pagename == "Nintendo FPS")/*66.43*/{_display_(Seq[Any](format.raw/*66.44*/("""class="active"""")))}),format.raw/*66.59*/("""><a href=""""),_display_(/*66.70*/routes/*66.76*/.HomeController.index()),format.raw/*66.99*/("""">FPS</a></li>
							<li """),_display_(/*67.13*/if(pagename == "Nintendo Platformer")/*67.50*/{_display_(Seq[Any](format.raw/*67.51*/("""class="active"""")))}),format.raw/*67.66*/("""><a href=""""),_display_(/*67.77*/routes/*67.83*/.HomeController.index()),format.raw/*67.106*/("""">Platformer</a></li>
							<li """),_display_(/*68.13*/if(pagename == "Nintendo Horror")/*68.46*/{_display_(Seq[Any](format.raw/*68.47*/("""class="active"""")))}),format.raw/*68.62*/("""><a href=""""),_display_(/*68.73*/routes/*68.79*/.HomeController.index()),format.raw/*68.102*/("""">Horror</a></li>
						</ul>
					</li>

					<li class="dropdown">
						<a class="dropdown-toggle" data-toggle="dropdown" href="#">PC
							<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li """),_display_(/*76.13*/if(pagename == "PC FPS")/*76.37*/{_display_(Seq[Any](format.raw/*76.38*/("""class="active"""")))}),format.raw/*76.53*/("""><a href=""""),_display_(/*76.64*/routes/*76.70*/.HomeController.index()),format.raw/*76.93*/("""">FPS</a></li>
							<li """),_display_(/*77.13*/if(pagename == "PC Platformer")/*77.44*/{_display_(Seq[Any](format.raw/*77.45*/("""class="active"""")))}),format.raw/*77.60*/("""><a href=""""),_display_(/*77.71*/routes/*77.77*/.HomeController.index()),format.raw/*77.100*/("""">Platformer</a></li>
							<li """),_display_(/*78.13*/if(pagename == "PC Horror")/*78.40*/{_display_(Seq[Any](format.raw/*78.41*/("""class="active"""")))}),format.raw/*78.56*/("""><a href=""""),_display_(/*78.67*/routes/*78.73*/.HomeController.index()),format.raw/*78.96*/("""">Horror</a></li>
						</ul>
					</li>

				</ul>


				<ul class="nav navbar-nav navbar-right">
					<li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
					<li><a href=""""),_display_(/*87.20*/routes/*87.26*/.LoginController.login()),format.raw/*87.50*/(""""><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
				</ul>

			</div>
		</nav>
		<div class="container-fluid">
			<div class="row">

				<div class="col-sm-8">
					<div class="midcol">
					"""),_display_(/*97.7*/content),format.raw/*97.14*/("""
					"""),format.raw/*98.6*/("""</div>
				</div>
				<div class="sidebar">
					<div class="well sidecol">
						<h2>Side Bar</h2>
						<h3>???</h3>
						<p>?????????????????????????</p>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<div class="well footer">
						Website created by ABC Sights
					</div>
				</div>
			</div>
		</div>


	</body>
</html>

"""))
      }
    }
  }

  def render(pagename:String,user:User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 20 15:21:11 GMT 2019
                  SOURCE: /home/ryan/Documents/2ndYearProject/app/views/main.scala.html
                  HASH: d1aad02c1049069e46008231acba711d6afa9fa0
                  MATRIX: 651->1|989->27|1127->72|1429->348|1443->354|1502->393|1741->604|1770->605|1799->606|1886->665|1915->666|1947->671|1984->680|2013->681|2042->682|2118->730|2147->731|2179->736|2219->748|2248->749|2277->750|2324->769|2353->770|2385->775|2424->786|2453->787|2482->788|2566->844|2595->845|2627->850|2666->861|2695->862|2724->863|2790->901|2819->902|2851->907|2888->916|2917->917|2946->918|2986->930|3015->931|3048->937|3084->945|3113->946|3184->989|3213->990|3245->995|3282->1004|3311->1005|3382->1048|3411->1049|3443->1054|3479->1062|3508->1063|3579->1106|3608->1107|3640->1112|3677->1121|3706->1122|3735->1123|3788->1148|3817->1149|3849->1154|3887->1164|3916->1165|3946->1167|3975->1168|4007->1173|4048->1186|4077->1187|4107->1189|4136->1190|4168->1195|4207->1206|4236->1207|4265->1208|4326->1241|4355->1242|4388->1248|4438->1271|4467->1279|4884->1669|4926->1702|4965->1703|5011->1718|5049->1729|5064->1735|5109->1758|5163->1785|5212->1825|5251->1826|5297->1841|5335->1852|5350->1858|5395->1881|5456->1915|5501->1951|5540->1952|5586->1967|5624->1978|5639->1984|5684->2007|5934->2230|5969->2256|6008->2257|6054->2272|6092->2283|6107->2289|6151->2312|6205->2339|6247->2372|6286->2373|6332->2388|6370->2399|6385->2405|6430->2428|6491->2462|6529->2491|6568->2492|6614->2507|6652->2518|6667->2524|6711->2547|6964->2773|7003->2803|7042->2804|7088->2819|7126->2830|7141->2836|7185->2859|7239->2886|7285->2923|7324->2924|7370->2939|7408->2950|7423->2956|7468->2979|7529->3013|7571->3046|7610->3047|7656->3062|7694->3073|7709->3079|7754->3102|8002->3323|8035->3347|8074->3348|8120->3363|8158->3374|8173->3380|8217->3403|8271->3430|8311->3461|8350->3462|8396->3477|8434->3488|8449->3494|8494->3517|8555->3551|8591->3578|8630->3579|8676->3594|8714->3605|8729->3611|8773->3634|9003->3837|9018->3843|9063->3867|9298->4076|9326->4083|9359->4089
                  LINES: 24->1|29->2|34->3|40->9|40->9|40->9|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|49->18|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|61->30|62->31|62->31|78->47|78->47|78->47|78->47|78->47|78->47|78->47|79->48|79->48|79->48|79->48|79->48|79->48|79->48|80->49|80->49|80->49|80->49|80->49|80->49|80->49|88->57|88->57|88->57|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|89->58|89->58|89->58|90->59|90->59|90->59|90->59|90->59|90->59|90->59|97->66|97->66|97->66|97->66|97->66|97->66|97->66|98->67|98->67|98->67|98->67|98->67|98->67|98->67|99->68|99->68|99->68|99->68|99->68|99->68|99->68|107->76|107->76|107->76|107->76|107->76|107->76|107->76|108->77|108->77|108->77|108->77|108->77|108->77|108->77|109->78|109->78|109->78|109->78|109->78|109->78|109->78|118->87|118->87|118->87|128->97|128->97|129->98
                  -- GENERATED --
              */
          