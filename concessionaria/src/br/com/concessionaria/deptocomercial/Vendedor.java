package br.com.concessionaria.deptocomercial;

import java.util.ArrayList;
import java.util.List;

import br.com.concessionaria.showroom.Carro;

public class Vendedor extends Comercial{
	
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
		mecanico.setCargo("Supervisor");
		carro.setMecanico(mecanico);
		carro.setVendedor(getClass().cast(mecanico));
		lista.add(carro);
		
		
		//--------------------------------
		carro = new Carro();
		mecanico = new Mecanico();

		
		carro.setAno(2024);
		carro.setCor("Preto");
		carro.setNome("Jeep");
		carro.setPreco(125.000);
		carro.setModelo("SUV");
		mecanico.setId(2361);
		mecanico.setNome("Gabriel");
		mecanico.setCargo("Mecânico");
		carro.setMecanico(mecanico);
		lista.add(carro);
		
		
		//--------------------------------
		
		carro = new Carro();
		mecanico = new Mecanico();

		
		carro.setAno(2025);
		carro.setCor("Vermelho");
		carro.setNome("Tesla");
		carro.setPreco(225.000);
		carro.setModelo("SEDAN");
		mecanico.setId(2345);
		mecanico.setNome("Vinicius");
		mecanico.setCargo("Mecânico 1");
		carro.setMecanico(mecanico);
		lista.add(carro);
		
		//--------------------------------
		
		carro = new Carro();
		mecanico = new Mecanico();

				
		carro.setAno(2025);
		carro.setCor("Prata");
		carro.setNome("Mercedes AMG");
		carro.setPreco(250.000);
		carro.setModelo("SEDAN");
		mecanico.setId(2373);
		mecanico.setNome("Joci");
		mecanico.setCargo("Mecânico 3");
		carro.setMecanico(mecanico);
		lista.add(carro);
				
		//--------------------------------
				
		carro = new Carro();
		mecanico = new Mecanico();

				
		carro.setAno(2024);
		carro.setCor("Preto");
		carro.setNome("Nissan Kicks");
		carro.setPreco(105.000);
		carro.setModelo("SEDAN");
		mecanico.setId(2350);
		mecanico.setNome("Jonathan");
		mecanico.setCargo("Mecânico 2");
		carro.setMecanico(mecanico);
		lista.add(carro);
		
		
	}

}
