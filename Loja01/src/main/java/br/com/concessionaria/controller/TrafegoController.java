package br.com.concessionaria.controller;

import java.io.IOException;
import java.util.List;

import br.com.concessionaria.bo.CarroBO;
import br.com.concessionaria.model.Carro;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
		CarroBO cbo = new CarroBO();
		List<Carro> lista = cbo.listaCarro();
		
		request.setAttribute("listaCarros", lista);
		
		request.getRequestDispatcher("listagem.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String modelo = request.getParameter("modelo");
		
//		Carro carro = new Carro();
//		
//		carro.setNome(request.getParameter("nome"));
//		carro.setModelo(request.getParameter("modelo"));
//		carro.setCor(request.getParameter("cor"));
//		carro.setAno(Integer.parseInt(request.getParameter("ano")));
//		carro.setPreco(Double.parseDouble(request.getParameter("preco")));
//		
//		request.setAttribute("car", carro);
//		
//		request.getRequestDispatcher("resultado.jsp").forward(request, response);
//		
		CarroBO cbo = new CarroBO();
		
		if(cbo.validacao(request.getParameter("modelo"),
				request.getParameter("nome"),
				request.getParameter("cor"),
				Integer.parseInt(request.getParameter("ano")),
				Double.parseDouble(request.getParameter("preco")))) {
			response.sendRedirect("sucesso.jsp");
		} else {
			
			String funcJs = "<script>\r\n"
					+ "        function msgErro() {\r\n"
					+ "            const elementoMsg = document.querySelector(\".Erro\")\r\n"
					+ "            setTimeout(() => {\r\n"
					+ "                elementoMsg.style.display = \"none\";\r\n"
					+ "            }, 5000);\r\n"
					+ "        }\r\n"
					+ "\r\n"
					+ "        msgErro();\r\n"
					+ "    </script>";
			
			request.setAttribute("msg", "Erro");
			request.setAttribute("al", funcJs);
			request.getRequestDispatcher("dados.jsp").forward(request, response);
		}
	}

}
