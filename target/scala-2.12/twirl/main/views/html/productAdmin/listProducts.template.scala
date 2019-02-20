
package views.html.productAdmin

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

object listProducts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[play.api.Environment,List[Category],List[Product],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(env: play.api.Environment, categories: List[Category], products: List[Product], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.1*/("""

"""),_display_(/*7.2*/productAdmin/*7.14*/.main("Products Page", user)/*7.42*/ {_display_(Seq[Any](format.raw/*7.44*/("""


"""),format.raw/*10.1*/("""<div class="row">

  <div class="col-md-3">
      <div class="list-group">
				<!-- Start of For loop - For each c in categories add a link -->
				<a href=""""),_display_(/*15.15*/routes/*15.21*/.AdminProductCtrl.listProducts(0)),format.raw/*15.54*/("""" class="list-group-item">All categories</a>
				"""),_display_(/*16.6*/for(c <- categories) yield /*16.26*/ {_display_(Seq[Any](format.raw/*16.28*/("""
          """),format.raw/*17.11*/("""<a href=""""),_display_(/*17.21*/routes/*17.27*/.AdminProductCtrl.listProducts(c.getId)),format.raw/*17.66*/("""" class="list-group-item">"""),_display_(/*17.93*/c/*17.94*/.getName),format.raw/*17.102*/("""</a>
				""")))}),format.raw/*18.6*/("""
      """),format.raw/*19.7*/("""</div>
  </div>

	<div class="col-md-9">
		"""),_display_(/*23.4*/if(flash.containsKey("success"))/*23.36*/ {_display_(Seq[Any](format.raw/*23.38*/("""
			  """),format.raw/*24.6*/("""<div class="alert alert-success">
			      """),_display_(/*25.11*/flash/*25.16*/.get("success")),format.raw/*25.31*/("""
			  """),format.raw/*26.6*/("""</div>
		""")))}),format.raw/*27.4*/(""" 

		"""),format.raw/*29.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<tr>
                <th></th>
				<th>ID</th>
				<th>Name</th>
				<th>Description</th>
				<th>Stock</th>
				<th>Price</th>
			</tr>
			</thead>
			<tbody>
				"""),_display_(/*41.6*/for(p <- products) yield /*41.24*/ {_display_(Seq[Any](format.raw/*41.26*/("""
				"""),format.raw/*42.5*/("""<tr>
					"""),_display_(/*43.7*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*43.95*/ {_display_(Seq[Any](format.raw/*43.97*/("""
						"""),format.raw/*44.7*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*44.62*/(p.getId)),format.raw/*44.71*/(""".jpg"/></td>
					""")))}/*45.8*/else/*45.13*/{_display_(Seq[Any](format.raw/*45.14*/("""
						"""),format.raw/*46.7*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
					""")))}),format.raw/*47.7*/("""
					"""),format.raw/*48.6*/("""<td>"""),_display_(/*48.11*/p/*48.12*/.getId),format.raw/*48.18*/("""</td>
					<td>"""),_display_(/*49.11*/p/*49.12*/.getName),format.raw/*49.20*/("""</td>
					<td>"""),_display_(/*50.11*/p/*50.12*/.getDescription),format.raw/*50.27*/("""</td>
					<td>"""),_display_(/*51.11*/p/*51.12*/.getStock),format.raw/*51.21*/("""</td>
					<td>&euro; """),_display_(/*52.18*/("%.2f".format(p.getPrice))),format.raw/*52.45*/("""</td>
					<!-- Edit product button -->
					"""),_display_(/*54.7*/if(user != null)/*54.23*/ {_display_(Seq[Any](format.raw/*54.25*/("""
					"""),format.raw/*55.6*/("""<td>
						<a href=""""),_display_(/*56.17*/routes/*56.23*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*56.63*/("""" class="btn-xs btn-danger">
						<span class="glyphicon glyphicon-pencil"></span></a>
					</td>
					<!-- Delete product button -->
					<td>
						<a href=""""),_display_(/*61.17*/routes/*61.23*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*61.63*/("""" class="btn-xs btn-danger"
						onclick="return confirmDel();">
						<span class="glyphicon glyphicon-trash"></span></a>
					</td>
					""")))}),format.raw/*65.7*/("""
				"""),format.raw/*66.5*/("""</tr>
				""")))}),format.raw/*67.6*/("""<!-- End of For loop -->
			</tbody>
		</table>
		"""),_display_(/*70.4*/if(user != null)/*70.20*/ {_display_(Seq[Any](format.raw/*70.22*/("""
		"""),format.raw/*71.3*/("""<div>
			<a href=""""),_display_(/*72.14*/routes/*72.20*/.AdminProductCtrl.addProduct()),format.raw/*72.50*/("""">
				<button class="btn btn-primary">Add a Product</button>
			</a>
		</div>
		""")))}),format.raw/*76.4*/("""
	"""),format.raw/*77.2*/("""</div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*82.24*/("""{"""),format.raw/*82.25*/("""
		"""),format.raw/*83.3*/("""return confirm('Are you sure?');
	"""),format.raw/*84.2*/("""}"""),format.raw/*84.3*/("""
"""),format.raw/*85.1*/("""</script>
""")))}),format.raw/*86.2*/("""

"""))
      }
    }
  }

  def render(env:play.api.Environment,categories:List[Category],products:List[Product],user:User): play.twirl.api.HtmlFormat.Appendable = apply(env,categories,products,user)

  def f:((play.api.Environment,List[Category],List[Product],User) => play.twirl.api.HtmlFormat.Appendable) = (env,categories,products,user) => apply(env,categories,products,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 20 15:21:11 GMT 2019
                  SOURCE: /home/ryan/Documents/2ndYearProject/app/views/productAdmin/listProducts.scala.html
                  HASH: ba10e092ff4eba4b5681d41391f27ab8744db339
                  MATRIX: 664->1|703->34|741->66|1125->92|1311->185|1339->188|1359->200|1395->228|1434->230|1464->233|1649->391|1664->397|1718->430|1794->480|1830->500|1870->502|1909->513|1946->523|1961->529|2021->568|2075->595|2085->596|2115->604|2155->614|2189->621|2259->665|2300->697|2340->699|2373->705|2444->749|2458->754|2494->769|2527->775|2567->785|2599->790|2869->1034|2903->1052|2943->1054|2975->1059|3012->1070|3109->1158|3149->1160|3183->1167|3265->1222|3295->1231|3332->1251|3345->1256|3384->1257|3418->1264|3528->1344|3561->1350|3593->1355|3603->1356|3630->1362|3673->1378|3683->1379|3712->1387|3755->1403|3765->1404|3801->1419|3844->1435|3854->1436|3884->1445|3934->1468|3982->1495|4054->1541|4079->1557|4119->1559|4152->1565|4200->1586|4215->1592|4276->1632|4464->1793|4479->1799|4540->1839|4711->1980|4743->1985|4784->1996|4861->2047|4886->2063|4926->2065|4956->2068|5002->2087|5017->2093|5068->2123|5180->2205|5209->2207|5358->2328|5387->2329|5417->2332|5478->2366|5506->2367|5534->2368|5575->2379
                  LINES: 24->1|25->2|26->3|31->4|36->5|38->7|38->7|38->7|38->7|41->10|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|48->17|48->17|49->18|50->19|54->23|54->23|54->23|55->24|56->25|56->25|56->25|57->26|58->27|60->29|72->41|72->41|72->41|73->42|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|78->47|79->48|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|85->54|85->54|85->54|86->55|87->56|87->56|87->56|92->61|92->61|92->61|96->65|97->66|98->67|101->70|101->70|101->70|102->71|103->72|103->72|103->72|107->76|108->77|113->82|113->82|114->83|115->84|115->84|116->85|117->86
                  -- GENERATED --
              */
          