<%@page import="com.dto.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="services.css">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  </head>
</head>
<body>

<!-- heading -->

<!-- jsp code -->
<%Customer c1=(Customer)request.getAttribute("data"); %>
<!-- jsp code -->

<div class="waviy">
      <span class="sp" style="--i:1">I</span>
      <span class="sp" style="--i:2">C</span>
      <span class="sp"style="--i:3">I</span>
      <span class="sp"style="--i:4">C</span>
      <span class="sp"style="--i:5">i</span>
      <span class="sp"style="--i:5">-</span>
      <span class="sp" style="--i:6">B</span>
      <span class="sp" style="--i:7">a</span>
      <span class="sp" style="--i:8">N</span>
      <span class="sp" style="--i:8">k</span>
      <span class="sp" style="--i:8">-</span>
      <span class="sp" style="--i:9">S</span>
      <span class="sp" style="--i:9">E</span>
      <span class="sp" style="--i:9">R</span>
      <span class="sp" style="--i:9">V</span>
      <span class="sp" style="--i:9">I</span>
      <span class="sp" style="--i:9">C</span>
       <span class="sp" style="--i:9">E</span>
     </div>


<!-- heading closed -->



    
    <div class="box-2">
      <a href="Fetch?id=<%=c1.getId()%>">
        <div class="btn btn-two">
           <span> CHECK YOUR DATA</span>
        </div>
        </a>
      </div>


      <div class="box-2">
      <a href="Update?id=<%=c1.getId()%>">
        <div class="btn btn-two">
          <span>UPDATE YOUR DATA</span>
        </div>
        </a>
      </div>



      <div class="box-2">
      <a href="AddBalance?id=<%=c1.getId()%>">
        <div class="btn btn-two">
          <span>ADD BALANCE</span>
        </div>
        </a>
      </div>



      <div class="box-2">
      <a href="CheckBalance?id=<%=c1.getId()%>">
        <div class="btn btn-two">
          <span>CHECK BALANCE</span>
        </div>
        </a>
      </div>
      
      <div class="box-2">
      <a href="Loan?id=<%=c1.getId()%>">
        <div class="btn btn-two">
          <span>LOAN</span>
        </div>
        </a>
      </div>


      <div class="box-2">
      <a href="Delete?id=<%=c1.getId()%>">
        <div class="btn btn-two">
          <span>DELETE ACCOUNT</span>
        </div>
        </a>
      </div>

      <div class="box-2">
      <a href="Home.jsp">
        <div class="btn btn-two">
          <span >LOG-OUT</span>
        </div>
        </a>
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