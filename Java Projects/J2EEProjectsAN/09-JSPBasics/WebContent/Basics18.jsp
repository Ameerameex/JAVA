<%@page import="java.util.Date"%>
<%@page import="com.training.business.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Product product=new Product(101,"LENOVA",12314.0,new Date(),'A');


%>
<%
if(product.getPrice()<3000.00){
	

%>
<h1>low Price</h1>
<%
}else{%>


<h1>High Price</h1>

<%} %>
</body>
</html>