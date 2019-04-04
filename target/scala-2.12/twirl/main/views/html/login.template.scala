
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
/*1.2*/import models.users.User

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(loginForm: Form[models.users.Login], user:User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.50*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Login", user)/*5.21*/{_display_(Seq[Any](format.raw/*5.22*/("""
    """),format.raw/*6.5*/("""<h3>Sign in</h3>

"""),_display_(/*8.2*/if(loginForm.hasGlobalErrors)/*8.31*/ {_display_(Seq[Any](format.raw/*8.33*/("""
    """),format.raw/*9.5*/("""<p class ="alert alert-warning">

    """),_display_(/*11.6*/for(e <- loginForm.globalErrors) yield /*11.38*/ {_display_(Seq[Any](format.raw/*11.40*/("""
        """),_display_(/*12.10*/e/*12.11*/.message),format.raw/*12.19*/("""<br/>
    """)))}),format.raw/*13.6*/("""
"""),format.raw/*14.1*/("""</p>
""")))}),format.raw/*15.2*/("""

"""),_display_(/*17.2*/if(flash.containsKey("error"))/*17.32*/{_display_(Seq[Any](format.raw/*17.33*/("""
    """),format.raw/*18.5*/("""<div class="alert alert-success">
        """),_display_(/*19.10*/flash/*19.15*/.get("error")),format.raw/*19.28*/("""
    """),format.raw/*20.5*/("""</div>
""")))}),format.raw/*21.2*/("""





"""),_display_(/*27.2*/helper/*27.8*/.form(action = controllers.routes.LoginController.loginSubmit())/*27.72*/ {_display_(Seq[Any](format.raw/*27.74*/("""
"""),_display_(/*28.2*/CSRF/*28.6*/.formField),format.raw/*28.16*/("""
"""),format.raw/*29.1*/("""<div class="form-group">
    """),_display_(/*30.6*/inputText(loginForm("email"), '_label -> "",
    'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*31.64*/("""
"""),format.raw/*32.1*/("""</div>
<div class="form-group">
    """),_display_(/*34.6*/inputPassword(loginForm("password"), '_label -> "",
    'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*35.67*/("""
"""),format.raw/*36.1*/("""</div>
<div class="form-group">
    <input type="submit" value="Sign In" class="btn btn-primary">
</div>

""")))}),format.raw/*41.2*/("""
""")))}),format.raw/*42.2*/("""



"""))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 04 01:09:47 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/app/views/login.scala.html
                  HASH: b9e81c7dbe1e688525ed91a7bd799b3aff49fed2
                  MATRIX: 651->1|1003->28|1124->79|1169->76|1197->96|1225->99|1252->118|1290->119|1322->125|1368->146|1405->175|1444->177|1476->183|1543->224|1591->256|1631->258|1669->269|1679->270|1708->278|1750->290|1779->292|1816->299|1847->304|1886->334|1925->335|1958->341|2029->385|2043->390|2077->403|2110->409|2149->418|2188->431|2202->437|2275->501|2315->503|2344->506|2356->510|2387->520|2416->522|2473->553|2603->662|2632->664|2697->703|2837->822|2866->824|3008->936|3041->939
                  LINES: 24->1|29->2|32->3|35->2|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|41->9|43->11|43->11|43->11|44->12|44->12|44->12|45->13|46->14|47->15|49->17|49->17|49->17|50->18|51->19|51->19|51->19|52->20|53->21|59->27|59->27|59->27|59->27|60->28|60->28|60->28|61->29|62->30|63->31|64->32|66->34|67->35|68->36|73->41|74->42
                  -- GENERATED --
              */
          