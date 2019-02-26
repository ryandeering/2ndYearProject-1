
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
/*3.3*/import models.products._
/*6.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
 """),format.raw/*4.1*/("""

"""),format.raw/*7.1*/("""

"""),_display_(/*9.2*/productAdmin/*9.14*/.main("Update Product", user)/*9.43*/ {_display_(Seq[Any](format.raw/*9.45*/("""

	"""),format.raw/*11.2*/("""<h3>Update Product</h3>
	

	"""),_display_(/*14.3*/form(action = routes.AdminProductCtrl.updateProductSubmit(id), 'class -> "form-horizontal", 'role->"form", 'enctype -> "multipart/form-data")/*14.144*/ {_display_(Seq[Any](format.raw/*14.146*/("""
		
		"""),_display_(/*16.4*/CSRF/*16.8*/.formField),format.raw/*16.18*/("""

		"""),_display_(/*18.4*/inputText(updateProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*18.84*/("""
		"""),_display_(/*19.4*/inputText(updateProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*19.98*/("""


        """),_display_(/*22.10*/for((value, name) <- Category.options) yield /*22.48*/ {_display_(Seq[Any](format.raw/*22.50*/("""
            """),format.raw/*23.13*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*23.63*/value),format.raw/*23.68*/(""""
            """),_display_(/*24.14*/if(Category.inCategory(value.toLong, id))/*24.55*/ {_display_(Seq[Any](format.raw/*24.57*/("""
                """),format.raw/*25.17*/("""checked
            """)))}),format.raw/*26.14*/("""
            """),format.raw/*27.13*/("""/>"""),_display_(/*27.16*/name),format.raw/*27.20*/("""<br>        
        """)))}),format.raw/*28.10*/("""

		"""),_display_(/*30.4*/inputText(updateProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*30.86*/("""
		"""),_display_(/*31.4*/inputText(updateProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*31.86*/("""


		"""),format.raw/*34.3*/("""<label>Image</label>
    <input class="btn-sm btn-default" type="file" name="upload">
	
		<br><br>

  <div class="actions">
      <input type="submit" value="Save" class="btn btn-primary">
			<a href=""""),_display_(/*41.14*/routes/*41.20*/.AdminProductCtrl.listProducts(0)),format.raw/*41.53*/(""""
				<button class="btn btn-warning" role="button">Cancel</button>
			</a>
  </div>
	""")))}),format.raw/*45.3*/("""

""")))}),format.raw/*47.2*/("""


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
                  DATE: Tue Feb 26 21:00:36 GMT 2019
                  SOURCE: F:/2ndYearProject/app/views/productAdmin/updateProduct.scala.html
                  HASH: 944a729b2f857669f0af170966018e51cb003eca
                  MATRIX: 1015->1|1173->90|1205->118|1249->87|1277->115|1305->134|1333->137|1353->149|1390->178|1429->180|1459->183|1514->212|1665->353|1706->355|1739->362|1751->366|1782->376|1813->381|1914->461|1944->465|2059->559|2098->571|2152->609|2192->611|2233->624|2310->674|2336->679|2378->694|2428->735|2468->737|2513->754|2565->775|2606->788|2636->791|2661->795|2714->817|2745->822|2848->904|2878->908|2981->990|3013->995|3242->1197|3257->1203|3311->1236|3428->1323|3461->1326
                  LINES: 28->1|31->3|32->6|35->2|36->4|38->7|40->9|40->9|40->9|40->9|42->11|45->14|45->14|45->14|47->16|47->16|47->16|49->18|49->18|50->19|50->19|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|57->26|58->27|58->27|58->27|59->28|61->30|61->30|62->31|62->31|65->34|72->41|72->41|72->41|76->45|78->47
                  -- GENERATED --
              */
          