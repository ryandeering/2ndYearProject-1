
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


Seq[Any](format.raw/*3.123*/("""



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
  			<li><a href=""""),_display_(/*75.20*/routes/*75.26*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*75.60*/(""""  class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span> Add to basket</a></li>
            <li>|</li>
            <span><i class="glyphicon glyphicon-comment"></i> """),_display_(/*77.64*/p/*77.65*/.reviewCount),format.raw/*77.77*/("""</span>
            <li>|</li>
            <li>
               <p>Stock: """),_display_(/*80.27*/p/*80.28*/.stockShortage),format.raw/*80.42*/("""</p>
            </li>
            <li>|</li>
            <li>
            <!-- Use Font Awesome http://fortawesome.github.io/Font-Awesome/ -->
              """),format.raw/*85.69*/("""
              """),format.raw/*86.68*/("""
              """),format.raw/*87.72*/("""
            """),format.raw/*88.13*/("""</li>
			</ul>
        </div>
    </div>
  </div>

""")))}),format.raw/*94.2*/("""
 """),format.raw/*95.2*/("""</div>


			
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
                  DATE: Thu Apr 04 01:16:26 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/app/views/listProducts.scala.html
                  HASH: 2003c3653ea763415d222089927e6a172ae9dda0
                  MATRIX: 651->1|701->46|1097->73|1314->194|1348->203|1383->230|1422->232|1453->237|1496->253|1524->254|1556->259|1606->282|1634->283|1667->289|1706->300|1735->301|1768->307|1922->434|1950->435|1982->440|2014->445|2042->446|2072->449|2156->506|2184->507|2214->510|2345->614|2360->620|2417->656|2493->706|2529->726|2569->728|2600->732|2637->742|2652->748|2715->790|2769->817|2779->818|2808->826|2848->836|2878->839|2955->890|2996->922|3036->924|3071->932|3140->975|3154->980|3190->995|3225->1003|3267->1015|3301->1022|3392->1086|3407->1092|3460->1124|3566->1203|3593->1209|3812->1402|3846->1420|3886->1422|3917->1426|4026->1508|4041->1514|4098->1550|4135->1561|4232->1649|4272->1651|4308->1660|4390->1715|4420->1724|4472->1759|4485->1764|4524->1765|4560->1774|4685->1869|4720->1877|4822->1952|4837->1958|4894->1994|4925->1998|4935->1999|4964->2007|5003->2020|5012->2021|5053->2041|5127->2088|5175->2115|5222->2135|5232->2136|5268->2151|5370->2226|5385->2232|5440->2266|5668->2467|5678->2468|5711->2480|5815->2557|5825->2558|5860->2572|6051->2789|6095->2858|6139->2931|6181->2945|6269->3003|6299->3006
                  LINES: 24->1|25->2|30->3|35->3|39->7|39->7|39->7|41->9|42->10|42->10|43->11|44->12|44->12|46->14|46->14|46->14|47->15|52->20|52->20|54->22|54->22|54->22|55->23|58->26|58->26|59->27|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|68->36|68->36|68->36|68->36|69->37|70->38|74->42|74->42|74->42|75->43|76->44|76->44|76->44|77->45|78->46|80->48|82->50|82->50|82->50|83->51|83->51|90->58|90->58|90->58|91->59|93->61|93->61|93->61|94->62|94->62|94->62|95->63|95->63|95->63|96->64|96->64|96->64|97->65|98->66|100->68|102->70|102->70|102->70|102->70|102->70|102->70|103->71|103->71|103->71|104->72|104->72|105->73|105->73|105->73|107->75|107->75|107->75|109->77|109->77|109->77|112->80|112->80|112->80|117->85|118->86|119->87|120->88|126->94|127->95
                  -- GENERATED --
              */
          