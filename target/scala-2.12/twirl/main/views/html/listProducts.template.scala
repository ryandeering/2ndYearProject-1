
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


					"""),format.raw/*67.6*/("""<td>
							<a href=""""),_display_(/*68.18*/routes/*68.24*/.HomeController.product(p.getId,"")),format.raw/*68.59*/("""">"""),_display_(/*68.62*/p/*68.63*/.getName),format.raw/*68.71*/("""</a>
					</td>

						<td>"""),_display_(/*71.12*/p/*71.13*/.getDescription),format.raw/*71.28*/("""</td>
						<td>"""),_display_(/*72.12*/p/*72.13*/.stockShortage),format.raw/*72.27*/("""</td>
						<td>&euro; """),_display_(/*73.19*/("%.2f".format(p.getPrice))),format.raw/*73.46*/("""</td>
						"""),_display_(/*74.8*/if(p.getStock() > 0)/*74.28*/{_display_(Seq[Any](format.raw/*74.29*/("""
							"""),format.raw/*75.8*/("""<td><a href=""""),_display_(/*75.22*/routes/*75.28*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*75.62*/(""""  class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>
						""")))}/*76.8*/else/*76.12*/{_display_(Seq[Any](format.raw/*76.13*/("""
							"""),format.raw/*77.8*/("""<td></td>
						""")))}),format.raw/*78.8*/("""
						"""),format.raw/*79.7*/("""</tr>
					 """)))}),format.raw/*80.8*/("""


				"""),format.raw/*83.5*/("""</tbody>
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
                  DATE: Tue Mar 12 22:32:19 GMT 2019
                  SOURCE: /home/ryan/rawr/2ndYearProject2/app/views/listProducts.scala.html
                  HASH: 5c5e47ff2040ef3de25466601f9439a511f874aa
                  MATRIX: 651->1|690->34|728->66|1124->92|1339->214|1368->218|1403->245|1442->247|1472->250|1514->265|1542->266|1573->270|1622->292|1650->293|1679->295|1802->391|1817->397|1874->433|1949->482|1985->502|2025->504|2055->507|2092->517|2107->523|2170->565|2224->592|2234->593|2263->601|2302->610|2331->612|2404->659|2445->691|2485->693|2519->700|2587->742|2601->747|2637->762|2671->769|2712->780|2744->785|2833->847|2848->853|2901->885|3006->963|3033->969|3469->1379|3503->1397|3543->1399|3576->1405|3615->1418|3712->1506|3752->1508|3787->1516|3869->1571|3899->1580|3937->1601|3950->1606|3989->1607|4024->1615|4135->1696|4170->1704|4219->1726|4234->1732|4290->1767|4320->1770|4330->1771|4359->1779|4414->1807|4424->1808|4460->1823|4504->1840|4514->1841|4549->1855|4600->1879|4648->1906|4687->1919|4716->1939|4755->1940|4790->1948|4831->1962|4846->1968|4901->2002|5025->2108|5038->2112|5077->2113|5112->2121|5159->2138|5193->2145|5236->2158|5270->2165
                  LINES: 24->1|25->2|26->3|31->4|36->5|39->8|39->8|39->8|41->10|42->11|42->11|43->12|44->13|44->13|45->14|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|56->25|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|64->33|66->35|68->37|68->37|68->37|69->38|69->38|88->57|88->57|88->57|89->58|91->60|91->60|91->60|92->61|92->61|92->61|93->62|93->62|93->62|94->63|95->64|98->67|99->68|99->68|99->68|99->68|99->68|99->68|102->71|102->71|102->71|103->72|103->72|103->72|104->73|104->73|105->74|105->74|105->74|106->75|106->75|106->75|106->75|107->76|107->76|107->76|108->77|109->78|110->79|111->80|114->83
                  -- GENERATED --
              */
          