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
Product product=new Product();
String s1,s2,s3,s4;
s1=request.getParameter("txt_id");
s2=request.getParameter("txt_name");
s3=request.getParameter("txt_price");
s4=request.getParameter("txt_cat");
int id=Integer.parseInt(s1);
String name=s2;
double price=Double.parseDouble(s3);
char category=s4.charAt(0);
product.setId(id);
product.setName(name);
product.setPrice(price);
product.setCategory(category);
request.setAttribute("prd",product);

%>
<jsp:useBean id="prd" class="com.training.business.Product" scope="application"></jsp:useBean>





ID <jsp:getProperty property="id" name="prd"/><BR>
NAME <jsp:getProperty property="name" name="prd"/><BR>
PRICE <jsp:getProperty property="price" name="prd"/><BR>
MANUFACTURED DATE <jsp:getProperty property="manufacturedDate" name="prd"/><BR>
CATEGORY <jsp:getProperty property="category" name="prd"/><BR>

</body>
</html>