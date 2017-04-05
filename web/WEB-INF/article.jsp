<%-- 
    Document   : article
    Created on : Apr 5, 2017, 2:04:59 PM
    Author     : Melnikov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Выбранная статья</title>
    </head>
    <body>
        <h1>${article.title}</h1>
        <p>${article.text}</p>
        <p>${article.date}</p>
        <p>${article.author}</p>
    </body>
</html>
