
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


Seq[Any](format.raw/*3.1*/("""<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta charset="UTF-8"/>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="icon" type="image/png" href=""""),_display_(/*8.44*/routes/*8.50*/.Assets.versioned("images/favicon.png")),format.raw/*8.89*/("""">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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

		"""),format.raw/*27.3*/(""".navbar """),format.raw/*27.11*/("""{"""),format.raw/*27.12*/("""background-color: #2D2D2D; color: #A5A5A5 background-color: #2D2D2D; color: #A5A5A5; """),format.raw/*27.97*/("""}"""),format.raw/*27.98*/("""
		"""),format.raw/*28.3*/(""".sidecol """),format.raw/*28.12*/("""{"""),format.raw/*28.13*/("""background-color: #2D2D2D; color: #A5A5A5; """),format.raw/*28.56*/("""}"""),format.raw/*28.57*/("""
		"""),format.raw/*29.3*/(""".footer """),format.raw/*29.11*/("""{"""),format.raw/*29.12*/("""background-color: #2D2D2D; color: #A5A5A5; """),format.raw/*29.55*/("""}"""),format.raw/*29.56*/("""
		"""),format.raw/*30.3*/(""".sidebar """),format.raw/*30.12*/("""{"""),format.raw/*30.13*/(""" """),format.raw/*30.14*/("""width: 33%; float: right;"""),format.raw/*30.39*/("""}"""),format.raw/*30.40*/("""
		"""),format.raw/*31.3*/(""".dropdown """),format.raw/*31.13*/("""{"""),format.raw/*31.14*/("""  """),format.raw/*31.16*/("""}"""),format.raw/*31.17*/("""
		"""),format.raw/*32.3*/(""".navbar-right"""),format.raw/*32.16*/("""{"""),format.raw/*32.17*/("""  """),format.raw/*32.19*/("""}"""),format.raw/*32.20*/("""
		"""),format.raw/*33.3*/(""".headerImg """),format.raw/*33.14*/("""{"""),format.raw/*33.15*/(""" """),format.raw/*33.16*/("""width: 100%; text-align: center; """),format.raw/*33.49*/("""}"""),format.raw/*33.50*/("""





"""),format.raw/*39.1*/("""@charset "UTF-8";
/*
$content-width will be the max width of the content within the navigation bar.
$breakpoint determines at which width the media query breakpoint will take effect.
*/

body """),format.raw/*45.6*/("""{"""),format.raw/*45.7*/("""
  """),format.raw/*46.3*/("""background-color: ;
"""),format.raw/*47.1*/("""}"""),format.raw/*47.2*/("""
"""),format.raw/*48.1*/("""nav """),format.raw/*48.5*/("""{"""),format.raw/*48.6*/("""
  """),format.raw/*49.3*/("""float: right;
"""),format.raw/*50.1*/("""}"""),format.raw/*50.2*/("""
"""),format.raw/*51.1*/("""nav ul """),format.raw/*51.8*/("""{"""),format.raw/*51.9*/("""
  """),format.raw/*52.3*/("""list-style: none;
  margin: 0;
  padding: 0;
  padding-top: 0.4em;
  padding-bottom:0.4em;

"""),format.raw/*58.1*/("""}"""),format.raw/*58.2*/("""
"""),format.raw/*59.1*/("""nav ul li """),format.raw/*59.11*/("""{"""),format.raw/*59.12*/("""
  """),format.raw/*60.3*/("""float: left;
  position: relative;
"""),format.raw/*62.1*/("""}"""),format.raw/*62.2*/("""
"""),format.raw/*63.1*/("""nav ul li a """),format.raw/*63.13*/("""{"""),format.raw/*63.14*/("""
  """),format.raw/*64.3*/("""display: block;
  padding: 0 20px;
  line-height: 70px;
  background-color: #2D2D2D; color: #A5A5A5;
  text-decoration: none;
  /*
  The full path of this code is nav ul li a:not(:only-child):after. This means that the code will apply to any a tag in our nav list that is NOT an only child, aka any dropdown. The :after means it comes after the output of the tag. I’ve decided that to specify any nav item as a dropdown, it will be followed by a unicode arrow – ▾ (#9662).
  */
"""),format.raw/*72.1*/("""}"""),format.raw/*72.2*/("""
"""),format.raw/*73.1*/("""nav ul li a:hover """),format.raw/*73.19*/("""{"""),format.raw/*73.20*/("""
  """),format.raw/*74.3*/("""background-color: #2D2D2D; color: #A5A5A5;
"""),format.raw/*75.1*/("""}"""),format.raw/*75.2*/("""
"""),format.raw/*76.1*/("""nav ul li a:not(:only-child):after """),format.raw/*76.36*/("""{"""),format.raw/*76.37*/("""
  """),format.raw/*77.3*/("""padding-left: 4px;
  content: ' ▾';
"""),format.raw/*79.1*/("""}"""),format.raw/*79.2*/("""
"""),format.raw/*80.1*/("""nav ul li ul li """),format.raw/*80.17*/("""{"""),format.raw/*80.18*/("""
  """),format.raw/*81.3*/("""min-width: 190px;
"""),format.raw/*82.1*/("""}"""),format.raw/*82.2*/("""
"""),format.raw/*83.1*/("""nav ul li ul li a """),format.raw/*83.19*/("""{"""),format.raw/*83.20*/("""
  """),format.raw/*84.3*/("""padding: 15px;
  line-height: 20px;
"""),format.raw/*86.1*/("""}"""),format.raw/*86.2*/("""

"""),format.raw/*88.1*/(""".nav-dropdown """),format.raw/*88.15*/("""{"""),format.raw/*88.16*/("""
  """),format.raw/*89.3*/("""position: absolute;
  z-index: 1;
  /* Guarantees that the dropdown will display on top of any content. */
  box-shadow: 0 3px 12px rgba(0, 0, 0, 0.15);
  display: none;
"""),format.raw/*94.1*/("""}"""),format.raw/*94.2*/("""

"""),format.raw/*96.1*/(""".nav-mobile """),format.raw/*96.13*/("""{"""),format.raw/*96.14*/("""
  """),format.raw/*97.3*/("""display: none;
  position: absolute;
  top: 0;
  right: 0;
  background-color: #2D2D2D; color: #A5A5A5;
  height: 70px;
  width: 70px;
"""),format.raw/*104.1*/("""}"""),format.raw/*104.2*/("""

"""),format.raw/*106.1*/("""@media only screen and (max-width: 800px) """),format.raw/*106.44*/("""{"""),format.raw/*106.45*/("""

  """),format.raw/*108.3*/(""".brand"""),format.raw/*108.9*/("""{"""),format.raw/*108.10*/("""
  """),format.raw/*109.3*/("""padding-top: 10px !important;
  padding-left: 20px !important;
   position: absolute !important;
  float: left !important;
  line-height: 70px !important;
  text-transform: uppercase !important;
  font-size: 1.4em !important;
  """),format.raw/*116.3*/("""}"""),format.raw/*116.4*/("""

  """),format.raw/*118.3*/(""".nav-mobile """),format.raw/*118.15*/("""{"""),format.raw/*118.16*/("""
    """),format.raw/*119.5*/("""display: block;
  """),format.raw/*120.3*/("""}"""),format.raw/*120.4*/("""

  """),format.raw/*122.3*/("""nav """),format.raw/*122.7*/("""{"""),format.raw/*122.8*/("""
  	"""),format.raw/*123.4*/("""background-color: #2D2D2D; color: #A5A5A5;
    width: 100%;
    padding: 70px 0 15px;
  """),format.raw/*126.3*/("""}"""),format.raw/*126.4*/("""
  """),format.raw/*127.3*/("""nav ul """),format.raw/*127.10*/("""{"""),format.raw/*127.11*/("""
    """),format.raw/*128.5*/("""display: none;
  """),format.raw/*129.3*/("""}"""),format.raw/*129.4*/("""
  """),format.raw/*130.3*/("""nav ul li """),format.raw/*130.13*/("""{"""),format.raw/*130.14*/("""
    """),format.raw/*131.5*/("""float: none;
    padding-left: 2em;
  """),format.raw/*133.3*/("""}"""),format.raw/*133.4*/("""
  """),format.raw/*134.3*/("""nav ul li a """),format.raw/*134.15*/("""{"""),format.raw/*134.16*/("""
    """),format.raw/*135.5*/("""padding: 15px;
    line-height: 20px;
  """),format.raw/*137.3*/("""}"""),format.raw/*137.4*/("""
  """),format.raw/*138.3*/("""nav ul li ul li a """),format.raw/*138.21*/("""{"""),format.raw/*138.22*/("""
    """),format.raw/*139.5*/("""padding-left: 30px;
  """),format.raw/*140.3*/("""}"""),format.raw/*140.4*/("""
"""),format.raw/*141.1*/("""}"""),format.raw/*141.2*/("""
"""),format.raw/*142.1*/("""#nav-toggle """),format.raw/*142.13*/("""{"""),format.raw/*142.14*/("""
  """),format.raw/*143.3*/("""position: absolute;
  left: 18px;
  top: 22px;
  cursor: pointer;
  padding: 10px 35px 16px 0px;
"""),format.raw/*148.1*/("""}"""),format.raw/*148.2*/("""
"""),format.raw/*149.1*/("""#nav-toggle span,
#nav-toggle span:before,
#nav-toggle span:after """),format.raw/*151.24*/("""{"""),format.raw/*151.25*/("""
  """),format.raw/*152.3*/("""cursor: pointer;
  border-radius: 1px;
  height: 5px;
  width: 35px;
  background: #463f3f;
  position: absolute;
  display: block;
  content: '';
  transition: all 300ms ease-in-out;
"""),format.raw/*161.1*/("""}"""),format.raw/*161.2*/("""
"""),format.raw/*162.1*/("""#nav-toggle span:before """),format.raw/*162.25*/("""{"""),format.raw/*162.26*/("""
  """),format.raw/*163.3*/("""top: -10px;
"""),format.raw/*164.1*/("""}"""),format.raw/*164.2*/("""
"""),format.raw/*165.1*/("""#nav-toggle span:after """),format.raw/*165.24*/("""{"""),format.raw/*165.25*/("""
  """),format.raw/*166.3*/("""bottom: -10px;
"""),format.raw/*167.1*/("""}"""),format.raw/*167.2*/("""
"""),format.raw/*168.1*/("""#nav-toggle.active span """),format.raw/*168.25*/("""{"""),format.raw/*168.26*/("""
  """),format.raw/*169.3*/("""background-color: transparent;
"""),format.raw/*170.1*/("""}"""),format.raw/*170.2*/("""
"""),format.raw/*171.1*/("""#nav-toggle.active span:before, #nav-toggle.active span:after """),format.raw/*171.63*/("""{"""),format.raw/*171.64*/("""
  """),format.raw/*172.3*/("""top: 0;
"""),format.raw/*173.1*/("""}"""),format.raw/*173.2*/("""
"""),format.raw/*174.1*/("""#nav-toggle.active span:before """),format.raw/*174.32*/("""{"""),format.raw/*174.33*/("""
  """),format.raw/*175.3*/("""transform: rotate(45deg);
"""),format.raw/*176.1*/("""}"""),format.raw/*176.2*/("""
"""),format.raw/*177.1*/("""#nav-toggle.active span:after """),format.raw/*177.31*/("""{"""),format.raw/*177.32*/("""
  """),format.raw/*178.3*/("""transform: rotate(-45deg);
"""),format.raw/*179.1*/("""}"""),format.raw/*179.2*/("""

"""),format.raw/*181.1*/("""@media screen and (min-width: 800px) """),format.raw/*181.39*/("""{"""),format.raw/*181.40*/("""

  """),format.raw/*183.3*/(""".brand"""),format.raw/*183.9*/("""{"""),format.raw/*183.10*/("""
  """),format.raw/*184.3*/("""padding-top: 1px !important;
  """),format.raw/*185.3*/("""}"""),format.raw/*185.4*/("""

  """),format.raw/*187.3*/(""".nav-list """),format.raw/*187.13*/("""{"""),format.raw/*187.14*/("""
    """),format.raw/*188.5*/("""display: block !important;
  """),format.raw/*189.3*/("""}"""),format.raw/*189.4*/("""


"""),format.raw/*192.1*/("""}"""),format.raw/*192.2*/("""
"""),format.raw/*193.1*/("""/*
.navigation – the outer wrapper for the navbar. Specifies the height and color, and will stretch the full width of the viewport.
*/
.navigation """),format.raw/*196.13*/("""{"""),format.raw/*196.14*/("""
  """),format.raw/*197.3*/("""height: 62px;
 background-color: #2D2D2D; color: #A5A5A5;
"""),format.raw/*199.1*/("""}"""),format.raw/*199.2*/("""

"""),format.raw/*201.1*/("""/*
.nav-container – the inner wrapper for the navbar. Defines how far the actual content should stretch.
*/
.nav-container """),format.raw/*204.16*/("""{"""),format.raw/*204.17*/("""
  """),format.raw/*205.3*/("""max-width: 1000px;
  margin: 0 auto;
"""),format.raw/*207.1*/("""}"""),format.raw/*207.2*/("""

"""),format.raw/*209.1*/(""".brand """),format.raw/*209.8*/("""{"""),format.raw/*209.9*/("""
  """),format.raw/*210.3*/("""position: relative;
  overflow: auto;
  float: left;
  line-height: 70px;
  text-transform: uppercase;
  font-size: 1.4em;
"""),format.raw/*216.1*/("""}"""),format.raw/*216.2*/("""
"""),format.raw/*217.1*/(""".brand a,
.brand a:visited """),format.raw/*218.18*/("""{"""),format.raw/*218.19*/("""

  """),format.raw/*220.3*/("""text-decoration: none;
"""),format.raw/*221.1*/("""}"""),format.raw/*221.2*/("""

        """),format.raw/*223.9*/("""</style>
		<title>CDR Games Profile</title>
	</head>
	<body>


	<!--
    Following Tania Ruscia's tutorial on creating your own responsive dropdown navigation bar. https://www.taniarascia.com/responsive-dropdown-navigation-bar/
    -->
	<section class="navigation">
		<div class="nav-container">
			<div class="brand">
				<a href='"""),_display_(/*235.15*/routes/*235.21*/.ProductCtrl.listProducts(0)),format.raw/*235.49*/("""'><img src="/assets/images/logo.png" width='60px' height='60px' alt="logo"></a>
			</div>
			<nav>
				<div class="nav-mobile">
					<a id="nav-toggle" href="#!"><span></span></a>
				</div>

				<ul class="nav navbar-nav navbar-right">
					"""),_display_(/*243.7*/if(user != null)/*243.23*/ {_display_(Seq[Any](format.raw/*243.25*/("""

                        """),_display_(/*245.26*/if(user.isInstanceOf[models.users.Admin])/*245.67*/{_display_(Seq[Any](format.raw/*245.68*/("""
                            """),format.raw/*246.29*/("""<li><a href=""""),_display_(/*246.43*/routes/*246.49*/.AdminProductCtrl.adminPanel()),format.raw/*246.79*/(""""><span class="glyphicon glyphicon-cog"></span> Admin Panel</a></li>
                        """)))}),format.raw/*247.26*/("""
					"""),format.raw/*248.6*/("""<li><a href=""""),_display_(/*248.20*/routes/*248.26*/.ShoppingCtrl.showBasket()),format.raw/*248.52*/(""""><span class="glyphicon glyphicon-shopping-cart"></span> Basket</a></li>
					<li><a href=""""),_display_(/*249.20*/routes/*249.26*/.ShoppingCtrl.viewOrders()),format.raw/*249.52*/(""""><span class="glyphicon glyphicon-log-in"></span> View Orders</a></li>

					<li><a href=""""),_display_(/*251.20*/routes/*251.26*/.HomeController.profile()),format.raw/*251.51*/("""">
						<i class="fa fa-user-circle-o"></i>
						"""),_display_(/*253.8*/if(user!=null)/*253.22*/{_display_(Seq[Any](format.raw/*253.23*/("""
						"""),_display_(/*254.8*/user/*254.12*/.getEmail)))}),format.raw/*254.22*/(""" """),format.raw/*254.23*/("""</span>

					</a></li>
					<li><a href=""""),_display_(/*257.20*/routes/*257.26*/.LoginController.logout()),format.raw/*257.51*/(""""><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
					""")))}/*258.8*/else/*258.13*/{_display_(Seq[Any](format.raw/*258.14*/("""
					"""),format.raw/*259.6*/("""<li><a href=""""),_display_(/*259.20*/routes/*259.26*/.HomeController.registerUser()),format.raw/*259.56*/(""""><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
					<li><a href=""""),_display_(/*260.20*/routes/*260.26*/.LoginController.login()),format.raw/*260.50*/(""""><span class="glyphicon glyphicon-log-in"></span> Login</a></li>

					""")))}),format.raw/*262.7*/("""
				"""),format.raw/*263.5*/("""</ul></li>


			</nav>
		</div>
	</section>
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


           			 """),_display_(/*283.17*/content),format.raw/*283.24*/("""



					
				"""),format.raw/*288.5*/("""</div>
				</div>
				
			</div>
			</div>
			</div>	
		<div class="footer">
            	<h5>Website created by CDR Games</h5>
		</div>



	</body>
</html>

<script>
	(function($) """),format.raw/*304.15*/("""{"""),format.raw/*304.16*/(""" """),format.raw/*304.17*/("""// Begin jQuery
  $(function() """),format.raw/*305.16*/("""{"""),format.raw/*305.17*/(""" """),format.raw/*305.18*/("""// DOM ready
    // If a link has a dropdown, add sub menu toggle.
    $('nav ul li a:not(:only-child)').click(function(e) """),format.raw/*307.57*/("""{"""),format.raw/*307.58*/("""
      """),format.raw/*308.7*/("""$(this).siblings('.nav-dropdown').toggle();
      // Close one dropdown when selecting another
      $('.nav-dropdown').not($(this).siblings()).hide();
      e.stopPropagation();
    """),format.raw/*312.5*/("""}"""),format.raw/*312.6*/(""");
    // Clicking away from dropdown will remove the dropdown class
    $('html').click(function() """),format.raw/*314.32*/("""{"""),format.raw/*314.33*/("""
      """),format.raw/*315.7*/("""$('.nav-dropdown').hide();
    """),format.raw/*316.5*/("""}"""),format.raw/*316.6*/(""");
    // Toggle open and close nav styles on click
    $('#nav-toggle').click(function() """),format.raw/*318.39*/("""{"""),format.raw/*318.40*/("""
      """),format.raw/*319.7*/("""$('nav ul').slideToggle();
    """),format.raw/*320.5*/("""}"""),format.raw/*320.6*/(""");
    // Hamburger to X toggle
    $('#nav-toggle').on('click', function() """),format.raw/*322.45*/("""{"""),format.raw/*322.46*/("""
      """),format.raw/*323.7*/("""this.classList.toggle('active');
    """),format.raw/*324.5*/("""}"""),format.raw/*324.6*/(""");
  """),format.raw/*325.3*/("""}"""),format.raw/*325.4*/("""); // end DOM ready
"""),format.raw/*326.1*/("""}"""),format.raw/*326.2*/(""")(jQuery); // end jQuery
</script>"""))
      }
    }
  }

  def render(pagename:String,user:User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 03 21:47:41 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/2ndYearProject/app/views/main.scala.html
                  HASH: 5b4794eeb669279283cef712f2126a1c6546e1c4
                  MATRIX: 651->1|989->27|1127->72|1413->332|1427->338|1486->377|1845->708|1874->709|1904->712|2050->830|2079->831|2109->834|2146->843|2175->844|2204->845|2280->893|2309->894|2339->897|2379->909|2408->910|2437->911|2484->930|2513->931|2543->934|2582->945|2611->946|2640->947|2724->1003|2753->1004|2783->1007|2822->1018|2851->1019|2880->1020|2946->1058|2975->1059|3005->1062|3042->1071|3071->1072|3100->1073|3140->1085|3169->1086|3200->1090|3236->1098|3265->1099|3378->1184|3407->1185|3437->1188|3474->1197|3503->1198|3574->1241|3603->1242|3633->1245|3669->1253|3698->1254|3769->1297|3798->1298|3828->1301|3865->1310|3894->1311|3923->1312|3976->1337|4005->1338|4035->1341|4073->1351|4102->1352|4132->1354|4161->1355|4191->1358|4232->1371|4261->1372|4291->1374|4320->1375|4350->1378|4389->1389|4418->1390|4447->1391|4508->1424|4537->1425|4570->1431|4789->1624|4817->1625|4847->1628|4894->1648|4922->1649|4950->1650|4981->1654|5009->1655|5039->1658|5080->1672|5108->1673|5136->1674|5170->1681|5198->1682|5228->1685|5347->1777|5375->1778|5403->1779|5441->1789|5470->1790|5500->1793|5562->1828|5590->1829|5618->1830|5658->1842|5687->1843|5717->1846|6222->2324|6250->2325|6278->2326|6324->2344|6353->2345|6383->2348|6453->2391|6481->2392|6509->2393|6572->2428|6601->2429|6631->2432|6694->2468|6722->2469|6750->2470|6794->2486|6823->2487|6853->2490|6898->2508|6926->2509|6954->2510|7000->2528|7029->2529|7059->2532|7122->2568|7150->2569|7179->2571|7221->2585|7250->2586|7280->2589|7477->2759|7505->2760|7534->2762|7574->2774|7603->2775|7633->2778|7796->2913|7825->2914|7855->2916|7926->2959|7956->2960|7988->2964|8022->2970|8052->2971|8083->2974|8339->3202|8368->3203|8400->3207|8441->3219|8471->3220|8504->3225|8550->3243|8579->3244|8611->3248|8643->3252|8672->3253|8704->3257|8820->3345|8849->3346|8880->3349|8916->3356|8946->3357|8979->3362|9024->3379|9053->3380|9084->3383|9123->3393|9153->3394|9186->3399|9252->3437|9281->3438|9312->3441|9353->3453|9383->3454|9416->3459|9484->3499|9513->3500|9544->3503|9591->3521|9621->3522|9654->3527|9704->3549|9733->3550|9762->3551|9791->3552|9820->3553|9861->3565|9891->3566|9922->3569|10047->3666|10076->3667|10105->3668|10200->3734|10230->3735|10261->3738|10473->3922|10502->3923|10531->3924|10584->3948|10614->3949|10645->3952|10685->3964|10714->3965|10743->3966|10795->3989|10825->3990|10856->3993|10899->4008|10928->4009|10957->4010|11010->4034|11040->4035|11071->4038|11130->4069|11159->4070|11188->4071|11279->4133|11309->4134|11340->4137|11376->4145|11405->4146|11434->4147|11494->4178|11524->4179|11555->4182|11609->4208|11638->4209|11667->4210|11726->4240|11756->4241|11787->4244|11842->4271|11871->4272|11901->4274|11967->4312|11997->4313|12029->4317|12063->4323|12093->4324|12124->4327|12183->4358|12212->4359|12244->4363|12283->4373|12313->4374|12346->4379|12403->4408|12432->4409|12463->4412|12492->4413|12521->4414|12697->4561|12727->4562|12758->4565|12844->4623|12873->4624|12903->4626|13055->4749|13085->4750|13116->4753|13181->4790|13210->4791|13240->4793|13275->4800|13304->4801|13335->4804|13486->4927|13515->4928|13544->4929|13600->4956|13630->4957|13662->4961|13713->4984|13742->4985|13780->4995|14141->5328|14157->5334|14207->5362|14477->5605|14503->5621|14544->5623|14599->5650|14650->5691|14690->5692|14748->5721|14790->5735|14806->5741|14858->5771|14984->5865|15018->5871|15060->5885|15076->5891|15124->5917|15245->6010|15261->6016|15309->6042|15429->6134|15445->6140|15492->6165|15571->6217|15595->6231|15635->6232|15670->6240|15684->6244|15719->6254|15749->6255|15820->6298|15836->6304|15883->6329|15975->6403|15989->6408|16029->6409|16063->6415|16105->6429|16121->6435|16173->6465|16286->6550|16302->6556|16348->6580|16452->6653|16485->6658|16887->7032|16916->7039|16958->7053|17168->7234|17198->7235|17228->7236|17288->7267|17318->7268|17348->7269|17500->7392|17530->7393|17565->7400|17776->7583|17805->7584|17934->7684|17964->7685|17999->7692|18058->7723|18087->7724|18206->7814|18236->7815|18271->7822|18330->7853|18359->7854|18464->7930|18494->7931|18529->7938|18594->7975|18623->7976|18656->7981|18685->7982|18733->8002|18762->8003
                  LINES: 24->1|29->2|34->3|39->8|39->8|39->8|44->13|44->13|45->14|51->20|51->20|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|56->25|56->25|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|63->32|63->32|63->32|63->32|63->32|64->33|64->33|64->33|64->33|64->33|64->33|70->39|76->45|76->45|77->46|78->47|78->47|79->48|79->48|79->48|80->49|81->50|81->50|82->51|82->51|82->51|83->52|89->58|89->58|90->59|90->59|90->59|91->60|93->62|93->62|94->63|94->63|94->63|95->64|103->72|103->72|104->73|104->73|104->73|105->74|106->75|106->75|107->76|107->76|107->76|108->77|110->79|110->79|111->80|111->80|111->80|112->81|113->82|113->82|114->83|114->83|114->83|115->84|117->86|117->86|119->88|119->88|119->88|120->89|125->94|125->94|127->96|127->96|127->96|128->97|135->104|135->104|137->106|137->106|137->106|139->108|139->108|139->108|140->109|147->116|147->116|149->118|149->118|149->118|150->119|151->120|151->120|153->122|153->122|153->122|154->123|157->126|157->126|158->127|158->127|158->127|159->128|160->129|160->129|161->130|161->130|161->130|162->131|164->133|164->133|165->134|165->134|165->134|166->135|168->137|168->137|169->138|169->138|169->138|170->139|171->140|171->140|172->141|172->141|173->142|173->142|173->142|174->143|179->148|179->148|180->149|182->151|182->151|183->152|192->161|192->161|193->162|193->162|193->162|194->163|195->164|195->164|196->165|196->165|196->165|197->166|198->167|198->167|199->168|199->168|199->168|200->169|201->170|201->170|202->171|202->171|202->171|203->172|204->173|204->173|205->174|205->174|205->174|206->175|207->176|207->176|208->177|208->177|208->177|209->178|210->179|210->179|212->181|212->181|212->181|214->183|214->183|214->183|215->184|216->185|216->185|218->187|218->187|218->187|219->188|220->189|220->189|223->192|223->192|224->193|227->196|227->196|228->197|230->199|230->199|232->201|235->204|235->204|236->205|238->207|238->207|240->209|240->209|240->209|241->210|247->216|247->216|248->217|249->218|249->218|251->220|252->221|252->221|254->223|266->235|266->235|266->235|274->243|274->243|274->243|276->245|276->245|276->245|277->246|277->246|277->246|277->246|278->247|279->248|279->248|279->248|279->248|280->249|280->249|280->249|282->251|282->251|282->251|284->253|284->253|284->253|285->254|285->254|285->254|285->254|288->257|288->257|288->257|289->258|289->258|289->258|290->259|290->259|290->259|290->259|291->260|291->260|291->260|293->262|294->263|314->283|314->283|319->288|335->304|335->304|335->304|336->305|336->305|336->305|338->307|338->307|339->308|343->312|343->312|345->314|345->314|346->315|347->316|347->316|349->318|349->318|350->319|351->320|351->320|353->322|353->322|354->323|355->324|355->324|356->325|356->325|357->326|357->326
                  -- GENERATED --
              */
          