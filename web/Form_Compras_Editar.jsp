<%@page import="br.model.Compras"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD em servlet</title>
    </head>
    <body>
        <h1>Lista de Compras</h1>
        <h1>Alterar Dados do Compras</h1>
        <% Compras compras = (Compras) request.getAttribute("compras"); 
        %>
        <form action="EditarCompras" method="POST">
            
            <input type="hidden" name="id" value="<%=compras.getId()%>" >
            
            
            Cliente: <br>
            <input type="text" name="id_cliente" value="<%=compras.getIdcliente() %>" >
            <br>
          
            Produto: <br>
            <input type="text" name="id_produto" value="<%=compras.getIdproduto()%>" >
            <br><br>
            <input type="submit" value="Alterar">
            <a href="ListaCompras">Retorna</a>
        </form> 
    </body>
</html>
