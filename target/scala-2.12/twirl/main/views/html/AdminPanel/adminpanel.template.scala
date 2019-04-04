
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
/*1.2*/import models.users.User

object adminpanel extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Administrators",user)/*3.29*/{_display_(Seq[Any](format.raw/*3.30*/("""
    """),format.raw/*4.5*/("""<div class="col-sm-9">
        <h4>Hello, """),_display_(/*5.21*/user/*5.25*/.getfName()),format.raw/*5.36*/(""" """),_display_(/*5.38*/user/*5.42*/.getlName()),format.raw/*5.53*/("""!</h4>
        <h5>This is the admin panel.</h5>
        <div class="col-sm-9">
            <a href=""""),_display_(/*8.23*/routes/*8.29*/.AdminProductCtrl.listProducts(0)),format.raw/*8.62*/("""" class="btn btn-primary active">
                <span class=""></span>CRUD/List Products</a>
            <a href=""""),_display_(/*10.23*/routes/*10.29*/.AdminProductCtrl.discount()),format.raw/*10.57*/("""" class="btn btn-primary active">
                <span class=""></span>CRUD/List Discounts</a>
            <a href=""""),_display_(/*12.23*/routes/*12.29*/.HomeController.usersAdmin),format.raw/*12.55*/("""" class="btn btn-primary active">
                <span class=""></span>CRUD/List Admins</a>
            <a href=""""),_display_(/*14.23*/routes/*14.29*/.HomeController.usersCustomer()),format.raw/*14.60*/("""" class="btn btn-primary active">
                <span class=""></span>CRUD/List Customers</a>
            <a href=""""),_display_(/*16.23*/routes/*16.29*/.AdminProductCtrl.statistics()),format.raw/*16.59*/("""" class="btn btn-primary active">
                <span class=""></span>Statistics</a>
        </div>

        </table>
    </div>
""")))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 04 21:01:49 IST 2019
                  SOURCE: /home/ryan/Downloads/aa/2ndYearProject/app/views/AdminPanel/adminpanel.scala.html
                  HASH: 1b689ca7df9a160be04516d22c3688c1634467c4
                  MATRIX: 662->1|1007->27|1126->54|1161->81|1199->82|1230->87|1299->130|1311->134|1342->145|1370->147|1382->151|1413->162|1541->264|1555->270|1608->303|1752->420|1767->426|1816->454|1961->572|1976->578|2023->604|2165->719|2180->725|2232->756|2377->874|2392->880|2443->910
                  LINES: 24->1|29->2|34->3|34->3|34->3|35->4|36->5|36->5|36->5|36->5|36->5|36->5|39->8|39->8|39->8|41->10|41->10|41->10|43->12|43->12|43->12|45->14|45->14|45->14|47->16|47->16|47->16
                  -- GENERATED --
              */
          