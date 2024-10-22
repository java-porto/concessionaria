package br.com.concessionaria.teste;

import br.com.concessionaria.dao.CarroDAO;
import br.com.concessionaria.factory.ConnectionFactory;
import br.com.concessionaria.model.Carro;

public class Teste {

	public static void main(String[] args) {
		
		//CarroDAO cDAO = new CarroDAO();
		//Carro carro = cDAO.select(3);


		
		//System.out.println("nome do carro: " + carro.getNome());
		//System.out.println("Modelo do carro: " + carro.getModelo());
	
		ConnectionFactory cf = new ConnectionFactory();
		cf.getConexao();
		
	
	}

}