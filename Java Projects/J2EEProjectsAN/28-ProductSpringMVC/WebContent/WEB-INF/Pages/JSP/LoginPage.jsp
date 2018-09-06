<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<style>
#tab1 {
	margin-top: 5cm;
	margin-left: 20cm;
	border: solid 4mm grey;
	padding-right: 3px;
	width: 5%;
	color: green;
	border-radius: 5mm;
	background-color: powderblue;
}

input[type="submit"] {
	margin-right: 6mm;
	background-color: green;
	height: 8mm;
	width: 25mm;
	border-radius: 3mm;
	box-shadow: 3px 3px grey;
}

input[type="reset"] {
	margin-right: 6mm;
	background-color: green;
	height: 8mm;
	width: 25mm;
	border-radius: 3mm;
	box-shadow: 3px 3px grey;
}

#td1 {
	text-align: center;
	background-color: rgb(0, 255, 0);
}

#td2 {
	text-align: center;
}

#td3 {
	text-align: center;
}
</style>


</head>
<body width="100%">
	<form:form action="validateUser" commandName="userCmd">
		<table id="tab1">

			<tr>
				
				<td colspan="2" id="td1">User Login</td>
			</tr>

			<tr>
				<td id="td2">User ID</td>
				<td><form:input path="userName"/>
				</td>
			</tr>

			<tr>
				<td id="td3">Password</td>
				<td><form:input path="password"/></td>
			</tr>

			<tr>
				<td><input type="submit" value="LOGIN"></td>
				<td><input type="reset" value="CANCEL"></td>
			</tr>
			<tr>
				<td colspan="2"><c:out value="${requestScope.message}"></c:out></td>
			</tr>
		</table>

	</form:form>
</body>
</html>