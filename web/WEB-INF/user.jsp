    <%-- 
    Document   : user
    Created on : Mar 27, 2017, 1:14:03 PM
    Author     : Melnikov
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Page</title>
    </head>
    <body>
        <h1>Это страничка пользователя!</h1>
        <p>Список статей:</p>
        <c:forEach var="article" items="${articles}">
            <p><a href="article?article_id=${article.id}">${article.title}</a></p>
        </c:forEach>
    </body>
</html>
