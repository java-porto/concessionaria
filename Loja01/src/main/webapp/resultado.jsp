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
        double dolar = (Double)request.getAttribute("dadosDolar");
     double bolsa = (Double)request.getAttribute("dadosBolsa");
     %>
 
 </div>
 <div>
    <p>Dolar paralelo R$ : <span><%=dolar%></span></p>
     <p>Bolsa de valores R$ : <span><%=bolsa%></span></p> 
 </div>
 <p> <a href="dados.jsp">HOME</a></p>
</body>
</html>