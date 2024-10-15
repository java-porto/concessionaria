package br.com.concessionaria.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.concessionaria.model.Carro;

public class CarroDAO {
	
	public static List<Carro>banco = null;
	
	public CarroDAO() {
		
		public List<Carro> select(){
			return banco;
		}
		if(banco==null) {
			banco = new ArrayList<Carro>();
			
			Carro carro = new Carro();
			carro.setModelo("SUV");
			carro.setNome("RENEGADE");
			carro.setCor("PRATA");
			carro.setPreco(87.000);
			carro.setId(1);
			carro.setAno(2024);
			banco.add(carro);
			
			Carro carro = new Carro();
			carro.setModelo("SUV");
			carro.setNome("RENEGADE");
			carro.setCor("PRATA");
			carro.setPreco(87.000);
			carro.setId(2);
			carro.setAno(2024);
			banco.add(carro);
			
			Carro carro = new Carro();
			carro.setModelo("HATCH");
			carro.setNome("RENEGADE");
			carro.setCor("PRATA");
			carro.setPreco(87.000);
			carro.setId(3);
			carro.setAno(2024);
			banco.add(carro);
		}
		
		
	}

}
