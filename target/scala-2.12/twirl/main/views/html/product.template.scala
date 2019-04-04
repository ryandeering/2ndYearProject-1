
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
                  DATE: Thu Apr 04 21:01:49 IST 2019
                  SOURCE: /home/ryan/Downloads/aa/2ndYearProject/app/views/product.scala.html
                  HASH: 1e42d4cd49ef8844cfddfec36af61e49553e248a
                  MATRIX: 1013->1|1207->102|1238->108|1267->129|1306->131|1343->142|1399->171|1427->172|1475->193|1568->259|1596->260|1642->278|1674->282|1703->283|1752->304|1797->321|1826->322|1872->340|1909->349|1938->350|1987->371|2402->758|2431->759|2477->777|2518->790|2547->791|2596->812|2763->951|2792->952|2838->970|2894->998|2923->999|2972->1020|3052->1072|3081->1073|3126->1090|3185->1121|3214->1122|3263->1143|3343->1195|3372->1196|3417->1213|3480->1248|3509->1249|3558->1270|3639->1323|3668->1324|3713->1341|3774->1374|3803->1375|3852->1396|3923->1439|3952->1440|3997->1457|4069->1501|4098->1502|4147->1523|4192->1540|4221->1541|4267->1559|4308->1572|4337->1573|4386->1594|4432->1612|4461->1613|4506->1630|4551->1647|4580->1648|4629->1669|4866->1878|4895->1879|4941->1897|4975->1903|5004->1904|5053->1925|5211->2055|5240->2056|5287->2075|5324->2084|5353->2085|5402->2106|5817->2493|5846->2494|5892->2512|5928->2520|5957->2521|6006->2542|6173->2681|6202->2682|6248->2700|6316->2740|6345->2741|6394->2762|6488->2828|6517->2829|6563->2847|6613->2869|6642->2870|6691->2891|6735->2907|6764->2908|6810->2926|6907->2995|6936->2996|6985->3017|7034->3038|7063->3039|7109->3057|7152->3072|7181->3073|7230->3094|7273->3109|7302->3110|7348->3128|7382->3134|7411->3135|7460->3156|7508->3176|7537->3177|7582->3194|7630->3214|7659->3215|7708->3236|7755->3255|7784->3256|7830->3274|7865->3281|7894->3282|7943->3303|8184->3515|8214->3516|8260->3533|8310->3554|8340->3555|8390->3576|8438->3595|8468->3596|8515->3614|8564->3634|8594->3635|8644->3656|9003->3986|9033->3987|9079->4004|9140->4036|9170->4037|9220->4058|9303->4112|9333->4113|9380->4131|9424->4146|9454->4147|9504->4168|9591->4226|9621->4227|9667->4244|9718->4266|9748->4267|9798->4288|9924->4385|9954->4386|10001->4404|10038->4412|10068->4413|10118->4434|10168->4455|10198->4456|10245->4474|10281->4481|10311->4482|10361->4503|10411->4524|10441->4525|10488->4543|10523->4549|10553->4550|10603->4571|10653->4592|10683->4593|10730->4611|10774->4626|10804->4627|10854->4648|10899->4664|10929->4665|10978->4685|11071->4750|11111->4780|11152->4782|11194->4795|11268->4841|11283->4846|11318->4859|11360->4872|11408->4888|11447->4899|11852->5276|11944->5357|11986->5359|12052->5396|12132->5448|12170->5463|12231->5505|12245->5510|12285->5511|12351->5548|12493->5658|12555->5691|12770->5878|12787->5885|12819->5895|12849->5896|12882->5901|12899->5908|12942->5928|13005->5963|13041->5989|13081->5990|13143->6023|13239->6091|13255->6097|13317->6137|13544->6332|13603->6362|13741->6472|13758->6479|13809->6508|13871->6541|13963->6605|13980->6612|14016->6626|14046->6627|14161->6714|14178->6721|14213->6734|14289->6782|14306->6789|14341->6802|14434->6867|14451->6874|14488->6889|14582->6955|14637->6988|14952->7275|14997->7303|15037->7304|15100->7338|15208->7418|15243->7443|15283->7444|15353->7485|15389->7493|15400->7494|15443->7515|15473->7516|15504->7519|15515->7520|15545->7528|15575->7529|15606->7532|15617->7533|15654->7547|15716->7589|15730->7593|15770->7594|15840->7635|15932->7695|15995->7729|16027->7733|16038->7734|16071->7745|16142->7788|16168->7804|16208->7805|16278->7847|16329->7888|16369->7889|16443->7934|16481->7944|16497->7950|16556->7987|16722->8121|16792->8159|16855->8193|16924->8230|16982->8259|17115->8364|17131->8370|17195->8412
                  LINES: 28->1|33->2|34->3|34->3|34->3|37->6|38->7|38->7|39->8|40->9|40->9|42->11|42->11|42->11|43->12|43->12|43->12|45->14|45->14|45->14|46->15|54->23|54->23|56->25|56->25|56->25|57->26|60->29|60->29|62->31|62->31|62->31|63->32|64->33|64->33|65->34|65->34|65->34|66->35|67->36|67->36|68->37|68->37|68->37|69->38|70->39|70->39|71->40|71->40|71->40|72->41|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|84->53|84->53|86->55|86->55|86->55|87->56|90->59|90->59|93->62|93->62|93->62|94->63|102->71|102->71|104->73|104->73|104->73|105->74|108->77|108->77|110->79|110->79|110->79|111->80|112->81|112->81|114->83|114->83|114->83|115->84|115->84|115->84|117->86|117->86|117->86|118->87|118->87|118->87|120->89|120->89|120->89|121->90|121->90|121->90|123->92|123->92|123->92|124->93|124->93|124->93|125->94|125->94|125->94|126->95|126->95|126->95|128->97|128->97|128->97|129->98|134->103|134->103|135->104|135->104|135->104|136->105|136->105|136->105|138->107|138->107|138->107|139->108|146->115|146->115|147->116|147->116|147->116|148->117|149->118|149->118|151->120|151->120|151->120|152->121|153->122|153->122|154->123|154->123|154->123|155->124|157->126|157->126|159->128|159->128|159->128|160->129|160->129|160->129|162->131|162->131|162->131|163->132|163->132|163->132|165->134|165->134|165->134|166->135|166->135|166->135|168->137|168->137|168->137|169->138|169->138|169->138|173->142|176->145|176->145|176->145|177->146|178->147|178->147|178->147|179->148|180->149|183->152|193->162|193->162|193->162|194->163|194->163|194->163|195->164|195->164|195->164|196->165|197->166|198->167|206->175|206->175|206->175|206->175|206->175|206->175|206->175|207->176|207->176|207->176|208->177|210->179|210->179|210->179|214->183|216->185|218->187|218->187|218->187|219->188|220->189|220->189|220->189|220->189|223->192|223->192|223->192|224->193|224->193|224->193|225->194|225->194|225->194|226->195|226->195|231->200|231->200|231->200|233->202|234->203|234->203|234->203|235->204|235->204|235->204|235->204|235->204|235->204|235->204|235->204|235->204|235->204|235->204|235->204|236->205|236->205|236->205|237->206|238->207|240->209|240->209|240->209|240->209|242->211|242->211|242->211|243->212|243->212|243->212|244->213|244->213|244->213|244->213|245->214|246->215|248->217|250->219|251->220|255->224|255->224|255->224
                  -- GENERATED --
              */
          