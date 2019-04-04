
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


Seq[Any](format.raw/*3.1*/("""<html>
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
                  DATE: Thu Apr 04 21:01:49 IST 2019
                  SOURCE: /home/ryan/Downloads/aa/2ndYearProject/app/views/AdminPanel/main.scala.html
                  HASH: f519503a108510a6cfdedb68e5803228a2e3bf3a
                  MATRIX: 662->1|1000->27|1138->72|1451->359|1465->365|1524->404|1915->767|1944->768|1993->789|2247->1015|2276->1016|2321->1033|2358->1042|2387->1043|2416->1044|2492->1092|2521->1093|2566->1110|2606->1122|2635->1123|2664->1124|2711->1143|2740->1144|2785->1161|2824->1172|2853->1173|2882->1174|2966->1230|2995->1231|3040->1248|3079->1259|3108->1260|3137->1261|3203->1299|3232->1300|3277->1317|3314->1326|3343->1327|3372->1328|3412->1340|3441->1341|3487->1359|3523->1367|3552->1368|3666->1453|3696->1454|3741->1471|3778->1480|3807->1481|3878->1524|3907->1525|3952->1542|3988->1550|4017->1551|4088->1594|4117->1595|4162->1612|4199->1621|4228->1622|4257->1623|4310->1648|4339->1649|4384->1666|4422->1676|4451->1677|4481->1679|4510->1680|4555->1697|4596->1710|4625->1711|4655->1713|4684->1714|4729->1731|4768->1742|4797->1743|4826->1744|4887->1777|4916->1778|4966->1800|5266->2073|5295->2074|5344->2095|5408->2131|5437->2132|5482->2149|5514->2153|5543->2154|5592->2175|5650->2205|5679->2206|5724->2223|5759->2230|5788->2231|5837->2252|6045->2432|6074->2433|6119->2450|6157->2460|6186->2461|6235->2482|6332->2551|6361->2552|6406->2569|6446->2581|6475->2582|6524->2603|7172->3223|7201->3224|7246->3241|7292->3259|7321->3260|7370->3281|7457->3340|7486->3341|7531->3358|7594->3393|7623->3394|7672->3415|7770->3485|7799->3486|7844->3503|7888->3519|7917->3520|7966->3541|8028->3575|8057->3576|8102->3593|8148->3611|8177->3612|8226->3633|8324->3703|8353->3704|8399->3722|8441->3736|8470->3737|8519->3758|8805->4016|8834->4017|8880->4035|8920->4047|8949->4048|8998->4069|9286->4328|9316->4329|9363->4347|9434->4390|9464->4391|9511->4409|9546->4415|9576->4416|9626->4437|10004->4786|10034->4787|10081->4805|10122->4817|10152->4818|10202->4839|10263->4871|10293->4872|10340->4890|10373->4894|10403->4895|10453->4916|10616->5050|10646->5051|10692->5068|10728->5075|10758->5076|10808->5097|10868->5128|10898->5129|10944->5146|10983->5156|11013->5157|11063->5178|11160->5246|11190->5247|11236->5264|11277->5276|11307->5277|11357->5298|11456->5368|11486->5369|11532->5386|11579->5404|11609->5405|11659->5426|11724->5462|11754->5463|11800->5480|11830->5481|11876->5498|11917->5510|11947->5511|11997->5532|12211->5717|12241->5718|12287->5735|12414->5833|12444->5834|12494->5855|12867->6199|12897->6200|12943->6217|12996->6241|13026->6242|13076->6263|13133->6291|13163->6292|13209->6309|13261->6332|13291->6333|13341->6354|13401->6385|13431->6386|13477->6403|13530->6427|13560->6428|13610->6449|13686->6496|13716->6497|13762->6514|13853->6576|13883->6577|13933->6598|13986->6622|14016->6623|14062->6640|14122->6671|14152->6672|14202->6693|14273->6735|14303->6736|14349->6753|14408->6783|14438->6784|14488->6805|14560->6848|14590->6849|14637->6867|14703->6905|14733->6906|14780->6924|14815->6930|14845->6931|14895->6952|14969->6997|14999->6998|15046->7016|15085->7026|15115->7027|15165->7048|15237->7091|15267->7092|15315->7111|15345->7112|15391->7129|15615->7324|15645->7325|15695->7346|15817->7439|15847->7440|15894->7458|16094->7629|16124->7630|16174->7651|16274->7722|16304->7723|16351->7741|16387->7748|16417->7749|16467->7770|16725->7999|16755->8000|16801->8017|16873->8060|16903->8061|16954->8083|17022->8122|17052->8123|17090->8133|17512->8527|17528->8533|17578->8561|17957->8912|17983->8928|18024->8930|18079->8957|18130->8998|18170->8999|18228->9028|18270->9042|18286->9048|18338->9078|18464->9172|18518->9197|18560->9211|18576->9217|18624->9243|18764->9355|18780->9361|18828->9387|18967->9498|18983->9504|19030->9529|19154->9625|19178->9639|19218->9640|19280->9674|19294->9678|19329->9688|19359->9689|19468->9770|19484->9776|19531->9801|19639->9890|19653->9895|19693->9896|19747->9921|19789->9935|19805->9941|19857->9971|19989->10075|20005->10081|20051->10105|20171->10193|20221->10214|20818->10783|20847->10790|20913->10827|21238->11123|21268->11124|21298->11125|21368->11166|21398->11167|21428->11168|21604->11315|21634->11316|21684->11337|21950->11574|21980->11575|22133->11699|22163->11700|22213->11721|22285->11764|22315->11765|22458->11879|22488->11880|22538->11901|22610->11944|22640->11945|22769->12045|22799->12046|22849->12067|22927->12116|22957->12117|23001->12132|23031->12133|23087->12161|23117->12162
                  LINES: 24->1|29->2|34->3|39->8|39->8|39->8|44->13|44->13|45->14|51->20|51->20|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|56->25|56->25|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|63->32|63->32|63->32|63->32|63->32|64->33|64->33|64->33|64->33|64->33|64->33|70->39|76->45|76->45|77->46|78->47|78->47|79->48|79->48|79->48|80->49|81->50|81->50|82->51|82->51|82->51|83->52|89->58|89->58|90->59|90->59|90->59|91->60|93->62|93->62|94->63|94->63|94->63|95->64|103->72|103->72|104->73|104->73|104->73|105->74|106->75|106->75|107->76|107->76|107->76|108->77|110->79|110->79|111->80|111->80|111->80|112->81|113->82|113->82|114->83|114->83|114->83|115->84|117->86|117->86|119->88|119->88|119->88|120->89|125->94|125->94|127->96|127->96|127->96|128->97|135->104|135->104|137->106|137->106|137->106|139->108|139->108|139->108|140->109|147->116|147->116|149->118|149->118|149->118|150->119|151->120|151->120|153->122|153->122|153->122|154->123|157->126|157->126|158->127|158->127|158->127|159->128|160->129|160->129|161->130|161->130|161->130|162->131|164->133|164->133|165->134|165->134|165->134|166->135|168->137|168->137|169->138|169->138|169->138|170->139|171->140|171->140|172->141|172->141|173->142|173->142|173->142|174->143|179->148|179->148|180->149|182->151|182->151|183->152|192->161|192->161|193->162|193->162|193->162|194->163|195->164|195->164|196->165|196->165|196->165|197->166|198->167|198->167|199->168|199->168|199->168|200->169|201->170|201->170|202->171|202->171|202->171|203->172|204->173|204->173|205->174|205->174|205->174|206->175|207->176|207->176|208->177|208->177|208->177|209->178|210->179|210->179|212->181|212->181|212->181|214->183|214->183|214->183|215->184|216->185|216->185|218->187|218->187|218->187|219->188|220->189|220->189|223->192|223->192|224->193|227->196|227->196|228->197|230->199|230->199|232->201|235->204|235->204|236->205|238->207|238->207|240->209|240->209|240->209|241->210|247->216|247->216|248->217|249->218|249->218|251->220|252->221|252->221|254->223|266->235|266->235|266->235|274->243|274->243|274->243|276->245|276->245|276->245|277->246|277->246|277->246|277->246|278->247|279->248|279->248|279->248|279->248|280->249|280->249|280->249|282->251|282->251|282->251|284->253|284->253|284->253|285->254|285->254|285->254|285->254|288->257|288->257|288->257|289->258|289->258|289->258|290->259|290->259|290->259|290->259|291->260|291->260|291->260|293->262|294->263|314->283|314->283|319->288|335->304|335->304|335->304|336->305|336->305|336->305|338->307|338->307|339->308|343->312|343->312|345->314|345->314|346->315|347->316|347->316|349->318|349->318|350->319|351->320|351->320|353->322|353->322|354->323|355->324|355->324|356->325|356->325|357->326|357->326
                  -- GENERATED --
              */
          