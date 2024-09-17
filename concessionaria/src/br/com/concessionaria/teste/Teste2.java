package br.com.concessionaria.teste;

import br.com.concessionaria.deptocomercial.Mecanico;
import br.com.concessionaria.showroom.Carro;

public class Teste2 {

	public static void main(String[] args) {
		
		Carro carro[] = new Carro[3];
		carro[0] = new Carro();
		carro[1] = new Carro();
		carro[2] = new Carro();
		
		carro[0].setNome("Maveric");
		carro[1].setNome("Civic");
		carro[2].setNome("Mustang");
		
		System.out.println("-----------------------------");
			
		Mecanico mecanico[] = new Mecanico[5];
		mecanico[0] = new Mecanico();
		mecanico[1] = new Mecanico();
		mecanico[2] = new Mecanico();
		mecanico[3] = new Mecanico();
		mecanico[4] = new Mecanico();
		
		mecanico[0].setNome("Vinícius");
		mecanico[1].setNome("Felipe");
		mecanico[2].setNome("Jonathan");
		mecanico[3].setNome("Jossi");
		mecanico[4].setNome("João");
		
		for (Carro carro2 : carro) {
			System.out.println("Nome do carro: " + carro2.getNome());
		}
		
		System.out.println("-----------------------------");
		
		for (Mecanico mecanico2 : mecanico) {
			System.out.println("Nome do mecanico: " + mecanico2.getNome());
		}
		
		System.out.println("-----------------------------");
	}

}
