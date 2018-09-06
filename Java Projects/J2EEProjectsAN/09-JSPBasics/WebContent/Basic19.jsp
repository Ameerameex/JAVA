<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Basic19.jsp">
<input type="text" name='txt_num'>
<input type="submit" value='Display'>

</form>
<% int num=1;
String s1;
s1=request.getParameter("txt_num");
if(s1!=null){
	num=Integer.parseInt(s1);
}
%>
<table>

<% 
for(int i=1;i<=10;i++){ %>
<tr>
<td><%=i %></td>
<td>*</td>
<td><%=num %></td>
<td><%=i*num%></td>
</tr>


<%} %>
</table>

</body>
</html>