<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% int a=60;
int b=5;
pageContext.setAttribute("MyAge", a);
request.setAttribute("yourage", b);
request.setAttribute("names",new String[]{"hell0","Dhoni","Vijay"});
%>
${pageScope.MyAge/requestScope.yourage }
${pageScope.MyAge lt 60}
${requestScope.names[2]}
</body>
</html>