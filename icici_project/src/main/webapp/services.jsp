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
</head>



<body class="background-scrolling">

<% User msg=(User)request.getAttribute("userdata"); %>


<header>
 <nav>
 <div class="logo" id="icici-logo">ICICI Bank</div>
 <ul>
 <li class="log"><a href="display.html">Personal Banking</a></li>
 <li class="log"><a href="display.html">Corporate Banking</a></liclass="log">
 <li class="log"><a href="display.html">NRI Banking</a></liclass="log">
 <li class="log"><a href="display.html">Investments</a></liclass="log">
 <li class="log"><a href="display.html">login/signup</a></liclass="log">
 </ul>

 </nav>
 <div class="search-container" style="width: 100%;">
 <input type="search" placeholder="Search">
 <button type="submit"></button>
 </div>
 <marquee behavior="scroll" direction="left" scrollamount="20" style="background-color:
white; color: blue;"> Tax payers paying advance tax through NEFT/RTGS/OVER THE
BANK (OTC) mode are required to genereate manadate/challan form using E-pay tax facility
&nbsp; &nbsp;
 <i class="fa-solid fa-phone" style="color: black;"></i> &nbsp; Any queries :1800 1080
</marquee>

</div>

 <nav>
 <ul>
 <li class="log">
 <div id="menuitem" ><i style="color:red;" class="fa-solid fa-landmark"></i>
<ahref="display.html">ACCOUNTS</a>
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
 <li class="log"><div id="menuitem"> <i style="color:red;" class="fa-solid fachart-simple"></i> <a href="display.html">INVEST</a>
 <div id="submen">
 <div><a href="scroll.html">FIXED DEPOSIT</a></div>
<div><a href="scroll.html">RECURRING
DEPOSIT</a></div>
<div><a href="scroll.html">IWISH GOAL
BASED LOANS</a></div>
</div>
</div>
 </ul></li>
 <li class="log"><div id="menuitem"> <i style="color:red; margin-left:20px;"
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
 <!-- Add feature sections here -->
 <p></p>

 <div>
<div class="bu3" >
<center>
<div style="font-size: 30px;">SERVICES</div>
 <form id="bu1">

 <button><a href="fetching?id=<%=msg.getId()%>" style="text-decoration: none;color: white;">FETCH <br></a></button><br>

 <button><a href="Updation?id=<%=msg.getId()%> " style="text-decoration: none ;color: white;">UPDATE<br></a></button><br>
 <button><a href="addBal?id=<%=msg.getId()%> " style="text-decoration: none;color: white;">ADD AMOUNT</a></button><br>
 <button><a href="checkbal?id=<%=msg.getId()%> "  style="text-decoration:none; color: white;">CHECK BALANCE</a></button><br>
 <button><a href="delete?id=<%=msg.getId()%> " style="text-decoration: none;color: white;">DELETE</a> </button><br>
 <a href="login.jsp" style="text-decoration: none;color: white;"><button >LOG OUT</button></a>
 </form>
 </div>
 </center>
 <div style="background-color:orange; width: 100%; height: 300px; margin-top:
20px; font-size: 20px;" >
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

 </div>
 </div>
</div>
 
 
</body>




</html>