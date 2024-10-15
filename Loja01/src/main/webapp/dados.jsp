<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dados de entrada</title>

<link rel ="stylestheet" href="./css/style.css">
 

</head>
<body>
  
  <div>
    <%
		String msg = "";	
		if(request.getAttribute("msg")!= null) {
				msg = (String)request.getAttribute("msg");
			}
		%>
	</div>
	<p><%=msg%></p>
	
	<div class="Erro!"></div>


<div>

     <form action="trafego" method="post">
       <fieldset>
         <legend>Cadastro de Veiculos </legend>
      
      
    <div>
                    <label for="idModelo">Modelo</label>
                    <input type="text" name="modelo" id="idModelo" 
                    placeholder="Digite o modelo do veículo" required>
                </div>
                <div>
                    <label for="idNome">Nome</label>
                    <input type="text" name="nome" id="idNome" 
                    placeholder="Digite o nome do veículo" required>
                </div>
                <div>
                    <label for="idCor">Cor</label>
                    <input type="color" name="cor" id="idCor" required>
                </div>
                <div>
                    <label for="idAno">Ano</label>
                    <input type="number" name="ano" id="idAno" required pattern="[0-9]{4}">
                </div>
                <div>
                    <label for="idPreco">Preço</label>
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