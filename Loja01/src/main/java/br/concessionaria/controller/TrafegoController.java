package br.concessionaria.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import br.com.concessionaria.model.Carro;
import br.concessionaria.biol.CarroBO;

/**
 * Servlet implementation class TrafegoController
 */
public class TrafegoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrafegoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CarroBO cbo = new CarroBO();
		List<Carro> lista = cbo.listaCarro();
		
		request.setAttribute("listaCarro", lista);
		
		request.getRequestDispatcher("listagem.jsp").forward(request, response);
		
		double cotaDollar = Double.parseDouble(request.getParameter("dollar"));
		double cotaBolsa = Double.parseDouble(request.getParameter("bolsa"));
		 //colocando os dados em atributos do request
		request.setAttribute("dadosDollar", cotaDollar );
		request.setAttribute("dadosBolsa", cotaBolsa);
		
		request.getRequestDispatcher("Resultado.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		///  String modelo = request.getParameter("modelo");
	    // Carro carro= new Carro();
	     // carro.setModelo(request.getParameter("modelo"));
	     // carro.setNome(request.getParameter("nome"));
	    //  carro.setCor(request.getParameter("cor"));
	     // carro.setPreco(Double.parseDouble(request.getParameter("preco")));
	    //  carro.setAno(Integer.parseInt(request.getParameter("ano")));
		
		  CarroBO cbo = new CarroBO();
		  if
		  (cbo.validacao(request.getParameter("modelo"),
				  request.getParameter("nome"),
				  request.getParameter("cor"),
				  Integer.parseInt(request.getParameter("ano")),
				  Double.parseDouble(request.getParameter("preco")))){
			response.sendRedirect("sucesso.jsp");
		  }else {
			  request.setAttribute("msg","Erro no preenchimento!!");
			  request.getRequestDispatcher("dados.jsp").forward(request, response);
			 
			  
		  }
	      
	     // request.setAttribute("objCarro", carro);
	      
	     // request.getRequestDispatcher("resultado.jsp").forward(request,  response);
	      
	      
	}

}
