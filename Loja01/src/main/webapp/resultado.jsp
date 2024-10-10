<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Concessionaria PortoCar</title>
</head>
<body>
	<h1>Bem-vindo a Concessionaria PortoCar</h1>
				<div>
				<form action="/dados" method="post">
					<fieldset>
						<legend>Cadastro de carros</legend>
				</div>
				
				<%
				String nome = "Civic";
				int ano = 2000;
					//Recebendo os parâmetros da Servlet
					
					if(request.getAttribute("name") != null || request.getAttribute("year") != null){
						nome = (String)request.getAttribute("name");
						ano = (Integer)request.getAttribute("year");
					}
				%>
				
				<div>
							<label>Nome do carro</label>
							<input type="text"
							  name="nmCarro"
							  id="idCarro"
							  placeholder="Digite o nome do carro"
							  required />
				</div>
				
				<p>NOME: <%=nome%></p>
				<p>ANO: <%=ano%></p>
				</div>
					</fieldset>
				</form>
			</div>
	<p><a href="dados.jsp">HOME</a></p>
</body>
</html>