
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">

<head>


    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Admin Panel - """),_display_(/*15.27*/title),format.raw/*15.32*/("""</title>

    <!-- Bootstrap Core CSS -->
    <link href=""""),_display_(/*18.18*/routes/*18.24*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*18.74*/("""" rel="stylesheet">

    <!-- Custom CSS -->
    <link href=""""),_display_(/*21.18*/routes/*21.24*/.Assets.versioned("stylesheets/shop-homepage.css")),format.raw/*21.74*/("""" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href=""""),_display_(/*45.48*/routes/*45.54*/.AdminProductCtrl.adminPanel()),format.raw/*45.84*/("""">Admin Panel</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
					<!-- Login/ logout Link - check if user logged in -->
                    <li>
						"""),_display_(/*52.8*/if(user != null)/*52.24*/ {_display_(Seq[Any](format.raw/*52.26*/("""
						  """),format.raw/*53.9*/("""<a href=""""),_display_(/*53.19*/controllers/*53.30*/.routes.LoginController.logout()),format.raw/*53.62*/("""">Logout</a>
						""")))}/*54.9*/else/*54.14*/{_display_(Seq[Any](format.raw/*54.15*/("""
                      	  """),format.raw/*55.26*/("""<a href=""""),_display_(/*55.36*/controllers/*55.47*/.routes.LoginController.login()),format.raw/*55.78*/("""">Login</a>
						""")))}),format.raw/*56.8*/("""
                    """),format.raw/*57.21*/("""</li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Page Content -->
    <div class="container">
			<div class="row">

				<div class="col-md-12">
						<p class="lead"></p>
				<div>
			</div>

			<!-- Start Content -->
			"""),_display_(/*75.5*/content),format.raw/*75.12*/("""
			"""),format.raw/*76.4*/("""<!-- End Content -->

    </div>
    <!-- /.container -->

    <div class="container">

        <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p></p>
                </div>
            </div>
        </footer>

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src=""""),_display_(/*98.19*/routes/*98.25*/.Assets.versioned("javascripts/jquery.js")),format.raw/*98.67*/(""""></script>

    <!-- Bootstrap Core JavaScript -->
    <script src=""""),_display_(/*101.19*/routes/*101.25*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*101.74*/(""""></script>

</body>

</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 02 21:47:56 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/2ndYearProject/app/views/AdminPanel/main.scala.html
                  HASH: c5b1f2439aad309378ccefcec777aefb1738bf03
                  MATRIX: 981->1|1130->57|1157->58|1489->363|1515->368|1601->427|1616->433|1687->483|1776->545|1791->551|1862->601|2982->1694|2997->1700|3048->1730|3413->2069|3438->2085|3478->2087|3514->2096|3551->2106|3571->2117|3624->2149|3662->2170|3675->2175|3714->2176|3768->2202|3805->2212|3825->2223|3877->2254|3926->2273|3975->2294|4325->2618|4353->2625|4384->2629|4788->3006|4803->3012|4866->3054|4964->3124|4980->3130|5051->3179
                  LINES: 28->1|33->2|34->3|46->15|46->15|49->18|49->18|49->18|52->21|52->21|52->21|76->45|76->45|76->45|83->52|83->52|83->52|84->53|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|86->55|87->56|88->57|106->75|106->75|107->76|129->98|129->98|129->98|132->101|132->101|132->101
                  -- GENERATED --
              */
          