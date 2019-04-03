
package views.html

import controllers._
import play.core.j.PlayMagicForJava._
import play.mvc.Http.Context.Implicit._

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/; val x= 0


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
                  DATE: Wed Apr 03 23:20:42 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/a/2ndYearProject/app/views/viewOrders.scala.html
                  HASH: 18c7c8479a6ae60cc40f38386804eb9f73cf3968
                  MATRIX: 968->1|1074->37|1110->68|1142->95|1174->126|1233->34|1261->121|1291->157|1323->163|1395->210|1432->239|1471->241|1500->244|1760->477|1801->509|1841->511|1883->525|1958->573|1972->578|2008->593|2050->607|2098->624|2138->637|2157->647|2196->648|2238->662|2337->730|2381->746|2480->818|2526->848|2566->850|2610->867|2632->868|2694->903|2704->904|2733->912|2794->946|2804->947|2846->968|3361->1456|3399->1478|3439->1480|3495->1508|3561->1547|3571->1548|3598->1554|3665->1594|3675->1595|3717->1616|3784->1656|3794->1657|3829->1671|3903->1718|3953->1747|4027->1794|4079->1825|4274->1992|4285->1993|4313->1999|4389->2047|4400->2048|4443->2069|4514->2112|4525->2113|4561->2127|4630->2168|4668->2184|4698->2185|4890->2346|5140->2569|5194->2601|5323->2703|5338->2709|5395->2745|5556->2875
                  LINES: 28->1|31->2|32->3|33->4|34->5|37->1|38->5|38->6|39->7|40->8|40->8|40->8|41->9|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|52->20|54->22|54->22|54->22|55->23|56->24|58->26|59->27|59->27|59->27|61->29|61->29|62->30|62->30|62->30|63->31|63->31|63->31|78->46|78->46|78->46|80->48|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|84->52|84->52|85->53|85->53|86->54|86->54|86->54|86->54|86->54|86->54|86->54|86->54|86->54|86->54|86->54|86->54|89->57|97->65|97->65|101->69|101->69|101->69|106->74
                  -- GENERATED --
              */
          