<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.ameex.training.business.Product"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="Styles/ProductListDisplayer.css" rel="stylesheet">
<%
	List<Product> products = (List<Product>) request.getAttribute("productList");
%>
<h1>Product Listing</h1>
<br>
<br><h2>
<%=products.size()%> Products Found</h2>
<br>
<br><br>

<%
	if (products.size() > 0) {
%>
<table>
	<tr>
		<th>ID</th>
		<th>NAME</th>
		<th>PRICE</th>
		<th>MANUFACTURED DATE</th>
		<th>CATEGORY</th>
	</tr>

	<%
		for (Product product : products) {
	%>
	<tr>
		<td><%=product.getId()%></td>
		<td><%=product.getName()%></td>
		<td><%=product.getPrice()%></td>
		<td><%
		Date mDate=product.getManufacturedDate();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		String output=dateFormat.format(mDate);
		out.print(output);
		
		%></td>
		<td><%
		
		char category=product.getCategory();
		String output1=null;
		switch(category){
			case 'L' :output1="LAPTOP";break;
			case 'M' :output1="MOBILE";break;
			case 'T' :output1="TELEVISION";break;
			case 'A' :output1="AC";break;

		}
		out.print(output1);
		
		%></td>


	</tr>
	<%
		}
	%>
</table>
<%
	}
%>
</head>
<br>
<br>
<br>
<a href="MenuPage">Back To Menu</a>
<body>

</body>
</html>