<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!  private int id;
 private String name;
private double basic;
public double getAllowance(){
	
	return basic*0.12;
	
}
%>
<%
int x,y;
this.basic=10000.00;

%>
<%=getAllowance() %>
</body>
</html>