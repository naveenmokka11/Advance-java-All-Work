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
<%
	Student stu=(Student)request.getAttribute("test");
%>
<table border="2px solid black">



<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Phone</th>
<th>Adress</th>
</tr>



<tr>
<td><%=stu.getId() %></td>
<td><%=stu.getName() %></td>
<td><%=stu.getEmail() %></td>
<td><%=stu.getPhone()%></td>
<td><%=stu.getAddress() %></td>

</tr>

</table>










</body>
</html>