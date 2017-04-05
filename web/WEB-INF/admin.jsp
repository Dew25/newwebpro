<%-- 
    Document   : admin
    Created on : Mar 27, 2017, 12:15:49 PM
    Author     : Melnikov
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
    </head>
    <body>
        <h1>Это страница администратора!</h1>
        <p><a href="newArticle">Добавть новую статью</a></p>
        
        <h2>Пользователи:</h2>
        <c:forEach var="user" items="${users}">
            <p>${user.name} ${user.surname}, логин: ${user.login}</p>
        </c:forEach>
    </body>
</html>
