
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

object orderConfirmed extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Customer,models.shopping.ShopOrder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, order: models.shopping.ShopOrder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*7.1*/("""

"""),_display_(/*9.2*/main("Order Confirmation", customer)/*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/("""

"""),format.raw/*11.1*/("""<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />

</head>

<div class="row">

	<div class="col-md-12">
		"""),_display_(/*20.4*/if(flash.containsKey("success"))/*20.36*/ {_display_(Seq[Any](format.raw/*20.38*/("""
			  """),format.raw/*21.6*/("""<div class="alert alert-success">
			      """),_display_(/*22.11*/flash/*22.16*/.get("success")),format.raw/*22.31*/("""
			  """),format.raw/*23.6*/("""</div>
		""")))}),format.raw/*24.4*/(""" 

		"""),format.raw/*26.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>

			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Quantity</th>
                <th>Total</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*38.18*/if(order != null)/*38.35*/ {_display_(Seq[Any](format.raw/*38.37*/("""

                    """),_display_(/*40.22*/for(i <- order.getItems) yield /*40.46*/ {_display_(Seq[Any](format.raw/*40.48*/("""
                    """),format.raw/*41.21*/("""<tr>
                        <td>"""),_display_(/*42.30*/i/*42.31*/.getProduct.getName),format.raw/*42.50*/("""</td>
                        <td>"""),_display_(/*43.30*/i/*43.31*/.getProduct.getDescription),format.raw/*43.57*/("""</td>
                        <td>&euro; """),_display_(/*44.37*/("%.2f".format(i.getPrice))),format.raw/*44.64*/("""</td>
                        <td>"""),_display_(/*45.30*/i/*45.31*/.getQuantity()),format.raw/*45.45*/("""</td>
                        <td>&euro; """),_display_(/*46.37*/("%.2f".format(i.getItemTotal))),format.raw/*46.68*/("""</td>
                    </tr>
                    """)))}),format.raw/*48.22*/("""
              """)))}),format.raw/*49.16*/("""
			"""),format.raw/*50.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*54.68*/("%.2f".format(order.getOrderTotal))),format.raw/*54.104*/("""</strong></p>
            </div>
        </div>
        </div>
 
</div>
""")))}),format.raw/*60.2*/("""
"""))
      }
    }
  }

  def render(customer:models.users.Customer,order:models.shopping.ShopOrder): play.twirl.api.HtmlFormat.Appendable = apply(customer,order)

  def f:((models.users.Customer,models.shopping.ShopOrder) => play.twirl.api.HtmlFormat.Appendable) = (customer,order) => apply(customer,order)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 04 21:01:49 IST 2019
                  SOURCE: /home/ryan/Downloads/aa/2ndYearProject/app/views/orderConfirmed.scala.html
                  HASH: 3cd7034ce421ee922071ca7e4cbce228087b6ecc
                  MATRIX: 998->1|1138->72|1174->102|1206->128|1259->69|1287->153|1315->156|1359->192|1398->194|1427->196|1646->389|1687->421|1727->423|1760->429|1831->473|1845->478|1881->493|1914->499|1954->509|1986->514|2267->768|2293->785|2333->787|2383->810|2423->834|2463->836|2512->857|2573->891|2583->892|2623->911|2685->946|2695->947|2742->973|2811->1015|2859->1042|2921->1077|2931->1078|2966->1092|3035->1134|3087->1165|3171->1218|3218->1234|3249->1238|3425->1387|3483->1423|3586->1496
                  LINES: 28->1|31->4|32->5|33->6|36->2|38->7|40->9|40->9|40->9|42->11|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|55->24|57->26|69->38|69->38|69->38|71->40|71->40|71->40|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|76->45|76->45|76->45|77->46|77->46|79->48|80->49|81->50|85->54|85->54|91->60
                  -- GENERATED --
              */
          