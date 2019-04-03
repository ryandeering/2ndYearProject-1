
package views.html

import models.users.User

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.14*/("""
"""),_display_(/*3.2*/main("Home", user)/*3.20*/{_display_(Seq[Any](format.raw/*3.21*/("""
    """),format.raw/*4.5*/("""<h1>Meowdy.</h1>
""")))}))
      }
    }
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 03 23:20:42 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/a/2ndYearProject/app/views/index.scala.html
                  HASH: 6c36231bb8c45fbc686fe1b9684b173c1a43fa81
                  MATRIX: 651->1|978->28|1085->40|1113->43|1139->61|1177->62|1209->68
                  LINES: 24->1|29->2|34->2|35->3|35->3|35->3|36->4
                  -- GENERATED --
              */
          