
package views.html

import play.core.j.PlayMagicForJava._
import play.mvc.Http.Context.Implicit._

object orderConfirmed extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Customer,models.shopping.ShopOrder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, order: models.shopping.ShopOrder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/


Seq[Any](format.raw/*1.69*/("""


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
                  DATE: Wed Apr 03 23:20:42 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/a/2ndYearProject/app/views/orderConfirmed.scala.html
                  HASH: 37db96fa6de1c1ef948f4df3f8484960870d3691
                  MATRIX: 998->1|1138->75|1174->106|1206->133|1260->68|1292->159|1322->164|1366->200|1405->202|1436->206|1664->408|1705->440|1745->442|1779->449|1851->494|1865->499|1901->514|1935->521|1976->532|2010->539|2303->805|2329->822|2369->824|2421->849|2461->873|2501->875|2551->897|2613->932|2623->933|2663->952|2726->988|2736->989|2783->1015|2853->1058|2901->1085|2964->1121|2974->1122|3009->1136|3079->1179|3131->1210|3217->1265|3265->1282|3297->1287|3477->1440|3535->1476|3644->1555
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|41->9|41->9|41->9|43->11|52->20|52->20|52->20|53->21|54->22|54->22|54->22|55->23|56->24|58->26|70->38|70->38|70->38|72->40|72->40|72->40|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|77->45|77->45|77->45|78->46|78->46|80->48|81->49|82->50|86->54|86->54|92->60
                  -- GENERATED --
              */
          