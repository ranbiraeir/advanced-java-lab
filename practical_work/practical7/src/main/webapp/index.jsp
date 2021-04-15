<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Factorial</title>
</head>
<body>
<%
    int num=5;
    int fact=1;
    for(int i=1;i<=num;i++)
        fact=fact*i;
    out.print("Factorial of 5 is: "+fact);
%>
</body>
</html>