
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
<link rel="icon" type="image/png" href=""""),_display_(/*9.42*/routes/*9.48*/.Assets.versioned("images/favicon.png")),format.raw/*9.87*/("""">	
<style>
	    .footer """),format.raw/*11.14*/("""{"""),format.raw/*11.15*/(""" """),format.raw/*11.16*/("""font-weight: bold; color: white; background-color: black; i"""),format.raw/*11.75*/("""}"""),format.raw/*11.76*/("""
	    """),format.raw/*12.6*/(""".sidecol """),format.raw/*12.15*/("""{"""),format.raw/*12.16*/(""" """),format.raw/*12.17*/("""font-weight: bold; background-color: steelblue; """),format.raw/*12.65*/("""}"""),format.raw/*12.66*/("""
	    """),format.raw/*13.6*/(""".sidecol h2 """),format.raw/*13.18*/("""{"""),format.raw/*13.19*/(""" """),format.raw/*13.20*/("""font-weight: bold; """),format.raw/*13.39*/("""}"""),format.raw/*13.40*/("""
	    """),format.raw/*14.6*/(""".midcol h1 """),format.raw/*14.17*/("""{"""),format.raw/*14.18*/(""" """),format.raw/*14.19*/("""margin-top: 2em; text-align: center; font-weight: bold; """),format.raw/*14.75*/("""}"""),format.raw/*14.76*/("""
	    """),format.raw/*15.6*/(""".midcol h3 """),format.raw/*15.17*/("""{"""),format.raw/*15.18*/(""" """),format.raw/*15.19*/("""text-align: center; color: steelblue; """),format.raw/*15.57*/("""}"""),format.raw/*15.58*/("""
	    """),format.raw/*16.6*/(""".redtext """),format.raw/*16.15*/("""{"""),format.raw/*16.16*/(""" """),format.raw/*16.17*/("""color: red; """),format.raw/*16.29*/("""}"""),format.raw/*16.30*/("""
	"""),format.raw/*17.2*/("""</style>
	<title>OFM """),_display_(/*18.14*/pagename),format.raw/*18.22*/("""</title>
    </head>
    <body>
	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="#">WebSiteName</a>
		</div>
		<ul class="nav navbar-nav">
		    <li """),_display_(/*27.12*/if(pagename == "Home")/*27.34*/{_display_(Seq[Any](format.raw/*27.35*/("""class="active"""")))}),format.raw/*27.50*/("""><a href=""""),_display_(/*27.61*/routes/*27.67*/.HomeController.index()),format.raw/*27.90*/("""">Home</a></li>
		    <li """),_display_(/*28.12*/if(pagename == "On Sale")/*28.37*/{_display_(Seq[Any](format.raw/*28.38*/("""class="active"""")))}),format.raw/*28.53*/("""><a href=""""),_display_(/*28.64*/routes/*28.70*/.HomeController.index()),format.raw/*28.93*/("""">Products</a></li>
		    <li """),_display_(/*29.12*/if(pagename == "About Us")/*29.38*/{_display_(Seq[Any](format.raw/*29.39*/("""class="active"""")))}),format.raw/*29.54*/("""><a href=""""),_display_(/*29.65*/routes/*29.71*/.HomeController.index()),format.raw/*29.94*/("""">About us</a></li>
		</ul>
	    </div>
	</nav>
	<div class="container-fluid">
	    <div class="row">
		<div class="col-sm-3">
		    <div class="well sidecol">
			<h2>News</h2>
			<h3>New product sub-category</h3>
			<p>Following the sudden and unprecedented volumes of trade in fashion paper bags, our <span class="redtext">bags</span> category has been extended to include a seventh subcategory, <span class="redtext">paper handbags</span>.
		    </div>
		</div>
		<div class="col-sm-6">
		    <div class="midcol">
			"""),_display_(/*44.5*/content),format.raw/*44.12*/("""
		    """),format.raw/*45.7*/("""</div>
		</div>
		<div class="col-sm-3">
		    <div class="well sidecol">
			<h2>Events</h2>
			<h3>The 153rd Meet for Real event</h3>
			<p>The popular <span class="redtext">Meet for Real</span> event takes place this Sunday at the Square Park, from 7am until 1pm. It will yet again give flea-market enthusiasts a chance to engage in a bit of live bartering and banter with their fellow sitesters.</p>
		    </div>
		</div>
	    </div>
	    <div class="row">
		<div class="col-sm-12">
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
                  DATE: Mon Feb 18 13:20:58 GMT 2019
                  SOURCE: /home/wdd/wdd1labs/2ndYearProject/GameShop_Project/app/views/main.scala.html
                  HASH: 98730afbeca1dca2099bbe31b7bd572c713314b1
                  MATRIX: 651->1|989->27|1127->72|1427->346|1441->352|1500->391|1553->416|1582->417|1611->418|1698->477|1727->478|1760->484|1797->493|1826->494|1855->495|1931->543|1960->544|1993->550|2033->562|2062->563|2091->564|2138->583|2167->584|2200->590|2239->601|2268->602|2297->603|2381->659|2410->660|2443->666|2482->677|2511->678|2540->679|2606->717|2635->718|2668->724|2705->733|2734->734|2763->735|2803->747|2832->748|2861->750|2910->772|2939->780|3205->1019|3236->1041|3275->1042|3321->1057|3359->1068|3374->1074|3418->1097|3472->1124|3506->1149|3545->1150|3591->1165|3629->1176|3644->1182|3688->1205|3746->1236|3781->1262|3820->1263|3866->1278|3904->1289|3919->1295|3963->1318|4510->1839|4538->1846|4572->1853
                  LINES: 24->1|29->2|34->3|40->9|40->9|40->9|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|47->16|48->17|49->18|49->18|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|75->44|75->44|76->45
                  -- GENERATED --
              */
          