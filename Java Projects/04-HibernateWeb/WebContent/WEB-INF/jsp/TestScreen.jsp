<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charse
t=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<img src="images/exam1.png" />
	<form action="Mark">
		<table align="center">
			<tr>
				<td><h2>${sessionScope.question.id}.${sessionScope.question.questionText}</h2></td><td><h3>Mark=${sessionScope.question.markWeightage}</h3></td>
			</tr>
			<c:forEach var="Qn" items="${sessionScope.question.answers}" >
				<tr>
					<td><input type="radio" name="Choice" value="${Qn.answerNumber}">${Qn.answerText}</td>
				</tr>
			</c:forEach>
			<tr>
				<td><input type="submit" value="NEXT"></td>
			</tr>

		</table>
	</form>
</body>
</html>