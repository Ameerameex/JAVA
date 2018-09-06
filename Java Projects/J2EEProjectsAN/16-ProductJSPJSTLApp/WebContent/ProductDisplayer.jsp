<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="Styles/ProductDisplayer.css" rel="stylesheet">

</head>
<body>


	<h1>Product Details</h1>
	<table>
		<tr>
			<td class="caption">ID</td>
			<td><c:out value="${requestScope.id}"></c:out></td>
		</tr>

		<tr>
			<td class="caption">NAME</td>
			<td><c:out value="${requestScope.name}"></c:out></td>
		</tr>

		<tr>
			<td class="caption">PRICE</td>
			<td><c:out value="${requestScope.price}"></c:out></td>
		</tr>

		<tr>
			<td class="caption">MANUFACTURED DATE</td>
			<td><fmt:formatDate value="${ requestScope.manufacturedDate}"
					pattern="dd-MM-yyyy" var="res" /> <c:out value="${res}"></c:out></td>

		</tr>

		<tr>
			<td class="caption">CATEGORY</td>
			<td><c:choose>
					<c:when test="${requestScope.category eq 'L'}">
						<c:out value="LAPTOP"></c:out>
						<c:when test="${requestScope.category eq 'M'}">
							<c:out value="MOBILE"></c:out>
						</c:when>
						<c:when test="${requestScope.category eq 'T'}">
							<c:out value="TELEVISION"></c:out>
						</c:when>
						<c:when test="${requestScope.category eq 'A'}">
							<c:out value="AIR CONDITIONER"></c:out>
						</c:when>
					</c:when>
				</c:choose></td>
		</tr>
	</table>
	<br>
	<br>
	<br>
	<a href="MenuPage">Back To Menu</a>
</body>
</html>