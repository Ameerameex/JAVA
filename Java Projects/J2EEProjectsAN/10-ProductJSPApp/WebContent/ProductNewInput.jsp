<%@page import="com.ameex.training.business.Category"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="NewProductAdding">
<table>



<tr>
<td>ID</td>
<td><input type="text" name='txt_id'></td>
</tr>

<tr>
<td>NAME</td>
<td><input type="text" name='txt_name'></td>
</tr>

<tr>
<td>PRICE</td>
<td><input type="text" name='txt_price'></td>
</tr>

<tr>
<td>MANUFACTURING DATE</td>
<td><input type="text" name='txt_mdate'></td>
</tr>

<tr>
<td>Category</td>
<td><select name='combo_category'>
		<option value="-">Select Category</option>
		<%List<Category> categories=(List<Category>)request.getAttribute("categories");
		for(Category category:categories){
		%>
				<option value='<%=category.getCode()%>'><%=category.getDescription() %></option>	
					
		
		
	<% }	%>

</select></td>
</tr>

<tr>
<td colspan="2"><input type="submit" value="Save This Product"> <input  type="reset" value="Cancel The Data">
</td>
</tr>
</table>


</form>
<br>
<br>
<br>
<a href="MenuPage">Back To Menu</a>

</body>
</html>