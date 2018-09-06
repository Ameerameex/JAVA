<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="Styles/EmployeeDisplayer.css" rel="stylesheet">

<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="employee" class="com.training.business.Employee"
		scope="request"></jsp:useBean>

	<h1>Employee Details</h1>
	<table border="1">
		<tr>
			<td>ID</td>
			<td class="dataCell"><jsp:getProperty property="id" name="employee" /></td>
		</tr>

		<tr>
			<td>NAME</td>
			<td class="dataCell"><jsp:getProperty property="name"
					name="employee" /></td>
		</tr>

		<tr>
			<td>SALARY</td>
			<td class="dataCell"><jsp:getProperty property="basicSalary"
					name="employee" /></td>

		</tr>

		<tr>
			<td>DATE OF JOINING</td>
			<td class="dataCell">
				<%
					Date mdate = employee.getDateOfJoin();
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
					String output1 = dateFormat.format(mdate);
					out.print(output1);
				%>
			</td>
		</tr>

		<tr>
			<td>CATEGORY</td>
			<td class="dataCell">
				<%
					out.print(employee.getGrade());
				%>
			</td>
		</tr>

	</table>
	<br>
	<br>
	<br>
	<a href="Menu">Back to menu</a>
</body>
</html>