package br.com.concessionaria.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.concessionaria.bo.CarroBO;
import br.com.concessionaria.dao.CarroDAO;
import br.com.concessionaria.factory.ConnectionFactory;
import br.com.concessionaria.model.Carro;

public class Teste {

	public static void main(String[] args) {
	
//		CarroDAO cdao = new CarroDAO();
//		Carro carro = cdao.select(2);
//		
//		System.out.println("Modelo do Carro : " + carro.getModelo());
//		System.out.println("Nome do Carro : " + carro.getNome());

		CarroBO cb = new CarroBO();
		List <Carro> lista = cb.listaCarro();
		
		for (Carro carro : lista) {
			System.out.println(carro.getNome());
			System.out.println(carro.getModelo());
			System.out.println(carro.getAno());
			System.out.println(carro.getMarca());
			System.out.println(carro.getCor());
			System.out.println(carro.getPreco());
			System.out.println("\n");
		}
		
	}

}
