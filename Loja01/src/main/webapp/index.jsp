<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="br.com.concessionaria.model.Carro"%>
 
<!DOCTYPE html> 
<!-- DTD Document Type Definition -->
<html>
  <head>
	<meta charset="UTF-8">
	<title>Olá Mundo</title>
  </head>
  <body>
	<h1>Página Inicial</h1>
	
		<%
			Carro carro = new Carro();
			carro.setId(1);
			carro.setNome("Corsa");
			carro.setCor("Preto");
			carro.setModelo("Hatch");
			carro.setAno(2006);
			carro.setPreco(13.000);
		%>
		<div>
			<h2>Nosso veículo</h2>
			<p>Nome do veículo   :    <%=carro.getNome() %></p>
			<p>Cor do veículo    :    <%=carro.getCor() %></p>
			<p>Ano do veículo    :    <%=carro.getAno() %></p>
			<p>Modelo do veículo :    <%=carro.getModelo() %></p>
			<p>Valor do veículo  :    <%=carro.getPreco() %></p>										
		</div>
	
  </body>
</html>



