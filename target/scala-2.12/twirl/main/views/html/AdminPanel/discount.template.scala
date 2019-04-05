
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


Seq[Any](_display_(/*2.2*/main("Customers",user)/*2.24*/{_display_(Seq[Any](format.raw/*2.25*/("""
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
                  DATE: Fri Apr 05 19:03:43 BST 2019
                  SOURCE: F:/dsad/2ndYearProject2/app/views/AdminPanel/discount.scala.html
                  HASH: a49eedbfd6b99e2fcbc047fde7cafea9ca89967a
                  MATRIX: 1004->1|1165->70|1195->92|1233->93|1264->98|1324->197|1355->203|1395->235|1434->237|1469->246|1538->289|1551->294|1586->309|1622->318|1664->330|1697->336|2240->900|2285->918|2318->935|2358->937|2407->958|2468->992|2478->993|2513->1007|2575->1042|2585->1043|2622->1059|2684->1094|2694->1095|2723->1103|2785->1138|2795->1139|2826->1149|2978->1274|2993->1280|3063->1329|3314->1549|3356->1563|3435->1665|3480->1682
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|60->29|61->30|61->30|61->30|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|70->39|70->39|70->39|76->45|78->47|82->51|83->52
                  -- GENERATED --
              */
          