
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
                  DATE: Sun Apr 07 12:28:05 IST 2019
                  SOURCE: /run/media/ryan/BEECC945ECC8F923/dsad/2ndYearProject2/app/views/AdminPanel/statistics.scala.html
                  HASH: 920d089c2b12a7cb6a7fccff0e4c7b44ce5ed6c2
                  MATRIX: 1037->1|1217->110|1261->127|1292->150|1330->151|1365->161|1384->172|1426->194|1457->198|1589->303|1609->314|1655->339|1714->371|1734->382|1784->411|1860->460|1880->471|1932->502|2002->545|2022->556|2076->589
                  LINES: 28->1|31->2|34->3|34->3|34->3|40->9|40->9|40->9|41->10|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15
                  -- GENERATED --
              */
          