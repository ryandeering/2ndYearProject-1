
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


Seq[Any](format.raw/*4.123*/("""



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
                  DATE: Wed Mar 27 21:12:41 GMT 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/app/views/listProducts.scala.html
                  HASH: a88a951889a2fb712e6a13c8f172a9289a9c1596
                  MATRIX: 651->1|690->35|728->68|1124->95|1341->216|1375->225|1410->252|1449->254|1481->259|1524->275|1552->276|1584->281|1634->304|1662->305|1692->308|1822->411|1837->417|1894->453|1970->503|2006->523|2046->525|2077->529|2114->539|2129->545|2192->587|2246->614|2256->615|2285->623|2325->633|2355->636|2432->687|2473->719|2513->721|2548->729|2617->772|2631->777|2667->792|2702->800|2744->812|2778->819|2869->883|2884->889|2937->921|3043->1000|3070->1006|3556->1466|3590->1484|3630->1486|3664->1493|3705->1508|3802->1596|3842->1598|3878->1607|3960->1662|3990->1671|4029->1693|4042->1698|4081->1699|4117->1708|4229->1790|4267->1801|4317->1824|4332->1830|4388->1865|4418->1868|4428->1869|4457->1877|4513->1906|4523->1907|4564->1927|4609->1945|4619->1946|4655->1961|4700->1979|4710->1980|4745->1994|4797->2019|4845->2046|4885->2060|4914->2080|4953->2081|4989->2090|5030->2104|5045->2110|5100->2144|5225->2251|5238->2255|5277->2256|5313->2265|5361->2283|5396->2291|5440->2305|5477->2315
                  LINES: 24->1|25->2|26->3|31->4|36->4|40->8|40->8|40->8|42->10|43->11|43->11|44->12|45->13|45->13|46->14|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|55->23|55->23|55->23|55->23|56->24|57->25|61->29|61->29|61->29|62->30|63->31|63->31|63->31|64->32|65->33|67->35|69->37|69->37|69->37|70->38|70->38|90->58|90->58|90->58|91->59|93->61|93->61|93->61|94->62|94->62|94->62|95->63|95->63|95->63|96->64|97->65|100->68|101->69|101->69|101->69|101->69|101->69|101->69|103->71|103->71|103->71|104->72|104->72|104->72|105->73|105->73|105->73|106->74|106->74|107->75|107->75|107->75|108->76|108->76|108->76|108->76|109->77|109->77|109->77|110->78|111->79|112->80|113->81|116->84
                  -- GENERATED --
              */
          