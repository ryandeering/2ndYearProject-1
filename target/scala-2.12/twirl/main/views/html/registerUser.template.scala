
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

object registerUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.users.Valid],Form[models.users.Customer],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(vf: Form[models.users.Valid] ,userForm: Form[models.users.Customer],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.6*/import helper._


Seq[Any](format.raw/*2.1*/("""
    """),format.raw/*4.1*/("""
    """),_display_(/*5.6*/main("Register User",user)/*5.32*/{_display_(Seq[Any](format.raw/*5.33*/("""

        """),_display_(/*7.10*/if(flash.containsKey("error"))/*7.40*/ {_display_(Seq[Any](format.raw/*7.42*/("""
            """),format.raw/*8.13*/("""<div class="alert alert-danger">
            """),_display_(/*9.14*/flash/*9.19*/.get("error")),format.raw/*9.32*/("""
            """),format.raw/*10.13*/("""</div>
        """)))}),format.raw/*11.10*/("""

        """),format.raw/*13.9*/("""<p class="lead">Registration</p>

            <!-- Use a views.html.helpers package method to create the form (instead of html)-->
            <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
        """),_display_(/*18.10*/form(action=routes.HomeController.registerUserSubmit(), 'class -> "form-horizontal", 'role -> "form")/*18.111*/ {_display_(Seq[Any](format.raw/*18.113*/("""
            """),format.raw/*19.41*/("""
            """),format.raw/*20.103*/("""
            """),_display_(/*21.14*/CSRF/*21.18*/.formField),format.raw/*21.28*/("""


            """),_display_(/*24.14*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*24.88*/("""
            """),_display_(/*25.14*/inputText(userForm("fName"), '_label -> "Name", 'class -> "form-control")),format.raw/*25.87*/("""
            """),_display_(/*26.14*/inputText(userForm("lName"), '_label -> "Name", 'class -> "form-control")),format.raw/*26.87*/("""
            """),_display_(/*27.14*/inputText(userForm("address"), '_label -> "address", 'class -> "form-control")),format.raw/*27.92*/("""
            """),_display_(/*28.14*/inputText(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*28.94*/("""
            """),_display_(/*29.14*/inputText(vf("password2"), '_label -> "Confirm Password", 'class -> "form-control")),format.raw/*29.97*/("""
            """),_display_(/*30.14*/inputText(userForm("role").copy(value=Some("customer")), '_label -> "",'hidden -> "hidden")),format.raw/*30.105*/("""




            """),format.raw/*35.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
        <div class="actions">
            <input type="submit" value="Register user" class="btn btn-primary">
            <a href=""""),_display_(/*41.23*/routes/*41.29*/.HomeController.registerUser()),format.raw/*41.59*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*45.6*/(""" """),format.raw/*45.24*/("""
    """)))}),format.raw/*46.6*/(""" """))
      }
    }
  }

  def render(vf:Form[models.users.Valid],userForm:Form[models.users.Customer],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(vf,userForm,user)

  def f:((Form[models.users.Valid],Form[models.users.Customer],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (vf,userForm,user) => apply(vf,userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 05 19:03:44 BST 2019
                  SOURCE: F:/dsad/2ndYearProject2/app/views/registerUser.scala.html
                  HASH: 6d9a61992f1b4e90e2097980277c206b22415a95
                  MATRIX: 1019->1|1185->101|1229->95|1260->117|1291->123|1325->149|1363->150|1400->161|1438->191|1477->193|1517->206|1589->252|1602->257|1635->270|1676->283|1723->299|1760->309|2098->620|2209->721|2250->723|2291->764|2333->867|2374->881|2387->885|2418->895|2461->911|2556->985|2597->999|2691->1072|2732->1086|2826->1159|2867->1173|2966->1251|3007->1265|3108->1345|3149->1359|3253->1442|3294->1456|3407->1547|3452->1564|3830->1915|3845->1921|3896->1951|4044->2069|4073->2087|4109->2093
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|49->18|49->18|49->18|50->19|51->20|52->21|52->21|52->21|55->24|55->24|56->25|56->25|57->26|57->26|58->27|58->27|59->28|59->28|60->29|60->29|61->30|61->30|66->35|72->41|72->41|72->41|76->45|76->45|77->46
                  -- GENERATED --
              */
          