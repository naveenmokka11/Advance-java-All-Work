<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<form:form action="save" modelAttribute="user">

Name :<form:input path="name" />
Email :<form:input path="email" />
Password :<form:input path="pwd" />
phone :<form:input path="phone" />
		<form:button href="">Submit</form:button>






	</form:form>

</body>
</html>