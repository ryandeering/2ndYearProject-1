
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


Seq[Any](format.raw/*1.65*/("""

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
                  DATE: Wed Apr 03 23:20:41 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/a/2ndYearProject/app/views/AdminPanel/addDiscount.scala.html
                  HASH: daa3993e25d38428967e29fd9207a3c4b2d2b339
                  MATRIX: 1007->1|1143->69|1175->96|1220->64|1250->113|1278->116|1318->148|1356->149|1388->155|1725->466|1837->568|1878->570|1916->608|1954->708|1992->719|2005->723|2036->733|2076->746|2179->828|2217->839|2324->925|2362->936|2456->1009|2493->1019|2585->1083|2614->1084|2673->1114|2703->1115|2734->1117|2888->1244|2903->1250|2952->1278|3088->1384|3117->1402|3150->1405
                  LINES: 28->1|31->3|32->4|35->1|37->5|38->6|38->6|38->6|39->7|44->12|44->12|44->12|45->13|46->14|47->15|47->15|47->15|49->17|49->17|50->18|50->18|51->19|51->19|52->20|52->20|52->20|52->20|52->20|52->20|56->24|56->24|56->24|60->28|60->28|61->29
                  -- GENERATED --
              */
          