
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
	"""),format.raw/*13.2*/("""</style>

	<div class="row">

	  <div class="col-md-3">
	<div class="list-group">

			<a href=""""),_display_(/*20.14*/routes/*20.20*/.ProductCtrl.listProducts(0, filter)),format.raw/*20.56*/("""" class="list-group-item">All categories</a>
			"""),_display_(/*21.5*/for(c <- categories) yield /*21.25*/ {_display_(Seq[Any](format.raw/*21.27*/("""
		"""),format.raw/*22.3*/("""<a href=""""),_display_(/*22.13*/routes/*22.19*/.ProductCtrl.listProducts(c.getId, filter)),format.raw/*22.61*/("""" class="list-group-item">"""),_display_(/*22.88*/c/*22.89*/.getName),format.raw/*22.97*/("""</a>
			""")))}),format.raw/*23.5*/("""
	"""),format.raw/*24.2*/("""</div>
	  </div>

		<div class="col-md-9">
			"""),_display_(/*28.5*/if(flash.containsKey("success"))/*28.37*/ {_display_(Seq[Any](format.raw/*28.39*/("""
				  """),format.raw/*29.7*/("""<div class="alert alert-success">
					  """),_display_(/*30.9*/flash/*30.14*/.get("success")),format.raw/*30.29*/("""
				  """),format.raw/*31.7*/("""</div>
			""")))}),format.raw/*32.5*/("""

			"""),format.raw/*34.4*/("""<!-- Search Form -->
			<div id="actions">
			 <form action=""""),_display_(/*36.20*/routes/*36.26*/.ProductCtrl.listProducts(catId)),format.raw/*36.58*/("""" method="GET">
				<input type="search" id="searchbox" name="filter" value=""""),_display_(/*37.63*/filter),format.raw/*37.69*/("""" placeholder="Filter by product name...">
				<input type="submit" id="searchsubmit" value="Filter by name" class="btn-md btn-primary">
			 </form>
			</div>


<div class="container">
"""),_display_(/*44.2*/for(p <- products) yield /*44.20*/ {_display_(Seq[Any](format.raw/*44.22*/("""
  """),format.raw/*45.3*/("""<div class="well">
      <div class="media">
      	<a class="pull-left" href="#">
    		"""),_display_(/*48.8*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*48.96*/ {_display_(Seq[Any](format.raw/*48.98*/("""
							"""),format.raw/*49.8*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*49.63*/(p.getId)),format.raw/*49.72*/(""".jpg"/></td>
						""")))}/*50.9*/else/*50.14*/{_display_(Seq[Any](format.raw/*50.15*/("""
							"""),format.raw/*51.8*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
						""")))}),format.raw/*52.8*/("""

  		"""),format.raw/*54.5*/("""</a>
  		<div class="media-body">
			<h4 class="media-heading"><a href=""""),_display_(/*56.40*/routes/*56.46*/.HomeController.product(p.getId, "")),format.raw/*56.82*/(""""> """),_display_(/*56.86*/p/*56.87*/.getName),format.raw/*56.95*/("""</a>
				| """),_display_(/*57.8*/p/*57.9*/.getPlatform.getName),format.raw/*57.29*/("""</h4>
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
                  DATE: Thu Mar 28 20:09:20 GMT 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/app/views/listProducts.scala.html
                  HASH: b9060c7dfa04867109be4b68d0ffd8eed855f6aa
                  MATRIX: 651->1|701->46|1097->73|1314->194|1348->203|1383->230|1422->232|1453->237|1496->253|1524->254|1556->259|1606->282|1634->283|1664->286|1794->389|1809->395|1866->431|1942->481|1978->501|2018->503|2049->507|2086->517|2101->523|2164->565|2218->592|2228->593|2257->601|2297->611|2327->614|2404->665|2445->697|2485->699|2520->707|2589->750|2603->755|2639->770|2674->778|2716->790|2750->797|2841->861|2856->867|2909->899|3015->978|3042->984|3261->1177|3295->1195|3335->1197|3366->1201|3485->1294|3582->1382|3622->1384|3658->1393|3740->1448|3770->1457|3809->1479|3822->1484|3861->1485|3897->1494|4009->1576|4044->1584|4146->1659|4161->1665|4218->1701|4249->1705|4259->1706|4288->1714|4327->1727|4336->1728|4377->1748|4451->1795|4499->1822|4546->1842|4556->1843|4592->1858|4694->1933|4709->1939|4764->1973|5078->2260|5088->2261|5123->2275|5572->2694|5602->2697
                  LINES: 24->1|25->2|30->3|35->3|39->7|39->7|39->7|41->9|42->10|42->10|43->11|44->12|44->12|45->13|52->20|52->20|52->20|53->21|53->21|53->21|54->22|54->22|54->22|54->22|54->22|54->22|54->22|55->23|56->24|60->28|60->28|60->28|61->29|62->30|62->30|62->30|63->31|64->32|66->34|68->36|68->36|68->36|69->37|69->37|76->44|76->44|76->44|77->45|80->48|80->48|80->48|81->49|81->49|81->49|82->50|82->50|82->50|83->51|84->52|86->54|88->56|88->56|88->56|88->56|88->56|88->56|89->57|89->57|89->57|90->58|90->58|91->59|91->59|91->59|93->61|93->61|93->61|98->66|98->66|98->66|112->80|113->81
                  -- GENERATED --
              */
          