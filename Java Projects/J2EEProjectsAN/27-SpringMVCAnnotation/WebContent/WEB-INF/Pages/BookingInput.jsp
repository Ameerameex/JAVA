<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>New Booking Details</h1>
	<hr>
	<form:form action="addTicket" commandName="bt">
		<table>
			<tr>
				<td>ID</td>
				<td><form:input path="id"/> </td>
			</tr>
			<tr>
				<td>Passenger Name</td>
				<td><form:input path="passengerName"/></td>
			</tr>
			 <tr>
				<td>Booking Date</td>
				<td><form:input path="bookingDate"/></td>
			</tr> 
			<tr>
				<td>Operator</td>
				<td><form:input path="serviceOperatorName"/></td>
			</tr>
			<tr>
				<td>Source</td>
				<td><form:input path="sourceOfJourney"/></td>
			</tr>
			<tr>
				<td>Destination</td>
				<td><form:input path="destinationOfJourney"/></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><form:input path="ticketFare"/></td>
			</tr>
			 <tr>
				<td>Journey Date</td>
				<td><form:input path="journeyDate"/></td>
			</tr> 
			
			<tr>
				<td colspan="2"><input type="submit"> </td>
			</tr>

		</table>

	</form:form>
</body>
</html>