
<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%   
	String msg=(String)request.getAttribute("msg");


	if(msg!=null){
	out.println(msg);

	}

	
%>

	<form action="login">
		<input type="text" name="email">
		<input type="text" name="pwd">
		<input type="submit">
	</form>


</body>
</html>