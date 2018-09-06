<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.training.business.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>

	th,td{
	border: solid thin black;
	}
	
	.col2{
	width: 15mm;
	}
	.col3{
	width:10mm;
	}

</style>
</head>
<body>
	<%
		Student student = new Student();
		student.setRollNumber(101);
		student.setName("Dhoni");
		student.setMark1(50);
		student.setMark2(50);
		student.setMark3(51);

		Student student2 = new Student();
		student2.setRollNumber(102);
		student2.setName("ABD");
		student2.setMark1(53);
		student2.setMark2(55);
		student2.setMark3(51);

		Student student3 = new Student();
		student3.setRollNumber(103);
		student3.setName("Virat");
		student3.setMark1(30);
		student3.setMark2(23);
		student3.setMark3(28);

		Student student4 = new Student();
		student4.setRollNumber(104);
		student4.setName("Roger");
		student4.setMark1(51);
		student4.setMark2(50);
		student4.setMark3(51);

		Student student5 = new Student();
		student5.setRollNumber(105);
		student5.setName("Nadal");
		student5.setMark1(50);
		student5.setMark2(50);
		student5.setMark3(51);
	%>


	<%
		List<Student> students = new ArrayList<>();
		students.add(student);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
	%>
	
	<table width="80%" style="margin: 1cm;border: solid thin black;">
	
	<tr style="height: 1cm;background-color: yellow;">
		<th>SL No</th>
		<th>Roll Number</th>
		<th>Name</th>
		<th>Mark1</th>
		<th>Mark2</th>
		<th>Mark3</th>
		<th>Total</th>
		<th>Average</th>
		<th>Grade</th>
	
	
	</tr>
	
	<%  int i=1;
		for(Student student6:students){
			
			if(student6.getAverage()<=30){
			
	%>
	<tr style="background-color: red;">
	
	<% }else{ %>
	
	
	<tr>
	
	<%} %>
		<td><%=i++ %></td>
		<td class="col2"><%=student6.getRollNumber() %></td>
		<td class="col3"><%=student6.getName() %></td>
		<td><%=student6.getMark1() %></td>
		<td><%=student6.getMark2() %></td>
		<td><%=student6.getMark3() %></td>
		<td><%=student6.getTotal() %></td>
		<td><%=student6.getAverage() %></td>
		<td><%=student6.getGrade() %></td>
		
	</tr>
	<%} %>
	
	
	
	</table>
</body>
</html>