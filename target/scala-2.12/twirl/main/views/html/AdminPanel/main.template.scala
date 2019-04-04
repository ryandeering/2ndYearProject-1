
package views.html.AdminPanel

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
        <link rel="icon" type="image/png" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("images/favicon.png")),format.raw/*8.95*/("""">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
                .footer """),format.raw/*13.25*/("""{"""),format.raw/*13.26*/("""
                    """),format.raw/*14.21*/("""position: fixed;
                    left: 0;
                    bottom: 0;
                    width: 100%;
                    background-color: red;
                    color: white;
                    text-align: center;"""),format.raw/*20.40*/("""}"""),format.raw/*20.41*/("""
                """),format.raw/*21.17*/(""".sidecol """),format.raw/*21.26*/("""{"""),format.raw/*21.27*/(""" """),format.raw/*21.28*/("""font-weight: bold; background-color: steelblue; """),format.raw/*21.76*/("""}"""),format.raw/*21.77*/("""
                """),format.raw/*22.17*/(""".sidecol h2 """),format.raw/*22.29*/("""{"""),format.raw/*22.30*/(""" """),format.raw/*22.31*/("""font-weight: bold; """),format.raw/*22.50*/("""}"""),format.raw/*22.51*/("""
                """),format.raw/*23.17*/(""".midcol h1 """),format.raw/*23.28*/("""{"""),format.raw/*23.29*/(""" """),format.raw/*23.30*/("""margin-top: 2em; text-align: center; font-weight: bold; """),format.raw/*23.86*/("""}"""),format.raw/*23.87*/("""
                """),format.raw/*24.17*/(""".midcol h3 """),format.raw/*24.28*/("""{"""),format.raw/*24.29*/(""" """),format.raw/*24.30*/("""text-align: center; color: steelblue; """),format.raw/*24.68*/("""}"""),format.raw/*24.69*/("""
                """),format.raw/*25.17*/(""".redtext """),format.raw/*25.26*/("""{"""),format.raw/*25.27*/(""" """),format.raw/*25.28*/("""color: red; """),format.raw/*25.40*/("""}"""),format.raw/*25.41*/("""

                """),format.raw/*27.17*/(""".navbar """),format.raw/*27.25*/("""{"""),format.raw/*27.26*/("""background-color: #2D2D2D; color: #A5A5A5 background-color: #2D2D2D; color: #A5A5A5; """),format.raw/*27.111*/("""}"""),format.raw/*27.112*/("""
                """),format.raw/*28.17*/(""".sidecol """),format.raw/*28.26*/("""{"""),format.raw/*28.27*/("""background-color: #2D2D2D; color: #A5A5A5; """),format.raw/*28.70*/("""}"""),format.raw/*28.71*/("""
                """),format.raw/*29.17*/(""".footer """),format.raw/*29.25*/("""{"""),format.raw/*29.26*/("""background-color: #2D2D2D; color: #A5A5A5; """),format.raw/*29.69*/("""}"""),format.raw/*29.70*/("""
                """),format.raw/*30.17*/(""".sidebar """),format.raw/*30.26*/("""{"""),format.raw/*30.27*/(""" """),format.raw/*30.28*/("""width: 33%; float: right;"""),format.raw/*30.53*/("""}"""),format.raw/*30.54*/("""
                """),format.raw/*31.17*/(""".dropdown """),format.raw/*31.27*/("""{"""),format.raw/*31.28*/("""  """),format.raw/*31.30*/("""}"""),format.raw/*31.31*/("""
                """),format.raw/*32.17*/(""".navbar-right"""),format.raw/*32.30*/("""{"""),format.raw/*32.31*/("""  """),format.raw/*32.33*/("""}"""),format.raw/*32.34*/("""
                """),format.raw/*33.17*/(""".headerImg """),format.raw/*33.28*/("""{"""),format.raw/*33.29*/(""" """),format.raw/*33.30*/("""width: 100%; text-align: center; """),format.raw/*33.63*/("""}"""),format.raw/*33.64*/("""





                """),format.raw/*39.17*/("""@charset "UTF-8";
                /*
                $content-width will be the max width of the content within the navigation bar.
                $breakpoint determines at which width the media query breakpoint will take effect.
                */

                body """),format.raw/*45.22*/("""{"""),format.raw/*45.23*/("""
                    """),format.raw/*46.21*/("""background-color: ;
                """),format.raw/*47.17*/("""}"""),format.raw/*47.18*/("""
                """),format.raw/*48.17*/("""nav """),format.raw/*48.21*/("""{"""),format.raw/*48.22*/("""
                    """),format.raw/*49.21*/("""float: right;
                """),format.raw/*50.17*/("""}"""),format.raw/*50.18*/("""
                """),format.raw/*51.17*/("""nav ul """),format.raw/*51.24*/("""{"""),format.raw/*51.25*/("""
                    """),format.raw/*52.21*/("""list-style: none;
                    margin: 0;
                    padding: 0;
                    padding-top: 0.4em;
                    padding-bottom:0.4em;

                """),format.raw/*58.17*/("""}"""),format.raw/*58.18*/("""
                """),format.raw/*59.17*/("""nav ul li """),format.raw/*59.27*/("""{"""),format.raw/*59.28*/("""
                    """),format.raw/*60.21*/("""float: left;
                    position: relative;
                """),format.raw/*62.17*/("""}"""),format.raw/*62.18*/("""
                """),format.raw/*63.17*/("""nav ul li a """),format.raw/*63.29*/("""{"""),format.raw/*63.30*/("""
                    """),format.raw/*64.21*/("""display: block;
                    padding: 0 20px;
                    line-height: 70px;
                    background-color: #2D2D2D; color: #A5A5A5;
                    text-decoration: none;
                    /*
                    The full path of this code is nav ul li a:not(:only-child):after. This means that the code will apply to any a tag in our nav list that is NOT an only child, aka any dropdown. The :after means it comes after the output of the tag. I’ve decided that to specify any nav item as a dropdown, it will be followed by a unicode arrow – ▾ (#9662).
                    */
                """),format.raw/*72.17*/("""}"""),format.raw/*72.18*/("""
                """),format.raw/*73.17*/("""nav ul li a:hover """),format.raw/*73.35*/("""{"""),format.raw/*73.36*/("""
                    """),format.raw/*74.21*/("""background-color: #2D2D2D; color: #A5A5A5;
                """),format.raw/*75.17*/("""}"""),format.raw/*75.18*/("""
                """),format.raw/*76.17*/("""nav ul li a:not(:only-child):after """),format.raw/*76.52*/("""{"""),format.raw/*76.53*/("""
                    """),format.raw/*77.21*/("""padding-left: 4px;
                    content: ' ▾';
                """),format.raw/*79.17*/("""}"""),format.raw/*79.18*/("""
                """),format.raw/*80.17*/("""nav ul li ul li """),format.raw/*80.33*/("""{"""),format.raw/*80.34*/("""
                    """),format.raw/*81.21*/("""min-width: 190px;
                """),format.raw/*82.17*/("""}"""),format.raw/*82.18*/("""
                """),format.raw/*83.17*/("""nav ul li ul li a """),format.raw/*83.35*/("""{"""),format.raw/*83.36*/("""
                    """),format.raw/*84.21*/("""padding: 15px;
                    line-height: 20px;
                """),format.raw/*86.17*/("""}"""),format.raw/*86.18*/("""

                """),format.raw/*88.17*/(""".nav-dropdown """),format.raw/*88.31*/("""{"""),format.raw/*88.32*/("""
                    """),format.raw/*89.21*/("""position: absolute;
                    z-index: 1;
                    /* Guarantees that the dropdown will display on top of any content. */
                    box-shadow: 0 3px 12px rgba(0, 0, 0, 0.15);
                    display: none;
                """),format.raw/*94.17*/("""}"""),format.raw/*94.18*/("""

                """),format.raw/*96.17*/(""".nav-mobile """),format.raw/*96.29*/("""{"""),format.raw/*96.30*/("""
                    """),format.raw/*97.21*/("""display: none;
                    position: absolute;
                    top: 0;
                    right: 0;
                    background-color: #2D2D2D; color: #A5A5A5;
                    height: 70px;
                    width: 70px;
                """),format.raw/*104.17*/("""}"""),format.raw/*104.18*/("""

                """),format.raw/*106.17*/("""@media only screen and (max-width: 800px) """),format.raw/*106.60*/("""{"""),format.raw/*106.61*/("""

                """),format.raw/*108.17*/(""".brand"""),format.raw/*108.23*/("""{"""),format.raw/*108.24*/("""
                    """),format.raw/*109.21*/("""padding-top: 10px !important;
                    padding-left: 20px !important;
                    position: absolute !important;
                    float: left !important;
                    line-height: 70px !important;
                    text-transform: uppercase !important;
                    font-size: 1.4em !important;
                """),format.raw/*116.17*/("""}"""),format.raw/*116.18*/("""

                """),format.raw/*118.17*/(""".nav-mobile """),format.raw/*118.29*/("""{"""),format.raw/*118.30*/("""
                    """),format.raw/*119.21*/("""display: block;
                """),format.raw/*120.17*/("""}"""),format.raw/*120.18*/("""

                """),format.raw/*122.17*/("""nav """),format.raw/*122.21*/("""{"""),format.raw/*122.22*/("""
                    """),format.raw/*123.21*/("""background-color: #2D2D2D; color: #A5A5A5;
                    width: 100%;
                    padding: 70px 0 15px;
                """),format.raw/*126.17*/("""}"""),format.raw/*126.18*/("""
                """),format.raw/*127.17*/("""nav ul """),format.raw/*127.24*/("""{"""),format.raw/*127.25*/("""
                    """),format.raw/*128.21*/("""display: none;
                """),format.raw/*129.17*/("""}"""),format.raw/*129.18*/("""
                """),format.raw/*130.17*/("""nav ul li """),format.raw/*130.27*/("""{"""),format.raw/*130.28*/("""
                    """),format.raw/*131.21*/("""float: none;
                    padding-left: 2em;
                """),format.raw/*133.17*/("""}"""),format.raw/*133.18*/("""
                """),format.raw/*134.17*/("""nav ul li a """),format.raw/*134.29*/("""{"""),format.raw/*134.30*/("""
                    """),format.raw/*135.21*/("""padding: 15px;
                    line-height: 20px;
                """),format.raw/*137.17*/("""}"""),format.raw/*137.18*/("""
                """),format.raw/*138.17*/("""nav ul li ul li a """),format.raw/*138.35*/("""{"""),format.raw/*138.36*/("""
                    """),format.raw/*139.21*/("""padding-left: 30px;
                """),format.raw/*140.17*/("""}"""),format.raw/*140.18*/("""
                """),format.raw/*141.17*/("""}"""),format.raw/*141.18*/("""
                """),format.raw/*142.17*/("""#nav-toggle """),format.raw/*142.29*/("""{"""),format.raw/*142.30*/("""
                    """),format.raw/*143.21*/("""position: absolute;
                    left: 18px;
                    top: 22px;
                    cursor: pointer;
                    padding: 10px 35px 16px 0px;
                """),format.raw/*148.17*/("""}"""),format.raw/*148.18*/("""
                """),format.raw/*149.17*/("""#nav-toggle span,
                #nav-toggle span:before,
                #nav-toggle span:after """),format.raw/*151.40*/("""{"""),format.raw/*151.41*/("""
                    """),format.raw/*152.21*/("""cursor: pointer;
                    border-radius: 1px;
                    height: 5px;
                    width: 35px;
                    background: #463f3f;
                    position: absolute;
                    display: block;
                    content: '';
                    transition: all 300ms ease-in-out;
                """),format.raw/*161.17*/("""}"""),format.raw/*161.18*/("""
                """),format.raw/*162.17*/("""#nav-toggle span:before """),format.raw/*162.41*/("""{"""),format.raw/*162.42*/("""
                    """),format.raw/*163.21*/("""top: -10px;
                """),format.raw/*164.17*/("""}"""),format.raw/*164.18*/("""
                """),format.raw/*165.17*/("""#nav-toggle span:after """),format.raw/*165.40*/("""{"""),format.raw/*165.41*/("""
                    """),format.raw/*166.21*/("""bottom: -10px;
                """),format.raw/*167.17*/("""}"""),format.raw/*167.18*/("""
                """),format.raw/*168.17*/("""#nav-toggle.active span """),format.raw/*168.41*/("""{"""),format.raw/*168.42*/("""
                    """),format.raw/*169.21*/("""background-color: transparent;
                """),format.raw/*170.17*/("""}"""),format.raw/*170.18*/("""
                """),format.raw/*171.17*/("""#nav-toggle.active span:before, #nav-toggle.active span:after """),format.raw/*171.79*/("""{"""),format.raw/*171.80*/("""
                    """),format.raw/*172.21*/("""top: 0;
                """),format.raw/*173.17*/("""}"""),format.raw/*173.18*/("""
                """),format.raw/*174.17*/("""#nav-toggle.active span:before """),format.raw/*174.48*/("""{"""),format.raw/*174.49*/("""
                    """),format.raw/*175.21*/("""transform: rotate(45deg);
                """),format.raw/*176.17*/("""}"""),format.raw/*176.18*/("""
                """),format.raw/*177.17*/("""#nav-toggle.active span:after """),format.raw/*177.47*/("""{"""),format.raw/*177.48*/("""
                    """),format.raw/*178.21*/("""transform: rotate(-45deg);
                """),format.raw/*179.17*/("""}"""),format.raw/*179.18*/("""

                """),format.raw/*181.17*/("""@media screen and (min-width: 800px) """),format.raw/*181.55*/("""{"""),format.raw/*181.56*/("""

                """),format.raw/*183.17*/(""".brand"""),format.raw/*183.23*/("""{"""),format.raw/*183.24*/("""
                    """),format.raw/*184.21*/("""padding-top: 1px !important;
                """),format.raw/*185.17*/("""}"""),format.raw/*185.18*/("""

                """),format.raw/*187.17*/(""".nav-list """),format.raw/*187.27*/("""{"""),format.raw/*187.28*/("""
                    """),format.raw/*188.21*/("""display: block !important;
                """),format.raw/*189.17*/("""}"""),format.raw/*189.18*/("""


                """),format.raw/*192.17*/("""}"""),format.raw/*192.18*/("""
                """),format.raw/*193.17*/("""/*
                .navigation – the outer wrapper for the navbar. Specifies the height and color, and will stretch the full width of the viewport.
                */
                .navigation """),format.raw/*196.29*/("""{"""),format.raw/*196.30*/("""
                    """),format.raw/*197.21*/("""height: 62px;
                    background-color: #2D2D2D; color: #A5A5A5;
                """),format.raw/*199.17*/("""}"""),format.raw/*199.18*/("""

                """),format.raw/*201.17*/("""/*
                .nav-container – the inner wrapper for the navbar. Defines how far the actual content should stretch.
                */
                .nav-container """),format.raw/*204.32*/("""{"""),format.raw/*204.33*/("""
                    """),format.raw/*205.21*/("""max-width: 1000px;
                    margin: 0 auto;
                """),format.raw/*207.17*/("""}"""),format.raw/*207.18*/("""

                """),format.raw/*209.17*/(""".brand """),format.raw/*209.24*/("""{"""),format.raw/*209.25*/("""
                    """),format.raw/*210.21*/("""position: relative;
                    overflow: auto;
                    float: left;
                    line-height: 70px;
                    text-transform: uppercase;
                    font-size: 1.4em;
                """),format.raw/*216.17*/("""}"""),format.raw/*216.18*/("""
                """),format.raw/*217.17*/(""".brand a,
                .brand a:visited """),format.raw/*218.34*/("""{"""),format.raw/*218.35*/("""

                    """),format.raw/*220.21*/("""text-decoration: none;
                """),format.raw/*221.17*/("""}"""),format.raw/*221.18*/("""

        """),format.raw/*223.9*/("""</style>
        <title>CDR Games</title>
    </head>
    <body>


            <!--
    Following Tania Ruscia's tutorial on creating your own responsive dropdown navigation bar. https://www.taniarascia.com/responsive-dropdown-navigation-bar/
    -->
        <section class="navigation">
            <div class="nav-container">
                <div class="brand">
                    <a href='"""),_display_(/*235.31*/routes/*235.37*/.ProductCtrl.listProducts(0)),format.raw/*235.65*/("""'><img src="/assets/images/logo.png" width='60px' height='60px' alt="logo"></a>
                </div>
                <nav>
                    <div class="nav-mobile">
                        <a id="nav-toggle" href="#!"><span></span></a>
                    </div>

                    <ul class="nav navbar-nav navbar-right">
                    """),_display_(/*243.22*/if(user != null)/*243.38*/ {_display_(Seq[Any](format.raw/*243.40*/("""

                        """),_display_(/*245.26*/if(user.isInstanceOf[models.users.Admin])/*245.67*/{_display_(Seq[Any](format.raw/*245.68*/("""
                            """),format.raw/*246.29*/("""<li><a href=""""),_display_(/*246.43*/routes/*246.49*/.AdminProductCtrl.adminPanel()),format.raw/*246.79*/(""""><span class="glyphicon glyphicon-cog"></span> Admin Panel</a></li>
                        """)))}),format.raw/*247.26*/("""
                        """),format.raw/*248.25*/("""<li><a href=""""),_display_(/*248.39*/routes/*248.45*/.ShoppingCtrl.showBasket()),format.raw/*248.71*/(""""><span class="glyphicon glyphicon-shopping-cart"></span> Basket</a></li>
                        <li><a href=""""),_display_(/*249.39*/routes/*249.45*/.ShoppingCtrl.viewOrders()),format.raw/*249.71*/(""""><span class="glyphicon glyphicon-log-in"></span> View Orders</a></li>

                        <li><a href=""""),_display_(/*251.39*/routes/*251.45*/.HomeController.profile()),format.raw/*251.70*/("""">
                            <i class="fa fa-user-circle-o"></i>
                            """),_display_(/*253.30*/if(user!=null)/*253.44*/{_display_(Seq[Any](format.raw/*253.45*/("""
                                """),_display_(/*254.34*/user/*254.38*/.getEmail)))}),format.raw/*254.48*/(""" """),format.raw/*254.49*/("""</span>

                        </a></li>
                        <li><a href=""""),_display_(/*257.39*/routes/*257.45*/.LoginController.logout()),format.raw/*257.70*/(""""><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
                    """)))}/*258.23*/else/*258.28*/{_display_(Seq[Any](format.raw/*258.29*/("""
                        """),format.raw/*259.25*/("""<li><a href=""""),_display_(/*259.39*/routes/*259.45*/.HomeController.registerUser()),format.raw/*259.75*/(""""><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                        <li><a href=""""),_display_(/*260.39*/routes/*260.45*/.LoginController.login()),format.raw/*260.69*/(""""><span class="glyphicon glyphicon-log-in"></span> Login</a></li>

                    """)))}),format.raw/*262.22*/("""
                    """),format.raw/*263.21*/("""</ul></li>


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


                                    """),_display_(/*283.38*/content),format.raw/*283.45*/("""




                                """),format.raw/*288.33*/("""</div>
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
        (function($) """),format.raw/*304.22*/("""{"""),format.raw/*304.23*/(""" """),format.raw/*304.24*/("""// Begin jQuery
            $(function() """),format.raw/*305.26*/("""{"""),format.raw/*305.27*/(""" """),format.raw/*305.28*/("""// DOM ready
                // If a link has a dropdown, add sub menu toggle.
                $('nav ul li a:not(:only-child)').click(function(e) """),format.raw/*307.69*/("""{"""),format.raw/*307.70*/("""
                    """),format.raw/*308.21*/("""$(this).siblings('.nav-dropdown').toggle();
                    // Close one dropdown when selecting another
                    $('.nav-dropdown').not($(this).siblings()).hide();
                    e.stopPropagation();
                """),format.raw/*312.17*/("""}"""),format.raw/*312.18*/(""");
                // Clicking away from dropdown will remove the dropdown class
                $('html').click(function() """),format.raw/*314.44*/("""{"""),format.raw/*314.45*/("""
                    """),format.raw/*315.21*/("""$('.nav-dropdown').hide();
                """),format.raw/*316.17*/("""}"""),format.raw/*316.18*/(""");
                // Toggle open and close nav styles on click
                $('#nav-toggle').click(function() """),format.raw/*318.51*/("""{"""),format.raw/*318.52*/("""
                    """),format.raw/*319.21*/("""$('nav ul').slideToggle();
                """),format.raw/*320.17*/("""}"""),format.raw/*320.18*/(""");
                // Hamburger to X toggle
                $('#nav-toggle').on('click', function() """),format.raw/*322.57*/("""{"""),format.raw/*322.58*/("""
                    """),format.raw/*323.21*/("""this.classList.toggle('active');
                """),format.raw/*324.17*/("""}"""),format.raw/*324.18*/(""");
            """),format.raw/*325.13*/("""}"""),format.raw/*325.14*/("""); // end DOM ready
        """),format.raw/*326.9*/("""}"""),format.raw/*326.10*/(""")(jQuery); // end jQuery
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
                  DATE: Thu Apr 04 11:05:27 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/app/views/AdminPanel/main.scala.html
                  HASH: 944e6728bfc7a340ab4da03068c2ad325b34a924
                  MATRIX: 662->1|1000->28|1139->72|1167->74|1485->366|1499->372|1558->411|1954->779|1983->780|2033->802|2293->1034|2322->1035|2368->1053|2405->1062|2434->1063|2463->1064|2539->1112|2568->1113|2614->1131|2654->1143|2683->1144|2712->1145|2759->1164|2788->1165|2834->1183|2873->1194|2902->1195|2931->1196|3015->1252|3044->1253|3090->1271|3129->1282|3158->1283|3187->1284|3253->1322|3282->1323|3328->1341|3365->1350|3394->1351|3423->1352|3463->1364|3492->1365|3540->1385|3576->1393|3605->1394|3719->1479|3749->1480|3795->1498|3832->1507|3861->1508|3932->1551|3961->1552|4007->1570|4043->1578|4072->1579|4143->1622|4172->1623|4218->1641|4255->1650|4284->1651|4313->1652|4366->1677|4395->1678|4441->1696|4479->1706|4508->1707|4538->1709|4567->1710|4613->1728|4654->1741|4683->1742|4713->1744|4742->1745|4788->1763|4827->1774|4856->1775|4885->1776|4946->1809|4975->1810|5031->1838|5337->2117|5366->2118|5416->2140|5481->2177|5510->2178|5556->2196|5588->2200|5617->2201|5667->2223|5726->2254|5755->2255|5801->2273|5836->2280|5865->2281|5915->2303|6129->2489|6158->2490|6204->2508|6242->2518|6271->2519|6321->2541|6420->2612|6449->2613|6495->2631|6535->2643|6564->2644|6614->2666|7270->3294|7299->3295|7345->3313|7391->3331|7420->3332|7470->3354|7558->3414|7587->3415|7633->3433|7696->3468|7725->3469|7775->3491|7875->3563|7904->3564|7950->3582|7994->3598|8023->3599|8073->3621|8136->3656|8165->3657|8211->3675|8257->3693|8286->3694|8336->3716|8436->3788|8465->3789|8513->3809|8555->3823|8584->3824|8634->3846|8925->4109|8954->4110|9002->4130|9042->4142|9071->4143|9121->4165|9416->4431|9446->4432|9495->4452|9566->4495|9596->4496|9645->4516|9680->4522|9710->4523|9761->4545|10146->4901|10176->4902|10225->4922|10266->4934|10296->4935|10347->4957|10409->4990|10439->4991|10488->5011|10521->5015|10551->5016|10602->5038|10768->5175|10798->5176|10845->5194|10881->5201|10911->5202|10962->5224|11023->5256|11053->5257|11100->5275|11139->5285|11169->5286|11220->5308|11319->5378|11349->5379|11396->5397|11437->5409|11467->5410|11518->5432|11619->5504|11649->5505|11696->5523|11743->5541|11773->5542|11824->5564|11890->5601|11920->5602|11967->5620|11997->5621|12044->5639|12085->5651|12115->5652|12166->5674|12385->5864|12415->5865|12462->5883|12591->5983|12621->5984|12672->6006|13054->6359|13084->6360|13131->6378|13184->6402|13214->6403|13265->6425|13323->6454|13353->6455|13400->6473|13452->6496|13482->6497|13533->6519|13594->6551|13624->6552|13671->6570|13724->6594|13754->6595|13805->6617|13882->6665|13912->6666|13959->6684|14050->6746|14080->6747|14131->6769|14185->6794|14215->6795|14262->6813|14322->6844|14352->6845|14403->6867|14475->6910|14505->6911|14552->6929|14611->6959|14641->6960|14692->6982|14765->7026|14795->7027|14844->7047|14910->7085|14940->7086|14989->7106|15024->7112|15054->7113|15105->7135|15180->7181|15210->7182|15259->7202|15298->7212|15328->7213|15379->7235|15452->7279|15482->7280|15533->7302|15563->7303|15610->7321|15837->7519|15867->7520|15918->7542|16042->7637|16072->7638|16121->7658|16324->7832|16354->7833|16405->7855|16507->7928|16537->7929|16586->7949|16622->7956|16652->7957|16703->7979|16967->8214|16997->8215|17044->8233|17117->8277|17147->8278|17200->8302|17269->8342|17299->8343|17339->8355|17773->8761|17789->8767|17839->8795|18226->9154|18252->9170|18293->9172|18350->9201|18401->9242|18441->9243|18500->9273|18542->9287|18558->9293|18610->9323|18737->9418|18792->9444|18834->9458|18850->9464|18898->9490|19039->9603|19055->9609|19103->9635|19244->9748|19260->9754|19307->9779|19433->9877|19457->9891|19497->9892|19560->9927|19574->9931|19609->9941|19639->9942|19751->10026|19767->10032|19814->10057|19923->10147|19937->10152|19977->10153|20032->10179|20074->10193|20090->10199|20142->10229|20275->10334|20291->10340|20337->10364|20459->10454|20510->10476|21127->11065|21156->11072|21227->11114|21568->11426|21598->11427|21628->11428|21699->11470|21729->11471|21759->11472|21937->11621|21967->11622|22018->11644|22288->11885|22318->11886|22473->12012|22503->12013|22554->12035|22627->12079|22657->12080|22802->12196|22832->12197|22883->12219|22956->12263|22986->12264|23117->12366|23147->12367|23198->12389|23277->12439|23307->12440|23352->12456|23382->12457|23439->12486|23469->12487
                  LINES: 24->1|29->2|34->2|35->3|40->8|40->8|40->8|45->13|45->13|46->14|52->20|52->20|53->21|53->21|53->21|53->21|53->21|53->21|54->22|54->22|54->22|54->22|54->22|54->22|55->23|55->23|55->23|55->23|55->23|55->23|56->24|56->24|56->24|56->24|56->24|56->24|57->25|57->25|57->25|57->25|57->25|57->25|59->27|59->27|59->27|59->27|59->27|60->28|60->28|60->28|60->28|60->28|61->29|61->29|61->29|61->29|61->29|62->30|62->30|62->30|62->30|62->30|62->30|63->31|63->31|63->31|63->31|63->31|64->32|64->32|64->32|64->32|64->32|65->33|65->33|65->33|65->33|65->33|65->33|71->39|77->45|77->45|78->46|79->47|79->47|80->48|80->48|80->48|81->49|82->50|82->50|83->51|83->51|83->51|84->52|90->58|90->58|91->59|91->59|91->59|92->60|94->62|94->62|95->63|95->63|95->63|96->64|104->72|104->72|105->73|105->73|105->73|106->74|107->75|107->75|108->76|108->76|108->76|109->77|111->79|111->79|112->80|112->80|112->80|113->81|114->82|114->82|115->83|115->83|115->83|116->84|118->86|118->86|120->88|120->88|120->88|121->89|126->94|126->94|128->96|128->96|128->96|129->97|136->104|136->104|138->106|138->106|138->106|140->108|140->108|140->108|141->109|148->116|148->116|150->118|150->118|150->118|151->119|152->120|152->120|154->122|154->122|154->122|155->123|158->126|158->126|159->127|159->127|159->127|160->128|161->129|161->129|162->130|162->130|162->130|163->131|165->133|165->133|166->134|166->134|166->134|167->135|169->137|169->137|170->138|170->138|170->138|171->139|172->140|172->140|173->141|173->141|174->142|174->142|174->142|175->143|180->148|180->148|181->149|183->151|183->151|184->152|193->161|193->161|194->162|194->162|194->162|195->163|196->164|196->164|197->165|197->165|197->165|198->166|199->167|199->167|200->168|200->168|200->168|201->169|202->170|202->170|203->171|203->171|203->171|204->172|205->173|205->173|206->174|206->174|206->174|207->175|208->176|208->176|209->177|209->177|209->177|210->178|211->179|211->179|213->181|213->181|213->181|215->183|215->183|215->183|216->184|217->185|217->185|219->187|219->187|219->187|220->188|221->189|221->189|224->192|224->192|225->193|228->196|228->196|229->197|231->199|231->199|233->201|236->204|236->204|237->205|239->207|239->207|241->209|241->209|241->209|242->210|248->216|248->216|249->217|250->218|250->218|252->220|253->221|253->221|255->223|267->235|267->235|267->235|275->243|275->243|275->243|277->245|277->245|277->245|278->246|278->246|278->246|278->246|279->247|280->248|280->248|280->248|280->248|281->249|281->249|281->249|283->251|283->251|283->251|285->253|285->253|285->253|286->254|286->254|286->254|286->254|289->257|289->257|289->257|290->258|290->258|290->258|291->259|291->259|291->259|291->259|292->260|292->260|292->260|294->262|295->263|315->283|315->283|320->288|336->304|336->304|336->304|337->305|337->305|337->305|339->307|339->307|340->308|344->312|344->312|346->314|346->314|347->315|348->316|348->316|350->318|350->318|351->319|352->320|352->320|354->322|354->322|355->323|356->324|356->324|357->325|357->325|358->326|358->326
                  -- GENERATED --
              */
          