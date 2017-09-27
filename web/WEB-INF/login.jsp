<%-- 
    Document   : login
    Created on : Sep 20, 2017, 8:49:17 PM
    Author     : 738377
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />

        <h1>Login</h1>
            <div>
                <form action="login" method="POST">
                    Username: <input type="text" name="username" value="${username}"><br>
                    Password: <input type="text" name="password" value="${password}"><br>
                    <input type="submit" value="Login">
                </form>
            </div>
               ${message}
<c:import url="/includes/footer.jsp" />
