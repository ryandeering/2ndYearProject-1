
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

object admin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.users.Admin],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(admins: List[models.users.Admin],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.60*/("""
"""),_display_(/*3.2*/main("Administrators",user)/*3.29*/{_display_(Seq[Any](format.raw/*3.30*/("""
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
                  DATE: Thu Mar 28 18:31:19 GMT 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/app/views/AdminPanel/admin.scala.html
                  HASH: f41470ee70e5b2778bb580665558136e75fae619
                  MATRIX: 662->1|1027->28|1180->86|1208->89|1243->116|1281->117|1313->123|1381->230|1413->237|1453->269|1492->271|1528->281|1599->325|1613->330|1649->345|1686->355|1729->368|1764->376|2323->956|2369->975|2401->991|2441->993|2491->1015|2553->1050|2563->1051|2593->1060|2656->1096|2666->1097|2695->1105|2758->1141|2768->1142|2798->1151|2861->1187|2871->1188|2901->1197|3057->1326|3072->1332|3132->1371|3459->1671|3474->1677|3534->1716|3819->1970|3863->1986|3955->2051|3970->2057|4017->2083
                  LINES: 24->1|29->2|34->2|35->3|35->3|35->3|36->4|39->7|40->8|40->8|40->8|41->9|42->10|42->10|42->10|43->11|44->12|46->14|61->29|62->30|62->30|62->30|63->31|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|71->39|71->39|71->39|77->45|77->45|77->45|82->50|84->52|88->56|88->56|88->56
                  -- GENERATED --
              */
          