
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

object registerUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Customer],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.Customer],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.65*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Register User",user)/*5.28*/{_display_(Seq[Any](format.raw/*5.29*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new user</p>

        <!-- Use a views.html.helpers package method to create the form (instead of html)-->
        <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*11.6*/form(action=routes.HomeController.registerUserSubmit(), 'class -> "form-horizontal", 'role -> "form")/*11.107*/ {_display_(Seq[Any](format.raw/*11.109*/("""
        """),format.raw/*12.37*/("""
        """),format.raw/*13.99*/("""
        """),_display_(/*14.10*/CSRF/*14.14*/.formField),format.raw/*14.24*/("""


        """),_display_(/*17.10*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*17.84*/("""
        """),_display_(/*18.10*/inputText(userForm("fName"), '_label -> "Name", 'class -> "form-control")),format.raw/*18.83*/("""
        """),_display_(/*19.10*/inputText(userForm("lName"), '_label -> "Name", 'class -> "form-control")),format.raw/*19.83*/("""
        """),_display_(/*20.10*/inputText(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*20.90*/("""
        """),_display_(/*21.10*/inputText(userForm("role").copy(value=Some("customer")), '_label -> "",'hidden -> "hidden")),format.raw/*21.101*/("""




        """),format.raw/*26.9*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
    <div class="actions">
        <input type="submit" value="Register user" class="btn btn-primary">
        <a href=""""),_display_(/*32.19*/routes/*32.25*/.HomeController.registerUser()),format.raw/*32.55*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
""")))}),format.raw/*36.2*/(""" """),format.raw/*36.20*/("""
""")))}),format.raw/*37.2*/(""" """))
      }
    }
  }

  def render(userForm:Form[models.users.Customer],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[models.users.Customer],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 30 20:54:03 GMT 2019
                  SOURCE: /home/ryan/2ndyearproj/2ndYearProject/app/views/registerUser.scala.html
                  HASH: d8a2c4c7571804b6b03e9a7c89c81dfd880027fc
                  MATRIX: 994->1|1130->69|1175->64|1205->86|1233->89|1267->115|1305->116|1337->122|1669->428|1780->529|1821->531|1859->569|1897->669|1935->680|1948->684|1979->694|2021->709|2116->783|2154->794|2248->867|2286->878|2380->951|2418->962|2519->1042|2557->1053|2670->1144|2715->1162|3087->1507|3102->1513|3153->1543|3289->1649|3318->1667|3351->1670
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|43->11|43->11|43->11|44->12|45->13|46->14|46->14|46->14|49->17|49->17|50->18|50->18|51->19|51->19|52->20|52->20|53->21|53->21|58->26|64->32|64->32|64->32|68->36|68->36|69->37
                  -- GENERATED --
              */
          