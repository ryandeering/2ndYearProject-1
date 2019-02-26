
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.products.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addProductForm: Form[models.products.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import models.products._
/*8.2*/import helper._


Seq[Any](format.raw/*2.1*/("""<!-- addProductForm defined above is the parameter
 passed to this view by the controller -->
"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!-- a 'helper' will be used to create the form dynamically, 
though a static HTML form would also work -->
"""),format.raw/*9.1*/("""
"""),format.raw/*10.1*/("""<!-- The page will be based on the main template -->
"""),_display_(/*11.2*/productAdmin/*11.14*/.main("New Product", user)/*11.40*/ {_display_(Seq[Any](format.raw/*11.42*/("""

	"""),format.raw/*13.2*/("""<h3>Add a new Product</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*16.3*/form(action = routes.AdminProductCtrl.addProductSubmit(), 'class -> "form-horizontal", 'role->"form", 'method -> "POST", 'enctype -> "multipart/form-data")/*16.158*/ {_display_(Seq[Any](format.raw/*16.160*/("""
		"""),_display_(/*17.4*/CSRF/*17.8*/.formField),format.raw/*17.18*/("""
		"""),format.raw/*18.3*/("""<!-- Build the form, adding an input for each field -->
		<!-- Note the label parameter -->
		"""),_display_(/*20.4*/inputText(addProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*20.81*/("""
		"""),_display_(/*21.4*/inputText(addProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*21.95*/("""

        """),format.raw/*23.9*/("""<!-- Checkboxes for categories - current categories for this product are checked -->
        <!-- Category.options provides a hashmap of value, name pairs -->
        """),_display_(/*25.10*/for((value, name) <- Category.options) yield /*25.48*/ {_display_(Seq[Any](format.raw/*25.50*/("""
            """),format.raw/*26.13*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*26.63*/value),format.raw/*26.68*/("""" />"""),_display_(/*26.73*/name),format.raw/*26.77*/("""<br>        
        """)))}),format.raw/*27.10*/("""

		"""),_display_(/*29.4*/inputText(addProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*29.83*/("""
		"""),_display_(/*30.4*/inputText(addProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*30.83*/("""

		"""),format.raw/*32.3*/("""<!-- Image upload input -->
		<label>Image</label>
    <input class="btn-sm btn-default" type="file" name="upload">
	
		<br><br>

	<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Add Product" class="btn btn-primary">
			<a href=""""),_display_(/*41.14*/routes/*41.20*/.AdminProductCtrl.listProducts(0)),format.raw/*41.53*/(""""
				<button class="btn btn-warning">Cancel</button>
			</a>
  </div>
	""")))}),format.raw/*45.3*/(""" """),format.raw/*45.4*/("""<!-- End Form definition -->

""")))}),format.raw/*47.2*/(""" """),format.raw/*47.3*/("""<!-- End of page content -->


"""))
      }
    }
  }

  def render(addProductForm:Form[models.products.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm,user)

  def f:((Form[models.products.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm,user) => apply(addProductForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 26 21:00:36 GMT 2019
                  SOURCE: F:/2ndYearProject/app/views/productAdmin/addProduct.scala.html
                  HASH: d3bd2a932f5a53c757a1d46c4b1d62f8363e364e
                  MATRIX: 1007->1|1152->169|1184->304|1228->74|1348->194|1375->195|1509->320|1537->321|1617->375|1638->387|1673->413|1713->415|1743->418|1864->513|2029->668|2070->670|2100->674|2112->678|2143->688|2173->691|2294->786|2392->863|2422->867|2534->958|2571->968|2766->1136|2820->1174|2860->1176|2901->1189|2978->1239|3004->1244|3036->1249|3061->1253|3114->1275|3145->1280|3245->1359|3275->1363|3375->1442|3406->1446|3702->1715|3717->1721|3771->1754|3874->1827|3902->1828|3963->1859|3991->1860
                  LINES: 28->1|31->4|32->8|35->2|37->5|38->6|40->9|41->10|42->11|42->11|42->11|42->11|44->13|47->16|47->16|47->16|48->17|48->17|48->17|49->18|51->20|51->20|52->21|52->21|54->23|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|58->27|60->29|60->29|61->30|61->30|63->32|72->41|72->41|72->41|76->45|76->45|78->47|78->47
                  -- GENERATED --
              */
          