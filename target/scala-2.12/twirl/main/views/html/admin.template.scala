
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
/*1.2*/import models.users.User

object admin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.users.Admin],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(admins: List[models.users.Admin],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Administrators",user)/*3.29*/{_display_(Seq[Any](format.raw/*3.30*/("""
    """),format.raw/*4.5*/("""<h1>Current administrators</h1>


    """),format.raw/*7.71*/("""
    """),_display_(/*8.6*/if(flash.containsKey("success"))/*8.38*/ {_display_(Seq[Any](format.raw/*8.40*/("""
        """),format.raw/*9.9*/("""<div class="alert alert-success">
        """),_display_(/*10.10*/flash/*10.15*/.get("success")),format.raw/*10.30*/("""
        """),format.raw/*11.9*/("""</div>
    """)))}),format.raw/*12.6*/("""

    """),format.raw/*14.5*/("""<div class="col-sm-9">
        <h4>Here are all the current administrators on the system.</h4>
        <table class="table table-bordered table-hover table-condensed">
            <thead>
                    <!-- The header row-->
                <tr>
                    <th>Email</th>
                    <th>Role</th>
                    <th>Name</th>
                    <th>Surname</th>
                </tr>
            </thead>
            <tbody>
                    <!-- Product row(s) -->

                """),format.raw/*29.66*/("""
                """),_display_(/*30.18*/for(a <- admins) yield /*30.34*/ {_display_(Seq[Any](format.raw/*30.36*/("""
                    """),format.raw/*31.21*/("""<tr>
                        <td>"""),_display_(/*32.30*/a/*32.31*/.getEmail),format.raw/*32.40*/("""</td>
                        <td>"""),_display_(/*33.30*/a/*33.31*/.getRole),format.raw/*33.39*/("""</td>
                        <td>"""),_display_(/*34.30*/a/*34.31*/.getfName),format.raw/*34.40*/("""</td>
                        <td>"""),_display_(/*35.30*/a/*35.31*/.getlName),format.raw/*35.40*/("""</td>

                            <!-- Update button -->
                        <td>
                            <a href=""""),_display_(/*39.39*/routes/*39.45*/.HomeController.updateAdmin(a.getEmail)),format.raw/*39.84*/("""" class="button-xs btn-danger">
                                <span class="glyphicon glyphicon-pencil"></span>
                            </a>
                        </td>
                            <!-- Delete button -->
                        <td>
                            <a href=""""),_display_(/*45.39*/routes/*45.45*/.HomeController.deleteAdmin(a.getEmail)),format.raw/*45.84*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                                <span class="glyphicon glyphicon-trash"></span>
                            </a>
                        </td>
                    </tr>
                """)))}),format.raw/*50.18*/("""

            """),format.raw/*52.13*/("""</tbody>
        </table>

        <p>
            <a href=""""),_display_(/*56.23*/routes/*56.29*/.HomeController.addAdmin()),format.raw/*56.55*/("""">
                <button class="btn btn-primary">Add a new Administrator</button>
            </a>
        </p>
    </div>
""")))}))
      }
    }
  }

  def render(admins:List[models.users.Admin],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(admins,user)

  def f:((List[models.users.Admin],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (admins,user) => apply(admins,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 27 21:14:18 GMT 2019
                  SOURCE: /home/ryan/Documents/2ndYearProject/app/views/admin.scala.html
                  HASH: aed6cbeb38ec8e7f9331fc152b2085f8481146bf
                  MATRIX: 651->1|1016->27|1168->87|1203->114|1241->115|1272->120|1337->224|1368->230|1408->262|1447->264|1482->273|1552->316|1566->321|1602->336|1638->345|1680->357|1713->363|2257->928|2302->946|2334->962|2374->964|2423->985|2484->1019|2494->1020|2524->1029|2586->1064|2596->1065|2625->1073|2687->1108|2697->1109|2727->1118|2789->1153|2799->1154|2829->1163|2981->1288|2996->1294|3056->1333|3377->1627|3392->1633|3452->1672|3732->1921|3774->1935|3862->1996|3877->2002|3924->2028
                  LINES: 24->1|29->2|34->3|34->3|34->3|35->4|38->7|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|45->14|60->29|61->30|61->30|61->30|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|70->39|70->39|70->39|76->45|76->45|76->45|81->50|83->52|87->56|87->56|87->56
                  -- GENERATED --
              */
          