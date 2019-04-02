
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
            data-key="pk_test_e9PCtT21TnhRh8b0iAgZ0erx"
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
                  DATE: Tue Apr 02 21:47:57 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/2ndYearProject/app/views/basket.scala.html
                  HASH: 1dd6867568c762c7741da3dbfb5b97d6346d848c
                  MATRIX: 964->1|1070->37|1106->67|1138->93|1170->119|1214->35|1241->135|1268->137|1309->170|1348->172|1381->310|1418->337|1451->343|1775->641|1816->673|1856->675|1889->681|1960->725|1974->730|2010->745|2043->751|2083->761|2115->766|2443->1067|2484->1099|2524->1101|2573->1123|2636->1170|2676->1172|2725->1193|2786->1227|2796->1228|2836->1247|2898->1282|2908->1283|2957->1311|3026->1353|3074->1380|3143->1422|3195->1453|3257->1488|3267->1489|3302->1503|3373->1547|3388->1553|3462->1606|3591->1708|3606->1714|3677->1764|3818->1874|3865->1890|3896->1894|4073->2044|4145->2094|4203->2125|4269->2182|4308->2183|4357->2204|4438->2258|4507->2305|4569->2336|4610->2349|4750->2462|4765->2468|4815->2497|5106->2761|5121->2767|5169->2794|5491->3089|5506->3095|5553->3121|5858->3398|5887->3399|5917->3402|5978->3436|6006->3437|6034->3438|6098->3474|6114->3480|6162->3506|6388->3704|6460->3754|6728->3991|6764->3999|6847->4053|6877->4054|6912->4061|6978->4098|7008->4099|7048->4110|7105->4138|7135->4139|7179->4154|7225->4171|7255->4172|7303->4191|7340->4199|7370->4200|7422->4223|7459->4232|7531->4282|7580->4302|7610->4303|7654->4318|7684->4319|7720->4327|7749->4328|7778->4329|7808->4330|7882->4375|7912->4376|7952->4387|8024->4431|8053->4432|8088->4439|8117->4440|8187->4493|8219->4522|8255->4567|8291->4606|8327->4651|8367->4701|8407->4768|8455->4812|8507->4876|8559->4917|8607->4943|8643->4956|8679->5000|8715->5049|8755->5099|8795->5171|8839->5212|8879->5229|8927->5273|8979->5344|9027->5370|9063->5382|9095->5410|9125->5424|9159->5430
                  LINES: 28->1|31->3|32->4|33->5|34->6|37->2|38->7|39->8|39->8|39->8|40->9|41->10|43->12|54->23|54->23|54->23|55->24|56->25|56->25|56->25|57->26|58->27|60->29|73->42|73->42|73->42|74->43|74->43|74->43|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|84->53|85->54|86->55|90->59|90->59|91->60|91->60|91->60|92->61|92->61|92->61|93->62|94->63|99->68|99->68|99->68|107->76|107->76|107->76|113->82|113->82|113->82|125->94|125->94|126->95|127->96|127->96|128->97|132->101|132->101|132->101|136->105|136->105|145->114|149->118|152->121|152->121|153->122|153->122|153->122|154->123|154->123|154->123|155->124|155->124|155->124|156->125|156->125|156->125|157->126|157->126|157->126|158->127|158->127|159->128|159->128|160->129|160->129|160->129|160->129|161->130|161->130|162->131|163->132|163->132|164->133|164->133|168->137|169->138|170->139|171->140|172->141|173->142|174->143|175->144|176->145|177->146|178->147|179->148|180->149|181->150|182->151|183->152|184->153|185->154|186->155|187->156|188->157|189->158|190->159|191->160|193->162
                  -- GENERATED --
              */
          