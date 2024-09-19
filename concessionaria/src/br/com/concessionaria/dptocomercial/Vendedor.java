package br.com.concessionaria.dptocomercial;

import java.util.ArrayList;
import java.util.List;

import br.com.concessionaria.showroom.Carro;

public class Vendedor extends Comercial {
	
	private List<Carro> lista = null;

	public Vendedor() {
		
		
		
		
	lista = new ArrayList<Carro>();
		
		Carro carro = new Carro();
		Mecanico mecanico = new Mecanico();
		
		
		carro.setAno(2024);
		carro.setCor("Branco");
		carro.setNome("Creta");
		carro.setPreco(100.000);
		carro.setModelo("SUV");
		mecanico.setId(1234);
		mecanico.setNome("Jonas");
		mecanico.setCargo("Mecânico 1");
		carro.setMecanico(mecanico);
		lista.add(carro);
		
		//
		
		carro = new Carro();
	    mecanico = new Mecanico();
	   
		
		carro.setAno(2025);
		carro.setCor("Prata");
		carro.setNome("Jeep");
		carro.setPreco(125.000);
		carro.setModelo("SUV");
		mecanico.setId(2312);
		mecanico.setNome("Gabiru");
		mecanico.setCargo("Mecânico 2");
		carro.setMecanico(mecanico);
		lista.add(carro);
		
		
		carro = new Carro();
	    mecanico = new Mecanico();
	    
		
		carro.setAno(2023);
		carro.setCor("Vermelho");
		carro.setNome("Tesla");
		carro.setPreco(225.000);
		carro.setModelo("SEDÃ");
		mecanico.setId(3342);
		mecanico.setNome("Jeniffer");
		mecanico.setCargo("Mecânico 3");
		carro.setMecanico(mecanico);
		lista.add(carro);
		
		
		carro = new Carro();
	    mecanico = new Mecanico();
	    
		
		carro.setAno(1967);
		carro.setCor("Preto");
		carro.setNome("Impala");
		carro.setPreco(500.000);
		carro.setModelo("SEDÃ");
		mecanico.setId(9696);
		mecanico.setNome("Johnson");
		mecanico.setCargo("Mecânico 4");
		carro.setMecanico(mecanico);
		lista.add(carro);
		
		carro = new Carro();
	    mecanico = new Mecanico();
	   
		
		carro.setAno(1967);
		carro.setCor("Preto");
		carro.setNome("Mustang");
		carro.setPreco(600.000);
		carro.setModelo("Esportivo");
		mecanico.setId(6904);
		mecanico.setNome("Zóio");
		mecanico.setCargo("Mecânico 5");
		carro.setMecanico(mecanico);
		lista.add(carro);
		
		
		
		
		
		
	
	}
	
       public void getLista(Vendedor vendedor) {
		
    	   
    	   
		for (Carro carro : lista) {
			
		
			System.out.println("***SHOW ROOM***");
			System.out.println("*******************************");	
			System.out.println("NOME : " + carro.getNome());
			System.out.println("*******************************");
			System.out.println("ANO DE FABRICAÇÃO : " + carro.getAno());
			System.out.println("*******************************");
			System.out.println("MODELO : " + carro.getModelo());
			System.out.println("*******************************");
			System.out.println("COR : " + carro.getCor());
			System.out.println("*******************************");
			System.out.println("VENDEDOR RESPONSÁVEL: " + vendedor.getNome());
			System.out.println("*******************************");
			
			
		}

       }
       
}
