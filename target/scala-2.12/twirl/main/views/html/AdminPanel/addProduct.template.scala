
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.products.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addProductForm: Form[models.products.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import models.products._
/*8.2*/import helper._


Seq[Any](format.raw/*1.74*/("""
"""),format.raw/*2.1*/("""<!-- addProductForm defined above is the parameter
 passed to this view by the controller -->
"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!-- a 'helper' will be used to create the form dynamically, 
though a static HTML form would also work -->
"""),format.raw/*9.1*/("""
"""),format.raw/*10.1*/("""<!-- The page will be based on the main template -->
"""),_display_(/*11.2*/AdminPanel/*11.12*/.main("New Product", user)/*11.38*/ {_display_(Seq[Any](format.raw/*11.40*/("""

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

	"""),_display_(/*29.3*/select(
		addProductForm("platform.id"),
		options(Platform.options),
		'_label -> "Platform", '_default -> "Choose a Platform",
		'_showConstraints -> false, 'class -> "form-control"
	)),format.raw/*34.3*/("""

		"""),_display_(/*36.4*/inputText(addProductForm("developer"), '_label -> "Developer",'class -> "form-control")),format.raw/*36.91*/("""
		"""),_display_(/*37.4*/inputText(addProductForm("publisher"), '_label -> "Publisher",'class -> "form-control")),format.raw/*37.91*/("""
		"""),_display_(/*38.4*/inputText(addProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*38.83*/("""
		"""),_display_(/*39.4*/inputText(addProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*39.83*/("""


	"""),format.raw/*42.2*/("""<!-- Image upload input -->
		<label>Image</label>
    <input class="btn-sm btn-default" type="file" name="upload">
	
		<br><br>

	<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Add Product" class="btn btn-primary">
			<a href=""""),_display_(/*51.14*/routes/*51.20*/.AdminProductCtrl.listProducts(0)),format.raw/*51.53*/("""">
				<button class="btn btn-warning">Cancel</button>
			</a>
  </div>
	""")))}),format.raw/*55.3*/(""" """),format.raw/*55.4*/("""<!-- End Form definition -->

""")))}),format.raw/*57.2*/(""" """),format.raw/*57.3*/("""<!-- End of page content -->


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
                  DATE: Wed Apr 03 23:20:41 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/a/2ndYearProject/app/views/AdminPanel/addProduct.scala.html
                  HASH: 851be70aa9b31e815ae84dcbd85e695bdf655bd7
                  MATRIX: 1005->1|1150->172|1182->311|1227->73|1255->75|1377->198|1405->200|1541->328|1570->330|1651->385|1670->395|1705->421|1745->423|1777->428|1901->526|2066->681|2107->683|2138->688|2150->692|2181->702|2212->706|2335->803|2433->880|2464->885|2576->976|2615->988|2812->1158|2866->1196|2906->1198|2948->1212|3025->1262|3051->1267|3083->1272|3108->1276|3162->1299|3194->1305|3405->1496|3438->1503|3546->1590|3577->1595|3685->1682|3716->1687|3816->1766|3847->1771|3947->1850|3981->1857|4286->2135|4301->2141|4355->2174|4463->2252|4491->2253|4554->2286|4582->2287
                  LINES: 28->1|31->4|32->8|35->1|36->2|38->5|39->6|41->9|42->10|43->11|43->11|43->11|43->11|45->13|48->16|48->16|48->16|49->17|49->17|49->17|50->18|52->20|52->20|53->21|53->21|55->23|57->25|57->25|57->25|58->26|58->26|58->26|58->26|58->26|59->27|61->29|66->34|68->36|68->36|69->37|69->37|70->38|70->38|71->39|71->39|74->42|83->51|83->51|83->51|87->55|87->55|89->57|89->57
                  -- GENERATED --
              */
          