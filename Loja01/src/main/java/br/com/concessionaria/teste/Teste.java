package br.com.concessionaria.teste;

import br.com.concessionaria.dao.CarroDAO;
import br.com.concessionaria.model.Carro;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarroDAO cdao = new CarroDAO();
		Carro carro = cdao.select(2);
		
		System.out.println("Nome do carro: " + carro.getNome());
		System.out.println("Modelo do carro: " + carro.getModelo());
	}

}