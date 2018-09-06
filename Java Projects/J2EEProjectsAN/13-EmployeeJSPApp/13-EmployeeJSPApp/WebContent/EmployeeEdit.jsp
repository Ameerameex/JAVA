<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.training.business.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="employee" scope="request"
		class="com.training.business.Employee"></jsp:useBean>
	<form action="EmployeeUpdating">
		<table>



			<tr>
				<td>ID</td>
				<td><input type='text' name="txt_id" 
				value='<jsp:getProperty property="id" name="employee"/>'></td>
			</tr>

			<tr>
				<td>NAME</td>
				<td><input type='text' name="txt_name"
				value='<jsp:getProperty property="name" name="employee"/>'>
				</td>
			</tr>

			<tr>
				<td>BASIC SALARY</td>
				<td><input type='text' name="txt_basic"
					value='<jsp:getProperty property="basicSalary" name="employee"/>'>
				</td>
			</tr>

			<tr>
				<td>DATE OF JOINING</td>
				<%
					Employee employee2 = (Employee) request.getAttribute("employee");
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
					Date doj = employee2.getDateOfJoin();
					String output1 = "";
					if (doj != null) {
						output1 = dateFormat.format(doj);
					}
				%>
				<td><input type="text" name="txt_doj" value='<%=output1%>'>
				</td>
			</tr>

			<tr>
				<td>Grade</td>
				<td><select name="combo_grade">
						<option value="-">Select Grade</option>
						<option value="A">A</option>
						<option value="B">B</option>
						<option value="C">C</option>

				</select></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit"
					value="UPDATE THIS EMPLOYEE"> <input type="reset"
					value="CANCEL DATA"></td>
			</tr>


		</table>

	</form>

	<br>
	<br>
	<br>
	<a href="Menu">Back to menu</a>
</body>
</html>