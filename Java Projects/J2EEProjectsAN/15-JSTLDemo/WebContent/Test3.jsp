<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
td {
	border: solid thin black;
	width: 3cm;
	color: WHITE;
	font-size: large;
	font-family: verdana;
	text-align: center;

}

.even {
	background-color: orange;
}

.odd {
	background-color: grey;
}
</style>
</head>
<body>
	<table>
		<c:forEach var="Loan" items="${requestScope.LOANS }"
			varStatus="status">
			<c:if test="${status.index%2 eq 0}">
				<tr class="even">
			</c:if>
			<c:if test="${status.index%2 eq 1}">
				<tr class="odd">
			</c:if>
			<td><c:out value="${status.first}"></c:out></td>
			<td><c:out value="${Loan.id}"></c:out></td>
			<td><fmt:formatNumber groupingUsed="true" minFractionDigits="2"
					value="${Loan.loanAmount}" var="res"></fmt:formatNumber> <c:out
					value="${res}"></c:out></td>
			<td><c:out value="${Loan.customerName}"></c:out></td>
			<td><c:out value="${Loan.loanType}"></c:out></td>
			<td><c:out value="${Loan.duration}"></c:out></td>
			<td><fmt:formatDate value="${Loan.loanSanctionedDate}"
					pattern="dd-MM-yyyy" var="res" /> <c:out value="${res}"></c:out></td>
					
					
			</tr>
		</c:forEach>
	</table>

</body>
</html>