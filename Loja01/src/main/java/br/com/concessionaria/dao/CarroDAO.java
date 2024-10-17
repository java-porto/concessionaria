package br.com.concessionaria.dao;
import java.util.ArrayList;
import java.util.List;
import br.com.concessionaria.model.Carro;

public class CarroDAO {
	public static List<Carro> banco = null;
	public CarroDAO() {
		
		if(banco == null) {
			banco = new ArrayList<Carro>();
			
			//CARRO1
			Carro carro = new Carro();
			carro.setModelo("SUV");
			carro.setNome("Renegade");
			carro.setCor("PRATA");
			carro.setAno(2022);
			carro.setPreco(87.000);
			carro.setId(1);
			banco.add(carro);
			
			//CARRO 2
			carro = new Carro();
			carro.setModelo("SEDÃ");
			carro.setNome("Prisma");
			carro.setCor("AZUL METAL");
			carro.setAno(2024);
			carro.setPreco(104.000);
			carro.setId(2);
			banco.add(carro);
			
			//CARRO 3	
			carro = new Carro();
			carro.setModelo("HATCH");
			carro.setNome("Classe A");
			carro.setCor("CINZA");
			carro.setAno(2021);
			carro.setPreco(70.000);
			carro.setId(3);
			banco.add(carro);
			
			
		}
		
	}//final do construtor

	public List<Carro> select(){
		return banco;
	}
	
	public Carro select(int id){
		
		for (int i = 0; i < banco.size(); i++) {
			if (banco.get(i).getId() == id) {
				return banco.get(i);
			}
			
		}
		return null;
	}
	
	
	
}//final da class
