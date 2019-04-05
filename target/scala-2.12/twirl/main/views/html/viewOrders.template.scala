
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
/*5.6*/import scala.Predef; val x= 0


Seq[Any](format.raw/*5.1*/("""    """),format.raw/*6.1*/("""
    """),format.raw/*7.5*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*8.2*/main("View Orders", customer)/*8.31*/ {_display_(Seq[Any](format.raw/*8.33*/("""
	"""),format.raw/*9.2*/("""<script 
		src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.4/jspdf.min.js" 
	  integrity="sha256-vIL0pZJsOKSz76KKVCyLxzkOT00vXs+Qz4fYRVMoDhw="
	  crossorigin="anonymous">
	</script>

    <div class="col-md-12">
        """),_display_(/*16.10*/if(flash.containsKey("success"))/*16.42*/ {_display_(Seq[Any](format.raw/*16.44*/("""
            """),format.raw/*17.13*/("""<div class="alert alert-success">
            """),_display_(/*18.14*/flash/*18.19*/.get("success")),format.raw/*18.34*/("""
            """),format.raw/*19.13*/("""</div>
        """)))}),format.raw/*20.10*/("""

        """),_display_(/*22.10*/if(x == 0)/*22.20*/{_display_(Seq[Any](format.raw/*22.21*/("""
            """),format.raw/*23.13*/("""<p>No orders found!</p> <!-- Scala variable used. -->
            """)))}),format.raw/*24.14*/("""

            """),format.raw/*26.13*/("""<!-- Start of For loop - For each p in products add a row -->
        """),_display_(/*27.10*/for(o <- customer.getOrders()) yield /*27.40*/ {_display_(Seq[Any](format.raw/*27.42*/("""

            """),_display_(/*29.14*/x),format.raw/*29.15*/("""++;
            <p>Order Number: """),_display_(/*30.31*/o/*30.32*/.getId()),format.raw/*30.40*/("""</p>
            <p>Order Date: """),_display_(/*31.29*/o/*31.30*/.getOrderDateString()),format.raw/*31.51*/("""</p>
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
                    """),_display_(/*46.22*/for(i <- o.getItems()) yield /*46.44*/ {_display_(Seq[Any](format.raw/*46.46*/("""

                        """),format.raw/*48.25*/("""<tr>
                            <td>"""),_display_(/*49.34*/i/*49.35*/.getId),format.raw/*49.41*/("""</td>
                            <td>"""),_display_(/*50.34*/i/*50.35*/.getProduct.getName()),format.raw/*50.56*/("""</td>
                            <td>"""),_display_(/*51.34*/i/*51.35*/.getQuantity()),format.raw/*51.49*/("""</td>
                            <td>&euro; """),_display_(/*52.41*/("%.2f".format(i.getPrice()))),format.raw/*52.70*/("""</td>
                            <td>&euro; """),_display_(/*53.41*/("%.2f".format(i.getItemTotal))),format.raw/*53.72*/("""</td>
			    <td><button class="btn btn-primary" onclick="const pdf = new jsPDF(); pdf.text(10, 50, 'This Document can be used as a proof of purchase  IdentityCode: """),_display_(/*54.161*/i/*54.162*/.getId),format.raw/*54.168*/("""');  pdf.text(10, 20, 'You purchased the item: """),_display_(/*54.216*/i/*54.217*/.getProduct.getName()),format.raw/*54.238*/("""'); pdf.text(10, 30, 'Quantity Purchased: """),_display_(/*54.281*/i/*54.282*/.getQuantity()),format.raw/*54.296*/("""'); pdf.text(10, 40, 'Your Order Total: """),_display_(/*54.337*/(i.getItemTotal)),format.raw/*54.353*/(""" """),format.raw/*54.354*/("""Euro'); pdf.text(10, 10, `Thanks for shopping with CDR GAMES!`); pdf.save();">Print Receipt</button></td>

                        </tr>
                    """)))}),format.raw/*57.22*/("""<!-- End of For loop -->

                </tbody>


            </table>
            <div class="row">
                <div class="col-md-12">
                    <p class="text-right"><strong>Order Total: &euro; """),_display_(/*65.72*/("%.2f".format(o.getOrderTotal))),format.raw/*65.104*/("""</strong></p>
                </div>
            </div>
            <p>
                <a href=""""),_display_(/*69.27*/routes/*69.33*/.ShoppingCtrl.cancelOrder(o.getId())),format.raw/*69.69*/("""">
                    <button class="btn btn-primary">Cancel Order</button>
                </a>

            </p>
        """)))}),format.raw/*74.10*/("""<!-- End of For loop -->

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
                  DATE: Fri Apr 05 19:03:44 BST 2019
                  SOURCE: F:/dsad/2ndYearProject2/app/views/viewOrders.scala.html
                  HASH: 0f808faf703c73b5657e5706103dbb0e5edd1847
                  MATRIX: 968->1|1074->36|1110->66|1142->92|1174->122|1232->117|1262->152|1293->157|1364->203|1401->232|1440->234|1468->236|1721->462|1762->494|1802->496|1843->509|1917->556|1931->561|1967->576|2008->589|2055->605|2093->616|2112->626|2151->627|2192->640|2290->707|2332->721|2430->792|2476->822|2516->824|2558->839|2580->840|2641->874|2651->875|2680->883|2740->916|2750->917|2792->938|3292->1411|3330->1433|3370->1435|3424->1461|3489->1499|3499->1500|3526->1506|3592->1545|3602->1546|3644->1567|3710->1606|3720->1607|3755->1621|3828->1667|3878->1696|3951->1742|4003->1773|4197->1939|4208->1940|4236->1946|4312->1994|4323->1995|4366->2016|4437->2059|4448->2060|4484->2074|4553->2115|4591->2131|4621->2132|4810->2290|5052->2505|5106->2537|5231->2635|5246->2641|5303->2677|5459->2802
                  LINES: 28->1|31->2|32->3|33->4|34->5|37->5|37->6|38->7|39->8|39->8|39->8|40->9|47->16|47->16|47->16|48->17|49->18|49->18|49->18|50->19|51->20|53->22|53->22|53->22|54->23|55->24|57->26|58->27|58->27|58->27|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|77->46|77->46|77->46|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|84->53|84->53|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|88->57|96->65|96->65|100->69|100->69|100->69|105->74
                  -- GENERATED --
              */
          