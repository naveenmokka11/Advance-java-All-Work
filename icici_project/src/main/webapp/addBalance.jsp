<%@page import="com.dto.Bank"%>
<%@page import="com.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="constatnt.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/fontawesome/6.4.2/css/all.min.css"
	integrity="sha512-
z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6
S9CQXFEbbKuqLg0DA=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body class="background-scrolling">

<%User user=(User)request.getAttribute("adbalance"); %>



	<header>
		<nav>

			<div class="logo" id="icici-logo">ICICI Bank</div>
			<ul>
				<li class="log"><a href="display.html">Personal Banking</a></li>
				<li class="log"><a href="display.html">Corporate Banking</a>
				</liclass="log">
				<li class="log"><a href="display.html">NRI Banking</a>
				</liclass="log">
				<li class="log"><a href="display.html">Investments</a>
				</liclass="log">
				<li class="log"><a href="display.html">login/signup</a>
				</liclass="log">
			</ul>

		</nav>
		<div class="search-container" style="width: 100%;">
			<input type="search" placeholder="Search">
			<button type="submit"></button>
		</div>


		</div>

		<nav>
			<ul>
				<li class="log">
					<div id="menuitem">
						<i style="color: red;" class="fa-solid fa-landmark"></i>
						<ahref="display.html">ACCOUNTS</a>
						<div id="submen">
							<div>
								<a href="scroll.html">SAVINGS ACCOUNT</a>
							</div>
							<div>
								<a href="scroll.html">SALARY ACCOUNT</a>
							</div>
							<div>
								<a href="scroll.html">INVESTMENT ACCOUNT</a>
							</div>
						</div>
					</div>
				</li>

				<li class="log">
					<div id="menuitem">
						<i style="color: red;" class="fa-regular fa-creditcard"></i> <a
							href="display.html">CARDS</a>
						<div id="submen">
							<div>
								<a href="scroll.html">INSTANT CREDIT CARD</a>
							</div>
							<div>
								<a href="scroll.html">SPECIAL CREDIT CARD</a>
							</div>
							<div>
								<a href="scroll.html">CO BRAND CARD</a>
							</div>
							<div>
								<a href="scroll.html">EMI/LOAN ON CREDIT CARD</a>
							</div>
						</div>
					</div>
			</ul>
			</li>
			<li class="log"><div id="menuitem">
					<i style="color: red;" class="fa-regular fahandshake"></i> <a
						href="display.html">LOANS</a>
					<div id="submen">
						<div>
							<a href="scroll.html">PERSONAL LOAN</a>
						</div>
						<div>
							<a href="scroll.html">HOME LOANS</a>
						</div>
						<div>
							<a href="scroll.html">CAR LOANS</a>
						</div>
						<div>
							<a href="scroll.html">EDUCATION LOANS</a>
						</div>
					</div>
				</div>
				</ul></li>
			<li class="log"><div id="menuitem">
					<i style="color: red;" class="fa-solid fachart-simple"></i> <a
						href="display.html">INVEST</a>
					<div id="submen">
						<div>
							<a href="scroll.html">FIXED DEPOSIT</a>
						</div>
						<div>
							<a href="scroll.html">RECURRING DEPOSIT</a>
						</div>
						<div>
							<a href="scroll.html">IWISH GOAL BASED LOANS</a>
						</div>
					</div>
				</div>
				</ul></li>
			<li class="log"><div id="menuitem">
					<i style="color: red; margin-left: 20px;"
						class="fa-solid fa-umbrella"></i> <a href="display.html">INSURE</a>
					<div id="submen">
						<div>
							<a href="scroll.html">LIFE INSURANCE</a>
						</div>
						<div>
							<a href="scroll.html">HEALTH INSURANCE</a>
						</div>
						<div>
							<a href="scroll.html">VEHICLE INSURANCE</a>
						</div>
						<div>
							<a href="scroll.html">TRAVEL INSURANCE</a>
						</div>
					</div>
				</div>
				</ul></li>
			<li class="log"><div id="menuitem">
					<i style="color: red;" class="fa-solid facircle-arrow-right"></i> <a
						href="display.html">PAY</a>
					<div id="submen">
						<div>
							<a href="scroll.html">NEFT</a>
						</div>
						<div>
							<a href="scroll.html">IMPS</a>
						</div>
						<div>
							<a href="scroll.html">UPI</a>
						</div>
						<div>
							<a href="scroll.html">ICICI BANK PAY</a>
						</div>
					</div>
				</div>
				</ul></li>
			<li class="log"><div id="menuitem">
					<i style="color: red;" class="fa-solid fapercent"></i> <a
						href="display.html">OFFERS%</a>
					<div id="submen">
						<div>
							<a href="scroll.html">OFFERS</a>
						</div>
						<div>
							<a href="scroll.html">OFFERS NEAR YOU</a>
						</div>
						<div>
							<a href="scroll.html">PERSONALISED PRODUCT OFFERS</a>
						</div>
						<div>
							<a href="scroll.html">CASH BACK DEALS</a>
						</div>
					</div>
				</div>
				</ul></li>

			</ul>
		</nav>
	</header>
	<!-- Add feature sections here -->
	<p></p>
	<center>
		<section>
			<br> <br>
			<div style="border: 3px solid black; width: 350px; height: 400px;">
				<br> <br>
				<h2>ADD AMOUNT</h2>
				
				<form action="addfunds">
			<input id="" type="numbes" name="id" value="<%=user.getId()%>" readonly="true">
				Rs: <input id="" type="numbes" name="funds"> <img
					src="https://th.bing.com/th/id/OIP.EYcqv21EGKgsoVN03kl2ngHaH0?w=156&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"
					style="height: 250px;">
			</div>
		</section>
		<button style="color: white; text-decoration: none;">
			
	
			<input type="submit" value=" OK">
			</form>
			
			
			
		</button>
	</center>
	<!-- Add feature sections here -->
	<div
		style="background-color: orange; width: 100%; height: 300px; margin-top: 20px; font-size: 20px;">
		<center>
			<br> <br>
			<div>RATES AND CHARGES</div>
			<br>
			<div>
				Interest Rates <i class="fa-solid fa-star" style="color: yellow;"></i>
				<i class="fa-solid fa-star" style="color: yellow;"></i> <i
					class="fa-solid fa-star" style="color: yellow;"></i><i
					class="fa-solid fa-star" style="color: yellow;"></i><br>
			</div>
			<br>
			<div>Service Charges and Fees</div>
			<br>
			<div>GET SOCIAL</div>
			<br>
			<div>
				<i style="margin-left: 50px; color: royalblue; font-size: 30px;"
					class="fa-brands fa-facebook"></i> <i
					style="margin-left: 50px; color: lightskyblue; font-size: 30px;"
					class="fa-brands fa-twitter"></i> <i
					style="margin-left: 50px; color: red; font-size: 30px;"
					class="fabrands fa-youtube"></i> <i
					style="margin-left: 50px; color: deeppink; font-size: 30px;"
					class="fa-brands fa-instagram"></i>
			</div>
			<br>


		</center>

	</div>
	<footer class="footer">
		<p>Terms and conditions Do Not Call Registry Disclaimer
			Multilingual Disclaimer Code of Commitment Group Code of Business
			Conduct and Ethics Customer Service Policies Use of Unparliamentary
			Language by Customers Privacy Fair Practice Code for Lenders DICGC
			Deposit Insurance</p>
	</footer>

</body>
</html>