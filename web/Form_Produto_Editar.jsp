<%@page import="br.model.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD Produto em servlet</title>
    </head>
    <body>

        <h1>Alterar Dados do Produto</h1>
        <% Produto produto = (Produto)request.getAttribute("Produto"); 
        %>
        <form action="EditarProduto" method="POST">
            
            <input type="hidden" name="id" value="<%=produto.getId()%>" >
            
            Categoria:<br>
            <input type="text" name="id_categoria" value="<%=produto.getIdcat() %>" >
            <br>
            Nome:<br>
            <input type="text" name="nome" value="<%=produto.getNome() %>" >
            <br>
            Descrição:<br>
            <input type="text" name="descricao" value="<%=produto.getDesc() %>" >
            <br>        
            Valor:<br>
            <input type="text" name="valor" value="<%=produto.getValor() %>" >
            <br><br>
            <input type="submit" value="Alterar">
            <a href="ListaProduto">Retorna</a>
        </form> 
    </body>
</html>
