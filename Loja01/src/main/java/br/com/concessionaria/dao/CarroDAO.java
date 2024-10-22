package br.com.concessionaria.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.concessionaria.model.Carro;

public class CarroDAO {
	
	public static List<Carro> banco = null;
	
	public CarroDAO() {
		
		if(banco == null) {
			banco = new ArrayList<Carro>();
			
			Carro carro = new Carro();
			carro.setModelo("SUV");
			carro.setNome("Renegade");
			carro.setCor("Vermelho");
			carro.setAno(2022);
			carro.setPreco(87000);
			carro.setId(1);
			banco.add(carro);
			
			carro = new Carro();
			carro.setModelo("SEDAN");
			carro.setNome("Civic");
			carro.setCor("Cinza");
			carro.setAno(2024);
			carro.setPreco(105000);
			carro.setId(2);
			banco.add(carro);
			
			carro = new Carro();
			carro.setModelo("SEDAN");
			carro.setNome("Onix");
			carro.setCor("Preto");
			carro.setAno(2013);
			carro.setPreco(10000);
			carro.setId(3);
			banco.add(carro);
		}
		
	}
	
	public List<Carro> select() {
		return banco;
	}
	
	public Carro select(int id) {
		
		for (int i = 0; i < banco.size(); i++) {
			if (banco.get(i).getId() == id) {
				return banco.get(i);
			}
		}
		return null;
		
	}
}