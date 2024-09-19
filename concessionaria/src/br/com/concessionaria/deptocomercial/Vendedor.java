package br.com.concessionaria.deptocomercial;

import java.util.ArrayList;
import java.util.List;

import br.com.concessionaria.showroom.Carro;

public class Vendedor extends Comercial {
	
	public static List<Carro> lista = null;

	public Vendedor() {
		
		
		lista = new ArrayList<Carro>();
		
		Carro carro = new Carro();
		Mecanico mecanico = new Mecanico();
		
		carro.setAno(2024);
		carro.setCor("Branco");
		carro.setNome("Creta");
		carro.setPreco(119000);
		carro.setModelo("SUV");
		carro.setMecanico(mecanico);
		mecanico.setId(1234);
		mecanico.setNome("Jonas");
		mecanico.setCargo("Supervisor");
		lista.add(carro);
		
		//==================================
		
		carro = new Carro();
		mecanico = new Mecanico();
		
		carro.setAno(2014);
		carro.setCor("Preto");
		carro.setNome("Civic");
		carro.setPreco(120000);
		carro.setModelo("Sedan");
		carro.setMecanico(mecanico);
		mecanico.setId(12345);
		mecanico.setNome("Jonanthan");
		mecanico.setCargo("Mecanico 1");
		lista.add(carro);
		
		//==================================
		
		carro = new Carro();
		mecanico = new Mecanico();
				
		carro.setAno(2014);
		carro.setCor("Preto");
		carro.setNome("i30");
		carro.setPreco(60000);
		carro.setModelo("Hatch");
		carro.setMecanico(mecanico);
		mecanico.setId(2123);
		mecanico.setNome("Luiz");
		mecanico.setCargo("Mecanico 2");
		lista.add(carro);
		
		//==================================
		
		carro = new Carro();
		mecanico = new Mecanico();
						
		carro.setAno(2020);
		carro.setCor("Cinza");
		carro.setNome("HB20");
		carro.setPreco(45000);
		carro.setModelo("Hatch");
		carro.setMecanico(mecanico);
		mecanico.setId(21234);
		mecanico.setNome("Jossi");
		mecanico.setCargo("Mecanico 3");
		lista.add(carro);
		
		//==================================
		
		carro = new Carro();
		mecanico = new Mecanico();
								
		carro.setAno(2021);
		carro.setCor("Vermelho");
		carro.setNome("Renegade");
		carro.setPreco(100000);
		carro.setModelo("SUV");
		carro.setMecanico(mecanico);
		mecanico.setId(212345);
		mecanico.setNome("Alexandre");
		mecanico.setCargo("Mecanico 4");
		lista.add(carro);
	}
	
	public void getLista(Vendedor vendedor) {
		
		System.out.println("==========SHOWROOM==========");
		
		for (int x = 0; x < lista.size(); x++) {
			
			System.out.println("***********CARRO NR = "+ (x+1) +"**************");
			System.out.println("NOME: " + lista.get(x).getNome());
			System.out.println("ANO: " + lista.get(x).getAno());
			System.out.println("COR: " + lista.get(x).getCor());
			System.out.println("MODELO: " + lista.get(x).getModelo());
			System.out.println("PREÇO: " + lista.get(x).getPreco());
			System.out.println("VENDEDOR RESPONSÁVEL: " + vendedor.getNome());
			System.out.println("*****************************");
		}
		System.out.println("==============================");
	}
	
}
