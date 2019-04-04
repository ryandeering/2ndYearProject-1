
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

object basket extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import play.api.Play.current
/*4.2*/import models.shopping._
/*5.2*/import models.products._
/*6.2*/import helper._


Seq[Any](format.raw/*1.35*/("""

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
                    """),_display_(/*43.22*/for(i <- customer.getBasket().getBasketItems()) yield /*43.69*/ {_display_(Seq[Any](format.raw/*43.71*/("""
                    """),format.raw/*44.21*/("""<tr>
                        <td>"""),_display_(/*45.30*/i/*45.31*/.getProduct.getName),format.raw/*45.50*/("""</td>
                        <td>"""),_display_(/*46.30*/i/*46.31*/.getProduct.getDescription()),format.raw/*46.59*/("""</td>
                        <td>&euro; """),_display_(/*47.37*/("%.2f".format(i.getPrice))),format.raw/*47.64*/("""</td>
                        <td>&euro; """),_display_(/*48.37*/("%.2f".format(i.getItemTotal))),format.raw/*48.68*/("""</td>
                        <td>"""),_display_(/*49.30*/i/*49.31*/.getQuantity()),format.raw/*49.45*/("""</td>
                        <td><a href=""""),_display_(/*50.39*/routes/*50.45*/.ShoppingCtrl.removeOne(i.getId,i.getProduct.getId())),format.raw/*50.98*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                        <td><a href=""""),_display_(/*51.39*/routes/*51.45*/.ShoppingCtrl.addOne(i.getId,i.getProduct.getId())),format.raw/*51.95*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                    </tr>
                    """)))}),format.raw/*53.22*/("""
              """)))}),format.raw/*54.16*/("""
			"""),format.raw/*55.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*59.69*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*59.119*/("""</strong></p>
                """),_display_(/*60.18*/if(customer.getBasket.discount.getDiscountID() != "null")/*60.75*/{_display_(Seq[Any](format.raw/*60.76*/("""
                    """),format.raw/*61.21*/("""<p class="text-right"><strong>Discount Applied: </a> """),_display_(/*61.75*/(customer.getBasket().discount.getDiscountID())),format.raw/*61.122*/("""</strong></p>
                """)))}),format.raw/*62.18*/("""
            """),format.raw/*63.13*/("""</div>  
        </div>

        <div class="row">
            <div class="col-md-12">
                <a href=""""),_display_(/*68.27*/routes/*68.33*/.ShoppingCtrl.applyDiscount()),format.raw/*68.62*/("""">
                    <button class="btn btn-primary">Apply Discount</button>
                </a>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*76.31*/routes/*76.37*/.ShoppingCtrl.emptyBasket()),format.raw/*76.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*82.31*/routes/*82.37*/.ShoppingCtrl.placeOrder()),format.raw/*82.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                </p>
            </div>  
        </div>
        <div id="paypal-button"></div>
    </div>
</div>


    </body>
<script>
	function confirmDel() """),format.raw/*94.24*/("""{"""),format.raw/*94.25*/("""
		"""),format.raw/*95.3*/("""return confirm('Are you sure?');
	"""),format.raw/*96.2*/("""}"""),format.raw/*96.3*/("""
"""),format.raw/*97.1*/("""</script>



        <form action=""""),_display_(/*101.24*/routes/*101.30*/.ShoppingCtrl.placeOrder()),format.raw/*101.56*/("""" method="GET">
            <script
            src="https://checkout.stripe.com/checkout.js" class="stripe-button"
            data-key="pk_test_hpLfBptgL9qbpWeuJgoX3AO500njVt1MOk"
            data-amount='"""),_display_(/*105.27*/("%.0f".format(customer.getBasket.getBasketTotal))),format.raw/*105.77*/("""00'
            data-name="CDR Games"
            data-description="Widget"
            data-image="https://i.imgur.com/LFo4Tjb.png"
            data-locale="auto"
            data-currency="eur">
            </script>
        </form>

""")))}),format.raw/*114.2*/("""



    """),format.raw/*118.5*/("""<keep-alive>

        <script>
  paypal.Button.render("""),format.raw/*121.24*/("""{"""),format.raw/*121.25*/("""
      """),format.raw/*122.7*/("""createOrder: function(data, actions) """),format.raw/*122.44*/("""{"""),format.raw/*122.45*/("""
          """),format.raw/*123.11*/("""return actions.order.create("""),format.raw/*123.39*/("""{"""),format.raw/*123.40*/("""
              """),format.raw/*124.15*/("""purchase_units: ["""),format.raw/*124.32*/("""{"""),format.raw/*124.33*/("""
                  """),format.raw/*125.19*/("""amount: """),format.raw/*125.27*/("""{"""),format.raw/*125.28*/("""
                      """),format.raw/*126.23*/("""value: '"""),_display_(/*126.32*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*126.82*/("""'
                  """),format.raw/*127.19*/("""}"""),format.raw/*127.20*/("""
              """),format.raw/*128.15*/("""}"""),format.raw/*128.16*/("""]
      """),format.raw/*129.7*/("""}"""),format.raw/*129.8*/(""")"""),format.raw/*129.9*/("""}"""),format.raw/*129.10*/(""",
      onAuthorize: function(data, actions) """),format.raw/*130.44*/("""{"""),format.raw/*130.45*/("""
          """),format.raw/*131.11*/("""return actions.request('/placeOrder')
      """),format.raw/*132.7*/("""}"""),format.raw/*132.8*/("""
      """),format.raw/*133.7*/("""}"""),format.raw/*133.8*/(""", '#paypal-button');
</script>


        """),format.raw/*137.21*/("""
  """),format.raw/*138.29*/("""
      """),format.raw/*139.45*/("""
      """),format.raw/*140.39*/("""
      """),format.raw/*141.45*/("""
          """),format.raw/*142.50*/("""
          """),format.raw/*143.67*/("""
                  """),format.raw/*144.44*/("""
                      """),format.raw/*145.64*/("""
                      """),format.raw/*146.41*/("""
                  """),format.raw/*147.26*/("""
      """),format.raw/*148.13*/("""
      """),format.raw/*149.44*/("""
      """),format.raw/*150.49*/("""
          """),format.raw/*151.50*/("""
          """),format.raw/*152.72*/("""
              """),format.raw/*153.41*/("""
          """),format.raw/*154.17*/("""
                  """),format.raw/*155.44*/("""
                      """),format.raw/*156.71*/("""
                  """),format.raw/*157.26*/("""
      """),format.raw/*158.12*/("""
  """),format.raw/*159.28*/("""
"""),format.raw/*160.14*/("""

    """),format.raw/*162.5*/("""</keep-alive>

"""))
      }
    }
  }

  def render(customer:models.users.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.users.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 04 11:05:27 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/app/views/basket.scala.html
                  HASH: d8f69771fc72a0862aeebfd3b37f1c60ad0c1cd4
                  MATRIX: 964->1|1070->39|1106->70|1138->97|1170->124|1215->34|1245->141|1273->144|1314->177|1353->179|1387->318|1425->346|1460->354|1795->663|1836->695|1876->697|1910->704|1982->749|1996->754|2032->769|2066->776|2107->787|2141->794|2482->1108|2523->1140|2563->1142|2613->1165|2676->1212|2716->1214|2766->1236|2828->1271|2838->1272|2878->1291|2941->1327|2951->1328|3000->1356|3070->1399|3118->1426|3188->1469|3240->1500|3303->1536|3313->1537|3348->1551|3420->1596|3435->1602|3509->1655|3639->1758|3654->1764|3725->1814|3868->1926|3916->1943|3948->1948|4129->2102|4201->2152|4260->2184|4326->2241|4365->2242|4415->2264|4496->2318|4565->2365|4628->2397|4670->2411|4815->2529|4830->2535|4880->2564|5179->2836|5194->2842|5242->2869|5570->3170|5585->3176|5632->3202|5949->3491|5978->3492|6009->3496|6071->3531|6099->3532|6128->3534|6196->3574|6212->3580|6260->3606|6500->3818|6572->3868|6849->4114|6889->4126|6975->4183|7005->4184|7041->4192|7107->4229|7137->4230|7178->4242|7235->4270|7265->4271|7310->4287|7356->4304|7386->4305|7435->4325|7472->4333|7502->4334|7555->4358|7592->4367|7664->4417|7714->4438|7744->4439|7789->4455|7819->4456|7856->4465|7885->4466|7914->4467|7944->4468|8019->4514|8049->4515|8090->4527|8163->4572|8192->4573|8228->4581|8257->4582|8331->4639|8364->4669|8401->4715|8438->4755|8475->4801|8516->4852|8557->4920|8606->4965|8659->5030|8712->5072|8761->5099|8798->5113|8835->5158|8872->5208|8913->5259|8954->5332|8999->5374|9040->5392|9089->5437|9142->5509|9191->5536|9228->5549|9261->5578|9292->5593|9328->5601
                  LINES: 28->1|31->3|32->4|33->5|34->6|37->1|39->7|40->8|40->8|40->8|41->9|42->10|44->12|55->23|55->23|55->23|56->24|57->25|57->25|57->25|58->26|59->27|61->29|74->42|74->42|74->42|75->43|75->43|75->43|76->44|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|80->48|80->48|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|85->53|86->54|87->55|91->59|91->59|92->60|92->60|92->60|93->61|93->61|93->61|94->62|95->63|100->68|100->68|100->68|108->76|108->76|108->76|114->82|114->82|114->82|126->94|126->94|127->95|128->96|128->96|129->97|133->101|133->101|133->101|137->105|137->105|146->114|150->118|153->121|153->121|154->122|154->122|154->122|155->123|155->123|155->123|156->124|156->124|156->124|157->125|157->125|157->125|158->126|158->126|158->126|159->127|159->127|160->128|160->128|161->129|161->129|161->129|161->129|162->130|162->130|163->131|164->132|164->132|165->133|165->133|169->137|170->138|171->139|172->140|173->141|174->142|175->143|176->144|177->145|178->146|179->147|180->148|181->149|182->150|183->151|184->152|185->153|186->154|187->155|188->156|189->157|190->158|191->159|192->160|194->162
                  -- GENERATED --
              */
          