package br.com.concessionaria.dptocomercial;

import java.util.ArrayList;
import java.util.List;

import br.com.concessionaria.showroom.Carro;

public class Vendedor extends Comercial {

	private int id;
	public static List<Carro> lista = null;

	public Vendedor() {

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
		mecanico.setCargo("Mecânico 1");
		carro.setMecanico(mecanico);
		lista.add(carro);

		//

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
		mecanico.setCargo("Mecânico 2");
		carro.setMecanico(mecanico);
		lista.add(carro);

		carro = new Carro();
		mecanico = new Mecanico();

		carro.setId(3);
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

		carro.setId(4);
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

		carro.setId(5);
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
		System.out.println("***SHOW ROOM***");
		for (int x = 0; x < lista.size(); x++) {

			System.out.println("CARRO: " + (lista.get(x).getNome()) + "");
			System.out.println("*******************************");
			System.out.println("ANO DE FABRICAÇÃO : " + lista.get(x).getAno());
			System.out.println("MODELO : " + lista.get(x).getModelo());
			System.out.println("COR : " + lista.get(x).getCor());
			System.out.println("PREÇO : " + lista.get(x).getPreco());
			System.out.println("VENDEDOR RESPONSÁVEL: " + vendedor.getNome());
			System.out.println("*******************************");

		}

	}

	public int getCarroByName(String nomeCarro) {
		for (int x = 0; x < lista.size(); x++) {
			if (lista.get(x).getNome().equals(nomeCarro)) {
				return lista.get(x).getId();

			}

		}

		return 0;
	}

	// crie um método que utilize o método getCarroByName para retornar um objeto
	// carro atavés do id

	public Carro getCarroById(int id) {
		for (int x = 0; x < lista.size(); x++) {
			if (lista.get(x).getId() == id) {
				return lista.get(x);

			}
		}

		return null;

	}

	public boolean removerCarroDaLista(Carro carro) {
		for (int x = 0; x < lista.size(); x++) {
			if (lista.get(x) == carro) {
				return lista.remove(carro);
			}

		}
		return false;
	}

	public boolean insertCarro(Carro carro) {
		
		int idCarro = lista.get(lista.size()-1).getId()+1; 
		carro.setId(idCarro);
		if(lista.add(carro)) {
			return true;
		}
		return false;
	}
	
}//final da class
