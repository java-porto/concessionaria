package br.com.concessionaria.deptocomercial;

import java.util.ArrayList;
import java.util.List;

import br.com.concessionaria.showroom.Carro;

public class Vendedor extends Comercial {
	
	private int id;
	
	public static List<Carro> listaCarro = null;

	public Vendedor() {
		
		listaCarro = new ArrayList<Carro>();
		
		Carro carros = new Carro();
		Mecanico mecanico = new Mecanico();
		
		//Carro 1
		carros.setNome("Creta");
		carros.setAno(2024);
		carros.setId(25422);
		carros.setCor("Branco");
		carros.setPreco(119.990);
		carros.setModelo("SUV");
		mecanico.setId(1234);
		mecanico.setNome("Jonas");
		mecanico.setCargo("Supevisor");
		carros.setMecanico(mecanico);
		listaCarro.add(carros);
		
		//Carro 2
		carros = new Carro();
		mecanico = new Mecanico();
		
		carros.setNome("Fox");
		carros.setAno(2013);
		carros.setId(45487);
		carros.setCor("Preto");
		carros.setPreco(6.000);
		carros.setModelo("SUV Pequeno");
		mecanico.setId(6969);
		mecanico.setNome("Felphis");
		mecanico.setCargo("Mecanico 1");
		carros.setMecanico(mecanico);
		listaCarro.add(carros);
		
		//Carro 3
		carros = new Carro();
		mecanico = new Mecanico();
		
		carros.setNome("Tesla");
		carros.setAno(2023);
		carros.setId(54177);
		carros.setCor("Vermelho");
		carros.setPreco(225.000);
		carros.setModelo("SEDÃ");
		mecanico.setId(3342);
		mecanico.setNome("Jenifer");
		mecanico.setCargo("Mecanico 2");
		carros.setMecanico(mecanico);
		listaCarro.add(carros);
		
		//Carro 4
		carros = new Carro();
		mecanico = new Mecanico();
		
		carros.setNome("Ford");
		carros.setAno(2025);
		carros.setId(54412);
		carros.setCor("Amarelo");
		carros.setPreco(325.000);
		carros.setModelo("SUV");
		mecanico.setId(6255);
		mecanico.setNome("Roberta");
		mecanico.setCargo("Mecanico 3");
		carros.setMecanico(mecanico);
		listaCarro.add(carros);
		
		//Carro 5
		carros = new Carro();
		mecanico = new Mecanico();
		
		carros.setNome("Celta");
		carros.setAno(2021);
		carros.setId(264645);
		carros.setCor("Prata");
		carros.setPreco(75.000);
		carros.setModelo("HATCH");
		mecanico.setId(6244);
		mecanico.setNome("Clayton");
		mecanico.setCargo("Mecanico 2");
		carros.setMecanico(mecanico);
		listaCarro.add(carros);
	}
	
	public void getListaCarro(Vendedor vendedor) {
		
		System.out.println("+++++SHOW ROOM+++++");
		
		for (int x = 0; x < listaCarro.size(); x++) {
					
			System.out.println("\n-----------------------------------\n");
			
			System.out.println("Carro: " + (listaCarro.get(x).getNome()));
			
			System.out.println("Ano: " + listaCarro.get(x).getAno());
			
			System.out.println("Modelo: " + listaCarro.get(x).getModelo());
			
			System.out.println("Cor: " + listaCarro.get(x).getCor());
			
			System.out.println("Preço: " + listaCarro.get(x).getPreco());
			
			System.out.println("Vendedor: " + vendedor.getNome());
			
		}
	}
	
	public int getCarrobyName(String nomeCarro) {
		for(int x = 0; x < listaCarro.size(); x++) {
			if(listaCarro.get(x).getNome().equals(nomeCarro)) { //.equals é um metodo que se compara o conteúdo do objeto
				return listaCarro.get(x).getId();
			}
		}
		
		return 0;
	}
	
	//Crie um metodo que utilize o metodo getCarroByName para retornar um objeto carro atravez do ID
	
	public Carro getCarroById(int id) {
		for(int x = 0; x < listaCarro.size(); x++) {
			if(listaCarro.get(x).getId() == id) {
				return listaCarro.get(x);
			}
		}
		
		return null;
	}
	
	public boolean removeCarroDaListaCarro(Carro carro) {
		for(int x = 0; x < listaCarro.size(); x++) {
			if(listaCarro.get(x) == carro) {
				return listaCarro.remove(carro);
			}
		}
		
		return false;
	}
	
	public boolean insertCarro(Carro carro) {
		int idCarro = listaCarro.get(listaCarro.size()).getId()+1;
		carro.setId(idCarro);
		if(listaCarro.add(carro)) {
			return true;
		}
		return false;
	}
}
