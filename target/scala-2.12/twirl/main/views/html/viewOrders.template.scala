
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


Seq[Any](format.raw/*1.35*/("""
"""),format.raw/*5.1*/("""
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
                  DATE: Thu Mar 28 18:31:21 GMT 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/app/views/viewOrders.scala.html
                  HASH: 7599ff102e77aeedcbd1d695a44fa29e144c1c65
                  MATRIX: 968->1|1074->37|1110->68|1142->95|1196->34|1224->121|1256->127|1328->174|1365->203|1404->205|1433->208|1693->441|1734->473|1774->475|1816->489|1891->537|1905->542|1941->557|1983->571|2031->588|2079->608|2178->680|2224->710|2264->712|2308->728|2353->746|2363->747|2392->755|2453->789|2463->790|2505->811|3020->1299|3058->1321|3098->1323|3154->1351|3220->1390|3230->1391|3257->1397|3324->1437|3334->1438|3376->1459|3443->1499|3453->1500|3488->1514|3562->1561|3612->1590|3686->1637|3738->1668|3933->1835|3944->1836|3972->1842|4048->1890|4059->1891|4102->1912|4173->1955|4184->1956|4220->1970|4289->2011|4327->2027|4357->2028|4549->2189|4795->2408|4849->2440|4978->2542|4993->2548|5050->2584|5211->2714
                  LINES: 28->1|31->2|32->3|33->4|36->1|37->5|38->6|39->7|39->7|39->7|40->8|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|55->23|56->24|56->24|56->24|58->26|58->26|58->26|58->26|59->27|59->27|59->27|74->42|74->42|74->42|76->44|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|79->47|80->48|80->48|81->49|81->49|82->50|82->50|82->50|82->50|82->50|82->50|82->50|82->50|82->50|82->50|82->50|82->50|85->53|91->59|91->59|95->63|95->63|95->63|100->68
                  -- GENERATED --
              */
          