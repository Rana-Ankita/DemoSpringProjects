<%@page import="java.time.LocalDateTime"%>
<%@page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>This is Help page</title>
</head>
<body>
<h2>We are going to use ModelAndView</h2>
<h1>Called by home controller.........</h1>
<%--  <%
String name = (String)request.getAttribute("name");
LocalDateTime time=(LocalDateTime) request.getAttribute("time");
%>

<h2>My Brother name is <%=name%></h2>
<h2>Current time is <%=time %></h2> --%>
<!-- We can directly get data using expression language -->
<h2>My Brother name is ${name}</h2>
<h2>Current time is ${time}</h2>
<h2>URL /help</h2>

<hr>
<c:forEach var="item" items="${marks }">
  <%-- <h1>${item}</h1> --%>
  <h1><c:out value="${item }"></c:out></h1>
</c:forEach>
</body>
</html>
