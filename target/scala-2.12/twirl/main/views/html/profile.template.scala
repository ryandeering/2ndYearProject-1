
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
/*2.2*/import helper._

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[play.api.Environment,User,Form[models.users.User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(env: play.api.Environment,user: User, pf:Form[models.users.User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<html>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<style>
              input.hidden """),format.raw/*12.28*/("""{"""),format.raw/*12.29*/("""
    """),format.raw/*13.5*/("""position: absolute;
    left: -9999px;
"""),format.raw/*15.1*/("""}"""),format.raw/*15.2*/("""

"""),format.raw/*17.1*/("""#profile-image1 """),format.raw/*17.17*/("""{"""),format.raw/*17.18*/("""
    """),format.raw/*18.5*/("""cursor: pointer;
  
     width: 200px;
    height: 200px;
	border:2px solid #03b1ce ;"""),format.raw/*22.28*/("""}"""),format.raw/*22.29*/("""
	"""),format.raw/*23.2*/(""".tital"""),format.raw/*23.8*/("""{"""),format.raw/*23.9*/(""" """),format.raw/*23.10*/("""font-size:16px; font-weight:500;"""),format.raw/*23.42*/("""}"""),format.raw/*23.43*/("""
	 """),format.raw/*24.3*/(""".bot-border"""),format.raw/*24.14*/("""{"""),format.raw/*24.15*/(""" """),format.raw/*24.16*/("""border-bottom:1px #f8f8f8 solid;  margin:5px 0  5px 0"""),format.raw/*24.69*/("""}"""),format.raw/*24.70*/("""	

"""),format.raw/*26.1*/("""</style>


<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta charset="UTF-8"/>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="icon" type="image/png" href=""""),_display_(/*33.44*/routes/*33.50*/.Assets.versioned("images/favicon.png")),format.raw/*33.89*/("""">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		<style>
        .footer """),format.raw/*38.17*/("""{"""),format.raw/*38.18*/("""
  """),format.raw/*39.3*/("""position: fixed;
  left: 0;
  bottom: 0;
  width: 100%;
  background-color: red;
  color: white;
  text-align: center;"""),format.raw/*45.22*/("""}"""),format.raw/*45.23*/("""
		"""),format.raw/*46.3*/(""".sidecol """),format.raw/*46.12*/("""{"""),format.raw/*46.13*/(""" """),format.raw/*46.14*/("""font-weight: bold; background-color: steelblue; """),format.raw/*46.62*/("""}"""),format.raw/*46.63*/("""
		"""),format.raw/*47.3*/(""".sidecol h2 """),format.raw/*47.15*/("""{"""),format.raw/*47.16*/(""" """),format.raw/*47.17*/("""font-weight: bold; """),format.raw/*47.36*/("""}"""),format.raw/*47.37*/("""
		"""),format.raw/*48.3*/(""".midcol h1 """),format.raw/*48.14*/("""{"""),format.raw/*48.15*/(""" """),format.raw/*48.16*/("""margin-top: 2em; text-align: center; font-weight: bold; """),format.raw/*48.72*/("""}"""),format.raw/*48.73*/("""
		"""),format.raw/*49.3*/(""".midcol h3 """),format.raw/*49.14*/("""{"""),format.raw/*49.15*/(""" """),format.raw/*49.16*/("""text-align: center; color: steelblue; """),format.raw/*49.54*/("""}"""),format.raw/*49.55*/("""
		"""),format.raw/*50.3*/(""".redtext """),format.raw/*50.12*/("""{"""),format.raw/*50.13*/(""" """),format.raw/*50.14*/("""color: red; """),format.raw/*50.26*/("""}"""),format.raw/*50.27*/("""

		"""),format.raw/*52.3*/(""".navbar """),format.raw/*52.11*/("""{"""),format.raw/*52.12*/("""background-color: #2D2D2D; color: #A5A5A5 background-color: #2D2D2D; color: #A5A5A5; """),format.raw/*52.97*/("""}"""),format.raw/*52.98*/("""
		"""),format.raw/*53.3*/(""".sidecol """),format.raw/*53.12*/("""{"""),format.raw/*53.13*/("""background-color: #2D2D2D; color: #A5A5A5; """),format.raw/*53.56*/("""}"""),format.raw/*53.57*/("""
		"""),format.raw/*54.3*/(""".footer """),format.raw/*54.11*/("""{"""),format.raw/*54.12*/("""background-color: #2D2D2D; color: #A5A5A5; """),format.raw/*54.55*/("""}"""),format.raw/*54.56*/("""
		"""),format.raw/*55.3*/(""".sidebar """),format.raw/*55.12*/("""{"""),format.raw/*55.13*/(""" """),format.raw/*55.14*/("""width: 33%; float: right;"""),format.raw/*55.39*/("""}"""),format.raw/*55.40*/("""
		"""),format.raw/*56.3*/(""".dropdown """),format.raw/*56.13*/("""{"""),format.raw/*56.14*/("""  """),format.raw/*56.16*/("""}"""),format.raw/*56.17*/("""
		"""),format.raw/*57.3*/(""".navbar-right"""),format.raw/*57.16*/("""{"""),format.raw/*57.17*/("""  """),format.raw/*57.19*/("""}"""),format.raw/*57.20*/("""
		"""),format.raw/*58.3*/(""".headerImg """),format.raw/*58.14*/("""{"""),format.raw/*58.15*/(""" """),format.raw/*58.16*/("""width: 100%; text-align: center; """),format.raw/*58.49*/("""}"""),format.raw/*58.50*/("""





"""),format.raw/*64.1*/("""@charset "UTF-8";
/*
$content-width will be the max width of the content within the navigation bar.
$breakpoint determines at which width the media query breakpoint will take effect.
*/

body """),format.raw/*70.6*/("""{"""),format.raw/*70.7*/("""
  """),format.raw/*71.3*/("""background-color: ;
"""),format.raw/*72.1*/("""}"""),format.raw/*72.2*/("""
"""),format.raw/*73.1*/("""nav """),format.raw/*73.5*/("""{"""),format.raw/*73.6*/("""
  """),format.raw/*74.3*/("""float: right;
"""),format.raw/*75.1*/("""}"""),format.raw/*75.2*/("""
"""),format.raw/*76.1*/("""nav ul """),format.raw/*76.8*/("""{"""),format.raw/*76.9*/("""
  """),format.raw/*77.3*/("""list-style: none;
  margin: 0;
  padding: 0;
  padding-top: 0.4em;
  padding-bottom:0.4em;

"""),format.raw/*83.1*/("""}"""),format.raw/*83.2*/("""
"""),format.raw/*84.1*/("""nav ul li """),format.raw/*84.11*/("""{"""),format.raw/*84.12*/("""
  """),format.raw/*85.3*/("""float: left;
  position: relative;
"""),format.raw/*87.1*/("""}"""),format.raw/*87.2*/("""
"""),format.raw/*88.1*/("""nav ul li a """),format.raw/*88.13*/("""{"""),format.raw/*88.14*/("""
  """),format.raw/*89.3*/("""display: block;
  padding: 0 20px;
  line-height: 70px;
  background-color: #2D2D2D; color: #A5A5A5;
  text-decoration: none;
  /*
  The full path of this code is nav ul li a:not(:only-child):after. This means that the code will apply to any a tag in our nav list that is NOT an only child, aka any dropdown. The :after means it comes after the output of the tag. I’ve decided that to specify any nav item as a dropdown, it will be followed by a unicode arrow – ▾ (#9662).
  */
"""),format.raw/*97.1*/("""}"""),format.raw/*97.2*/("""
"""),format.raw/*98.1*/("""nav ul li a:hover """),format.raw/*98.19*/("""{"""),format.raw/*98.20*/("""
  """),format.raw/*99.3*/("""background-color: #2D2D2D; color: #A5A5A5;
"""),format.raw/*100.1*/("""}"""),format.raw/*100.2*/("""
"""),format.raw/*101.1*/("""nav ul li a:not(:only-child):after """),format.raw/*101.36*/("""{"""),format.raw/*101.37*/("""
  """),format.raw/*102.3*/("""padding-left: 4px;
  content: ' ▾';
"""),format.raw/*104.1*/("""}"""),format.raw/*104.2*/("""
"""),format.raw/*105.1*/("""nav ul li ul li """),format.raw/*105.17*/("""{"""),format.raw/*105.18*/("""
  """),format.raw/*106.3*/("""min-width: 190px;
"""),format.raw/*107.1*/("""}"""),format.raw/*107.2*/("""
"""),format.raw/*108.1*/("""nav ul li ul li a """),format.raw/*108.19*/("""{"""),format.raw/*108.20*/("""
  """),format.raw/*109.3*/("""padding: 15px;
  line-height: 20px;
"""),format.raw/*111.1*/("""}"""),format.raw/*111.2*/("""

"""),format.raw/*113.1*/(""".nav-dropdown """),format.raw/*113.15*/("""{"""),format.raw/*113.16*/("""
  """),format.raw/*114.3*/("""position: absolute;
  z-index: 1;
  /* Guarantees that the dropdown will display on top of any content. */
  box-shadow: 0 3px 12px rgba(0, 0, 0, 0.15);
  display: none;
"""),format.raw/*119.1*/("""}"""),format.raw/*119.2*/("""

"""),format.raw/*121.1*/(""".nav-mobile """),format.raw/*121.13*/("""{"""),format.raw/*121.14*/("""
  """),format.raw/*122.3*/("""display: none;
  position: absolute;
  top: 0;
  right: 0;
  background-color: #2D2D2D; color: #A5A5A5;
  height: 70px;
  width: 70px;
"""),format.raw/*129.1*/("""}"""),format.raw/*129.2*/("""

"""),format.raw/*131.1*/("""@media only screen and (max-width: 800px) """),format.raw/*131.44*/("""{"""),format.raw/*131.45*/("""

  """),format.raw/*133.3*/(""".brand"""),format.raw/*133.9*/("""{"""),format.raw/*133.10*/("""
  """),format.raw/*134.3*/("""padding-top: 10px !important;
  padding-left: 20px !important;
   position: absolute !important;
  float: left !important;
  line-height: 70px !important;
  text-transform: uppercase !important;
  font-size: 1.4em !important;
  """),format.raw/*141.3*/("""}"""),format.raw/*141.4*/("""

  """),format.raw/*143.3*/(""".nav-mobile """),format.raw/*143.15*/("""{"""),format.raw/*143.16*/("""
    """),format.raw/*144.5*/("""display: block;
  """),format.raw/*145.3*/("""}"""),format.raw/*145.4*/("""

  """),format.raw/*147.3*/("""nav """),format.raw/*147.7*/("""{"""),format.raw/*147.8*/("""
  	"""),format.raw/*148.4*/("""background-color: #2D2D2D; color: #A5A5A5;
    width: 100%;
    padding: 70px 0 15px;
  """),format.raw/*151.3*/("""}"""),format.raw/*151.4*/("""
  """),format.raw/*152.3*/("""nav ul """),format.raw/*152.10*/("""{"""),format.raw/*152.11*/("""
    """),format.raw/*153.5*/("""display: none;
  """),format.raw/*154.3*/("""}"""),format.raw/*154.4*/("""
  """),format.raw/*155.3*/("""nav ul li """),format.raw/*155.13*/("""{"""),format.raw/*155.14*/("""
    """),format.raw/*156.5*/("""float: none;
    padding-left: 2em;
  """),format.raw/*158.3*/("""}"""),format.raw/*158.4*/("""
  """),format.raw/*159.3*/("""nav ul li a """),format.raw/*159.15*/("""{"""),format.raw/*159.16*/("""
    """),format.raw/*160.5*/("""padding: 15px;
    line-height: 20px;
  """),format.raw/*162.3*/("""}"""),format.raw/*162.4*/("""
  """),format.raw/*163.3*/("""nav ul li ul li a """),format.raw/*163.21*/("""{"""),format.raw/*163.22*/("""
    """),format.raw/*164.5*/("""padding-left: 30px;
  """),format.raw/*165.3*/("""}"""),format.raw/*165.4*/("""
"""),format.raw/*166.1*/("""}"""),format.raw/*166.2*/("""
"""),format.raw/*167.1*/("""#nav-toggle """),format.raw/*167.13*/("""{"""),format.raw/*167.14*/("""
  """),format.raw/*168.3*/("""position: absolute;
  left: 18px;
  top: 22px;
  cursor: pointer;
  padding: 10px 35px 16px 0px;
"""),format.raw/*173.1*/("""}"""),format.raw/*173.2*/("""
"""),format.raw/*174.1*/("""#nav-toggle span,
#nav-toggle span:before,
#nav-toggle span:after """),format.raw/*176.24*/("""{"""),format.raw/*176.25*/("""
  """),format.raw/*177.3*/("""cursor: pointer;
  border-radius: 1px;
  height: 5px;
  width: 35px;
  background: #463f3f;
  position: absolute;
  display: block;
  content: '';
  transition: all 300ms ease-in-out;
"""),format.raw/*186.1*/("""}"""),format.raw/*186.2*/("""
"""),format.raw/*187.1*/("""#nav-toggle span:before """),format.raw/*187.25*/("""{"""),format.raw/*187.26*/("""
  """),format.raw/*188.3*/("""top: -10px;
"""),format.raw/*189.1*/("""}"""),format.raw/*189.2*/("""
"""),format.raw/*190.1*/("""#nav-toggle span:after """),format.raw/*190.24*/("""{"""),format.raw/*190.25*/("""
  """),format.raw/*191.3*/("""bottom: -10px;
"""),format.raw/*192.1*/("""}"""),format.raw/*192.2*/("""
"""),format.raw/*193.1*/("""#nav-toggle.active span """),format.raw/*193.25*/("""{"""),format.raw/*193.26*/("""
  """),format.raw/*194.3*/("""background-color: transparent;
"""),format.raw/*195.1*/("""}"""),format.raw/*195.2*/("""
"""),format.raw/*196.1*/("""#nav-toggle.active span:before, #nav-toggle.active span:after """),format.raw/*196.63*/("""{"""),format.raw/*196.64*/("""
  """),format.raw/*197.3*/("""top: 0;
"""),format.raw/*198.1*/("""}"""),format.raw/*198.2*/("""
"""),format.raw/*199.1*/("""#nav-toggle.active span:before """),format.raw/*199.32*/("""{"""),format.raw/*199.33*/("""
  """),format.raw/*200.3*/("""transform: rotate(45deg);
"""),format.raw/*201.1*/("""}"""),format.raw/*201.2*/("""
"""),format.raw/*202.1*/("""#nav-toggle.active span:after """),format.raw/*202.31*/("""{"""),format.raw/*202.32*/("""
  """),format.raw/*203.3*/("""transform: rotate(-45deg);
"""),format.raw/*204.1*/("""}"""),format.raw/*204.2*/("""

"""),format.raw/*206.1*/("""@media screen and (min-width: 800px) """),format.raw/*206.39*/("""{"""),format.raw/*206.40*/("""

  """),format.raw/*208.3*/(""".brand"""),format.raw/*208.9*/("""{"""),format.raw/*208.10*/("""
  """),format.raw/*209.3*/("""padding-top: 1px !important;
  """),format.raw/*210.3*/("""}"""),format.raw/*210.4*/("""

  """),format.raw/*212.3*/(""".nav-list """),format.raw/*212.13*/("""{"""),format.raw/*212.14*/("""
    """),format.raw/*213.5*/("""display: block !important;
  """),format.raw/*214.3*/("""}"""),format.raw/*214.4*/("""


"""),format.raw/*217.1*/("""}"""),format.raw/*217.2*/("""
"""),format.raw/*218.1*/("""/*
.navigation – the outer wrapper for the navbar. Specifies the height and color, and will stretch the full width of the viewport.
*/
.navigation """),format.raw/*221.13*/("""{"""),format.raw/*221.14*/("""
  """),format.raw/*222.3*/("""height: 62px;
 background-color: #2D2D2D; color: #A5A5A5;
"""),format.raw/*224.1*/("""}"""),format.raw/*224.2*/("""

"""),format.raw/*226.1*/("""/*
.nav-container – the inner wrapper for the navbar. Defines how far the actual content should stretch.
*/
.nav-container """),format.raw/*229.16*/("""{"""),format.raw/*229.17*/("""
  """),format.raw/*230.3*/("""max-width: 1000px;
  margin: 0 auto;
"""),format.raw/*232.1*/("""}"""),format.raw/*232.2*/("""

"""),format.raw/*234.1*/(""".brand """),format.raw/*234.8*/("""{"""),format.raw/*234.9*/("""
  """),format.raw/*235.3*/("""position: relative;
  overflow: auto;
  float: left;
  line-height: 70px;
  text-transform: uppercase;
  font-size: 1.4em;
"""),format.raw/*241.1*/("""}"""),format.raw/*241.2*/("""
"""),format.raw/*242.1*/(""".brand a,
.brand a:visited """),format.raw/*243.18*/("""{"""),format.raw/*243.19*/("""

  """),format.raw/*245.3*/("""text-decoration: none;
"""),format.raw/*246.1*/("""}"""),format.raw/*246.2*/("""

        """),format.raw/*248.9*/("""</style>
		<title>CDR Games Profile</title>
	</head>

<center>
<div class="container" style=" margin: 0 auto; text-align: left;">
	<div class="row">
		
        
        
       <div class="col-md-7 ">

<div class="panel panel-default">
  <div class="panel-heading">  <h4 >User Profile</h4></div>
   <div class="panel-body">
       """),_display_(/*263.9*/form(action = helper.CSRF(routes.HomeController.changeProfilePic()), 'enctype -> "multipart/form-data")/*263.112*/ {_display_(Seq[Any](format.raw/*263.114*/("""
    """),format.raw/*264.5*/("""<div class="box box-info">
        """),format.raw/*265.27*/("""
            """),format.raw/*266.13*/("""<div class="box-body">
                     <div class="col-sm-6">
                         """),_display_(/*268.27*/if(env.resource("public/images/profileImages/" + user.getEmail + ".jpg").isDefined)/*268.110*/ {_display_(Seq[Any](format.raw/*268.112*/("""
                             """),format.raw/*269.30*/("""<div  align="center"> <img alt="User Pic" src="/assets/images/profileImages/"""),_display_(/*269.107*/(user.getEmail)),format.raw/*269.122*/(""".jpg" id="profile-image1" class="img-circle img-responsive">
                         """)))}/*270.28*/else/*270.33*/{_display_(Seq[Any](format.raw/*270.34*/("""
                             """),format.raw/*271.30*/("""<div  align="center"> <img alt="User Pic" src="https://x1.xingassets.com/assets/frontend_minified/img/users/nobody_m.original.jpg" id="profile-image1" class="img-circle img-responsive">
                                 """)))}),format.raw/*272.35*/("""
                                """),format.raw/*273.33*/("""Change your profile picture here!

                         <input class="btn-sm btn-default" type="file" name="upload">
                         <div class="actions">
                             <input type="submit" value="Change pic" class="btn btn-primary">
                             """)))}),format.raw/*278.31*/("""
"""),format.raw/*279.1*/("""<div style="color:#999;" ></div>

   <div class="col-sm-10" ><a href =""""),_display_(/*281.39*/routes/*281.45*/.HomeController.changePassword()),format.raw/*281.77*/(""""> Change your password here! </a></div>
                
                     
                     
                     </div>
              
              <br>




              <!-- /input-group -->
            </div>
            <div class="col-sm-6">
            <h4 style="color:#00b1b1;">"""),_display_(/*295.41*/user/*295.45*/.getfName()),format.raw/*295.56*/(""" """),_display_(/*295.58*/user/*295.62*/.getlName()),format.raw/*295.73*/("""</h4></span>
              <span><p>"""),_display_(/*296.25*/user/*296.29*/.getRole()),format.raw/*296.39*/("""</p></span>            
            </div>
            <div class="clearfix"></div>
            <hr style="margin:5px 0 5px 0;">

              
<div class="col-sm-5 col-xs-6 tital " >First Name:</div><div class="col-sm-7 col-xs-6 ">"""),_display_(/*302.90*/if(user!=null)/*302.104*/{_display_(_display_(/*302.106*/user/*302.110*/.getfName()))}),format.raw/*302.122*/("""</div>
     <div class="clearfix"></div>
<div class="bot-border"></div>

<div class="col-sm-5 col-xs-6 tital " >Last Name:</div><div class="col-sm-7">"""),_display_(/*306.79*/if(user!=null)/*306.93*/{_display_(_display_(/*306.95*/user/*306.99*/.getlName()))}),format.raw/*306.111*/("""</div>
  <div class="clearfix"></div>
<div class="bot-border"></div>

<div class="col-sm-5 col-xs-6 tital " >Email:</div><div class="col-sm-7">"""),_display_(/*310.75*/if(user!=null)/*310.89*/{_display_(_display_(/*310.91*/user/*310.95*/.getEmail))}),format.raw/*310.105*/("""</div>
  <div class="clearfix"></div>
<div class="bot-border"></div>

<div class="col-sm-5 col-xs-6 tital " >Address:</div><div class="col-sm-7">"""),_display_(/*314.77*/if(user!=null)/*314.91*/{_display_(_display_(/*314.93*/user/*314.97*/.getAddress))}),format.raw/*314.109*/("""</div>

 <div class="clearfix"></div>
<div class="bot-border"> <center><a href=""""),_display_(/*317.44*/routes/*317.50*/.ProductCtrl.listProducts(0)),format.raw/*317.78*/("""">
						<i class="fa fa-user-circle-o"></i>
						Go back to Store</span>

					</a></center></div>



            <!-- /.box-body -->
          </div>
          <!-- /.box -->

        </div>
       
            
    </div> 
    </div>
</div>  

  

       
       
       
       
       
       
       
       
   </div>
</div>
</center>

</html>"""))
      }
    }
  }

  def render(env:play.api.Environment,user:User,pf:Form[models.users.User]): play.twirl.api.HtmlFormat.Appendable = apply(env,user,pf)

  def f:((play.api.Environment,User,Form[models.users.User]) => play.twirl.api.HtmlFormat.Appendable) = (env,user,pf) => apply(env,user,pf)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 07 12:28:05 IST 2019
                  SOURCE: /run/media/ryan/BEECC945ECC8F923/dsad/2ndYearProject2/app/views/profile.scala.html
                  HASH: dc854a95c8753a49c502f3c11a89afe22b979ba9
                  MATRIX: 651->1|683->27|1048->45|1208->112|1235->113|1624->474|1653->475|1685->480|1751->519|1779->520|1808->522|1852->538|1881->539|1913->544|2026->629|2055->630|2084->632|2117->638|2145->639|2174->640|2234->672|2263->673|2293->676|2332->687|2361->688|2390->689|2471->742|2500->743|2530->746|2820->1009|2835->1015|2895->1054|3254->1385|3283->1386|3313->1389|3459->1507|3488->1508|3518->1511|3555->1520|3584->1521|3613->1522|3689->1570|3718->1571|3748->1574|3788->1586|3817->1587|3846->1588|3893->1607|3922->1608|3952->1611|3991->1622|4020->1623|4049->1624|4133->1680|4162->1681|4192->1684|4231->1695|4260->1696|4289->1697|4355->1735|4384->1736|4414->1739|4451->1748|4480->1749|4509->1750|4549->1762|4578->1763|4609->1767|4645->1775|4674->1776|4787->1861|4816->1862|4846->1865|4883->1874|4912->1875|4983->1918|5012->1919|5042->1922|5078->1930|5107->1931|5178->1974|5207->1975|5237->1978|5274->1987|5303->1988|5332->1989|5385->2014|5414->2015|5444->2018|5482->2028|5511->2029|5541->2031|5570->2032|5600->2035|5641->2048|5670->2049|5700->2051|5729->2052|5759->2055|5798->2066|5827->2067|5856->2068|5917->2101|5946->2102|5979->2108|6198->2301|6226->2302|6256->2305|6303->2325|6331->2326|6359->2327|6390->2331|6418->2332|6448->2335|6489->2349|6517->2350|6545->2351|6579->2358|6607->2359|6637->2362|6756->2454|6784->2455|6812->2456|6850->2466|6879->2467|6909->2470|6971->2505|6999->2506|7027->2507|7067->2519|7096->2520|7126->2523|7631->3001|7659->3002|7687->3003|7733->3021|7762->3022|7792->3025|7863->3068|7892->3069|7921->3070|7985->3105|8015->3106|8046->3109|8110->3145|8139->3146|8168->3147|8213->3163|8243->3164|8274->3167|8320->3185|8349->3186|8378->3187|8425->3205|8455->3206|8486->3209|8550->3245|8579->3246|8609->3248|8652->3262|8682->3263|8713->3266|8911->3436|8940->3437|8970->3439|9011->3451|9041->3452|9072->3455|9235->3590|9264->3591|9294->3593|9365->3636|9395->3637|9427->3641|9461->3647|9491->3648|9522->3651|9778->3879|9807->3880|9839->3884|9880->3896|9910->3897|9943->3902|9989->3920|10018->3921|10050->3925|10082->3929|10111->3930|10143->3934|10259->4022|10288->4023|10319->4026|10355->4033|10385->4034|10418->4039|10463->4056|10492->4057|10523->4060|10562->4070|10592->4071|10625->4076|10691->4114|10720->4115|10751->4118|10792->4130|10822->4131|10855->4136|10923->4176|10952->4177|10983->4180|11030->4198|11060->4199|11093->4204|11143->4226|11172->4227|11201->4228|11230->4229|11259->4230|11300->4242|11330->4243|11361->4246|11486->4343|11515->4344|11544->4345|11639->4411|11669->4412|11700->4415|11912->4599|11941->4600|11970->4601|12023->4625|12053->4626|12084->4629|12124->4641|12153->4642|12182->4643|12234->4666|12264->4667|12295->4670|12338->4685|12367->4686|12396->4687|12449->4711|12479->4712|12510->4715|12569->4746|12598->4747|12627->4748|12718->4810|12748->4811|12779->4814|12815->4822|12844->4823|12873->4824|12933->4855|12963->4856|12994->4859|13048->4885|13077->4886|13106->4887|13165->4917|13195->4918|13226->4921|13281->4948|13310->4949|13340->4951|13406->4989|13436->4990|13468->4994|13502->5000|13532->5001|13563->5004|13622->5035|13651->5036|13683->5040|13722->5050|13752->5051|13785->5056|13842->5085|13871->5086|13902->5089|13931->5090|13960->5091|14136->5238|14166->5239|14197->5242|14283->5300|14312->5301|14342->5303|14494->5426|14524->5427|14555->5430|14620->5467|14649->5468|14679->5470|14714->5477|14743->5478|14774->5481|14925->5604|14954->5605|14983->5606|15039->5633|15069->5634|15101->5638|15152->5661|15181->5662|15219->5672|15578->6004|15692->6107|15734->6109|15767->6114|15831->6167|15873->6180|15994->6273|16088->6356|16130->6358|16189->6388|16295->6465|16333->6480|16440->6568|16454->6573|16494->6574|16553->6604|16805->6824|16867->6857|17191->7149|17220->7150|17320->7222|17336->7228|17390->7260|17716->7558|17730->7562|17763->7573|17793->7575|17807->7579|17840->7590|17905->7627|17919->7631|17951->7641|18213->7875|18238->7889|18270->7891|18285->7895|18322->7907|18501->8058|18525->8072|18556->8074|18570->8078|18607->8090|18779->8234|18803->8248|18834->8250|18848->8254|18883->8264|19057->8410|19081->8424|19112->8426|19126->8430|19163->8442|19272->8523|19288->8529|19338->8557
                  LINES: 24->1|25->2|30->4|35->5|36->6|42->12|42->12|43->13|45->15|45->15|47->17|47->17|47->17|48->18|52->22|52->22|53->23|53->23|53->23|53->23|53->23|53->23|54->24|54->24|54->24|54->24|54->24|54->24|56->26|63->33|63->33|63->33|68->38|68->38|69->39|75->45|75->45|76->46|76->46|76->46|76->46|76->46|76->46|77->47|77->47|77->47|77->47|77->47|77->47|78->48|78->48|78->48|78->48|78->48|78->48|79->49|79->49|79->49|79->49|79->49|79->49|80->50|80->50|80->50|80->50|80->50|80->50|82->52|82->52|82->52|82->52|82->52|83->53|83->53|83->53|83->53|83->53|84->54|84->54|84->54|84->54|84->54|85->55|85->55|85->55|85->55|85->55|85->55|86->56|86->56|86->56|86->56|86->56|87->57|87->57|87->57|87->57|87->57|88->58|88->58|88->58|88->58|88->58|88->58|94->64|100->70|100->70|101->71|102->72|102->72|103->73|103->73|103->73|104->74|105->75|105->75|106->76|106->76|106->76|107->77|113->83|113->83|114->84|114->84|114->84|115->85|117->87|117->87|118->88|118->88|118->88|119->89|127->97|127->97|128->98|128->98|128->98|129->99|130->100|130->100|131->101|131->101|131->101|132->102|134->104|134->104|135->105|135->105|135->105|136->106|137->107|137->107|138->108|138->108|138->108|139->109|141->111|141->111|143->113|143->113|143->113|144->114|149->119|149->119|151->121|151->121|151->121|152->122|159->129|159->129|161->131|161->131|161->131|163->133|163->133|163->133|164->134|171->141|171->141|173->143|173->143|173->143|174->144|175->145|175->145|177->147|177->147|177->147|178->148|181->151|181->151|182->152|182->152|182->152|183->153|184->154|184->154|185->155|185->155|185->155|186->156|188->158|188->158|189->159|189->159|189->159|190->160|192->162|192->162|193->163|193->163|193->163|194->164|195->165|195->165|196->166|196->166|197->167|197->167|197->167|198->168|203->173|203->173|204->174|206->176|206->176|207->177|216->186|216->186|217->187|217->187|217->187|218->188|219->189|219->189|220->190|220->190|220->190|221->191|222->192|222->192|223->193|223->193|223->193|224->194|225->195|225->195|226->196|226->196|226->196|227->197|228->198|228->198|229->199|229->199|229->199|230->200|231->201|231->201|232->202|232->202|232->202|233->203|234->204|234->204|236->206|236->206|236->206|238->208|238->208|238->208|239->209|240->210|240->210|242->212|242->212|242->212|243->213|244->214|244->214|247->217|247->217|248->218|251->221|251->221|252->222|254->224|254->224|256->226|259->229|259->229|260->230|262->232|262->232|264->234|264->234|264->234|265->235|271->241|271->241|272->242|273->243|273->243|275->245|276->246|276->246|278->248|293->263|293->263|293->263|294->264|295->265|296->266|298->268|298->268|298->268|299->269|299->269|299->269|300->270|300->270|300->270|301->271|302->272|303->273|308->278|309->279|311->281|311->281|311->281|325->295|325->295|325->295|325->295|325->295|325->295|326->296|326->296|326->296|332->302|332->302|332->302|332->302|332->302|336->306|336->306|336->306|336->306|336->306|340->310|340->310|340->310|340->310|340->310|344->314|344->314|344->314|344->314|344->314|347->317|347->317|347->317
                  -- GENERATED --
              */
          