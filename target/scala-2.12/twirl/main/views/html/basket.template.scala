
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


Seq[Any](format.raw/*2.1*/("""
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
                  DATE: Thu Mar 28 12:29:26 GMT 2019
                  SOURCE: /home/ryan/rawr/2ndYearProject2/app/views/basket.scala.html
                  HASH: 5d9a52a36e95111371f9ab8f4900ff9b507da78e
                  MATRIX: 995->1|1147->83|1183->113|1215->139|1247->165|1291->81|1318->181|1345->183|1386->216|1425->218|1458->356|1495->383|1524->385|1599->434|1640->466|1680->468|1713->474|1784->518|1798->523|1834->538|1867->544|1907->554|1939->559|2268->861|2309->893|2349->895|2398->916|2430->921|2498->968|2552->995|2615->1042|2655->1044|2704->1065|2765->1099|2775->1100|2815->1119|2877->1154|2887->1155|2936->1183|3005->1225|3053->1252|3122->1294|3174->1325|3236->1360|3246->1361|3281->1375|3352->1419|3367->1425|3441->1478|3570->1580|3585->1586|3656->1636|3797->1746|3844->1762|3875->1766|4052->1916|4124->1966|4315->2130|4423->2216|4472->2237|4717->2455|4732->2461|4780->2488|5102->2783|5117->2789|5164->2815|5418->3041|5447->3042|5477->3045|5538->3079|5566->3080|5594->3081|5635->3092
                  LINES: 28->1|31->3|32->4|33->5|34->6|37->2|38->7|39->8|39->8|39->8|40->9|41->10|43->12|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|52->21|54->23|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|80->49|81->50|82->51|86->55|86->55|94->63|94->63|95->64|101->70|101->70|101->70|107->76|107->76|107->76|117->86|117->86|118->87|119->88|119->88|120->89|121->90
                  -- GENERATED --
              */
          