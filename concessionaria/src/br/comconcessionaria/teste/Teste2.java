package br.comconcessionaria.teste;

import br.comconcessionaria.showroom.Carro;
import br.concessionaria.comercial.Mecanico;
import br.concessionaria.comercial.Vendedor;

public class Teste2 {

	public Teste2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		
//		Carro carro[] = new Carro[3];
//		carro[0] = new Carro();
//		carro[1] = new Carro();
//		carro[2] = new Carro();
//		
//		carro[0].setNome("Mavecka");
//		carro[1].setNome("Opala");
//		carro[2].setNome("Jeep");
//		
//		for (Carro carrinho : carro) {
//			System.out.println("Nome do carro : " + carrinho.getNome());
//		}
//		
//		//Exercício:
//		//Crie um array de meânicos com 5 mecânicos e imprima
//		//através do forEach...
//		
//		Mecanico mecanico[] = new Mecanico[5];
//		mecanico[0] = new Mecanico();
//		mecanico[1] = new Mecanico();
//		mecanico[2] = new Mecanico();
//		mecanico[3] = new Mecanico();
//		mecanico[4] = new Mecanico();
//		
//		mecanico[0].setNome("Jonas");
//		mecanico[1].setNome("Gabiru");
//		mecanico[2].setNome("Vinil");
//		mecanico[3].setNome("Josi");
//		mecanico[4].setNome("José");
//		
//		for (Mecanico mecanico2 : mecanico) {
//			System.out.println("Nossos mecânicos : " + mecanico2.getNome());
//		}
//		
//		int nrLinhas  = 21;
//		int nrColunas = 4;
//		
//		String[][] assentos = new String[nrLinhas][nrColunas];
//		
//		for (int x = 0; x < assentos.length ; x++) {
//			
//			for(int i = 0; i < nrColunas ; i++) {
//				assentos[x][i] = "O";
//			}
//		}
//		
//		
//		for (int x = 0; x < assentos.length ; x++) {
//			for(int i = 0; i < nrColunas ; i++) {
//				if(i == 2) {
//					System.out.print("-");
//				}
//				System.out.print("["+ assentos[x][i] +"]");
//			}
//			System.out.println("");
//		}
//		
			
		Vendedor vendedor = new Vendedor();
		
		vendedor.setCargo("Gerente");
		vendedor.setId(12345);
		vendedor.setNome("Jonas");
		vendedor.getLista(vendedor);
		
		
		Mecanico mecanico = new Mecanico();
		mecanico.setCargo("SUPERVISOR");
		mecanico.setId(232232);
		mecanico.setNome("joaquim");
		
		Carro carro = new Carro();
		carro.setAno(2021);
		carro.setCor("PRETA");
		carro.setMecanico(mecanico);
		carro.setModelo("Coupe");
		carro.setPreco(87.5861);
		carro.setVendedor(vendedor);
		
		if(vendedor.insertCarro(carro)) {
			vendedor.getLista(vendedor);
			
		}else { 
			throw new NullPointerException();
		}
		
		
	

		//  Carro carro = vendedor.getCarroById(vendedor.getCarroByName("Mustang"));
		 // System.out.println(carro.getNome());
		
		
	     
	
	}

}


