
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

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<html>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<style>
              input.hidden """),format.raw/*10.28*/("""{"""),format.raw/*10.29*/("""
    """),format.raw/*11.5*/("""position: absolute;
    left: -9999px;
"""),format.raw/*13.1*/("""}"""),format.raw/*13.2*/("""

"""),format.raw/*15.1*/("""#profile-image1 """),format.raw/*15.17*/("""{"""),format.raw/*15.18*/("""
    """),format.raw/*16.5*/("""cursor: pointer;
  
     width: 200px;
    height: 200px;
	border:2px solid #03b1ce ;"""),format.raw/*20.28*/("""}"""),format.raw/*20.29*/("""
	"""),format.raw/*21.2*/(""".tital"""),format.raw/*21.8*/("""{"""),format.raw/*21.9*/(""" """),format.raw/*21.10*/("""font-size:16px; font-weight:500;"""),format.raw/*21.42*/("""}"""),format.raw/*21.43*/("""
	 """),format.raw/*22.3*/(""".bot-border"""),format.raw/*22.14*/("""{"""),format.raw/*22.15*/(""" """),format.raw/*22.16*/("""border-bottom:1px #f8f8f8 solid;  margin:5px 0  5px 0"""),format.raw/*22.69*/("""}"""),format.raw/*22.70*/("""	

"""),format.raw/*24.1*/("""</style>


<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta charset="UTF-8"/>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="icon" type="image/png" href=""""),_display_(/*31.44*/routes/*31.50*/.Assets.versioned("images/favicon.png")),format.raw/*31.89*/("""">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		<style>
        .footer """),format.raw/*36.17*/("""{"""),format.raw/*36.18*/("""
  """),format.raw/*37.3*/("""position: fixed;
  left: 0;
  bottom: 0;
  width: 100%;
  background-color: red;
  color: white;
  text-align: center;"""),format.raw/*43.22*/("""}"""),format.raw/*43.23*/("""
		"""),format.raw/*44.3*/(""".sidecol """),format.raw/*44.12*/("""{"""),format.raw/*44.13*/(""" """),format.raw/*44.14*/("""font-weight: bold; background-color: steelblue; """),format.raw/*44.62*/("""}"""),format.raw/*44.63*/("""
		"""),format.raw/*45.3*/(""".sidecol h2 """),format.raw/*45.15*/("""{"""),format.raw/*45.16*/(""" """),format.raw/*45.17*/("""font-weight: bold; """),format.raw/*45.36*/("""}"""),format.raw/*45.37*/("""
		"""),format.raw/*46.3*/(""".midcol h1 """),format.raw/*46.14*/("""{"""),format.raw/*46.15*/(""" """),format.raw/*46.16*/("""margin-top: 2em; text-align: center; font-weight: bold; """),format.raw/*46.72*/("""}"""),format.raw/*46.73*/("""
		"""),format.raw/*47.3*/(""".midcol h3 """),format.raw/*47.14*/("""{"""),format.raw/*47.15*/(""" """),format.raw/*47.16*/("""text-align: center; color: steelblue; """),format.raw/*47.54*/("""}"""),format.raw/*47.55*/("""
		"""),format.raw/*48.3*/(""".redtext """),format.raw/*48.12*/("""{"""),format.raw/*48.13*/(""" """),format.raw/*48.14*/("""color: red; """),format.raw/*48.26*/("""}"""),format.raw/*48.27*/("""

		"""),format.raw/*50.3*/(""".navbar """),format.raw/*50.11*/("""{"""),format.raw/*50.12*/("""background-color: #2D2D2D; color: #A5A5A5 background-color: #2D2D2D; color: #A5A5A5; """),format.raw/*50.97*/("""}"""),format.raw/*50.98*/("""
		"""),format.raw/*51.3*/(""".sidecol """),format.raw/*51.12*/("""{"""),format.raw/*51.13*/("""background-color: #2D2D2D; color: #A5A5A5; """),format.raw/*51.56*/("""}"""),format.raw/*51.57*/("""
		"""),format.raw/*52.3*/(""".footer """),format.raw/*52.11*/("""{"""),format.raw/*52.12*/("""background-color: #2D2D2D; color: #A5A5A5; """),format.raw/*52.55*/("""}"""),format.raw/*52.56*/("""
		"""),format.raw/*53.3*/(""".sidebar """),format.raw/*53.12*/("""{"""),format.raw/*53.13*/(""" """),format.raw/*53.14*/("""width: 33%; float: right;"""),format.raw/*53.39*/("""}"""),format.raw/*53.40*/("""
		"""),format.raw/*54.3*/(""".dropdown """),format.raw/*54.13*/("""{"""),format.raw/*54.14*/("""  """),format.raw/*54.16*/("""}"""),format.raw/*54.17*/("""
		"""),format.raw/*55.3*/(""".navbar-right"""),format.raw/*55.16*/("""{"""),format.raw/*55.17*/("""  """),format.raw/*55.19*/("""}"""),format.raw/*55.20*/("""
		"""),format.raw/*56.3*/(""".headerImg """),format.raw/*56.14*/("""{"""),format.raw/*56.15*/(""" """),format.raw/*56.16*/("""width: 100%; text-align: center; """),format.raw/*56.49*/("""}"""),format.raw/*56.50*/("""





"""),format.raw/*62.1*/("""@charset "UTF-8";
/*
$content-width will be the max width of the content within the navigation bar.
$breakpoint determines at which width the media query breakpoint will take effect.
*/

body """),format.raw/*68.6*/("""{"""),format.raw/*68.7*/("""
  """),format.raw/*69.3*/("""background-color: ;
"""),format.raw/*70.1*/("""}"""),format.raw/*70.2*/("""
"""),format.raw/*71.1*/("""nav """),format.raw/*71.5*/("""{"""),format.raw/*71.6*/("""
  """),format.raw/*72.3*/("""float: right;
"""),format.raw/*73.1*/("""}"""),format.raw/*73.2*/("""
"""),format.raw/*74.1*/("""nav ul """),format.raw/*74.8*/("""{"""),format.raw/*74.9*/("""
  """),format.raw/*75.3*/("""list-style: none;
  margin: 0;
  padding: 0;
  padding-top: 0.4em;
  padding-bottom:0.4em;

"""),format.raw/*81.1*/("""}"""),format.raw/*81.2*/("""
"""),format.raw/*82.1*/("""nav ul li """),format.raw/*82.11*/("""{"""),format.raw/*82.12*/("""
  """),format.raw/*83.3*/("""float: left;
  position: relative;
"""),format.raw/*85.1*/("""}"""),format.raw/*85.2*/("""
"""),format.raw/*86.1*/("""nav ul li a """),format.raw/*86.13*/("""{"""),format.raw/*86.14*/("""
  """),format.raw/*87.3*/("""display: block;
  padding: 0 20px;
  line-height: 70px;
  background-color: #2D2D2D; color: #A5A5A5;
  text-decoration: none;
  /*
  The full path of this code is nav ul li a:not(:only-child):after. This means that the code will apply to any a tag in our nav list that is NOT an only child, aka any dropdown. The :after means it comes after the output of the tag. I’ve decided that to specify any nav item as a dropdown, it will be followed by a unicode arrow – ▾ (#9662).
  */
"""),format.raw/*95.1*/("""}"""),format.raw/*95.2*/("""
"""),format.raw/*96.1*/("""nav ul li a:hover """),format.raw/*96.19*/("""{"""),format.raw/*96.20*/("""
  """),format.raw/*97.3*/("""background-color: #2D2D2D; color: #A5A5A5;
"""),format.raw/*98.1*/("""}"""),format.raw/*98.2*/("""
"""),format.raw/*99.1*/("""nav ul li a:not(:only-child):after """),format.raw/*99.36*/("""{"""),format.raw/*99.37*/("""
  """),format.raw/*100.3*/("""padding-left: 4px;
  content: ' ▾';
"""),format.raw/*102.1*/("""}"""),format.raw/*102.2*/("""
"""),format.raw/*103.1*/("""nav ul li ul li """),format.raw/*103.17*/("""{"""),format.raw/*103.18*/("""
  """),format.raw/*104.3*/("""min-width: 190px;
"""),format.raw/*105.1*/("""}"""),format.raw/*105.2*/("""
"""),format.raw/*106.1*/("""nav ul li ul li a """),format.raw/*106.19*/("""{"""),format.raw/*106.20*/("""
  """),format.raw/*107.3*/("""padding: 15px;
  line-height: 20px;
"""),format.raw/*109.1*/("""}"""),format.raw/*109.2*/("""

"""),format.raw/*111.1*/(""".nav-dropdown """),format.raw/*111.15*/("""{"""),format.raw/*111.16*/("""
  """),format.raw/*112.3*/("""position: absolute;
  z-index: 1;
  /* Guarantees that the dropdown will display on top of any content. */
  box-shadow: 0 3px 12px rgba(0, 0, 0, 0.15);
  display: none;
"""),format.raw/*117.1*/("""}"""),format.raw/*117.2*/("""

"""),format.raw/*119.1*/(""".nav-mobile """),format.raw/*119.13*/("""{"""),format.raw/*119.14*/("""
  """),format.raw/*120.3*/("""display: none;
  position: absolute;
  top: 0;
  right: 0;
  background-color: #2D2D2D; color: #A5A5A5;
  height: 70px;
  width: 70px;
"""),format.raw/*127.1*/("""}"""),format.raw/*127.2*/("""

"""),format.raw/*129.1*/("""@media only screen and (max-width: 800px) """),format.raw/*129.44*/("""{"""),format.raw/*129.45*/("""

  """),format.raw/*131.3*/(""".brand"""),format.raw/*131.9*/("""{"""),format.raw/*131.10*/("""
  """),format.raw/*132.3*/("""padding-top: 10px !important;
  padding-left: 20px !important;
   position: absolute !important;
  float: left !important;
  line-height: 70px !important;
  text-transform: uppercase !important;
  font-size: 1.4em !important;
  """),format.raw/*139.3*/("""}"""),format.raw/*139.4*/("""

  """),format.raw/*141.3*/(""".nav-mobile """),format.raw/*141.15*/("""{"""),format.raw/*141.16*/("""
    """),format.raw/*142.5*/("""display: block;
  """),format.raw/*143.3*/("""}"""),format.raw/*143.4*/("""

  """),format.raw/*145.3*/("""nav """),format.raw/*145.7*/("""{"""),format.raw/*145.8*/("""
  	"""),format.raw/*146.4*/("""background-color: #2D2D2D; color: #A5A5A5;
    width: 100%;
    padding: 70px 0 15px;
  """),format.raw/*149.3*/("""}"""),format.raw/*149.4*/("""
  """),format.raw/*150.3*/("""nav ul """),format.raw/*150.10*/("""{"""),format.raw/*150.11*/("""
    """),format.raw/*151.5*/("""display: none;
  """),format.raw/*152.3*/("""}"""),format.raw/*152.4*/("""
  """),format.raw/*153.3*/("""nav ul li """),format.raw/*153.13*/("""{"""),format.raw/*153.14*/("""
    """),format.raw/*154.5*/("""float: none;
    padding-left: 2em;
  """),format.raw/*156.3*/("""}"""),format.raw/*156.4*/("""
  """),format.raw/*157.3*/("""nav ul li a """),format.raw/*157.15*/("""{"""),format.raw/*157.16*/("""
    """),format.raw/*158.5*/("""padding: 15px;
    line-height: 20px;
  """),format.raw/*160.3*/("""}"""),format.raw/*160.4*/("""
  """),format.raw/*161.3*/("""nav ul li ul li a """),format.raw/*161.21*/("""{"""),format.raw/*161.22*/("""
    """),format.raw/*162.5*/("""padding-left: 30px;
  """),format.raw/*163.3*/("""}"""),format.raw/*163.4*/("""
"""),format.raw/*164.1*/("""}"""),format.raw/*164.2*/("""
"""),format.raw/*165.1*/("""#nav-toggle """),format.raw/*165.13*/("""{"""),format.raw/*165.14*/("""
  """),format.raw/*166.3*/("""position: absolute;
  left: 18px;
  top: 22px;
  cursor: pointer;
  padding: 10px 35px 16px 0px;
"""),format.raw/*171.1*/("""}"""),format.raw/*171.2*/("""
"""),format.raw/*172.1*/("""#nav-toggle span,
#nav-toggle span:before,
#nav-toggle span:after """),format.raw/*174.24*/("""{"""),format.raw/*174.25*/("""
  """),format.raw/*175.3*/("""cursor: pointer;
  border-radius: 1px;
  height: 5px;
  width: 35px;
  background: #463f3f;
  position: absolute;
  display: block;
  content: '';
  transition: all 300ms ease-in-out;
"""),format.raw/*184.1*/("""}"""),format.raw/*184.2*/("""
"""),format.raw/*185.1*/("""#nav-toggle span:before """),format.raw/*185.25*/("""{"""),format.raw/*185.26*/("""
  """),format.raw/*186.3*/("""top: -10px;
"""),format.raw/*187.1*/("""}"""),format.raw/*187.2*/("""
"""),format.raw/*188.1*/("""#nav-toggle span:after """),format.raw/*188.24*/("""{"""),format.raw/*188.25*/("""
  """),format.raw/*189.3*/("""bottom: -10px;
"""),format.raw/*190.1*/("""}"""),format.raw/*190.2*/("""
"""),format.raw/*191.1*/("""#nav-toggle.active span """),format.raw/*191.25*/("""{"""),format.raw/*191.26*/("""
  """),format.raw/*192.3*/("""background-color: transparent;
"""),format.raw/*193.1*/("""}"""),format.raw/*193.2*/("""
"""),format.raw/*194.1*/("""#nav-toggle.active span:before, #nav-toggle.active span:after """),format.raw/*194.63*/("""{"""),format.raw/*194.64*/("""
  """),format.raw/*195.3*/("""top: 0;
"""),format.raw/*196.1*/("""}"""),format.raw/*196.2*/("""
"""),format.raw/*197.1*/("""#nav-toggle.active span:before """),format.raw/*197.32*/("""{"""),format.raw/*197.33*/("""
  """),format.raw/*198.3*/("""transform: rotate(45deg);
"""),format.raw/*199.1*/("""}"""),format.raw/*199.2*/("""
"""),format.raw/*200.1*/("""#nav-toggle.active span:after """),format.raw/*200.31*/("""{"""),format.raw/*200.32*/("""
  """),format.raw/*201.3*/("""transform: rotate(-45deg);
"""),format.raw/*202.1*/("""}"""),format.raw/*202.2*/("""

"""),format.raw/*204.1*/("""@media screen and (min-width: 800px) """),format.raw/*204.39*/("""{"""),format.raw/*204.40*/("""

  """),format.raw/*206.3*/(""".brand"""),format.raw/*206.9*/("""{"""),format.raw/*206.10*/("""
  """),format.raw/*207.3*/("""padding-top: 1px !important;
  """),format.raw/*208.3*/("""}"""),format.raw/*208.4*/("""

  """),format.raw/*210.3*/(""".nav-list """),format.raw/*210.13*/("""{"""),format.raw/*210.14*/("""
    """),format.raw/*211.5*/("""display: block !important;
  """),format.raw/*212.3*/("""}"""),format.raw/*212.4*/("""


"""),format.raw/*215.1*/("""}"""),format.raw/*215.2*/("""
"""),format.raw/*216.1*/("""/*
.navigation – the outer wrapper for the navbar. Specifies the height and color, and will stretch the full width of the viewport.
*/
.navigation """),format.raw/*219.13*/("""{"""),format.raw/*219.14*/("""
  """),format.raw/*220.3*/("""height: 62px;
 background-color: #2D2D2D; color: #A5A5A5;
"""),format.raw/*222.1*/("""}"""),format.raw/*222.2*/("""

"""),format.raw/*224.1*/("""/*
.nav-container – the inner wrapper for the navbar. Defines how far the actual content should stretch.
*/
.nav-container """),format.raw/*227.16*/("""{"""),format.raw/*227.17*/("""
  """),format.raw/*228.3*/("""max-width: 1000px;
  margin: 0 auto;
"""),format.raw/*230.1*/("""}"""),format.raw/*230.2*/("""

"""),format.raw/*232.1*/(""".brand """),format.raw/*232.8*/("""{"""),format.raw/*232.9*/("""
  """),format.raw/*233.3*/("""position: relative;
  overflow: auto;
  float: left;
  line-height: 70px;
  text-transform: uppercase;
  font-size: 1.4em;
"""),format.raw/*239.1*/("""}"""),format.raw/*239.2*/("""
"""),format.raw/*240.1*/(""".brand a,
.brand a:visited """),format.raw/*241.18*/("""{"""),format.raw/*241.19*/("""

  """),format.raw/*243.3*/("""text-decoration: none;
"""),format.raw/*244.1*/("""}"""),format.raw/*244.2*/("""

        """),format.raw/*246.9*/("""</style>
		<title>CDR Games Profile</title>
	</head>

<center>
<div class="container" style=" margin: 0 auto; text-align: left;">
	<div class="row">
		
        
        
       <div class="col-md-7 ">

<div class="panel panel-default">
  <div class="panel-heading">  <h4 >User Profile</h4></div>
   <div class="panel-body">
       
    <div class="box box-info">
        
            <div class="box-body">
                     <div class="col-sm-6">
                     <div  align="center"> <img alt="User Pic" src="https://x1.xingassets.com/assets/frontend_minified/img/users/nobody_m.original.jpg" id="profile-image1" class="img-circle img-responsive"> 
                
                <input id="profile-image-upload" class="hidden" type="file">
<div style="color:#999;" >click here to change profile image</div>
                
           
              
   
                
                
                     
                     
                     </div>
              
              <br>



    
              <!-- /input-group -->
            </div>
            <div class="col-sm-6">
            <h4 style="color:#00b1b1;">"""),_display_(/*288.41*/user/*288.45*/.getfName()),format.raw/*288.56*/(""" """),_display_(/*288.58*/user/*288.62*/.getlName()),format.raw/*288.73*/("""</h4></span>
              <span><p>"""),_display_(/*289.25*/user/*289.29*/.getRole()),format.raw/*289.39*/("""</p></span>            
            </div>
            <div class="clearfix"></div>
            <hr style="margin:5px 0 5px 0;">
    
              
<div class="col-sm-5 col-xs-6 tital " >First Name:</div><div class="col-sm-7 col-xs-6 ">"""),_display_(/*295.90*/if(user!=null)/*295.104*/{_display_(_display_(/*295.106*/user/*295.110*/.getfName()))}),format.raw/*295.122*/("""</div>
     <div class="clearfix"></div>
<div class="bot-border"></div>

<div class="col-sm-5 col-xs-6 tital " >Last Name:</div><div class="col-sm-7">"""),_display_(/*299.79*/if(user!=null)/*299.93*/{_display_(_display_(/*299.95*/user/*299.99*/.getlName()))}),format.raw/*299.111*/("""</div>
  <div class="clearfix"></div>
<div class="bot-border"></div>

<div class="col-sm-5 col-xs-6 tital " >Email:</div><div class="col-sm-7">"""),_display_(/*303.75*/if(user!=null)/*303.89*/{_display_(_display_(/*303.91*/user/*303.95*/.getEmail))}),format.raw/*303.105*/("""</div>
  <div class="clearfix"></div>
<div class="bot-border"></div>

<div class="col-sm-5 col-xs-6 tital " >Address:</div><div class="col-sm-7">"""),_display_(/*307.77*/if(user!=null)/*307.91*/{_display_(_display_(/*307.93*/user/*307.97*/.getAddress))}),format.raw/*307.109*/("""</div>

 <div class="clearfix"></div>
<div class="bot-border"> <center><a href=""""),_display_(/*310.44*/routes/*310.50*/.ProductCtrl.listProducts(0)),format.raw/*310.78*/("""">
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
    <script>
              $(function() """),format.raw/*329.28*/("""{"""),format.raw/*329.29*/("""
    """),format.raw/*330.5*/("""$('#profile-image1').on('click', function() """),format.raw/*330.49*/("""{"""),format.raw/*330.50*/("""
        """),format.raw/*331.9*/("""$('#profile-image-upload').click();
    """),format.raw/*332.5*/("""}"""),format.raw/*332.6*/(""");
"""),format.raw/*333.1*/("""}"""),format.raw/*333.2*/(""");       
              </script> 
  

       
       
       
       
       
       
       
       
   </div>
</div>
</center>

</html>"""))
      }
    }
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 04 01:09:48 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/app/views/profile.scala.html
                  HASH: f107691a9211d2595f89310b598be3d1b702a790
                  MATRIX: 651->1|980->27|1086->40|1113->41|1502->402|1531->403|1563->408|1629->447|1657->448|1686->450|1730->466|1759->467|1791->472|1904->557|1933->558|1962->560|1995->566|2023->567|2052->568|2112->600|2141->601|2171->604|2210->615|2239->616|2268->617|2349->670|2378->671|2408->674|2698->937|2713->943|2773->982|3132->1313|3161->1314|3191->1317|3337->1435|3366->1436|3396->1439|3433->1448|3462->1449|3491->1450|3567->1498|3596->1499|3626->1502|3666->1514|3695->1515|3724->1516|3771->1535|3800->1536|3830->1539|3869->1550|3898->1551|3927->1552|4011->1608|4040->1609|4070->1612|4109->1623|4138->1624|4167->1625|4233->1663|4262->1664|4292->1667|4329->1676|4358->1677|4387->1678|4427->1690|4456->1691|4487->1695|4523->1703|4552->1704|4665->1789|4694->1790|4724->1793|4761->1802|4790->1803|4861->1846|4890->1847|4920->1850|4956->1858|4985->1859|5056->1902|5085->1903|5115->1906|5152->1915|5181->1916|5210->1917|5263->1942|5292->1943|5322->1946|5360->1956|5389->1957|5419->1959|5448->1960|5478->1963|5519->1976|5548->1977|5578->1979|5607->1980|5637->1983|5676->1994|5705->1995|5734->1996|5795->2029|5824->2030|5857->2036|6076->2229|6104->2230|6134->2233|6181->2253|6209->2254|6237->2255|6268->2259|6296->2260|6326->2263|6367->2277|6395->2278|6423->2279|6457->2286|6485->2287|6515->2290|6634->2382|6662->2383|6690->2384|6728->2394|6757->2395|6787->2398|6849->2433|6877->2434|6905->2435|6945->2447|6974->2448|7004->2451|7509->2929|7537->2930|7565->2931|7611->2949|7640->2950|7670->2953|7740->2996|7768->2997|7796->2998|7859->3033|7888->3034|7919->3037|7983->3073|8012->3074|8041->3075|8086->3091|8116->3092|8147->3095|8193->3113|8222->3114|8251->3115|8298->3133|8328->3134|8359->3137|8423->3173|8452->3174|8482->3176|8525->3190|8555->3191|8586->3194|8784->3364|8813->3365|8843->3367|8884->3379|8914->3380|8945->3383|9108->3518|9137->3519|9167->3521|9238->3564|9268->3565|9300->3569|9334->3575|9364->3576|9395->3579|9651->3807|9680->3808|9712->3812|9753->3824|9783->3825|9816->3830|9862->3848|9891->3849|9923->3853|9955->3857|9984->3858|10016->3862|10132->3950|10161->3951|10192->3954|10228->3961|10258->3962|10291->3967|10336->3984|10365->3985|10396->3988|10435->3998|10465->3999|10498->4004|10564->4042|10593->4043|10624->4046|10665->4058|10695->4059|10728->4064|10796->4104|10825->4105|10856->4108|10903->4126|10933->4127|10966->4132|11016->4154|11045->4155|11074->4156|11103->4157|11132->4158|11173->4170|11203->4171|11234->4174|11359->4271|11388->4272|11417->4273|11512->4339|11542->4340|11573->4343|11785->4527|11814->4528|11843->4529|11896->4553|11926->4554|11957->4557|11997->4569|12026->4570|12055->4571|12107->4594|12137->4595|12168->4598|12211->4613|12240->4614|12269->4615|12322->4639|12352->4640|12383->4643|12442->4674|12471->4675|12500->4676|12591->4738|12621->4739|12652->4742|12688->4750|12717->4751|12746->4752|12806->4783|12836->4784|12867->4787|12921->4813|12950->4814|12979->4815|13038->4845|13068->4846|13099->4849|13154->4876|13183->4877|13213->4879|13279->4917|13309->4918|13341->4922|13375->4928|13405->4929|13436->4932|13495->4963|13524->4964|13556->4968|13595->4978|13625->4979|13658->4984|13715->5013|13744->5014|13775->5017|13804->5018|13833->5019|14009->5166|14039->5167|14070->5170|14156->5228|14185->5229|14215->5231|14367->5354|14397->5355|14428->5358|14493->5395|14522->5396|14552->5398|14587->5405|14616->5406|14647->5409|14798->5532|14827->5533|14856->5534|14912->5561|14942->5562|14974->5566|15025->5589|15054->5590|15092->5600|16266->6746|16280->6750|16313->6761|16343->6763|16357->6767|16390->6778|16455->6815|16469->6819|16501->6829|16767->7067|16792->7081|16824->7083|16839->7087|16876->7099|17055->7250|17079->7264|17110->7266|17124->7270|17161->7282|17333->7426|17357->7440|17388->7442|17402->7446|17437->7456|17611->7602|17635->7616|17666->7618|17680->7622|17717->7634|17826->7715|17842->7721|17892->7749|18208->8036|18238->8037|18271->8042|18344->8086|18374->8087|18411->8096|18479->8136|18508->8137|18539->8140|18568->8141
                  LINES: 24->1|29->2|34->3|35->4|41->10|41->10|42->11|44->13|44->13|46->15|46->15|46->15|47->16|51->20|51->20|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|53->22|55->24|62->31|62->31|62->31|67->36|67->36|68->37|74->43|74->43|75->44|75->44|75->44|75->44|75->44|75->44|76->45|76->45|76->45|76->45|76->45|76->45|77->46|77->46|77->46|77->46|77->46|77->46|78->47|78->47|78->47|78->47|78->47|78->47|79->48|79->48|79->48|79->48|79->48|79->48|81->50|81->50|81->50|81->50|81->50|82->51|82->51|82->51|82->51|82->51|83->52|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|85->54|85->54|85->54|85->54|85->54|86->55|86->55|86->55|86->55|86->55|87->56|87->56|87->56|87->56|87->56|87->56|93->62|99->68|99->68|100->69|101->70|101->70|102->71|102->71|102->71|103->72|104->73|104->73|105->74|105->74|105->74|106->75|112->81|112->81|113->82|113->82|113->82|114->83|116->85|116->85|117->86|117->86|117->86|118->87|126->95|126->95|127->96|127->96|127->96|128->97|129->98|129->98|130->99|130->99|130->99|131->100|133->102|133->102|134->103|134->103|134->103|135->104|136->105|136->105|137->106|137->106|137->106|138->107|140->109|140->109|142->111|142->111|142->111|143->112|148->117|148->117|150->119|150->119|150->119|151->120|158->127|158->127|160->129|160->129|160->129|162->131|162->131|162->131|163->132|170->139|170->139|172->141|172->141|172->141|173->142|174->143|174->143|176->145|176->145|176->145|177->146|180->149|180->149|181->150|181->150|181->150|182->151|183->152|183->152|184->153|184->153|184->153|185->154|187->156|187->156|188->157|188->157|188->157|189->158|191->160|191->160|192->161|192->161|192->161|193->162|194->163|194->163|195->164|195->164|196->165|196->165|196->165|197->166|202->171|202->171|203->172|205->174|205->174|206->175|215->184|215->184|216->185|216->185|216->185|217->186|218->187|218->187|219->188|219->188|219->188|220->189|221->190|221->190|222->191|222->191|222->191|223->192|224->193|224->193|225->194|225->194|225->194|226->195|227->196|227->196|228->197|228->197|228->197|229->198|230->199|230->199|231->200|231->200|231->200|232->201|233->202|233->202|235->204|235->204|235->204|237->206|237->206|237->206|238->207|239->208|239->208|241->210|241->210|241->210|242->211|243->212|243->212|246->215|246->215|247->216|250->219|250->219|251->220|253->222|253->222|255->224|258->227|258->227|259->228|261->230|261->230|263->232|263->232|263->232|264->233|270->239|270->239|271->240|272->241|272->241|274->243|275->244|275->244|277->246|319->288|319->288|319->288|319->288|319->288|319->288|320->289|320->289|320->289|326->295|326->295|326->295|326->295|326->295|330->299|330->299|330->299|330->299|330->299|334->303|334->303|334->303|334->303|334->303|338->307|338->307|338->307|338->307|338->307|341->310|341->310|341->310|360->329|360->329|361->330|361->330|361->330|362->331|363->332|363->332|364->333|364->333
                  -- GENERATED --
              */
          