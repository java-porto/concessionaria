package br.com.concessionaria.controller;

import jakarta.servlet.ServletException;
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
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String nomeParam = request.getParameter("nomeCliente");
		String carroParam = request.getParameter("carro");
		
		System.out.println("O nome do cliente é: " + nomeParam + ", dono do veículo: " + carroParam);
		
		request.setAttribute("nc",nomeParam);
		request.setAttribute("car", carroParam);
		
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Carro carro = new Carro();
	}

}
