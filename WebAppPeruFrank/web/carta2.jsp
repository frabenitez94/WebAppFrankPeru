<%-- 
    Document   : carta2
    Created on : 28-11-2017, 17:58:56
    Author     : Francisco Benitez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Carta Platos</h1>
        <ul>
            <c:forEach var="platos" items="${listaPlatos}">
                <li>
                      ${platos.nombrePlato} - ${platos.precio}
                </li>
            </c:forEach>
    
        </ul>
        
    </body>
</html>
