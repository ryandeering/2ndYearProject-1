
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


Seq[Any](format.raw/*2.46*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta charset="UTF-8"/>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="icon" type="image/png" href=""""),_display_(/*9.44*/routes/*9.50*/.Assets.versioned("images/favicon.png")),format.raw/*9.89*/("""">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<style>
        .footer """),format.raw/*13.17*/("""{"""),format.raw/*13.18*/("""  
  """),format.raw/*14.3*/("""position: fixed;
  left: 0;
  bottom: 0;
  width: 100%;
  background-color: red;
  color: white;
  text-align: center;"""),format.raw/*20.22*/("""}"""),format.raw/*20.23*/("""
		"""),format.raw/*21.3*/(""".sidecol """),format.raw/*21.12*/("""{"""),format.raw/*21.13*/(""" """),format.raw/*21.14*/("""font-weight: bold; background-color: steelblue; """),format.raw/*21.62*/("""}"""),format.raw/*21.63*/("""
		"""),format.raw/*22.3*/(""".sidecol h2 """),format.raw/*22.15*/("""{"""),format.raw/*22.16*/(""" """),format.raw/*22.17*/("""font-weight: bold; """),format.raw/*22.36*/("""}"""),format.raw/*22.37*/("""
		"""),format.raw/*23.3*/(""".midcol h1 """),format.raw/*23.14*/("""{"""),format.raw/*23.15*/(""" """),format.raw/*23.16*/("""margin-top: 2em; text-align: center; font-weight: bold; """),format.raw/*23.72*/("""}"""),format.raw/*23.73*/("""
		"""),format.raw/*24.3*/(""".midcol h3 """),format.raw/*24.14*/("""{"""),format.raw/*24.15*/(""" """),format.raw/*24.16*/("""text-align: center; color: steelblue; """),format.raw/*24.54*/("""}"""),format.raw/*24.55*/("""
		"""),format.raw/*25.3*/(""".redtext """),format.raw/*25.12*/("""{"""),format.raw/*25.13*/(""" """),format.raw/*25.14*/("""color: red; """),format.raw/*25.26*/("""}"""),format.raw/*25.27*/("""

		"""),format.raw/*27.3*/(""".navbar """),format.raw/*27.11*/("""{"""),format.raw/*27.12*/("""background-color: #2D2D2D; color: #A5A5A5; """),format.raw/*27.55*/("""}"""),format.raw/*27.56*/("""
		"""),format.raw/*28.3*/(""".sidecol """),format.raw/*28.12*/("""{"""),format.raw/*28.13*/("""background-color: #2D2D2D; color: #A5A5A5; """),format.raw/*28.56*/("""}"""),format.raw/*28.57*/("""
		"""),format.raw/*29.3*/(""".footer """),format.raw/*29.11*/("""{"""),format.raw/*29.12*/("""background-color: #2D2D2D; color: #A5A5A5; """),format.raw/*29.55*/("""}"""),format.raw/*29.56*/("""
		"""),format.raw/*30.3*/(""".sidebar """),format.raw/*30.12*/("""{"""),format.raw/*30.13*/(""" """),format.raw/*30.14*/("""width: 33%; float: right;"""),format.raw/*30.39*/("""}"""),format.raw/*30.40*/("""
		"""),format.raw/*31.3*/(""".dropdown """),format.raw/*31.13*/("""{"""),format.raw/*31.14*/("""  """),format.raw/*31.16*/("""}"""),format.raw/*31.17*/("""
		"""),format.raw/*32.3*/(""".navbar-right"""),format.raw/*32.16*/("""{"""),format.raw/*32.17*/("""  """),format.raw/*32.19*/("""}"""),format.raw/*32.20*/("""
		"""),format.raw/*33.3*/(""".headerImg """),format.raw/*33.14*/("""{"""),format.raw/*33.15*/(""" """),format.raw/*33.16*/("""width: 100%; text-align: center; """),format.raw/*33.49*/("""}"""),format.raw/*33.50*/("""
        """),format.raw/*34.9*/("""</style>
		<title>CDR Games """),_display_(/*35.21*/pagename),format.raw/*35.29*/("""</title>
	</head>
	<body>

		

		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
			<ul class="nav navbar-nav">
			<li>
			<div class = "headerImg">
			<a href='"""),_display_(/*46.14*/routes/*46.20*/.ProductCtrl.listProducts(0)),format.raw/*46.48*/("""'><img src="/assets/images/logo.png" width='50px' height='50px' alt="logo"></a>
			</div>
			</li>

					


				<ul class="nav navbar-nav navbar-right">
					"""),_display_(/*54.7*/if(user != null)/*54.23*/ {_display_(Seq[Any](format.raw/*54.25*/("""
					"""),format.raw/*55.6*/("""<li>
                                        <a href=""""),_display_(/*56.51*/routes/*56.57*/.ShoppingCtrl.showBasket()),format.raw/*56.83*/(""""><span class="glyphicon glyphicon-shopping-cart"></span></a>
                        		</li>
					<li><a href=""""),_display_(/*58.20*/routes/*58.26*/.LoginController.logout()),format.raw/*58.51*/(""""><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
						<li><a href=""""),_display_(/*59.21*/routes/*59.27*/.ShoppingCtrl.viewOrders()),format.raw/*59.53*/(""""><span class="glyphicon glyphicon-log-in"></span> View Orders</a></li>
					""")))}/*60.8*/else/*60.13*/{_display_(Seq[Any](format.raw/*60.14*/("""
					"""),format.raw/*61.6*/("""<li><a href=""""),_display_(/*61.20*/routes/*61.26*/.HomeController.registerUser()),format.raw/*61.56*/(""""><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
					<li><a href=""""),_display_(/*62.20*/routes/*62.26*/.LoginController.login()),format.raw/*62.50*/(""""><span class="glyphicon glyphicon-log-in"></span> Login</a></li>

					""")))}),format.raw/*64.7*/("""
				"""),format.raw/*65.5*/("""</ul>

			</div>
		</nav>
		<div class="container-fluid">
			<div class="row">

				<div class="col-sm-8">
					<div class="midcol">
					<div class="container">
            				<div class="row">
                			<div class="col-md-12">
                    			<p class="lead"></p>
                		<div>
            			</div>


           			 """),_display_(/*82.17*/content),format.raw/*82.24*/("""



					
				"""),format.raw/*87.5*/("""</div>
				</div>
				
			</div>
			</div>
			</div>	
		<div class="footer">
            	<h5>Website created by CDR Games</h5>
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
                  DATE: Wed Mar 27 21:12:41 GMT 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/app/views/main.scala.html
                  HASH: d252057e4ad13449b90ddfea2bab6b3f88c2ef06
                  MATRIX: 651->1|989->28|1128->72|1156->74|1464->356|1478->362|1537->401|1784->620|1813->621|1846->627|1998->751|2027->752|2058->756|2095->765|2124->766|2153->767|2229->815|2258->816|2289->820|2329->832|2358->833|2387->834|2434->853|2463->854|2494->858|2533->869|2562->870|2591->871|2675->927|2704->928|2735->932|2774->943|2803->944|2832->945|2898->983|2927->984|2958->988|2995->997|3024->998|3053->999|3093->1011|3122->1012|3155->1018|3191->1026|3220->1027|3291->1070|3320->1071|3351->1075|3388->1084|3417->1085|3488->1128|3517->1129|3548->1133|3584->1141|3613->1142|3684->1185|3713->1186|3744->1190|3781->1199|3810->1200|3839->1201|3892->1226|3921->1227|3952->1231|3990->1241|4019->1242|4049->1244|4078->1245|4109->1249|4150->1262|4179->1263|4209->1265|4238->1266|4269->1270|4308->1281|4337->1282|4366->1283|4427->1316|4456->1317|4493->1327|4550->1357|4579->1365|4800->1559|4815->1565|4864->1593|5057->1760|5082->1776|5122->1778|5156->1785|5239->1841|5254->1847|5301->1873|5443->1988|5458->1994|5504->2019|5619->2107|5634->2113|5681->2139|5778->2219|5791->2224|5830->2225|5864->2232|5905->2246|5920->2252|5971->2282|6084->2368|6099->2374|6144->2398|6249->2473|6282->2479|6673->2843|6701->2850|6747->2869
                  LINES: 24->1|29->2|34->2|35->3|41->9|41->9|41->9|45->13|45->13|46->14|52->20|52->20|53->21|53->21|53->21|53->21|53->21|53->21|54->22|54->22|54->22|54->22|54->22|54->22|55->23|55->23|55->23|55->23|55->23|55->23|56->24|56->24|56->24|56->24|56->24|56->24|57->25|57->25|57->25|57->25|57->25|57->25|59->27|59->27|59->27|59->27|59->27|60->28|60->28|60->28|60->28|60->28|61->29|61->29|61->29|61->29|61->29|62->30|62->30|62->30|62->30|62->30|62->30|63->31|63->31|63->31|63->31|63->31|64->32|64->32|64->32|64->32|64->32|65->33|65->33|65->33|65->33|65->33|65->33|66->34|67->35|67->35|78->46|78->46|78->46|86->54|86->54|86->54|87->55|88->56|88->56|88->56|90->58|90->58|90->58|91->59|91->59|91->59|92->60|92->60|92->60|93->61|93->61|93->61|93->61|94->62|94->62|94->62|96->64|97->65|114->82|114->82|119->87
                  -- GENERATED --
              */
          