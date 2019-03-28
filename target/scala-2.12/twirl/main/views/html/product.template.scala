
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


Seq[Any](format.raw/*2.1*/("""
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
<a href=""""),_display_(/*189.11*/routes/*189.17*/.ShoppingCtrl.addToBasket(product.getId)),format.raw/*189.57*/("""">
							<button class="add-to-cart btn btn-default" type="button">add to cart</button>
</a>
							
						</div>
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
                  DATE: Thu Mar 28 12:29:26 GMT 2019
                  SOURCE: /home/ryan/rawr/2ndYearProject2/app/views/product.scala.html
                  HASH: 333467028335d6cc7a077b9f9dba2ccc0b0d8a64
                  MATRIX: 1013->1|1207->102|1234->104|1263->125|1302->127|1331->130|1370->143|1397->144|1426->147|1501->195|1529->196|1558->198|1589->202|1617->203|1647->206|1692->223|1721->224|1750->226|1787->235|1816->236|1846->239|2129->494|2158->495|2189->499|2230->512|2259->513|2289->516|2414->613|2443->614|2472->616|2528->644|2557->645|2587->648|2649->682|2678->683|2708->686|2767->717|2796->718|2828->723|2892->759|2921->760|2953->765|3016->800|3045->801|3079->808|3146->847|3175->848|3207->853|3268->886|3297->887|3331->894|3388->923|3417->924|3449->929|3521->973|3550->974|3584->981|3629->998|3658->999|3687->1001|3728->1014|3757->1015|3787->1018|3833->1036|3862->1037|3892->1040|3937->1057|3966->1058|3998->1063|4187->1224|4216->1225|4245->1227|4278->1233|4306->1234|4336->1237|4440->1313|4469->1314|4499->1317|4536->1326|4565->1327|4595->1330|4878->1585|4907->1586|4936->1588|4971->1596|5000->1597|5030->1600|5155->1697|5184->1698|5213->1700|5281->1740|5310->1741|5340->1744|5416->1792|5445->1793|5474->1795|5524->1817|5553->1818|5583->1821|5627->1837|5656->1838|5685->1840|5782->1909|5811->1910|5841->1913|5890->1934|5919->1935|5948->1937|5991->1952|6020->1953|6050->1956|6093->1971|6122->1972|6151->1974|6184->1980|6212->1981|6242->1984|6290->2004|6319->2005|6349->2008|6397->2028|6426->2029|6458->2034|6505->2053|6534->2054|6563->2056|6597->2063|6625->2064|6655->2067|6806->2189|6836->2190|6867->2193|6917->2214|6947->2215|6980->2220|7028->2239|7058->2240|7088->2242|7137->2262|7167->2263|7198->2266|7439->2478|7469->2479|7500->2482|7561->2514|7591->2515|7624->2520|7691->2558|7721->2559|7751->2561|7795->2576|7825->2577|7856->2580|7925->2620|7955->2621|7986->2624|8037->2646|8067->2647|8100->2652|8194->2717|8224->2718|8254->2720|8290->2728|8320->2729|8351->2732|8401->2753|8431->2754|8461->2756|8496->2763|8525->2764|8556->2767|8606->2788|8636->2789|8666->2791|8700->2797|8729->2798|8760->2801|8810->2822|8840->2823|8870->2825|8914->2840|8944->2841|8975->2844|9020->2860|9050->2861|9082->2865|9412->3168|9503->3249|9544->3251|9594->3272|9674->3324|9711->3339|9756->3365|9770->3370|9810->3371|9860->3392|9986->3486|10015->3487|10166->3610|10183->3617|10215->3627|10245->3628|10278->3633|10295->3640|10337->3660|10751->4046|10768->4053|10803->4066|10857->4092|10874->4099|10909->4112|10980->4155|10997->4162|11034->4177|11106->4221|11161->4254|11353->4418|11369->4424|11431->4464
                  LINES: 28->1|33->2|34->3|34->3|34->3|37->6|38->7|38->7|39->8|40->9|40->9|42->11|42->11|42->11|43->12|43->12|43->12|45->14|45->14|45->14|46->15|54->23|54->23|56->25|56->25|56->25|57->26|60->29|60->29|62->31|62->31|62->31|63->32|64->33|64->33|65->34|65->34|65->34|66->35|67->36|67->36|68->37|68->37|68->37|69->38|70->39|70->39|71->40|71->40|71->40|72->41|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|84->53|84->53|86->55|86->55|86->55|87->56|90->59|90->59|93->62|93->62|93->62|94->63|102->71|102->71|104->73|104->73|104->73|105->74|108->77|108->77|110->79|110->79|110->79|111->80|112->81|112->81|114->83|114->83|114->83|115->84|115->84|115->84|117->86|117->86|117->86|118->87|118->87|118->87|120->89|120->89|120->89|121->90|121->90|121->90|123->92|123->92|123->92|124->93|124->93|124->93|125->94|125->94|125->94|126->95|126->95|126->95|128->97|128->97|128->97|129->98|134->103|134->103|135->104|135->104|135->104|136->105|136->105|136->105|138->107|138->107|138->107|139->108|146->115|146->115|147->116|147->116|147->116|148->117|149->118|149->118|151->120|151->120|151->120|152->121|153->122|153->122|154->123|154->123|154->123|155->124|157->126|157->126|159->128|159->128|159->128|160->129|160->129|160->129|162->131|162->131|162->131|163->132|163->132|163->132|165->134|165->134|165->134|166->135|166->135|166->135|168->137|168->137|168->137|169->138|169->138|169->138|173->142|189->158|189->158|189->158|190->159|190->159|190->159|191->160|191->160|191->160|192->161|193->162|194->163|201->170|201->170|201->170|201->170|201->170|201->170|201->170|212->181|212->181|212->181|213->182|213->182|213->182|214->183|214->183|214->183|215->184|215->184|220->189|220->189|220->189
                  -- GENERATED --
              */
          