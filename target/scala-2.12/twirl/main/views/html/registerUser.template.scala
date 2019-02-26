
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


Seq[Any](format.raw/*2.1*/("""
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
                  DATE: Mon Feb 25 23:53:12 GMT 2019
                  SOURCE: C:/Users/Ryan3/Downloads/2ndYearProject (1)/2ndYearProject/app/views/registerUser.scala.html
                  HASH: 729f1251f8989057f0547d7649045f398b02b4ea
                  MATRIX: 994->1|1130->67|1174->65|1201->83|1228->85|1262->111|1300->112|1331->117|1658->418|1769->519|1810->521|1847->558|1884->657|1921->667|1934->671|1965->681|2004->693|2099->767|2136->777|2230->850|2267->860|2361->933|2398->943|2499->1023|2536->1033|2649->1124|2689->1137|3055->1476|3070->1482|3121->1512|3253->1614|3282->1632|3314->1634
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|42->11|42->11|42->11|43->12|44->13|45->14|45->14|45->14|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|52->21|52->21|57->26|63->32|63->32|63->32|67->36|67->36|68->37
                  -- GENERATED --
              */
          