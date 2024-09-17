package br.com.concessionaria.teste;

import br.com.concessionaria.deptocomercial.Mecanico;
import br.com.concessionaria.showroom.Carro;

public class Teste2 {

	public Teste2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Carro carro[] = new Carro[3];
		carro[0] = new Carro();
		carro[1] = new Carro();
		carro[2] = new Carro();
		carro[0].setNome("Mavecka");
		carro[1].setNome("opala");
		carro[2].setNome("Jeep");
		
		for (Carro carro2 : carro) {
			System.out.println("Nome do carro " + carro2.getNome());
		}
		
		
		//Exercício:
		//Crie um array de mecânicos com 5 mecânicos e imprima atravez do forEach
		
		Mecanico mecanico[] = new Mecanico[5];
		mecanico[0] = new Mecanico();
		mecanico[1] = new Mecanico();
		mecanico[2] = new Mecanico();
		mecanico[3] = new Mecanico();
		mecanico[4] = new Mecanico();
		mecanico[0].setNome("Gerúndio");
		mecanico[1].setNome("Inivaldo");
		mecanico[2].setNome("Geusiton");
		mecanico[3].setNome("Aminovaldo");
		mecanico[4].setNome("Umdoberto");
		
		for (Mecanico mecanico2 : mecanico) {
			System.out.println("Nome do mecânico é " + mecanico2.getNome());
		}
	}

}
