
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

"""),format.raw/*7.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*8.2*/productAdmin/*8.14*/.main("Products Page", user)/*8.42*/ {_display_(Seq[Any](format.raw/*8.44*/("""


"""),format.raw/*11.1*/("""<div class="row">

  <div class="col-md-3">
      <div class="list-group">
				<!-- Start of For loop - For each c in categories add a link -->
				<a href=""""),_display_(/*16.15*/routes/*16.21*/.AdminProductCtrl.listProducts(0)),format.raw/*16.54*/("""" class="list-group-item">All categories</a>
				"""),_display_(/*17.6*/for(c <- categories) yield /*17.26*/ {_display_(Seq[Any](format.raw/*17.28*/("""
          """),format.raw/*18.11*/("""<a href=""""),_display_(/*18.21*/routes/*18.27*/.AdminProductCtrl.listProducts(c.getId)),format.raw/*18.66*/("""" class="list-group-item">"""),_display_(/*18.93*/c/*18.94*/.getName),format.raw/*18.102*/("""</a>
				""")))}),format.raw/*19.6*/("""
      """),format.raw/*20.7*/("""</div>
  </div>

	<div class="col-md-9">
		"""),_display_(/*24.4*/if(flash.containsKey("success"))/*24.36*/ {_display_(Seq[Any](format.raw/*24.38*/("""
			  """),format.raw/*25.6*/("""<div class="alert alert-success">
			      """),_display_(/*26.11*/flash/*26.16*/.get("success")),format.raw/*26.31*/("""
			  """),format.raw/*27.6*/("""</div>
		""")))}),format.raw/*28.4*/(""" 

		"""),format.raw/*30.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
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
				<!-- Start of For loop - For each p in products add a row -->
				"""),_display_(/*44.6*/for(p <- products) yield /*44.24*/ {_display_(Seq[Any](format.raw/*44.26*/("""
				"""),format.raw/*45.5*/("""<tr>
					<!-- Display each product field value in a column -->
					"""),_display_(/*47.7*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*47.95*/ {_display_(Seq[Any](format.raw/*47.97*/("""
						"""),format.raw/*48.7*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*48.62*/(p.getId)),format.raw/*48.71*/(""".jpg"/></td>
					""")))}/*49.8*/else/*49.13*/{_display_(Seq[Any](format.raw/*49.14*/("""
						"""),format.raw/*50.7*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
					""")))}),format.raw/*51.7*/("""
					"""),format.raw/*52.6*/("""<td>"""),_display_(/*52.11*/p/*52.12*/.getId),format.raw/*52.18*/("""</td>
					<td>"""),_display_(/*53.11*/p/*53.12*/.getName),format.raw/*53.20*/("""</td>
					<td>"""),_display_(/*54.11*/p/*54.12*/.getDescription),format.raw/*54.27*/("""</td>
					<td>"""),_display_(/*55.11*/p/*55.12*/.getStock),format.raw/*55.21*/("""</td>
					<td>&euro; """),_display_(/*56.18*/("%.2f".format(p.getPrice))),format.raw/*56.45*/("""</td>
					<!-- Edit product button -->
					"""),_display_(/*58.7*/if(user != null)/*58.23*/ {_display_(Seq[Any](format.raw/*58.25*/("""
					"""),format.raw/*59.6*/("""<td>
						<a href=""""),_display_(/*60.17*/routes/*60.23*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*60.63*/("""" class="btn-xs btn-danger">
						<span class="glyphicon glyphicon-pencil"></span></a>
					</td>
					<!-- Delete product button -->
					<td>
						<a href=""""),_display_(/*65.17*/routes/*65.23*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*65.63*/("""" class="btn-xs btn-danger"
						onclick="return confirmDel();">
						<span class="glyphicon glyphicon-trash"></span></a>
					</td>
					""")))}),format.raw/*69.7*/("""
				"""),format.raw/*70.5*/("""</tr>
				""")))}),format.raw/*71.6*/("""<!-- End of For loop -->
			</tbody>
		</table>
		"""),_display_(/*74.4*/if(user != null)/*74.20*/ {_display_(Seq[Any](format.raw/*74.22*/("""
		"""),format.raw/*75.3*/("""<div>
			<a href=""""),_display_(/*76.14*/routes/*76.20*/.AdminProductCtrl.addProduct()),format.raw/*76.50*/("""">
				<button class="btn btn-primary">Add a Product</button>
			</a>
		</div>
		""")))}),format.raw/*80.4*/("""
	"""),format.raw/*81.2*/("""</div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*86.24*/("""{"""),format.raw/*86.25*/("""
		"""),format.raw/*87.3*/("""return confirm('Are you sure?');
	"""),format.raw/*88.2*/("""}"""),format.raw/*88.3*/("""
"""),format.raw/*89.1*/("""</script>
""")))}),format.raw/*90.2*/("""

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
                  DATE: Tue Feb 19 14:13:14 GMT 2019
                  SOURCE: /home/wdd/wdd1labs/2ndYearProject/GameShop_Project/app/views/productAdmin/listProducts.scala.html
                  HASH: 8d70807031b8a61caaf665fa38d79be67c783d29
                  MATRIX: 664->1|703->34|741->66|1125->92|1311->185|1339->187|1410->233|1430->245|1466->273|1505->275|1535->278|1720->436|1735->442|1789->475|1865->525|1901->545|1941->547|1980->558|2017->568|2032->574|2092->613|2146->640|2156->641|2186->649|2226->659|2260->666|2330->710|2371->742|2411->744|2444->750|2515->794|2529->799|2565->814|2598->820|2638->830|2670->835|3032->1171|3066->1189|3106->1191|3138->1196|3234->1266|3331->1354|3371->1356|3405->1363|3487->1418|3517->1427|3554->1447|3567->1452|3606->1453|3640->1460|3750->1540|3783->1546|3815->1551|3825->1552|3852->1558|3895->1574|3905->1575|3934->1583|3977->1599|3987->1600|4023->1615|4066->1631|4076->1632|4106->1641|4156->1664|4204->1691|4276->1737|4301->1753|4341->1755|4374->1761|4422->1782|4437->1788|4498->1828|4686->1989|4701->1995|4762->2035|4933->2176|4965->2181|5006->2192|5083->2243|5108->2259|5148->2261|5178->2264|5224->2283|5239->2289|5290->2319|5402->2401|5431->2403|5580->2524|5609->2525|5639->2528|5700->2562|5728->2563|5756->2564|5797->2575
                  LINES: 24->1|25->2|26->3|31->4|36->5|38->7|39->8|39->8|39->8|39->8|42->11|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|49->18|49->18|50->19|51->20|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|59->28|61->30|75->44|75->44|75->44|76->45|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|82->51|83->52|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|89->58|89->58|89->58|90->59|91->60|91->60|91->60|96->65|96->65|96->65|100->69|101->70|102->71|105->74|105->74|105->74|106->75|107->76|107->76|107->76|111->80|112->81|117->86|117->86|118->87|119->88|119->88|120->89|121->90
                  -- GENERATED --
              */
          