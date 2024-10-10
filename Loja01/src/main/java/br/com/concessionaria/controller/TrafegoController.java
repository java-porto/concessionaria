package br.com.concessionaria.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import br.com.concessionaria.model.Carro;

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
		
		//Recepção dos dados
		String nomeParame = request.getParameter("nome");
		int idadeParame = Integer.parseInt(request.getParameter("idade"));
		
		
		request.setAttribute("nm", nomeParame);
		request.setAttribute("id", idadeParame);
		
		//Realziando o redirecionamento dos dados para result.jsp
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Carro carro = new Carro();
		carro.setNome(request.getParameter("nome"));
		carro.setAno(Integer.parseInt(request.getParameter("ano")));
		carro.setModelo(request.getParameter("modelo"));
		carro.setCor(request.getParameter("cor"));
		carro.setPreco(Double.parseDouble(request.getParameter("preco")));
		
		request.setAttribute("objcarro", carro);
		
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
	}

}
