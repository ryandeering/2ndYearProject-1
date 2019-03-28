
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

object addAdmin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Admin],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.Admin],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import models.users.User
/*4.2*/import helper._


Seq[Any](format.raw/*1.62*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Add Admin",user)/*6.24*/{_display_(Seq[Any](format.raw/*6.25*/("""
    """),format.raw/*7.5*/("""<p class="lead">Add a new administrator</p>

        <!-- Use a views.html.helpers package method to create the form (instead of html)-->
        <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*12.6*/form(action=routes.HomeController.addAdminSubmit(), 'class -> "form-horizontal", 'role -> "form")/*12.103*/ {_display_(Seq[Any](format.raw/*12.105*/("""
        """),format.raw/*13.37*/("""
        """),format.raw/*14.99*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""

        """),_display_(/*17.10*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*17.84*/("""
        """),_display_(/*18.10*/inputText(userForm("fName"), '_label -> "First Name", 'class -> "form-control")),format.raw/*18.89*/("""
        """),_display_(/*19.10*/inputText(userForm("lName"), '_label -> "Last Name", 'class -> "form-control")),format.raw/*19.88*/("""
        """),_display_(/*20.10*/inputText(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*20.90*/("""
        """),_display_(/*21.10*/inputText(userForm("role").copy(value=Some("admin")), '_label -> "",'hidden -> "hidden")),format.raw/*21.98*/("""

        """),format.raw/*23.9*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
    <div class="actions">
        <input type="submit" value="Add/Update Admin" class="btn btn-primary">
        <a href=""""),_display_(/*29.19*/routes/*29.25*/.HomeController.usersAdmin()),format.raw/*29.53*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
""")))}),format.raw/*33.2*/(""" """),format.raw/*33.20*/("""
""")))}),format.raw/*34.2*/(""" """))
      }
    }
  }

  def render(userForm:Form[models.users.Admin],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[models.users.Admin],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 28 18:31:19 GMT 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/app/views/AdminPanel/addAdmin.scala.html
                  HASH: ededd6bd2a966ca0670e4b0971d4a64f87db979c
                  MATRIX: 998->1|1131->66|1163->93|1208->61|1238->110|1266->113|1296->135|1334->136|1366->142|1707->457|1814->554|1855->556|1893->594|1931->694|1969->705|1982->709|2013->719|2053->732|2148->806|2186->817|2286->896|2324->907|2423->985|2461->996|2562->1076|2600->1087|2709->1175|2748->1187|3123->1535|3138->1541|3187->1569|3323->1675|3352->1693|3385->1696
                  LINES: 28->1|31->3|32->4|35->1|37->5|38->6|38->6|38->6|39->7|44->12|44->12|44->12|45->13|46->14|47->15|47->15|47->15|49->17|49->17|50->18|50->18|51->19|51->19|52->20|52->20|53->21|53->21|55->23|61->29|61->29|61->29|65->33|65->33|66->34
                  -- GENERATED --
              */
          