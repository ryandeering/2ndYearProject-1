
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


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Product Catalogue - """),_display_(/*14.33*/title),format.raw/*14.38*/("""</title>

    <!-- Bootstrap Core CSS -->
    <link href=""""),_display_(/*17.18*/routes/*17.24*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*17.74*/("""" rel="stylesheet">

    <!-- Custom CSS -->
    <link href=""""),_display_(/*20.18*/routes/*20.24*/.Assets.versioned("stylesheets/shop-homepage.css")),format.raw/*20.74*/("""" rel="stylesheet">

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
                <a class="navbar-brand" href=""""),_display_(/*44.48*/routes/*44.54*/.AdminProductCtrl.listProducts(0)),format.raw/*44.87*/("""">Products Catalogue</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
					<!-- Login/ logout Link - check if user logged in -->
                    <li>
						"""),_display_(/*51.8*/if(user != null)/*51.24*/ {_display_(Seq[Any](format.raw/*51.26*/("""
						  """),format.raw/*52.9*/("""<a href=""""),_display_(/*52.19*/controllers/*52.30*/.routes.LoginController.logout()),format.raw/*52.62*/("""">Logout</a>
						""")))}/*53.9*/else/*53.14*/{_display_(Seq[Any](format.raw/*53.15*/("""
                      	  """),format.raw/*54.26*/("""<a href=""""),_display_(/*54.36*/controllers/*54.47*/.routes.LoginController.login()),format.raw/*54.78*/("""">Login</a>
						""")))}),format.raw/*55.8*/("""
                    """),format.raw/*56.21*/("""</li>
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
						<p class="lead">Products Catalogue</p>
				<div>
			</div>

			<!-- Start Content -->
			"""),_display_(/*74.5*/content),format.raw/*74.12*/("""
			"""),format.raw/*75.4*/("""<!-- End Content -->

    </div>
    <!-- /.container -->

    <div class="container">

        <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Products Catalogue Footer</p>
                </div>
            </div>
        </footer>

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src=""""),_display_(/*97.19*/routes/*97.25*/.Assets.versioned("javascripts/jquery.js")),format.raw/*97.67*/(""""></script>

    <!-- Bootstrap Core JavaScript -->
    <script src=""""),_display_(/*100.19*/routes/*100.25*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*100.74*/(""""></script>

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
                  DATE: Wed Mar 27 21:12:41 GMT 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/app/views/AdminPanel/main.scala.html
                  HASH: 2239969c1450ce647c809ec4f6fb6cff992db740
                  MATRIX: 981->1|1131->56|1161->60|1509->381|1535->386|1624->448|1639->454|1710->504|1802->569|1817->575|1888->625|3032->1742|3047->1748|3101->1781|3480->2134|3505->2150|3545->2152|3582->2162|3619->2172|3639->2183|3692->2215|3731->2237|3744->2242|3783->2243|3838->2270|3875->2280|3895->2291|3947->2322|3997->2342|4047->2364|4433->2724|4461->2731|4493->2736|4944->3160|4959->3166|5022->3208|5123->3281|5139->3287|5210->3336
                  LINES: 28->1|33->1|35->3|46->14|46->14|49->17|49->17|49->17|52->20|52->20|52->20|76->44|76->44|76->44|83->51|83->51|83->51|84->52|84->52|84->52|84->52|85->53|85->53|85->53|86->54|86->54|86->54|86->54|87->55|88->56|106->74|106->74|107->75|129->97|129->97|129->97|132->100|132->100|132->100
                  -- GENERATED --
              */
          