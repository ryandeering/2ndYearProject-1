
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


Seq[Any](format.raw/*2.1*/("""
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

        """),_display_(/*24.10*/if(flash.containsKey("error"))/*24.40*/ {_display_(Seq[Any](format.raw/*24.42*/("""
            """),format.raw/*25.13*/("""<div class="alert alert-danger">
            """),_display_(/*26.14*/flash/*26.19*/.get("error")),format.raw/*26.32*/("""
            """),format.raw/*27.13*/("""</div>
        """)))}),format.raw/*28.10*/("""


        """),format.raw/*31.9*/("""<table class="table table-bordered table-hover table-condensed">
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
                """),_display_(/*44.18*/if(customer.getBasket() != null)/*44.50*/ {_display_(Seq[Any](format.raw/*44.52*/("""
                    """),_display_(/*45.22*/for(i <- customer.getBasket().getBasketItems()) yield /*45.69*/ {_display_(Seq[Any](format.raw/*45.71*/("""
                    """),format.raw/*46.21*/("""<tr>
                        <td>"""),_display_(/*47.30*/i/*47.31*/.getProduct.getName),format.raw/*47.50*/("""</td>
                        <td>"""),_display_(/*48.30*/i/*48.31*/.getProduct.getDescription()),format.raw/*48.59*/("""</td>
                        <td>&euro; """),_display_(/*49.37*/("%.2f".format(i.getPrice))),format.raw/*49.64*/("""</td>
                        <td>&euro; """),_display_(/*50.37*/("%.2f".format(i.getItemTotal))),format.raw/*50.68*/("""</td>
                        <td>"""),_display_(/*51.30*/i/*51.31*/.getQuantity()),format.raw/*51.45*/("""</td>
                        <td><a href=""""),_display_(/*52.39*/routes/*52.45*/.ShoppingCtrl.removeOne(i.getId,i.getProduct.getId())),format.raw/*52.98*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                        <td><a href=""""),_display_(/*53.39*/routes/*53.45*/.ShoppingCtrl.addOne(i.getId,i.getProduct.getId())),format.raw/*53.95*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                    </tr>
                    """)))}),format.raw/*55.22*/("""
              """)))}),format.raw/*56.16*/("""
			"""),format.raw/*57.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*61.69*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*61.119*/("""</strong></p>
                """),_display_(/*62.18*/if(customer.getBasket.discount.getDiscountID() != "null")/*62.75*/{_display_(Seq[Any](format.raw/*62.76*/("""
                    """),format.raw/*63.21*/("""<p class="text-right"><strong>Discount Applied: </a> """),_display_(/*63.75*/(customer.getBasket().discount.getDiscountID())),format.raw/*63.122*/("""</strong></p>
                """)))}),format.raw/*64.18*/("""
            """),format.raw/*65.13*/("""</div>  
        </div>

        <div class="row">
            <div class="col-md-12">
                <a href=""""),_display_(/*70.27*/routes/*70.33*/.ShoppingCtrl.applyDiscount()),format.raw/*70.62*/("""">
                    <button class="btn btn-primary">Apply Discount</button>
                </a>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*78.31*/routes/*78.37*/.ShoppingCtrl.emptyBasket()),format.raw/*78.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*84.31*/routes/*84.37*/.ShoppingCtrl.placeOrder()),format.raw/*84.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                </p>
            </div>  
        </div>
        <div id="paypal-button"></div>
    </div>
</div>


    </body>
<script>
	function confirmDel() """),format.raw/*96.24*/("""{"""),format.raw/*96.25*/("""
		"""),format.raw/*97.3*/("""return confirm('Are you sure?');
	"""),format.raw/*98.2*/("""}"""),format.raw/*98.3*/("""
"""),format.raw/*99.1*/("""</script>



        <form action=""""),_display_(/*103.24*/routes/*103.30*/.ShoppingCtrl.placeOrder()),format.raw/*103.56*/("""" method="GET">
            <script
            src="https://checkout.stripe.com/checkout.js" class="stripe-button"
            data-key="pk_test_hpLfBptgL9qbpWeuJgoX3AO500njVt1MOk"
            data-amount='"""),_display_(/*107.27*/("%.0f".format(customer.getBasket.getBasketTotal))),format.raw/*107.77*/("""00'
            data-name="CDR Games"
            data-description="Widget"
            data-image="https://i.imgur.com/LFo4Tjb.png"
            data-locale="auto"
            data-currency="eur">
            </script>
        </form>

""")))}),format.raw/*116.2*/("""



    """),format.raw/*120.5*/("""<keep-alive>

        <script>
  paypal.Button.render("""),format.raw/*123.24*/("""{"""),format.raw/*123.25*/("""
      """),format.raw/*124.7*/("""createOrder: function(data, actions) """),format.raw/*124.44*/("""{"""),format.raw/*124.45*/("""
          """),format.raw/*125.11*/("""return actions.order.create("""),format.raw/*125.39*/("""{"""),format.raw/*125.40*/("""
              """),format.raw/*126.15*/("""purchase_units: ["""),format.raw/*126.32*/("""{"""),format.raw/*126.33*/("""
                  """),format.raw/*127.19*/("""amount: """),format.raw/*127.27*/("""{"""),format.raw/*127.28*/("""
                      """),format.raw/*128.23*/("""value: '"""),_display_(/*128.32*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*128.82*/("""'
                  """),format.raw/*129.19*/("""}"""),format.raw/*129.20*/("""
              """),format.raw/*130.15*/("""}"""),format.raw/*130.16*/("""]
      """),format.raw/*131.7*/("""}"""),format.raw/*131.8*/(""")"""),format.raw/*131.9*/("""}"""),format.raw/*131.10*/(""",
      onAuthorize: function(data, actions) """),format.raw/*132.44*/("""{"""),format.raw/*132.45*/("""
          """),format.raw/*133.11*/("""return actions.request('/placeOrder')
      """),format.raw/*134.7*/("""}"""),format.raw/*134.8*/("""
      """),format.raw/*135.7*/("""}"""),format.raw/*135.8*/(""", '#paypal-button');
</script>


        """),format.raw/*139.21*/("""
  """),format.raw/*140.29*/("""
      """),format.raw/*141.45*/("""
      """),format.raw/*142.39*/("""
      """),format.raw/*143.45*/("""
          """),format.raw/*144.50*/("""
          """),format.raw/*145.67*/("""
                  """),format.raw/*146.44*/("""
                      """),format.raw/*147.64*/("""
                      """),format.raw/*148.41*/("""
                  """),format.raw/*149.26*/("""
      """),format.raw/*150.13*/("""
      """),format.raw/*151.44*/("""
      """),format.raw/*152.49*/("""
          """),format.raw/*153.50*/("""
          """),format.raw/*154.72*/("""
              """),format.raw/*155.41*/("""
          """),format.raw/*156.17*/("""
                  """),format.raw/*157.44*/("""
                      """),format.raw/*158.71*/("""
                  """),format.raw/*159.26*/("""
      """),format.raw/*160.12*/("""
  """),format.raw/*161.28*/("""
"""),format.raw/*162.14*/("""

    """),format.raw/*164.5*/("""</keep-alive>

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
                  DATE: Sun Apr 07 12:28:05 IST 2019
                  SOURCE: /run/media/ryan/BEECC945ECC8F923/dsad/2ndYearProject2/app/views/basket.scala.html
                  HASH: 6293516d45add82f3bc91d986a8089b54c356997
                  MATRIX: 964->1|1070->37|1106->67|1138->93|1170->119|1214->35|1241->135|1268->137|1309->170|1348->172|1381->310|1418->337|1451->343|1783->648|1822->678|1862->680|1903->693|1976->739|1990->744|2024->757|2065->770|2112->786|2150->797|2478->1098|2519->1130|2559->1132|2608->1154|2671->1201|2711->1203|2760->1224|2821->1258|2831->1259|2871->1278|2933->1313|2943->1314|2992->1342|3061->1384|3109->1411|3178->1453|3230->1484|3292->1519|3302->1520|3337->1534|3408->1578|3423->1584|3497->1637|3626->1739|3641->1745|3712->1795|3853->1905|3900->1921|3931->1925|4108->2075|4180->2125|4238->2156|4304->2213|4343->2214|4392->2235|4473->2289|4542->2336|4604->2367|4645->2380|4785->2493|4800->2499|4850->2528|5141->2792|5156->2798|5204->2825|5526->3120|5541->3126|5588->3152|5893->3429|5922->3430|5952->3433|6013->3467|6041->3468|6069->3469|6133->3505|6149->3511|6197->3537|6433->3745|6505->3795|6773->4032|6809->4040|6892->4094|6922->4095|6957->4102|7023->4139|7053->4140|7093->4151|7150->4179|7180->4180|7224->4195|7270->4212|7300->4213|7348->4232|7385->4240|7415->4241|7467->4264|7504->4273|7576->4323|7625->4343|7655->4344|7699->4359|7729->4360|7765->4368|7794->4369|7823->4370|7853->4371|7927->4416|7957->4417|7997->4428|8069->4472|8098->4473|8133->4480|8162->4481|8232->4534|8264->4563|8300->4608|8336->4647|8372->4692|8412->4742|8452->4809|8500->4853|8552->4917|8604->4958|8652->4984|8688->4997|8724->5041|8760->5090|8800->5140|8840->5212|8884->5253|8924->5270|8972->5314|9024->5385|9072->5411|9108->5423|9140->5451|9170->5465|9204->5471
                  LINES: 28->1|31->3|32->4|33->5|34->6|37->2|38->7|39->8|39->8|39->8|40->9|41->10|43->12|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|59->28|62->31|75->44|75->44|75->44|76->45|76->45|76->45|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|81->50|81->50|82->51|82->51|82->51|83->52|83->52|83->52|84->53|84->53|84->53|86->55|87->56|88->57|92->61|92->61|93->62|93->62|93->62|94->63|94->63|94->63|95->64|96->65|101->70|101->70|101->70|109->78|109->78|109->78|115->84|115->84|115->84|127->96|127->96|128->97|129->98|129->98|130->99|134->103|134->103|134->103|138->107|138->107|147->116|151->120|154->123|154->123|155->124|155->124|155->124|156->125|156->125|156->125|157->126|157->126|157->126|158->127|158->127|158->127|159->128|159->128|159->128|160->129|160->129|161->130|161->130|162->131|162->131|162->131|162->131|163->132|163->132|164->133|165->134|165->134|166->135|166->135|170->139|171->140|172->141|173->142|174->143|175->144|176->145|177->146|178->147|179->148|180->149|181->150|182->151|183->152|184->153|185->154|186->155|187->156|188->157|189->158|190->159|191->160|192->161|193->162|195->164
                  -- GENERATED --
              */
          