
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


Seq[Any](format.raw/*2.27*/("""
"""),_display_(/*3.2*/main("Administrators",user)/*3.29*/{_display_(Seq[Any](format.raw/*3.30*/("""
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
                  DATE: Thu Apr 04 01:09:46 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/app/views/AdminPanel/adminpanel.scala.html
                  HASH: e9cf2051acd77780b2fb1525ecd5a5a56b709500
                  MATRIX: 662->1|1007->28|1127->53|1155->56|1190->83|1228->84|1260->90|1330->134|1342->138|1373->149|1401->151|1413->155|1444->166|1575->271|1589->277|1642->310|1788->429|1803->435|1852->463|1999->583|2014->589|2061->615|2205->732|2220->738|2272->769|2419->889|2434->895|2485->925
                  LINES: 24->1|29->2|34->2|35->3|35->3|35->3|36->4|37->5|37->5|37->5|37->5|37->5|37->5|40->8|40->8|40->8|42->10|42->10|42->10|44->12|44->12|44->12|46->14|46->14|46->14|48->16|48->16|48->16
                  -- GENERATED --
              */
          