<%@page import="com.ameex.training.business.Category"%>
<%@page import="com.ameex.training.business.Product"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	
	<form:form action="productUpdate" commandName="productEditCmd">
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
				<td>MANUFACTURED DATE</td>
				<td><form:input path="manufacturedDate" /></td>

			</tr>
			<tr>
				<td>CATEGORY</td>
				<td><form:select path="category">
						<form:options items="${requestScope.categories}" itemValue="code"
							itemLabel="description"></form:options>
					</form:select></td>
			</tr>

			<tr>
				<td><input type="submit" name="" value="UPDATE THIS PRODUCT">
					<input type="reset" name="" value="CANCEL DATA"></td>
			</tr>
		</table>
	</form:form>
	<br>
	<br>
	<br>
	<a href="menu">Back To Menu</a>
</body>
</html>