package br.com.concessionaria.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.concessionaria.deptocomercial.Mecanico;
import br.com.concessionaria.deptocomercial.Vendedor;
import br.com.concessionaria.showroom.Carro;

public class CarroDAO {

	public static List<Carro> lista = null;
	
	public CarroDAO() {
		
		if(lista == null) {
		lista = new ArrayList<Carro>();

		Carro carro = new Carro();
		Mecanico mecanico = new Mecanico();

		carro.setId(1);
		carro.setAno(2024);
		carro.setCor("Branco");
		carro.setNome("Creta");
		carro.setPreco(100.000);
		carro.setModelo("SUV");
		mecanico.setId(1234);
		mecanico.setNome("Jonas");
		mecanico.setCargo("Supervisor");
		carro.setMecanico(mecanico);
		lista.add(carro);

		// =============================

		carro = new Carro();
		mecanico = new Mecanico();
		carro.setId(2);
		carro.setAno(2025);
		carro.setCor("Prata");
		carro.setNome("Jeep");
		carro.setPreco(125.000);
		carro.setModelo("SUV");
		mecanico.setId(2312);
		mecanico.setNome("Gabiru");
		mecanico.setCargo("Mecânico 1");
		carro.setMecanico(mecanico);
		lista.add(carro);

		// =============================

		carro = new Carro();
		mecanico = new Mecanico();
		carro.setId(3);
		carro.setAno(2023);
		carro.setCor("Vermelho");
		carro.setNome("Tesla");
		carro.setPreco(225.000);
		carro.setModelo("SEDÃ");
		mecanico.setId(3342);
		mecanico.setNome("Jennifer");
		mecanico.setCargo("Mecânico 1");
		carro.setMecanico(mecanico);
		lista.add(carro);

		// =======================================================================================================================================================================

		carro = new Carro();
		mecanico = new Mecanico();
		carro.setId(4);
		carro.setAno(2010);
		carro.setCor("Preto");
		carro.setNome("Civic");
		carro.setPreco(70.000);
		carro.setModelo("Si");
		mecanico.setId(1123);
		mecanico.setNome("José");
		mecanico.setCargo("Mecanico 1");
		carro.setMecanico(mecanico);
		lista.add(carro);

		// ===========================================================================================================================================================================

		carro = new Carro();
		mecanico = new Mecanico();
		carro.setId(5);

		carro.setAno(2015);
		carro.setCor("Azul");
		carro.setNome("Civic");
		carro.setPreco(100.000);
		carro.setModelo("G10");
		mecanico.setId(1237);
		mecanico.setNome("Joseildo");
		mecanico.setCargo("Mecanico 1");
		carro.setMecanico(mecanico);
		lista.add(carro);

		// =======================================================================================================================================================================

		carro = new Carro();
		mecanico = new Mecanico();
		carro.setId(6);
		carro.setAno(2007);
		carro.setCor("Cinza");
		carro.setNome("Astra");
		carro.setPreco(35.000);
		carro.setModelo("Sunny");
		mecanico.setId(6660);
		mecanico.setNome("Jennifer");
		mecanico.setCargo("Mecanico 1");
		carro.setMecanico(mecanico);
		lista.add(carro);

		// =======================================================================================================================================================================

		carro = new Carro();
		mecanico = new Mecanico();
		carro.setId(7);
		carro.setAno(2014);
		carro.setCor("Vermelho");
		carro.setNome("i30");
		carro.setPreco(95.000);
		carro.setModelo("Hatch");
		mecanico.setId(3324);
		mecanico.setNome("Jonathan");
		mecanico.setCargo("Mecanico 1");
		carro.setMecanico(mecanico);
		lista.add(carro);
		}
	}
	
	public List<Carro> select() {
		return lista;
	}
	
	
	public Carro select(int id) {
		for(int x = 0; x < lista.size(); x++) {
			if(lista.get(x).getId() == id ) {
				return lista.get(x);
			}
		}
		
		return null;
	}
		
	public boolean delete(Carro carro) {
		for(int x = 0; x < lista.size(); x++) {
			if(lista.get(x) == carro) {
				return lista.remove(carro);
			}
		}
		return false;
	}
	
	public boolean insert(Carro carro) {
		
		int idCarro = lista.get(lista.size()-1).getId()+1;
		carro.setId(idCarro);
		if(lista.add(carro)) {
			return true;
		}
		return false;
	}
	
	
	public boolean update(int id, Carro carro) {
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getId() == id) {
				lista.add(i, carro);
				return true;
			}
		}
		return false;
	}
	
}