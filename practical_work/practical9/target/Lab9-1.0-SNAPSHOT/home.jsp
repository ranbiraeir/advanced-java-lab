<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <style>
        a{
            position:absolute;
            right:80px;
        }
    </style>

    <meta charset="ISO-8859-1">
    <title>HOME</title>
</head>
<body>
<%
    String uname=request.getParameter("username");
    out.print("Welcome "+uname);
    session.setAttribute("sessname",uname);

%>
<a href="logout.jsp" >LOGOUT</a>

</body>
</html>