package br.com.concessionaria.teste;

import br.com.concessionaria.deptocomercial.Mecanico;
import br.com.concessionaria.showroom.Carro;

public class Teste2 {

	public Teste2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// Aula 17/09/2024	
			
		//Mecanico[] mecanico = new Mecanico[5];
		//mecanico[0] = new Mecanico();
		//mecanico[1] = new Mecanico();
		//mecanico[2] = new Mecanico();
		//mecanico[3] = new Mecanico();
		//mecanico[4] = new Mecanico();
		
		//mecanico[0].setNome("Jonathan");
		//mecanico[1].setNome("Felipe");
		//mecanico[2].setNome("Vinicius");
		//mecanico[3].setNome("Jorge");
		//mecanico[4].setNome("Gabriel");
		
		//for (Mecanico mecanicos : mecanico) {
			//System.out.println("Nome dos Mecânicos: " + mecanicos.getNome());
		//}
		
	//Aula 19/09/2024 - Matrizes
		
		//int nrLinhas = 21;
		//int nrColunas = 4;
	
		//String[][] assentos = new String[nrLinhas][nrColunas];
		
		//for (int x = 0; x < assentos.length; x++) {

			//for(int i = 0; i < nrColunas; i++) {
				//assentos[x][i] = "O";

			//}	
		//}
		
		//for (int x = 0; x < assentos.length; x++) {

			//for(int i = 0; i < nrColunas; i++) {
				//if(i == 2) {
					//System.out.print("| |");
				//}
				//System.out.print("["+ assentos[x][i] +"]");

			//}	
			//System.out.print("\n");
		//}
		
		
		Carro carro = new Carro();
		
		carro.getLista();
		
	}

}