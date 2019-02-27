
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
					""")))}/*59.8*/else/*59.13*/{_display_(Seq[Any](format.raw/*59.14*/("""
					"""),format.raw/*60.6*/("""<li><a href=""""),_display_(/*60.20*/routes/*60.26*/.HomeController.registerUser()),format.raw/*60.56*/(""""><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
					<li><a href=""""),_display_(/*61.20*/routes/*61.26*/.LoginController.login()),format.raw/*61.50*/(""""><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
					""")))}),format.raw/*62.7*/("""
				"""),format.raw/*63.5*/("""</ul>

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


           			 """),_display_(/*80.17*/content),format.raw/*80.24*/("""


        			
					
				"""),format.raw/*85.5*/("""</div>
				</div>
				
			</div>
			</div>
			</div>	
		<div class="footer">
            	<h5>Website created by SupaHotGamez</h5>
		</div>
				
			
	
	</body>
</html>"""))
      }
    }
  }

  def render(pagename:String,user:User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 27 18:20:32 GMT 2019
                  SOURCE: /home/ryan/Documents/2ndYearProject/app/views/main.scala.html
                  HASH: e8db60608b49f939be1f941ae48f3321e40ccfe8
                  MATRIX: 651->1|989->27|1127->72|1429->348|1443->354|1502->393|1745->608|1774->609|1806->614|1952->732|1981->733|2011->736|2048->745|2077->746|2106->747|2182->795|2211->796|2241->799|2281->811|2310->812|2339->813|2386->832|2415->833|2445->836|2484->847|2513->848|2542->849|2626->905|2655->906|2685->909|2724->920|2753->921|2782->922|2848->960|2877->961|2907->964|2944->973|2973->974|3002->975|3042->987|3071->988|3102->992|3138->1000|3167->1001|3238->1044|3267->1045|3297->1048|3334->1057|3363->1058|3434->1101|3463->1102|3493->1105|3529->1113|3558->1114|3629->1157|3658->1158|3688->1161|3725->1170|3754->1171|3783->1172|3836->1197|3865->1198|3895->1201|3933->1211|3962->1212|3992->1214|4021->1215|4051->1218|4092->1231|4121->1232|4151->1234|4180->1235|4210->1238|4249->1249|4278->1250|4307->1251|4368->1284|4397->1285|4433->1294|4489->1323|4518->1331|4728->1514|4743->1520|4792->1548|4977->1707|5002->1723|5042->1725|5075->1731|5157->1786|5172->1792|5219->1818|5359->1931|5374->1937|5420->1962|5511->2036|5524->2041|5563->2042|5596->2048|5637->2062|5652->2068|5703->2098|5815->2183|5830->2189|5875->2213|5977->2285|6009->2290|6383->2637|6411->2644|6463->2669
                  LINES: 24->1|29->2|34->3|40->9|40->9|40->9|44->13|44->13|45->14|51->20|51->20|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|56->25|56->25|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|63->32|63->32|63->32|63->32|63->32|64->33|64->33|64->33|64->33|64->33|64->33|65->34|66->35|66->35|77->46|77->46|77->46|85->54|85->54|85->54|86->55|87->56|87->56|87->56|89->58|89->58|89->58|90->59|90->59|90->59|91->60|91->60|91->60|91->60|92->61|92->61|92->61|93->62|94->63|111->80|111->80|116->85
                  -- GENERATED --
              */
          