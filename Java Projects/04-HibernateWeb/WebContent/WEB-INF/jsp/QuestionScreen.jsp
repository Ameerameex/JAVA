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
	<form action="Read">
		<table align="center">
			<tr>
				<td><h2>Enter the question</h2></td>
			</tr>



			<tr>
				<td><input type="text" id="textbox" name="txt_qn"
					placeholder="Type a Question..." required></td>

			</tr>


			<c:forEach begin="1" end="4" var="i">
				<tr>
					<td><input type="radio" name="choiceNo" value="${i}" required>

						<input type="text" name="choices" placeholder="choice ..."
						required></td>
				</tr>
			</c:forEach>


			<tr>
				<td><h4>Enter the mark</h4></td>
			</tr>
			<tr>
				<td><input type="text" name="mark" value="1"></td>
			</tr>

			<tr>
			</tr>
			<tr>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>

		</table>
	</form>
</body>
</html>