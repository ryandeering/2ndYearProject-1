
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

object addUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.User],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Register User",user)/*5.28*/{_display_(Seq[Any](format.raw/*5.29*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new user</p>

        <!-- Use a views.html.helpers package method to create the form (instead of html)-->
        <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*11.6*/form(action=routes.HomeController.addUserSubmit(), 'class -> "form-horizontal", 'role -> "form")/*11.102*/ {_display_(Seq[Any](format.raw/*11.104*/("""
        """),format.raw/*12.37*/("""
        """),format.raw/*13.99*/("""
        """),_display_(/*14.10*/CSRF/*14.14*/.formField),format.raw/*14.24*/("""


    """),_display_(/*17.6*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*17.80*/("""
         """),_display_(/*18.11*/inputText(userForm("fName"), '_label -> "Name", 'class -> "form-control")),format.raw/*18.84*/("""
        """),_display_(/*19.10*/inputText(userForm("lName"), '_label -> "Name", 'class -> "form-control")),format.raw/*19.83*/("""
    """),_display_(/*20.6*/inputText(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*20.86*/("""

    """),_display_(/*22.6*/inputText(userForm("role"), '_label -> "Role", 'class -> "form-control")),format.raw/*22.78*/("""

        """),format.raw/*24.9*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
    <div class="actions">
        <input type="submit" value="Register user" class="btn btn-primary">
        <a href=""""),_display_(/*30.19*/routes/*30.25*/.HomeController.addUser()),format.raw/*30.50*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
""")))}),format.raw/*34.2*/(""" """),format.raw/*34.20*/("""
""")))}),format.raw/*35.2*/(""" """))
      }
    }
  }

  def render(userForm:Form[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 20 15:21:11 GMT 2019
                  SOURCE: /home/ryan/Documents/2ndYearProject/app/views/addUser.scala.html
                  HASH: fc5299429f4b61b7bc442d8a036d2d559e19c233
                  MATRIX: 985->1|1117->63|1161->61|1188->79|1215->81|1249->107|1287->108|1318->113|1645->414|1751->510|1792->512|1829->549|1866->648|1903->658|1916->662|1947->672|1981->680|2076->754|2114->765|2208->838|2245->848|2339->921|2371->927|2472->1007|2505->1014|2598->1086|2635->1096|3001->1435|3016->1441|3062->1466|3194->1568|3223->1586|3255->1588
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|42->11|42->11|42->11|43->12|44->13|45->14|45->14|45->14|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|53->22|53->22|55->24|61->30|61->30|61->30|65->34|65->34|66->35
                  -- GENERATED --
              */
          