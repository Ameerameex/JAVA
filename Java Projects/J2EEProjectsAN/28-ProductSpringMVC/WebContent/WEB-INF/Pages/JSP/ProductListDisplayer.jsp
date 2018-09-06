<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.ameex.training.business.Product"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/Styles/ProductListDisplayer.css" />" rel="stylesheet"></head>
<body>

	<%-- <%
		List<Product> allProducts = (List<Product>) request.getAttribute("productList");
	%> --%>

	<h1>Product Listing</h1>

	<br>
	<br>
	<h2>

		<c:out value="${fn:length(productList)}" />
		Products Found

	</H2>
	<br>
	<br>
	<br>


	<c:if test="${fn:length(productList) gt 0}">

		<table>
			<tr>
				<th><c:out value="ID"></c:out></th>
				<th><c:out value="NAME"></c:out></th>
				<th><c:out value="PRICE"></c:out></th>
				<th><c:out value="MANUFACTURED DATE"></c:out></th>
				<th><c:out value="CATEGORY"></c:out></th>
			</tr>



			 <c:forEach var="row" items="${requestScope.productList}">

				<tr>
					<td><c:out value="${row.id}"></c:out></td>
					<td><c:out value="${row.name}"></c:out></td>
					<td><c:out value="${row.price}"></c:out></td>
					<td><fmt:formatDate value="${row.manufacturedDate}"
							pattern="dd-MM-yyyy" var="res" /> <c:out value="${res}"></c:out>
					</td>
					<td align="center"><c:choose>
							<c:when test="${row.category eq '76'}">
		     	LAPTOP
		     	</c:when>

							<c:when test="${row.category eq '77'}">
		     	MOBILE PHONE
		     			     	</c:when>

							<c:when test="${row.category eq '84'}">
		     	TELEVISION
		     			     	</c:when>

							<c:when test="${row.category eq '65'}">
		     	AIR CONTITIONER
		     		   </c:when>




						</c:choose></td>

				</tr>

			</c:forEach> 

		</table>


	</c:if>
<br>
<br>

	<a href="ProductListDownload">Download ad XML</a>
	<a href="ProductListDownloadExcel">Download ad Excel file</a>

	<br>
	<br>
	<br>
	<a href="menu">Back to menu</a>

</body>
</html>
