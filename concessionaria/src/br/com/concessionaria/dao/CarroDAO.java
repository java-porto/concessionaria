package br.com.concessionaria.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.concessionaria.deptocomercial.Mecanico;
import br.com.concessionaria.showroom.Carro;

public class CarroDAO {

	public static List<Carro> listaCarro = null;

	public CarroDAO() {

		if (listaCarro == null) {

			listaCarro = new ArrayList<Carro>();

			Carro carros = new Carro();
			Mecanico mecanico = new Mecanico();

			// Carro 1
			carros.setNome("Creta");
			carros.setAno(2024);
			carros.setId(1);
			carros.setCor("Branco");
			carros.setPreco(119.990);
			carros.setModelo("SUV");
			mecanico.setId(1234);
			mecanico.setNome("Jonas");
			mecanico.setCargo("Supevisor");
			carros.setMecanico(mecanico);
			listaCarro.add(carros);

			// Carro 2
			carros = new Carro();
			mecanico = new Mecanico();

			carros.setNome("Fox");
			carros.setAno(2013);
			carros.setId(2);
			carros.setCor("Preto");
			carros.setPreco(6.000);
			carros.setModelo("SUV Pequeno");
			mecanico.setId(6969);
			mecanico.setNome("Felphis");
			mecanico.setCargo("Mecanico 1");
			carros.setMecanico(mecanico);
			listaCarro.add(carros);

			// Carro 3
			carros = new Carro();
			mecanico = new Mecanico();

			carros.setNome("Tesla");
			carros.setAno(2023);
			carros.setId(3);
			carros.setCor("Vermelho");
			carros.setPreco(225.000);
			carros.setModelo("SEDÃ");
			mecanico.setId(3342);
			mecanico.setNome("Jenifer");
			mecanico.setCargo("Mecanico 2");
			carros.setMecanico(mecanico);
			listaCarro.add(carros);

			// Carro 4
			carros = new Carro();
			mecanico = new Mecanico();

			carros.setNome("Ford");
			carros.setAno(2025);
			carros.setId(4);
			carros.setCor("Amarelo");
			carros.setPreco(325.000);
			carros.setModelo("SUV");
			mecanico.setId(6255);
			mecanico.setNome("Roberta");
			mecanico.setCargo("Mecanico 3");
			carros.setMecanico(mecanico);
			listaCarro.add(carros);

			// Carro 5
			carros = new Carro();
			mecanico = new Mecanico();

			carros.setNome("Celta");
			carros.setAno(2021);
			carros.setId(5);
			carros.setCor("Prata");
			carros.setPreco(75.000);
			carros.setModelo("HATCH");
			mecanico.setId(6244);
			mecanico.setNome("Clayton");
			mecanico.setCargo("Mecanico 2");
			carros.setMecanico(mecanico);
			listaCarro.add(carros);

		}
	}

	public List<Carro> select() {

		return listaCarro;
		
	}

	public Carro select(int id) {
		for (int x = 0; x < listaCarro.size(); x++) {
			if (listaCarro.get(x).getId() == id) {
				
				return listaCarro.get(x);
			}
		}

		return null;
	}

	public boolean delete(Carro carro) {
		for (int x = 0; x < listaCarro.size(); x++) {
			if (listaCarro.get(x) == carro) {
				return listaCarro.remove(carro);
			}
		}

		return false;
	}

	public boolean insert(Carro carro) {
		int idCarro = listaCarro.get(listaCarro.size() - 1).getId() + 1;
		carro.setId(idCarro);
		if (listaCarro.add(carro)) {
			return true;
		}
		return false;
	}
	
	public boolean update(int id, Carro carro) {
		for(int x = 0; x < listaCarro.size(); x++) {
			if (listaCarro.get(x).getId() == id) {
				listaCarro.add(x, carro);
				return true;
			}
		}
		
		return false;
	}

}
