<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
	<c:set value="${requestScope.booking}" var="b"></c:set>
		<tr>
			<td>Booking ID</td>
			<td><c:out value="${b.id}"></c:out></td>
		</tr>
		<tr>
			<td>Booking Date</td>
			<td><c:out value="${b.bookingDate}"></c:out></td>
		</tr>
		<tr>
			<td>Passenger Name</td>
			<td><c:out value="${b.passengerName}"></c:out></td>
		</tr>
		<tr>
			<td>Source</td>
			<td><c:out value="${b.sourceOfJourney}"></c:out></td>
		</tr>
		<tr>
			<td>Destination</td>
			<td><c:out value="${b.destinationOfJourney}"></c:out></td>
		</tr>
		
		<tr>
			<td>Journey Date</td>
			<td><c:out value="${b.journeyDate}"></c:out></td>
		</tr>
		<tr>
			<td>Ticket Price</td>
			<td><c:out value="${b.ticketFare}"></c:out></td>
		</tr>
		<tr>
			<td>Service Operator Name </td>
			<td><c:out value="${b.serviceOperatorName}"></c:out></td>
		</tr>


	</table>

</body>
</html>