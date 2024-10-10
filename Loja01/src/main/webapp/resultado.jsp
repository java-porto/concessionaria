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
			String nome = "";
			int idade = 0;
			
			if(request.getAttribute("nm") != null || request.getAttribute("id") != null) {
				nome = (String)request.getAttribute("nm");
				idade = (Integer)request.getAttribute("id");
			}
		%>
		
		<p>Nome: <%=nome %></p>
		<p>Idade: <%=idade %></p>
		
		<p><a href="dados.jsp">Dados a enviar</a></p>
	</body>
</html>