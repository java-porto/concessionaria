package br.com.concessionaria.teste;

import br.com.concessionaria.deptocomercial.Mecanico;
import br.com.concessionaria.showroom.Carro;

public class Teste2 {
	
	public Teste2() {
		
	}

	public static void main(String[] args) {
		
		Carro carro[] = new Carro[3];
		carro[0] = new Carro();
		carro[1] = new Carro();
		carro[2] = new Carro();
		
		carro[0].setNome("Mavecka");
		carro[1].setNome("Opala");
		carro[2].setNome("Jeep");
		
		for (Carro carrinho : carro) {
			System.out.println("Nome do carro : " + carrinho.getNome());
		}
		
		//Exercício:
		//Crie um array de meânicos com 5 mecânicos e imprima
		//através do forEach...
		
		Mecanico mecanico[] = new Mecanico[5];
		mecanico[0] = new Mecanico();
		mecanico[1] = new Mecanico();
		mecanico[2] = new Mecanico();
		mecanico[3] = new Mecanico();
		mecanico[4] = new Mecanico();
		
		mecanico[0].setNome("Jonas");
		mecanico[1].setNome("Gabiru");
		mecanico[2].setNome("Vinil");
		mecanico[3].setNome("Josi");
		mecanico[4].setNome("José");
		
		for (Mecanico mecanico2 : mecanico) {
			System.out.println("Nossos mecânicos : " + mecanico2.getNome());
		}
		
		
		
		
		
		
	}


	

	}


