<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ICICI Bank</title>
    <link rel="stylesheet" href="constatnt.css">
     
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
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
    <header>
        <nav>
 <div class="logo" id="icici-logo">ICICI Bank</div>         <ul>
                <li class="log"><a href="display.html">Personal Banking</a></li>
                <li class="log"><a href="display.html">Corporate Banking</a></li>
                <li class="log"><a href="display.html">NRI Banking</a></li>
                <li class="log"><a href="display.html">Investments</a></li>
                <li class="log"><a href="display.html">login/Signup</a></li>
            </ul>
        </nav>
        <div class="search-container" style="width: 100%;">
            <input type="search" placeholder="Search">
            <button type="submit">Search</button>
        </div>
        <nav>
            <ul>
                <li class="log">
                  <div id="menuitem">  <a href="display.html">ACCOUNTS</a>
                   <div id="submen">
                  <div><a href="scroll.html">SAVINGS ACCOUNT</a></div>
						<div><a href="scroll.html">SALARY ACCOUNT</a></div>
						<div><a href="scroll.html">INVESTMENT ACCOUNT</a></div>
					</div>
					</div>
                </li>
               
				
                <li class="log">
                    <div id="menuitem">  <a href="display.html">CARDS</a>
                   <div id="submen">
                  <div><a href="scroll.html">INSTANT CREDIT CARD</a></div>
						<div><a href="scroll.html">SPECIAL CREDIT CARD</a></div>
						<div><a href="scroll.html">CO BRAND CARD</a></div>
							<div><a href="scroll.html">EMI/LOAN ON CREDIT CARD</a></div>
					</div>
					</div>
                    </ul>
                </li>
                <li class="log"><div id="menuitem">  <a href="display.html">LOANS</a>
                   <div id="submen">
                  <div><a href="scroll.html">PERSONAL LOAN</a></div>
						<div><a href="scroll.html">HOME LOANS</a></div>
						<div><a href="scroll.html">CAR LOANS</a></div>
							<div><a href="scroll.html">EDUCATION LOANS</a></div>
					</div>
					</div>
                    </ul></li>
                <li class="log"><div id="menuitem">  <a href="display.html">INVEST</a>
                   <div id="submen">
                  <div><a href="scroll.html">FIXED DEPOSIT</a></div>
						<div><a href="scroll.html">RECURRING DEPOSIT</a></div>
						<div><a href="scroll.html">IWISH GOAL BASED LOANS</a></div>
						
					</div>
					</div>
                    </ul></li>
                <li class="log"><div id="menuitem">  <a href="display.html">INSURE</a>
                   <div id="submen">
                  <div><a href="scroll.html">LIFE INSURANCE</a></div>
						<div><a href="scroll.html">HEALTH INSURANCE</a></div>
						<div><a href="scroll.html">VEHICLE INSURANCE</a></div>
							<div><a href="scroll.html">TRAVEL INSURANCE</a></div>
					</div>
					</div>
                    </ul></li>
                <li class="log"><div id="menuitem">  <a href="display.html">PAY</a>
                   <div id="submen">
                  <div><a href="scroll.html">NEFT</a></div>
						<div><a href="scroll.html">IMPS</a></div>
						<div><a href="scroll.html">UPI</a></div>
							<div><a href="scroll.html">ICICI BANK PAY</a></div>
					</div>
					</div>
                    </ul></li>
                <li class="log"><div id="menuitem">  <a href="display.html">OFFERS%</a>
                   <div id="submen">
                  <div><a href="scroll.html">OFFERS</a></div>
						<div><a href="scroll.html">OFFERS NEAR YOU</a></div>
						<div><a href="scroll.html">PERSONALISED PRODUCT OFFERS</a></div>
							<div><a href="scroll.html">CASH BACK DEALS</a></div>
					</div>
					</div>
                    </ul></li>
                    
            </ul>
        </nav>
    </header>
  
<div id="div1" >
	
	 <center>
	 
	 
            <form id="div2" action="login" method="post">
            
            
				<h2 style="color:#F37E20;" >LOGIN</h2>
               
                <input  placeholder="E-mailId" type="text" id="username" name="userEmail" required><br>
               
                <input placeholder="Password" type="password" id="password" name="password" required><br>
                
                <button  type="submit">Login</button>
                
                
                
                
                <p>we have enseured that key service are <br>
                avaliable to you on the mobile website. for<br>
                other sewrvise,please continue to desktop<br>
                login. </p>
                
                <button>Download iMobile</button>
                
          <div id="div4">
			 <a><i  id ="is"class="fa-solid fa-mobile-screen-button"></i><br>
			 Insta<br>
			 Banking</a>
			 <a><i  id ="is"class="fa-solid fa-money-bills"></i><br>Find ATM
				 <br>
				 Branch
			 </a>
			 <a><i   id ="is" class="fa-solid fa-id-card-clip"></i><br>Contact<br>Us</a>
			 <a> <i  id ="is" class="fa-solid fa-users"></i><br>Follow Us</a>
		  </div>
                <h4 style="color: lightblue;"> if you are not a user ?<a href="icicilogin.html" style= color:orange;"text-decoration: underline;" >register</a></h4>
                  <h1>Safe Banking:Never Share Your User ID,password or any other<br>information with anyone on phone,sms oe email.ICICI Bank<br>
            does not call/email customers for such information. Beware of<br>
            fraudsters asking for such details posing as Bank Staff..</h1>
            
            
            </form>
          
         </center>
    </div>
    
 
</body>
</html>