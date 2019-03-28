
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
    """),format.raw/*4.5*/("""<p class="producthead">"""),_display_(/*4.29*/product/*4.36*/.getName()),format.raw/*4.46*/(""" """),format.raw/*4.47*/("""for """),_display_(/*4.52*/product/*4.59*/.getPlatform.getName),format.raw/*4.79*/("""</p>

    <div class="col-sm-3">
        <table class="table table-bordered table-hover table-condensed">
            <thead>
                <link href="https://fonts.googleapis.com/css?family=Glegoo|Open+Sans" rel="stylesheet">
                <style>

                        .pic """),format.raw/*12.30*/("""{"""),format.raw/*12.31*/("""
                            """),format.raw/*13.29*/("""padding:0.2em;
                            border:0.2px solid #021a40;
                        """),format.raw/*15.25*/("""}"""),format.raw/*15.26*/("""

                        """),format.raw/*17.25*/(""".lead"""),format.raw/*17.30*/("""{"""),format.raw/*17.31*/("""
                            """),format.raw/*18.29*/("""font-family: 'Open Sans', sans-serif;
                            font-size: 1em;
                        """),format.raw/*20.25*/("""}"""),format.raw/*20.26*/("""

                        """),format.raw/*22.25*/(""".producthead"""),format.raw/*22.37*/("""{"""),format.raw/*22.38*/("""
                            """),format.raw/*23.29*/("""font-family: 'Glegoo', serif;
                            font-weight: bold;
                            font-size: 2em;
                        """),format.raw/*26.25*/("""}"""),format.raw/*26.26*/("""

                        """),format.raw/*28.25*/(""".text-right"""),format.raw/*28.36*/("""{"""),format.raw/*28.37*/("""
                            """),format.raw/*29.29*/("""padding-left:26em;
                            float: inside;
                            font-weight: bold;
                            position: relative;
                        """),format.raw/*33.25*/("""}"""),format.raw/*33.26*/("""
                """),format.raw/*34.17*/("""</style>
            </thead>
            <tbody>

                """),_display_(/*38.18*/if(e.resource("public/images/productImages/" + product.getId + ".jpg").isDefined)/*38.99*/ {_display_(Seq[Any](format.raw/*38.101*/("""
                    """),format.raw/*39.21*/("""<img class="pic" src="/assets/images/productImages/"""),_display_(/*39.73*/(product.getId)),format.raw/*39.88*/(""".jpg"/>
                """)))}/*40.19*/else/*40.24*/{_display_(Seq[Any](format.raw/*40.25*/("""
                    """),format.raw/*41.21*/("""<img class="pic" src="/assets/images/productImages/thumbnails/noImage.png"/>
                """)))}),format.raw/*42.18*/("""

                """),format.raw/*44.17*/("""<p> &emsp; </p>


                <p class = "lead" >Developer: """),_display_(/*47.48*/product/*47.55*/.getDeveloper),format.raw/*47.68*/("""</p>
                <p class = "lead" >Publisher: """),_display_(/*48.48*/product/*48.55*/.getPublisher),format.raw/*48.68*/("""</p>
                <p class = "lead" >"""),_display_(/*49.37*/product/*49.44*/.getDescription),format.raw/*49.59*/("""</p>

                <p class = "a"> Price: &euro; """),_display_(/*51.48*/("%.2f".format(product.getPrice))),format.raw/*51.81*/(""" """),format.raw/*51.82*/("""</p>



                <div class="actions">
                    <a href=""""),_display_(/*56.31*/routes/*56.37*/.ShoppingCtrl.addToBasket(product.getId)),format.raw/*56.77*/("""">
                        <button type="button" class="btn btn-lg btn-primary" >Add to Cart</button>
                    </a>
                </div>

            </tbody>
        </table>
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
                  DATE: Wed Mar 27 21:12:41 GMT 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/app/views/product.scala.html
                  HASH: aa87bdadbc79e348a28e3b4d1f9e6d6696a9badd
                  MATRIX: 1013->1|1209->101|1239->106|1268->127|1307->129|1339->135|1389->159|1404->166|1434->176|1462->177|1493->182|1508->189|1548->209|1868->501|1897->502|1955->532|2080->629|2109->630|2165->658|2198->663|2227->664|2285->694|2421->802|2450->803|2506->831|2546->843|2575->844|2633->874|2809->1022|2838->1023|2894->1051|2933->1062|2962->1063|3020->1093|3233->1278|3262->1279|3308->1297|3407->1369|3497->1450|3538->1452|3588->1474|3667->1526|3703->1541|3748->1568|3761->1573|3800->1574|3850->1596|3976->1691|4024->1711|4119->1779|4135->1786|4169->1799|4249->1852|4265->1859|4299->1872|4368->1914|4384->1921|4420->1936|4502->1991|4556->2024|4585->2025|4693->2106|4708->2112|4769->2152
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4|36->4|36->4|36->4|36->4|44->12|44->12|45->13|47->15|47->15|49->17|49->17|49->17|50->18|52->20|52->20|54->22|54->22|54->22|55->23|58->26|58->26|60->28|60->28|60->28|61->29|65->33|65->33|66->34|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|73->41|74->42|76->44|79->47|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|83->51|83->51|83->51|88->56|88->56|88->56
                  -- GENERATED --
              */
          