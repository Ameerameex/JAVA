<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="NewEmployee">
		<table>



			<tr>
				<td>ID</td>
				<td><input type='text' name="txt_id"></td>
			</tr>

			<tr>
				<td>NAME</td>
				<td><input type='text' name="txt_name"></td>
			</tr>

			<tr>
				<td>BASIC SALARY</td>
				<td><input type='text' name="txt_basic"></td>
			</tr>





			<tr>
				<td>DATE OF JOINING</td>
				<td><input type="text" name="txt_doj"></td>
			</tr>

			<tr>
				<td>GRADE</td>
				<td><select name="combo_grade">
						<option value="-">Select Grade</option>
						<option value="A">A</option>
						<option value="B">B</option>
						<option value="C">C</option>
				</select></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit"
					value="SAVE THIS EMPLOYEE
				
				"> <input type="reset"
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