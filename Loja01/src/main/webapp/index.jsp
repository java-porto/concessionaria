<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="br.com.concessionaria.model.Carro"%>
<!DOCTYPE html>
<!-- DTD = Document type Definition -->
<html>
<head>
<meta charset="UTF-8">
<title>Olá Mundo</title>
<link rel="stylesheet" href="./css/style.css">
</head>
<body>
	<div class="container">
		<header class="cabecalho">
			<h1>Concessionaria - Instituto</h1>
			<nav class="menu">
				<ul>
					<li><a href="#">Comprar</a></li>
					<li><a href="#">Vender</a></li>
					<li><a href="#">Representante</a></li>
					<li><a href="loja?nome=João&idade=18">Loja</a></li>
				</ul>
			</nav>
		</header>

        <div>
            <h2>Recuperando atributos</h2>
        
           <%
            String nome = "" ;
           int idade = 0;
           //recebendo os parâmetros da Servlet
               if (request.getAttribute("nm") != null || request.getAttribute("id") != null) {               
                  nome  = (String)request.getAttribute("nm");
                  idade = (Integer)request.getAttribute("id");
               }
           %>
        
            <p>NOME: <%=nome%></p>
            <p>IDADE: <%=idade%></p>
        </div>
        
        
        
           <div>
               <form action="/Loja" method="post">                   
               <fieldset>
                     <legend>Cadastro de Carros</legend>
                     <div>
                        <label>Nome do Carro</label>
                        <input type= "text"
                        name="nmCarro"
                        id="idCarro"
                        placeholder="Digite o nome do Carro:"
                        required />
                     </div>
               </fieldset>
               
               </form>                   
           </div>
        
        
        
		<main class="Principal">
			<section>
				<div>
					<p>Lorem Ipsum é simplesmente uma simulação de texto da
						indústria tipográfica e de impressos, e vem sendo utilizado desde
						o século XVI, quando um impressor desconhecido pegou uma bandeja
						de tipos e os embaralhou para fazer um livro de modelos de tipos.
						Lorem Ipsum sobreviveu não só a cinco séculos, como também ao
						salto para a editoração eletrônica, permanecendo essencialmente
						inalterado. Se popularizou na década de 60, quando a Letraset
						lançou decalques contendo passagens de Lorem Ipsum, e mais
						recentemente quando passou a ser integrado a softwares de
						editoração eletrônica como Aldus PageMaker.</p>

				</div>
                <div>
					<p>Lorem Ipsum é simplesmente uma simulação de texto da
						indústria tipográfica e de impressos, e vem sendo utilizado desde
						o século XVI, quando um impressor desconhecido pegou uma bandeja
						de tipos e os embaralhou para fazer um livro de modelos de tipos.
						Lorem Ipsum sobreviveu não só a cinco séculos, como também ao
						salto para a editoração eletrônica, permanecendo essencialmente
						inalterado. Se popularizou na década de 60, quando a Letraset
						lançou decalques contendo passagens de Lorem Ipsum, e mais
						recentemente quando passou a ser integrado a softwares de
						editoração eletrônica como Aldus PageMaker.</p>

				</div>
			</section>

		</main>

        <footer class="rodape">
            <h2>Show Room</h2>
            <p>Av. dos Amigos sem emprego 2180 - Sem Bloco</p>
            <p>Criado por <span>Rei Luizinho</span> &copy; 2024</p>        
        </footer>

	</div>


</body>
</html>