<%@page import="com.ameex.training.business.Category"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/Styles/NewProductInput2.css" />" rel="stylesheet">
</head>
<body>
	<form:form action="addNewProduct" commandName="productCmd">
		<table>



			<tr>
				<td>ID</td>
				<td><form:input path="id" /></td>
			</tr>

			<tr>
				<td>NAME</td>
				<td><form:input path="name" /></td>
			</tr>

			<tr>
				<td>PRICE</td>
				<td><form:input path="price" /></td>
			</tr>

			<tr>
				<td>MANUFACTURING DATE</td>
				<td><form:input path="manufacturedDate" /></td>
			</tr>

			<tr>
				<td>Category</td>
				<td><form:select path="category">
						<form:options items="${requestScope.categories }" itemValue="code"
							itemLabel="description"/>


						
					</form:select></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Save This Product">
					<input type="reset" value="Cancel The Data"></td>
			</tr>
		</table>


	</form:form>
	<br>
	<br>
	<br>
	<a href="menu">Back To Menu</a>

</body>
</html>