<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/Styles/ProductSearchInput.css" />" rel="stylesheet">
</head>
<body>
	<form action="searchProduct">
		<table>


			<tr>
				<td>ID</td>
				<td><input name='txt_id'></td>
			</tr>



			<tr>
				<td colspan="2"><input type="submit" value="Show This Product"><input
					type="reset" value="Cancel The Data"></td>
			</tr>
		</table>


	</form>
	<br>
	<br>
	<br>
	<a href="menu">Back To Menu</a>
</body>
</html>