<%@page import="com.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="constatnt.css">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fontawesome/6.4.2/css/all.min.css" integrity="sha512-
z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6
S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
 <style>
 /* Add this CSS to style the submenu */
.log {
 position: relative;

}
.log:hover .submenu {
 display: block;
}
.submenu {
 display: none;
 position: absolute;
 background-color: #fff;
 padding: 10px;
 box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
 top: 100%; /* Position the submenu below the parent element */
 left: 0;
}
.log:hover .submenu {
 display: block;
}
 </style>




</head>




<body class="background-scrolling">

<% User user=(User)request.getAttribute("updateop"); %>>
<div>
 <header>
 <nav>
<div class="logo" id="icici-logo">ICICI Bank</div> <ul>
 <li class="log"><a href="display.html">Personal Banking</a></li>
 <li class="log"><a href="display.html">Corporate Banking</a></li>
 <li class="log"><a href="display.html">NRI Banking</a></li>
 <li class="log"><a href="display.html">Investments</a></li>
 <li class="log"><a href="display.html">login/signup</a></li>
 </ul>
 </nav>
 <div class="search-container" style="width: 100%;">
 <input type="search" placeholder="Search">
 <button type="submit"></button>
 </div>
 <marquee behavior="scroll" direction="left" scrollamount="20" style="backgroundcolor: white; color: blue;"> Tax payers paying advance tax through NEFT/RTGS/OVER THE
BANK (OTC) mode are required to genereate manadate/challan form using E-pay tax facility
&nbsp; &nbsp;
 <i class="fa-solid fa-phone" style="color: black;"></i> &nbsp; Any queries :1800 1080
</marquee>
 <nav>
 <ul>
 <li class="log">
 <div id="menuitem"><i style="color:red;" class="fa-solid fa-landmark"></i> <a
href="display.html">ACCOUNTS</a>
 <div id="submen">
 <div><a href="scroll.html">SAVINGS ACCOUNT</a></div>
<div><a href="scroll.html">SALARY
ACCOUNT</a></div>
<div><a href="scroll.html">INVESTMENT
ACCOUNT</a></div>
</div>
</div>
 </li>

 <li class="log">
 <div id="menuitem"><i style="color:red;" class="fa-regular fa-creditcard"></i> <a href="display.html">CARDS</a>
 <div id="submen">
 <div><a href="scroll.html">INSTANT CREDIT CARD</a></div>
<div><a href="scroll.html">SPECIAL CREDIT
CARD</a></div>
<div><a href="scroll.html">CO BRAND
CARD</a></div>
<div><a href="scroll.html">EMI/LOAN
ON CREDIT CARD</a></div>
</div>
</div>
 </ul>
 </li>
 <li class="log"><div id="menuitem"><i style="color:red;;" class="fa-regular fahandshake"></i> <a href="display.html">LOANS</a>
 <div id="submen">
 <div><a href="scroll.html">PERSONAL LOAN</a></div>
<div><a href="scroll.html">HOME
LOANS</a></div>
<div><a href="scroll.html">CAR
LOANS</a></div>

<div><a
href="scroll.html">EDUCATION LOANS</a></div>
</div>
</div>
 </ul></li>
 <li class="log"><div id="menuitem"><i style="color:red;" class="fa-solid fa-chartsimple"></i> <a href="display.html">INVEST</a>
 <div id="submen">
 <div><a href="scroll.html">FIXED DEPOSIT</a></div>
<div><a href="scroll.html">RECURRING
DEPOSIT</a></div>
<div><a href="scroll.html">IWISH GOAL
BASED LOANS</a></div>
</div>
</div>
 </ul></li>
 <li class="log"><div id="menuitem"><i style="color:red; margin-left:20px;"
class="fa-solid fa-umbrella"></i> <a href="display.html">INSURE</a>
 <div id="submen">
 <div><a href="scroll.html">LIFE INSURANCE</a></div>
<div><a href="scroll.html">HEALTH
INSURANCE</a></div>
<div><a href="scroll.html">VEHICLE
INSURANCE</a></div>
<div><a href="scroll.html">TRAVEL
INSURANCE</a></div>
</div>
</div>
 </ul></li>
 <li class="log"><div id="menuitem"><i style="color:red; " class="fa-solid facircle-arrow-right"></i> <a href="display.html">PAY</a>
 <div id="submen">
 <div><a href="scroll.html">NEFT</a></div>
<div><a href="scroll.html">IMPS</a></div>
<div><a href="scroll.html">UPI</a></div>
<div><a href="scroll.html">ICICI
BANK PAY</a></div>
</div>
</div>
 </ul></li>
 <li class="log"><div id="menuitem"> <i style="color:red;" class="fa-solid fapercent"></i> <a href="display.html">OFFERS%</a>
 <div id="submen">
 <div><a href="scroll.html">OFFERS</a></div>
<div><a href="scroll.html">OFFERS NEAR
YOU</a></div>
<div><a href="scroll.html">PERSONALISED
PRODUCT OFFERS</a></div>
<div><a href="scroll.html">CASH
BACK DEALS</a></div>
</div>
</div>
 </ul></li>

 </ul>
 </nav>
 </header>


 <div id="update" >
<center>


 <form id="up1"  action="edit" method="post">
 <label >id:</label>
 <input class="up2" type="text"id="name" name="id"    value="<%=user.getId()%>">
 
 
<label >Name:</label>
 <input class="up2" type="text"id="name" name="name"    value="<%=user.getUserName()%>">
 <label >Email:</label>
 <input class="up2" type="email" id="email" name="email" requried value="<%=user.getUserEmail()%>" readonly="readonly"><br>
 <label >Password:</label><input class="up2" type="password" id="password" name="password" requried  value="<%=user.getUserPassword()%>"  >
 <label >PH:</label><input class="up2" type="tel" id="phno" name="phno"  value="<%=user.getUserPhone()%>"><br>
 <label > AdharCard/pancard:</label><input class="up2" type="number" id="number" name="proof" requried  value="<%=user.getAadharNo()%>"><br>
 <br>
 <br>


 <input id="up3" style="background-color:lightgreen" type="submit" value="submit">



 </form>

 </center>
 </div>
</div>
<!-- Add feature sections here -->
 <div style="background-color:orange; width: 100%; height: 300px; margin-top: 20px;
font-size: 20px;" >
 <center>
 <br>
 <br>
 <div >RATES AND CHARGES</div> <br>
 <div >Interest Rates <i class="fa-solid fa-star" style="color: yellow;"></i>
<i class="fa-solid fa-star" style="color: yellow;"></i> <i class="fa-solid fa-star" style="color:
yellow;"></i ><i class="fa-solid fa-star" style="color: yellow;"></i><br>
 </div> <br>
 <div >Service Charges and Fees</div> <br>
 <div >GET SOCIAL</div> <br>
 <div >
<i style="margin-left: 50px; color: royalblue; font-size: 30px;"
class="fa-brands fa-facebook"></i>
 <i style="margin-left: 50px; color: lightskyblue; font-size: 30px;"
class="fa-brands fa-twitter"></i>
 <i style="margin-left: 50px; color: red; font-size: 30px;" class="fabrands fa-youtube"></i>
 <i style="margin-left: 50px; color:deeppink; font-size: 30px; "
class="fa-brands fa-instagram"></i>
 </div> <br>


 </center>

 </div >
</body>



















</html>