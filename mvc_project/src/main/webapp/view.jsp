<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
hello

<table border="2px solid black">
<tr>
<th>ID</th>
<th>NAME</th>
<th>Email</th>
<th>phone</th>
<th>Update</th>
<th>Delete</th>
</tr>

<c:forEach items ="${li}" var="user"  >

<tr>
<td>${user.getId()}</td>
<td>${user.getName()}</td>
<td>${user.getEmail()}</td>
<td>${user.getPhone()}</td>
<td><a href="update?id=${user.getId()}">Update</a></td>
<td><a href="delete?id=${user.getId()}">Delete</a></td>
</tr>

</c:forEach>
</table>
<a href="index.jsp"><button>Home</button></a>
</body>
</html>