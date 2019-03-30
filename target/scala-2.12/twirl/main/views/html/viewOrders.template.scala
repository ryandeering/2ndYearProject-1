
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





            """),format.raw/*25.13*/("""<!-- Start of For loop - For each p in products add a row -->
        """),_display_(/*26.10*/for(o <- customer.getOrders()) yield /*26.40*/ {_display_(Seq[Any](format.raw/*26.42*/("""

            """),format.raw/*28.13*/("""<p>Order Number: """),_display_(/*28.31*/o/*28.32*/.getId()),format.raw/*28.40*/("""</p>
            <p>Order Date: """),_display_(/*29.29*/o/*29.30*/.getOrderDateString()),format.raw/*29.51*/("""</p>
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
                    """),_display_(/*44.22*/for(i <- o.getItems()) yield /*44.44*/ {_display_(Seq[Any](format.raw/*44.46*/("""

                        """),format.raw/*46.25*/("""<tr>
                            <td>"""),_display_(/*47.34*/i/*47.35*/.getId),format.raw/*47.41*/("""</td>
                            <td>"""),_display_(/*48.34*/i/*48.35*/.getProduct.getName()),format.raw/*48.56*/("""</td>
                            <td>"""),_display_(/*49.34*/i/*49.35*/.getQuantity()),format.raw/*49.49*/("""</td>
                            <td>&euro; """),_display_(/*50.41*/("%.2f".format(i.getPrice()))),format.raw/*50.70*/("""</td>
                            <td>&euro; """),_display_(/*51.41*/("%.2f".format(i.getItemTotal))),format.raw/*51.72*/("""</td>
			    <td><button class="btn btn-primary" onclick="const pdf = new jsPDF(); pdf.text(10, 50, 'This Document can be used as a proof of purchase  IdentityCode: """),_display_(/*52.161*/i/*52.162*/.getId),format.raw/*52.168*/("""');  pdf.text(10, 20, 'You purchased the item: """),_display_(/*52.216*/i/*52.217*/.getProduct.getName()),format.raw/*52.238*/("""'); pdf.text(10, 30, 'Quantity Purchased: """),_display_(/*52.281*/i/*52.282*/.getQuantity()),format.raw/*52.296*/("""'); pdf.text(10, 40, 'Your Order Total: """),_display_(/*52.337*/(i.getItemTotal)),format.raw/*52.353*/(""" """),format.raw/*52.354*/("""Euro'); pdf.text(10, 10, `Thanks for shopping with CDR GAMES!`); pdf.save();">Print Receipt</button></td>

                        </tr>
                    """)))}),format.raw/*55.22*/("""<!-- End of For loop -->

                </tbody>
            </table>
            <div class="row">
                <div class="col-md-12">
                    <p class="text-right"><strong>Order Total: &euro; """),_display_(/*61.72*/("%.2f".format(o.getOrderTotal))),format.raw/*61.104*/("""</strong></p>
                </div>
            </div>
            <p>
                <a href=""""),_display_(/*65.27*/routes/*65.33*/.ShoppingCtrl.cancelOrder(o.getId())),format.raw/*65.69*/("""">
                    <button class="btn btn-primary">Cancel Order</button>
                </a>

            </p>
        """)))}),format.raw/*70.10*/("""<!-- End of For loop -->

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
                  DATE: Sat Mar 30 21:13:36 GMT 2019
                  SOURCE: /home/ryan/2ndyearproj/2ndYearProject/app/views/viewOrders.scala.html
                  HASH: 51748a2a898c9e179555d654f1bee6e1dd954329
                  MATRIX: 968->1|1074->37|1110->68|1142->95|1196->34|1224->121|1256->127|1328->174|1365->203|1404->205|1433->208|1693->441|1734->473|1774->475|1816->489|1891->537|1905->542|1941->557|1983->571|2031->588|2083->612|2182->684|2228->714|2268->716|2312->732|2357->750|2367->751|2396->759|2457->793|2467->794|2509->815|3024->1303|3062->1325|3102->1327|3158->1355|3224->1394|3234->1395|3261->1401|3328->1441|3338->1442|3380->1463|3447->1503|3457->1504|3492->1518|3566->1565|3616->1594|3690->1641|3742->1672|3937->1839|3948->1840|3976->1846|4052->1894|4063->1895|4106->1916|4177->1959|4188->1960|4224->1974|4293->2015|4331->2031|4361->2032|4553->2193|4799->2412|4853->2444|4982->2546|4997->2552|5054->2588|5215->2718
                  LINES: 28->1|31->2|32->3|33->4|36->1|37->5|38->6|39->7|39->7|39->7|40->8|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|57->25|58->26|58->26|58->26|60->28|60->28|60->28|60->28|61->29|61->29|61->29|76->44|76->44|76->44|78->46|79->47|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|82->50|82->50|83->51|83->51|84->52|84->52|84->52|84->52|84->52|84->52|84->52|84->52|84->52|84->52|84->52|84->52|87->55|93->61|93->61|97->65|97->65|97->65|102->70
                  -- GENERATED --
              */
          