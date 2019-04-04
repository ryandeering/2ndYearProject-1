
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

    """),_display_(/*3.6*/main("Product", user)/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""


        """),format.raw/*6.9*/("""<style>
                body """),format.raw/*7.22*/("""{"""),format.raw/*7.23*/("""
                    """),format.raw/*8.21*/("""font-family: 'open sans';
                    overflow-x: hidden; """),format.raw/*9.41*/("""}"""),format.raw/*9.42*/("""

                """),format.raw/*11.17*/("""img """),format.raw/*11.21*/("""{"""),format.raw/*11.22*/("""
                    """),format.raw/*12.21*/("""max-width: 100%; """),format.raw/*12.38*/("""}"""),format.raw/*12.39*/("""

                """),format.raw/*14.17*/(""".preview """),format.raw/*14.26*/("""{"""),format.raw/*14.27*/("""
                    """),format.raw/*15.21*/("""display: -webkit-box;
                    display: -webkit-flex;
                    display: -ms-flexbox;
                    display: flex;
                    -webkit-box-orient: vertical;
                    -webkit-box-direction: normal;
                    -webkit-flex-direction: column;
                    -ms-flex-direction: column;
                    flex-direction: column; """),format.raw/*23.45*/("""}"""),format.raw/*23.46*/("""

                """),format.raw/*25.17*/(""".preview-pic """),format.raw/*25.30*/("""{"""),format.raw/*25.31*/("""
                    """),format.raw/*26.21*/("""-webkit-box-flex: 1;
                    -webkit-flex-grow: 1;
                    -ms-flex-positive: 1;
                    flex-grow: 1; """),format.raw/*29.35*/("""}"""),format.raw/*29.36*/("""

                """),format.raw/*31.17*/(""".preview-thumbnail.nav-tabs """),format.raw/*31.45*/("""{"""),format.raw/*31.46*/("""
                    """),format.raw/*32.21*/("""border: none;
                    margin-top: 15px; """),format.raw/*33.39*/("""}"""),format.raw/*33.40*/("""
                """),format.raw/*34.17*/(""".preview-thumbnail.nav-tabs li """),format.raw/*34.48*/("""{"""),format.raw/*34.49*/("""
                    """),format.raw/*35.21*/("""width: 18%;
                    margin-right: 2.5%; """),format.raw/*36.41*/("""}"""),format.raw/*36.42*/("""
                """),format.raw/*37.17*/(""".preview-thumbnail.nav-tabs li img """),format.raw/*37.52*/("""{"""),format.raw/*37.53*/("""
                    """),format.raw/*38.21*/("""max-width: 100%;
                    display: block; """),format.raw/*39.37*/("""}"""),format.raw/*39.38*/("""
                """),format.raw/*40.17*/(""".preview-thumbnail.nav-tabs li a """),format.raw/*40.50*/("""{"""),format.raw/*40.51*/("""
                    """),format.raw/*41.21*/("""padding: 0;
                    margin: 0; """),format.raw/*42.32*/("""}"""),format.raw/*42.33*/("""
                """),format.raw/*43.17*/(""".preview-thumbnail.nav-tabs li:last-of-type """),format.raw/*43.61*/("""{"""),format.raw/*43.62*/("""
                    """),format.raw/*44.21*/("""margin-right: 0; """),format.raw/*44.38*/("""}"""),format.raw/*44.39*/("""

                """),format.raw/*46.17*/(""".tab-content """),format.raw/*46.30*/("""{"""),format.raw/*46.31*/("""
                    """),format.raw/*47.21*/("""overflow: hidden; """),format.raw/*47.39*/("""}"""),format.raw/*47.40*/("""
                """),format.raw/*48.17*/(""".tab-content img """),format.raw/*48.34*/("""{"""),format.raw/*48.35*/("""
                    """),format.raw/*49.21*/("""width: 100%;
                    -webkit-animation-name: opacity;
                    animation-name: opacity;
                    -webkit-animation-duration: .3s;
                    animation-duration: .3s; """),format.raw/*53.46*/("""}"""),format.raw/*53.47*/("""

                """),format.raw/*55.17*/(""".card """),format.raw/*55.23*/("""{"""),format.raw/*55.24*/("""
                    """),format.raw/*56.21*/("""margin-top: 50px;
                    background: #eee;
                    padding: 3em;
                    line-height: 1.5em; """),format.raw/*59.41*/("""}"""),format.raw/*59.42*/("""


                """),format.raw/*62.17*/(""".details """),format.raw/*62.26*/("""{"""),format.raw/*62.27*/("""
                    """),format.raw/*63.21*/("""display: -webkit-box;
                    display: -webkit-flex;
                    display: -ms-flexbox;
                    display: flex;
                    -webkit-box-orient: vertical;
                    -webkit-box-direction: normal;
                    -webkit-flex-direction: column;
                    -ms-flex-direction: column;
                    flex-direction: column; """),format.raw/*71.45*/("""}"""),format.raw/*71.46*/("""

                """),format.raw/*73.17*/(""".colors """),format.raw/*73.25*/("""{"""),format.raw/*73.26*/("""
                    """),format.raw/*74.21*/("""-webkit-box-flex: 1;
                    -webkit-flex-grow: 1;
                    -ms-flex-positive: 1;
                    flex-grow: 1; """),format.raw/*77.35*/("""}"""),format.raw/*77.36*/("""

                """),format.raw/*79.17*/(""".product-title, .price, .sizes, .colors """),format.raw/*79.57*/("""{"""),format.raw/*79.58*/("""
                    """),format.raw/*80.21*/("""text-transform: UPPERCASE;
                    font-weight: bold; """),format.raw/*81.40*/("""}"""),format.raw/*81.41*/("""

                """),format.raw/*83.17*/(""".checked, .price span """),format.raw/*83.39*/("""{"""),format.raw/*83.40*/("""
                    """),format.raw/*84.21*/("""color: #ff9f1a; """),format.raw/*84.37*/("""}"""),format.raw/*84.38*/("""

                """),format.raw/*86.17*/(""".product-title, .rating, .product-description, .price, .vote, .sizes """),format.raw/*86.86*/("""{"""),format.raw/*86.87*/("""
                    """),format.raw/*87.21*/("""margin-bottom: 15px; """),format.raw/*87.42*/("""}"""),format.raw/*87.43*/("""

                """),format.raw/*89.17*/(""".product-title """),format.raw/*89.32*/("""{"""),format.raw/*89.33*/("""
                    """),format.raw/*90.21*/("""margin-top: 0; """),format.raw/*90.36*/("""}"""),format.raw/*90.37*/("""

                """),format.raw/*92.17*/(""".size """),format.raw/*92.23*/("""{"""),format.raw/*92.24*/("""
                    """),format.raw/*93.21*/("""margin-right: 10px; """),format.raw/*93.41*/("""}"""),format.raw/*93.42*/("""
                """),format.raw/*94.17*/(""".size:first-of-type """),format.raw/*94.37*/("""{"""),format.raw/*94.38*/("""
                    """),format.raw/*95.21*/("""margin-left: 40px; """),format.raw/*95.40*/("""}"""),format.raw/*95.41*/("""

                """),format.raw/*97.17*/(""".color """),format.raw/*97.24*/("""{"""),format.raw/*97.25*/("""
                    """),format.raw/*98.21*/("""display: inline-block;
                    vertical-align: middle;
                    margin-right: 10px;
                    height: 2em;
                    width: 2em;
                    border-radius: 2px; """),format.raw/*103.41*/("""}"""),format.raw/*103.42*/("""
                """),format.raw/*104.17*/(""".color:first-of-type """),format.raw/*104.38*/("""{"""),format.raw/*104.39*/("""
                    """),format.raw/*105.21*/("""margin-left: 20px; """),format.raw/*105.40*/("""}"""),format.raw/*105.41*/("""

                """),format.raw/*107.17*/(""".add-to-cart, .like """),format.raw/*107.37*/("""{"""),format.raw/*107.38*/("""
                    """),format.raw/*108.21*/("""background: #ff9f1a;
                    padding: 1.2em 1.5em;
                    border: none;
                    text-transform: UPPERCASE;
                    font-weight: bold;
                    color: #fff;
                    -webkit-transition: background .3s ease;
                    transition: background .3s ease; """),format.raw/*115.54*/("""}"""),format.raw/*115.55*/("""
                """),format.raw/*116.17*/(""".add-to-cart:hover, .like:hover """),format.raw/*116.49*/("""{"""),format.raw/*116.50*/("""
                    """),format.raw/*117.21*/("""background: #b36800;
                    color: #fff; """),format.raw/*118.34*/("""}"""),format.raw/*118.35*/("""

                """),format.raw/*120.17*/(""".not-available """),format.raw/*120.32*/("""{"""),format.raw/*120.33*/("""
                    """),format.raw/*121.21*/("""text-align: center;
                    line-height: 2em; """),format.raw/*122.39*/("""}"""),format.raw/*122.40*/("""
                """),format.raw/*123.17*/(""".not-available:before """),format.raw/*123.39*/("""{"""),format.raw/*123.40*/("""
                    """),format.raw/*124.21*/("""font-family: fontawesome;
                    content: "\f00d";
                    color: #fff; """),format.raw/*126.34*/("""}"""),format.raw/*126.35*/("""

                """),format.raw/*128.17*/(""".orange """),format.raw/*128.25*/("""{"""),format.raw/*128.26*/("""
                    """),format.raw/*129.21*/("""background: #ff9f1a; """),format.raw/*129.42*/("""}"""),format.raw/*129.43*/("""

                """),format.raw/*131.17*/(""".green """),format.raw/*131.24*/("""{"""),format.raw/*131.25*/("""
                    """),format.raw/*132.21*/("""background: #85ad00; """),format.raw/*132.42*/("""}"""),format.raw/*132.43*/("""

                """),format.raw/*134.17*/(""".blue """),format.raw/*134.23*/("""{"""),format.raw/*134.24*/("""
                    """),format.raw/*135.21*/("""background: #0076ad; """),format.raw/*135.42*/("""}"""),format.raw/*135.43*/("""

                """),format.raw/*137.17*/(""".tooltip-inner """),format.raw/*137.32*/("""{"""),format.raw/*137.33*/("""
                    """),format.raw/*138.21*/("""padding: 1.3em; """),format.raw/*138.37*/("""}"""),format.raw/*138.38*/("""



                """),format.raw/*142.17*/("""/*# sourceMappingURL=style.css.map */
        </style>

        """),_display_(/*145.10*/if(flash.containsKey("error"))/*145.40*/ {_display_(Seq[Any](format.raw/*145.42*/("""
            """),format.raw/*146.13*/("""<div class="alert alert-danger">
            """),_display_(/*147.14*/flash/*147.19*/.get("error")),format.raw/*147.32*/("""
            """),format.raw/*148.13*/("""</div>
        """)))}),format.raw/*149.10*/("""


        """),format.raw/*152.9*/("""<div class="container">
            <div class="card">
                <div class="container-fliud">
                    <div class="wrapper row">
                        <div class="preview col-md-6">



                            <div class="preview-pic tab-content">
                                <div class="tab-pane active" id="pic-1">
                                """),_display_(/*162.34*/if(e.resource("public/images/productImages/" + product.getId + ".jpg").isDefined)/*162.115*/ {_display_(Seq[Any](format.raw/*162.117*/("""
                                    """),format.raw/*163.37*/("""<img class="pic" src="/assets/images/productImages/"""),_display_(/*163.89*/(product.getId)),format.raw/*163.104*/(""".jpg"/>
                                """)))}/*164.35*/else/*164.40*/{_display_(Seq[Any](format.raw/*164.41*/("""
                                    """),format.raw/*165.37*/("""<img class="pic" src="/assets/images/productImages/thumbnails/noImage.png"/>
                                """)))}),format.raw/*166.34*/("""
                                """),format.raw/*167.33*/("""</div>


                            </div>


                        </div>
                        <div class="details col-md-6">
                            <h3 class="product-title">"""),_display_(/*175.56*/product/*175.63*/.getName()),format.raw/*175.73*/(""" """),format.raw/*175.74*/("""for """),_display_(/*175.79*/product/*175.86*/.getPlatform.getName),format.raw/*175.106*/("""</h3>
                            """),_display_(/*176.30*/if((product.getStock > 0))/*176.56*/{_display_(Seq[Any](format.raw/*176.57*/("""
                                """),format.raw/*177.33*/("""<div class="action">

                                    <a href=""""),_display_(/*179.47*/routes/*179.53*/.ShoppingCtrl.addToBasket(product.getId)),format.raw/*179.93*/("""">
                                        <button type="button">add to cart</button>
                                    </a>
                                </div>
                            """)))}),format.raw/*183.30*/("""

                            """),format.raw/*185.29*/("""<div class="rating">
                                <div class="stars">
                                    """),_display_(/*187.38*/product/*187.45*/.averageRating(product.getId)),format.raw/*187.74*/("""
                                """),format.raw/*188.33*/("""</div>
                                <span class="review-no">"""),_display_(/*189.58*/product/*189.65*/.reviewCount()),format.raw/*189.79*/(""" """),format.raw/*189.80*/("""</span>

                            </div>
                            <p>Developer: """),_display_(/*192.44*/product/*192.51*/.getDeveloper),format.raw/*192.64*/("""</p>
                            <p>Publisher: """),_display_(/*193.44*/product/*193.51*/.getPublisher),format.raw/*193.64*/("""</p>
                            <p class="product-description">"""),_display_(/*194.61*/product/*194.68*/.getDescription),format.raw/*194.83*/("""</p>
                            <h4 class="price">Price: &euro; """),_display_(/*195.62*/("%.2f".format(product.getPrice))),format.raw/*195.95*/("""</h4>
                            <p class="vote"><strong>91%</strong> of buyers enjoyed this product! <strong>(87 votes)</strong></p>

                            <label>Reviews:</label><br>
                            <div class="list-group" id="replies">
                            """),_display_(/*200.30*/for(r <- product.getReviews) yield /*200.58*/{_display_(Seq[Any](format.raw/*200.59*/("""

                                """),format.raw/*202.33*/("""<div class="list-group-item" id="replies">
                                    """),_display_(/*203.38*/if(r.getCustomer != null)/*203.63*/{_display_(Seq[Any](format.raw/*203.64*/("""
                                        """),format.raw/*204.41*/("""<label>"""),_display_(/*204.49*/r/*204.50*/.getCustomer.getfName),format.raw/*204.71*/(""" """),format.raw/*204.72*/("""| """),_display_(/*204.75*/r/*204.76*/.getDate),format.raw/*204.84*/(""" """),format.raw/*204.85*/("""| """),_display_(/*204.88*/r/*204.89*/.reviewStars()),format.raw/*204.103*/("""
                                        """)))}/*205.42*/else/*205.46*/{_display_(Seq[Any](format.raw/*205.47*/("""
                                        """),format.raw/*206.41*/("""<label>N/A</label><br>
                                    """)))}),format.raw/*207.38*/("""

                                """),format.raw/*209.33*/("""<p>"""),_display_(/*209.37*/r/*209.38*/.getContent),format.raw/*209.49*/("""</p>

                                    """),_display_(/*211.38*/if(user != null)/*211.54*/{_display_(Seq[Any](format.raw/*211.55*/("""
                                        """),_display_(/*212.42*/if(user.isInstanceOf[models.users.Admin])/*212.83*/{_display_(Seq[Any](format.raw/*212.84*/("""
                                            """),format.raw/*213.45*/("""<a href=""""),_display_(/*213.55*/routes/*213.61*/.HomeController.deleteReview(r.getId)),format.raw/*213.98*/(""""  class="btn btn-default btn-xs">Delete <span class="glyphicon glyphicon-trash"></span></a>
                                        """)))}),format.raw/*214.42*/("""
                                    """)))}),format.raw/*215.38*/("""

                                """),format.raw/*217.33*/("""</div>

                            """)))}),format.raw/*219.30*/("""
                            """),format.raw/*220.29*/("""</div>

                        </div>
                        <p>
                            <a href=""""),_display_(/*224.39*/routes/*224.45*/.HomeController.addReview(product.getId())),format.raw/*224.87*/("""">
                                <button class="btn btn-primary">Add a Review</button>
                            </a>
                        </p>

                    </div>
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
                  DATE: Thu Apr 04 11:33:08 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/app/views/product.scala.html
                  HASH: 19da12e83f38ec16ebbc99ad14a7bbf167dbfe5e
                  MATRIX: 1013->1|1209->101|1243->110|1272->131|1311->133|1351->147|1408->177|1436->178|1485->200|1579->267|1607->268|1655->288|1687->292|1716->293|1766->315|1811->332|1840->333|1888->353|1925->362|1954->363|2004->385|2427->780|2456->781|2504->801|2545->814|2574->815|2624->837|2794->979|2823->980|2871->1000|2927->1028|2956->1029|3006->1051|3087->1104|3116->1105|3162->1123|3221->1154|3250->1155|3300->1177|3381->1230|3410->1231|3456->1249|3519->1284|3548->1285|3598->1307|3680->1361|3709->1362|3755->1380|3816->1413|3845->1414|3895->1436|3967->1480|3996->1481|4042->1499|4114->1543|4143->1544|4193->1566|4238->1583|4267->1584|4315->1604|4356->1617|4385->1618|4435->1640|4481->1658|4510->1659|4556->1677|4601->1694|4630->1695|4680->1717|4921->1930|4950->1931|4998->1951|5032->1957|5061->1958|5111->1980|5272->2113|5301->2114|5351->2136|5388->2145|5417->2146|5467->2168|5890->2563|5919->2564|5967->2584|6003->2592|6032->2593|6082->2615|6252->2757|6281->2758|6329->2778|6397->2818|6426->2819|6476->2841|6571->2908|6600->2909|6648->2929|6698->2951|6727->2952|6777->2974|6821->2990|6850->2991|6898->3011|6995->3080|7024->3081|7074->3103|7123->3124|7152->3125|7200->3145|7243->3160|7272->3161|7322->3183|7365->3198|7394->3199|7442->3219|7476->3225|7505->3226|7555->3248|7603->3268|7632->3269|7678->3287|7726->3307|7755->3308|7805->3330|7852->3349|7881->3350|7929->3370|7964->3377|7993->3378|8043->3400|8289->3617|8319->3618|8366->3636|8416->3657|8446->3658|8497->3680|8545->3699|8575->3700|8624->3720|8673->3740|8703->3741|8754->3763|9120->4100|9150->4101|9197->4119|9258->4151|9288->4152|9339->4174|9423->4229|9453->4230|9502->4250|9546->4265|9576->4266|9627->4288|9715->4347|9745->4348|9792->4366|9843->4388|9873->4389|9924->4411|10052->4510|10082->4511|10131->4531|10168->4539|10198->4540|10249->4562|10299->4583|10329->4584|10378->4604|10414->4611|10444->4612|10495->4634|10545->4655|10575->4656|10624->4676|10659->4682|10689->4683|10740->4705|10790->4726|10820->4727|10869->4747|10913->4762|10943->4763|10994->4785|11039->4801|11069->4802|11122->4826|11218->4894|11258->4924|11299->4926|11342->4940|11417->4987|11432->4992|11467->5005|11510->5019|11559->5036|11601->5050|12016->5437|12108->5518|12150->5520|12217->5558|12297->5610|12335->5625|12397->5668|12411->5673|12451->5674|12518->5712|12661->5823|12724->5857|12947->6052|12964->6059|12996->6069|13026->6070|13059->6075|13076->6082|13119->6102|13183->6138|13219->6164|13259->6165|13322->6199|13420->6269|13436->6275|13498->6315|13729->6514|13790->6546|13930->6658|13947->6665|13998->6694|14061->6728|14154->6793|14171->6800|14207->6814|14237->6815|14355->6905|14372->6912|14407->6925|14484->6974|14501->6981|14536->6994|14630->7060|14647->7067|14684->7082|14779->7149|14834->7182|15154->7474|15199->7502|15239->7503|15304->7539|15413->7620|15448->7645|15488->7646|15559->7688|15595->7696|15606->7697|15649->7718|15679->7719|15710->7722|15721->7723|15751->7731|15781->7732|15812->7735|15823->7736|15860->7750|15923->7793|15937->7797|15977->7798|16048->7840|16141->7901|16206->7937|16238->7941|16249->7942|16282->7953|16355->7998|16381->8014|16421->8015|16492->8058|16543->8099|16583->8100|16658->8146|16696->8156|16712->8162|16771->8199|16938->8334|17009->8373|17074->8409|17145->8448|17204->8478|17341->8587|17357->8593|17421->8635
                  LINES: 28->1|33->1|35->3|35->3|35->3|38->6|39->7|39->7|40->8|41->9|41->9|43->11|43->11|43->11|44->12|44->12|44->12|46->14|46->14|46->14|47->15|55->23|55->23|57->25|57->25|57->25|58->26|61->29|61->29|63->31|63->31|63->31|64->32|65->33|65->33|66->34|66->34|66->34|67->35|68->36|68->36|69->37|69->37|69->37|70->38|71->39|71->39|72->40|72->40|72->40|73->41|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|78->46|78->46|78->46|79->47|79->47|79->47|80->48|80->48|80->48|81->49|85->53|85->53|87->55|87->55|87->55|88->56|91->59|91->59|94->62|94->62|94->62|95->63|103->71|103->71|105->73|105->73|105->73|106->74|109->77|109->77|111->79|111->79|111->79|112->80|113->81|113->81|115->83|115->83|115->83|116->84|116->84|116->84|118->86|118->86|118->86|119->87|119->87|119->87|121->89|121->89|121->89|122->90|122->90|122->90|124->92|124->92|124->92|125->93|125->93|125->93|126->94|126->94|126->94|127->95|127->95|127->95|129->97|129->97|129->97|130->98|135->103|135->103|136->104|136->104|136->104|137->105|137->105|137->105|139->107|139->107|139->107|140->108|147->115|147->115|148->116|148->116|148->116|149->117|150->118|150->118|152->120|152->120|152->120|153->121|154->122|154->122|155->123|155->123|155->123|156->124|158->126|158->126|160->128|160->128|160->128|161->129|161->129|161->129|163->131|163->131|163->131|164->132|164->132|164->132|166->134|166->134|166->134|167->135|167->135|167->135|169->137|169->137|169->137|170->138|170->138|170->138|174->142|177->145|177->145|177->145|178->146|179->147|179->147|179->147|180->148|181->149|184->152|194->162|194->162|194->162|195->163|195->163|195->163|196->164|196->164|196->164|197->165|198->166|199->167|207->175|207->175|207->175|207->175|207->175|207->175|207->175|208->176|208->176|208->176|209->177|211->179|211->179|211->179|215->183|217->185|219->187|219->187|219->187|220->188|221->189|221->189|221->189|221->189|224->192|224->192|224->192|225->193|225->193|225->193|226->194|226->194|226->194|227->195|227->195|232->200|232->200|232->200|234->202|235->203|235->203|235->203|236->204|236->204|236->204|236->204|236->204|236->204|236->204|236->204|236->204|236->204|236->204|236->204|237->205|237->205|237->205|238->206|239->207|241->209|241->209|241->209|241->209|243->211|243->211|243->211|244->212|244->212|244->212|245->213|245->213|245->213|245->213|246->214|247->215|249->217|251->219|252->220|256->224|256->224|256->224
                  -- GENERATED --
              */
          