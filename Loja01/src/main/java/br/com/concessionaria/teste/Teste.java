package br.com.concessionaria.teste;

import java.util.List;

import br.com.concessionaria.controller.CarroBO;
import br.com.concessionaria.controller.CarroDAO;
import br.com.concessionaria.factory.ConnectionFactory;
import br.com.concessionaria.model.Carro;

public class Teste {

	public static void main(String[] args) {
//		CarroDAO cDAO = new CarroDAO();
//		Carro carro = cDAO.select(3);
//		
//		System.out.println("nome do carro: " + carro.getNome());
//		System.out.println("Modelo do carro: " + carro.getModelo());
		
		CarroBO cb = new CarroBO();
		List<Carro> lista = cb.listaCarro();
		
		for (Carro carro : lista) {
			System.out.println("----");
			System.out.println("\n");
			System.out.println(carro.getNome());
			System.out.println(carro.getModelo());
			System.out.println(carro.getMarca());
			System.out.println(carro.getAno());
			System.out.println(carro.getCor());
			System.out.println(carro.getPreco());
			System.out.println("----");
			System.out.println("\n");
		}
	}

}