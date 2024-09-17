package br.com.concessionaria.teste;

import br.com.concessionaria.dptocomercial.Mecanico;
import br.com.concessionaria.showroom.Carro;

public class teste2 {

	public teste2() {
		
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
	//crie um array de mecânicos com 5 mecanicos e imprima através do foreach
	
	Mecanico mecanico[] = new Mecanico [5];
	mecanico[0] = new Mecanico();
	mecanico[1] = new Mecanico();
	mecanico[2] = new Mecanico();
	mecanico[3] = new Mecanico();
	mecanico[4] = new Mecanico();
	
	mecanico[0].setNome("Arrascaeta");
	mecanico[1].setNome("Datena");
	mecanico[2].setNome("Kety <3");
	mecanico[3].setNome("Pablo marçal");
	mecanico[4].setNome("Franchesco virgulini");
	
	for (Mecanico mecaninho : mecanico) {
		System.out.println("Nome do mecânico : " + mecaninho.getNome());
	}
	
	
	
	
	
	
	
	

	}

}


