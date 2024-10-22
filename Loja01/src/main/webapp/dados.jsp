
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dados</title>

	<link rel="stylesheet" href="./css/style.css">
	
</head>
<body>
	
	<div>
		<a href="trafego">LISTAGEM</a>
	</div>
	
	<div class="${(msg != null ? msg : '' )}">
		<p>${(msg != null ? msg : "" )}</p>
	</div>
	<div>
		${al != null ? al : ""}
	</div>
	<div>
		<form action="trafego" method="post">
			<fieldset>
				<legend>Cadastro de Veiculos</legend>
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
                    <select name="ano" id="idAno" required>
                  <option value="">Selecione o ano</option>
                  <script>
            	         const currentYear = new Date().getFullYear();
            	         for (let year = currentYear; year >= 1900; year--) {
                               document.write('<option value="' + year + '">' + year + '</option>');
           	         }
                  </script>
    	</select>
                    
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
