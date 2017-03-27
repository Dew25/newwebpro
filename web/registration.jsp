<%-- 
    Document   : registration
    Created on : Mar 27, 2017, 3:03:15 PM
    Author     : Melnikov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Регистрация</title>
    </head>
    <body>
        <h1>Зарегистрируйтесь!</h1>
        <form action="addUser" method="POST">
            <input type="text" name="name" placeholder="Имя пользователя"><br>
            <input type="text" name="surname" placeholder="Фамилия"><br>
            <input type="text" name="login" placeholder="Логин"><br>
            <input type="password" name="password" placeholder="Пароль"><br>
            <input type="submit" name="submit" value="Зарегистрироваться"><br>
        </form>
    </body>
</html>
