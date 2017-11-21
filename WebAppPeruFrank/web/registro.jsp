<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 
    Document   : registro
    Created on : 21-11-2017, 11:19:47
    Author     : Francisco Benitez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <style>
        form {
            border: 3px solid #f1f1f1;
        }

        input[type=text], input[type=password],select {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }

        button {
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
        }

        button:hover {
            opacity: 0.8;
        }

        .registrobtn {
            width: auto;
            padding: 10px 18px;
            background-color: #f44336;
        }

        .imgcontainer {
            text-align: center;
            margin: 24px 0 12px 0;
        }

        img.avatar {
            width: 40%;
            border-radius: 50%;
        }

        .container {
            padding: 16px;
        }

        span.psw {
            float: right;
            padding-top: 16px;
        }

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
        span.psw {
           display: block;
           float: none;
        }
        .cancelbtn {
           width: 100%;
        }
    }
</style>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Page</title>
    </head>
    
    <body>
        
        <form action="SRegistro">
            <div class="imgcontainer"
                 <img src="img/registro.jsp" alt="AvatarR" class="avatar">
            </div>
            
            <div class="container">
                    <label><b>Nombre Usuario:</b></label>
                        <input type="text" placeholder="Ingrese Nombre usuario." name="nombreUsuario" required>
                    <label><b>Nombre Completo:</b></label>
                        <input type="text" placeholder="Ingrese nombre completo." name="nombreCompleto" required>    
                    <label><b>Rut:</b></label>
                        <input type="text" placeholder="Ingrese rut." name="rutCliente" required>
                    <label><b>Ingrese password:</b></label>
                        <input type="password" placeholder="Ingrese password" name="1pss" required>
                    <label><b>Verifique password:</b></label>
                        <input type="password" placeholder="Ingrese password" name="2pss" required>
                    <label><b>Selecionar comuna:</b></label>
                        <select name="comuna" required>
                            <c:forEach var="comunas" items="${listaComunas}">
                    
                                <b><option value="${comunas.idComuna}"><c:out value="${comunas.comunaNombre}"></c:out></option></b>
                                 
                            </c:forEach>
                        </select>
                    <label><b>Ingrese direccion:</b></label>
                        <input type="text" placeholder="Ingrese direccion." name="direccion" required>
                    <label><b>Ingrese telefono:</b></label>
                        <input type="text" placeholder="Ingrese telefono." name="telefono" required>
                        <button type="submit">Registrar</button>
            </div>
            
            <div class="container" style="background-color: #f1f1f1">
                <button type="button" class="registrobtn">Cancel</button>
            </div>
        </form> 
    </body>
</html>
