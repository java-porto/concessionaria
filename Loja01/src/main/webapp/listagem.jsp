
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="br.com.concessionaria.model.Carro"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>Lista de Carros</title>
<link rel="stylesheet" href="./css/style.css">
</head>
<body>
	<h1>Lista de Veículos</h1>
	<p><a href="dados.jsp">INICIO</a></p>
	<table class="tabelaCarro">
		<thead>
			<tr>
				<th>id</th>
				<th>Modelo</th>
				<th>Nome</th>
				<th>Cor</th>
				<th>Ano</th>
				<th>Preco</th>
				<th>Marca</th>
				<th>Editar | Excluir</th>
			<tr>
		</thead>
		<tbody>
		<c:forEach items="${listaCarro}" var="carro" varStatus="id">
			<tr>
				<td>${id.count}</td>
				<td>${carro.modelo}</td>
				<td>${carro.nome}</td>
				<td>${carro.cor}</td>
				<td>${carro.ano}</td>
				<td>${carro.preco}</td>
				<td>${carro.marca}</td>
				<td><a href="editar/${carro.id}">Editar</a>
				<a href="excluir/${carro.marca}">Excluir</a></td>
			</tr>
		</c:forEach>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="7">Quantidade de registros:</td>
			</tr>
		</tfoot>
	</table>
</body>
