<%-- 
    Document   : login
    Created on : Sep 20, 2017, 8:49:17 PM
    Author     : 738377
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
            <div>
                <form action="login" method="POST">
                    Username: <input type="text" name="username" value="${username}"><br>
                    Password: <input type="text" name="password" value="${password}"><br>
                    <input type="submit" value="Login">
                </form>
            </div>
                ${message}
    </body>           
</html>
