
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
/*1.2*/import models.shopping.Discount
/*2.2*/import models.users.Customer

object applyDiscount extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Discount],users.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(discountForm: Form[Discount], c: users.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Discount",c)/*6.20*/ {_display_(Seq[Any](format.raw/*6.22*/("""
    """),format.raw/*7.5*/("""<p class="lead">Apply Discount</p>
    """),_display_(/*8.6*/if(flash.containsKey("error"))/*8.36*/ {_display_(Seq[Any](format.raw/*8.38*/("""
        """),format.raw/*9.9*/("""<div class="alert alert-danger">
        """),_display_(/*10.10*/flash/*10.15*/.get("error")),format.raw/*10.28*/("""
        """),format.raw/*11.9*/("""</div>
    """)))}),format.raw/*12.6*/("""

    """),_display_(/*14.6*/form(action=routes.ShoppingCtrl.applyDiscountSubmit(), 'class -> "form-horizontal", 'role -> "form",'enctype -> "multipart/form-data")/*14.140*/ {_display_(Seq[Any](format.raw/*14.142*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""
        """),_display_(/*16.10*/inputText(discountForm("discountID"), '_label -> "Enter your discount code here. Only valid codes accepted. One discount per order.", 'class -> "form-control")),format.raw/*16.169*/("""

        """),format.raw/*18.9*/("""<div class="actions">
            <input type="submit" value="Submit" class="btn-md btn-default btn">
            <a href=""""),_display_(/*20.23*/routes/*20.29*/.ShoppingCtrl.showBasket()),format.raw/*20.55*/("""">
                <button type="button" class="btn-md btn-default btn">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*24.6*/("""
""")))}))
      }
    }
  }

  def render(discountForm:Form[Discount],c:users.Customer): play.twirl.api.HtmlFormat.Appendable = apply(discountForm,c)

  def f:((Form[Discount],users.Customer) => play.twirl.api.HtmlFormat.Appendable) = (discountForm,c) => apply(discountForm,c)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 05 19:03:43 BST 2019
                  SOURCE: F:/dsad/2ndYearProject2/app/views/applyDiscount.scala.html
                  HASH: 5c370f0673e5a5ee067dcc38c8cdf4ef8cf18d93
                  MATRIX: 651->1|690->34|1054->64|1176->115|1220->131|1247->133|1273->151|1312->153|1343->158|1408->198|1446->228|1485->230|1520->239|1589->281|1603->286|1637->299|1673->308|1715->320|1748->327|1892->461|1933->463|1970->473|1983->477|2014->487|2051->497|2232->656|2269->666|2420->790|2435->796|2482->822|2637->947
                  LINES: 24->1|25->2|30->3|33->4|36->5|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|49->18|51->20|51->20|51->20|55->24
                  -- GENERATED --
              */
          