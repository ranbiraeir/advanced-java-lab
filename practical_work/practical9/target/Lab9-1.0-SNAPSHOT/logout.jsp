<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>LOGOUT</title>
</head>
<%
    String name=(String)session.getAttribute("sessname");
    session.invalidate();
%>

<body>
<a href="login.jsp">Please confirm logout.This will expire the session.</a>
</body>
</html>