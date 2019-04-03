
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
"""),format.raw/*3.1*/("""<html>
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
                  DATE: Wed Apr 03 23:20:42 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/a/2ndYearProject/app/views/main.scala.html
                  HASH: 4482cfcd7405d8c2863c86330369f0350106597b
                  MATRIX: 651->1|989->28|1128->72|1156->74|1447->339|1461->345|1520->384|1884->720|1913->721|1944->725|2096->849|2125->850|2156->854|2193->863|2222->864|2251->865|2327->913|2356->914|2387->918|2427->930|2456->931|2485->932|2532->951|2561->952|2592->956|2631->967|2660->968|2689->969|2773->1025|2802->1026|2833->1030|2872->1041|2901->1042|2930->1043|2996->1081|3025->1082|3056->1086|3093->1095|3122->1096|3151->1097|3191->1109|3220->1110|3253->1116|3289->1124|3318->1125|3431->1210|3460->1211|3491->1215|3528->1224|3557->1225|3628->1268|3657->1269|3688->1273|3724->1281|3753->1282|3824->1325|3853->1326|3884->1330|3921->1339|3950->1340|3979->1341|4032->1366|4061->1367|4092->1371|4130->1381|4159->1382|4189->1384|4218->1385|4249->1389|4290->1402|4319->1403|4349->1405|4378->1406|4409->1410|4448->1421|4477->1422|4506->1423|4567->1456|4596->1457|4635->1469|4860->1668|4888->1669|4919->1673|4967->1694|4995->1695|5024->1697|5055->1701|5083->1702|5114->1706|5156->1721|5184->1722|5213->1724|5247->1731|5275->1732|5306->1736|5431->1834|5459->1835|5488->1837|5526->1847|5555->1848|5586->1852|5650->1889|5678->1890|5707->1892|5747->1904|5776->1905|5807->1909|6320->2395|6348->2396|6377->2398|6423->2416|6452->2417|6483->2421|6554->2465|6582->2466|6611->2468|6674->2503|6703->2504|6734->2508|6799->2546|6827->2547|6856->2549|6900->2565|6929->2566|6960->2570|7006->2589|7034->2590|7063->2592|7109->2610|7138->2611|7169->2615|7234->2653|7262->2654|7293->2658|7335->2672|7364->2673|7395->2677|7597->2852|7625->2853|7656->2857|7696->2869|7725->2870|7756->2874|7926->3016|7955->3017|7987->3021|8058->3064|8088->3065|8122->3071|8156->3077|8186->3078|8218->3082|8481->3317|8510->3318|8544->3324|8585->3336|8615->3337|8649->3343|8696->3362|8725->3363|8759->3369|8791->3373|8820->3374|8853->3379|8972->3470|9001->3471|9033->3475|9069->3482|9099->3483|9133->3489|9179->3507|9208->3508|9240->3512|9279->3522|9309->3523|9343->3529|9411->3569|9440->3570|9472->3574|9513->3586|9543->3587|9577->3593|9647->3635|9676->3636|9708->3640|9755->3658|9785->3659|9819->3665|9870->3688|9899->3689|9929->3691|9958->3692|9988->3694|10029->3706|10059->3707|10091->3711|10221->3813|10250->3814|10280->3816|10377->3884|10407->3885|10439->3889|10660->4082|10689->4083|10719->4085|10772->4109|10802->4110|10834->4114|10875->4127|10904->4128|10934->4130|10986->4153|11016->4154|11048->4158|11092->4174|11121->4175|11151->4177|11204->4201|11234->4202|11266->4206|11326->4238|11355->4239|11385->4241|11476->4303|11506->4304|11538->4308|11575->4317|11604->4318|11634->4320|11694->4351|11724->4352|11756->4356|11811->4383|11840->4384|11870->4386|11929->4416|11959->4417|11991->4421|12047->4449|12076->4450|12108->4454|12174->4492|12204->4493|12238->4499|12272->4505|12302->4506|12334->4510|12394->4542|12423->4543|12457->4549|12496->4559|12526->4560|12560->4566|12618->4596|12647->4597|12681->4603|12710->4604|12740->4606|12919->4756|12949->4757|12981->4761|13069->4821|13098->4822|13130->4826|13285->4952|13315->4953|13347->4957|13414->4996|13443->4997|13475->5001|13510->5008|13539->5009|13571->5013|13728->5142|13757->5143|13787->5145|13844->5173|13874->5174|13908->5180|13960->5204|13989->5205|14029->5217|14402->5562|14418->5568|14468->5596|14746->5847|14772->5863|14813->5865|14870->5894|14921->5935|14961->5936|15020->5966|15062->5980|15078->5986|15130->6016|15257->6111|15292->6118|15334->6132|15350->6138|15398->6164|15520->6258|15536->6264|15584->6290|15706->6384|15722->6390|15769->6415|15850->6469|15874->6483|15914->6484|15950->6493|15964->6497|15999->6507|16029->6508|16103->6554|16119->6560|16166->6585|16259->6660|16273->6665|16313->6666|16348->6673|16390->6687|16406->6693|16458->6723|16572->6809|16588->6815|16634->6839|16740->6914|16774->6920|17196->7314|17225->7321|17272->7340|17498->7537|17528->7538|17558->7539|17619->7571|17649->7572|17679->7573|17833->7698|17863->7699|17899->7707|18114->7894|18143->7895|18274->7997|18304->7998|18340->8006|18400->8038|18429->8039|18550->8131|18580->8132|18616->8140|18676->8172|18705->8173|18812->8251|18842->8252|18878->8260|18944->8298|18973->8299|19007->8305|19036->8306|19085->8327|19114->8328
                  LINES: 24->1|29->2|34->2|35->3|40->8|40->8|40->8|45->13|45->13|46->14|52->20|52->20|53->21|53->21|53->21|53->21|53->21|53->21|54->22|54->22|54->22|54->22|54->22|54->22|55->23|55->23|55->23|55->23|55->23|55->23|56->24|56->24|56->24|56->24|56->24|56->24|57->25|57->25|57->25|57->25|57->25|57->25|59->27|59->27|59->27|59->27|59->27|60->28|60->28|60->28|60->28|60->28|61->29|61->29|61->29|61->29|61->29|62->30|62->30|62->30|62->30|62->30|62->30|63->31|63->31|63->31|63->31|63->31|64->32|64->32|64->32|64->32|64->32|65->33|65->33|65->33|65->33|65->33|65->33|71->39|77->45|77->45|78->46|79->47|79->47|80->48|80->48|80->48|81->49|82->50|82->50|83->51|83->51|83->51|84->52|90->58|90->58|91->59|91->59|91->59|92->60|94->62|94->62|95->63|95->63|95->63|96->64|104->72|104->72|105->73|105->73|105->73|106->74|107->75|107->75|108->76|108->76|108->76|109->77|111->79|111->79|112->80|112->80|112->80|113->81|114->82|114->82|115->83|115->83|115->83|116->84|118->86|118->86|120->88|120->88|120->88|121->89|126->94|126->94|128->96|128->96|128->96|129->97|136->104|136->104|138->106|138->106|138->106|140->108|140->108|140->108|141->109|148->116|148->116|150->118|150->118|150->118|151->119|152->120|152->120|154->122|154->122|154->122|155->123|158->126|158->126|159->127|159->127|159->127|160->128|161->129|161->129|162->130|162->130|162->130|163->131|165->133|165->133|166->134|166->134|166->134|167->135|169->137|169->137|170->138|170->138|170->138|171->139|172->140|172->140|173->141|173->141|174->142|174->142|174->142|175->143|180->148|180->148|181->149|183->151|183->151|184->152|193->161|193->161|194->162|194->162|194->162|195->163|196->164|196->164|197->165|197->165|197->165|198->166|199->167|199->167|200->168|200->168|200->168|201->169|202->170|202->170|203->171|203->171|203->171|204->172|205->173|205->173|206->174|206->174|206->174|207->175|208->176|208->176|209->177|209->177|209->177|210->178|211->179|211->179|213->181|213->181|213->181|215->183|215->183|215->183|216->184|217->185|217->185|219->187|219->187|219->187|220->188|221->189|221->189|224->192|224->192|225->193|228->196|228->196|229->197|231->199|231->199|233->201|236->204|236->204|237->205|239->207|239->207|241->209|241->209|241->209|242->210|248->216|248->216|249->217|250->218|250->218|252->220|253->221|253->221|255->223|267->235|267->235|267->235|275->243|275->243|275->243|277->245|277->245|277->245|278->246|278->246|278->246|278->246|279->247|280->248|280->248|280->248|280->248|281->249|281->249|281->249|283->251|283->251|283->251|285->253|285->253|285->253|286->254|286->254|286->254|286->254|289->257|289->257|289->257|290->258|290->258|290->258|291->259|291->259|291->259|291->259|292->260|292->260|292->260|294->262|295->263|315->283|315->283|320->288|336->304|336->304|336->304|337->305|337->305|337->305|339->307|339->307|340->308|344->312|344->312|346->314|346->314|347->315|348->316|348->316|350->318|350->318|351->319|352->320|352->320|354->322|354->322|355->323|356->324|356->324|357->325|357->325|358->326|358->326
                  -- GENERATED --
              */
          