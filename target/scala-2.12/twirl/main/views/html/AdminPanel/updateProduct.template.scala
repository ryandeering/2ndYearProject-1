
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

object updateProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[models.products.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateProductForm: Form[models.products.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.3*/import models.products._
/*6.2*/import helper._


Seq[Any](format.raw/*1.87*/("""

 """),format.raw/*4.1*/("""

"""),format.raw/*7.1*/("""

"""),_display_(/*9.2*/AdminPanel/*9.12*/.main("Update Product", user)/*9.41*/ {_display_(Seq[Any](format.raw/*9.43*/("""

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


		"""),_display_(/*31.4*/select(
			updateProductForm("platform.id"),
			options(Platform.options),
			'_label -> "Platform", '_default -> "Choose a Platform",
			'_showConstraints -> false, 'class -> "form-control"
		)),format.raw/*36.4*/("""

		"""),_display_(/*38.4*/inputText(updateProductForm("developer"), '_label -> "Developer",'class -> "form-control")),format.raw/*38.94*/("""
		"""),_display_(/*39.4*/inputText(updateProductForm("publisher"), '_label -> "Publisher",'class -> "form-control")),format.raw/*39.94*/("""
		"""),_display_(/*40.4*/inputText(updateProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*40.86*/("""
		"""),_display_(/*41.4*/inputText(updateProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*41.86*/("""


		"""),format.raw/*44.3*/("""<label>Image</label>
    <input class="btn-sm btn-default" type="file" name="upload">
	
		<br><br>

  <div class="actions">
      <input type="submit" value="Save" class="btn btn-primary">
			<a href=""""),_display_(/*51.14*/routes/*51.20*/.AdminProductCtrl.listProducts(0)),format.raw/*51.53*/(""""
				<button class="btn btn-warning" role="button">Cancel</button>
			</a>
  </div>
	""")))}),format.raw/*55.3*/("""

""")))}),format.raw/*57.2*/("""


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
                  DATE: Sat Mar 30 20:54:03 GMT 2019
                  SOURCE: /home/ryan/2ndyearproj/2ndYearProject/app/views/AdminPanel/updateProduct.scala.html
                  HASH: 9f796a96bab8d1feba3445c900a1deb70ab5808a
                  MATRIX: 1013->1|1171->92|1203->123|1248->86|1279->118|1309->140|1339->145|1357->155|1394->184|1433->186|1465->191|1523->223|1674->364|1715->366|1750->375|1762->379|1793->389|1826->396|1927->476|1958->481|2073->575|2115->590|2169->628|2209->630|2251->644|2328->694|2354->699|2397->715|2447->756|2487->758|2533->776|2586->798|2628->812|2658->815|2683->819|2737->842|2772->851|2991->1050|3024->1057|3135->1147|3166->1152|3277->1242|3308->1247|3411->1329|3442->1334|3545->1416|3580->1424|3816->1633|3831->1639|3885->1672|4006->1763|4041->1768
                  LINES: 28->1|31->3|32->6|35->1|37->4|39->7|41->9|41->9|41->9|41->9|43->11|46->14|46->14|46->14|48->16|48->16|48->16|50->18|50->18|51->19|51->19|54->22|54->22|54->22|55->23|55->23|55->23|56->24|56->24|56->24|57->25|58->26|59->27|59->27|59->27|60->28|63->31|68->36|70->38|70->38|71->39|71->39|72->40|72->40|73->41|73->41|76->44|83->51|83->51|83->51|87->55|89->57
                  -- GENERATED --
              */
          