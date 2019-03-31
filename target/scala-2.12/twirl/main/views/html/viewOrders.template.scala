
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


Seq[Any](format.raw/*1.35*/("""
"""),format.raw/*5.1*/("""    """),format.raw/*6.1*/("""
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



    """),_display_(/*24.6*/if(x == 0)/*24.16*/{_display_(Seq[Any](format.raw/*24.17*/("""
        """),format.raw/*25.9*/("""<p>No orders found.</p>
    """)))}),format.raw/*26.6*/("""





            """),format.raw/*32.13*/("""<!-- Start of For loop - For each p in products add a row -->
        """),_display_(/*33.10*/for(o <- customer.getOrders()) yield /*33.40*/ {_display_(Seq[Any](format.raw/*33.42*/("""

            """),_display_(/*35.14*/x),format.raw/*35.15*/("""++;
            <p>Order Number: """),_display_(/*36.31*/o/*36.32*/.getId()),format.raw/*36.40*/("""</p>
            <p>Order Date: """),_display_(/*37.29*/o/*37.30*/.getOrderDateString()),format.raw/*37.51*/("""</p>
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
                    """),_display_(/*52.22*/for(i <- o.getItems()) yield /*52.44*/ {_display_(Seq[Any](format.raw/*52.46*/("""

                        """),format.raw/*54.25*/("""<tr>
                            <td>"""),_display_(/*55.34*/i/*55.35*/.getId),format.raw/*55.41*/("""</td>
                            <td>"""),_display_(/*56.34*/i/*56.35*/.getProduct.getName()),format.raw/*56.56*/("""</td>
                            <td>"""),_display_(/*57.34*/i/*57.35*/.getQuantity()),format.raw/*57.49*/("""</td>
                            <td>&euro; """),_display_(/*58.41*/("%.2f".format(i.getPrice()))),format.raw/*58.70*/("""</td>
                            <td>&euro; """),_display_(/*59.41*/("%.2f".format(i.getItemTotal))),format.raw/*59.72*/("""</td>
			    <td><button class="btn btn-primary" onclick="const pdf = new jsPDF(); pdf.text(10, 50, 'This Document can be used as a proof of purchase  IdentityCode: """),_display_(/*60.161*/i/*60.162*/.getId),format.raw/*60.168*/("""');  pdf.text(10, 20, 'You purchased the item: """),_display_(/*60.216*/i/*60.217*/.getProduct.getName()),format.raw/*60.238*/("""'); pdf.text(10, 30, 'Quantity Purchased: """),_display_(/*60.281*/i/*60.282*/.getQuantity()),format.raw/*60.296*/("""'); pdf.text(10, 40, 'Your Order Total: """),_display_(/*60.337*/(i.getItemTotal)),format.raw/*60.353*/(""" """),format.raw/*60.354*/("""Euro'); pdf.text(10, 10, `Thanks for shopping with CDR GAMES!`); pdf.save();">Print Receipt</button></td>

                        </tr>
                    """)))}),format.raw/*63.22*/("""<!-- End of For loop -->

                </tbody>


            </table>
            <div class="row">
                <div class="col-md-12">
                    <p class="text-right"><strong>Order Total: &euro; """),_display_(/*71.72*/("%.2f".format(o.getOrderTotal))),format.raw/*71.104*/("""</strong></p>
                </div>
            </div>
            <p>
                <a href=""""),_display_(/*75.27*/routes/*75.33*/.ShoppingCtrl.cancelOrder(o.getId())),format.raw/*75.69*/("""">
                    <button class="btn btn-primary">Cancel Order</button>
                </a>

            </p>
        """)))}),format.raw/*80.10*/("""<!-- End of For loop -->

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
                  DATE: Sun Mar 31 00:08:34 GMT 2019
                  SOURCE: /home/ryan/2ndyearproj/2ndYearProject/app/views/viewOrders.scala.html
                  HASH: 145cbc440cc978b38e0bb8262d1d759bfa935458
                  MATRIX: 968->1|1074->37|1110->68|1142->95|1174->126|1233->34|1261->121|1291->157|1323->163|1395->210|1432->239|1471->241|1500->244|1760->477|1801->509|1841->511|1883->525|1958->573|1972->578|2008->593|2050->607|2098->624|2137->637|2156->647|2195->648|2232->658|2292->688|2344->712|2443->784|2489->814|2529->816|2573->833|2595->834|2657->869|2667->870|2696->878|2757->912|2767->913|2809->934|3324->1422|3362->1444|3402->1446|3458->1474|3524->1513|3534->1514|3561->1520|3628->1560|3638->1561|3680->1582|3747->1622|3757->1623|3792->1637|3866->1684|3916->1713|3990->1760|4042->1791|4237->1958|4248->1959|4276->1965|4352->2013|4363->2014|4406->2035|4477->2078|4488->2079|4524->2093|4593->2134|4631->2150|4661->2151|4853->2312|5103->2535|5157->2567|5286->2669|5301->2675|5358->2711|5519->2841
                  LINES: 28->1|31->2|32->3|33->4|34->5|37->1|38->5|38->6|39->7|40->8|40->8|40->8|41->9|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|52->20|56->24|56->24|56->24|57->25|58->26|64->32|65->33|65->33|65->33|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|84->52|84->52|84->52|86->54|87->55|87->55|87->55|88->56|88->56|88->56|89->57|89->57|89->57|90->58|90->58|91->59|91->59|92->60|92->60|92->60|92->60|92->60|92->60|92->60|92->60|92->60|92->60|92->60|92->60|95->63|103->71|103->71|107->75|107->75|107->75|112->80
                  -- GENERATED --
              */
          