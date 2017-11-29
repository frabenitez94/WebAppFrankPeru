<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 
    Document   : carta
    Created on : 28-11-2017, 17:56:05
    Author     : Francisco Benitez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carta Bebidas</title>
    </head>
    <body>
        
        <h2>Carta Bebidas</h2>

<ul>
    <c:forEach var="bebidas" items="${listaBebidas}">
        
        <li>
            ${bebidas.nombre} - ${bebidas.precio}
        </li>
    </c:forEach>
    
</ul>  
        
        
        <%@include file="carta2.jsp" %>
        
    </body>
</html>
