<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.training.business.Employee"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="Styles/EmployeeListDisplayer.css" rel="stylesheet">

<title>Insert title here</title>
</head>
<body>
<%
		List<Employee> allEmployees = (List<Employee>) request.getAttribute("employeeList");
	%>
	<h1>Employee Listing</h1>
	<br>
	<br>
	<h2>
		<%=allEmployees.size()%>
		Employees Found
	</h2>
	<br>
	<br>
	<br>
	<%
		if (allEmployees.size() > 0) {
	%>
	<table>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>BASIC SALARY</th>
			<th>DATE OF JOINING</th>
			<th>GRADE</th>

		</tr>
		<%
			for (Employee employee : allEmployees) {
		%>
		<tr>
			<td><%=employee.getId()%></td>
			<td><%=employee.getName()%></td>
			<td align="right"><%=employee.getBasicSalary()%></td>
			<td align="center">
				<%
					Date doj = employee.getDateOfJoin();
							SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
							String output1 = dateFormat.format(doj);
							out.print(output1);
				%>
			</td>
			<td align="center">
				<%
					
							out.print(employee.getGrade());
				%>
			</td>


		</tr>

		<%
			}
		%>
	</table>


	<%
		}
	%>

	<br>
	<br>
	<br>
	<a href="Menu">Back to menu</a>
</body>
</html>