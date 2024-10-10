<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<title>Dados</title>
	</head>
	<body>
		<div>
			<form action="/dados" method="post">
            <fieldset>
                <legend>Cadastro de veículos</legend>
                <div>
                    <label for="idnome">Nome do veículo</label>
                    <input type="text"
                    name="nome" id="idNome"
                    placeholder="Digite o nome do veículo" required>
                </div>
                <div>
                    <label for="idAno">Ano do veículo</label>
                    <input type="date"
                    name="ano" id="idAno"
                    required>
                </div>
                <div>
                    <label for="idModelo">Modelo do veículo</label>
                    <input type="text"
                    name="modelo" id="idModelo"
                    placeholder="Digite o modelo do veículo" required>
                </div>
                <div>
                    <label for="idCor">Cor do veículo</label>
                    <input type="text"
                    name="cor" id="idCor"
                    required>
                </div>
                <div>
                    <label for="idnome">Preço do veículo</label>
                    <input type="number"
                    name="preco" id="idPreco"
                    required>
                </div>
                <div>
                    <button type="submit">Cadastrar</button>
                </div>
            </fieldset>
        </form>
		</div>
	</body>
</html>