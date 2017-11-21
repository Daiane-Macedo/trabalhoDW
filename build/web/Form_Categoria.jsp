<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.controle.IncluirCategoria"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD em servlet</title>
    </head>
    <body>
        <h1>Incluir Categoria</h1>
        <form action="IncluirCategoria" method="POST">
            <% if(
                    (request.getAttribute("erro_descricao") != null)
                    || (request.getAttribute("erro_descricao") == "")
                 ) { %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_descricao"));%></h3>        
            <% }%>
            
            Descricao<br>
            <input type="text" name="descricao" >
            <br>

            <br><br>
            <input type="submit" value="Submit">
        </form> 
    </body>
</html>
