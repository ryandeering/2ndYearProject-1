
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

object addDiscount extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.shopping.Discount],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(dForm: Form[models.shopping.Discount],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import models.users.User
/*4.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Add/Update Discount",user)/*6.34*/{_display_(Seq[Any](format.raw/*6.35*/("""
    """),format.raw/*7.5*/("""<p class="lead">Add a new discount.</p>

        <!-- Use a views.html.helpers package method to create the form (instead of html)-->
        <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*12.6*/form(action=routes.AdminProductCtrl.addDiscountSubmit(), 'class -> "form-horizontal", 'role -> "form")/*12.108*/ {_display_(Seq[Any](format.raw/*12.110*/("""
        """),format.raw/*13.37*/("""
        """),format.raw/*14.99*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""

        """),_display_(/*17.10*/inputText(dForm("discountID"), '_label -> "Discount ID", 'class -> "form-control")),format.raw/*17.92*/("""
        """),_display_(/*18.10*/inputText(dForm("discountName"), '_label -> "Discount Name", 'class -> "form-control")),format.raw/*18.96*/("""
        """),_display_(/*19.10*/inputText(dForm("amount"), '_label -> "Amount", 'class -> "form-control")),format.raw/*19.83*/("""
        """),format.raw/*20.9*/("""<input id=dForm("amount") type="checkbox" name=dForm("amount") $"""),format.raw/*20.73*/("""{"""),format.raw/*20.74*/("""dForm("amount") ? 'checked':''"""),format.raw/*20.104*/("""}"""),format.raw/*20.105*/("""  """),format.raw/*20.107*/("""/>

    <div class="actions">
        <input type="submit" value="Add Discount" class="btn btn-primary">
        <a href=""""),_display_(/*24.19*/routes/*24.25*/.AdminProductCtrl.discount()),format.raw/*24.53*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
""")))}),format.raw/*28.2*/(""" """),format.raw/*28.20*/("""
""")))}),format.raw/*29.2*/(""" """))
      }
    }
  }

  def render(dForm:Form[models.shopping.Discount],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(dForm,user)

  def f:((Form[models.shopping.Discount],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (dForm,user) => apply(dForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 05 19:03:43 BST 2019
                  SOURCE: F:/dsad/2ndYearProject2/app/views/AdminPanel/addDiscount.scala.html
                  HASH: 0c538f8c5131fcaaf6065f1a123ecf4240d93937
                  MATRIX: 1007->1|1143->67|1175->93|1219->65|1246->109|1273->111|1313->143|1351->144|1382->149|1714->455|1826->557|1867->559|1904->596|1941->695|1978->705|1991->709|2022->719|2060->730|2163->812|2200->822|2307->908|2344->918|2438->991|2474->1000|2566->1064|2595->1065|2654->1095|2684->1096|2715->1098|2865->1221|2880->1227|2929->1255|3061->1357|3090->1375|3122->1377
                  LINES: 28->1|31->3|32->4|35->2|36->5|37->6|37->6|37->6|38->7|43->12|43->12|43->12|44->13|45->14|46->15|46->15|46->15|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|51->20|51->20|51->20|51->20|55->24|55->24|55->24|59->28|59->28|60->29
                  -- GENERATED --
              */
          