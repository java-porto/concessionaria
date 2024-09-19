package br.com.concessionaria.deptocomercial;

import java.util.ArrayList;
import java.util.List;

import br.com.concessionaria.showroom.Carro;

public class Vendedor extends Comercial {
	
	public static List<Carro> listaCarro = null;

	public Vendedor() {
		
		listaCarro = new ArrayList<Carro>();
		
		Carro carros = new Carro();
		
		Mecanico mecanico = new Mecanico();
		
		//Carro 1
		carros.setNome("Creta");
		carros.setAno(2024);
		carros.setCor("Branco");
		carros.setPreco(119.990);
		carros.setModelo("SUV");
		mecanico.setId(1234);
		mecanico.setNome("Jonas");
		mecanico.setCargo("Supevisor");
		carros.setMecanico(mecanico);
		listaCarro.add(carros);
		
		//Carro 2
		carros.setNome("Fox");
		carros.setAno(2013);
		carros.setCor("Preto");
		carros.setPreco(6.000);
		carros.setModelo("SUV Pequeno");
		mecanico.setId(6969);
		mecanico.setNome("Felphis");
		mecanico.setCargo("Mecanico 1");
		carros.setMecanico(mecanico);
		listaCarro.add(carros);
		
		//Carro 3
		carros.setNome("Tesla");
		carros.setAno(2023);
		carros.setCor("Vermelho");
		carros.setPreco(225.000);
		carros.setModelo("SEDÃ");
		mecanico.setId(3342);
		mecanico.setNome("Jenifer");
		mecanico.setCargo("Mecanico 2");
		carros.setMecanico(mecanico);
		listaCarro.add(carros);
		
		//Carro 4
		carros.setNome("Ford");
		carros.setAno(2025);
		carros.setCor("Amarelo");
		carros.setPreco(325.000);
		carros.setModelo("SUV");
		mecanico.setId(6255);
		mecanico.setNome("Roberta");
		mecanico.setCargo("Mecanico 3");
		carros.setMecanico(mecanico);
		listaCarro.add(carros);
		
		//Carro 5
		carros.setNome("GM");
		carros.setAno(2021);
		carros.setCor("Prata");
		carros.setPreco(75.000);
		carros.setModelo("HATCH");
		mecanico.setId(6244);
		mecanico.setNome("Clayton");
		mecanico.setCargo("Mecanico 2");
		carros.setMecanico(mecanico);
		listaCarro.add(carros);
	}
	
	public void getListaCarro(Vendedor vendedor) {
		
		System.out.println("+++++SHOW ROOM+++++");
		
		for (int x = 0; x < listaCarro.size(); x++) {
					
			System.out.println("\n-----------------------------------\n");
			
			System.out.println("Carro número = " + (x+1));
			
			System.out.println("Nome: " + listaCarro.get(x).getNome());
			
			System.out.println("Ano: " + listaCarro.get(x).getAno());
			
			System.out.println("Modelo: " + listaCarro.get(x).getModelo());
			
			System.out.println("Cor: " + listaCarro.get(x).getCor());
			
			System.out.println("Preço: " + listaCarro.get(x).getPreco());
			
			System.out.println("Vendedor: " + vendedor.getNome());
			
		}
	}
}
