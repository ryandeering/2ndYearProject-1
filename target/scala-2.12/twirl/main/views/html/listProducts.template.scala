
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
/*1.2*/import models.products.{Category, Product}
/*2.2*/import models.users.User

object listProducts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[play.api.Environment,List[Category],List[Product],Long,String,User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(env: play.api.Environment, categories: List[Category], products: List[Product], catId: Long, filter: String, user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""


"""),_display_(/*7.2*/main("Products Page", user)/*7.29*/ {_display_(Seq[Any](format.raw/*7.31*/("""

	"""),format.raw/*9.2*/("""<style>
		form """),format.raw/*10.8*/("""{"""),format.raw/*10.9*/("""
			"""),format.raw/*11.4*/("""margin-bottom: 1em;
		"""),format.raw/*12.3*/("""}"""),format.raw/*12.4*/("""

		"""),format.raw/*14.3*/(""".list-group"""),format.raw/*14.14*/("""{"""),format.raw/*14.15*/("""
    """),format.raw/*15.5*/("""max-height: 300px;
    margin-top: 12px;
    margin-bottom: 12px;
	overflow: auto;
    -webkit-overflow-scrolling: touch;
"""),format.raw/*20.1*/("""}"""),format.raw/*20.2*/("""

	"""),format.raw/*22.2*/(""".game"""),format.raw/*22.7*/("""{"""),format.raw/*22.8*/("""
	"""),format.raw/*23.2*/("""width: 101%;
	padding-top:2.6em;
	padding-right:1em;
	"""),format.raw/*26.2*/("""}"""),format.raw/*26.3*/("""
	"""),format.raw/*27.2*/("""</style>

	<div class="row">

	  <div class="col-md-3">
	<div class="list-group"	>

			<a href=""""),_display_(/*34.14*/routes/*34.20*/.ProductCtrl.listProducts(0, filter)),format.raw/*34.56*/("""" class="list-group-item">All categories</a>
			"""),_display_(/*35.5*/for(c <- categories) yield /*35.25*/ {_display_(Seq[Any](format.raw/*35.27*/("""
		"""),format.raw/*36.3*/("""<a href=""""),_display_(/*36.13*/routes/*36.19*/.ProductCtrl.listProducts(c.getId, filter)),format.raw/*36.61*/("""" class="list-group-item">"""),_display_(/*36.88*/c/*36.89*/.getName),format.raw/*36.97*/("""</a>
			""")))}),format.raw/*37.5*/("""
	"""),format.raw/*38.2*/("""</div>
	  </div>

		<div class="col-md-9">
			"""),_display_(/*42.5*/if(flash.containsKey("success"))/*42.37*/ {_display_(Seq[Any](format.raw/*42.39*/("""
				  """),format.raw/*43.7*/("""<div class="alert alert-success">
					  """),_display_(/*44.9*/flash/*44.14*/.get("success")),format.raw/*44.29*/("""
				  """),format.raw/*45.7*/("""</div>
			""")))}),format.raw/*46.5*/("""

			"""),format.raw/*48.4*/("""<!-- Search Form -->
			<div id="actions">
			 <form action=""""),_display_(/*50.20*/routes/*50.26*/.ProductCtrl.listProducts(catId)),format.raw/*50.58*/("""" method="GET">
				<input type="search" id="searchbox" name="filter" value=""""),_display_(/*51.63*/filter),format.raw/*51.69*/("""" placeholder="Filter by product name...">
				<input type="submit" id="searchsubmit" value="Filter by name" class="btn-md btn-primary">
			 </form>
			</div>


<div class="container">
"""),_display_(/*58.2*/for(p <- products) yield /*58.20*/ {_display_(Seq[Any](format.raw/*58.22*/("""
  """),format.raw/*59.3*/("""<div class="well">
      <div class="media">
      	<a class="pull-left" href=""""),_display_(/*61.36*/routes/*61.42*/.HomeController.product(p.getId, "")),format.raw/*61.78*/("""">
    		"""),_display_(/*62.8*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*62.96*/ {_display_(Seq[Any](format.raw/*62.98*/("""
							"""),format.raw/*63.8*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*63.63*/(p.getId)),format.raw/*63.72*/(""".jpg" class="game"/></td>
						""")))}/*64.9*/else/*64.14*/{_display_(Seq[Any](format.raw/*64.15*/("""
							"""),format.raw/*65.8*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png" class="game"/></td>
						""")))}),format.raw/*66.8*/("""

  		"""),format.raw/*68.5*/("""</a>
  		<div class="media-body">
			<h4 class="media-heading"><a href=""""),_display_(/*70.40*/routes/*70.46*/.HomeController.product(p.getId, "")),format.raw/*70.82*/(""""> """),_display_(/*70.86*/p/*70.87*/.getName),format.raw/*70.95*/("""</a>
				| """),_display_(/*71.8*/p/*71.9*/.getPlatform.getName),format.raw/*71.29*/("""</h4>
          <p class="text-right">&euro; """),_display_(/*72.41*/("%.2f".format(p.getPrice))),format.raw/*72.68*/("""</p>
          <p>"""),_display_(/*73.15*/p/*73.16*/.getDescription),format.raw/*73.31*/("""</p>
          <ul class="list-inline list-unstyled">
			  """),_display_(/*75.7*/if(p.getStock >= 0)/*75.26*/{_display_(Seq[Any](format.raw/*75.27*/("""
  			"""),format.raw/*76.6*/("""<li><a href=""""),_display_(/*76.20*/routes/*76.26*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*76.60*/(""""  class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span> Add to basket</a></li>
				  """)))}),format.raw/*77.8*/("""
            """),format.raw/*78.13*/("""<li>|</li>
            <span><i class="glyphicon glyphicon-comment"></i> """),_display_(/*79.64*/p/*79.65*/.reviewCount),format.raw/*79.77*/("""</span>
            <li>|</li>
            <li>
               <p>Stock: """),_display_(/*82.27*/p/*82.28*/.stockShortage),format.raw/*82.42*/("""</p>
            </li>
            <li>|</li>
            <li>
            <!-- Use Font Awesome http://fortawesome.github.io/Font-Awesome/ -->
              """),format.raw/*87.69*/("""
              """),format.raw/*88.68*/("""
              """),format.raw/*89.72*/("""
            """),format.raw/*90.13*/("""</li>
			</ul>
        </div>
    </div>
  </div>

""")))}),format.raw/*96.2*/("""
 """),format.raw/*97.2*/("""</div>


			
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
                  DATE: Sun Apr 07 12:28:05 IST 2019
                  SOURCE: /run/media/ryan/BEECC945ECC8F923/dsad/2ndYearProject2/app/views/listProducts.scala.html
                  HASH: 92ce7fc96bb787e1c24763db28548b694118f13b
                  MATRIX: 651->1|701->45|1097->71|1312->193|1341->197|1376->224|1415->226|1444->229|1486->244|1514->245|1545->249|1594->271|1622->272|1653->276|1692->287|1721->288|1753->293|1902->415|1930->416|1960->419|1992->424|2020->425|2049->427|2130->481|2158->482|2187->484|2311->581|2326->587|2383->623|2458->672|2494->692|2534->694|2564->697|2601->707|2616->713|2679->755|2733->782|2743->783|2772->791|2811->800|2840->802|2913->849|2954->881|2994->883|3028->890|3096->932|3110->937|3146->952|3180->959|3221->970|3253->975|3342->1037|3357->1043|3410->1075|3515->1153|3542->1159|3754->1345|3788->1363|3828->1365|3858->1368|3965->1448|3980->1454|4037->1490|4073->1500|4170->1588|4210->1590|4245->1598|4327->1653|4357->1662|4408->1696|4421->1701|4460->1702|4495->1710|4619->1804|4652->1810|4752->1883|4767->1889|4824->1925|4855->1929|4865->1930|4894->1938|4932->1950|4941->1951|4982->1971|5055->2017|5103->2044|5149->2063|5159->2064|5195->2079|5281->2139|5309->2158|5348->2159|5381->2165|5422->2179|5437->2185|5492->2219|5642->2339|5683->2352|5784->2426|5794->2427|5827->2439|5928->2513|5938->2514|5973->2528|6159->2740|6202->2808|6245->2880|6286->2893|6368->2945|6397->2947
                  LINES: 24->1|25->2|30->3|35->4|38->7|38->7|38->7|40->9|41->10|41->10|42->11|43->12|43->12|45->14|45->14|45->14|46->15|51->20|51->20|53->22|53->22|53->22|54->23|57->26|57->26|58->27|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|67->36|67->36|68->37|69->38|73->42|73->42|73->42|74->43|75->44|75->44|75->44|76->45|77->46|79->48|81->50|81->50|81->50|82->51|82->51|89->58|89->58|89->58|90->59|92->61|92->61|92->61|93->62|93->62|93->62|94->63|94->63|94->63|95->64|95->64|95->64|96->65|97->66|99->68|101->70|101->70|101->70|101->70|101->70|101->70|102->71|102->71|102->71|103->72|103->72|104->73|104->73|104->73|106->75|106->75|106->75|107->76|107->76|107->76|107->76|108->77|109->78|110->79|110->79|110->79|113->82|113->82|113->82|118->87|119->88|120->89|121->90|127->96|128->97
                  -- GENERATED --
              */
          