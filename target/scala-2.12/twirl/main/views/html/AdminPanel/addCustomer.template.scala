
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

object addCustomer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Customer],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cForm: Form[models.users.Customer],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*1.62*/("""


"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Add Customer",user)/*6.27*/{_display_(Seq[Any](format.raw/*6.28*/("""
    """),format.raw/*7.5*/("""<p class="lead">Add a new customer</p>

        <!-- Use a views.html.helpers package method to create the form (instead of html)-->
        <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*12.6*/form(action=routes.HomeController.addCustomerSubmit, 'class -> "form-horizontal", 'role -> "form")/*12.104*/ {_display_(Seq[Any](format.raw/*12.106*/("""
        """),format.raw/*13.37*/("""
        """),format.raw/*14.99*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""
        """),_display_(/*16.10*/inputText(cForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*16.81*/("""
        """),_display_(/*17.10*/inputText(cForm("fName"), '_label -> "First Name", 'class -> "form-control")),format.raw/*17.86*/("""
        """),_display_(/*18.10*/inputText(cForm("lName"), '_label -> "Last Name", 'class -> "form-control")),format.raw/*18.85*/("""
        """),_display_(/*19.10*/inputText(cForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*19.87*/("""
        """),_display_(/*20.10*/inputText(cForm("role").copy(value=Some("customer")), '_label -> "",'hidden -> "hidden")),format.raw/*20.98*/("""
        """),_display_(/*21.10*/inputText(cForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*21.71*/("""

        """),format.raw/*23.9*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
    <div class="actions">
        <input type="submit" value="Add/Update Customer" class="btn btn-primary">
        <a href=""""),_display_(/*29.19*/routes/*29.25*/.HomeController.usersCustomer()),format.raw/*29.56*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
""")))}),format.raw/*33.2*/(""" """),format.raw/*33.20*/("""
""")))}),format.raw/*34.2*/(""" """),format.raw/*34.20*/("""
"""))
      }
    }
  }

  def render(cForm:Form[models.users.Customer],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(cForm,user)

  def f:((Form[models.users.Customer],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (cForm,user) => apply(cForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 01 15:30:42 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/app/views/AdminPanel/addCustomer.scala.html
                  HASH: 5f9a07a83655b052f8627ced5a8a14a4d925ebf1
                  MATRIX: 1004->1|1137->68|1182->61|1214->85|1242->88|1275->113|1313->114|1345->120|1681->430|1789->528|1830->530|1868->568|1906->668|1944->679|1957->683|1988->693|2026->704|2118->775|2156->786|2253->862|2291->873|2387->948|2425->959|2523->1036|2561->1047|2670->1135|2708->1146|2790->1207|2829->1219|3207->1570|3222->1576|3274->1607|3410->1713|3439->1731|3472->1734|3501->1752
                  LINES: 28->1|31->4|34->1|37->5|38->6|38->6|38->6|39->7|44->12|44->12|44->12|45->13|46->14|47->15|47->15|47->15|48->16|48->16|49->17|49->17|50->18|50->18|51->19|51->19|52->20|52->20|53->21|53->21|55->23|61->29|61->29|61->29|65->33|65->33|66->34|66->34
                  -- GENERATED --
              */
          