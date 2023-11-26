<%@page import="com.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Student s1=(Student)request.getAttribute("data"); %>
<%=s1.getId() %>
<%=s1.getName() %>
<%=s1.getEmail()%>



</body>
</html>