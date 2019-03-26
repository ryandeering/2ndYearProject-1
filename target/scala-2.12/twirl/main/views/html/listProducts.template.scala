
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
					<th>Platform &nbsp;</th>
					<th>Description</th>
					<th>Stock</th>
					<th>Price</th>
					<th>Buy</th>
				</tr>
				</thead>
				<tbody>

					"""),_display_(/*58.7*/for(p <- products) yield /*58.25*/ {_display_(Seq[Any](format.raw/*58.27*/("""
					"""),format.raw/*59.6*/("""<tr>

						"""),_display_(/*61.8*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*61.96*/ {_display_(Seq[Any](format.raw/*61.98*/("""
							"""),format.raw/*62.8*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*62.63*/(p.getId)),format.raw/*62.72*/(""".jpg"/></td>
						""")))}/*63.9*/else/*63.14*/{_display_(Seq[Any](format.raw/*63.15*/("""
							"""),format.raw/*64.8*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
						""")))}),format.raw/*65.8*/("""


					"""),format.raw/*68.6*/("""<td>
							<a href=""""),_display_(/*69.18*/routes/*69.24*/.HomeController.product(p.getId,"")),format.raw/*69.59*/("""">"""),_display_(/*69.62*/p/*69.63*/.getName),format.raw/*69.71*/("""</a>
					</td>
						<td>"""),_display_(/*71.12*/p/*71.13*/.getPlatform.getName),format.raw/*71.33*/("""</td>
						<td>"""),_display_(/*72.12*/p/*72.13*/.getDescription),format.raw/*72.28*/("""</td>
						<td>"""),_display_(/*73.12*/p/*73.13*/.stockShortage),format.raw/*73.27*/("""</td>
						<td>&euro; """),_display_(/*74.19*/("%.2f".format(p.getPrice))),format.raw/*74.46*/("""</td>
						"""),_display_(/*75.8*/if(p.getStock() > 0)/*75.28*/{_display_(Seq[Any](format.raw/*75.29*/("""
							"""),format.raw/*76.8*/("""<td><a href=""""),_display_(/*76.22*/routes/*76.28*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*76.62*/(""""  class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>
						""")))}/*77.8*/else/*77.12*/{_display_(Seq[Any](format.raw/*77.13*/("""
							"""),format.raw/*78.8*/("""<td></td>
						""")))}),format.raw/*79.8*/("""
						"""),format.raw/*80.7*/("""</tr>
					 """)))}),format.raw/*81.8*/("""


				"""),format.raw/*84.5*/("""</tbody>
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
                  DATE: Tue Mar 26 21:36:21 GMT 2019
                  SOURCE: /home/ryan/rawr/2ndYearProject2/app/views/listProducts.scala.html
                  HASH: 288d15561ab93a54f2e468d5682d1fc58bc510f1
                  MATRIX: 651->1|690->34|728->66|1124->92|1339->214|1368->218|1403->245|1442->247|1472->250|1514->265|1542->266|1573->270|1622->292|1650->293|1679->295|1802->391|1817->397|1874->433|1949->482|1985->502|2025->504|2055->507|2092->517|2107->523|2170->565|2224->592|2234->593|2263->601|2302->610|2331->612|2404->659|2445->691|2485->693|2519->700|2587->742|2601->747|2637->762|2671->769|2712->780|2744->785|2833->847|2848->853|2901->885|3006->963|3033->969|3499->1409|3533->1427|3573->1429|3606->1435|3645->1448|3742->1536|3782->1538|3817->1546|3899->1601|3929->1610|3967->1631|3980->1636|4019->1637|4054->1645|4165->1726|4200->1734|4249->1756|4264->1762|4320->1797|4350->1800|4360->1801|4389->1809|4443->1836|4453->1837|4494->1857|4538->1874|4548->1875|4584->1890|4628->1907|4638->1908|4673->1922|4724->1946|4772->1973|4811->1986|4840->2006|4879->2007|4914->2015|4955->2029|4970->2035|5025->2069|5149->2175|5162->2179|5201->2180|5236->2188|5283->2205|5317->2212|5360->2225|5394->2232
                  LINES: 24->1|25->2|26->3|31->4|36->5|39->8|39->8|39->8|41->10|42->11|42->11|43->12|44->13|44->13|45->14|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|56->25|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|64->33|66->35|68->37|68->37|68->37|69->38|69->38|89->58|89->58|89->58|90->59|92->61|92->61|92->61|93->62|93->62|93->62|94->63|94->63|94->63|95->64|96->65|99->68|100->69|100->69|100->69|100->69|100->69|100->69|102->71|102->71|102->71|103->72|103->72|103->72|104->73|104->73|104->73|105->74|105->74|106->75|106->75|106->75|107->76|107->76|107->76|107->76|108->77|108->77|108->77|109->78|110->79|111->80|112->81|115->84
                  -- GENERATED --
              */
          