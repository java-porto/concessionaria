package br.com.concessionaria.dao;
import java.util.ArrayList;
import java.util.List;

import br.com.concessionaria.deptocomercial.Mecanico;
import br.com.concessionaria.deptocomercial.Vendedor;
import br.com.concessionaria.showroom.Carro;

public class CarroDAO {

	public static List<Carro> lista = null;
	
	public CarroDAO() {

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
		
		
		//--------------------------------
		carro = new Carro();
		mecanico = new Mecanico();

		carro.setId(2);
		carro.setAno(2024);
		carro.setCor("Preto");
		carro.setNome("Jeep");
		carro.setPreco(125.000);
		carro.setModelo("SUV");
		mecanico.setId(2361);
		mecanico.setNome("Gabriel");
		mecanico.setCargo("Mecânico");

		lista.add(carro);
		
		
		//--------------------------------
		
		carro = new Carro();
		mecanico = new Mecanico();

		carro.setId(3);
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

		carro.setId(4);
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

		carro.setId(5);
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
	
	public void getLista(Vendedor vendedor) {
		System.out.println("\n+++++++++++++++++++++++ SHOWROOM +++++++++++++++++++++++++++\n");
		for(int x = 0; x < lista.size(); x++) {
			
			System.out.println("*********************CARRO NR = "+ (lista.get(x).getId()) +"*****************************\n");
			System.out.println("Nome do Carro:  " + lista.get(x).getNome());
			System.out.println("Ano de Fabricação:  " + lista.get(x).getAno());
			System.out.println("Modelo:  " + lista.get(x).getModelo());
			System.out.println("Cor:  " + lista.get(x).getCor());
			System.out.println("Preço:  " + lista.get(x).getPreco());
			System.out.println("VENDEDOR RESPONSÁVEL:  " + vendedor.getNome());
			System.out.println("\n**************************************************************");
		}
		
	}

	public int getCarroByName(String nomeCarro) {
		for(int x = 0; x < lista.size(); x++) {
			if(lista.get(x).getNome().equals(nomeCarro)) {
				return lista.get(x).getId();
			}
		}
		return 0;
	}
	
	
	
	//Crie um método que utilize o método getCarroByName para retornar um Objeto Carro através do ID.
	
	

//	public Carro getCarroById(int id) {
//	    for (Carro carro : lista) { 
//	        if (carro.getId() == id) {
//	            return carro;
//	        }
//	    }
//	    return null; 
//	}

	public Carro getCarroById(int id) {
		for(int x = 0; x < lista.size(); x++) {
			if(lista.get(x).getId() == id) {
				return lista.get(x);
			}
		}
		return null;
	}

	public boolean removerCarroDaLista(Carro carro) {
		for(int x = 0; x < lista.size(); x++) {
			if(lista.get(x) == carro) {
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
	
}



