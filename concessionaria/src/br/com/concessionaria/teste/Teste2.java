package br.com.concessionaria.teste;

import br.com.concessionaria.deptocomercial.Mecanico;
import br.com.concessionaria.showroom.Carro;

public class Teste2 {

	public static void main(String[] args) {

//		Carro carro[] = new Carro[3];
//
//		carro[0] = new Carro();
//		carro[1] = new Carro();
//		carro[2] = new Carro();
//
//		carro[0].setNome("Fiesta");
//		carro[1].setNome("Civic");
//		carro[2].setNome("Lancer");
//		
//		for (Carro carro2 : carro) {
//			System.out.println("Nome do carro : " + carro2.getNome());
//		}
//		
		//Exercício:
		//Crie um array de mecânicos com 5 mecânicos e imprima:
		
		Mecanico mecanico[] = new Mecanico[5];
		mecanico[0] = new Mecanico();
		mecanico[1] = new Mecanico();
		mecanico[2] = new Mecanico();
		mecanico[3] = new Mecanico();
		mecanico[4] = new Mecanico();
		
		mecanico[0].setNome("Jorge");
		mecanico[1].setNome("Arnaldo");
		mecanico[2].setNome("Airton");
		mecanico[3].setNome("Plinio");
		mecanico[4].setNome("João");
		
		//através do foreach:
		for (Mecanico mecanico2 : mecanico) {
			System.out.println("O nome do mecanico que te atendeu foi : " + mecanico2.getNome());
		}
		
		
		
		
	}

}
