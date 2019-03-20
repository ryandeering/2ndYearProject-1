
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

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import play.api.Play.current
/*3.2*/import models.shopping._
/*4.2*/import models.products._


Seq[Any](format.raw/*5.1*/("""
    """),format.raw/*6.5*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*7.2*/main("View Orders", customer)/*7.31*/ {_display_(Seq[Any](format.raw/*7.33*/("""
	"""),format.raw/*8.2*/("""<script 
		src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.4/jspdf.min.js" 
	  integrity="sha256-vIL0pZJsOKSz76KKVCyLxzkOT00vXs+Qz4fYRVMoDhw="
	  crossorigin="anonymous">
	</script>

    <div class="col-md-12">
        """),_display_(/*15.10*/if(flash.containsKey("success"))/*15.42*/ {_display_(Seq[Any](format.raw/*15.44*/("""
            """),format.raw/*16.13*/("""<div class="alert alert-success">
            """),_display_(/*17.14*/flash/*17.19*/.get("success")),format.raw/*17.34*/("""
            """),format.raw/*18.13*/("""</div>
        """)))}),format.raw/*19.10*/("""



            """),format.raw/*23.13*/("""<!-- Start of For loop - For each p in products add a row -->
        """),_display_(/*24.10*/for(o <- customer.getOrders()) yield /*24.40*/ {_display_(Seq[Any](format.raw/*24.42*/("""

            """),format.raw/*26.13*/("""<p>Order Number: """),_display_(/*26.31*/o/*26.32*/.getId()),format.raw/*26.40*/("""</p>
            <p>Order Date: """),_display_(/*27.29*/o/*27.30*/.getOrderDateString()),format.raw/*27.51*/("""</p>
            <table class="table table-bordered table-hover table-condensed">

                <thead>
                        <!-- The header row-->
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Quantity</th>
                        <th>Price</th>
                        <th>Total</th>
			
                    </tr>
                </thead>
                <tbody>
                    """),_display_(/*42.22*/for(i <- o.getItems()) yield /*42.44*/ {_display_(Seq[Any](format.raw/*42.46*/("""

                        """),format.raw/*44.25*/("""<tr>
                            <td>"""),_display_(/*45.34*/i/*45.35*/.getId),format.raw/*45.41*/("""</td>
                            <td>"""),_display_(/*46.34*/i/*46.35*/.getProduct.getName()),format.raw/*46.56*/("""</td>
                            <td>"""),_display_(/*47.34*/i/*47.35*/.getQuantity()),format.raw/*47.49*/("""</td>
                            <td>&euro; """),_display_(/*48.41*/("%.2f".format(i.getPrice()))),format.raw/*48.70*/("""</td>
                            <td>&euro; """),_display_(/*49.41*/("%.2f".format(i.getItemTotal))),format.raw/*49.72*/("""</td>
			    <td><button class="btn btn-primary" onclick="const pdf = new jsPDF(); pdf.text(10, 50, 'This Document can be used as a proof of purchase  IdentityCode: """),_display_(/*50.161*/i/*50.162*/.getId),format.raw/*50.168*/("""');  pdf.text(10, 20, 'You purchased the item: """),_display_(/*50.216*/i/*50.217*/.getProduct.getName()),format.raw/*50.238*/("""'); pdf.text(10, 30, 'Quantity Purchased: """),_display_(/*50.281*/i/*50.282*/.getQuantity()),format.raw/*50.296*/("""'); pdf.text(10, 40, 'Your Order Total: """),_display_(/*50.337*/(i.getItemTotal)),format.raw/*50.353*/(""" """),format.raw/*50.354*/("""Euro'); pdf.text(10, 10, `Thanks for shopping with CDR GAMES!`); pdf.save();">Print Receipt</button></td>

                        </tr>
                    """)))}),format.raw/*53.22*/("""<!-- End of For loop -->

                </tbody>
            </table>
            <div class="row">
                <div class="col-md-12">
                    <p class="text-right"><strong>Order Total: &euro; """),_display_(/*59.72*/("%.2f".format(o.getOrderTotal))),format.raw/*59.104*/("""</strong></p>
                </div>
            </div>
            <p>
                <a href=""""),_display_(/*63.27*/routes/*63.33*/.ShoppingCtrl.cancelOrder(o.getId())),format.raw/*63.69*/("""">
                    <button class="btn btn-primary">Cancel Order</button>
                </a>

            </p>
        """)))}),format.raw/*68.10*/("""<!-- End of For loop -->

    </div>
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.users.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 20 20:47:02 GMT 2019
                  SOURCE: /home/wdd/2ndYrProject/2ndYearProject/app/views/viewOrders.scala.html
                  HASH: f873eaaa94f9e7ba63448f61aaed1d83f2e7a0c9
                  MATRIX: 968->1|1074->36|1110->66|1142->92|1195->117|1226->122|1297->168|1334->197|1373->199|1401->201|1654->427|1695->459|1735->461|1776->474|1850->521|1864->526|1900->541|1941->554|1988->570|2032->586|2130->657|2176->687|2216->689|2258->703|2303->721|2313->722|2342->730|2402->763|2412->764|2454->785|2954->1258|2992->1280|3032->1282|3086->1308|3151->1346|3161->1347|3188->1353|3254->1392|3264->1393|3306->1414|3372->1453|3382->1454|3417->1468|3490->1514|3540->1543|3613->1589|3665->1620|3859->1786|3870->1787|3898->1793|3974->1841|3985->1842|4028->1863|4099->1906|4110->1907|4146->1921|4215->1962|4253->1978|4283->1979|4472->2137|4712->2350|4766->2382|4891->2480|4906->2486|4963->2522|5119->2647
                  LINES: 28->1|31->2|32->3|33->4|36->5|37->6|38->7|38->7|38->7|39->8|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|50->19|54->23|55->24|55->24|55->24|57->26|57->26|57->26|57->26|58->27|58->27|58->27|73->42|73->42|73->42|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|80->49|80->49|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|84->53|90->59|90->59|94->63|94->63|94->63|99->68
                  -- GENERATED --
              */
          