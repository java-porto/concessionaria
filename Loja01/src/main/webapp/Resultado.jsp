<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resutado</title>
</head>
<body>

  <div>
  
     <%
       double dolar = (Double)request.getAttribute("dadosDollar");
       double  bolsa =(Double)request.getAttribute("dadosBolsa");
     
     %>
  </div>
  
  <div>
  
      <p>Dolar paralelo R$: <span><%=dolar%></span><p>
      
      <p>Bolsa de Valores R$: <span><%=bolsa%></span><p>
  </div>

</body>
</html>