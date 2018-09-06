<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int a=20;
pageContext.setAttribute("age",a);
String grade="D";
pageContext.setAttribute("grade",grade);

%>
<c:out value="${pageScope.age}"></c:out>
<c:out value="Ameex"></c:out>

<c:if test="${pageScope.age gt 50}">


<c:out value="YOU are the Eligible For Pension"></c:out>

</c:if>

<c:choose ><c:when test='${pageScope.grade eq "A" }'>
<c:out value="Allowance Percentage is 50%"></c:out></c:when>
<c:when test='${pageScope.grade eq "B" }'>
<c:out value="Allowance Percentage is 30%"></c:out>


</c:when>
<c:otherwise><c:out value="Invalid Grade"></c:out></c:otherwise>

</c:choose>
</body>
</html>