<%-- 
    Document   : newArticle
    Created on : Apr 5, 2017, 2:09:14 PM
    Author     : Melnikov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Новая статья</title>
    </head>
    <body>
        <h1>Добавить новую статью</h1>
        <form name="new_article" action="addArticle" method="POST">
            <input type="text" name="title" value="" />
            <textarea name="text" rows="4" cols="20"></textarea>
            <input type="text" name="author" value="" />
            <input type="submit" value="Добавить" />
        </form>
    </body>
</html>
