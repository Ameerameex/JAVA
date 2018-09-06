<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
<title>Insert title here</title>
<style type="text/css">
td {
	border: solid thin black;
	width: 3cm;
	background-color: black; color : WHITE;
	font-size: large;
	font-family: verdana;
	text-align: center;
	color: WHITE;
}
</style>
</head>
<body>
	<sql:setDataSource driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/salesdb" user="root" password="root"
		var="ds" />
	<sql:query var="rs" dataSource="${ ds}">
select * from product
</sql:query>
	<%-- <sql:update dataSource="${ds}">

insert into product values(?,?,?,?,?)
<sql:param value="126"></sql:param>
		<sql:param value="Acer"></sql:param>
		<sql:param value="1234567.00"></sql:param>
		<sql:dateParam value="1999-12-12" type="DATE"/>
		<sql:param value="L"></sql:param>
	</sql:update> --%>
	<table>
		<c:forEach var="row" items="${rs.rows}">
			<tr>
				<td><c:out value="${row.id}"></c:out></td>
				<td><c:out value="${row.name}"></c:out></td>
				<td><c:out value="${row.price}"></c:out></td>
				<td><c:out value="${row.mdate}"></c:out></td>
				<td><c:out value="${row.category}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>