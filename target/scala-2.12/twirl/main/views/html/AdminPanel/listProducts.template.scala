
package views.html.AdminPanel

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


Seq[Any](format.raw/*4.94*/("""


"""),format.raw/*7.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*8.2*/AdminPanel/*8.12*/.main("Products Page", user)/*8.40*/ {_display_(Seq[Any](format.raw/*8.42*/("""


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
                  DATE: Sun Mar 31 18:24:52 BST 2019
                  SOURCE: C:/Users/Ryan3/Desktop/2ndYearProject/app/views/AdminPanel/listProducts.scala.html
                  HASH: cd7f09398fad22e2eed27c36acebb4e44c4396a2
                  MATRIX: 662->1|701->35|739->68|1123->95|1310->187|1342->193|1414->240|1432->250|1468->278|1507->280|1540->286|1730->449|1745->455|1799->488|1876->539|1912->559|1952->561|1992->573|2029->583|2044->589|2104->628|2158->655|2168->656|2198->664|2239->675|2274->683|2348->731|2389->763|2429->765|2463->772|2535->817|2549->822|2585->837|2619->844|2660->855|2694->862|3070->1212|3104->1230|3144->1232|3177->1238|3275->1310|3372->1398|3412->1400|3447->1408|3529->1463|3559->1472|3597->1493|3610->1498|3649->1499|3684->1507|3795->1588|3829->1595|3861->1600|3871->1601|3898->1607|3942->1624|3952->1625|3981->1633|4025->1650|4035->1651|4071->1666|4115->1683|4125->1684|4155->1693|4206->1717|4254->1744|4328->1792|4353->1808|4393->1810|4427->1817|4476->1839|4491->1845|4552->1885|4745->2051|4760->2057|4821->2097|4996->2242|5029->2248|5071->2260|5151->2314|5176->2330|5216->2332|5247->2336|5294->2356|5309->2362|5360->2392|5476->2478|5506->2481|5660->2607|5689->2608|5720->2612|5782->2647|5810->2648|5839->2650|5881->2662
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|40->8|40->8|40->8|40->8|43->11|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|50->18|50->18|50->18|50->18|51->19|52->20|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|60->28|62->30|76->44|76->44|76->44|77->45|79->47|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|82->50|83->51|84->52|84->52|84->52|84->52|85->53|85->53|85->53|86->54|86->54|86->54|87->55|87->55|87->55|88->56|88->56|90->58|90->58|90->58|91->59|92->60|92->60|92->60|97->65|97->65|97->65|101->69|102->70|103->71|106->74|106->74|106->74|107->75|108->76|108->76|108->76|112->80|113->81|118->86|118->86|119->87|120->88|120->88|121->89|122->90
                  -- GENERATED --
              */
          