
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


Seq[Any](format.raw/*1.109*/("""
"""),_display_(/*3.2*/main("Statistics",user)/*3.25*/{_display_(Seq[Any](format.raw/*3.26*/("""



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
                  DATE: Wed Apr 03 23:20:42 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/a/2ndYearProject/app/views/AdminPanel/statistics.scala.html
                  HASH: 859489a1f7c6371363b564bf7a60b011207fcbd5
                  MATRIX: 1037->1|1217->111|1263->108|1291->129|1322->152|1360->153|1397->164|1426->168|1445->179|1490->204|1527->216|1546->227|1588->249|1620->254
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|39->7|39->7|39->7|39->7|41->9|41->9|41->9|42->10
                  -- GENERATED --
              */
          