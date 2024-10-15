<%@page import="br.com.concessionaria.model.Carro"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<title>Resultado</title>
	</head>
	<body>
		<h2>Recuperando dados</h2>
		
		<%
			Carro carro = (Carro)request.getAttribute("objcarro");
		%>
		
		<div>
			<p>Nome do Veículo: <span><%=carro.getNome()%></span></p>
			<p>Ano do Veículo: <span><%=carro.getAno()%></span></p>
			<p>Cor do Veículo: <span><%=carro.getCor()%></span></p>
			<p>Modelo do Veículo: <span><%=carro.getModelo()%></span></p>
			<p>Preço do Veículo: <span><%=carro.getPreco()%></span></p>
		</div>
		<p><a href="dados.jsp">Dados a enviar</a></p>
	</body>
</html>