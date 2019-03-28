
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


Seq[Any](format.raw/*2.1*/("""
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
                  DATE: Thu Mar 28 12:29:26 GMT 2019
                  SOURCE: /home/ryan/rawr/2ndYearProject2/app/views/AdminPanel/updateProduct.scala.html
                  HASH: 6dc8a89a28f4cbc7d41648f72c829b903d5ac06d
                  MATRIX: 1013->1|1171->90|1203->118|1247->87|1275->115|1303->134|1331->137|1349->147|1386->176|1425->178|1455->181|1510->210|1661->351|1702->353|1735->360|1747->364|1778->374|1809->379|1910->459|1940->463|2055->557|2094->569|2148->607|2188->609|2229->622|2306->672|2332->677|2374->692|2424->733|2464->735|2509->752|2561->773|2602->786|2632->789|2657->793|2710->815|2742->821|2956->1015|2987->1020|3098->1110|3128->1114|3239->1204|3269->1208|3372->1290|3402->1294|3505->1376|3537->1381|3766->1583|3781->1589|3835->1622|3952->1709|3985->1712
                  LINES: 28->1|31->3|32->6|35->2|36->4|38->7|40->9|40->9|40->9|40->9|42->11|45->14|45->14|45->14|47->16|47->16|47->16|49->18|49->18|50->19|50->19|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|57->26|58->27|58->27|58->27|59->28|62->31|67->36|69->38|69->38|70->39|70->39|71->40|71->40|72->41|72->41|75->44|82->51|82->51|82->51|86->55|88->57
                  -- GENERATED --
              */
          