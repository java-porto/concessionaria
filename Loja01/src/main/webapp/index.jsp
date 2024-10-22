<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="br.com.concessionaria.model.Carro"%>
<!DOCTYPE html>
<!-- DTD = Document Type Definition -->
<html lang="pt-br">
<head>
<!-- Tag de configação da página -->
<meta charset="UTF-8">
<!-- Configuração de caracteres da página -->
<title>Olá Mundo</title>
<link rel="stylesheet" href="./css/style.css">
</head>
<body>
	<div class="container">
		<header class="cabecalho">
			<h1>Concessionária - Instituto</h1>
			<nav class="menu">
				<ul>
					<li><a href="#">Comprar</a></li>
					<li><a href="loja?nome=Jonas&idade=24">Loja</a></li>
					<li><a href="#">Vender</a></li>
					<li><a href="#">Representante</a></li>
				</ul>
			</nav>
		</header>
		
		<h2>recuperando atributos</h2>
		
		<%
			String nome = "";
			int idade = 0;
			//recebendo os parametros da Servlet
			if(request.getAttribute("nm") != null || request.getAttribute("id") != null) {
				nome = (String)request.getAttribute("nm");
				idade = (Integer)request.getAttribute("id");
			}
		%>
		
		<p>Nome: <%=nome%></p>
		<p>Idade: <%=idade%></p>
		
		<div>
			<form action="/loja" method="post">
					<fieldset>
						<legend>Cadastro de Carros</legend>
						<div>
							<label id="idCarro">Nome do Carro</label>
							<input type="text"
							name="nmCarro"
							id="idCarro"
							placeholder="Digite o nome do carro"
							required />
						</div>
					</fieldset>
			</form>
		</div>

		<main class="principal">
			<section>
				<div class="">
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
				<div class="">
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
			<p>Avenida Faria Lima, 123 - Sem bloco</p>
			<p>Criado por <span>Felipe</span> &copy; 2024</p>
		</footer>
	</div>
</body>
</html>