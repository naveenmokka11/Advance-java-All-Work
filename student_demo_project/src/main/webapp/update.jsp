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
	Student res = (Student) request.getAttribute("upadte");
	%>
	<form action="edit" method="post">
		<label>id</label>&nbsp; &nbsp;<input type="text" name="id" value="<%=res.getId()%>" readonly="true">
		<label>Name</label>&nbsp; &nbsp;<input type="text" name="name" value="<%=res.getName()%>">
		<label>Email</label>&nbsp; &nbsp;<input type="email" name="email" value="<%=res.getEmail()%>"readonly="true" >
		<label>Password</label><input type="password" name="pwd" value="<%=res.getPassword()%>">
		 <label>Phone</label>&nbsp; &nbsp;<input type="tel"name="phone" value="<%=res.getPhone()%>">
		<label>Address</label>&nbsp; &nbsp;<input type="text"name="address" value="<%=res.getAddress()%>" ><br>
		<input type="submit"value="Click-Me For Register">



	</form>



</body>
</html>