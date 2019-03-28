
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

"""),format.raw/*12.1*/("""<div class="row">



	<div class="col-md-12">
		"""),_display_(/*17.4*/if(flash.containsKey("success"))/*17.36*/ {_display_(Seq[Any](format.raw/*17.38*/("""
			  """),format.raw/*18.6*/("""<div class="alert alert-success">
			      """),_display_(/*19.11*/flash/*19.16*/.get("success")),format.raw/*19.31*/("""
			  """),format.raw/*20.6*/("""</div>
		""")))}),format.raw/*21.4*/(""" 

		"""),format.raw/*23.3*/("""<table class="table table-bordered table-hover table-condensed">
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
                """),_display_(/*37.18*/if(customer.getBasket() != null)/*37.50*/ {_display_(Seq[Any](format.raw/*37.52*/("""
                    """),format.raw/*38.21*/("""<td>"""),_display_(/*38.26*/(customer.getBasket().discount.getDiscountID())),format.raw/*38.73*/("""</td>
                    """),_display_(/*39.22*/for(i <- customer.getBasket().getBasketItems()) yield /*39.69*/ {_display_(Seq[Any](format.raw/*39.71*/("""
                    """),format.raw/*40.21*/("""<tr>
                        <td>"""),_display_(/*41.30*/i/*41.31*/.getProduct.getName),format.raw/*41.50*/("""</td>
                        <td>"""),_display_(/*42.30*/i/*42.31*/.getProduct.getDescription()),format.raw/*42.59*/("""</td>
                        <td>&euro; """),_display_(/*43.37*/("%.2f".format(i.getPrice))),format.raw/*43.64*/("""</td>
                        <td>&euro; """),_display_(/*44.37*/("%.2f".format(i.getItemTotal))),format.raw/*44.68*/("""</td>
                        <td>"""),_display_(/*45.30*/i/*45.31*/.getQuantity()),format.raw/*45.45*/("""</td>
                        <td><a href=""""),_display_(/*46.39*/routes/*46.45*/.ShoppingCtrl.removeOne(i.getId,i.getProduct.getId())),format.raw/*46.98*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                        <td><a href=""""),_display_(/*47.39*/routes/*47.45*/.ShoppingCtrl.addOne(i.getId,i.getProduct.getId())),format.raw/*47.95*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                    </tr>
                    """)))}),format.raw/*49.22*/("""
              """)))}),format.raw/*50.16*/("""
			"""),format.raw/*51.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*55.69*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*55.119*/("""</strong></p>
            </div>  
        </div>

        <div class="row">
            <div class="col-md-12">
                Set Discount

                    """),_display_(/*63.22*/inputText(discountForm("discountID"), '_label -> "discount", 'class -> "form-control")),format.raw/*63.108*/("""
                    """),format.raw/*64.21*/("""<span class="glyphicon glyphicon-barcode"></span></a>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*70.31*/routes/*70.37*/.ShoppingCtrl.emptyBasket()),format.raw/*70.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*76.31*/routes/*76.37*/.ShoppingCtrl.placeOrder()),format.raw/*76.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                </p>
            </div>  
        </div>
    </div>
</div>

<script>

	function confirmDel() """),format.raw/*86.24*/("""{"""),format.raw/*86.25*/("""
		"""),format.raw/*87.3*/("""return confirm('Are you sure?');
	"""),format.raw/*88.2*/("""}"""),format.raw/*88.3*/("""
"""),format.raw/*89.1*/("""</script>
""")))}),format.raw/*90.2*/("""
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
                  DATE: Thu Mar 28 18:31:20 GMT 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/app/views/basket.scala.html
                  HASH: 604a39f184d6d2fe4340ef2d1d7671c622fb42bf
                  MATRIX: 995->1|1147->85|1183->116|1215->143|1247->170|1292->80|1322->187|1350->190|1391->223|1430->225|1464->364|1502->392|1533->396|1613->450|1654->482|1694->484|1728->491|1800->536|1814->541|1850->556|1884->563|1925->574|1959->581|2302->897|2343->929|2383->931|2433->953|2465->958|2533->1005|2588->1033|2651->1080|2691->1082|2741->1104|2803->1139|2813->1140|2853->1159|2916->1195|2926->1196|2975->1224|3045->1267|3093->1294|3163->1337|3215->1368|3278->1404|3288->1405|3323->1419|3395->1464|3410->1470|3484->1523|3614->1626|3629->1632|3700->1682|3843->1794|3891->1811|3923->1816|4104->1970|4176->2020|4375->2192|4483->2278|4533->2300|4784->2524|4799->2530|4847->2557|5175->2858|5190->2864|5237->2890|5501->3126|5530->3127|5561->3131|5623->3166|5651->3167|5680->3169|5722->3181
                  LINES: 28->1|31->3|32->4|33->5|34->6|37->1|39->7|40->8|40->8|40->8|41->9|42->10|44->12|49->17|49->17|49->17|50->18|51->19|51->19|51->19|52->20|53->21|55->23|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|76->44|76->44|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|79->47|81->49|82->50|83->51|87->55|87->55|95->63|95->63|96->64|102->70|102->70|102->70|108->76|108->76|108->76|118->86|118->86|119->87|120->88|120->88|121->89|122->90
                  -- GENERATED --
              */
          