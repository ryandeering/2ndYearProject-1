
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

object updateProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[models.products.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateProductForm: Form[models.products.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.3*/import models.products._
/*8.2*/import helper._


Seq[Any](format.raw/*2.1*/("""<!-- Product id and editProductForm parameters defined above
 passed to this view by the controller -->
 """),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!-- a 'helper' will be used to create the form dynamically, 
though a static HTML form would also work -->
"""),format.raw/*9.1*/("""
"""),format.raw/*10.1*/("""<!-- The page will be based on the main template -->
"""),_display_(/*11.2*/productAdmin/*11.14*/.main("Update Product", user)/*11.43*/ {_display_(Seq[Any](format.raw/*11.45*/("""

	"""),format.raw/*13.2*/("""<h3>Update Product</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*16.3*/form(action = routes.AdminProductCtrl.updateProductSubmit(id), 'class -> "form-horizontal", 'role->"form", 'enctype -> "multipart/form-data")/*16.144*/ {_display_(Seq[Any](format.raw/*16.146*/("""
		
		"""),_display_(/*18.4*/CSRF/*18.8*/.formField),format.raw/*18.18*/("""
		"""),format.raw/*19.3*/("""<!-- Build the form, adding an input for each field -->
		<!-- Note the label parameter -->
		"""),_display_(/*21.4*/inputText(updateProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*21.84*/("""
		"""),_display_(/*22.4*/inputText(updateProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*22.98*/("""

        """),format.raw/*24.9*/("""<!-- Checkboxes for categories - current categories for this product are checked -->
        <!-- Category.options provides a hashmap of value, name pairs -->
        <!-- If product (id) is in catagory - mark it as checked -->
        <!-- Checkbox name is catSelect[],  selected values will be stored in form object using catSelect defined in Product  -->
        """),_display_(/*28.10*/for((value, name) <- Category.options) yield /*28.48*/ {_display_(Seq[Any](format.raw/*28.50*/("""
            """),format.raw/*29.13*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*29.63*/value),format.raw/*29.68*/(""""
            """),_display_(/*30.14*/if(Category.inCategory(value.toLong, id))/*30.55*/ {_display_(Seq[Any](format.raw/*30.57*/("""
                """),format.raw/*31.17*/("""checked
            """)))}),format.raw/*32.14*/("""
            """),format.raw/*33.13*/("""/>"""),_display_(/*33.16*/name),format.raw/*33.20*/("""<br>        
        """)))}),format.raw/*34.10*/("""

		"""),_display_(/*36.4*/inputText(updateProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*36.86*/("""
		"""),_display_(/*37.4*/inputText(updateProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*37.86*/("""

		"""),format.raw/*39.3*/("""<!-- Image upload input -->
		<label>Image</label>
    <input class="btn-sm btn-default" type="file" name="upload">
	
		<br><br>

	<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Save" class="btn btn-primary">
			<a href=""""),_display_(/*48.14*/routes/*48.20*/.AdminProductCtrl.listProducts(0)),format.raw/*48.53*/(""""
				<button class="btn btn-warning" role="button">Cancel</button>
			</a>
  </div>
	""")))}),format.raw/*52.3*/(""" """),format.raw/*52.4*/("""<!-- End Form definition -->

""")))}),format.raw/*54.2*/(""" """),format.raw/*54.3*/("""<!-- End of page content -->


"""))
      }
    }
  }

  def render(id:Long,updateProductForm:Form[models.products.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateProductForm,user)

  def f:((Long,Form[models.products.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateProductForm,user) => apply(id,updateProductForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Feb 25 23:53:12 GMT 2019
                  SOURCE: C:/Users/Ryan3/Downloads/2ndYearProject (1)/2ndYearProject/app/views/productAdmin/updateProduct.scala.html
                  HASH: 3beeedd6935eefc6760e4d647bf7217e1b647093
                  MATRIX: 1015->1|1173->193|1205->328|1249->87|1380->218|1407->219|1541->344|1569->345|1649->399|1670->411|1708->440|1748->442|1778->445|1896->537|2047->678|2088->680|2121->687|2133->691|2164->701|2194->704|2315->799|2416->879|2446->883|2561->977|2598->987|2992->1354|3046->1392|3086->1394|3127->1407|3204->1457|3230->1462|3272->1477|3322->1518|3362->1520|3407->1537|3459->1558|3500->1571|3530->1574|3555->1578|3608->1600|3639->1605|3742->1687|3772->1691|3875->1773|3906->1777|4195->2039|4210->2045|4264->2078|4381->2165|4409->2166|4470->2197|4498->2198
                  LINES: 28->1|31->4|32->8|35->2|37->5|38->6|40->9|41->10|42->11|42->11|42->11|42->11|44->13|47->16|47->16|47->16|49->18|49->18|49->18|50->19|52->21|52->21|53->22|53->22|55->24|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|63->32|64->33|64->33|64->33|65->34|67->36|67->36|68->37|68->37|70->39|79->48|79->48|79->48|83->52|83->52|85->54|85->54
                  -- GENERATED --
              */
          