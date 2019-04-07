
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
/*1.2*/import models.products.Product
/*2.2*/import models.reviews.Review
/*3.2*/import models.users.User

object addReview extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[Review],User,Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(reviewForm: Form[Review], user: User, prodId: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*6.1*/("""
"""),_display_(/*7.2*/main("Add a Review",user)/*7.27*/ {_display_(Seq[Any](format.raw/*7.29*/("""
    """),format.raw/*8.5*/("""<p class="lead">Create a Review</p>
    """),_display_(/*9.6*/if(flash.containsKey("error"))/*9.36*/ {_display_(Seq[Any](format.raw/*9.38*/("""
        """),format.raw/*10.9*/("""<div class="alert alert-danger">
        """),_display_(/*11.10*/flash/*11.15*/.get("error")),format.raw/*11.28*/("""
        """),format.raw/*12.9*/("""</div>
    """)))}),format.raw/*13.6*/("""

        """),_display_(/*15.10*/form(action=routes.HomeController.addReviewSubmit(prodId), 'class -> "form-horizontal", 'role -> "form",'enctype -> "multipart/form-data")/*15.148*/ {_display_(Seq[Any](format.raw/*15.150*/("""
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
                  DATE: Sun Apr 07 12:28:04 IST 2019
                  SOURCE: /run/media/ryan/BEECC945ECC8F923/dsad/2ndYearProject2/app/views/addReview.scala.html
                  HASH: 9aee0b7846b9dfe5daec2a63788ce60a9dee055c
                  MATRIX: 651->1|689->33|725->63|1074->89|1199->143|1243->159|1270->161|1303->186|1342->188|1373->193|1439->234|1477->264|1516->266|1552->275|1621->317|1635->322|1669->335|1705->344|1747->356|1785->367|1933->505|1974->507|2011->544|2048->554|2061->558|2092->568|2129->578|2272->699|2309->709|2409->788|2446->798|2597->922|2612->928|2668->963|2823->1088
                  LINES: 24->1|25->2|26->3|31->4|34->5|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|44->13|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|49->18|50->19|50->19|52->21|54->23|54->23|54->23|58->27
                  -- GENERATED --
              */
          