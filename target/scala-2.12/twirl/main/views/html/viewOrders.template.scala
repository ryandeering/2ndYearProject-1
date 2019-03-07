
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

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import play.api.Play.current
/*3.2*/import models.shopping._
/*4.2*/import models.products._


Seq[Any](format.raw/*5.1*/("""
    """),format.raw/*6.5*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*7.2*/main("View Orders", customer)/*7.31*/ {_display_(Seq[Any](format.raw/*7.33*/("""


    """),format.raw/*10.5*/("""<div class="col-md-12">
        """),_display_(/*11.10*/if(flash.containsKey("success"))/*11.42*/ {_display_(Seq[Any](format.raw/*11.44*/("""
            """),format.raw/*12.13*/("""<div class="alert alert-success">
            """),_display_(/*13.14*/flash/*13.19*/.get("success")),format.raw/*13.34*/("""
            """),format.raw/*14.13*/("""</div>
        """)))}),format.raw/*15.10*/("""



            """),format.raw/*19.13*/("""<!-- Start of For loop - For each p in products add a row -->
        """),_display_(/*20.10*/for(o <- customer.getOrders()) yield /*20.40*/ {_display_(Seq[Any](format.raw/*20.42*/("""

            """),format.raw/*22.13*/("""<p>Order Number: """),_display_(/*22.31*/o/*22.32*/.getId()),format.raw/*22.40*/("""</p>
            <p>Order Date: """),_display_(/*23.29*/o/*23.30*/.getOrderDateString()),format.raw/*23.51*/("""</p>
            <table class="table table-bordered table-hover table-condensed">

                <thead>
                        <!-- The header row-->
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Quantity</th>
                        <th>Price</th>
                        <th>Total</th>
                    </tr>
                </thead>
                <tbody>
                    """),_display_(/*37.22*/for(i <- o.getItems()) yield /*37.44*/ {_display_(Seq[Any](format.raw/*37.46*/("""

                        """),format.raw/*39.25*/("""<tr>
                            <td>"""),_display_(/*40.34*/i/*40.35*/.getId),format.raw/*40.41*/("""</td>
                            <td>"""),_display_(/*41.34*/i/*41.35*/.getProduct.getName()),format.raw/*41.56*/("""</td>
                            <td>"""),_display_(/*42.34*/i/*42.35*/.getQuantity()),format.raw/*42.49*/("""</td>
                            <td>&euro; """),_display_(/*43.41*/("%.2f".format(i.getPrice()))),format.raw/*43.70*/("""</td>
                            <td>&euro; """),_display_(/*44.41*/("%.2f".format(i.getItemTotal))),format.raw/*44.72*/("""</td>

                        </tr>
                    """)))}),format.raw/*47.22*/("""<!-- End of For loop -->

                </tbody>
            </table>
            <div class="row">
                <div class="col-md-12">
                    <p class="text-right"><strong>Order Total: &euro; """),_display_(/*53.72*/("%.2f".format(o.getOrderTotal))),format.raw/*53.104*/("""</strong></p>
                </div>
            </div>
            <p>
                <a href=""""),_display_(/*57.27*/routes/*57.33*/.ShoppingCtrl.cancelOrder(o.getId())),format.raw/*57.69*/("""">
                    <button class="btn btn-primary">Cancel Order</button>
                </a>
            </p>
        """)))}),format.raw/*61.10*/("""<!-- End of For loop -->

    </div>
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.users.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 07 12:25:23 GMT 2019
                  SOURCE: /home/ryan/rawr/2ndYearProject2/app/views/viewOrders.scala.html
                  HASH: 4c324a0c93d89843a8d5de95608f58d2f6362f9f
                  MATRIX: 968->1|1074->36|1110->66|1142->92|1195->117|1226->122|1297->168|1334->197|1373->199|1407->206|1467->239|1508->271|1548->273|1589->286|1663->333|1677->338|1713->353|1754->366|1801->382|1845->398|1943->469|1989->499|2029->501|2071->515|2116->533|2126->534|2155->542|2215->575|2225->576|2267->597|2763->1066|2801->1088|2841->1090|2895->1116|2960->1154|2970->1155|2997->1161|3063->1200|3073->1201|3115->1222|3181->1261|3191->1262|3226->1276|3299->1322|3349->1351|3422->1397|3474->1428|3563->1486|3803->1699|3857->1731|3982->1829|3997->1835|4054->1871|4209->1995
                  LINES: 28->1|31->2|32->3|33->4|36->5|37->6|38->7|38->7|38->7|41->10|42->11|42->11|42->11|43->12|44->13|44->13|44->13|45->14|46->15|50->19|51->20|51->20|51->20|53->22|53->22|53->22|53->22|54->23|54->23|54->23|68->37|68->37|68->37|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|75->44|75->44|78->47|84->53|84->53|88->57|88->57|88->57|92->61
                  -- GENERATED --
              */
          