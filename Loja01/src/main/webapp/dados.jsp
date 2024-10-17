<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<link rel="stylesheet" href="./css/style.css">
<meta charset="UTF-8">
<title>Dados</title>
</head>
<body>
	<div>
		<a href="dados">LISTAGEM</a>
	</div>
	<div class="${(msg != null ? msg : '')}">
		<p>${(msg != null ? msg : "")}</p>
	</div>
	<div>
		<p>${al != null ? al : ""}</p>
	</div>
	<div>
		<form action="dados" method="post">
			<fieldset>
				<legend>Cadastro de veículos</legend>
				<div>
					<label for="idnome">Nome do veículo</label> <input type="text"
						name="nome" id="idNome" placeholder="Digite o nome do veículo"
						required>
				</div>
				<div>
					<label for="idAno">Ano do veículo</label> <input type="number"
						name="ano" id="idAno" pattern="[0-9]{4}" required>
				</div>
				<div>
					<label for="idModelo">Modelo do veículo</label> <input type="text"
						name="modelo" id="idModelo"
						placeholder="Digite o modelo do veículo" required>
				</div>
				<div>
					<label for="idCor">Cor do veículo</label> <input type="text"
						name="cor" id="idCor" required>
				</div>
				<div>
					<label for="idnome">Preço do veículo</label> <input type="number"
						name="preco" id="idPreco" required>
				</div>
				<div>
					<button type="submit">Cadastrar</button>
				</div>
			</fieldset>
		</form>
	</div>
</body>
</html>