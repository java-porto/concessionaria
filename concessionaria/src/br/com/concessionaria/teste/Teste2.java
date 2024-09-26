package br.com.concessionaria.teste;

import java.util.Iterator;

import br.com.concessionaria.deptocomercial.Mecanico;
import br.com.concessionaria.deptocomercial.Vendedor;
import br.com.concessionaria.showroom.Carro;

public class Teste2 {

	public static void main(String[] args) {
		
		/*Carro carro[] = new Carro[3];
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
		
		int nrLinhas = 21;
		int nrColunas = 4;
		
		String[][] assentos = new String[nrLinhas][nrColunas];
		
		for (int x = 0; x < assentos.length; x++) {
			for (int i = 0; i < nrColunas; i++) {
				assentos[x][i] = "O";
			}
		}
		
			for (int x = 0; x < assentos.length; x++) {
				for (int i = 0; i < nrColunas; i++) {
					if(i == 2) {
						System.out.println("-");
					}
					System.out.println("["+ assentos[x][i] +"]");
				}
			System.out.println("");
		}*/
		
		Vendedor vendedor = new Vendedor();
		
		vendedor.setCargo("Gerente");
		vendedor.setId(12345);
		vendedor.setNome("Jonas");
		
		Mecanico mecanico = new Mecanico();
		mecanico.setCargo("SUPERVISOR");
		mecanico.setId(2222335);
		mecanico.setNome("Joaquim");
		
		Carro carro = new Carro();
		carro.setAno(2021);
		carro.setCor("Vermelho");
		carro.setMecanico(mecanico);
		carro.setModelo("Sedan");
		carro.setNome("Sandero");
		carro.setPreco(870000);
		carro.setVendedor(vendedor);
		
		if (vendedor.insertCarro(carro)) {
			vendedor.getLista(vendedor);
		} else {
			throw new NullPointerException();
		}
		/*Carro carro = vendedor.getCarroById(vendedor.getCarroByName("i30"));*/
		
	}

}
