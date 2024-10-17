package br.com.concessionaria.teste;

import br.com.concessionaria.dao.CarroDAO;
import br.com.concessionaria.model.Carro;

public class Teste {

	public static void main(String[] args) {
		
		CarroDAO cdao = new CarroDAO();
		Carro carro = cdao.select(2);
		
		System.out.println("Modelo do Carro : " + carro.getModelo());
		System.out.println("Nome do Carro : " + carro.getNome());

	}

}
