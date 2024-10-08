package br.concessionaria.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

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
		// Recpcionando os dados que chegam via queristrong da  pagina
		String nomeParam = request.getParameter("nome");
		int idadeParam = Integer.parseInt( request.getParameter("idade"));
		System.out.println("O nome do usuario é :" + nomeParam + "e tem" + idadeParam + "anos");
		//Colcando os dados dentro de atributos e reenviando eles para a pagina index
		request.setAttribute("nm", nomeParam);
		request.setAttribute("id",idadeParam);
		
		request.getRequestDispatcher("index.jsp").forward(request,response);
		
		
		
//		PrintWriter pw = response.getWriter();
//		response.setContentType("text/html");
//		pw.print("<h1>Ola Mundo!</h1>");
//		pw.print("<a href = 'index.jsp'>INDEX</a");
//		//
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
