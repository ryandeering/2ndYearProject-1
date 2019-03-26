
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

<<<<<<< HEAD
<form action="listProducts" method="GET">
=======
<form action=""""),_display_(/*73.16*/routes/*73.22*/.ShoppingCtrl.viewOrders()),format.raw/*73.48*/("""" method="GET">
>>>>>>> c0659dac054e747f3bb0e777503a54584ddf7b5d
  <script
    src="https://checkout.stripe.com/checkout.js" class="stripe-button"
    data-key="pk_test_e9PCtT21TnhRh8b0iAgZ0erx"
    data-amount='"""),_display_(/*78.19*/("%.0f".format(order.getOrderTotal))),format.raw/*78.55*/("""00'
    data-name="Demo Site"
    data-description="Widget"
    data-image="https://stripe.com/img/documentation/checkout/marketplace.png"
    data-locale="auto"
    data-currency="eur">
  </script>
</form>


""")))}),format.raw/*88.2*/("""
"""),format.raw/*89.1*/("""<keep-alive>
<script>

    document.getElementById("paypal-button-container").onload = function() """),format.raw/*92.76*/("""{"""),format.raw/*92.77*/("""paypal.Buttons().render('#paypal-button-container');"""),format.raw/*92.129*/("""}"""),format.raw/*92.130*/("""

  
"""),format.raw/*95.1*/("""</script>

<script>
paypal.Buttons("""),format.raw/*98.16*/("""{"""),format.raw/*98.17*/("""
    """),format.raw/*99.5*/("""createOrder: function(data, actions) """),format.raw/*99.42*/("""{"""),format.raw/*99.43*/("""
      """),format.raw/*100.7*/("""// Set up the transaction
      return actions.order.create("""),format.raw/*101.35*/("""{"""),format.raw/*101.36*/("""
        """),format.raw/*102.9*/("""purchase_units: ["""),format.raw/*102.26*/("""{"""),format.raw/*102.27*/("""
          """),format.raw/*103.11*/("""amount: """),format.raw/*103.19*/("""{"""),format.raw/*103.20*/("""
            """),format.raw/*104.13*/("""value: '"""),_display_(/*104.22*/("%.2f".format(order.getOrderTotal))),format.raw/*104.58*/("""'
          """),format.raw/*105.11*/("""}"""),format.raw/*105.12*/("""
        """),format.raw/*106.9*/("""}"""),format.raw/*106.10*/("""]
      """),format.raw/*107.7*/("""}"""),format.raw/*107.8*/(""");
    """),format.raw/*108.5*/("""}"""),format.raw/*108.6*/("""
  """),format.raw/*109.3*/("""}"""),format.raw/*109.4*/(""").render('#paypal-button-container');
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
                  DATE: Tue Mar 26 20:30:39 GMT 2019
                  SOURCE: /home/ryan/rawr/2ndYearProject2/app/views/orderConfirmed.scala.html
                  HASH: 36350331fd36e7b4491a73ec073c7f73c6f4dfe1
                  MATRIX: 998->1|1138->72|1174->102|1206->128|1259->69|1287->153|1315->156|1359->192|1398->194|1427->196|1722->465|1763->497|1803->499|1836->505|1907->549|1921->554|1957->569|1990->575|2030->585|2062->590|2343->844|2369->861|2409->863|2459->886|2499->910|2539->912|2588->933|2649->967|2659->968|2699->987|2761->1022|2771->1023|2818->1049|2887->1091|2935->1118|2997->1153|3007->1154|3042->1168|3111->1210|3163->1241|3247->1294|3294->1310|3325->1314|3501->1463|3559->1499|3813->1726|3828->1732|3875->1758|4115->1971|4172->2007|4412->2217|4440->2218|4566->2316|4595->2317|4676->2369|4706->2370|4738->2375|4801->2410|4830->2411|4862->2416|4927->2453|4956->2454|4991->2461|5080->2521|5110->2522|5147->2531|5193->2548|5223->2549|5263->2560|5300->2568|5330->2569|5372->2582|5409->2591|5467->2627|5508->2639|5538->2640|5575->2649|5605->2650|5641->2658|5670->2659|5705->2666|5734->2667|5765->2670|5794->2671
                  LINES: 28->1|31->4|32->5|33->6|36->2|38->7|40->9|40->9|40->9|42->11|54->23|54->23|54->23|55->24|56->25|56->25|56->25|57->26|58->27|60->29|72->41|72->41|72->41|74->43|74->43|74->43|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|79->48|79->48|79->48|80->49|80->49|82->51|83->52|84->53|88->57|88->57|104->73|104->73|104->73|109->78|109->78|119->88|120->89|123->92|123->92|123->92|123->92|126->95|129->98|129->98|130->99|130->99|130->99|131->100|132->101|132->101|133->102|133->102|133->102|134->103|134->103|134->103|135->104|135->104|135->104|136->105|136->105|137->106|137->106|138->107|138->107|139->108|139->108|140->109|140->109
                  -- GENERATED --
              */
          