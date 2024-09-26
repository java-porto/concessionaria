package br.com.concessionaria.teste;

import br.com.concessionaria.deptocomercial.Mecanico;
import br.com.concessionaria.deptocomercial.Vendedor;
import br.com.concessionaria.showroom.Carro;

public class Teste2 {

	public Teste2() {
		
	}

	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor();
		vendedor.setNome("Jonas");
		vendedor.setCargo("Gerente Geral de Vendas");
		vendedor.setId(0115154);
		
		Mecanico mecanico = new Mecanico();
		mecanico.setCargo("Supervisor");
		mecanico.setId(5524);
		mecanico.setNome("Joaquim");
		
		Carro carro = new Carro();
		carro.setAno(2021);
		carro.setCor("Preta");
		carro.setMecanico(mecanico);
		carro.setModelo("Coupe");
		carro.setNome("Miura");
		carro.setPreco(87.986d);
		carro.setVendedor(vendedor);
		
		if(vendedor.insertCarro(carro)) {
			vendedor.getListaCarro(vendedor);
		}else {
			throw new NullPointerException();
		}
		}
	}
