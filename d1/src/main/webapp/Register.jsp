<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String msg=(String)request.getAttribute("redircet"); 
if(msg!=null){
	out.println(msg);
	
}
%>

<form action="regis">
Enter Name:<input type="text" name="name">
Enter Email:<input type="text" name="email">
Enter Password:<input type="text" name="password">
Enter Role:<input type="text" name="role">
Enter Phone:<input type="text" name="phone">
Enter Address:<input type="text" name="address">
<input type="submit" value="Register">
</form>


</body>
</html>