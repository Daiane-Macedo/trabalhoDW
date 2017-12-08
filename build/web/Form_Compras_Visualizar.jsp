<%@page import="br.model.Compras"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD em servlet</title>
        <style>
        input:-moz-read-only { /* For Firefox */
            background-color: #DCDCDC;
        }

        input:read-only {
            background-color: #DCDCDC;
        }
        </style>
    </head>
    <body>
        <h1>Lista de Compras</h1>
        <h1>Dados do Compras</h1>
        <% Compras compras = (Compras) request.getAttribute("comp"); 
        %>
        <form action="ListaCompras" method="GET">
            
            <input type="hidden" name="id" value="<%=compras.getId()%>" >
           
            ID Cliente<br>
            <input type="text" name="id_cliente" value="<%=compras.getIdcliente() %>" readonly="true" >
            <br>
            
            ID Produto:<br>
            <input type="text" name="id_produto" value="<%=compras.getIdproduto()%>" readonly="true" >
            <br><br>
            <a href="ListaCompras">Retorna</a>
        </form> 
    </body>
</html>
