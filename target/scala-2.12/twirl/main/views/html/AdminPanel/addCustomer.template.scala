
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
<<<<<<< HEAD
                  DATE: Thu Mar 21 19:55:56 GMT 2019
                  SOURCE: /home/ryan/rawr/2ndYearProject2/app/views/AdminPanel/addCustomer.scala.html
=======
                  DATE: Wed Mar 20 19:32:02 GMT 2019
                  SOURCE: /home/wdd/2ndYrProject/2ndYearProject/app/views/AdminPanel/addCustomer.scala.html
>>>>>>> c0659dac054e747f3bb0e777503a54584ddf7b5d
                  HASH: f899ac255d76b43d47d42346acebaf234bbaa0ca
                  MATRIX: 1004->1|1137->65|1181->62|1209->81|1236->83|1269->108|1307->109|1338->114|1669->419|1777->517|1818->519|1855->556|1892->655|1929->665|1942->669|1973->679|2010->689|2102->760|2139->770|2236->846|2273->856|2369->931|2406->941|2504->1018|2541->1028|2650->1116|2687->1126|2769->1187|2806->1197|3178->1542|3193->1548|3245->1579|3377->1681|3406->1699|3438->1701|3467->1719
                  LINES: 28->1|31->4|34->2|36->5|37->6|37->6|37->6|38->7|43->12|43->12|43->12|44->13|45->14|46->15|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|52->21|52->21|54->23|60->29|60->29|60->29|64->33|64->33|65->34|65->34
                  -- GENERATED --
              */
          