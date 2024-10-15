<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="br.com.concessionaria.model.Carro"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Lista de Carros</title>
	</head>
		<body>
		
			<h1>Lista de Veículos</h1>
			
			<% 
				List<Carro> lista = (List)request.getAttribute("listaCarros");
			%>
			
			
			<table>
			<thead>
				<tr>
				<th>Modelo</th>
				<th>Cor</th>
				<th>Nome</th>
				<th>Ano</th>
				<th>Preco</th>
				</tr>
			</thead>
			
			<%
				for(Carro carro: lista) {%>
					<tr>
						<td><%=carro.getModelo()%></td>
						<td><%=carro.getNome()%></td>
						<td><%=carro.getCor()%></td>
						<td><%=carro.getAno()%></td>
						<td><%=carro.getPreco()%></td>
					</tr>
			<%}%>
			</tbody>
			<tfoot>
				<tr>
				<td colspan ="5"> Qtd de registros:<%=lista.size()%></td>
				</tr>
			</table>
		</body>
</html>