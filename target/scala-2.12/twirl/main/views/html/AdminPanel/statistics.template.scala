
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





   """),_display_(/*9.5*/controllers/*9.16*/.Statistics.PieChart()),format.raw/*9.38*/("""
   """),format.raw/*10.4*/("""<td><img src="\assets\images\statImages\PieChart.jpeg"/></td>
   <span></span>
   <p>Most popular game: """),_display_(/*12.27*/controllers/*12.38*/.Statistics.popularGame()),format.raw/*12.63*/("""</p>
   <p>Most used discount: """),_display_(/*13.28*/controllers/*13.39*/.Statistics.popularDiscount()),format.raw/*13.68*/("""</p>
   <p>Amount of customers in the database: """),_display_(/*14.45*/controllers/*14.56*/.Statistics.amountofCustomers()),format.raw/*14.87*/("""</p>
   <p>Median amount spent per order: """),_display_(/*15.39*/controllers/*15.50*/.Statistics.medianAmountSpentfr()),format.raw/*15.83*/("""</p>


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
                  DATE: Thu Apr 04 01:09:46 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/app/views/AdminPanel/statistics.scala.html
                  HASH: 6f878b6bfcc32f6a9f2cd27dff72ce3b07f45170
                  MATRIX: 1037->1|1217->111|1263->108|1291->129|1322->152|1360->153|1401->169|1420->180|1462->202|1494->207|1628->314|1648->325|1694->350|1754->383|1774->394|1824->423|1901->473|1921->484|1973->515|2044->559|2064->570|2118->603
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|41->9|41->9|41->9|42->10|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15
                  -- GENERATED --
              */
          