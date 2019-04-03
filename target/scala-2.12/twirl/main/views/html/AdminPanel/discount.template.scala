
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

object discount extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.shopping.Discount],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(discounts: List[models.shopping.Discount],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/("""
"""),_display_(/*2.2*/main("Customers",user)/*2.24*/{_display_(Seq[Any](format.raw/*2.25*/("""
    """),format.raw/*3.5*/("""<h1>Current customers</h1>


    """),format.raw/*6.71*/("""
    """),_display_(/*7.6*/if(flash.containsKey("success"))/*7.38*/ {_display_(Seq[Any](format.raw/*7.40*/("""
        """),format.raw/*8.9*/("""<div class="alert alert-success">
        """),_display_(/*9.10*/flash/*9.15*/.get("success")),format.raw/*9.30*/("""
        """),format.raw/*10.9*/("""</div>
    """)))}),format.raw/*11.6*/("""

    """),format.raw/*13.5*/("""<div class="col-sm-9">
        <h4>Here are all the current customers on the system.</h4>
        <table class="table table-bordered table-hover table-condensed">
            <thead>
                    <!-- The header row-->
                <tr>
                    <th>ID</th>
                    <th>Name </th>
                    <th>Validity </th>
                    <th>Amount </th>

                </tr>
            </thead>
            <tbody>
                    <!-- Product row(s) -->

                """),format.raw/*29.66*/("""
                """),_display_(/*30.18*/for(d<-discounts) yield /*30.35*/ {_display_(Seq[Any](format.raw/*30.37*/("""
                    """),format.raw/*31.21*/("""<tr>
                        <td>"""),_display_(/*32.30*/d/*32.31*/.getDiscountID),format.raw/*32.45*/("""</td>
                        <td>"""),_display_(/*33.30*/d/*33.31*/.getDiscountName),format.raw/*33.47*/("""</td>
                        <td>"""),_display_(/*34.30*/d/*34.31*/.isValid),format.raw/*34.39*/("""</td>
                        <td>"""),_display_(/*35.30*/d/*35.31*/.getAmount),format.raw/*35.41*/("""</td>

                            <!-- Update button -->
                        <td>
                            <a href=""""),_display_(/*39.39*/routes/*39.45*/.AdminProductCtrl.updateDiscount(d.getDiscountID)),format.raw/*39.94*/("""" class="button-xs btn-danger">
                                <span class="glyphicon glyphicon-pencil"></span>
                            </a>
                        </td>

                    </tr>
                """)))}),format.raw/*45.18*/("""

            """),format.raw/*47.13*/("""</tbody>
        </table>

        <p>
            """),format.raw/*51.64*/("""
                """),format.raw/*52.17*/("""<button class="btn btn-primary">Add a new Customer</button>
            </a>
        </p>
    </div>
""")))}))
      }
    }
  }

  def render(discounts:List[models.shopping.Discount],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(discounts,user)

  def f:((List[models.shopping.Discount],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (discounts,user) => apply(discounts,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 03 23:20:41 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/a/2ndYearProject/app/views/AdminPanel/discount.scala.html
                  HASH: 3b2c2e577b9acc4aa9ee3e1bf5044f60c255e39a
                  MATRIX: 1004->1|1166->68|1194->71|1224->93|1262->94|1294->100|1357->202|1389->209|1429->241|1468->243|1504->253|1574->297|1587->302|1622->317|1659->327|1702->340|1737->348|2296->928|2342->947|2375->964|2415->966|2465->988|2527->1023|2537->1024|2572->1038|2635->1074|2645->1075|2682->1091|2745->1127|2755->1128|2784->1136|2847->1172|2857->1173|2888->1183|3044->1312|3059->1318|3129->1367|3386->1593|3430->1609|3513->1715|3559->1733
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|38->6|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|45->13|61->29|62->30|62->30|62->30|63->31|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|71->39|71->39|71->39|77->45|79->47|83->51|84->52
                  -- GENERATED --
              */
          