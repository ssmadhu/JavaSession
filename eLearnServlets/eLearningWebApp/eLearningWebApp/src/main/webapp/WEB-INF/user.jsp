<%@ page language="java" contentType="text/html; charset=UTF-8"  isELIgnored="false"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="myprefix"%>
<!DOCTYPE html>

<html>
    <head>
        <title> eLearning </title>
    </head>
    <body>
        <h2>${message}</h2>
       <h3> Here are your options: </h3>
       <h2> List of courses for you to purchase </h2>
        <ol>
            <myprefix:forEach items="${courses}" var="course">
                <li>
                ${course.id}
                ${course.name}
                </li>
                <a href="/user-purchase?courseId=${course.id}"> Buy</a>
            </myprefix:forEach>
        </ol>
       <h2> Course History </h2>
           <myprefix:forEach items="${userCourses}" var="course">
                 <li>
                     ${course.id}
                     ${course.name}
                 </li>
            </myprefix:forEach>
    </body>
</html>
