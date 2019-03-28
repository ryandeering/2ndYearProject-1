
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


<div class="container">
"""),_display_(/*45.2*/for(p <- products) yield /*45.20*/ {_display_(Seq[Any](format.raw/*45.22*/("""
  """),format.raw/*46.3*/("""<div class="well">
      <div class="media">
      	<a class="pull-left" href="#">
    		"""),_display_(/*49.8*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*49.96*/ {_display_(Seq[Any](format.raw/*49.98*/("""
							"""),format.raw/*50.8*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*50.63*/(p.getId)),format.raw/*50.72*/(""".jpg"/></td>
						""")))}/*51.9*/else/*51.14*/{_display_(Seq[Any](format.raw/*51.15*/("""
							"""),format.raw/*52.8*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
						""")))}),format.raw/*53.8*/("""

  		"""),format.raw/*55.5*/("""</a>
  		<div class="media-body">
    		<h4 class="media-heading"><a href=""""),_display_(/*57.43*/routes/*57.49*/.HomeController.product(p.getId,"")),format.raw/*57.84*/("""">"""),_display_(/*57.87*/p/*57.88*/.getName),format.raw/*57.96*/("""</a> """),_display_(/*57.102*/p/*57.103*/.getPlatform.getName),format.raw/*57.123*/("""</h4>
          <p class="text-right">&euro; """),_display_(/*58.41*/("%.2f".format(p.getPrice))),format.raw/*58.68*/("""</p>
          <p>"""),_display_(/*59.15*/p/*59.16*/.getDescription),format.raw/*59.31*/("""</p>
          <ul class="list-inline list-unstyled">
  			<li><a href=""""),_display_(/*61.20*/routes/*61.26*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*61.60*/(""""  class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span> Add to basket</a></li>
            <li>|</li>
            <span><i class="glyphicon glyphicon-comment"></i> 2 comments</span>
            <li>|</li>
            <li>
               <p>Stock: """),_display_(/*66.27*/p/*66.28*/.stockShortage),format.raw/*66.42*/("""</p>
            </li>
            <li>|</li>
            <li>
            <!-- Use Font Awesome http://fortawesome.github.io/Font-Awesome/ -->
              <span><i class="fa fa-facebook-square"></i></span>
              <span><i class="fa fa-twitter-square"></i></span>
              <span><i class="fa fa-google-plus-square"></i></span>
            </li>
			</ul>
        </div>
    </div>
  </div>

""")))}),format.raw/*80.2*/("""
 """),format.raw/*81.2*/("""</div>


			
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
                  DATE: Thu Mar 28 12:29:26 GMT 2019
                  SOURCE: /home/ryan/rawr/2ndYearProject2/app/views/listProducts.scala.html
                  HASH: 647f0648540f5d617915a9bbdc46785b9d188246
                  MATRIX: 651->1|690->34|728->66|1124->92|1339->214|1368->218|1403->245|1442->247|1472->250|1514->265|1542->266|1573->270|1622->292|1650->293|1679->295|1802->391|1817->397|1874->433|1949->482|1985->502|2025->504|2055->507|2092->517|2107->523|2170->565|2224->592|2234->593|2263->601|2302->610|2331->612|2404->659|2445->691|2485->693|2519->700|2587->742|2601->747|2637->762|2671->769|2712->780|2744->785|2833->847|2848->853|2901->885|3006->963|3033->969|3245->1155|3279->1173|3319->1175|3349->1178|3465->1268|3562->1356|3602->1358|3637->1366|3719->1421|3749->1430|3787->1451|3800->1456|3839->1457|3874->1465|3985->1546|4018->1552|4121->1628|4136->1634|4192->1669|4222->1672|4232->1673|4261->1681|4295->1687|4306->1688|4348->1708|4421->1754|4469->1781|4515->1800|4525->1801|4561->1816|4661->1889|4676->1895|4731->1929|5040->2211|5050->2212|5085->2226|5520->2631|5549->2633
                  LINES: 24->1|25->2|26->3|31->4|36->5|39->8|39->8|39->8|41->10|42->11|42->11|43->12|44->13|44->13|45->14|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|56->25|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|64->33|66->35|68->37|68->37|68->37|69->38|69->38|76->45|76->45|76->45|77->46|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|83->52|84->53|86->55|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|89->58|89->58|90->59|90->59|90->59|92->61|92->61|92->61|97->66|97->66|97->66|111->80|112->81
                  -- GENERATED --
              */
          