<%@page import="java.util.List"%>
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

<%List<Emp> li=(List<Emp>)request.getAttribute("empli"); %>
<table border="2px solid black">
<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Password</th>
<th>Role</th>
<th>Phone</th>
<th>Address</th>
<th>Update</th>
<th>Delete</th>

</tr>


<% for(Emp e:li){ %>
<tr>

<td><%=e.getId() %></td>
<td><%=e.getName() %></td>
<td><%=e.getEmail() %></td>
<td><%=e.getPassword()%></td>
<td><%=e.getRole() %></td>
<td><%=e.getPhone() %></td>
<td><%=e.getAddress() %></td>
<td><a href="Upadte?id=<%=e.getId()%>"><button>Update</button></a></td>
<td><a href="delete?id=<%=e.getId()%>"><button>delete</button></a></td>
</tr>
<%} %>
</table>
</body>
</html>