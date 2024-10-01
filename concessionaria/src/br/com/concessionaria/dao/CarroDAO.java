package br.com.concessionaria.dao;
import java.util.ArrayList;
import java.util.List;

import br.com.concessionaria.deptocomercial.Mecanico;
import br.com.concessionaria.deptocomercial.Vendedor;
import br.com.concessionaria.showroom.Carro;

public class CarroDAO {

	public static List<Carro> lista = null;
	
	public CarroDAO() {
		
	}

	public List<Carro> select() {
		return lista;
	}

	public Carro select (int id) {
		for(int x = 0; x < lista.size(); x++) {
			if(lista.get(x).getId() == id) {
				return lista.get(x);
			}
		}
		return null;
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

	
}



