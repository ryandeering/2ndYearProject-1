
package views.html

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

object product extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[models.products.Product,String,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(product: models.products.Product, filter:String ,user : models.users.User, e: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.102*/("""

"""),_display_(/*3.2*/main("Product", user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""


"""),format.raw/*6.1*/("""<style>
body """),format.raw/*7.6*/("""{"""),format.raw/*7.7*/("""
  """),format.raw/*8.3*/("""font-family: 'open sans';
  overflow-x: hidden; """),format.raw/*9.23*/("""}"""),format.raw/*9.24*/("""

"""),format.raw/*11.1*/("""img """),format.raw/*11.5*/("""{"""),format.raw/*11.6*/("""
  """),format.raw/*12.3*/("""max-width: 100%; """),format.raw/*12.20*/("""}"""),format.raw/*12.21*/("""

"""),format.raw/*14.1*/(""".preview """),format.raw/*14.10*/("""{"""),format.raw/*14.11*/("""
  """),format.raw/*15.3*/("""display: -webkit-box;
  display: -webkit-flex;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
  -webkit-flex-direction: column;
      -ms-flex-direction: column;
          flex-direction: column; """),format.raw/*23.35*/("""}"""),format.raw/*23.36*/("""
  
"""),format.raw/*25.1*/(""".preview-pic """),format.raw/*25.14*/("""{"""),format.raw/*25.15*/("""
  """),format.raw/*26.3*/("""-webkit-box-flex: 1;
  -webkit-flex-grow: 1;
      -ms-flex-positive: 1;
          flex-grow: 1; """),format.raw/*29.25*/("""}"""),format.raw/*29.26*/("""

"""),format.raw/*31.1*/(""".preview-thumbnail.nav-tabs """),format.raw/*31.29*/("""{"""),format.raw/*31.30*/("""
  """),format.raw/*32.3*/("""border: none;
  margin-top: 15px; """),format.raw/*33.21*/("""}"""),format.raw/*33.22*/("""
  """),format.raw/*34.3*/(""".preview-thumbnail.nav-tabs li """),format.raw/*34.34*/("""{"""),format.raw/*34.35*/("""
    """),format.raw/*35.5*/("""width: 18%;
    margin-right: 2.5%; """),format.raw/*36.25*/("""}"""),format.raw/*36.26*/("""
    """),format.raw/*37.5*/(""".preview-thumbnail.nav-tabs li img """),format.raw/*37.40*/("""{"""),format.raw/*37.41*/("""
      """),format.raw/*38.7*/("""max-width: 100%;
      display: block; """),format.raw/*39.23*/("""}"""),format.raw/*39.24*/("""
    """),format.raw/*40.5*/(""".preview-thumbnail.nav-tabs li a """),format.raw/*40.38*/("""{"""),format.raw/*40.39*/("""
      """),format.raw/*41.7*/("""padding: 0;
      margin: 0; """),format.raw/*42.18*/("""}"""),format.raw/*42.19*/("""
    """),format.raw/*43.5*/(""".preview-thumbnail.nav-tabs li:last-of-type """),format.raw/*43.49*/("""{"""),format.raw/*43.50*/("""
      """),format.raw/*44.7*/("""margin-right: 0; """),format.raw/*44.24*/("""}"""),format.raw/*44.25*/("""

"""),format.raw/*46.1*/(""".tab-content """),format.raw/*46.14*/("""{"""),format.raw/*46.15*/("""
  """),format.raw/*47.3*/("""overflow: hidden; """),format.raw/*47.21*/("""}"""),format.raw/*47.22*/("""
  """),format.raw/*48.3*/(""".tab-content img """),format.raw/*48.20*/("""{"""),format.raw/*48.21*/("""
    """),format.raw/*49.5*/("""width: 100%;
    -webkit-animation-name: opacity;
            animation-name: opacity;
    -webkit-animation-duration: .3s;
            animation-duration: .3s; """),format.raw/*53.38*/("""}"""),format.raw/*53.39*/("""

"""),format.raw/*55.1*/(""".card """),format.raw/*55.7*/("""{"""),format.raw/*55.8*/("""
  """),format.raw/*56.3*/("""margin-top: 50px;
  background: #eee;
  padding: 3em;
  line-height: 1.5em; """),format.raw/*59.23*/("""}"""),format.raw/*59.24*/("""


"""),format.raw/*62.1*/(""".details """),format.raw/*62.10*/("""{"""),format.raw/*62.11*/("""
  """),format.raw/*63.3*/("""display: -webkit-box;
  display: -webkit-flex;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
  -webkit-flex-direction: column;
      -ms-flex-direction: column;
          flex-direction: column; """),format.raw/*71.35*/("""}"""),format.raw/*71.36*/("""

"""),format.raw/*73.1*/(""".colors """),format.raw/*73.9*/("""{"""),format.raw/*73.10*/("""
  """),format.raw/*74.3*/("""-webkit-box-flex: 1;
  -webkit-flex-grow: 1;
      -ms-flex-positive: 1;
          flex-grow: 1; """),format.raw/*77.25*/("""}"""),format.raw/*77.26*/("""

"""),format.raw/*79.1*/(""".product-title, .price, .sizes, .colors """),format.raw/*79.41*/("""{"""),format.raw/*79.42*/("""
  """),format.raw/*80.3*/("""text-transform: UPPERCASE;
  font-weight: bold; """),format.raw/*81.22*/("""}"""),format.raw/*81.23*/("""

"""),format.raw/*83.1*/(""".checked, .price span """),format.raw/*83.23*/("""{"""),format.raw/*83.24*/("""
  """),format.raw/*84.3*/("""color: #ff9f1a; """),format.raw/*84.19*/("""}"""),format.raw/*84.20*/("""

"""),format.raw/*86.1*/(""".product-title, .rating, .product-description, .price, .vote, .sizes """),format.raw/*86.70*/("""{"""),format.raw/*86.71*/("""
  """),format.raw/*87.3*/("""margin-bottom: 15px; """),format.raw/*87.24*/("""}"""),format.raw/*87.25*/("""

"""),format.raw/*89.1*/(""".product-title """),format.raw/*89.16*/("""{"""),format.raw/*89.17*/("""
  """),format.raw/*90.3*/("""margin-top: 0; """),format.raw/*90.18*/("""}"""),format.raw/*90.19*/("""

"""),format.raw/*92.1*/(""".size """),format.raw/*92.7*/("""{"""),format.raw/*92.8*/("""
  """),format.raw/*93.3*/("""margin-right: 10px; """),format.raw/*93.23*/("""}"""),format.raw/*93.24*/("""
  """),format.raw/*94.3*/(""".size:first-of-type """),format.raw/*94.23*/("""{"""),format.raw/*94.24*/("""
    """),format.raw/*95.5*/("""margin-left: 40px; """),format.raw/*95.24*/("""}"""),format.raw/*95.25*/("""

"""),format.raw/*97.1*/(""".color """),format.raw/*97.8*/("""{"""),format.raw/*97.9*/("""
  """),format.raw/*98.3*/("""display: inline-block;
  vertical-align: middle;
  margin-right: 10px;
  height: 2em;
  width: 2em;
  border-radius: 2px; """),format.raw/*103.23*/("""}"""),format.raw/*103.24*/("""
  """),format.raw/*104.3*/(""".color:first-of-type """),format.raw/*104.24*/("""{"""),format.raw/*104.25*/("""
    """),format.raw/*105.5*/("""margin-left: 20px; """),format.raw/*105.24*/("""}"""),format.raw/*105.25*/("""

"""),format.raw/*107.1*/(""".add-to-cart, .like """),format.raw/*107.21*/("""{"""),format.raw/*107.22*/("""
  """),format.raw/*108.3*/("""background: #ff9f1a;
  padding: 1.2em 1.5em;
  border: none;
  text-transform: UPPERCASE;
  font-weight: bold;
  color: #fff;
  -webkit-transition: background .3s ease;
          transition: background .3s ease; """),format.raw/*115.44*/("""}"""),format.raw/*115.45*/("""
  """),format.raw/*116.3*/(""".add-to-cart:hover, .like:hover """),format.raw/*116.35*/("""{"""),format.raw/*116.36*/("""
    """),format.raw/*117.5*/("""background: #b36800;
    color: #fff; """),format.raw/*118.18*/("""}"""),format.raw/*118.19*/("""

"""),format.raw/*120.1*/(""".not-available """),format.raw/*120.16*/("""{"""),format.raw/*120.17*/("""
  """),format.raw/*121.3*/("""text-align: center;
  line-height: 2em; """),format.raw/*122.21*/("""}"""),format.raw/*122.22*/("""
  """),format.raw/*123.3*/(""".not-available:before """),format.raw/*123.25*/("""{"""),format.raw/*123.26*/("""
    """),format.raw/*124.5*/("""font-family: fontawesome;
    content: "\f00d";
    color: #fff; """),format.raw/*126.18*/("""}"""),format.raw/*126.19*/("""

"""),format.raw/*128.1*/(""".orange """),format.raw/*128.9*/("""{"""),format.raw/*128.10*/("""
  """),format.raw/*129.3*/("""background: #ff9f1a; """),format.raw/*129.24*/("""}"""),format.raw/*129.25*/("""

"""),format.raw/*131.1*/(""".green """),format.raw/*131.8*/("""{"""),format.raw/*131.9*/("""
  """),format.raw/*132.3*/("""background: #85ad00; """),format.raw/*132.24*/("""}"""),format.raw/*132.25*/("""

"""),format.raw/*134.1*/(""".blue """),format.raw/*134.7*/("""{"""),format.raw/*134.8*/("""
  """),format.raw/*135.3*/("""background: #0076ad; """),format.raw/*135.24*/("""}"""),format.raw/*135.25*/("""

"""),format.raw/*137.1*/(""".tooltip-inner """),format.raw/*137.16*/("""{"""),format.raw/*137.17*/("""
  """),format.raw/*138.3*/("""padding: 1.3em; """),format.raw/*138.19*/("""}"""),format.raw/*138.20*/("""



"""),format.raw/*142.1*/("""/*# sourceMappingURL=style.css.map */
</style>




    

	<div class="container">
		<div class="card">
			<div class="container-fliud">
				<div class="wrapper row">
					<div class="preview col-md-6">
						
						<div class="preview-pic tab-content">
						  <div class="tab-pane active" id="pic-1">
"""),_display_(/*158.2*/if(e.resource("public/images/productImages/" + product.getId + ".jpg").isDefined)/*158.83*/ {_display_(Seq[Any](format.raw/*158.85*/("""
                    """),format.raw/*159.21*/("""<img class="pic" src="/assets/images/productImages/"""),_display_(/*159.73*/(product.getId)),format.raw/*159.88*/(""".jpg"/>
                """)))}/*160.19*/else/*160.24*/{_display_(Seq[Any](format.raw/*160.25*/("""
                    """),format.raw/*161.21*/("""<img class="pic" src="/assets/images/productImages/thumbnails/noImage.png"/>
                """)))}),format.raw/*162.18*/("""
"""),format.raw/*163.1*/("""</div>
						 
						</div>
						
						
					</div>
					<div class="details col-md-6">
						<h3 class="product-title">"""),_display_(/*170.34*/product/*170.41*/.getName()),format.raw/*170.51*/(""" """),format.raw/*170.52*/("""for """),_display_(/*170.57*/product/*170.64*/.getPlatform.getName),format.raw/*170.84*/("""</h3>
						<div class="rating">
							<div class="stars">
								<span class="fa fa-star checked"></span>
								<span class="fa fa-star checked"></span>
								<span class="fa fa-star checked"></span>
								<span class="fa fa-star"></span>
								<span class="fa fa-star"></span>
							</div>
							<span class="review-no">41 reviews</span>
						</div>
						<p>Developer: """),_display_(/*181.22*/product/*181.29*/.getDeveloper),format.raw/*181.42*/("""</p>
						<p>Publisher: """),_display_(/*182.22*/product/*182.29*/.getPublisher),format.raw/*182.42*/("""</p>
						<p class="product-description">"""),_display_(/*183.39*/product/*183.46*/.getDescription),format.raw/*183.61*/("""</p>
						<h4 class="price">Price: &euro; """),_display_(/*184.40*/("%.2f".format(product.getPrice))),format.raw/*184.73*/("""</h4>
						<p class="vote"><strong>91%</strong> of buyers enjoyed this product! <strong>(87 votes)</strong></p>
						
						
						<div class="action">
                            """),_display_(/*189.30*/if((product.getStock > 0))/*189.56*/{_display_(Seq[Any](format.raw/*189.57*/("""
                    """),format.raw/*190.21*/("""<a href=""""),_display_(/*190.31*/routes/*190.37*/.ShoppingCtrl.addToBasket(product.getId)),format.raw/*190.77*/("""">
							<button class="add-to-cart btn btn-default" type="button">add to cart</button>
                                </a>
    """)))}),format.raw/*193.6*/("""

						"""),format.raw/*195.7*/("""</div>
					</div>
				</div>
			</div>
		</div>
	</div>



""")))}))
      }
    }
  }

  def render(product:models.products.Product,filter:String,user:models.users.User,e:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(product,filter,user,e)

  def f:((models.products.Product,String,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (product,filter,user,e) => apply(product,filter,user,e)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 30 20:54:03 GMT 2019
                  SOURCE: /home/ryan/2ndyearproj/2ndYearProject/app/views/product.scala.html
                  HASH: 7bb0a11adc77fcb2b4b81751bcf1b1506daa9a4c
                  MATRIX: 1013->1|1209->101|1239->106|1268->127|1307->129|1339->135|1379->149|1406->150|1436->154|1512->203|1540->204|1571->208|1602->212|1630->213|1661->217|1706->234|1735->235|1766->239|1803->248|1832->249|1863->253|2154->516|2183->517|2216->523|2257->536|2286->537|2317->541|2445->641|2474->642|2505->646|2561->674|2590->675|2621->679|2684->714|2713->715|2744->719|2803->750|2832->751|2865->757|2930->794|2959->795|2992->801|3055->836|3084->837|3119->845|3187->885|3216->886|3249->892|3310->925|3339->926|3374->934|3432->964|3461->965|3494->971|3566->1015|3595->1016|3630->1024|3675->1041|3704->1042|3735->1046|3776->1059|3805->1060|3836->1064|3882->1082|3911->1083|3942->1087|3987->1104|4016->1105|4049->1111|4242->1276|4271->1277|4302->1281|4335->1287|4363->1288|4394->1292|4501->1371|4530->1372|4563->1378|4600->1387|4629->1388|4660->1392|4951->1655|4980->1656|5011->1660|5046->1668|5075->1669|5106->1673|5234->1773|5263->1774|5294->1778|5362->1818|5391->1819|5422->1823|5499->1872|5528->1873|5559->1877|5609->1899|5638->1900|5669->1904|5713->1920|5742->1921|5773->1925|5870->1994|5899->1995|5930->1999|5979->2020|6008->2021|6039->2025|6082->2040|6111->2041|6142->2045|6185->2060|6214->2061|6245->2065|6278->2071|6306->2072|6337->2076|6385->2096|6414->2097|6445->2101|6493->2121|6522->2122|6555->2128|6602->2147|6631->2148|6662->2152|6696->2159|6724->2160|6755->2164|6911->2291|6941->2292|6973->2296|7023->2317|7053->2318|7087->2324|7135->2343|7165->2344|7197->2348|7246->2368|7276->2369|7308->2373|7556->2592|7586->2593|7618->2597|7679->2629|7709->2630|7743->2636|7811->2675|7841->2676|7873->2680|7917->2695|7947->2696|7979->2700|8049->2741|8079->2742|8111->2746|8162->2768|8192->2769|8226->2775|8322->2842|8352->2843|8384->2847|8420->2855|8450->2856|8482->2860|8532->2881|8562->2882|8594->2886|8629->2893|8658->2894|8690->2898|8740->2919|8770->2920|8802->2924|8836->2930|8865->2931|8897->2935|8947->2956|8977->2957|9009->2961|9053->2976|9083->2977|9115->2981|9160->2997|9190->2998|9226->3006|9572->3325|9663->3406|9704->3408|9755->3430|9835->3482|9872->3497|9918->3524|9932->3529|9972->3530|10023->3552|10150->3647|10180->3649|10338->3779|10355->3786|10387->3796|10417->3797|10450->3802|10467->3809|10509->3829|10934->4226|10951->4233|10986->4246|11041->4273|11058->4280|11093->4293|11165->4337|11182->4344|11219->4359|11292->4404|11347->4437|11563->4625|11599->4651|11639->4652|11690->4674|11728->4684|11744->4690|11806->4730|11971->4864|12009->4874
                  LINES: 28->1|33->1|35->3|35->3|35->3|38->6|39->7|39->7|40->8|41->9|41->9|43->11|43->11|43->11|44->12|44->12|44->12|46->14|46->14|46->14|47->15|55->23|55->23|57->25|57->25|57->25|58->26|61->29|61->29|63->31|63->31|63->31|64->32|65->33|65->33|66->34|66->34|66->34|67->35|68->36|68->36|69->37|69->37|69->37|70->38|71->39|71->39|72->40|72->40|72->40|73->41|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|78->46|78->46|78->46|79->47|79->47|79->47|80->48|80->48|80->48|81->49|85->53|85->53|87->55|87->55|87->55|88->56|91->59|91->59|94->62|94->62|94->62|95->63|103->71|103->71|105->73|105->73|105->73|106->74|109->77|109->77|111->79|111->79|111->79|112->80|113->81|113->81|115->83|115->83|115->83|116->84|116->84|116->84|118->86|118->86|118->86|119->87|119->87|119->87|121->89|121->89|121->89|122->90|122->90|122->90|124->92|124->92|124->92|125->93|125->93|125->93|126->94|126->94|126->94|127->95|127->95|127->95|129->97|129->97|129->97|130->98|135->103|135->103|136->104|136->104|136->104|137->105|137->105|137->105|139->107|139->107|139->107|140->108|147->115|147->115|148->116|148->116|148->116|149->117|150->118|150->118|152->120|152->120|152->120|153->121|154->122|154->122|155->123|155->123|155->123|156->124|158->126|158->126|160->128|160->128|160->128|161->129|161->129|161->129|163->131|163->131|163->131|164->132|164->132|164->132|166->134|166->134|166->134|167->135|167->135|167->135|169->137|169->137|169->137|170->138|170->138|170->138|174->142|190->158|190->158|190->158|191->159|191->159|191->159|192->160|192->160|192->160|193->161|194->162|195->163|202->170|202->170|202->170|202->170|202->170|202->170|202->170|213->181|213->181|213->181|214->182|214->182|214->182|215->183|215->183|215->183|216->184|216->184|221->189|221->189|221->189|222->190|222->190|222->190|222->190|225->193|227->195
                  -- GENERATED --
              */
          