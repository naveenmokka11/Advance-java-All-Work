<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
      background-color:#F37E20;
    }
    
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
    
  .carousel-inner img {
      width: 100%; /* Set width to 100% */
      margin: auto;
      min-height:200px;
  }

  /* Hide the carousel text when the screen is less than 600 pixels wide */
  @media (max-width: 600px) {
    .carousel-caption {
      display: none; 
    }
  }
  #active{
    background-color: #F37E20;
  }


  #2nd-nav{
    background-color: #f2f2f2;
  }
  </style>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href=""><span><img src="https://www.icicibank.com/content/dam/icicibank/icici-assets/footer-logo.png" alt=""></span></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="Home.jsp"><a href="#"><span class="glyphicon glyphicon-home"></span>Home</a></li>
        <li><a href="#">  <span class="glyphicon glyphicon-unchecked"></span>Cards</a></li>
        <li><a href="Notfound.jsp"><span class="glyphicon glyphicon-signal"></span>Invest</a></li>
        <li><a href="Notfound.jsp"><span class="glyphicon glyphicon-tint"></span >Ensure</a></li>
        <li><a href="Notfound.jsp"> <span class="glyphicon glyphicon-export"></span>Pay</a></li>
        <li><a href="Notfound.jsp"><span class="glyphicon glyphicon-fullscreen"></span>Offers</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-phone-alt"></span>Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="Register.jsp"><span class="glyphicon glyphicon-user"></span> Register</a></li>
        <li><a href="Login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        <li><a href="#"><span class=""></span> <img style="background-color: #f2f2f2; border-radius: 20px;" src="https://www.icicibank.com/etc.clientlibs/icicibank/clientlibs/clientlib-base/resources/images/icons/notification-animation.png"></a></li>
      </ul>
    </div>
  </div>
</nav>





<nav class="navbar navbar-inverse" id="2nd-nav" style="background-color: #f2f2f2;">
    <div class="container-fluid">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>                        
        </button>
        
      </div>

      <div class="collapse navbar-collapse" id="myNavbar">
        <ul class="nav navbar-nav">
          <marquee behavior="" direction=""><p style="color: #ac3206; margin-top: 20px;">Mandatory Profile password change after 365 days introduced for added security.   |   Customers who have installed “I MOBILE Secure OTP App” on their mobile and completed registration process will now receive Login OTP for ICICI.com on the app instead of SMS OTP   |   Call us toll free on 1800 1234 and 1800 2100 and get a wide range of services through ICICI Contact Centre   |   For added security, new functionality to maintain per day and per transaction limit for general merchant payment transactions has been implemented. Please visit Define Limit under profile section.   |   SBI never asks for your Card/PIN/OTP/CVV details on phone, message or email. Please do not click on links received on your email or mobile asking your Bank/Card details.</p></marquee>
         
        </ul>
      </div>
    </div>
  </nav>
  








<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="https://www.icicibank.com/content/dam/icicibank/india/managed-assets/images/homepage/hp-desktop7-1fd.webp" alt="Image">
        <div class="carousel-caption">
          <h3>Offers</h3>
          <p>Money Money.</p>
        </div>      
      </div>

      <div class="item">
        <img src="https://www.icicibank.com/content/dam/icicibank/india/managed-assets/images/homepage/gen-hl-hp-d1.webp" alt="Image">
        <div class="carousel-caption">
          <h3>Home lone</h3>
          <p>Happy family</p>
        </div>      
      </div>


      <div class="item">
        <img src="https://www.icicibank.com/content/dam/icicibank/india/managed-assets/images/homepage/gen-hl-hp-d1.webp" alt="Image">
        <div class="carousel-caption">
            <h3>Home lone</h3>
            <p>Happy family</p>
        </div>      
      </div>





      <div class="item">
        <img src="https://www.icicibank.com/content/dam/icicibank/india/managed-assets/images/homepage/experience-the-best-with-upi-on-your-icici-bank-rupay-credit-card-d.webp" alt="Image">
        <div class="carousel-caption">
          <h3>Online -Shoping</h3>
          <p>Online shoping  through icicibank</p>
        </div>      
      </div>






    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>
  
<div class="container text-center">    
  <h3><b>DIGITAL BANKING</b></h3><br>
  <div class="row">
    <div class="col-sm-4">
      <img src="https://www.icicibank.com/content/dam/icicibank/india/managed-assets/images/homepage/cc-1.jpg" class="img-responsive" style="width:100%" alt="Image">
      <p>Movie tickets</p>
    </div>
    <div class="col-sm-4"> 
      <img src="https://www.icicibank.com/content/dam/icicibank/india/managed-assets/images/homepage/mobile-banking.png" class="img-responsive" style="width:100%" alt="Image">
      <p><b>iMobile</b></p>    
    </div>
    <!-- <div class="col-sm-4"> 
        <img src="https://www.icicibank.com/content/dam/icicibank/india/managed-assets/images/dicgc-highg.jpeg" class="img-responsive" style="width:100%" alt="Image">
        <p><b>iMobile</b></p>    
      </div> -->
      <div class="col-sm-4"> 
        <img src="https://www.icicibank.com/content/dam/icicibank/india/managed-assets/images/qrcode-highresolution.jpeg" class="img-responsive" style="width:100%" alt="Image">
        <p><b>QR code </b></p>    
      </div>
    <!-- <div class="col-sm-4">
      <div class="well">
       <p>Some text..</p>
      </div>
      <div class="well">



        
       <p>Some text..
    </div> -->
  </div>
</div><br>
<!--Start of Tawk.to Script-->
<script type="text/javascript">
  var Tawk_API=Tawk_API||{}, Tawk_LoadStart=new Date();
  (function(){
  var s1=document.createElement("script"),s0=document.getElementsByTagName("script")[0];
  s1.async=true;
  s1.src='https://embed.tawk.to/644b8d704247f20fefee42fd/1gv3i10nn';
  s1.charset='UTF-8';
  s1.setAttribute('crossorigin','*');
  s0.parentNode.insertBefore(s1,s0);
  })();
  </script>
  <!--End of Tawk.to Script-->

<footer class="container-fluid text-center" style="background-color: #3D3D3D; color: #f2f2f2;">
  <p>Term and condition | Do not call Registry | Disclaim | Multilingual Disclaimer | Code of Commitment | Group code of Business conduct and Ethics | Customer Services polices | Use of unparliamentary language by Customers | Privacy | Fair Practice Code for Lenders |DICGC Deposit Insurance <br>CopyRight &copy 2023. All right reserved</p>
</footer>

</body>
</html>
