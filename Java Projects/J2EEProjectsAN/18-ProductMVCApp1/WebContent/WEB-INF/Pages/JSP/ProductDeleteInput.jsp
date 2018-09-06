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
</head>
<body>

	<table>

		<c:forEach var="product" items="${requestScope.productList}">
			<tr>
				<td><c:out value="${product.name}"></c:out></td>
				<td>
					<form action="ProductDeleting.action">
					<input type="hidden" name='txt_id' value="${product.id}">
						<input type="submit" value="DELETE">
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>



	<br>
	<br>
	<br>
	<a href="MenuPage.action">Back To Menu</a>

</body>
</html>