
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
                  DATE: Thu Apr 04 21:01:50 IST 2019
                  SOURCE: /home/ryan/Downloads/aa/2ndYearProject/app/views/main.scala.html
                  HASH: 622ff20e2ebc0aea2277c696e1a4091dc447d1b6
                  MATRIX: 651->1|989->27|1127->72|1440->359|1454->365|1513->404|1896->759|1925->760|1966->773|2172->951|2201->952|2237->961|2274->970|2303->971|2332->972|2408->1020|2437->1021|2473->1030|2513->1042|2542->1043|2571->1044|2618->1063|2647->1064|2683->1073|2722->1084|2751->1085|2780->1086|2864->1142|2893->1143|2929->1152|2968->1163|2997->1164|3026->1165|3092->1203|3121->1204|3157->1213|3194->1222|3223->1223|3252->1224|3292->1236|3321->1237|3358->1247|3394->1255|3423->1256|3537->1341|3567->1342|3603->1351|3640->1360|3669->1361|3740->1404|3769->1405|3805->1414|3841->1422|3870->1423|3941->1466|3970->1467|4006->1476|4043->1485|4072->1486|4101->1487|4154->1512|4183->1513|4219->1522|4257->1532|4286->1533|4316->1535|4345->1536|4381->1545|4422->1558|4451->1559|4481->1561|4510->1562|4546->1571|4585->1582|4614->1583|4643->1584|4704->1617|4733->1618|4774->1632|5034->1865|5063->1866|5104->1879|5159->1907|5188->1908|5224->1917|5256->1921|5285->1922|5326->1935|5375->1957|5404->1958|5440->1967|5475->1974|5504->1975|5545->1988|5712->2128|5741->2129|5777->2138|5815->2148|5844->2149|5885->2162|5965->2215|5994->2216|6030->2225|6070->2237|6099->2238|6140->2251|6723->2807|6752->2808|6788->2817|6834->2835|6863->2836|6904->2849|6982->2900|7011->2901|7047->2910|7110->2945|7139->2946|7180->2959|7261->3013|7290->3014|7326->3023|7370->3039|7399->3040|7440->3053|7493->3079|7522->3080|7558->3089|7604->3107|7633->3108|7674->3121|7755->3175|7784->3176|7821->3186|7863->3200|7892->3201|7933->3214|8178->3432|8207->3433|8244->3443|8284->3455|8313->3456|8354->3469|8585->3672|8615->3673|8653->3683|8724->3726|8754->3727|8792->3737|8827->3743|8857->3744|8899->3757|9220->4050|9250->4051|9288->4061|9329->4073|9359->4074|9401->4087|9453->4111|9483->4112|9521->4122|9554->4126|9584->4127|9626->4140|9764->4250|9794->4251|9831->4260|9867->4267|9897->4268|9939->4281|9990->4304|10020->4305|10057->4314|10096->4324|10126->4325|10168->4338|10248->4390|10278->4391|10315->4400|10356->4412|10386->4413|10428->4426|10510->4480|10540->4481|10577->4490|10624->4508|10654->4509|10696->4522|10752->4550|10782->4551|10819->4560|10849->4561|10886->4570|10927->4582|10957->4583|10999->4596|11172->4741|11202->4742|11239->4751|11350->4833|11380->4834|11422->4847|11722->5119|11752->5120|11789->5129|11842->5153|11872->5154|11914->5167|11962->5187|11992->5188|12029->5197|12081->5220|12111->5221|12153->5234|12204->5257|12234->5258|12271->5267|12324->5291|12354->5292|12396->5305|12463->5344|12493->5345|12530->5354|12621->5416|12651->5417|12693->5430|12737->5446|12767->5447|12804->5456|12864->5487|12894->5488|12936->5501|12998->5535|13028->5536|13065->5545|13124->5575|13154->5576|13196->5589|13259->5624|13289->5625|13327->5635|13393->5673|13423->5674|13461->5684|13496->5690|13526->5691|13568->5704|13633->5741|13663->5742|13701->5752|13740->5762|13770->5763|13812->5776|13875->5811|13905->5812|13944->5823|13974->5824|14011->5833|14211->6004|14241->6005|14283->6018|14388->6095|14418->6096|14456->6106|14632->6253|14662->6254|14704->6267|14787->6322|14817->6323|14855->6333|14891->6340|14921->6341|14963->6354|15172->6535|15202->6536|15239->6545|15303->6580|15333->6581|15376->6595|15435->6626|15465->6627|15503->6637|15925->7031|15941->7037|15991->7065|16370->7416|16396->7432|16437->7434|16492->7461|16543->7502|16583->7503|16641->7532|16683->7546|16699->7552|16751->7582|16877->7676|16931->7701|16973->7715|16989->7721|17037->7747|17177->7859|17193->7865|17241->7891|17380->8002|17396->8008|17443->8033|17567->8129|17591->8143|17631->8144|17693->8178|17707->8182|17742->8192|17772->8193|17881->8274|17897->8280|17944->8305|18052->8394|18066->8399|18106->8400|18160->8425|18202->8439|18218->8445|18270->8475|18402->8579|18418->8585|18464->8609|18584->8697|18634->8718|19210->9266|19239->9273|19305->9310|19623->9599|19653->9600|19683->9601|19749->9638|19779->9639|19809->9640|19977->9779|20007->9780|20053->9797|20303->10018|20333->10019|20478->10135|20508->10136|20554->10153|20622->10192|20652->10193|20787->10299|20817->10300|20863->10317|20931->10356|20961->10357|21082->10449|21112->10450|21158->10467|21232->10512|21262->10513|21301->10524|21331->10525|21383->10549|21412->10550
                  LINES: 24->1|29->2|34->3|39->8|39->8|39->8|44->13|44->13|45->14|51->20|51->20|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|56->25|56->25|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|63->32|63->32|63->32|63->32|63->32|64->33|64->33|64->33|64->33|64->33|64->33|70->39|76->45|76->45|77->46|78->47|78->47|79->48|79->48|79->48|80->49|81->50|81->50|82->51|82->51|82->51|83->52|89->58|89->58|90->59|90->59|90->59|91->60|93->62|93->62|94->63|94->63|94->63|95->64|103->72|103->72|104->73|104->73|104->73|105->74|106->75|106->75|107->76|107->76|107->76|108->77|110->79|110->79|111->80|111->80|111->80|112->81|113->82|113->82|114->83|114->83|114->83|115->84|117->86|117->86|119->88|119->88|119->88|120->89|125->94|125->94|127->96|127->96|127->96|128->97|135->104|135->104|137->106|137->106|137->106|139->108|139->108|139->108|140->109|147->116|147->116|149->118|149->118|149->118|150->119|151->120|151->120|153->122|153->122|153->122|154->123|157->126|157->126|158->127|158->127|158->127|159->128|160->129|160->129|161->130|161->130|161->130|162->131|164->133|164->133|165->134|165->134|165->134|166->135|168->137|168->137|169->138|169->138|169->138|170->139|171->140|171->140|172->141|172->141|173->142|173->142|173->142|174->143|179->148|179->148|180->149|182->151|182->151|183->152|192->161|192->161|193->162|193->162|193->162|194->163|195->164|195->164|196->165|196->165|196->165|197->166|198->167|198->167|199->168|199->168|199->168|200->169|201->170|201->170|202->171|202->171|202->171|203->172|204->173|204->173|205->174|205->174|205->174|206->175|207->176|207->176|208->177|208->177|208->177|209->178|210->179|210->179|212->181|212->181|212->181|214->183|214->183|214->183|215->184|216->185|216->185|218->187|218->187|218->187|219->188|220->189|220->189|223->192|223->192|224->193|227->196|227->196|228->197|230->199|230->199|232->201|235->204|235->204|236->205|238->207|238->207|240->209|240->209|240->209|241->210|247->216|247->216|248->217|249->218|249->218|251->220|252->221|252->221|254->223|266->235|266->235|266->235|274->243|274->243|274->243|276->245|276->245|276->245|277->246|277->246|277->246|277->246|278->247|279->248|279->248|279->248|279->248|280->249|280->249|280->249|282->251|282->251|282->251|284->253|284->253|284->253|285->254|285->254|285->254|285->254|288->257|288->257|288->257|289->258|289->258|289->258|290->259|290->259|290->259|290->259|291->260|291->260|291->260|293->262|294->263|314->283|314->283|319->288|335->304|335->304|335->304|336->305|336->305|336->305|338->307|338->307|339->308|343->312|343->312|345->314|345->314|346->315|347->316|347->316|349->318|349->318|350->319|351->320|351->320|353->322|353->322|354->323|355->324|355->324|356->325|356->325|357->326|357->326
                  -- GENERATED --
              */
          