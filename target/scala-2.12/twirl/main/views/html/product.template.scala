
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
                  DATE: Tue Mar 26 21:19:29 GMT 2019
                  SOURCE: /home/ryan/rawr/2ndYearProject2/app/views/product.scala.html
                  HASH: 562d2e969ffaa641bb7d522ee56f875d1d6528bf
                  MATRIX: 1013->1|1207->102|1234->104|1263->125|1302->127|1333->132|1383->156|1398->163|1428->173|1456->174|1487->179|1502->186|1542->206|1854->490|1883->491|1940->520|2063->615|2092->616|2146->642|2179->647|2208->648|2265->677|2399->783|2428->784|2482->810|2522->822|2551->823|2608->852|2781->997|2810->998|2864->1024|2903->1035|2932->1036|2989->1065|3198->1246|3227->1247|3272->1264|3367->1332|3457->1413|3498->1415|3547->1436|3626->1488|3662->1503|3706->1529|3719->1534|3758->1535|3807->1556|3932->1650|3978->1668|4070->1733|4086->1740|4120->1753|4199->1805|4215->1812|4249->1825|4317->1866|4333->1873|4369->1888|4449->1941|4503->1974|4532->1975|4635->2051|4650->2057|4711->2097
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|35->4|35->4|43->12|43->12|44->13|46->15|46->15|48->17|48->17|48->17|49->18|51->20|51->20|53->22|53->22|53->22|54->23|57->26|57->26|59->28|59->28|59->28|60->29|64->33|64->33|65->34|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|73->42|75->44|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|82->51|82->51|82->51|87->56|87->56|87->56
                  -- GENERATED --
              */
          