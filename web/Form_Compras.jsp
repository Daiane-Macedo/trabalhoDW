<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD em servlet</title>
    </head>
    <body>
        <h1>Incluir Compras</h1>
        <form action="IncluirCompras" method="POST">
           
            <br>
            Cliente
            <input type="text" name="id_cliente" >
            <br>
            
            Produto<br>
            <input type="text" name="id_produto" >
            <br><br>
            <input type="submit" value="Submit">
        </form> 
    </body>
</html>
