<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="StyleSheet" href="css/QuestionScreen.css">
</head>
<body>
	<img src="images/exam1.png" />
	<table align="center" border="1">
		<tr>
			<td><h3>QuestionNo</h3></td>
			<td><h3>Result</h3></td>
			<c:forEach items="${sessionScope.keys}" var="key">
				<tr>
					<td><c:out value="${key}"></c:out></td>
					<td><c:out value="${sessionScope.results.get(key)}"></c:out></td>

				</tr>
			</c:forEach>


	</table>
	<br>
	<br>
	<div align="center">
		<c:out value="${sessionScope.score}"></c:out>
		Out Of
		<c:out value="${sessionScope.total}"></c:out>
	</div>
	
</body>
</html>