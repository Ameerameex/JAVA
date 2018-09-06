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
<link href="<c:url value="/Styles/MenuPage2.css" />" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>
	<table>
		<tr>
			<td class="button"><i class="fa fa-plus-circle" aria-hidden="true"></i><a href="NewProductScreen">New Product Data</a></td>
			<td class="button"><i class="fa fa-search-minus" aria-hidden="true"></i><a href="SearchProductScreen">Find Product Data</a></td>
			<td class="button"><i class="fa fa-pencil-square" aria-hidden="true"></i><a href="EditInputScreen">Edit Product Data</a></td>
			<td class="button"><i class="fa fa-window-close" aria-hidden="true"></i><a href="DeleteInputScreen">Delete Product Data</a></td>
			<td class="button"><i class="fa fa-sticky-note-o" aria-hidden="true"></i><a href="ProductListing">Display Product Data</a></td>
			<td class="button"><i class="fa fa-sign-out" aria-hidden="true"></i><a href="Logout">[<c:out
						value="${sessionScope.user.userName}"></c:out>]Logout
			</a></td>

		</tr>
	</table>
</body>
</html>