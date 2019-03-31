
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

object basket extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Customer,Form[models.shopping.Discount],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, discountForm: Form[models.shopping.Discount]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import play.api.Play.current
/*4.2*/import models.shopping._
/*5.2*/import models.products._
/*6.2*/import helper._


Seq[Any](format.raw/*1.81*/("""

"""),format.raw/*7.1*/("""
"""),_display_(/*8.2*/main("Shopping Basket", customer)/*8.35*/ {_display_(Seq[Any](format.raw/*8.37*/("""
    """),format.raw/*9.138*/("""
        """),format.raw/*10.27*/("""

    """),format.raw/*12.5*/("""<head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />

        <script src="https://www.paypalobjects.com/api/checkout.js"></script>
    </head>
    <body>
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
				<th>Total</th>
				<th>Quantity</th>
                <th>Dec.</th>
                <th>Inc.</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*42.18*/if(customer.getBasket() != null)/*42.50*/ {_display_(Seq[Any](format.raw/*42.52*/("""
                    """),format.raw/*43.21*/("""<td>"""),_display_(/*43.26*/(customer.getBasket().discount.getDiscountID())),format.raw/*43.73*/("""</td>
                    """),_display_(/*44.22*/for(i <- customer.getBasket().getBasketItems()) yield /*44.69*/ {_display_(Seq[Any](format.raw/*44.71*/("""
                    """),format.raw/*45.21*/("""<tr>
                        <td>"""),_display_(/*46.30*/i/*46.31*/.getProduct.getName),format.raw/*46.50*/("""</td>
                        <td>"""),_display_(/*47.30*/i/*47.31*/.getProduct.getDescription()),format.raw/*47.59*/("""</td>
                        <td>&euro; """),_display_(/*48.37*/("%.2f".format(i.getPrice))),format.raw/*48.64*/("""</td>
                        <td>&euro; """),_display_(/*49.37*/("%.2f".format(i.getItemTotal))),format.raw/*49.68*/("""</td>
                        <td>"""),_display_(/*50.30*/i/*50.31*/.getQuantity()),format.raw/*50.45*/("""</td>
                        <td><a href=""""),_display_(/*51.39*/routes/*51.45*/.ShoppingCtrl.removeOne(i.getId,i.getProduct.getId())),format.raw/*51.98*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                        <td><a href=""""),_display_(/*52.39*/routes/*52.45*/.ShoppingCtrl.addOne(i.getId,i.getProduct.getId())),format.raw/*52.95*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                    </tr>
                    """)))}),format.raw/*54.22*/("""
              """)))}),format.raw/*55.16*/("""
			"""),format.raw/*56.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*60.69*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*60.119*/("""</strong></p>
            </div>  
        </div>

        <div class="row">
            <div class="col-md-12">
                Set Discount
                    """),_display_(/*67.22*/inputText(discountForm("discountID"), '_label -> "discount", 'class -> "form-control")),format.raw/*67.108*/("""
                    """),format.raw/*68.21*/("""<span class="glyphicon glyphicon-barcode"></span></a>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*74.31*/routes/*74.37*/.ShoppingCtrl.emptyBasket()),format.raw/*74.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*80.31*/routes/*80.37*/.ShoppingCtrl.placeOrder()),format.raw/*80.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                </p>
            </div>  
        </div>
        <div id="paypal-button"></div>
    </div>
</div>


    </body>
<script>
	function confirmDel() """),format.raw/*92.24*/("""{"""),format.raw/*92.25*/("""
		"""),format.raw/*93.3*/("""return confirm('Are you sure?');
	"""),format.raw/*94.2*/("""}"""),format.raw/*94.3*/("""
"""),format.raw/*95.1*/("""</script>



        <form action=""""),_display_(/*99.24*/routes/*99.30*/.ShoppingCtrl.placeOrder()),format.raw/*99.56*/("""" method="GET">
            <script
            src="https://checkout.stripe.com/checkout.js" class="stripe-button"
            data-key="pk_test_e9PCtT21TnhRh8b0iAgZ0erx"
            data-amount='"""),_display_(/*103.27*/("%.0f".format(customer.getBasket.getBasketTotal))),format.raw/*103.77*/("""00'
            data-name="CDR Games"
            data-description="Widget"
            data-image="https://i.imgur.com/LFo4Tjb.png"
            data-locale="auto"
            data-currency="eur">
            </script>
        </form>

""")))}),format.raw/*112.2*/("""



    """),format.raw/*116.5*/("""<keep-alive>

        <script>
  paypal.Button.render("""),format.raw/*119.24*/("""{"""),format.raw/*119.25*/("""
      """),format.raw/*120.7*/("""createOrder: function(data, actions) """),format.raw/*120.44*/("""{"""),format.raw/*120.45*/("""
          """),format.raw/*121.11*/("""return actions.order.create("""),format.raw/*121.39*/("""{"""),format.raw/*121.40*/("""
              """),format.raw/*122.15*/("""purchase_units: ["""),format.raw/*122.32*/("""{"""),format.raw/*122.33*/("""
                  """),format.raw/*123.19*/("""amount: """),format.raw/*123.27*/("""{"""),format.raw/*123.28*/("""
                      """),format.raw/*124.23*/("""value: '"""),_display_(/*124.32*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*124.82*/("""'
                  """),format.raw/*125.19*/("""}"""),format.raw/*125.20*/("""
              """),format.raw/*126.15*/("""}"""),format.raw/*126.16*/("""]
      """),format.raw/*127.7*/("""}"""),format.raw/*127.8*/(""")"""),format.raw/*127.9*/("""}"""),format.raw/*127.10*/(""",
      onAuthorize: function(data, actions) """),format.raw/*128.44*/("""{"""),format.raw/*128.45*/("""
          """),format.raw/*129.11*/("""return actions.request('/placeOrder')
      """),format.raw/*130.7*/("""}"""),format.raw/*130.8*/("""
      """),format.raw/*131.7*/("""}"""),format.raw/*131.8*/(""", '#paypal-button');
</script>


        """),format.raw/*135.21*/("""
  """),format.raw/*136.29*/("""
      """),format.raw/*137.45*/("""
      """),format.raw/*138.39*/("""
      """),format.raw/*139.45*/("""
          """),format.raw/*140.50*/("""
          """),format.raw/*141.67*/("""
                  """),format.raw/*142.44*/("""
                      """),format.raw/*143.64*/("""
                      """),format.raw/*144.41*/("""
                  """),format.raw/*145.26*/("""
      """),format.raw/*146.13*/("""
      """),format.raw/*147.44*/("""
      """),format.raw/*148.49*/("""
          """),format.raw/*149.50*/("""
          """),format.raw/*150.72*/("""
              """),format.raw/*151.41*/("""
          """),format.raw/*152.17*/("""
                  """),format.raw/*153.44*/("""
                      """),format.raw/*154.71*/("""
                  """),format.raw/*155.26*/("""
      """),format.raw/*156.12*/("""
  """),format.raw/*157.28*/("""
"""),format.raw/*158.14*/("""

    """),format.raw/*160.5*/("""</keep-alive>

"""))
      }
    }
  }

  def render(customer:models.users.Customer,discountForm:Form[models.shopping.Discount]): play.twirl.api.HtmlFormat.Appendable = apply(customer,discountForm)

  def f:((models.users.Customer,Form[models.shopping.Discount]) => play.twirl.api.HtmlFormat.Appendable) = (customer,discountForm) => apply(customer,discountForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 31 13:43:46 IST 2019
                  SOURCE: /home/ryan/2ndyearproj/2ndYearProject/app/views/basket.scala.html
                  HASH: 6b08047b212fb127875ae17da215c0b403974dae
                  MATRIX: 995->1|1147->85|1183->116|1215->143|1247->170|1292->80|1322->187|1350->190|1391->223|1430->225|1464->364|1502->392|1537->400|1872->709|1913->741|1953->743|1987->750|2059->795|2073->800|2109->815|2143->822|2184->833|2218->840|2559->1154|2600->1186|2640->1188|2690->1210|2722->1215|2790->1262|2845->1290|2908->1337|2948->1339|2998->1361|3060->1396|3070->1397|3110->1416|3173->1452|3183->1453|3232->1481|3302->1524|3350->1551|3420->1594|3472->1625|3535->1661|3545->1662|3580->1676|3652->1721|3667->1727|3741->1780|3871->1883|3886->1889|3957->1939|4100->2051|4148->2068|4180->2073|4361->2227|4433->2277|4630->2447|4738->2533|4788->2555|5039->2779|5054->2785|5102->2812|5430->3113|5445->3119|5492->3145|5809->3434|5838->3435|5869->3439|5931->3474|5959->3475|5988->3477|6055->3517|6070->3523|6117->3549|6347->3751|6419->3801|6696->4047|6736->4059|6822->4116|6852->4117|6888->4125|6954->4162|6984->4163|7025->4175|7082->4203|7112->4204|7157->4220|7203->4237|7233->4238|7282->4258|7319->4266|7349->4267|7402->4291|7439->4300|7511->4350|7561->4371|7591->4372|7636->4388|7666->4389|7703->4398|7732->4399|7761->4400|7791->4401|7866->4447|7896->4448|7937->4460|8010->4505|8039->4506|8075->4514|8104->4515|8178->4572|8211->4602|8248->4648|8285->4688|8322->4734|8363->4785|8404->4853|8453->4898|8506->4963|8559->5005|8608->5032|8645->5046|8682->5091|8719->5141|8760->5192|8801->5265|8846->5307|8887->5325|8936->5370|8989->5442|9038->5469|9075->5482|9108->5511|9139->5526|9175->5534
                  LINES: 28->1|31->3|32->4|33->5|34->6|37->1|39->7|40->8|40->8|40->8|41->9|42->10|44->12|55->23|55->23|55->23|56->24|57->25|57->25|57->25|58->26|59->27|61->29|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|78->46|78->46|78->46|79->47|79->47|79->47|80->48|80->48|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|84->52|84->52|84->52|86->54|87->55|88->56|92->60|92->60|99->67|99->67|100->68|106->74|106->74|106->74|112->80|112->80|112->80|124->92|124->92|125->93|126->94|126->94|127->95|131->99|131->99|131->99|135->103|135->103|144->112|148->116|151->119|151->119|152->120|152->120|152->120|153->121|153->121|153->121|154->122|154->122|154->122|155->123|155->123|155->123|156->124|156->124|156->124|157->125|157->125|158->126|158->126|159->127|159->127|159->127|159->127|160->128|160->128|161->129|162->130|162->130|163->131|163->131|167->135|168->136|169->137|170->138|171->139|172->140|173->141|174->142|175->143|176->144|177->145|178->146|179->147|180->148|181->149|182->150|183->151|184->152|185->153|186->154|187->155|188->156|189->157|190->158|192->160
                  -- GENERATED --
              */
          