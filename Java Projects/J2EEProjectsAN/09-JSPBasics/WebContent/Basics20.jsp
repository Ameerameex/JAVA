<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Basics20.jsp">
<table>

<tr>
	<td>RollNumber</td>
	<td><input name='txt_Roll'></td>
</tr>	

<tr>
	<td>Name</td>
	<td><input name='txt_name'></td>
</tr>	

<tr>
	<td>Marks</td>
	<td><input name='txt_m1' size="3"><input name='txt_m2' size="3"><input name='txt_m3' size="3"></td>
</tr>	
<tr>
	<td><input type="submit" value="Show Results"></td>
</tr>
</table>

</form>

<jsp:useBean id="student" class="com.training.business.Student" scope="page"></jsp:useBean>

<jsp:setProperty property="rollNumber" name="student" param="txt_Roll"/>
<jsp:setProperty property="name" name="student" param="txt_name"/>
<jsp:setProperty property="mark1" name="student" param="txt_m1"/>
<jsp:setProperty property="mark2" name="student" param="txt_m2"/>
<jsp:setProperty property="mark3" name="student" param="txt_m3"/>

<table style="margin-top:3cm" border="1" class="marksheet">

<tr>
	<td style="background-color:powderblue;color: white;">Roll Number :<jsp:getProperty property="rollNumber" name="student"/></td>
	<td style="background-color:maroon;color: white;">Name :<jsp:getProperty property="name" name="student"/></td>
</tr>

<tr>
	<td>Mark1 :</td>
	<td><jsp:getProperty property="mark1" name="student"/></td>
	
</tr>

<tr>
	<td>Mark2 :</td>
	<td><jsp:getProperty property="mark2" name="student"/></td>
</tr>

<tr>
	<td>Mark3 :</td>
	<td><jsp:getProperty property="mark3" name="student"/></td>
</tr>

<tr style="background-color:Blue;color: white;">
	<td colspan="2">
	Total:<jsp:getProperty property="total" name="student"/>
	Average:<jsp:getProperty property="average" name="student"/>
	Grade:<jsp:getProperty property="grade" name="student"/>
	</td>
	
</tr>

</table>



</body>
</html>