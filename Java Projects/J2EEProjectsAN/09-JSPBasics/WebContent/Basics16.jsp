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

<jsp:useBean id="prd" class="com.training.business.Product" scope="application"></jsp:useBean>
<jsp:setProperty property="id" name="prd" param="txt_id"/>
<jsp:setProperty property="name" name="prd" param="txt_name"/>
<jsp:setProperty property="price" name="prd" param="txt_price"/>
<jsp:setProperty property="category" name="prd" param="txt_category"/>





ID <jsp:getProperty property="id" name="prd"/><BR>
NAME <jsp:getProperty property="name" name="prd"/><BR>
PRICE <jsp:getProperty property="price" name="prd"/><BR>
MANUFACTURED DATE <jsp:getProperty property="manufacturedDate" name="prd"/><BR>
CATEGORY <jsp:getProperty property="category" name="prd"/><BR>

</body>
</html>