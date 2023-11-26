<%@page import="com.dto.Emp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%Emp caution=(Emp)request.getAttribute("msg");%>


<% if(caution!=null){%>
	<%=caution%>
<%} %>




<form action="login">
Enter Email:<input type="text" name="email">
Enter Password:<input type="text" name="pwd">
<input type="submit" value="Click here ">
</form>

</body>
</html>