package br.com.concessionaria.controller;

import java.io.IOException;
import java.util.List;

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
    public TrafegoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    //DoGet - AQUI EMBAIXO -
    
    ////Recepção dos dados
	//String nomeParame = request.getParameter("nome");
	//int idadeParame = Integer.parseInt(request.getParameter("idade"));
	
	
	//request.setAttribute("nm", nomeParame);
	//request.setAttribute("id", idadeParame);
	
	//Realziando o redirecionamento dos dados para result.jsp
	//request.getRequestDispatcher("resultado.jsp").forward(request, response);
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CarroBO cbo = new CarroBO();
		List<Carro> lista = cbo.listaCarro();
		
		request.setAttribute("listaCarros", lista);
		
		request.getRequestDispatcher("listagem.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Carro carro = new Carro();
	   //carro.setNome(request.getParameter("nome"));
		//carro.setAno(Integer.parseInt(request.getParameter("ano")));
		//carro.setModelo(request.getParameter("modelo"));
		//carro.setCor(request.getParameter("cor"));
		//carro.setPreco(Double.parseDouble(request.getParameter("preco")));
		
		//request.setAttribute("objcarro", carro);
		
		//request.getRequestDispatcher("resultado.jsp").forward(request, response);
	//}
	
		CarroBO cbo = new CarroBO();
	
		if(cbo.validacao(request.getParameter("modelo"),
			request.getParameter("nome"),
			request.getParameter("cor"),
			Integer.parseInt(request.getParameter("ano")),
			Double.parseDouble(request.getParameter("preco")))) {
			response.sendRedirect("sucesso.jsp");
		} else {
			String funcJs = "<script>\r\n"
					+ "        function msgErro(){\r\n"
					+ "            const elMsg = document.querySelector(\".Erro\");\r\n"
					+ "            setTimeout(() => {\r\n"
					+ "                elMsg.style.display = \"none\";\r\n"
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
