<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Carros</title>
</head>
<body>
    <h1>Lista de Veiculos<</h1>
    <%
    List<Carro> lista = (List<Carro>)request.getAttribute("listaCarros");
    %>
      
      <table>
      <thead>
      <tr>
      <th>Modelo</th>
      <th>Nome</th>
      <th>Cor</th>
      <th>Ano</th>
      <th>Preco</th>
      </tr>
      </thead>
      <tbody>
      <%
        
      
      
          
      %>
      
      for
      </tbody>
      </table>
    
    <%
      for(Carro carro : lista){<%>
      
      
    %>

</body>
</html>