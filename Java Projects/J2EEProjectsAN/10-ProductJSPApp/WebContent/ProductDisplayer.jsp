<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="java.util.Date"%>
	<%@page import="java.text.SimpleDateFormat"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="Styles/ProductDisplayer.css" rel="stylesheet">

</head>
<body><jsp:useBean id="product"
		class="com.ameex.training.business.Product" scope="request"></jsp:useBean>


	<h1>Product Details</h1>
	<table>
		<tr>
			<td class="caption">ID</td>
			<td><jsp:getProperty property="id" name="product" /></td>
		</tr>

		<tr>
			<td class="caption">NAME</td>
			<td><jsp:getProperty property="name" name="product" /></td>
		</tr>

		<tr>
			<td class="caption">PRICE</td>
			<td><jsp:getProperty property="price" name="product" /></td>
		</tr>

		<tr>
			<td class="caption">MANUFACTURED DATE</td><td><%
		Date mDate=product.getManufacturedDate();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		String output=dateFormat.format(mDate);
		out.print(output);
		
		%>
			</td>
		</tr>

		<tr>
			<td class="caption">CATEGORY</td><td><%
		
		char category=product.getCategory();
		String output1=null;
		switch(category){
			case 'L' :output1="LAPTOP";break;
			case 'M' :output1="MOBILE";break;
			case 'T' :output1="TELEVISION";break;
			case 'A' :output1="AC";break;

		}
		out.print(output1);
		
		%>
			</td>
		</tr>
	</table>
	<br>
<br>
<br>
<a href="MenuPage">Back To Menu</a>
</body>
</html>