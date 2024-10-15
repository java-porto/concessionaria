<%@page import="br.com.concessionaria.model.Carro"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resutado</title>
</head>
<body>
      <div>
          <h2>Recuperando dados</h2>
			<%
				/*String nomeCliente = "";
				String carro = "";
				
				if(request.getAttribute("nc") != null || request.getAttribute("car") != null) {
					nomeCliente = (String)request.getAttribute("nc");
					carro = (String)request.getAttribute("car");
				}*/
				Carro carro = (Carro)request.getAttribute("car");
			%>
			
			<p>NOME DO CARRO: <%=carro.getNome()%></p>
			<p>MODELO DO CARRO: <%=carro.getModelo()%></p>
			<p>COR DO CARRO: <span style="background-color:><%=carro.getCor()%>;color:#fff"><%=carro.getCor()%></span></p>
			<p>ANO DO CARRO: <%=carro.getAno()%></p>
			<p>PREÇO DO CARRO: <%=carro.getPreco()%></p>
	</div>
	<p><a href="dados.jsp">Home</a></p>
</body>
</html>