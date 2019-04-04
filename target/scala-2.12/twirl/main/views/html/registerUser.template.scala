
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
/*3.6*/import helper._


Seq[Any](format.raw/*1.65*/("""

    """),format.raw/*4.1*/("""
    """),_display_(/*5.6*/main("Register User",user)/*5.32*/{_display_(Seq[Any](format.raw/*5.33*/("""
        """),format.raw/*6.9*/("""<p class="lead">Add a new user</p>

            <!-- Use a views.html.helpers package method to create the form (instead of html)-->
            <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
        """),_display_(/*11.10*/form(action=routes.HomeController.registerUserSubmit(), 'class -> "form-horizontal", 'role -> "form")/*11.111*/ {_display_(Seq[Any](format.raw/*11.113*/("""
            """),format.raw/*12.41*/("""
            """),format.raw/*13.103*/("""
            """),_display_(/*14.14*/CSRF/*14.18*/.formField),format.raw/*14.28*/("""


            """),_display_(/*17.14*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*17.88*/("""
            """),_display_(/*18.14*/inputText(userForm("fName"), '_label -> "Name", 'class -> "form-control")),format.raw/*18.87*/("""
            """),_display_(/*19.14*/inputText(userForm("lName"), '_label -> "Name", 'class -> "form-control")),format.raw/*19.87*/("""
            """),_display_(/*20.14*/inputText(userForm("address"), '_label -> "address", 'class -> "form-control")),format.raw/*20.92*/("""
            """),_display_(/*21.14*/inputText(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*21.94*/("""
            """),_display_(/*22.14*/inputText(userForm("role").copy(value=Some("customer")), '_label -> "",'hidden -> "hidden")),format.raw/*22.105*/("""




            """),format.raw/*27.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
        <div class="actions">
            <input type="submit" value="Register user" class="btn btn-primary">
            <a href=""""),_display_(/*33.23*/routes/*33.29*/.HomeController.registerUser()),format.raw/*33.59*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*37.6*/(""" """),format.raw/*37.24*/("""
    """)))}),format.raw/*38.6*/(""" """))
      }
    }
  }

  def render(userForm:Form[models.users.Customer],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[models.users.Customer],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 04 01:09:48 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/app/views/registerUser.scala.html
                  HASH: 6bd81bf1014409773fa227c07a651d7a2d215a76
                  MATRIX: 994->1|1130->73|1175->64|1209->90|1241->97|1275->123|1313->124|1349->134|1694->452|1805->553|1846->555|1888->597|1931->701|1973->716|1986->720|2017->730|2063->749|2158->823|2200->838|2294->911|2336->926|2430->999|2472->1014|2571->1092|2613->1107|2714->1187|2756->1202|2869->1293|2919->1315|3303->1672|3318->1678|3369->1708|3521->1830|3550->1848|3587->1855
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|43->11|43->11|43->11|44->12|45->13|46->14|46->14|46->14|49->17|49->17|50->18|50->18|51->19|51->19|52->20|52->20|53->21|53->21|54->22|54->22|59->27|65->33|65->33|65->33|69->37|69->37|70->38
                  -- GENERATED --
              */
          