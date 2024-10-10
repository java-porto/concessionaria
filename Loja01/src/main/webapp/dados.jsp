<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dados de entrada</title>
</head>
<body>
<div>
        <form action="/dados" method="post"></form>
        <fieldset>
            <legend>Cadastro de veículos</legend>
            <div>
                  <label for="idModelo">Modelo</label>
                  <input type="text" name="modelo" id="idModelo"
                  placeholder="Digite o modelo do veículo" required>
            </div>
            <div>
                  <label for="idNome">Nome</label>
                  <input type="text" name="nome" id="idNome"
                  placeholder="Digite o Nome do veículo" required>
                </div>
                <div>
                  <label for="idCor">Cor</label>
                  <input type="color" name="cor" id="idCor"required>
                  
                </div>
                <div>
                <label for="idAno">Ano</label>
                <input type="number" name="ano" id="idAno" required pattern="[0-9]{4}">
                </div>

                <div>
                <label for="idPreco">Preço R$</label>
                <input type="number" name="preco" id="idPreco" required>
                
                </div>
                <div>
                    <button type="submit">Cadastrar</button>
                </div>
        </fieldset>
       </div>
</body>
</html>