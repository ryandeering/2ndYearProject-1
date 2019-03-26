
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
<<<<<<< HEAD
                  DATE: Thu Mar 21 19:55:56 GMT 2019
                  SOURCE: /home/ryan/rawr/2ndYearProject2/app/views/AdminPanel/main.scala.html
=======
                  DATE: Wed Mar 20 19:32:02 GMT 2019
                  SOURCE: /home/wdd/2ndYrProject/2ndYearProject/app/views/AdminPanel/main.scala.html
>>>>>>> c0659dac054e747f3bb0e777503a54584ddf7b5d
                  HASH: a347ec55fdb1d58cbd05a4d5e0644e8f318b47ba
                  MATRIX: 981->1|1130->57|1157->58|1494->368|1520->373|1606->432|1621->438|1692->488|1781->550|1796->556|1867->606|2987->1699|3002->1705|3056->1738|3428->2084|3453->2100|3493->2102|3529->2111|3566->2121|3586->2132|3639->2164|3677->2185|3690->2190|3729->2191|3783->2217|3820->2227|3840->2238|3892->2269|3941->2288|3990->2309|4358->2651|4386->2658|4417->2662|4846->3064|4861->3070|4924->3112|5022->3182|5038->3188|5109->3237
                  LINES: 28->1|33->2|34->3|45->14|45->14|48->17|48->17|48->17|51->20|51->20|51->20|75->44|75->44|75->44|82->51|82->51|82->51|83->52|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|85->54|86->55|87->56|105->74|105->74|106->75|128->97|128->97|128->97|131->100|131->100|131->100
                  -- GENERATED --
              */
          