package br.com.concessionaria.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import br.com.concessionaria.model.Carro;


public class TrafegoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public TrafegoController() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//recepção dos dados
		double cotaDolar = Double.parseDouble(request.getParameter("dolar"));
		double cotaBolsa = Double.parseDouble(request.getParameter("bolsa"));
		
		
		//Colocando os dados em atributos do request:
		request.setAttribute("dadosDolar", cotaDolar);
		request.setAttribute("dadosBolsa", cotaBolsa);
		
		//Realizando o redirecionamento dos dados para result.jsp
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Carro carro = new Carro();
		
	}

}
