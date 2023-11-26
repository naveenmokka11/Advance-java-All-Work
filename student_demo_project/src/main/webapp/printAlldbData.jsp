<%@page import="com.dto.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
tr:hover{
background-color:#D6EEEE;

}

th{
  padding: 15px;
}
tr{

padding: 15px;

}


</style>
</head>
<body>


<%List<Student> res= (List<Student>)request.getAttribute("li"); %> 



<table>

<tr>

<th>id</th>
<th>name</th>
<th>email</th>
<th>password</th>
<th>address</th>
<th>phone</th>
<th>Upadte</th>
<th>Delete</th>

</tr>


<%for(Student student:res) {%>

<tr>

<td><%=student.getId() %></td>
<td><%=student.getName() %></td>
<td><%=student.getEmail() %></td>
<td><%=student.getPassword() %></td>
<td><%=student.getAddress() %></td>
<td><%=student.getPhone() %></td>
<td><a href="update?id=<%=student.getId()%>"><button>update</button></a></td>
<td><a href="delete?id=<%=student.getId()%>"><button>delete</button></a></td>


</tr>

<%} %>

</table>

</body>
</html>