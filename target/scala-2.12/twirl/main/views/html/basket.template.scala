
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


"""),format.raw/*11.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*14.4*/if(flash.containsKey("success"))/*14.36*/ {_display_(Seq[Any](format.raw/*14.38*/("""
			  """),format.raw/*15.6*/("""<div class="alert alert-success">
			      """),_display_(/*16.11*/flash/*16.16*/.get("success")),format.raw/*16.31*/("""
			  """),format.raw/*17.6*/("""</div>
		""")))}),format.raw/*18.4*/(""" 

		"""),format.raw/*20.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>

			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Total</th>
				<th>Quantity</th>
                <th>dec.</th>
                <th>inc.</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*34.18*/if(customer.getBasket() != null)/*34.50*/ {_display_(Seq[Any](format.raw/*34.52*/("""
                    """),format.raw/*35.21*/("""<td>"""),_display_(/*35.26*/(customer.getBasket().discount.getDiscountID())),format.raw/*35.73*/("""</td>
                    """),_display_(/*36.22*/for(i <- customer.getBasket().getBasketItems()) yield /*36.69*/ {_display_(Seq[Any](format.raw/*36.71*/("""
                    """),format.raw/*37.21*/("""<tr>
                        <td>"""),_display_(/*38.30*/i/*38.31*/.getProduct.getName),format.raw/*38.50*/("""</td>
                        <td>"""),_display_(/*39.30*/i/*39.31*/.getProduct.getDescription()),format.raw/*39.59*/("""</td>
                        <td>&euro; """),_display_(/*40.37*/("%.2f".format(i.getPrice))),format.raw/*40.64*/("""</td>
                        <td>&euro; """),_display_(/*41.37*/("%.2f".format(i.getItemTotal))),format.raw/*41.68*/("""</td>
                        <td>"""),_display_(/*42.30*/i/*42.31*/.getQuantity()),format.raw/*42.45*/("""</td>
                        <td><a href=""""),_display_(/*43.39*/routes/*43.45*/.ShoppingCtrl.removeOne(i.getId,i.getProduct.getId())),format.raw/*43.98*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                        <td><a href=""""),_display_(/*44.39*/routes/*44.45*/.ShoppingCtrl.addOne(i.getId,i.getProduct.getId())),format.raw/*44.95*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                    </tr>
                    """)))}),format.raw/*46.22*/("""
              """)))}),format.raw/*47.16*/("""
			"""),format.raw/*48.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*52.69*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*52.119*/("""</strong></p>
            </div>  
        </div>
        <div class="row">admin
            <div class="col-md-12">
                    <span class="glyphicon glyphicon-trash"></span> Set Discount</a>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*63.31*/routes/*63.37*/.ShoppingCtrl.emptyBasket()),format.raw/*63.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*69.31*/routes/*69.37*/.ShoppingCtrl.placeOrder()),format.raw/*69.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                </p>
            </div>  
        </div>
    </div>
</div>

<script>

	function confirmDel() """),format.raw/*79.24*/("""{"""),format.raw/*79.25*/("""
		"""),format.raw/*80.3*/("""return confirm('Are you sure?');
	"""),format.raw/*81.2*/("""}"""),format.raw/*81.3*/("""
"""),format.raw/*82.1*/("""</script>
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.users.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 20 18:18:04 GMT 2019
                  SOURCE: /home/ryan/rawr/2ndYearProject2/app/views/basket.scala.html
                  HASH: f12a7608c55bf167ba3413abd1979c39f2ba6c94
                  MATRIX: 964->1|1070->37|1106->67|1138->93|1170->119|1214->35|1241->135|1268->137|1309->170|1348->172|1378->175|1451->222|1492->254|1532->256|1565->262|1636->306|1650->311|1686->326|1719->332|1759->342|1791->347|2120->649|2161->681|2201->683|2250->704|2282->709|2350->756|2404->783|2467->830|2507->832|2556->853|2617->887|2627->888|2667->907|2729->942|2739->943|2788->971|2857->1013|2905->1040|2974->1082|3026->1113|3088->1148|3098->1149|3133->1163|3204->1207|3219->1213|3293->1266|3422->1368|3437->1374|3508->1424|3649->1534|3696->1550|3727->1554|3904->1704|3976->1754|4369->2120|4384->2126|4432->2153|4754->2448|4769->2454|4816->2480|5070->2706|5099->2707|5129->2710|5190->2744|5218->2745|5246->2746
                  LINES: 28->1|31->3|32->4|33->5|34->6|37->2|38->7|39->8|39->8|39->8|42->11|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|49->18|51->20|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|77->46|78->47|79->48|83->52|83->52|94->63|94->63|94->63|100->69|100->69|100->69|110->79|110->79|111->80|112->81|112->81|113->82
                  -- GENERATED --
              */
          