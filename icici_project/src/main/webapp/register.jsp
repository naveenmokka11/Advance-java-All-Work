<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ICICI Bank</title>
<link rel="stylesheet" href="css/register.css">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>



<body class="background-scrolling">

<%String msg=(String)request.getAttribute("duplicateEmail"); %>

	<header>
		<nav>
			<div class="logo" id="icici-logo"><img id="logoimg" alt="sorry we can't reach" src="assets/icici_logo-removebg-preview.png"></div>
			<ul>
				<li class="log"><a href="display.html">Personal Banking</a></li>
				<li class="log"><a href="display.html">Corporate Banking</a></li>
				<li class="log"><a href="display.html">NRI Banking</a></li>
				<li class="log"><a href="display.html">Investments</a></li>
				<li class="log"><a href="display.html">login/signup</a></li>
			</ul>

		</nav>
		<div class="search-container" style="width: 100%;">
			<div class="wrapper">
    <div class="typing-demo">
      naveen
    </div>
</div>
		</div>


	

	</header>


	<!-- Add feature sections here -->
	<p></p>
	<img
		src="https://media.istockphoto.com/id/1415153284/photo/happy-and-cheerful-mixed-race-business-woman-cheering-while-working-on-a-laptop-in-office.webp?b=1&s=612x612&w=0&k=20&c=uxYgFYlev6q1pHCO_cYQwQMnsN1aan23UJPywBRx2wk="
		style="width: 70%; height: 50%;">

	<div class="registration-container">
		<div class="registration-box"
			style="margin-bottom: 1000px ;margin-left: 75%;">
			<h2>REGISTRATION</h2>
			<%if(msg!=null) {%>
			<%=msg %>
			<%} %>
			
			
			<form action="registration" method="post">
			
				<label>Name:</label> <input type="text" id="username" name="name"><br>
				<label>Email:</label> <input type="text" id="username" name="email"required><br> 	
				<label>Password:</label> <input type="password" id="password" name="password" required><br>
				<label>Phone no.:</label> <input type="tel" id="username"name="phone"><br> 
				<label>AadharCard/PanCard No:</label> <input type="text" id="username" name="proof">
				<!--  <label>AadharCard/PanCard No:</label> <input type="text" id="username" name="proof">-->
				<input type="submit" class="btn btn-outline-success"  value="Submit">
		
			</form>
			
				<h4>
					if you are a user <a href="ICICREGISTER.html" style="color: blue;">login</a>
				</h4>
		</div>
	</div>
	<section class="footer">
		<p>Terms and conditions Do Not Call Registry Disclaimer
			Multilingual Disclaimer Code of Commitment Group Code of Business
			Conduct and Ethics Customer Service Policies Use of Unparliamentary
			Language by Customers Privacy Fair Practice Code for Lenders DICGC
			Deposit Insurance</p>
	</section>
	
	
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>