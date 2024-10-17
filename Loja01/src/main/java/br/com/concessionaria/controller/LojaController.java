package br.com.concessionaria.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class LojaController
 */
public class LojaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LojaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Exercicio
		//Criar um link no PW que remeta a requisição para a pagina index.
		
		//Recepcionando os dados que chegam do index.jsp via queryString
		String nomeParam = request.getParameter("nome");
		int idadeParam = Integer.parseInt(request.getParameter("idade"));
		
		System.out.println("O nome do usuário é :" + nomeParam + " com idade de :" + idadeParam + " anos");
		
		request.setAttribute("nm", nomeParam);
		request.setAttribute("id", idadeParam);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
//		PrintWriter pw = response.getWriter();
//		response.setContentType("text/html");nm
//		pw.print("<h1>Olá Mundo!</h1>");
//		pw.print("<a href='index.jsp'>INDEX</a>");
//		pw.close();
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}