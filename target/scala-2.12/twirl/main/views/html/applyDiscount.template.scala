
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


Seq[Any](format.raw/*3.51*/("""
"""),format.raw/*5.1*/("""
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
                  DATE: Wed Apr 03 23:20:42 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/a/2ndYearProject/app/views/applyDiscount.scala.html
                  HASH: aee48dc5ac440ac01129ec5ecaefa140cf92c2c5
                  MATRIX: 651->1|690->35|1054->66|1176->118|1221->115|1249->135|1277->138|1303->156|1342->158|1374->164|1440->205|1478->235|1517->237|1553->247|1623->290|1637->295|1671->308|1708->318|1751->331|1786->340|1930->474|1971->476|2009->487|2022->491|2053->501|2091->512|2272->671|2311->683|2464->809|2479->815|2526->841|2685->970
                  LINES: 24->1|25->2|30->3|33->4|36->3|37->5|38->6|38->6|38->6|39->7|40->8|40->8|40->8|41->9|42->10|42->10|42->10|43->11|44->12|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|50->18|52->20|52->20|52->20|56->24
                  -- GENERATED --
              */
          