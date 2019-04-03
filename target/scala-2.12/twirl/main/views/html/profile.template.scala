
package views.html

import controllers._
import models.users.User

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.14*/("""

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
                  DATE: Wed Apr 03 23:20:42 BST 2019
                  SOURCE: C:/Users/Ryan3/OneDrive/Documents/2ndYearProject/a/2ndYearProject/app/views/profile.scala.html
                  HASH: 7842d3b91156891938676f99cdcd84f51ac8820f
                  MATRIX: 651->1|980->28|1087->40|1117->44|1512->411|1541->412|1574->418|1642->459|1670->460|1701->464|1745->480|1774->481|1807->487|1924->576|1953->577|1983->580|2016->586|2044->587|2073->588|2133->620|2162->621|2193->625|2232->636|2261->637|2290->638|2371->691|2400->692|2432->697|2729->967|2744->973|2804->1012|3168->1348|3197->1349|3228->1353|3380->1477|3409->1478|3440->1482|3477->1491|3506->1492|3535->1493|3611->1541|3640->1542|3671->1546|3711->1558|3740->1559|3769->1560|3816->1579|3845->1580|3876->1584|3915->1595|3944->1596|3973->1597|4057->1653|4086->1654|4117->1658|4156->1669|4185->1670|4214->1671|4280->1709|4309->1710|4340->1714|4377->1723|4406->1724|4435->1725|4475->1737|4504->1738|4537->1744|4573->1752|4602->1753|4715->1838|4744->1839|4775->1843|4812->1852|4841->1853|4912->1896|4941->1897|4972->1901|5008->1909|5037->1910|5108->1953|5137->1954|5168->1958|5205->1967|5234->1968|5263->1969|5316->1994|5345->1995|5376->1999|5414->2009|5443->2010|5473->2012|5502->2013|5533->2017|5574->2030|5603->2031|5633->2033|5662->2034|5693->2038|5732->2049|5761->2050|5790->2051|5851->2084|5880->2085|5919->2097|6144->2296|6172->2297|6203->2301|6251->2322|6279->2323|6308->2325|6339->2329|6367->2330|6398->2334|6440->2349|6468->2350|6497->2352|6531->2359|6559->2360|6590->2364|6715->2462|6743->2463|6772->2465|6810->2475|6839->2476|6870->2480|6934->2517|6962->2518|6991->2520|7031->2532|7060->2533|7091->2537|7604->3023|7632->3024|7661->3026|7707->3044|7736->3045|7767->3049|7838->3093|7866->3094|7895->3096|7958->3131|7987->3132|8019->3136|8085->3174|8114->3175|8144->3177|8189->3193|8219->3194|8251->3198|8298->3217|8327->3218|8357->3220|8404->3238|8434->3239|8466->3243|8532->3281|8561->3282|8593->3286|8636->3300|8666->3301|8698->3305|8901->3480|8930->3481|8962->3485|9003->3497|9033->3498|9065->3502|9235->3644|9264->3645|9296->3649|9367->3692|9397->3693|9431->3699|9465->3705|9495->3706|9527->3710|9790->3945|9819->3946|9853->3952|9894->3964|9924->3965|9958->3971|10005->3990|10034->3991|10068->3997|10100->4001|10129->4002|10162->4007|10281->4098|10310->4099|10342->4103|10378->4110|10408->4111|10442->4117|10488->4135|10517->4136|10549->4140|10588->4150|10618->4151|10652->4157|10720->4197|10749->4198|10781->4202|10822->4214|10852->4215|10886->4221|10956->4263|10985->4264|11017->4268|11064->4286|11094->4287|11128->4293|11179->4316|11208->4317|11238->4319|11267->4320|11297->4322|11338->4334|11368->4335|11400->4339|11530->4441|11559->4442|11589->4444|11686->4512|11716->4513|11748->4517|11969->4710|11998->4711|12028->4713|12081->4737|12111->4738|12143->4742|12184->4755|12213->4756|12243->4758|12295->4781|12325->4782|12357->4786|12401->4802|12430->4803|12460->4805|12513->4829|12543->4830|12575->4834|12635->4866|12664->4867|12694->4869|12785->4931|12815->4932|12847->4936|12884->4945|12913->4946|12943->4948|13003->4979|13033->4980|13065->4984|13120->5011|13149->5012|13179->5014|13238->5044|13268->5045|13300->5049|13356->5077|13385->5078|13417->5082|13483->5120|13513->5121|13547->5127|13581->5133|13611->5134|13643->5138|13703->5170|13732->5171|13766->5177|13805->5187|13835->5188|13869->5194|13927->5224|13956->5225|13990->5231|14019->5232|14049->5234|14228->5384|14258->5385|14290->5389|14378->5449|14407->5450|14439->5454|14594->5580|14624->5581|14656->5585|14723->5624|14752->5625|14784->5629|14819->5636|14848->5637|14880->5641|15037->5770|15066->5771|15096->5773|15153->5801|15183->5802|15217->5808|15269->5832|15298->5833|15338->5845|16554->7033|16568->7037|16601->7048|16631->7050|16645->7054|16678->7065|16744->7103|16758->7107|16790->7117|17062->7361|17087->7375|17119->7377|17134->7381|17171->7393|17354->7548|17378->7562|17409->7564|17423->7568|17460->7580|17636->7728|17660->7742|17691->7744|17705->7748|17740->7758|17918->7908|17942->7922|17973->7924|17987->7928|18024->7940|18136->8024|18152->8030|18202->8058|18537->8364|18567->8365|18601->8371|18674->8415|18704->8416|18742->8426|18811->8467|18840->8468|18872->8472|18901->8473
                  LINES: 24->1|29->2|34->2|36->4|42->10|42->10|43->11|45->13|45->13|47->15|47->15|47->15|48->16|52->20|52->20|53->21|53->21|53->21|53->21|53->21|53->21|54->22|54->22|54->22|54->22|54->22|54->22|56->24|63->31|63->31|63->31|68->36|68->36|69->37|75->43|75->43|76->44|76->44|76->44|76->44|76->44|76->44|77->45|77->45|77->45|77->45|77->45|77->45|78->46|78->46|78->46|78->46|78->46|78->46|79->47|79->47|79->47|79->47|79->47|79->47|80->48|80->48|80->48|80->48|80->48|80->48|82->50|82->50|82->50|82->50|82->50|83->51|83->51|83->51|83->51|83->51|84->52|84->52|84->52|84->52|84->52|85->53|85->53|85->53|85->53|85->53|85->53|86->54|86->54|86->54|86->54|86->54|87->55|87->55|87->55|87->55|87->55|88->56|88->56|88->56|88->56|88->56|88->56|94->62|100->68|100->68|101->69|102->70|102->70|103->71|103->71|103->71|104->72|105->73|105->73|106->74|106->74|106->74|107->75|113->81|113->81|114->82|114->82|114->82|115->83|117->85|117->85|118->86|118->86|118->86|119->87|127->95|127->95|128->96|128->96|128->96|129->97|130->98|130->98|131->99|131->99|131->99|132->100|134->102|134->102|135->103|135->103|135->103|136->104|137->105|137->105|138->106|138->106|138->106|139->107|141->109|141->109|143->111|143->111|143->111|144->112|149->117|149->117|151->119|151->119|151->119|152->120|159->127|159->127|161->129|161->129|161->129|163->131|163->131|163->131|164->132|171->139|171->139|173->141|173->141|173->141|174->142|175->143|175->143|177->145|177->145|177->145|178->146|181->149|181->149|182->150|182->150|182->150|183->151|184->152|184->152|185->153|185->153|185->153|186->154|188->156|188->156|189->157|189->157|189->157|190->158|192->160|192->160|193->161|193->161|193->161|194->162|195->163|195->163|196->164|196->164|197->165|197->165|197->165|198->166|203->171|203->171|204->172|206->174|206->174|207->175|216->184|216->184|217->185|217->185|217->185|218->186|219->187|219->187|220->188|220->188|220->188|221->189|222->190|222->190|223->191|223->191|223->191|224->192|225->193|225->193|226->194|226->194|226->194|227->195|228->196|228->196|229->197|229->197|229->197|230->198|231->199|231->199|232->200|232->200|232->200|233->201|234->202|234->202|236->204|236->204|236->204|238->206|238->206|238->206|239->207|240->208|240->208|242->210|242->210|242->210|243->211|244->212|244->212|247->215|247->215|248->216|251->219|251->219|252->220|254->222|254->222|256->224|259->227|259->227|260->228|262->230|262->230|264->232|264->232|264->232|265->233|271->239|271->239|272->240|273->241|273->241|275->243|276->244|276->244|278->246|320->288|320->288|320->288|320->288|320->288|320->288|321->289|321->289|321->289|327->295|327->295|327->295|327->295|327->295|331->299|331->299|331->299|331->299|331->299|335->303|335->303|335->303|335->303|335->303|339->307|339->307|339->307|339->307|339->307|342->310|342->310|342->310|361->329|361->329|362->330|362->330|362->330|363->331|364->332|364->332|365->333|365->333
                  -- GENERATED --
              */
          