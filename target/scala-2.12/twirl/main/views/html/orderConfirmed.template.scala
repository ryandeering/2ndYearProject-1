
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

<form action="listProducts" method="GET">
  <script
    src="https://checkout.stripe.com/checkout.js" class="stripe-button"
    data-key="pk_test_e9PCtT21TnhRh8b0iAgZ0erx"
    data-amount='"""),_display_(/*74.19*/("%.0f".format(order.getOrderTotal))),format.raw/*74.55*/("""00'
    data-name="Demo Site"
    data-description="Widget"
    data-image="https://stripe.com/img/documentation/checkout/marketplace.png"
    data-locale="auto"
    data-currency="eur">
  </script>
</form>


""")))}),format.raw/*84.2*/("""
"""),format.raw/*85.1*/("""<keep-alive>
<script>

    document.getElementById("paypal-button-container").onload = function() """),format.raw/*88.76*/("""{"""),format.raw/*88.77*/("""paypal.Buttons().render('#paypal-button-container');"""),format.raw/*88.129*/("""}"""),format.raw/*88.130*/("""

  
"""),format.raw/*91.1*/("""</script>

<script>
paypal.Buttons("""),format.raw/*94.16*/("""{"""),format.raw/*94.17*/("""
    """),format.raw/*95.5*/("""createOrder: function(data, actions) """),format.raw/*95.42*/("""{"""),format.raw/*95.43*/("""
      """),format.raw/*96.7*/("""// Set up the transaction
      return actions.order.create("""),format.raw/*97.35*/("""{"""),format.raw/*97.36*/("""
        """),format.raw/*98.9*/("""purchase_units: ["""),format.raw/*98.26*/("""{"""),format.raw/*98.27*/("""
          """),format.raw/*99.11*/("""amount: """),format.raw/*99.19*/("""{"""),format.raw/*99.20*/("""
            """),format.raw/*100.13*/("""value: '"""),_display_(/*100.22*/("%.2f".format(order.getOrderTotal))),format.raw/*100.58*/("""'
          """),format.raw/*101.11*/("""}"""),format.raw/*101.12*/("""
        """),format.raw/*102.9*/("""}"""),format.raw/*102.10*/("""]
      """),format.raw/*103.7*/("""}"""),format.raw/*103.8*/(""");
    """),format.raw/*104.5*/("""}"""),format.raw/*104.6*/("""
  """),format.raw/*105.3*/("""}"""),format.raw/*105.4*/(""").render('#paypal-button-container');
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
                  DATE: Thu Mar 21 19:55:55 GMT 2019
                  SOURCE: /home/ryan/rawr/2ndYearProject2/app/views/orderConfirmed.scala.html
                  HASH: b410eccb61e906f13e737d0c66891d9d41f10932
                  MATRIX: 998->1|1138->72|1174->102|1206->128|1259->69|1287->153|1315->156|1359->192|1398->194|1427->196|1722->465|1763->497|1803->499|1836->505|1907->549|1921->554|1957->569|1990->575|2030->585|2062->590|2343->844|2369->861|2409->863|2459->886|2499->910|2539->912|2588->933|2649->967|2659->968|2699->987|2761->1022|2771->1023|2818->1049|2887->1091|2935->1118|2997->1153|3007->1154|3042->1168|3111->1210|3163->1241|3247->1294|3294->1310|3325->1314|3501->1463|3559->1499|3925->1838|3982->1874|4222->2084|4250->2085|4376->2183|4405->2184|4486->2236|4516->2237|4548->2242|4611->2277|4640->2278|4672->2283|4737->2320|4766->2321|4800->2328|4888->2388|4917->2389|4953->2398|4998->2415|5027->2416|5066->2427|5102->2435|5131->2436|5173->2449|5210->2458|5268->2494|5309->2506|5339->2507|5376->2516|5406->2517|5442->2525|5471->2526|5506->2533|5535->2534|5566->2537|5595->2538
                  LINES: 28->1|31->4|32->5|33->6|36->2|38->7|40->9|40->9|40->9|42->11|54->23|54->23|54->23|55->24|56->25|56->25|56->25|57->26|58->27|60->29|72->41|72->41|72->41|74->43|74->43|74->43|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|79->48|79->48|79->48|80->49|80->49|82->51|83->52|84->53|88->57|88->57|105->74|105->74|115->84|116->85|119->88|119->88|119->88|119->88|122->91|125->94|125->94|126->95|126->95|126->95|127->96|128->97|128->97|129->98|129->98|129->98|130->99|130->99|130->99|131->100|131->100|131->100|132->101|132->101|133->102|133->102|134->103|134->103|135->104|135->104|136->105|136->105
                  -- GENERATED --
              */
          