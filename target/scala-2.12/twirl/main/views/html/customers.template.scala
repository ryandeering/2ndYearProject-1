
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

object customers extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.users.Customer],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customers: List[models.users.Customer],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
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
                    <th>Email</th>
                    <th>Role </th>
                    <th>Name </th>
                    <th>Surname </th>

                </tr>
            </thead>
            <tbody>
                    <!-- Product row(s) -->

                """),format.raw/*29.66*/("""
                """),_display_(/*30.18*/for(c<-customers) yield /*30.35*/ {_display_(Seq[Any](format.raw/*30.37*/("""
                    """),format.raw/*31.21*/("""<tr>
                        <td>"""),_display_(/*32.30*/c/*32.31*/.getEmail),format.raw/*32.40*/("""</td>
                        <td>"""),_display_(/*33.30*/c/*33.31*/.getRole),format.raw/*33.39*/("""</td>
                        <td>"""),_display_(/*34.30*/c/*34.31*/.getfName),format.raw/*34.40*/("""</td>
                        <td>"""),_display_(/*35.30*/c/*35.31*/.getlName),format.raw/*35.40*/("""</td>

                            <!-- Update button -->
                        <td>
                            <a href=""""),_display_(/*39.39*/routes/*39.45*/.HomeController.updateCustomer(c.getEmail)),format.raw/*39.87*/("""" class="button-xs btn-danger">
                                <span class="glyphicon glyphicon-pencil"></span>
                            </a>
                        </td>
                            <!-- Delete button -->
                        <td>
                            <a href=""""),_display_(/*45.39*/routes/*45.45*/.HomeController.deleteCustomer(c.getEmail)),format.raw/*45.87*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                                <span class="glyphicon glyphicon-trash"></span>
                            </a>
                        </td>
                    </tr>
                """)))}),format.raw/*50.18*/("""

            """),format.raw/*52.13*/("""</tbody>
        </table>

        <p>
            <a href=""""),_display_(/*56.23*/routes/*56.29*/.HomeController.addCustomer()),format.raw/*56.58*/("""">
                <button class="btn btn-primary">Add a new Customer</button>
            </a>
        </p>
    </div>
""")))}))
      }
    }
  }

  def render(customers:List[models.users.Customer],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(customers,user)

  def f:((List[models.users.Customer],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (customers,user) => apply(customers,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 27 21:14:18 GMT 2019
                  SOURCE: /home/ryan/Documents/2ndYearProject/app/views/customers.scala.html
                  HASH: defdfaac7e30544bff53b5e39bcd096bd872e496
                  MATRIX: 991->1|1149->67|1179->89|1217->90|1248->95|1308->194|1339->200|1379->232|1418->234|1453->243|1522->286|1535->291|1570->306|1606->315|1648->327|1681->333|2224->897|2269->915|2302->932|2342->934|2391->955|2452->989|2462->990|2492->999|2554->1034|2564->1035|2593->1043|2655->1078|2665->1079|2695->1088|2757->1123|2767->1124|2797->1133|2949->1258|2964->1264|3027->1306|3348->1600|3363->1606|3426->1648|3706->1897|3748->1911|3836->1972|3851->1978|3901->2007
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|60->29|61->30|61->30|61->30|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|70->39|70->39|70->39|76->45|76->45|76->45|81->50|83->52|87->56|87->56|87->56
                  -- GENERATED --
              */
          