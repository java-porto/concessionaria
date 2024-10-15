<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="br.com.concessionaria.model.Carro"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Carros</title>
</head>
<body>

	<h1>Lista de veículos</h1>
	
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
		<th>Preço</th>
	</tr>
	
	
	</thead>
	<tbody>
	<%
		for (Carro carro : lista) {%>
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
			<td colspan= "5"> Qtd de registros:<%=lista.size()%></td>
		
		 </tr>
	  </tfoot>
	</table>

</body>
</html>