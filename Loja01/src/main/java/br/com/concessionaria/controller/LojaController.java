package br.com.concessionaria.controller;

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
		
		//Exercício: Crie um link no PW que remeta a requisição para a página index. Senão souber como a tag <a> funciona pode pesquisar
		//Na página jsp faça o mesmo, crie um link para a servelet
		
		//Recepcionando os dados que chegam via querystring da página index.
		
		String nomeParam = request.getParameter("nome");
		
		int idadeParam = Integer.parseInt(request.getParameter("idade"));
		
		System.out.println("O nome do usuário é: " + nomeParam + " e a idade é de " + idadeParam + " anos.");
		
		//Colocando os dados dentro de atributos e reenviando para a página index
		request.setAttribute("nm", nomeParam);
		request.setAttribute("id", idadeParam);
		
		//Realizando o envio de fato através getRequestDispatcher
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
//		PrintWriter pw = response.getWriter();
//		response.setContentType("text/html");
//		pw.print("<h1>Olá Mundo!</h1>");
//		pw.print("<a href='index.jsp'>Link para a página</a>");	
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
