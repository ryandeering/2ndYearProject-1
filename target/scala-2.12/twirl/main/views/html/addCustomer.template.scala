
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

object addCustomer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Customer],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cForm: Form[models.users.Customer],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*2.1*/("""

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
                  DATE: Wed Feb 27 21:14:18 GMT 2019
                  SOURCE: /home/ryan/Documents/2ndYearProject/app/views/addCustomer.scala.html
                  HASH: f899ac255d76b43d47d42346acebaf234bbaa0ca
                  MATRIX: 993->1|1126->65|1170->62|1198->81|1225->83|1258->108|1296->109|1327->114|1658->419|1766->517|1807->519|1844->556|1881->655|1918->665|1931->669|1962->679|1999->689|2091->760|2128->770|2225->846|2262->856|2358->931|2395->941|2493->1018|2530->1028|2639->1116|2676->1126|2758->1187|2795->1197|3167->1542|3182->1548|3234->1579|3366->1681|3395->1699|3427->1701|3456->1719
                  LINES: 28->1|31->4|34->2|36->5|37->6|37->6|37->6|38->7|43->12|43->12|43->12|44->13|45->14|46->15|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|52->21|52->21|54->23|60->29|60->29|60->29|64->33|64->33|65->34|65->34
                  -- GENERATED --
              */
          