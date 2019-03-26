
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


Seq[Any](format.raw/*2.1*/("""
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
<<<<<<< HEAD
                  DATE: Thu Mar 21 19:55:56 GMT 2019
                  SOURCE: /home/ryan/rawr/2ndYearProject2/app/views/AdminPanel/addAdmin.scala.html
=======
                  DATE: Wed Mar 20 19:32:02 GMT 2019
                  SOURCE: /home/wdd/2ndYrProject/2ndYearProject/app/views/AdminPanel/addAdmin.scala.html
>>>>>>> c0659dac054e747f3bb0e777503a54584ddf7b5d
                  HASH: 36d8c2b465497c192de4f230c6a21fb941ac8f2c
                  MATRIX: 998->1|1131->64|1163->90|1207->62|1234->106|1261->108|1291->130|1329->131|1360->136|1696->446|1803->543|1844->545|1881->582|1918->681|1955->691|1968->695|1999->705|2037->716|2132->790|2169->800|2269->879|2306->889|2405->967|2442->977|2543->1057|2580->1067|2689->1155|2726->1165|3095->1507|3110->1513|3159->1541|3291->1643|3320->1661|3352->1663
                  LINES: 28->1|31->3|32->4|35->2|36->5|37->6|37->6|37->6|38->7|43->12|43->12|43->12|44->13|45->14|46->15|46->15|46->15|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|52->21|52->21|54->23|60->29|60->29|60->29|64->33|64->33|65->34
                  -- GENERATED --
              */
          