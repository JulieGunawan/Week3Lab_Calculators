<%-- 
    Document   : agecalculator
    Created on : Sep 21, 2020, 3:04:45 PM
    Author     : 751682
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
            Enter your age: <input type="text" name="ageValue" value="${ageValue}"><br>
            <input type="submit" value="Age next birthday"><br>
            <p>${message}</p>
            
            <a href="arithmetic">Arithmetic Calculator
            </a>
        </form>
    </body>
</html>
