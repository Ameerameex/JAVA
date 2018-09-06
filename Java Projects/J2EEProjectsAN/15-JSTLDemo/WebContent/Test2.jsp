<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
td {
	border: solid thin black;
	width: 1cm;
	background-color: black;
	color: white;
	font-size: medium;
	font-family: verdana;
	text-align: center;
}
a{
color: white;
}
</style>
</head>
<body>
	<table>
		<tr>
			<c:forEach var="i" begin="1" end="10" step="2">
				<td><a href=""> <c:out value="${i}"></c:out></td>
				</a>

			</c:forEach>
		</tr>
	</table>
</body>
</html>