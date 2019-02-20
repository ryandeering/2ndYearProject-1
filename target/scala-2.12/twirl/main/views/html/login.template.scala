
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

    """),_display_(/*8.6*/if(loginForm.hasGlobalErrors)/*8.35*/ {_display_(Seq[Any](format.raw/*8.37*/("""
        """),format.raw/*9.9*/("""<p class ="alert alert-warning">

        """),_display_(/*11.10*/for(e <- loginForm.globalErrors) yield /*11.42*/ {_display_(Seq[Any](format.raw/*11.44*/("""
            """),_display_(/*12.14*/e/*12.15*/.message),format.raw/*12.23*/("""<br/>
        """)))}),format.raw/*13.10*/("""
        """),format.raw/*14.9*/("""</p>
    """)))}),format.raw/*15.6*/("""

    """),_display_(/*17.6*/if(flash.containsKey("error"))/*17.36*/{_display_(Seq[Any](format.raw/*17.37*/("""
        """),format.raw/*18.9*/("""<div class="alert alert-success">
        """),_display_(/*19.10*/flash/*19.15*/.get("error")),format.raw/*19.28*/("""
        """),format.raw/*20.9*/("""</div>
    """)))}),format.raw/*21.6*/("""





    """),_display_(/*27.6*/helper/*27.12*/.form(action = controllers.routes.LoginController.loginSubmit())/*27.76*/ {_display_(Seq[Any](format.raw/*27.78*/("""
        """),_display_(/*28.10*/CSRF/*28.14*/.formField),format.raw/*28.24*/("""
        """),format.raw/*29.9*/("""<div class="form-group">
        """),_display_(/*30.10*/inputText(loginForm("email"), '_label -> "",
            'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*31.72*/("""
        """),format.raw/*32.9*/("""</div>
        <div class="form-group">
        """),_display_(/*34.10*/inputText(loginForm("password"), '_label -> "",
            'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*35.75*/("""
        """),format.raw/*36.9*/("""</div>
        <div class="form-group">
            <input type="submit" value="Sign In" class="btn btn-primary">
        </div>

    """)))}),format.raw/*41.6*/("""
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
                  DATE: Wed Feb 20 15:21:11 GMT 2019
                  SOURCE: /home/ryan/Documents/2ndYearProject/app/views/login.scala.html
                  HASH: 59a89c4d695bf4449f3f369535875935d38e4999
                  MATRIX: 651->1|1003->27|1124->77|1168->93|1195->95|1222->114|1260->115|1291->120|1339->143|1376->172|1415->174|1450->183|1520->226|1568->258|1608->260|1649->274|1659->275|1688->283|1734->298|1770->307|1810->317|1843->324|1882->354|1921->355|1957->364|2027->407|2041->412|2075->425|2111->434|2153->446|2190->457|2205->463|2278->527|2318->529|2355->539|2368->543|2399->553|2435->562|2496->596|2633->712|2669->721|2745->770|2888->892|2924->901|3089->1036|3121->1038
                  LINES: 24->1|29->2|32->3|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|42->11|42->11|42->11|43->12|43->12|43->12|44->13|45->14|46->15|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|52->21|58->27|58->27|58->27|58->27|59->28|59->28|59->28|60->29|61->30|62->31|63->32|65->34|66->35|67->36|72->41|73->42
                  -- GENERATED --
              */
          