
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

object statistics extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.products.Product],List[models.shopping.ShopOrder],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.products.Product], orders: List[models.shopping.ShopOrder], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](_display_(/*3.2*/main("Statistics",user)/*3.25*/{_display_(Seq[Any](format.raw/*3.26*/("""



   """),format.raw/*7.4*/("""<p>"""),_display_(/*7.8*/controllers/*7.19*/.Statistics.medianPrice()),format.raw/*7.44*/("""</p>

   """),_display_(/*9.5*/controllers/*9.16*/.Statistics.PieChart()),format.raw/*9.38*/("""
   """),format.raw/*10.4*/("""<td><img src="\assets\images\statImages\PieChart.jpeg"/></td>




""")))}))
      }
    }
  }

  def render(products:List[models.products.Product],orders:List[models.shopping.ShopOrder],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(products,orders,user)

  def f:((List[models.products.Product],List[models.shopping.ShopOrder],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (products,orders,user) => apply(products,orders,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 28 12:29:26 GMT 2019
                  SOURCE: /home/ryan/rawr/2ndYearProject2/app/views/AdminPanel/statistics.scala.html
                  HASH: dc7672c3c2dca7d99c94c0f6ad1be65bcbd74e55
                  MATRIX: 1037->1|1217->110|1261->127|1292->150|1330->151|1363->158|1392->162|1411->173|1456->198|1491->208|1510->219|1552->241|1583->245
                  LINES: 28->1|31->2|34->3|34->3|34->3|38->7|38->7|38->7|38->7|40->9|40->9|40->9|41->10
                  -- GENERATED --
              */
          