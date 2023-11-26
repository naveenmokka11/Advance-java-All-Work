<%@page import="com.dto.Bank"%>
<%@page import="com.dto.Customer"%>

 <%@ page import= "java.time.LocalDateTime"  %>
 <%@ page import= "java.time.format.DateTimeFormatter"  %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    table { border: 1px solid #5c743d;
            width: 600px;
      
            border-spacing: 0; 
            margin: auto; }
    td, th { padding: 10px; 
             font-family: Arial, sans-serif;  } 
    caption { font-family: Arial;
               font-size: 1.2em;
               font-weight: bold; 
               padding-bottom: 5px;}
    tr:nth-of-type(even) { background-color:rgba(0, 128, 0, 0.463); } 
    tr:first-of-type { background-color: blue; 
                       color: #eaeaea; }
    </style>



  </head>
  <body style="background-color: #ec6d06;">
  <!--jsp code -->
<%Customer c1=(Customer)request.getAttribute("c1"); %>
<%Bank b1=(Bank)request.getAttribute("b1"); %>


<!-- jsp code -->
  
  
  
 <table summary="A description of the specialty coffee menu items with one item listed in each row. The first column contains the name of the menu item. The second column describes the specialty coffee. The third column contains the price.">
 <caption>YOUR ACCOUNT BALANCE</caption><img src="https://www.icicibank.com/content/dam/icicibank/icici-assets/footer-logo.png"  >
 
   <tr>
     <th>DATE</th>
	 <th>ACCOUNT NUMBER</th>
     <th>BALANCE</th>
  </tr>
  <tr>
     <td><%=java.time.LocalDate.now()%></td>
     <td><%=b1.getAccNo() %></td>
	 <td><%=b1.getBalance() %></td>
  </tr>



    
      
</table>



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