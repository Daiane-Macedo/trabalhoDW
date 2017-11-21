<%@page import="br.model.Produto"%>
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
        <h1>Lista de Produtos</h1>
        <h1>Excluir Produto</h1>
        <% Produto produto = (Produto) request.getAttribute("produto"); 
        %>
        <form action="ExcluirProduto" method="Post">
            ID:<br>
            <input type="number" name="id" value="<%=produto.getId()%>" >
            
            Categoria:<br>
            <input type="text" name="idCategoria" value="<%=produto.getIdcat() %>" >
            <br>
            Nome:<br>
            <input type="text" name="nome" value="<%=produto.getNome() %>" >
            <br>
            Descrição:<br>
            <input type="text" name="descricao" value="<%=produto.getDesc() %>" >
            <br>        
            Valor:<br>
            <input type="text" name="valor" value="<%=produto.getValor() %>" >
            <br>
            <input type="submit" value="Confirmar Exclusão">
            <a href="ListaProduto">Retorna</a>
        </form> 
    </body>
</html>
