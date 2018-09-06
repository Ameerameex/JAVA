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
	<jsp:useBean id="product" scope="request"
		class="com.ameex.training.business.Product"></jsp:useBean>
	<form action="ProductUpdating">
		<table>



			<tr>
				<td>ID</td>
				<td><input type="text" name='txt_id'
					value='<jsp:getProperty property="id" name="product"/>'></td>
			</tr>

			<tr>
				<td>NAME</td>
				<td><input type="text" name='txt_name'
					value='<jsp:getProperty property="name" name="product"/>'></td>
			</tr>

			<tr>
				<td>PRICE</td>
				<td><input type="text" name='txt_price'
					value='<jsp:getProperty property="price" name="product"/>'></td>
			</tr>

			<tr>
				<td>MANUFACTURING DATE</td>
				<%
					Product product2 = (Product) request.getAttribute("product");
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
					Date mdate = product2.getManufacturedDate();
					String output = "";
					if (mdate != null) {
						output = dateFormat.format(mdate);
					}
				%>
				<td><input type="text" name='txt_mdate' value='<%=output%>'></td>
			</tr>

			<tr>
				<td>Category</td>

				<td><select name='combo_category'>
						<option value="-">Select Category</option>
						<%
							char ch = product.getCategory();
						%>
						<%
							List<Category> categories = (List<Category>) request.getAttribute("categories");
							for (Category category : categories) {
						%>
						<%
							if (ch == category.getCode()) {
						%>
						<option selected value='<%=category.getCode()%>'><%=category.getDescription()%></option>
						<%
							} else {
						%>
						<option value='<%=category.getCode()%>'><%=category.getDescription()%></option>
						<%
							}
						%>

						<%
							}
						%>

				</select></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit"
					value="Update This Product"> <input type="reset"
					value="Cancel The Data"></td>
			</tr>
		</table>


	</form>
	<br>
	<br>
	<br>
	<a href="MenuPage">Back To Menu</a>

</body>
</html>