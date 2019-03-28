
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


Seq[Any](format.raw/*1.69*/("""


"""),format.raw/*7.1*/("""

"""),_display_(/*9.2*/main("Order Confirmation", customer)/*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/("""

"""),format.raw/*11.1*/("""<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />

  <script
    src="https://www.paypal.com/sdk/js?client-id=sb">
  </script>
</head>

<div class="row">

	<div class="col-md-12">
		"""),_display_(/*23.4*/if(flash.containsKey("success"))/*23.36*/ {_display_(Seq[Any](format.raw/*23.38*/("""
			  """),format.raw/*24.6*/("""<div class="alert alert-success">
			      """),_display_(/*25.11*/flash/*25.16*/.get("success")),format.raw/*25.31*/("""
			  """),format.raw/*26.6*/("""</div>
		""")))}),format.raw/*27.4*/(""" 

		"""),format.raw/*29.3*/("""<table class="table table-bordered table-hover table-condensed">
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
                """),_display_(/*41.18*/if(order != null)/*41.35*/ {_display_(Seq[Any](format.raw/*41.37*/("""

                    """),_display_(/*43.22*/for(i <- order.getItems) yield /*43.46*/ {_display_(Seq[Any](format.raw/*43.48*/("""
                    """),format.raw/*44.21*/("""<tr>
                        <td>"""),_display_(/*45.30*/i/*45.31*/.getProduct.getName),format.raw/*45.50*/("""</td>
                        <td>"""),_display_(/*46.30*/i/*46.31*/.getProduct.getDescription),format.raw/*46.57*/("""</td>
                        <td>&euro; """),_display_(/*47.37*/("%.2f".format(i.getPrice))),format.raw/*47.64*/("""</td>
                        <td>"""),_display_(/*48.30*/i/*48.31*/.getQuantity()),format.raw/*48.45*/("""</td>
                        <td>&euro; """),_display_(/*49.37*/("%.2f".format(i.getItemTotal))),format.raw/*49.68*/("""</td>
                    </tr>
                    """)))}),format.raw/*51.22*/("""
              """)))}),format.raw/*52.16*/("""
			"""),format.raw/*53.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*57.68*/("%.2f".format(order.getOrderTotal))),format.raw/*57.104*/("""</strong></p>
            </div>  
 

  

        </div>
        </div>
 
</div>
<div id="paypal-button-container"></div>
<h1> Pay Via Stripe </h1>

<form action="listProducts" method="GET">
=======
<form action=""""),_display_(/*72.16*/routes/*72.22*/.ShoppingCtrl.viewOrders()),format.raw/*72.48*/("""" method="GET">
  <script
    src="https://checkout.stripe.com/checkout.js" class="stripe-button"
    data-key="pk_test_e9PCtT21TnhRh8b0iAgZ0erx"
    data-amount='"""),_display_(/*76.19*/("%.0f".format(order.getOrderTotal))),format.raw/*76.55*/("""00'
    data-name="Demo Site"
    data-description="Widget"
    data-image="https://stripe.com/img/documentation/checkout/marketplace.png"
    data-locale="auto"
    data-currency="eur">
  </script>
</form>


""")))}),format.raw/*86.2*/("""
"""),format.raw/*87.1*/("""<keep-alive>
<script>

    document.getElementById("paypal-button-container").onload = function() """),format.raw/*90.76*/("""{"""),format.raw/*90.77*/("""paypal.Buttons().render('#paypal-button-container');"""),format.raw/*90.129*/("""}"""),format.raw/*90.130*/("""

  
"""),format.raw/*93.1*/("""</script>

<script>
paypal.Buttons("""),format.raw/*96.16*/("""{"""),format.raw/*96.17*/("""
    """),format.raw/*97.5*/("""createOrder: function(data, actions) """),format.raw/*97.42*/("""{"""),format.raw/*97.43*/("""
      """),format.raw/*98.7*/("""// Set up the transaction
      return actions.order.create("""),format.raw/*99.35*/("""{"""),format.raw/*99.36*/("""
        """),format.raw/*100.9*/("""purchase_units: ["""),format.raw/*100.26*/("""{"""),format.raw/*100.27*/("""
          """),format.raw/*101.11*/("""amount: """),format.raw/*101.19*/("""{"""),format.raw/*101.20*/("""
            """),format.raw/*102.13*/("""value: '"""),_display_(/*102.22*/("%.2f".format(order.getOrderTotal))),format.raw/*102.58*/("""'
          """),format.raw/*103.11*/("""}"""),format.raw/*103.12*/("""
        """),format.raw/*104.9*/("""}"""),format.raw/*104.10*/("""]
      """),format.raw/*105.7*/("""}"""),format.raw/*105.8*/(""");
    """),format.raw/*106.5*/("""}"""),format.raw/*106.6*/("""
  """),format.raw/*107.3*/("""}"""),format.raw/*107.4*/(""").render('#paypal-button-container');
</script>



</keep-alive>"""))
      }
    }
  }

  def render(customer:models.users.Customer,order:models.shopping.ShopOrder): play.twirl.api.HtmlFormat.Appendable = apply(customer,order)

  def f:((models.users.Customer,models.shopping.ShopOrder) => play.twirl.api.HtmlFormat.Appendable) = (customer,order) => apply(customer,order)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 28 18:31:20 GMT 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/app/views/orderConfirmed.scala.html
                  HASH: 7d867b4771ac76f5ad2e9b7666641ea21358ecc4
                  MATRIX: 998->1|1138->75|1174->106|1206->133|1260->68|1292->159|1322->164|1366->200|1405->202|1436->206|1743->487|1784->519|1824->521|1858->528|1930->573|1944->578|1980->593|2014->600|2055->611|2089->618|2382->884|2408->901|2448->903|2500->928|2540->952|2580->954|2630->976|2692->1011|2702->1012|2742->1031|2805->1067|2815->1068|2862->1094|2932->1137|2980->1164|3043->1200|3053->1201|3088->1215|3158->1258|3210->1289|3296->1344|3344->1361|3376->1366|3556->1519|3614->1555|3870->1784|3885->1790|3932->1816|4127->1984|4184->2020|4434->2240|4463->2242|4592->2343|4621->2344|4702->2396|4732->2397|4767->2405|4833->2443|4862->2444|4895->2450|4960->2487|4989->2488|5024->2496|5113->2557|5142->2558|5180->2568|5226->2585|5256->2586|5297->2598|5334->2606|5364->2607|5407->2621|5444->2630|5502->2666|5544->2679|5574->2680|5612->2690|5642->2691|5679->2700|5708->2701|5744->2709|5773->2710|5805->2714|5834->2715
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|41->9|41->9|41->9|43->11|55->23|55->23|55->23|56->24|57->25|57->25|57->25|58->26|59->27|61->29|73->41|73->41|73->41|75->43|75->43|75->43|76->44|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|80->48|80->48|80->48|81->49|81->49|83->51|84->52|85->53|89->57|89->57|104->72|104->72|104->72|108->76|108->76|118->86|119->87|122->90|122->90|122->90|122->90|125->93|128->96|128->96|129->97|129->97|129->97|130->98|131->99|131->99|132->100|132->100|132->100|133->101|133->101|133->101|134->102|134->102|134->102|135->103|135->103|136->104|136->104|137->105|137->105|138->106|138->106|139->107|139->107
                  -- GENERATED --
              */
          