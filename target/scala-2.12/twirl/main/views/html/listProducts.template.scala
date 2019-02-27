
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
/*1.2*/import models.products.Category
/*2.2*/import models.products.Product
/*3.2*/import models.users.User

object listProducts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[play.api.Environment,List[Category],List[Product],Long,String,User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(env: play.api.Environment, categories: List[Category], products: List[Product], catId: Long, filter: String, user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.1*/("""


"""),_display_(/*8.2*/main("Products Page", user)/*8.29*/ {_display_(Seq[Any](format.raw/*8.31*/("""

	"""),format.raw/*10.2*/("""<style>
		form """),format.raw/*11.8*/("""{"""),format.raw/*11.9*/("""
			"""),format.raw/*12.4*/("""margin-bottom: 1em;
		"""),format.raw/*13.3*/("""}"""),format.raw/*13.4*/("""
	"""),format.raw/*14.2*/("""</style>

	<div class="row">

	  <div class="col-md-3">
	<div class="list-group">

			<a href=""""),_display_(/*21.14*/routes/*21.20*/.ProductCtrl.listProducts(0, filter)),format.raw/*21.56*/("""" class="list-group-item">All categories</a>
			"""),_display_(/*22.5*/for(c <- categories) yield /*22.25*/ {_display_(Seq[Any](format.raw/*22.27*/("""
		"""),format.raw/*23.3*/("""<a href=""""),_display_(/*23.13*/routes/*23.19*/.ProductCtrl.listProducts(c.getId, filter)),format.raw/*23.61*/("""" class="list-group-item">"""),_display_(/*23.88*/c/*23.89*/.getName),format.raw/*23.97*/("""</a>
			""")))}),format.raw/*24.5*/("""
	"""),format.raw/*25.2*/("""</div>
	  </div>

		<div class="col-md-9">
			"""),_display_(/*29.5*/if(flash.containsKey("success"))/*29.37*/ {_display_(Seq[Any](format.raw/*29.39*/("""
				  """),format.raw/*30.7*/("""<div class="alert alert-success">
					  """),_display_(/*31.9*/flash/*31.14*/.get("success")),format.raw/*31.29*/("""
				  """),format.raw/*32.7*/("""</div>
			""")))}),format.raw/*33.5*/("""

			"""),format.raw/*35.4*/("""<!-- Search Form -->
			<div id="actions">
			 <form action=""""),_display_(/*37.20*/routes/*37.26*/.ProductCtrl.listProducts(catId)),format.raw/*37.58*/("""" method="GET">
				<input type="search" id="searchbox" name="filter" value=""""),_display_(/*38.63*/filter),format.raw/*38.69*/("""" placeholder="Filter by product name...">
				<input type="submit" id="searchsubmit" value="Filter by name" class="btn-md btn-primary">
			 </form>
			</div>

			<table class="table table-bordered table-hover table-condensed">
				<thead>

				<tr>
					<th></th>
					<th>Name</th>
					<th>Description</th>
					<th>Stock</th>
					<th>Price</th>
					<th>Buy</th>
				</tr>
				</thead>
				<tbody>

					"""),_display_(/*57.7*/for(p <- products) yield /*57.25*/ {_display_(Seq[Any](format.raw/*57.27*/("""
					"""),format.raw/*58.6*/("""<tr>

						"""),_display_(/*60.8*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*60.96*/ {_display_(Seq[Any](format.raw/*60.98*/("""
							"""),format.raw/*61.8*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*61.63*/(p.getId)),format.raw/*61.72*/(""".jpg"/></td>
						""")))}/*62.9*/else/*62.14*/{_display_(Seq[Any](format.raw/*62.15*/("""
							"""),format.raw/*63.8*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
						""")))}),format.raw/*64.8*/("""
						"""),format.raw/*65.7*/("""<td>"""),_display_(/*65.12*/p/*65.13*/.getName),format.raw/*65.21*/("""</td>
						<td>"""),_display_(/*66.12*/p/*66.13*/.getDescription),format.raw/*66.28*/("""</td>
						<td>"""),_display_(/*67.12*/p/*67.13*/.getStock),format.raw/*67.22*/("""</td>
						<td>&euro; """),_display_(/*68.19*/("%.2f".format(p.getPrice))),format.raw/*68.46*/("""</td>
						<td><a href=""""),_display_(/*69.21*/routes/*69.27*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*69.61*/(""""  class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>
					</tr>
					""")))}),format.raw/*71.7*/("""
				"""),format.raw/*72.5*/("""</tbody>
			</table>
		</div>
	</div>
""")))}))
      }
    }
  }

  def render(env:play.api.Environment,categories:List[Category],products:List[Product],catId:Long,filter:String,user:User): play.twirl.api.HtmlFormat.Appendable = apply(env,categories,products,catId,filter,user)

  def f:((play.api.Environment,List[Category],List[Product],Long,String,User) => play.twirl.api.HtmlFormat.Appendable) = (env,categories,products,catId,filter,user) => apply(env,categories,products,catId,filter,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 27 18:20:32 GMT 2019
                  SOURCE: /home/ryan/Documents/2ndYearProject/app/views/listProducts.scala.html
                  HASH: f5f8ef9dd9862ad27f9d468b6384d30f6386248c
                  MATRIX: 651->1|690->34|728->66|1124->92|1339->214|1368->218|1403->245|1442->247|1472->250|1514->265|1542->266|1573->270|1622->292|1650->293|1679->295|1802->391|1817->397|1874->433|1949->482|1985->502|2025->504|2055->507|2092->517|2107->523|2170->565|2224->592|2234->593|2263->601|2302->610|2331->612|2404->659|2445->691|2485->693|2519->700|2587->742|2601->747|2637->762|2671->769|2712->780|2744->785|2833->847|2848->853|2901->885|3006->963|3033->969|3469->1379|3503->1397|3543->1399|3576->1405|3615->1418|3712->1506|3752->1508|3787->1516|3869->1571|3899->1580|3937->1601|3950->1606|3989->1607|4024->1615|4135->1696|4169->1703|4201->1708|4211->1709|4240->1717|4284->1734|4294->1735|4330->1750|4374->1767|4384->1768|4414->1777|4465->1801|4513->1828|4566->1854|4581->1860|4636->1894|4782->2010|4814->2015
                  LINES: 24->1|25->2|26->3|31->4|36->5|39->8|39->8|39->8|41->10|42->11|42->11|43->12|44->13|44->13|45->14|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|56->25|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|64->33|66->35|68->37|68->37|68->37|69->38|69->38|88->57|88->57|88->57|89->58|91->60|91->60|91->60|92->61|92->61|92->61|93->62|93->62|93->62|94->63|95->64|96->65|96->65|96->65|96->65|97->66|97->66|97->66|98->67|98->67|98->67|99->68|99->68|100->69|100->69|100->69|102->71|103->72
                  -- GENERATED --
              */
          