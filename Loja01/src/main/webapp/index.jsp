<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="br.com.concessionaria.model.Carro"%>

<!DOCTYPE html> 
<!-- Instrução DTD (Document Type Definition -->
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<title>Olá Mundo</title>
		<link rel="stylesheet" href="./css/style.css"></link>
	</head>
	<body>	
		<div class="container">
			<header class="cabecalho">
				<h1>Concessionária - Instituto</h1>
				<nav class="menu">
					<ul>
						<li><a href="#">Comprar</a></li>
						<li><a href="#">Vender</a></li>
						<li><a href="#">Representante</a></li>
						<li><a href="loja?nome=Jonas&idade=24">Loja</a></li>
					</ul>
				</nav>
			</header>
			
			<div>
				<h2>Recuperando atributos</h2>
				
				<%
					String nome = "";
					int idade = 0;
					//Recebendo os parâmetros da Servlet
					if(request.getAttribute("nm") != null || request.getAttribute("id") != null){
					nome = (String)request.getAttribute("nm");
					idade = (Integer)request.getAttribute("id");
					}
				%>
				
				<p>Nome: <%=nome%></p>
				<p>Idade: <%=idade%></p>
			</div>
			
			
			<div>
				<form action="/loja" method="post">
					<fieldset>
						<legend>Cadastro de Carros</legend>
						<div>
							<label for="idCarro">Nome do Carro</label>
							<input type="text"
							name="nmCarro"
							id="idCarro"
							placeholder="Digite o nome do carro:"
							required />
						</div>
					</fieldset>
				</form>
			
			</div>
			
			
			<main class="principal">
				<section>
					<div>
						<p>Lorem Ipsum is simply dummy text of the printing and
						typesetting industry. Lorem Ipsum has been the industry's standard
						dummy text ever since the 1500s, when an unknown printer took a
						galley of type and scrambled it to make a type specimen book. It
						has survived not only five centuries, but also the leap into
						electronic typesetting, remaining essentially unchanged. It was
						popularised in the 1960s with the release of Letraset sheets
						containing Lorem Ipsum passages, and more recently with desktop
						publishing software like Aldus PageMaker including versions of
						Lorem Ipsum.</p>
						
						<p>Lorem Ipsum is simply dummy text of the printing and
						typesetting industry. Lorem Ipsum has been the industry's standard
						dummy text ever since the 1500s, when an unknown printer took a
						galley of type and scrambled it to make a type specimen book. It
						has survived not only five centuries, but also the leap into
						electronic typesetting, remaining essentially unchanged. It was
						popularised in the 1960s with the release of Letraset sheets
						containing Lorem Ipsum passages, and more recently with desktop
						publishing software like Aldus PageMaker including versions of
						Lorem Ipsum.</p>
					</div>
				</section>
			</main>
			
			<footer class="rodape">
				<h2>Show Room</h2>
				<p>Av. dos Amigos sem Emprego 2180 - Sem bloco</p>
				<p>Criado por <span>Rei Luizinho</span> &copy; 2024</p>
			</footer>
			
		</div>
		
		
	</body>
</html>