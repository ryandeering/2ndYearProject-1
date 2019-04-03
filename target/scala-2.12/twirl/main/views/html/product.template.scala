
package views.html

import controllers._
import play.core.j.PlayMagicForJava._
import play.mvc.Http.Context.Implicit._

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

    """),_display_(/*145.6*/if(flash.containsKey("error"))/*145.36*/ {_display_(Seq[Any](format.raw/*145.38*/("""
        """),format.raw/*146.9*/("""<div class="alert alert-danger">
        """),_display_(/*147.10*/flash/*147.15*/.get("error")),format.raw/*147.28*/("""
        """),format.raw/*148.9*/("""</div>
    """)))}),format.raw/*149.6*/("""


    """),format.raw/*152.5*/("""<div class="container">
		<div class="card">
			<div class="container-fliud">
				<div class="wrapper row">
					<div class="preview col-md-6">


						
						<div class="preview-pic tab-content">
						  <div class="tab-pane active" id="pic-1">
"""),_display_(/*162.2*/if(e.resource("public/images/productImages/" + product.getId + ".jpg").isDefined)/*162.83*/ {_display_(Seq[Any](format.raw/*162.85*/("""
                    """),format.raw/*163.21*/("""<img class="pic" src="/assets/images/productImages/"""),_display_(/*163.73*/(product.getId)),format.raw/*163.88*/(""".jpg"/>
                """)))}/*164.19*/else/*164.24*/{_display_(Seq[Any](format.raw/*164.25*/("""
                    """),format.raw/*165.21*/("""<img class="pic" src="/assets/images/productImages/thumbnails/noImage.png"/>
                """)))}),format.raw/*166.18*/("""
"""),format.raw/*167.1*/("""</div>

						 
						</div>
						
						
					</div>
					<div class="details col-md-6">
						<h3 class="product-title">"""),_display_(/*175.34*/product/*175.41*/.getName()),format.raw/*175.51*/(""" """),format.raw/*175.52*/("""for """),_display_(/*175.57*/product/*175.64*/.getPlatform.getName),format.raw/*175.84*/("""</h3>
                            """),_display_(/*176.30*/if((product.getStock > 0))/*176.56*/{_display_(Seq[Any](format.raw/*176.57*/("""
			"""),format.raw/*177.4*/("""<div class="action">

                   	 <a href=""""),_display_(/*179.32*/routes/*179.38*/.ShoppingCtrl.addToBasket(product.getId)),format.raw/*179.78*/("""">
							<button type="button">add to cart</button>
                                </a>
			</div>
   					 """)))}),format.raw/*183.11*/("""

						"""),format.raw/*185.7*/("""<div class="rating">
							<div class="stars">
								<span class="fa fa-star checked"></span>
								<span class="fa fa-star checked"></span>
								<span class="fa fa-star checked"></span>
								<span class="fa fa-star"></span>
								<span class="fa fa-star"></span>
							</div>
							<span class="review-no">"""),_display_(/*193.33*/product/*193.40*/.reviewCount()),format.raw/*193.54*/(""" """),format.raw/*193.55*/("""</span>

						</div>
						<p>Developer: """),_display_(/*196.22*/product/*196.29*/.getDeveloper),format.raw/*196.42*/("""</p>
						<p>Publisher: """),_display_(/*197.22*/product/*197.29*/.getPublisher),format.raw/*197.42*/("""</p>
						<p class="product-description">"""),_display_(/*198.39*/product/*198.46*/.getDescription),format.raw/*198.61*/("""</p>
						<h4 class="price">Price: &euro; """),_display_(/*199.40*/("%.2f".format(product.getPrice))),format.raw/*199.73*/("""</h4>
						<p class="vote"><strong>91%</strong> of buyers enjoyed this product! <strong>(87 votes)</strong></p>
						
						
						
					</div>
				</div>
			</div>
            <label>Reviews:</label><br>
            <div class="list-group" id="replies">
            """),_display_(/*209.14*/for(r <- product.getReviews) yield /*209.42*/{_display_(Seq[Any](format.raw/*209.43*/("""

                """),format.raw/*211.17*/("""<div class="list-group-item" id="replies">
                    """),_display_(/*212.22*/if(r.getCustomer != null)/*212.47*/{_display_(Seq[Any](format.raw/*212.48*/("""
                        """),format.raw/*213.25*/("""<label>"""),_display_(/*213.33*/r/*213.34*/.getCustomer.getfName),format.raw/*213.55*/(""" """),format.raw/*213.56*/("""| """),_display_(/*213.59*/r/*213.60*/.getDate),format.raw/*213.68*/(""" """),format.raw/*213.69*/("""| """),_display_(/*213.72*/r/*213.73*/.reviewStars),format.raw/*213.85*/("""
                    """)))}/*214.22*/else/*214.26*/{_display_(Seq[Any](format.raw/*214.27*/("""
                        """),format.raw/*215.25*/("""<label>N/A</label><br>
                    """)))}),format.raw/*216.22*/("""

                """),format.raw/*218.17*/("""<p>"""),_display_(/*218.21*/r/*218.22*/.getContent),format.raw/*218.33*/("""</p>

                    """),_display_(/*220.22*/if(user != null)/*220.38*/{_display_(Seq[Any](format.raw/*220.39*/("""
                        """),_display_(/*221.26*/if(user.isInstanceOf[models.users.Admin])/*221.67*/{_display_(Seq[Any](format.raw/*221.68*/("""
                            """),format.raw/*222.29*/("""<a href=""""),_display_(/*222.39*/routes/*222.45*/.HomeController.deleteReview(r.getId)),format.raw/*222.82*/(""""  class="btn btn-default btn-xs">Delete <span class="glyphicon glyphicon-trash"></span></a>
                        """)))}),format.raw/*223.26*/("""
                    """)))}),format.raw/*224.22*/("""

                """),format.raw/*226.17*/("""</div>

            """)))}),format.raw/*228.14*/("""
            """),format.raw/*229.13*/("""</div>

        </div>
        <p>
            <a href=""""),_display_(/*233.23*/routes/*233.29*/.HomeController.addReview(product.getId())),format.raw/*233.71*/("""">
                <button class="btn btn-primary">Add a Review</button>
            </a>
        </p>

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
                  DATE: Wed Apr 03 23:20:42 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/a/2ndYearProject/app/views/product.scala.html
                  HASH: c2535933968eccfce5699137c912cb0bab333cc4
                  MATRIX: 1013->1|1209->101|1239->106|1268->127|1307->129|1339->135|1379->149|1406->150|1436->154|1512->203|1540->204|1571->208|1602->212|1630->213|1661->217|1706->234|1735->235|1766->239|1803->248|1832->249|1863->253|2154->516|2183->517|2216->523|2257->536|2286->537|2317->541|2445->641|2474->642|2505->646|2561->674|2590->675|2621->679|2684->714|2713->715|2744->719|2803->750|2832->751|2865->757|2930->794|2959->795|2992->801|3055->836|3084->837|3119->845|3187->885|3216->886|3249->892|3310->925|3339->926|3374->934|3432->964|3461->965|3494->971|3566->1015|3595->1016|3630->1024|3675->1041|3704->1042|3735->1046|3776->1059|3805->1060|3836->1064|3882->1082|3911->1083|3942->1087|3987->1104|4016->1105|4049->1111|4242->1276|4271->1277|4302->1281|4335->1287|4363->1288|4394->1292|4501->1371|4530->1372|4563->1378|4600->1387|4629->1388|4660->1392|4951->1655|4980->1656|5011->1660|5046->1668|5075->1669|5106->1673|5234->1773|5263->1774|5294->1778|5362->1818|5391->1819|5422->1823|5499->1872|5528->1873|5559->1877|5609->1899|5638->1900|5669->1904|5713->1920|5742->1921|5773->1925|5870->1994|5899->1995|5930->1999|5979->2020|6008->2021|6039->2025|6082->2040|6111->2041|6142->2045|6185->2060|6214->2061|6245->2065|6278->2071|6306->2072|6337->2076|6385->2096|6414->2097|6445->2101|6493->2121|6522->2122|6555->2128|6602->2147|6631->2148|6662->2152|6696->2159|6724->2160|6755->2164|6911->2291|6941->2292|6973->2296|7023->2317|7053->2318|7087->2324|7135->2343|7165->2344|7197->2348|7246->2368|7276->2369|7308->2373|7556->2592|7586->2593|7618->2597|7679->2629|7709->2630|7743->2636|7811->2675|7841->2676|7873->2680|7917->2695|7947->2696|7979->2700|8049->2741|8079->2742|8111->2746|8162->2768|8192->2769|8226->2775|8322->2842|8352->2843|8384->2847|8420->2855|8450->2856|8482->2860|8532->2881|8562->2882|8594->2886|8629->2893|8658->2894|8690->2898|8740->2919|8770->2920|8802->2924|8836->2930|8865->2931|8897->2935|8947->2956|8977->2957|9009->2961|9053->2976|9083->2977|9115->2981|9160->2997|9190->2998|9226->3006|9309->3062|9349->3092|9390->3094|9428->3104|9499->3147|9514->3152|9549->3165|9587->3175|9631->3188|9669->3198|9953->3455|10044->3536|10085->3538|10136->3560|10216->3612|10253->3627|10299->3654|10313->3659|10353->3660|10404->3682|10531->3777|10561->3779|10721->3911|10738->3918|10770->3928|10800->3929|10833->3934|10850->3941|10892->3961|10956->3997|10992->4023|11032->4024|11065->4029|11148->4084|11164->4090|11226->4130|11372->4244|11410->4254|11769->4585|11786->4592|11822->4606|11852->4607|11926->4653|11943->4660|11978->4673|12033->4700|12050->4707|12085->4720|12157->4764|12174->4771|12211->4786|12284->4831|12339->4864|12647->5144|12692->5172|12732->5173|12781->5193|12874->5258|12909->5283|12949->5284|13004->5310|13040->5318|13051->5319|13094->5340|13124->5341|13155->5344|13166->5345|13196->5353|13226->5354|13257->5357|13268->5358|13302->5370|13345->5393|13359->5397|13399->5398|13454->5424|13531->5469|13580->5489|13612->5493|13623->5494|13656->5505|13713->5534|13739->5550|13779->5551|13834->5578|13885->5619|13925->5620|13984->5650|14022->5660|14038->5666|14097->5703|14248->5822|14303->5845|14352->5865|14407->5888|14450->5902|14539->5963|14555->5969|14619->6011
                  LINES: 28->1|33->1|35->3|35->3|35->3|38->6|39->7|39->7|40->8|41->9|41->9|43->11|43->11|43->11|44->12|44->12|44->12|46->14|46->14|46->14|47->15|55->23|55->23|57->25|57->25|57->25|58->26|61->29|61->29|63->31|63->31|63->31|64->32|65->33|65->33|66->34|66->34|66->34|67->35|68->36|68->36|69->37|69->37|69->37|70->38|71->39|71->39|72->40|72->40|72->40|73->41|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|78->46|78->46|78->46|79->47|79->47|79->47|80->48|80->48|80->48|81->49|85->53|85->53|87->55|87->55|87->55|88->56|91->59|91->59|94->62|94->62|94->62|95->63|103->71|103->71|105->73|105->73|105->73|106->74|109->77|109->77|111->79|111->79|111->79|112->80|113->81|113->81|115->83|115->83|115->83|116->84|116->84|116->84|118->86|118->86|118->86|119->87|119->87|119->87|121->89|121->89|121->89|122->90|122->90|122->90|124->92|124->92|124->92|125->93|125->93|125->93|126->94|126->94|126->94|127->95|127->95|127->95|129->97|129->97|129->97|130->98|135->103|135->103|136->104|136->104|136->104|137->105|137->105|137->105|139->107|139->107|139->107|140->108|147->115|147->115|148->116|148->116|148->116|149->117|150->118|150->118|152->120|152->120|152->120|153->121|154->122|154->122|155->123|155->123|155->123|156->124|158->126|158->126|160->128|160->128|160->128|161->129|161->129|161->129|163->131|163->131|163->131|164->132|164->132|164->132|166->134|166->134|166->134|167->135|167->135|167->135|169->137|169->137|169->137|170->138|170->138|170->138|174->142|177->145|177->145|177->145|178->146|179->147|179->147|179->147|180->148|181->149|184->152|194->162|194->162|194->162|195->163|195->163|195->163|196->164|196->164|196->164|197->165|198->166|199->167|207->175|207->175|207->175|207->175|207->175|207->175|207->175|208->176|208->176|208->176|209->177|211->179|211->179|211->179|215->183|217->185|225->193|225->193|225->193|225->193|228->196|228->196|228->196|229->197|229->197|229->197|230->198|230->198|230->198|231->199|231->199|241->209|241->209|241->209|243->211|244->212|244->212|244->212|245->213|245->213|245->213|245->213|245->213|245->213|245->213|245->213|245->213|245->213|245->213|245->213|246->214|246->214|246->214|247->215|248->216|250->218|250->218|250->218|250->218|252->220|252->220|252->220|253->221|253->221|253->221|254->222|254->222|254->222|254->222|255->223|256->224|258->226|260->228|261->229|265->233|265->233|265->233
                  -- GENERATED --
              */
          