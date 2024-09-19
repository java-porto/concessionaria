package br.com.concessionaria.teste;

import br.com.concessionaria.deptocomercial.Vendedor;

public class Teste2 {

	public Teste2() {
		
	}

	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor();
		vendedor.setNome("Clebsu");
		vendedor.setCargo("Gerente Geral de Vendas");
		vendedor.setId(0115154);
		vendedor.getListaCarro(vendedor);
		}
	}
