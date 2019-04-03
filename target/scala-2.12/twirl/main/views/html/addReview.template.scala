
package views.html

import java.lang._

import controllers._
import models.reviews.Review
import models.users.User
import play.core.j.PlayFormsMagicForJava._
import play.core.j.PlayMagicForJava._
import play.data._
import play.mvc.Http.Context.Implicit._

object addReview extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[Review],User,Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(reviewForm: Form[Review], user: User, prodId: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*4.54*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main("Add a Review",user)/*7.27*/ {_display_(Seq[Any](format.raw/*7.29*/("""
    """),format.raw/*8.5*/("""<p class="lead">Create a Review</p>
    """),_display_(/*9.6*/if(flash.containsKey("error"))/*9.36*/ {_display_(Seq[Any](format.raw/*9.38*/("""
        """),format.raw/*10.9*/("""<div class="alert alert-danger">
        """),_display_(/*11.10*/flash/*11.15*/.get("error")),format.raw/*11.28*/("""
        """),format.raw/*12.9*/("""</div>
    """)))}),format.raw/*13.6*/("""

    """),_display_(/*15.6*/form(action=routes.HomeController.addReviewSubmit(prodId), 'class -> "form-horizontal", 'role -> "form",'enctype -> "multipart/form-data")/*15.144*/ {_display_(Seq[Any](format.raw/*15.146*/("""
        """),format.raw/*16.37*/("""
        """),_display_(/*17.10*/CSRF/*17.14*/.formField),format.raw/*17.24*/("""
        """),_display_(/*18.10*/inputText(reviewForm("rating"), '_label -> "Rating (1-5), numerical characters accepted ONLY.", 'class -> "form-control")),format.raw/*18.131*/("""
        """),_display_(/*19.10*/textarea(reviewForm("content"), '_label -> "Content", 'class -> "form-control")),format.raw/*19.89*/("""

        """),format.raw/*21.9*/("""<div class="actions">
            <input type="submit" value="Submit" class="btn-md btn-default btn">
            <a href=""""),_display_(/*23.23*/routes/*23.29*/.HomeController.product(prodId, "")),format.raw/*23.64*/("""">
                <button type="button" class="btn-md btn-default btn">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*27.6*/("""
""")))}))
      }
    }
  }

  def render(reviewForm:Form[Review],user:User,prodId:Long): play.twirl.api.HtmlFormat.Appendable = apply(reviewForm,user,prodId)

  def f:((Form[Review],User,Long) => play.twirl.api.HtmlFormat.Appendable) = (reviewForm,user,prodId) => apply(reviewForm,user,prodId)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 03 23:20:41 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/a/2ndYearProject/app/views/addReview.scala.html
                  HASH: c9a4296f40a99d90c96cfe31b31fc03493b3bd96
                  MATRIX: 651->1|689->34|725->65|1074->92|1199->147|1244->144|1272->164|1300->167|1333->192|1372->194|1404->200|1471->242|1509->272|1548->274|1585->284|1655->327|1669->332|1703->345|1740->355|1783->368|1818->377|1966->515|2007->517|2045->555|2083->566|2096->570|2127->580|2165->591|2308->712|2346->723|2446->802|2485->814|2638->940|2653->946|2709->981|2868->1110
                  LINES: 24->1|25->2|26->3|31->4|34->5|37->4|38->6|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|45->13|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|50->18|51->19|51->19|53->21|55->23|55->23|55->23|59->27
                  -- GENERATED --
              */
          