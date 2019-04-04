
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


Seq[Any](format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Login", user)/*5.21*/{_display_(Seq[Any](format.raw/*5.22*/("""
    """),format.raw/*6.5*/("""<h3>Sign in</h3>

"""),_display_(/*8.2*/if(loginForm.hasGlobalErrors)/*8.31*/ {_display_(Seq[Any](format.raw/*8.33*/("""
    """),format.raw/*9.5*/("""<p class ="alert alert-warning">

    """),_display_(/*11.6*/for(e <- loginForm.globalErrors) yield /*11.38*/ {_display_(Seq[Any](format.raw/*11.40*/("""
        """),_display_(/*12.10*/e/*12.11*/.message),format.raw/*12.19*/("""<br/>
    """)))}),format.raw/*13.6*/("""
"""),format.raw/*14.1*/("""</p>
""")))}),format.raw/*15.2*/("""

    """),_display_(/*17.6*/if(flash.containsKey("error"))/*17.36*/ {_display_(Seq[Any](format.raw/*17.38*/("""
        """),format.raw/*18.9*/("""<div class="alert alert-danger">
        """),_display_(/*19.10*/flash/*19.15*/.get("error")),format.raw/*19.28*/("""
        """),format.raw/*20.9*/("""</div>
    """)))}),format.raw/*21.6*/("""



"""),_display_(/*25.2*/if(flash.containsKey("success"))/*25.34*/{_display_(Seq[Any](format.raw/*25.35*/("""
    """),format.raw/*26.5*/("""<div class="alert alert-success">
        """),_display_(/*27.10*/flash/*27.15*/.get("success")),format.raw/*27.30*/("""
    """),format.raw/*28.5*/("""</div>
""")))}),format.raw/*29.2*/("""





"""),_display_(/*35.2*/helper/*35.8*/.form(action = controllers.routes.LoginController.loginSubmit())/*35.72*/ {_display_(Seq[Any](format.raw/*35.74*/("""
"""),_display_(/*36.2*/CSRF/*36.6*/.formField),format.raw/*36.16*/("""
"""),format.raw/*37.1*/("""<div class="form-group">
    """),_display_(/*38.6*/inputText(loginForm("email"), '_label -> "",
    'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*39.64*/("""
"""),format.raw/*40.1*/("""</div>
<div class="form-group">
    """),_display_(/*42.6*/inputPassword(loginForm("password"), '_label -> "",
    'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*43.67*/("""
"""),format.raw/*44.1*/("""</div>
<div class="form-group">
    <input type="submit" value="Sign In" class="btn btn-primary">
</div>

""")))}),format.raw/*49.2*/("""
""")))}),format.raw/*50.2*/("""



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
                  DATE: Thu Apr 04 21:01:49 IST 2019
                  SOURCE: /home/ryan/Downloads/aa/2ndYearProject/app/views/login.scala.html
                  HASH: 045eb24d09bc01333ccc2a1734ecf65376dd2ec0
                  MATRIX: 651->1|1003->27|1124->77|1168->93|1195->95|1222->114|1260->115|1291->120|1335->139|1372->168|1411->170|1442->175|1507->214|1555->246|1595->248|1632->258|1642->259|1671->267|1712->278|1740->279|1776->285|1809->292|1848->322|1888->324|1924->333|1993->375|2007->380|2041->393|2077->402|2119->414|2150->419|2191->451|2230->452|2262->457|2332->500|2346->505|2382->520|2414->525|2452->533|2485->540|2499->546|2572->610|2612->612|2640->614|2652->618|2683->628|2711->629|2767->659|2896->767|2924->768|2987->805|3126->923|3154->924|3291->1031|3323->1033
                  LINES: 24->1|29->2|32->3|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|42->11|42->11|42->11|43->12|43->12|43->12|44->13|45->14|46->15|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|52->21|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|60->29|66->35|66->35|66->35|66->35|67->36|67->36|67->36|68->37|69->38|70->39|71->40|73->42|74->43|75->44|80->49|81->50
                  -- GENERATED --
              */
          