package br.com.concessionaria.teste;

import br.com.concessionaria.deptocomercial.Mecanico;
import br.com.concessionaria.showroom.Carro;

public class Teste2 {

	public Teste2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

			
			
		Mecanico[] mecanico = new Mecanico[5];
		mecanico[0] = new Mecanico();
		mecanico[1] = new Mecanico();
		mecanico[2] = new Mecanico();
		mecanico[3] = new Mecanico();
		mecanico[4] = new Mecanico();
		
		mecanico[0].setNome("Jonathan");
		mecanico[1].setNome("Felipe");
		mecanico[2].setNome("Vinicius");
		mecanico[3].setNome("Jorge");
		mecanico[4].setNome("Gabriel");
		
		for (Mecanico mecanicos : mecanico) {
			System.out.println("Nome dos Mecânicos: " + mecanicos.getNome());
		}
		
	
		
	}

}
