package br.com.concessionaria.dao;
import java.util.ArrayList;
import java.util.List;

import br.com.concessionaria.deptocomercial.Mecanico;
import br.com.concessionaria.deptocomercial.Vendedor;
import br.com.concessionaria.showroom.Carro;

public class CarroDAO {

	public static List<Carro> lista = null;
	
	public CarroDAO() {

	if (lista == null)	{
	
		lista = new ArrayList<Carro>();
		
		
		Carro carro = new Carro();
		Vendedor vendedor = new Vendedor();
		
		//Carro 1
		carro.setNome("Creta");
		carro.setAno(2024);
		carro.setId(1);
		carro.setCor("Branco");
		carro.setPreco(119.999);
		carro.setModelo("SUV");
		vendedor.setNome("Jonas");
		vendedor.setCargo("Supervisor");
		carro.setVendedor(vendedor);
		lista.add(carro);
		
		carro = new Carro();
		vendedor = new Vendedor();
		
		//Carro 2
		carro.setNome("Celta");
		carro.setAno(2005);
		carro.setId(2);
		carro.setCor("Branco");
		carro.setPreco(19.999);
		carro.setModelo("HATCH");
		vendedor.setNome("Carlos");
		vendedor.setCargo("Vendedor 1");
		carro.setVendedor(vendedor);
		lista.add(carro);	
		
		
		carro = new Carro();
		vendedor = new Vendedor();
		
		//Carro 3
		carro.setNome("Tesla");
		carro.setAno(2008);
		carro.setId(3);
		carro.setCor("Preto");
		carro.setPreco(90.000);
		carro.setModelo("SUV");
		vendedor.setNome("Pedro");
		vendedor.setCargo("Vendedor 2");
		carro.setVendedor(vendedor);
		lista.add(carro);
		
		
		carro = new Carro();
		vendedor = new Vendedor();
		
		//Carro 3
		carro.setNome("Jeep");
		carro.setAno(2023);
		carro.setId(4);
		carro.setCor("Prata");
		carro.setPreco(70.000);
		carro.setModelo("Sedã");
		vendedor.setNome("Henrique");
		vendedor.setCargo("Gerente");
		carro.setVendedor(vendedor);
		lista.add(carro);
		
		
		
		}
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



