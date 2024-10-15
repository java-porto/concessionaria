package br.com.concessionaria.dao;
import java.util.ArrayList;
import java.util.List;
import br.com.concessionaria.model.Carro;

public class CarroDAO {

	public static List<Carro> banco =null;
	public CarroDAO() {
		
		if (banco == null) {
			banco = new ArrayList<Carro>();
			
			Carro carro = new Carro();
			
			carro.setModelo("SUV");
			carro.setNome("RENEGADE");
			carro.setCor("PRATA");
			carro.setAno(2022);
			carro.setPreco(87.000);
			carro.setId(1);
			banco.add(carro);
			
			
			carro.setModelo("SEDÃ");
			carro.setNome("ONIX");
			carro.setCor("AZUL METAL");
			carro.setAno(2024);
			carro.setPreco(105.000);
			carro.setId(2);
			banco.add(carro);
			
			carro.setModelo("HATCH");
			carro.setNome("CLASSE A");
			carro.setCor("CINZA");
			carro.setAno(2024);
			carro.setPreco(70.000);
			carro.setId(3);
			banco.add(carro);
		}
	}

	public List<Carro> select(){
		return banco;
		}
}
