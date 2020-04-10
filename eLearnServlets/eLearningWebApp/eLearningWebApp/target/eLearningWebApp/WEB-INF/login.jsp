<%@ page language="java" contentType="text/html; charset=UTF-8"  isELIgnored="false"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> eLearning </title>
    </head>
    <body>
        <h2> Welcome ${name} to eLearning </h2>
        <h3> Login to Continue </h3>
        <form method="post">
           Username:  <input name="username" type="text"/>
           Password:  <input name="password" type="password"/>
           <input type="submit" name="login"/>
        </form>
    </body>

</html>
