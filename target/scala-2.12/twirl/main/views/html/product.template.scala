
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
    """),format.raw/*4.5*/("""<p class="producthead">"""),_display_(/*4.29*/product/*4.36*/.getName()),format.raw/*4.46*/("""</p>

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

                <p class = "lead" >"""),_display_(/*46.37*/product/*46.44*/.getDescription),format.raw/*46.59*/("""</p>


                <div class="actions">
                    <a href=""""),_display_(/*50.31*/routes/*50.37*/.ShoppingCtrl.addToBasket(product.getId)),format.raw/*50.77*/("""">
                        <button type="button" class="btn btn-lg btn-primary" >Add to Cart</button>
                    </a>
                </div>
                <p class = "a"> Price: &euro; """),_display_(/*54.48*/("%.2f".format(product.getPrice))),format.raw/*54.81*/(""" """),format.raw/*54.82*/("""</p>
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
                  DATE: Wed Mar 20 19:32:02 GMT 2019
                  SOURCE: /home/wdd/2ndYrProject/2ndYearProject/app/views/product.scala.html
                  HASH: 62be2dfa5e7dc25c342a3164403126d3c38e6e3c
                  MATRIX: 1013->1|1207->102|1234->104|1263->125|1302->127|1333->132|1383->156|1398->163|1428->173|1740->457|1769->458|1826->487|1949->582|1978->583|2032->609|2065->614|2094->615|2151->644|2285->750|2314->751|2368->777|2408->789|2437->790|2494->819|2667->964|2696->965|2750->991|2789->1002|2818->1003|2875->1032|3084->1213|3113->1214|3158->1231|3253->1299|3343->1380|3384->1382|3433->1403|3512->1455|3548->1470|3592->1496|3605->1501|3644->1502|3693->1523|3818->1617|3864->1635|3944->1688|3960->1695|3996->1710|4098->1785|4113->1791|4174->1831|4398->2028|4452->2061|4481->2062
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|35->4|35->4|35->4|43->12|43->12|44->13|46->15|46->15|48->17|48->17|48->17|49->18|51->20|51->20|53->22|53->22|53->22|54->23|57->26|57->26|59->28|59->28|59->28|60->29|64->33|64->33|65->34|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|73->42|75->44|77->46|77->46|77->46|81->50|81->50|81->50|85->54|85->54|85->54
                  -- GENERATED --
              */
          