
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
                  DATE: Mon Apr 01 15:30:43 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/app/views/AdminPanel/main.scala.html
                  HASH: cb507fe456c5bb525f3422caf5ca7b4064a7b3c9
                  MATRIX: 981->1|1131->56|1161->60|1505->377|1531->382|1620->444|1635->450|1706->500|1798->565|1813->571|1884->621|3028->1738|3043->1744|3094->1774|3466->2120|3491->2136|3531->2138|3568->2148|3605->2158|3625->2169|3678->2201|3717->2223|3730->2228|3769->2229|3824->2256|3861->2266|3881->2277|3933->2308|3983->2328|4033->2350|4401->2692|4429->2699|4461->2704|4887->3103|4902->3109|4965->3151|5066->3224|5082->3230|5153->3279
                  LINES: 28->1|33->1|35->3|47->15|47->15|50->18|50->18|50->18|53->21|53->21|53->21|77->45|77->45|77->45|84->52|84->52|84->52|85->53|85->53|85->53|85->53|86->54|86->54|86->54|87->55|87->55|87->55|87->55|88->56|89->57|107->75|107->75|108->76|130->98|130->98|130->98|133->101|133->101|133->101
                  -- GENERATED --
              */
          