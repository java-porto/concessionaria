package br.com.concessionaria.deptocomercial;

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
		carro.setPreco(119000);
		carro.setModelo("SUV");
		mecanico.setId(1234);
		mecanico.setNome("Jonas");
		mecanico.setCargo("Supervisor");
		lista.add(carro);
		
		//==================================
		
		carro = new Carro();
		mecanico = new Mecanico();
		
		carro.setId(2);
		carro.setAno(2014);
		carro.setCor("Preto");
		carro.setNome("Civic");
		carro.setPreco(120000);
		carro.setModelo("Sedan");
		mecanico.setId(12345);
		mecanico.setNome("Jonanthan");
		mecanico.setCargo("Mecanico 1");
		lista.add(carro);
		
		//==================================
		
		carro = new Carro();
		mecanico = new Mecanico();
		
		carro.setId(3);
		carro.setAno(2014);
		carro.setCor("Preto");
		carro.setNome("i30");
		carro.setPreco(60000);
		carro.setModelo("Hatch");
		mecanico.setId(2123);
		mecanico.setNome("Luiz");
		mecanico.setCargo("Mecanico 2");
		lista.add(carro);
		
		//==================================
		
		carro = new Carro();
		mecanico = new Mecanico();
		
		carro.setId(4);
		carro.setAno(2020);
		carro.setCor("Cinza");
		carro.setNome("HB20");
		carro.setPreco(45000);
		carro.setModelo("Hatch");
		mecanico.setId(21234);
		mecanico.setNome("Jossi");
		mecanico.setCargo("Mecanico 3");
		lista.add(carro);
		
		//==================================
		
		carro = new Carro();
		mecanico = new Mecanico();
		
		carro.setId(5);
		carro.setAno(2021);
		carro.setCor("Vermelho");
		carro.setNome("Renegade");
		carro.setPreco(100000);
		carro.setModelo("SUV");
		mecanico.setId(212345);
		mecanico.setNome("Alexandre");
		mecanico.setCargo("Mecanico 4");
		lista.add(carro);
	}
	
	public void getLista(Vendedor vendedor) {
		
		System.out.println("==========SHOWROOM==========");
		
		for (int x = 0; x < lista.size(); x++) {
			
			System.out.println("***********CARRO: "+ (lista.get(x).getNome()) +"**************");
			System.out.println("ANO: " + lista.get(x).getAno());
			System.out.println("COR: " + lista.get(x).getCor());
			System.out.println("MODELO: " + lista.get(x).getModelo());
			System.out.println("PREÇO: " + lista.get(x).getPreco());
			System.out.println("VENDEDOR RESPONSÁVEL: " + vendedor.getNome());
			System.out.println("*****************************");
		}
		System.out.println("==============================");
	}
	
	public int getCarroByName(String nomeCarro) {
		for (int x = 0; x < lista.size(); x++) {
			if(lista.get(x).getNome().equals(nomeCarro)) {
				return lista.get(x).getId();
			}
		}
		
		return 0;
	}
	
	public Carro getCarroById(int id) {	
		for (int x = 0; x < lista.size(); x++) {
			if(lista.get(x).getId() == id) {
				return lista.get(x);
			}
		}
		return null;
	}
	
	public boolean removerCarroDaLista(Carro carro) {
		for (int x = 0; x < lista.size(); x++) {
			if(lista.get(x) == carro) {
				return lista.remove(carro);
			}
		}
		return false;
	}
	
	public boolean insertCarro(Carro carro) {
		int idCarro = lista.get(lista.size()).getId()+1;
		carro.setId(idCarro);
		if(lista.add(carro)) {
			return true;
		}
		return false;
	}
}
