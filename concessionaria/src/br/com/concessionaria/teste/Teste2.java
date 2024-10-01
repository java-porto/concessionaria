package br.com.concessionaria.teste;

import java.util.List;

import br.com.concessionaria.dao.CarroDAO;
import br.com.concessionaria.showroom.Carro;

public class Teste2 {

	public Teste2() {

	}

	public static void main(String[] args) {
//		Vendedor vendedor = new Vendedor();
//		vendedor.setNome("Jonas");
//		vendedor.setCargo("Gerente Geral de Vendas");
//		vendedor.setId(0115154);
//
//		Mecanico mecanico = new Mecanico();
//		mecanico.setCargo("Supervisor");
//		mecanico.setId(5524);
//		mecanico.setNome("Joaquim");
//
//		Carro carro = new Carro();
//		carro.setAno(2021);
//		carro.setCor("Preta");
//		carro.setMecanico(mecanico);
//		carro.setModelo("Coupe");
//		carro.setNome("Miura");
//		carro.setPreco(87.986d);
//		carro.setVendedor(vendedor);
//
//		if (vendedor.insertCarro(carro)) {
//			vendedor.getListaCarro(vendedor);
//		} else {
//			throw new NullPointerException();
//		}
		
		CarroDAO cdao = new CarroDAO();
		
		Carro carro = cdao.select(1);
		Carro carro2 = new Carro();
		carro2.setNome("Outro nome");
		carro2.setAno(carro.getAno());
		System.out.println(carro2.getNome());
		
		Carro carro3 = new Carro();
		carro3.setNome("Corrola");
		carro3.setAno(2024);
		carro3.setModelo("Sedã");
		cdao.insert(carro3);
		
		cdao.delete(carro);
		
		cdao.insert(carro);
		
		List<Carro> lista = cdao.select();
		
		for (Carro car : lista) {
			System.out.println("Nome: " + car.getNome());
			System.out.println("ID: " + car.getId());
		}
		
		Carro carro4 = cdao.select(3);
		carro4.imprimirFichaCarro();
		
		carro4.setAno(1990);
		carro4.setCor("Pink");
		carro4.setPreco(30000);
		
		if(cdao.update(carro4.getId(), carro4)) {
			carro4.imprimirFichaCarro();
		} else {
			System.out.println("Ocorreu um erro durante a atualização.");
		}
	}
}
