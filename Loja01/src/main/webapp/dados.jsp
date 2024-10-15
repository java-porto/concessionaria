<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dados</title>

	<link rel="stylesheet" href="./css/style.css">

</head>
<body>
	
	<div>
		<a href="dados">LISTAGEM</a>
	</div>
	
	<div>
		<%
			String msg = "";
		  if(request.getAttribute("msg")!= null){
			  msg = (String)request.getAttribute("msg");
		  }
		%>
	</div>
	
	
	<div class="<%=msg%>">
		<p><%=msg%></p>
	</div>
	
    <div>
        <form action="dados" method="post">
            <fieldset>
                <legend>Cadastro de Veículos</legend>
                <div>
                    <label for="idModelo">Modelo</label>
                    <input type="text" name="modelo" id="idModelo" placeholder="Digite o modelo do Veículo" required>
                </div>
                <div>
                    <label for="idNome">Nome</label>
                    <input type="text" name="nome" id="idNome" placeholder="Digite o nome do Veículo" required>
                </div>
                <div>
                    <label for="idCor">Cor</label>
                    <input type="color" name="cor" id="idCor" placeholder="Digite a cor do Veículo" required>
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
        </form>
    </div>
	
</body>
</html>