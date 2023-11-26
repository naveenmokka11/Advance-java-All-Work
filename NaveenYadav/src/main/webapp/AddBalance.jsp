<%@page import="com.dto.Bank"%>
<%@page import="com.dto.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<style>
h2   {color:white}
p    {color:white}

body, html {
    height: 100%;
    background-repeat: no-repeat;
    margin:0%;
    /*background-image: linear-gradient(135deg, rgba(31,123,229,1) 0%, rgba(58,139,232,1) 47%, rgba(70,153,234,1) 92%, rgba(72,156,234,1) 100%);*/
    /* background-image: url("http://p1.pichost.me/640/54/1777799.jpg"); 
    background-size: 100% 100%; */
}

.card-container.card {
    width: 350px;
    padding: 40px 40px;
    border-radius: 20px;
}

.btn {
    font-weight: 700;
    height: 36px;
    -moz-user-select: none;
    -webkit-user-select: none;
    user-select: none;
    cursor: default;
}

/*
 * Card component
 */
.card {
    background-color: #F7F7F7;
    /* just in case there no content*/
    padding: 20px 25px 30px;
    margin: 0 auto 25px;
    margin-top: 50px;
    /* shadows and rounded borders */
    -moz-border-radius: 2px;
    -webkit-border-radius: 2px;
    border-radius: 2px;
    -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
}

.profile-img-card {
    width: 96px;
    height: 96px;
    margin: 0 auto 10px;
    display: block;
    -moz-border-radius: 50%;
    -webkit-border-radius: 50%;
    border-radius: 50%;
}

/*
 * Form styles
 */
.profile-name-card {
    font-size: 16px;
    font-weight: bold;
    text-align: center;
    margin: 10px 0 0;
    min-height: 1em;
}

.reauth-email {
    display: block;
    color: #404040;
    line-height: 2;
    margin-bottom: 10px;
    font-size: 14px;
    text-align: center;
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
    -moz-box-sizing: border-box;
    -webkit-box-sizing: border-box;
    box-sizing: border-box;
}

.form-signin #inputEmail,
.form-signin #inputPassword {
    direction: ltr;
    height: 44px;
    font-size: 16px;
}

.form-signin input[type=email],
.form-signin input[type=password],
.form-signin input[type=text],
.form-signin button {
    width: 100%;
    display: block;
    margin-bottom: 10px;
    z-index: 1;
    position: relative;
    -moz-box-sizing: border-box;
    -webkit-box-sizing: border-box;
    box-sizing: border-box;
}

.form-signin .form-control:focus {
    border-color: rgb(104, 145, 162);
    outline: 0;
    -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgb(104, 145, 162);
    box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgb(104, 145, 162);
}

.btn.btn-signin {
    /*background-color: #4d90fe; */
    /*background-color: rgb(104, 145, 162);
    / background-color: linear-gradient(rgb(104, 145, 162), rgb(12, 97, 33));*/
    padding: 0px;
    font-weight: 700;
    font-size: 14px;
    height: 36px;
    -moz-border-radius: 3px;
    -webkit-border-radius: 3px;
    border-radius: 3px;
    border: none;
    -o-transition: all 0.218s;
    -moz-transition: all 0.218s;
    -webkit-transition: all 0.218s;
    transition: all 0.218s;
}


.forgot-password {
    color: rgb(104, 145, 162);
}

.forgot-password:hover,
.forgot-password:active,
.forgot-password:focus{
    color: rgb(12, 97, 33);
}
</style>


</head>
<body style="background-color:  #F37E20;">
<!--jsp code -->
<%Customer c1=(Customer)request.getAttribute("c1"); %>
<%Bank b1=(Bank)request.getAttribute("b1"); %>


<!-- jsp code -->




    <!------ Include the above in your HEAD tag ---------->
    <img src="https://www.icicibank.com/content/dam/icicibank/icici-assets/footer-logo.png">
    <h2></h2>
    
    
        <div class="container">
            
            <div class="card card-container">
                <h2 style="background-color: #F37E20; height: 30PX ; width: 300PX ; border-radius: 5PX; text-align: center;">ADD  BALANCE</h2>
                <!-- <img class="profile-img-card" src="//lh3.googleusercontent.com/-6V8xOA6M7BA/AAAAAAAAAAI/AAAAAAAAAAA/rzlHcD0KYwo/photo.jpg?sz=120" alt="" /> -->
                <img id="profile-img" class="profile-img-card" src="https://static.vecteezy.com/system/resources/previews/015/275/963/original/dollar-money-bag-free-png.png" />
                <p id="profile-name" class="profile-name-card"></p>
                
                
                <form class="form-signin" action="balanceUpadte">
                    <span id="reauth-email" class="reauth-email"></span>
 					<input type="number" id="inputPassword" class="form-control"  required name="id"  value="<%=b1.getId()%>"  readonly="readonly">
                    
                    <input type="email" id="inputEmail" class="form-control" placeholder="Account number" required autofocus name="accno" value="<%=b1.getAccNo() %>" readonly="readonly">
                    <input type="text" id="inputPassword" class="form-control" placeholder="Enter Amount" required   name="bal"  value="<%=b1.getBalance()%>" >
                    <div id="remember" class="checkbox">
                        <!-- <label>
                            <input type="checkbox" value="remember-me"> Recordarme
                        </label> -->
                    </div>
                    <button class="btn btn-lg btn-success btn-block btn-signin" type="submit">Add Amount</button>
                </form><!-- /form -->
                
            </div><!-- /card-container -->
        </div><!-- /container -->


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





    
</body>
</html>