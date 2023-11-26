<%@page import="com.dto.Bank"%>
<%@page import="com.dto.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link rel="stylesheet" href="r1.css">







<style>
    .register{
    background: -webkit-linear-gradient(left,#F37E20, #eb9e5f);
    margin-top: 3%;
    padding: 3%;
}
.register-left{
    text-align: center;
    color: #fff;
    margin-top: 4%;
}
.register-left input{
    border: none;
    border-radius: 1.5rem;
    padding: 2%;
    width: 60%;
    background: #f8f9fa;
    font-weight: bold;
    color: #383d41;
    margin-top: 30%;
    margin-bottom: 3%;
    cursor: pointer;
}
.register-left input:hover{
    background-color:#98281E ;
    color: #fff;

}
.register-right{
    background: #f8f9fa;
    border-top-left-radius: 10% 50%;
    border-bottom-left-radius: 10% 50%;
}
.register-left img{
    margin-top: 15%;
    margin-bottom: 5%;
    width: 25%;
    -webkit-animation: mover 2s infinite  alternate;
    animation: mover 1s infinite  alternate;
}
@-webkit-keyframes mover {
    0% { transform: translateY(0); }
    100% { transform: translateY(-20px); }
}
@keyframes mover {
    0% { transform: translateY(0); }
    100% { transform: translateY(-20px); }
}
.register-left p{
    font-weight: lighter;
    padding: 12%;
    margin-top: -9%;
}
.register .register-form{
    padding: 10%;
    margin-top: 10%;
}
.btnRegister{
    float: right;
    margin-top: 10%;
    border: none;
    border-radius: 1.5rem;
    padding: 2%;
    background:#F37E20;
    color: #fff;
    font-weight: 600;
    width: 50%;
    cursor: pointer;
    
}
.btnRegister:hover{
    background-color: #98281E;

}
.register .nav-tabs{
    margin-top: 3%;
    border: none;
    background: #0062cc;
    border-radius: 1.5rem;
    width: 28%;
    float: right;
}
.register .nav-tabs .nav-link{
    padding: 2%;
    height: 34px;
    font-weight: 600;
    color: #fff;
    border-top-right-radius: 1.5rem;
    border-bottom-right-radius: 1.5rem;
}
.register .nav-tabs .nav-link:hover{
    border: none;
}
.register .nav-tabs .nav-link.active{
    width: 100px;
    color: #cc7700;
    border: 2px solid #cc8500;
    border-top-left-radius: 1.5rem;
    border-bottom-left-radius: 1.5rem;
}
.register-heading{
    text-align: center;
    margin-top: 8%;
    margin-bottom: -15%;
    color: #F37E20;
}
</style>

</head>
<body>
<!--jsp code  -->
<%Customer c1=(Customer)request.getAttribute("c1"); %>
<%Bank b1=(Bank)request.getAttribute("b1"); %>


<!-- jsp code -->

<!------ Include the above in your HEAD tag ---------->

<div class="container register">
                <div class="row">
                    <div class="col-md-3 register-left">
                        <img src="https://image.ibb.co/n7oTvU/logo_white.png" alt=""/>
                        <h3>ICICI Bank</h3>
                        <p>Thanks To being a ICICI customer</p>
                       
                    </div>
                    <div class="col-md-9 register-right">
                        <ul class="nav nav-tabs nav-justified" id="myTab" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link active" id="home-tab" data-toggle="tab" href="Home.jsp" role="tab" aria-controls="home" aria-selected="true">HOME</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">Help/contact us</a>
                            </li>
                        </ul>
                        <div class="tab-content" id="myTabContent">
                            <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                                <h3 class="register-heading">UPDATE YOUR DETAILS</h3>
                                <div class="row register-form">




                                    <div class="col-md-6">
                                        <div class="form-group">
                                            
                                            <form action="Edit" method="post">
                                            
                                            id:<input type="text" class="form-control" placeholder="Last Name *" name="cid"  value="<%=c1.getId()%>"readonly="readonly"  />
                                        </div>
                                        
                                            <div class="form-group">
                                            First Name:<input type="text" class="form-control" placeholder="First Name *"name="FName"  value="<%=c1.getCFirstName() %>"  />
                                        </div>
                                        
                                        <div class="form-group">
                                            Last Name:<input type="text" class="form-control" placeholder="Last Name *" name="LName"  value="<%=c1.getCLastName() %>" />
                                        </div>
                                        
                                        <div class="form-group">
                                            Email:<input type="email" class="form-control" placeholder="Your Email *"name="Email" value="<%=c1.getCEmail() %>" readonly="readonly"  />
                                        </div>
                                        <div class="form-group">
                                            Password:<input type="text" class="form-control" placeholder="Password *"name="Pwd"  value="<%=c1.getCPassword() %>"   />
                                        </div>
                                        <div class="form-group">
                                            Phone:<input type="tel" minlength="10" maxlength="10"  class="form-control" placeholder="Your Phone *"  name="Phone" value="<%=c1.getPhone() %>"/>
                                        </div>

                                        <div class="form-group">
                                           Age: <input type="number" class="form-control" placeholder="Enter Your age *" name="age" value="<%=c1.getAge() %>"  />
                                            
                                        </div>

                                        <div class="form-group">
                                            Gender:<input type="text" class="form-control" placeholder="Enter Your gender *" name="gender"   value="<%=c1.getGender() %>" />
                                            
                                        </div>
                                        
                                        
                                    </div>




                                    <div class="col-md-6">
                                        
                                        
                                        <div class="form-group">
                                           Address: <input type="text" class="form-control" placeholder="Enter Your address *"  value="<%=c1.getAddress() %>" name="address"/>
                                            
                                        </div>
                                        <div>
                                             Bank id:<input type="text" class="form-control" placeholder="Last Name *" name="bid"  value="<%=b1.getId()%>" readonly="readonly" />
                                        </div>
                                        
                                        
                                        <div class="form-group">
                                           Proof: <input type="text" class="form-control" placeholder=" Id proof  *" name="idproof"  value="<%=b1.getProof() %>"  />
                                        </div>

                                        <div class="form-group">
                                           A/c No: <input type="text" class="form-control" placeholder=" Account number*" name="accno" value="<%=b1.getAccNo() %>" readonly="readonly"  />
                                        </div>

                                        
                                        <div class="form-group">
                                            Branch Name:<input type="text" class="form-control" placeholder="Branch Name *" name="branchname"  value="<%=b1.getBranchName() %>"/>
                                        </div>
                                        <div class="form-group">
                                            Customer Care:<input type="tel" class="form-control" placeholder="Branch Name *" name="bphone" value="18001080" readonly />
                                        </div>

                                        <div class="form-group">
                                            Bal:<input type="number" class="form-control" placeholder="You can Add Balance *"  name="balnce"  value="<%=b1.getBalance() %>"/>
                                        </div>

                                        <div class="form-group">
                                           Account Type :<input type="text" class="form-control" placeholder=" Account type*" name="accType" value="<%=b1.getAccountType() %>" />
                                        </div>
                                        
                                        <input type="submit" class="btnRegister"  value="UPDATE"/>

                                    </div>

                                </form>

                                </div>
                            </div>


                            <!-- <div class="tab-pane fade show" id="profile" role="tabpanel" aria-labelledby="profile-tab">



                                <h3  class="register-heading">Apply as a Hirer</h3>
                                <div class="row register-form">
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="First Name *" value="" />
                                        </div>
                                        
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="Last Name *" value="" />
                                        </div>
                                        <div class="form-group">
                                            <input type="email" class="form-control" placeholder="Email *" value="" />
                                        </div>
                                        <div class="form-group">
                                            <input type="text" maxlength="10" minlength="10" class="form-control" placeholder="Phone *" value="" />
                                        </div>


                                    </div>




                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <input type="password" class="form-control" placeholder="Password *" value="" />
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="form-control" placeholder="Confirm Password *" value="" />
                                        </div>
                                        <div class="form-group">
                                            <input type="number" class="form-control" placeholder="age *" value="" />
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="`Answer *" value="" />
                                        </div>
                                        <input type="submit" class="btnRegister"  value="Register"/>
                                    </div>



                                </div>
                            </div>
 -->


                        </div>
                    </div>
                </div>

            </div>

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