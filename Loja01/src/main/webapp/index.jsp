<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="br.com.concessionaria.model.Carro"%>

<!DOCTYPE html> 
<!-- Instrução DTD (Document Type Definition -->
<html>
	<head>
		<meta charset="UTF-8">
		<title>Olá Mundo</title>
	</head>
	<body>
		<h1>Página inicial</h1>
		
		<%
			Carro carro = new Carro();
			carro.setId(1);
			carro.setNome("Jeep");
			carro.setCor("Preto");
			carro.setModelo("HATCH");
			carro.setPreco(13000);
			carro.setAno(2006);
		%>
		
		<div>
			<h2> Nosso veículo </h2>
			<p>Nome do veículo : <%=carro.getNome()%></p>
			<p>Cor do veículo : <%=carro.getCor()%></p>
			<p>Modelo do veículo : <%=carro.getModelo()%></p>
			<p>Valor do veículo : <%=carro.getPreco()%></p>
			<p>Ano do veículo : <%=carro.getAno()%></p>
		
		</div>
		
		
	</body>
</html>