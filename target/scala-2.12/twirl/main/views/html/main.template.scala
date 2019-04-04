
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
        <link rel="icon" type="image/png" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("images/favicon.png")),format.raw/*8.95*/("""">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
        .footer """),format.raw/*13.17*/("""{"""),format.raw/*13.18*/("""
            """),format.raw/*14.13*/("""position: fixed;
            left: 0;
            bottom: 0;
            width: 100%;
            background-color: red;
            color: white;
            text-align: center;"""),format.raw/*20.32*/("""}"""),format.raw/*20.33*/("""
        """),format.raw/*21.9*/(""".sidecol """),format.raw/*21.18*/("""{"""),format.raw/*21.19*/(""" """),format.raw/*21.20*/("""font-weight: bold; background-color: steelblue; """),format.raw/*21.68*/("""}"""),format.raw/*21.69*/("""
        """),format.raw/*22.9*/(""".sidecol h2 """),format.raw/*22.21*/("""{"""),format.raw/*22.22*/(""" """),format.raw/*22.23*/("""font-weight: bold; """),format.raw/*22.42*/("""}"""),format.raw/*22.43*/("""
        """),format.raw/*23.9*/(""".midcol h1 """),format.raw/*23.20*/("""{"""),format.raw/*23.21*/(""" """),format.raw/*23.22*/("""margin-top: 2em; text-align: center; font-weight: bold; """),format.raw/*23.78*/("""}"""),format.raw/*23.79*/("""
        """),format.raw/*24.9*/(""".midcol h3 """),format.raw/*24.20*/("""{"""),format.raw/*24.21*/(""" """),format.raw/*24.22*/("""text-align: center; color: steelblue; """),format.raw/*24.60*/("""}"""),format.raw/*24.61*/("""
        """),format.raw/*25.9*/(""".redtext """),format.raw/*25.18*/("""{"""),format.raw/*25.19*/(""" """),format.raw/*25.20*/("""color: red; """),format.raw/*25.32*/("""}"""),format.raw/*25.33*/("""

        """),format.raw/*27.9*/(""".navbar """),format.raw/*27.17*/("""{"""),format.raw/*27.18*/("""background-color: #2D2D2D; color: #A5A5A5 background-color: #2D2D2D; color: #A5A5A5; """),format.raw/*27.103*/("""}"""),format.raw/*27.104*/("""
        """),format.raw/*28.9*/(""".sidecol """),format.raw/*28.18*/("""{"""),format.raw/*28.19*/("""background-color: #2D2D2D; color: #A5A5A5; """),format.raw/*28.62*/("""}"""),format.raw/*28.63*/("""
        """),format.raw/*29.9*/(""".footer """),format.raw/*29.17*/("""{"""),format.raw/*29.18*/("""background-color: #2D2D2D; color: #A5A5A5; """),format.raw/*29.61*/("""}"""),format.raw/*29.62*/("""
        """),format.raw/*30.9*/(""".sidebar """),format.raw/*30.18*/("""{"""),format.raw/*30.19*/(""" """),format.raw/*30.20*/("""width: 33%; float: right;"""),format.raw/*30.45*/("""}"""),format.raw/*30.46*/("""
        """),format.raw/*31.9*/(""".dropdown """),format.raw/*31.19*/("""{"""),format.raw/*31.20*/("""  """),format.raw/*31.22*/("""}"""),format.raw/*31.23*/("""
        """),format.raw/*32.9*/(""".navbar-right"""),format.raw/*32.22*/("""{"""),format.raw/*32.23*/("""  """),format.raw/*32.25*/("""}"""),format.raw/*32.26*/("""
        """),format.raw/*33.9*/(""".headerImg """),format.raw/*33.20*/("""{"""),format.raw/*33.21*/(""" """),format.raw/*33.22*/("""width: 100%; text-align: center; """),format.raw/*33.55*/("""}"""),format.raw/*33.56*/("""





        """),format.raw/*39.9*/("""@charset "UTF-8";
        /*
        $content-width will be the max width of the content within the navigation bar.
        $breakpoint determines at which width the media query breakpoint will take effect.
        */

        body """),format.raw/*45.14*/("""{"""),format.raw/*45.15*/("""
            """),format.raw/*46.13*/("""background-color: ;
        """),format.raw/*47.9*/("""}"""),format.raw/*47.10*/("""
        """),format.raw/*48.9*/("""nav """),format.raw/*48.13*/("""{"""),format.raw/*48.14*/("""
            """),format.raw/*49.13*/("""float: right;
        """),format.raw/*50.9*/("""}"""),format.raw/*50.10*/("""
        """),format.raw/*51.9*/("""nav ul """),format.raw/*51.16*/("""{"""),format.raw/*51.17*/("""
            """),format.raw/*52.13*/("""list-style: none;
            margin: 0;
            padding: 0;
            padding-top: 0.4em;
            padding-bottom:0.4em;

        """),format.raw/*58.9*/("""}"""),format.raw/*58.10*/("""
        """),format.raw/*59.9*/("""nav ul li """),format.raw/*59.19*/("""{"""),format.raw/*59.20*/("""
            """),format.raw/*60.13*/("""float: left;
            position: relative;
        """),format.raw/*62.9*/("""}"""),format.raw/*62.10*/("""
        """),format.raw/*63.9*/("""nav ul li a """),format.raw/*63.21*/("""{"""),format.raw/*63.22*/("""
            """),format.raw/*64.13*/("""display: block;
            padding: 0 20px;
            line-height: 70px;
            background-color: #2D2D2D; color: #A5A5A5;
            text-decoration: none;
            /*
            The full path of this code is nav ul li a:not(:only-child):after. This means that the code will apply to any a tag in our nav list that is NOT an only child, aka any dropdown. The :after means it comes after the output of the tag. I’ve decided that to specify any nav item as a dropdown, it will be followed by a unicode arrow – ▾ (#9662).
            */
        """),format.raw/*72.9*/("""}"""),format.raw/*72.10*/("""
        """),format.raw/*73.9*/("""nav ul li a:hover """),format.raw/*73.27*/("""{"""),format.raw/*73.28*/("""
            """),format.raw/*74.13*/("""background-color: #2D2D2D; color: #A5A5A5;
        """),format.raw/*75.9*/("""}"""),format.raw/*75.10*/("""
        """),format.raw/*76.9*/("""nav ul li a:not(:only-child):after """),format.raw/*76.44*/("""{"""),format.raw/*76.45*/("""
            """),format.raw/*77.13*/("""padding-left: 4px;
            content: ' ▾';
        """),format.raw/*79.9*/("""}"""),format.raw/*79.10*/("""
        """),format.raw/*80.9*/("""nav ul li ul li """),format.raw/*80.25*/("""{"""),format.raw/*80.26*/("""
            """),format.raw/*81.13*/("""min-width: 190px;
        """),format.raw/*82.9*/("""}"""),format.raw/*82.10*/("""
        """),format.raw/*83.9*/("""nav ul li ul li a """),format.raw/*83.27*/("""{"""),format.raw/*83.28*/("""
            """),format.raw/*84.13*/("""padding: 15px;
            line-height: 20px;
        """),format.raw/*86.9*/("""}"""),format.raw/*86.10*/("""

        """),format.raw/*88.9*/(""".nav-dropdown """),format.raw/*88.23*/("""{"""),format.raw/*88.24*/("""
            """),format.raw/*89.13*/("""position: absolute;
            z-index: 1;
            /* Guarantees that the dropdown will display on top of any content. */
            box-shadow: 0 3px 12px rgba(0, 0, 0, 0.15);
            display: none;
        """),format.raw/*94.9*/("""}"""),format.raw/*94.10*/("""

        """),format.raw/*96.9*/(""".nav-mobile """),format.raw/*96.21*/("""{"""),format.raw/*96.22*/("""
            """),format.raw/*97.13*/("""display: none;
            position: absolute;
            top: 0;
            right: 0;
            background-color: #2D2D2D; color: #A5A5A5;
            height: 70px;
            width: 70px;
        """),format.raw/*104.9*/("""}"""),format.raw/*104.10*/("""

        """),format.raw/*106.9*/("""@media only screen and (max-width: 800px) """),format.raw/*106.52*/("""{"""),format.raw/*106.53*/("""

        """),format.raw/*108.9*/(""".brand"""),format.raw/*108.15*/("""{"""),format.raw/*108.16*/("""
            """),format.raw/*109.13*/("""padding-top: 10px !important;
            padding-left: 20px !important;
            position: absolute !important;
            float: left !important;
            line-height: 70px !important;
            text-transform: uppercase !important;
            font-size: 1.4em !important;
        """),format.raw/*116.9*/("""}"""),format.raw/*116.10*/("""

        """),format.raw/*118.9*/(""".nav-mobile """),format.raw/*118.21*/("""{"""),format.raw/*118.22*/("""
            """),format.raw/*119.13*/("""display: block;
        """),format.raw/*120.9*/("""}"""),format.raw/*120.10*/("""

        """),format.raw/*122.9*/("""nav """),format.raw/*122.13*/("""{"""),format.raw/*122.14*/("""
            """),format.raw/*123.13*/("""background-color: #2D2D2D; color: #A5A5A5;
            width: 100%;
            padding: 70px 0 15px;
        """),format.raw/*126.9*/("""}"""),format.raw/*126.10*/("""
        """),format.raw/*127.9*/("""nav ul """),format.raw/*127.16*/("""{"""),format.raw/*127.17*/("""
            """),format.raw/*128.13*/("""display: none;
        """),format.raw/*129.9*/("""}"""),format.raw/*129.10*/("""
        """),format.raw/*130.9*/("""nav ul li """),format.raw/*130.19*/("""{"""),format.raw/*130.20*/("""
            """),format.raw/*131.13*/("""float: none;
            padding-left: 2em;
        """),format.raw/*133.9*/("""}"""),format.raw/*133.10*/("""
        """),format.raw/*134.9*/("""nav ul li a """),format.raw/*134.21*/("""{"""),format.raw/*134.22*/("""
            """),format.raw/*135.13*/("""padding: 15px;
            line-height: 20px;
        """),format.raw/*137.9*/("""}"""),format.raw/*137.10*/("""
        """),format.raw/*138.9*/("""nav ul li ul li a """),format.raw/*138.27*/("""{"""),format.raw/*138.28*/("""
            """),format.raw/*139.13*/("""padding-left: 30px;
        """),format.raw/*140.9*/("""}"""),format.raw/*140.10*/("""
        """),format.raw/*141.9*/("""}"""),format.raw/*141.10*/("""
        """),format.raw/*142.9*/("""#nav-toggle """),format.raw/*142.21*/("""{"""),format.raw/*142.22*/("""
            """),format.raw/*143.13*/("""position: absolute;
            left: 18px;
            top: 22px;
            cursor: pointer;
            padding: 10px 35px 16px 0px;
        """),format.raw/*148.9*/("""}"""),format.raw/*148.10*/("""
        """),format.raw/*149.9*/("""#nav-toggle span,
        #nav-toggle span:before,
        #nav-toggle span:after """),format.raw/*151.32*/("""{"""),format.raw/*151.33*/("""
            """),format.raw/*152.13*/("""cursor: pointer;
            border-radius: 1px;
            height: 5px;
            width: 35px;
            background: #463f3f;
            position: absolute;
            display: block;
            content: '';
            transition: all 300ms ease-in-out;
        """),format.raw/*161.9*/("""}"""),format.raw/*161.10*/("""
        """),format.raw/*162.9*/("""#nav-toggle span:before """),format.raw/*162.33*/("""{"""),format.raw/*162.34*/("""
            """),format.raw/*163.13*/("""top: -10px;
        """),format.raw/*164.9*/("""}"""),format.raw/*164.10*/("""
        """),format.raw/*165.9*/("""#nav-toggle span:after """),format.raw/*165.32*/("""{"""),format.raw/*165.33*/("""
            """),format.raw/*166.13*/("""bottom: -10px;
        """),format.raw/*167.9*/("""}"""),format.raw/*167.10*/("""
        """),format.raw/*168.9*/("""#nav-toggle.active span """),format.raw/*168.33*/("""{"""),format.raw/*168.34*/("""
            """),format.raw/*169.13*/("""background-color: transparent;
        """),format.raw/*170.9*/("""}"""),format.raw/*170.10*/("""
        """),format.raw/*171.9*/("""#nav-toggle.active span:before, #nav-toggle.active span:after """),format.raw/*171.71*/("""{"""),format.raw/*171.72*/("""
            """),format.raw/*172.13*/("""top: 0;
        """),format.raw/*173.9*/("""}"""),format.raw/*173.10*/("""
        """),format.raw/*174.9*/("""#nav-toggle.active span:before """),format.raw/*174.40*/("""{"""),format.raw/*174.41*/("""
            """),format.raw/*175.13*/("""transform: rotate(45deg);
        """),format.raw/*176.9*/("""}"""),format.raw/*176.10*/("""
        """),format.raw/*177.9*/("""#nav-toggle.active span:after """),format.raw/*177.39*/("""{"""),format.raw/*177.40*/("""
            """),format.raw/*178.13*/("""transform: rotate(-45deg);
        """),format.raw/*179.9*/("""}"""),format.raw/*179.10*/("""

        """),format.raw/*181.9*/("""@media screen and (min-width: 800px) """),format.raw/*181.47*/("""{"""),format.raw/*181.48*/("""

        """),format.raw/*183.9*/(""".brand"""),format.raw/*183.15*/("""{"""),format.raw/*183.16*/("""
            """),format.raw/*184.13*/("""padding-top: 1px !important;
        """),format.raw/*185.9*/("""}"""),format.raw/*185.10*/("""

        """),format.raw/*187.9*/(""".nav-list """),format.raw/*187.19*/("""{"""),format.raw/*187.20*/("""
            """),format.raw/*188.13*/("""display: block !important;
        """),format.raw/*189.9*/("""}"""),format.raw/*189.10*/("""


        """),format.raw/*192.9*/("""}"""),format.raw/*192.10*/("""
        """),format.raw/*193.9*/("""/*
        .navigation – the outer wrapper for the navbar. Specifies the height and color, and will stretch the full width of the viewport.
        */
        .navigation """),format.raw/*196.21*/("""{"""),format.raw/*196.22*/("""
            """),format.raw/*197.13*/("""height: 62px;
            background-color: #2D2D2D; color: #A5A5A5;
        """),format.raw/*199.9*/("""}"""),format.raw/*199.10*/("""

        """),format.raw/*201.9*/("""/*
        .nav-container – the inner wrapper for the navbar. Defines how far the actual content should stretch.
        */
        .nav-container """),format.raw/*204.24*/("""{"""),format.raw/*204.25*/("""
            """),format.raw/*205.13*/("""max-width: 1000px;
            margin: 0 auto;
        """),format.raw/*207.9*/("""}"""),format.raw/*207.10*/("""

        """),format.raw/*209.9*/(""".brand """),format.raw/*209.16*/("""{"""),format.raw/*209.17*/("""
            """),format.raw/*210.13*/("""position: relative;
            overflow: auto;
            float: left;
            line-height: 70px;
            text-transform: uppercase;
            font-size: 1.4em;
        """),format.raw/*216.9*/("""}"""),format.raw/*216.10*/("""
        """),format.raw/*217.9*/(""".brand a,
        .brand a:visited """),format.raw/*218.26*/("""{"""),format.raw/*218.27*/("""

            """),format.raw/*220.13*/("""text-decoration: none;
        """),format.raw/*221.9*/("""}"""),format.raw/*221.10*/("""

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
	(function($) """),format.raw/*304.15*/("""{"""),format.raw/*304.16*/(""" """),format.raw/*304.17*/("""// Begin jQuery
        $(function() """),format.raw/*305.22*/("""{"""),format.raw/*305.23*/(""" """),format.raw/*305.24*/("""// DOM ready
            // If a link has a dropdown, add sub menu toggle.
            $('nav ul li a:not(:only-child)').click(function(e) """),format.raw/*307.65*/("""{"""),format.raw/*307.66*/("""
                """),format.raw/*308.17*/("""$(this).siblings('.nav-dropdown').toggle();
                // Close one dropdown when selecting another
                $('.nav-dropdown').not($(this).siblings()).hide();
                e.stopPropagation();
            """),format.raw/*312.13*/("""}"""),format.raw/*312.14*/(""");
            // Clicking away from dropdown will remove the dropdown class
            $('html').click(function() """),format.raw/*314.40*/("""{"""),format.raw/*314.41*/("""
                """),format.raw/*315.17*/("""$('.nav-dropdown').hide();
            """),format.raw/*316.13*/("""}"""),format.raw/*316.14*/(""");
            // Toggle open and close nav styles on click
            $('#nav-toggle').click(function() """),format.raw/*318.47*/("""{"""),format.raw/*318.48*/("""
                """),format.raw/*319.17*/("""$('nav ul').slideToggle();
            """),format.raw/*320.13*/("""}"""),format.raw/*320.14*/(""");
            // Hamburger to X toggle
            $('#nav-toggle').on('click', function() """),format.raw/*322.53*/("""{"""),format.raw/*322.54*/("""
                """),format.raw/*323.17*/("""this.classList.toggle('active');
            """),format.raw/*324.13*/("""}"""),format.raw/*324.14*/(""");
        """),format.raw/*325.9*/("""}"""),format.raw/*325.10*/("""); // end DOM ready
    """),format.raw/*326.5*/("""}"""),format.raw/*326.6*/(""")(jQuery); // end jQuery
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
                  DATE: Thu Apr 04 11:05:28 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/app/views/main.scala.html
                  HASH: 36ae244e9b4665b55f9b185972b11d5aec23aabd
                  MATRIX: 651->1|989->28|1128->72|1156->74|1474->366|1488->372|1547->411|1935->771|1964->772|2006->786|2218->970|2247->971|2284->981|2321->990|2350->991|2379->992|2455->1040|2484->1041|2521->1051|2561->1063|2590->1064|2619->1065|2666->1084|2695->1085|2732->1095|2771->1106|2800->1107|2829->1108|2913->1164|2942->1165|2979->1175|3018->1186|3047->1187|3076->1188|3142->1226|3171->1227|3208->1237|3245->1246|3274->1247|3303->1248|3343->1260|3372->1261|3411->1273|3447->1281|3476->1282|3590->1367|3620->1368|3657->1378|3694->1387|3723->1388|3794->1431|3823->1432|3860->1442|3896->1450|3925->1451|3996->1494|4025->1495|4062->1505|4099->1514|4128->1515|4157->1516|4210->1541|4239->1542|4276->1552|4314->1562|4343->1563|4373->1565|4402->1566|4439->1576|4480->1589|4509->1590|4539->1592|4568->1593|4605->1603|4644->1614|4673->1615|4702->1616|4763->1649|4792->1650|4839->1670|5105->1909|5134->1910|5176->1924|5232->1953|5261->1954|5298->1964|5330->1968|5359->1969|5401->1983|5451->2006|5480->2007|5517->2017|5552->2024|5581->2025|5623->2039|5796->2185|5825->2186|5862->2196|5900->2206|5929->2207|5971->2221|6053->2276|6082->2277|6119->2287|6159->2299|6188->2300|6230->2314|6821->2878|6850->2879|6887->2889|6933->2907|6962->2908|7004->2922|7083->2974|7112->2975|7149->2985|7212->3020|7241->3021|7283->3035|7366->3091|7395->3092|7432->3102|7476->3118|7505->3119|7547->3133|7601->3160|7630->3161|7667->3171|7713->3189|7742->3190|7784->3204|7867->3260|7896->3261|7935->3273|7977->3287|8006->3288|8048->3302|8298->3525|8327->3526|8366->3538|8406->3550|8435->3551|8477->3565|8715->3775|8745->3776|8785->3788|8856->3831|8886->3832|8926->3844|8961->3850|8991->3851|9034->3865|9362->4165|9392->4166|9432->4178|9473->4190|9503->4191|9546->4205|9599->4230|9629->4231|9669->4243|9702->4247|9732->4248|9775->4262|9916->4375|9946->4376|9984->4386|10020->4393|10050->4394|10093->4408|10145->4432|10175->4433|10213->4443|10252->4453|10282->4454|10325->4468|10407->4522|10437->4523|10475->4533|10516->4545|10546->4546|10589->4560|10673->4616|10703->4617|10741->4627|10788->4645|10818->4646|10861->4660|10918->4689|10948->4690|10986->4700|11016->4701|11054->4711|11095->4723|11125->4724|11168->4738|11346->4888|11376->4889|11414->4899|11527->4983|11557->4984|11600->4998|11909->5279|11939->5280|11977->5290|12030->5314|12060->5315|12103->5329|12152->5350|12182->5351|12220->5361|12272->5384|12302->5385|12345->5399|12397->5423|12427->5424|12465->5434|12518->5458|12548->5459|12591->5473|12659->5513|12689->5514|12727->5524|12818->5586|12848->5587|12891->5601|12936->5618|12966->5619|13004->5629|13064->5660|13094->5661|13137->5675|13200->5710|13230->5711|13268->5721|13327->5751|13357->5752|13400->5766|13464->5802|13494->5803|13534->5815|13600->5853|13630->5854|13670->5866|13705->5872|13735->5873|13778->5887|13844->5925|13874->5926|13914->5938|13953->5948|13983->5949|14026->5963|14090->5999|14120->6000|14162->6014|14192->6015|14230->6025|14433->6199|14463->6200|14506->6214|14613->6293|14643->6294|14683->6306|14862->6456|14892->6457|14935->6471|15020->6528|15050->6529|15090->6541|15126->6548|15156->6549|15199->6563|15414->6750|15444->6751|15482->6761|15547->6797|15577->6798|15622->6814|15682->6846|15712->6847|15752->6859|16186->7265|16202->7271|16252->7299|16639->7658|16665->7674|16706->7676|16763->7705|16814->7746|16854->7747|16913->7777|16955->7791|16971->7797|17023->7827|17150->7922|17205->7948|17247->7962|17263->7968|17311->7994|17452->8107|17468->8113|17516->8139|17657->8252|17673->8258|17720->8283|17846->8381|17870->8395|17910->8396|17973->8431|17987->8435|18022->8445|18052->8446|18164->8530|18180->8536|18227->8561|18336->8651|18350->8656|18390->8657|18445->8683|18487->8697|18503->8703|18555->8733|18688->8838|18704->8844|18750->8868|18872->8958|18923->8980|19519->9548|19548->9555|19619->9597|19953->9902|19983->9903|20013->9904|20080->9942|20110->9943|20140->9944|20310->10085|20340->10086|20387->10104|20641->10329|20671->10330|20818->10448|20848->10449|20895->10467|20964->10507|20994->10508|21131->10616|21161->10617|21208->10635|21277->10675|21307->10676|21430->10770|21460->10771|21507->10789|21582->10835|21612->10836|21652->10848|21682->10849|21735->10874|21764->10875
                  LINES: 24->1|29->2|34->2|35->3|40->8|40->8|40->8|45->13|45->13|46->14|52->20|52->20|53->21|53->21|53->21|53->21|53->21|53->21|54->22|54->22|54->22|54->22|54->22|54->22|55->23|55->23|55->23|55->23|55->23|55->23|56->24|56->24|56->24|56->24|56->24|56->24|57->25|57->25|57->25|57->25|57->25|57->25|59->27|59->27|59->27|59->27|59->27|60->28|60->28|60->28|60->28|60->28|61->29|61->29|61->29|61->29|61->29|62->30|62->30|62->30|62->30|62->30|62->30|63->31|63->31|63->31|63->31|63->31|64->32|64->32|64->32|64->32|64->32|65->33|65->33|65->33|65->33|65->33|65->33|71->39|77->45|77->45|78->46|79->47|79->47|80->48|80->48|80->48|81->49|82->50|82->50|83->51|83->51|83->51|84->52|90->58|90->58|91->59|91->59|91->59|92->60|94->62|94->62|95->63|95->63|95->63|96->64|104->72|104->72|105->73|105->73|105->73|106->74|107->75|107->75|108->76|108->76|108->76|109->77|111->79|111->79|112->80|112->80|112->80|113->81|114->82|114->82|115->83|115->83|115->83|116->84|118->86|118->86|120->88|120->88|120->88|121->89|126->94|126->94|128->96|128->96|128->96|129->97|136->104|136->104|138->106|138->106|138->106|140->108|140->108|140->108|141->109|148->116|148->116|150->118|150->118|150->118|151->119|152->120|152->120|154->122|154->122|154->122|155->123|158->126|158->126|159->127|159->127|159->127|160->128|161->129|161->129|162->130|162->130|162->130|163->131|165->133|165->133|166->134|166->134|166->134|167->135|169->137|169->137|170->138|170->138|170->138|171->139|172->140|172->140|173->141|173->141|174->142|174->142|174->142|175->143|180->148|180->148|181->149|183->151|183->151|184->152|193->161|193->161|194->162|194->162|194->162|195->163|196->164|196->164|197->165|197->165|197->165|198->166|199->167|199->167|200->168|200->168|200->168|201->169|202->170|202->170|203->171|203->171|203->171|204->172|205->173|205->173|206->174|206->174|206->174|207->175|208->176|208->176|209->177|209->177|209->177|210->178|211->179|211->179|213->181|213->181|213->181|215->183|215->183|215->183|216->184|217->185|217->185|219->187|219->187|219->187|220->188|221->189|221->189|224->192|224->192|225->193|228->196|228->196|229->197|231->199|231->199|233->201|236->204|236->204|237->205|239->207|239->207|241->209|241->209|241->209|242->210|248->216|248->216|249->217|250->218|250->218|252->220|253->221|253->221|255->223|267->235|267->235|267->235|275->243|275->243|275->243|277->245|277->245|277->245|278->246|278->246|278->246|278->246|279->247|280->248|280->248|280->248|280->248|281->249|281->249|281->249|283->251|283->251|283->251|285->253|285->253|285->253|286->254|286->254|286->254|286->254|289->257|289->257|289->257|290->258|290->258|290->258|291->259|291->259|291->259|291->259|292->260|292->260|292->260|294->262|295->263|315->283|315->283|320->288|336->304|336->304|336->304|337->305|337->305|337->305|339->307|339->307|340->308|344->312|344->312|346->314|346->314|347->315|348->316|348->316|350->318|350->318|351->319|352->320|352->320|354->322|354->322|355->323|356->324|356->324|357->325|357->325|358->326|358->326
                  -- GENERATED --
              */
          