<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.controle.Incluir"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD em servlet</title>
    </head>
    <body>
        <h1>Incluir Cliente</h1>
        <form action="Incluir" method="POST">
            <% if(
                    (request.getAttribute("erro_nome") != null)
                    || (request.getAttribute("erro_nome") == "")
                 ) { %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_nome"));%></h3>        
            <% }%>
            Nome:<br>
            <input type="text" name="nome">
            <br>
            <% if(request.getAttribute("erro_celular") != null) { %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_celular"));%></h3>        
            <% }%>
            Celular:<br>
            <input type="text" name="celular" >
            <br><br>
            Endereco<br>
            <input type="text" name="endereco">
            <br>
            Bairro<br>
            <input type="text" name="bairro">
            <br>
            Cidade<br>
            <input type="text" name="cidade">
            <br>
            Estado<br>
            <input type="text" name="estado">
            <br> 
            CPF<br>
            <input type="text" name="cpf">
            <br>
            RI(Identidade)<br>
            <input type="text" name="rg">
            <br>
            CEP<br>
            <input type="text" name="cep">
            <br>  
            Referência<br>
            <input type="text" name="referencia">
            <br>            
            Telefone Fixo<br>
            <input type="text" name="telefone">
            <br> 
            Número do Cartão<br>
            <input type="text" name="numero_cartao">
            <br> 
            Bandeira do Cartão<br>
            <input type="text" name="bandeira_cartao">  
            <br>
            <input type="submit" value="Submit">
        </form> 
    </body>
</html>
