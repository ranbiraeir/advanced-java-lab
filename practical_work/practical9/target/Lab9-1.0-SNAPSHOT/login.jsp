<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>LOGIN</title>
</head>
<body>
<%
    String uname=(String)session.getAttribute("sessname");
    if(uname!=null)
        out.print("Welcome: "+uname);
%>
<form action="home.jsp">
    <input type="text" name="username" placeholder="Enter Username">
    <input type="text" name="password" placeholder="Enter Password">
    <input type="submit" value="Login"><br/>

</form>

</body>
</html>