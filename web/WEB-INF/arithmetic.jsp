<%-- 
    Document   : arithmetic
    Created on : Sep 22, 2020, 6:39:45 PM
    Author     : 751682
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="POST">
            First: <input type="text" name="firstnum" value="${firstNumber}"><br>
            Second: <input type="text" name="secnum" value ="${secondNumber}"><br>
            <input type="submit" name="symbol" value="+">
            <input type="submit" name="symbol" value="-">
            <input type="submit" name="symbol" value="*">
            <input type="submit" name="symbol" value="%">
            
        </form>
            <p>${message}</p>
            <a href="agecalculator">Age Calculator</a>
    </body>
</html>
