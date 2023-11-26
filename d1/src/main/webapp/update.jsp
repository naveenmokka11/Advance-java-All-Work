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
<%Emp emp=(Emp)request.getAttribute("empdate"); %>




<form action="edit">
Enter id:<input type="text" name="id" value="<%= emp.getId()%>" readonly="true">
Enter Name:<input type="text" name="name" value="<%= emp.getName()%>">
Enter Email:<input type="text" name="email" value="<%= emp.getEmail()%>">
Enter Password:<input type="text" name="pwd" value="<%= emp.getPassword()%>">
Enter Phone:<input type="text" name="phone" value="<%= emp.getPhone()%>">
Enter Role:<input type="text" name="role" value="<%= emp.getRole()%>">
Enter Address:<input type="text" name="address" value="<%= emp.getAddress()%>">
<input type="submit" value="click here">
</form>
</body>
</html>