
<%@page import="br.com.concessionaria.model.Carro"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado</title>
</head>
<body>
 
 <div>
     <%
        //double dolar = (Double)request.getAttribute("dadosDolar");
       //double bolsa = (Double)request.getAttribute("dadosBolsa");
       Carro carro = (Carro)request.getAttribute("objCarro");
     %>
 
 </div>
 <div>
    <p>MODELO DO VEÍCULO: <span><%=carro.getModelo()%></span></p>
    <p>NOME DO VEÍCULO: <span><%=carro.getNome()%></span></p>
    <p>COR DO VEÍCULO: <span><%=carro.getCor()%></span></p>
    <p>ANO DO VEÍCULO: <span><%=carro.getAno()%></span></p>
    <p>VALOR DO VEÍCULO R$: <span><%=carro.getPreco()%></span></p>
 </div>
 <p> <a href="dados.jsp">HOME</a></p>
</body>
</html>