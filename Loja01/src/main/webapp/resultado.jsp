<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado</title>
</head>
<body>
	<div>
		<h2>Recuperando dados</h2>
			<%
				String nomeCliente = "";
				String carro = "";
				
				if(request.getAttribute("nc") != null || request.getAttribute("car") != null) {
					nomeCliente = (String)request.getAttribute("nc");
					carro = (String)request.getAttribute("car");
				}
			%>
			
			<p>NOME DO CLIENTE: <%=nomeCliente%></p>
			<p>CARRO SELECIONADO: <%=carro%></p>
	</div>
	<p><a href="dados.jsp"></a></p>
</body>
</html>