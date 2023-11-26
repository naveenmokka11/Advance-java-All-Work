<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <link rel="stylesheet" href="l2.css">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<style>
    
#login {
	-webkit-perspective: 1000px;
	-moz-perspective: 1000px;
	perspective: 1000px;
	margin-top:50px;
	margin-left:32%;
    
}
.login {
	font-family: 'Josefin Sans', sans-serif;
    
	-webkit-transition: .3s;
	-moz-transition: .3s;
	transition: .3s;
	-webkit-transform: rotateY(40deg);
	-moz-transform: rotateY(40deg);
	transform: rotateY(40deg);
    border-radius: 50px;
    margin-top: 80px;
}
.login:hover {
	-webkit-transform: rotate(0);
	-moz-transform: rotate(0);
	transform: rotate(0);
}
/* .login article {
	
} */
.login .form-group {
	margin-bottom:100px;
}
.login .form-control{
    margin-top: 10px;
}
.login .btn {
	border-radius:0;
}
.login .btn {
	text-transform:uppercase;
	letter-spacing:3px;
}
.input-group-addon {
	border-radius:0;
	color:#fff;
	background:#f3aa0c;
	border:#f3aa0c;
}
.forgot {
	font-size:16px;
}
.forgot a {
	color:#333;
}
.forgot a:hover {
	color:#5cb85c;
}

#inner-wrapper, #contact-us .contact-form, #contact-us .our-address {
    color: #ca1818;
    font-size: 19px;
    line-height: 1.7em;
    font-weight: 300;
    padding: 50px;
    background: #fff;
    box-shadow: 0 2px 5px 0 rgba(0, 0, 0, 0.16), 0 2px 10px 0 rgba(0, 0, 0, 0.12);
    margin-bottom: 100px;
}
.input-group-addon {
    border-radius: 0;
        border-top-right-radius: 0px;
        border-bottom-right-radius: 0px;
    color: #fff;
    background: #f3aa0c;
    border: #f3aa0c;
        border-right-color: rgb(243, 170, 12);
        border-right-style: none;
        border-right-width: medium;
}
</style>


</head>
<body style="background-color: #F37E20;">
   
<!------ Include the above in your HEAD tag ---------->
<%String pwd=(String)request.getAttribute("wrongPwd"); %>
<%String email=(String)request.getAttribute("wrongEmail"); %>


<div class="col-md-4 col-md-offset-4" id="login">
						<section id="inner-wrapper" class="login">
							<article>
                              <center>  <img src="https://www.icicibank.com/content/dam/icicibank/icici-assets/footer-logo.png" alt=""></center>
								<form action="login" method="post">
									<%if(email!=null){ %>
										<span class="alert alert-danger" role="alert">
										  <%=email %>
										</span>
									<%} %>
								
									<div class="form-group">
										<div class="input-group"post>
											<span class="input-group-addon"><i class="fa fa-envelope"> </i></span>
											<input type="email" class="form-control" placeholder="Email Address" required="required" name="email">
										</div>
									</div>
									<%if(pwd!=null){ %>
										<span class="alert alert-danger" role="alert">
										  <%=pwd %>
										</span>
									<%} %>
									<div class="form-group">
										<div class="input-group">
											<span class="input-group-addon"><i class="fa fa-key"> </i></span>
											<input type="password" class="form-control" placeholder="Password" required="required" name="pwd">
										</div>
									</div>
									  <input type="submit" class="btn btn-success btn-block" value="Login">
									  <div class="forgot">
										<!-- <a href="forgot-password.html">Forget Password?</a> | <a href="register.html">New User?</a> -->
									  </div>
								</form>
							</article>
						</section></div>



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