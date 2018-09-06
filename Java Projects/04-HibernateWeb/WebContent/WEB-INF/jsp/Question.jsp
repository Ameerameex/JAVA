<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
	
}

img {
	width: 50%;
	height: 30%;
}
</style>
</head>
<body>
	<img src="AllImages/Banners/welcome-images-24.png">
	<form action="Question">

		<table>
			<tr>
				<td><textarea rows="3" cols="60" name="text_qn"><c:out
							value="${requestScope.question.questionText}"></c:out></textarea></td>
			</tr>
			<tr>
				<td><c:forEach items="${requestScope.question.answers}"
						var="ch">
						<tr>
							<td><input type="radio" value="${ch.answerNumber}"
								name="rad_chioice"><input type="text">
							<c:out value="${ch.answerText}"></c:out>
					</c:forEach></td>
			</tr>
			<tr>
				<td><input type="submit" value="Next">
		</table>

	</form>
</body>
</html>