<%-- 
    Document   : mainPage
    Created on : Sep 21, 2017, 9:56:56 PM
    Author     : 738377
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:import url="/includes/header.html" />
    
        <h1>Main Page</h1>
        <div>
            
            <c:if test="${user != null}">
                Hello, ${user.username} <br><br>
            </c:if>
            
            
            <a href="mainPage?logout=true">Log out</a>
        
        </div>
   <c:import url="/includes/footer.jsp" />
