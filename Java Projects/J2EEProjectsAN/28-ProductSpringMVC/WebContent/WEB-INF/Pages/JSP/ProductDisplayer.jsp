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
<link href="<c:url value="/Styles/ProductDisplayer.css" />" rel="stylesheet">

</head>
<body>


	<h1>Product Details</h1>
	<table>
		<tr>
			<td class="caption">ID</td>
			<td><c:out value="${requestScope.product.id}"></c:out></td>
		</tr>

		<tr>
			<td class="caption">NAME</td>
			<td><c:out value="${requestScope.product.name}"></c:out></td>
		</tr>

		<tr>
			<td class="caption">PRICE</td>
			<td><c:out value="${requestScope.product.price}"></c:out></td>
		</tr>

		<tr>
			<td class="caption">MANUFACTURED DATE</td><td><fmt:formatDate value="${requestScope.product.manufacturedDate}"
							pattern="dd-MM-yyyy" var="res" /> <c:out value="${res}"></c:out>
		</td>
		</tr>

		<tr>
			<td class="caption">CATEGORY</td><td>	<c:choose><c:when test="${requestScope.product.category eq '76'}">
		     	LAPTOP
		     	</c:when>

							<c:when test="${requestScope.product.category eq '77'}">
		     	MOBILE PHONE
		     			     	</c:when>

							<c:when test="${requestScope.product.category eq '84'}">
		     	TELEVISION
		     			     	</c:when>

							<c:when test="${requestScope.product.category eq '65'}">
		     	AIR CONTITIONER
		     		   </c:when>
</c:choose>
		</td>
		</tr>
	</table>
	<br>
<br>

	<a href="ProductListDownload">Download ad XML</a>
	<a href="ProductListDownloadExcel">Download ad Excel file</a>
	
	<br>
<br>
<br>
<a href="menu">Back To Menu</a>
</body>
</html>