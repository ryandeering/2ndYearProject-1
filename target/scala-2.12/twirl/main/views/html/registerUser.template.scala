
package views.html

import controllers._
import play.core.j.PlayFormsMagicForJava._
import play.core.j.PlayMagicForJava._
import play.data._

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
	"""),_display_(/*20.3*/inputText(userForm("address"), '_label -> "address", 'class -> "form-control")),format.raw/*20.81*/("""
        """),_display_(/*21.10*/inputText(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*21.90*/("""
        """),_display_(/*22.10*/inputText(userForm("role").copy(value=Some("customer")), '_label -> "",'hidden -> "hidden")),format.raw/*22.101*/("""




        """),format.raw/*27.9*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
    <div class="actions">
        <input type="submit" value="Register user" class="btn btn-primary">
        <a href=""""),_display_(/*33.19*/routes/*33.25*/.HomeController.registerUser()),format.raw/*33.55*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
""")))}),format.raw/*37.2*/(""" """),format.raw/*37.20*/("""
""")))}),format.raw/*38.2*/(""" """))
      }
    }
  }

  def render(userForm:Form[models.users.Customer],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[models.users.Customer],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 03 23:20:42 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/a/2ndYearProject/app/views/registerUser.scala.html
                  HASH: 1ca27e602f1eb37cecc93d4f5f39d1a41034122f
                  MATRIX: 994->1|1130->69|1175->64|1205->86|1233->89|1267->115|1305->116|1337->122|1669->428|1780->529|1821->531|1859->569|1897->669|1935->680|1948->684|1979->694|2021->709|2116->783|2154->794|2248->867|2286->878|2380->951|2410->955|2509->1033|2547->1044|2648->1124|2686->1135|2799->1226|2844->1244|3216->1589|3231->1595|3282->1625|3418->1731|3447->1749|3480->1752
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|43->11|43->11|43->11|44->12|45->13|46->14|46->14|46->14|49->17|49->17|50->18|50->18|51->19|51->19|52->20|52->20|53->21|53->21|54->22|54->22|59->27|65->33|65->33|65->33|69->37|69->37|70->38
                  -- GENERATED --
              */
          