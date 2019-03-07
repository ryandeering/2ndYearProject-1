
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


Seq[Any](format.raw/*5.1*/("""

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
                  DATE: Thu Mar 07 12:09:59 GMT 2019
                  SOURCE: /home/ryan/rawr/2ndYearProject2/app/views/AdminPanel/listProducts.scala.html
                  HASH: dc7ffedcdec7dcb1fdb38381fc7898ae258c5521
                  MATRIX: 662->1|701->34|739->66|1123->92|1309->185|1337->187|1408->233|1426->243|1462->271|1501->273|1531->276|1716->434|1731->440|1785->473|1861->523|1897->543|1937->545|1976->556|2013->566|2028->572|2088->611|2142->638|2152->639|2182->647|2222->657|2256->664|2326->708|2367->740|2407->742|2440->748|2511->792|2525->797|2561->812|2594->818|2634->828|2666->833|3028->1169|3062->1187|3102->1189|3134->1194|3230->1264|3327->1352|3367->1354|3401->1361|3483->1416|3513->1425|3550->1445|3563->1450|3602->1451|3636->1458|3746->1538|3779->1544|3811->1549|3821->1550|3848->1556|3891->1572|3901->1573|3930->1581|3973->1597|3983->1598|4019->1613|4062->1629|4072->1630|4102->1639|4152->1662|4200->1689|4272->1735|4297->1751|4337->1753|4370->1759|4418->1780|4433->1786|4494->1826|4682->1987|4697->1993|4758->2033|4929->2174|4961->2179|5002->2190|5079->2241|5104->2257|5144->2259|5174->2262|5220->2281|5235->2287|5286->2317|5398->2399|5427->2401|5576->2522|5605->2523|5635->2526|5696->2560|5724->2561|5752->2562|5793->2573
                  LINES: 24->1|25->2|26->3|31->4|36->5|38->7|39->8|39->8|39->8|39->8|42->11|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|49->18|49->18|50->19|51->20|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|59->28|61->30|75->44|75->44|75->44|76->45|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|82->51|83->52|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|89->58|89->58|89->58|90->59|91->60|91->60|91->60|96->65|96->65|96->65|100->69|101->70|102->71|105->74|105->74|105->74|106->75|107->76|107->76|107->76|111->80|112->81|117->86|117->86|118->87|119->88|119->88|120->89|121->90
                  -- GENERATED --
              */
          