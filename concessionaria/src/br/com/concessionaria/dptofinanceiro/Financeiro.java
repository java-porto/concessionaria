package br.com.concessionaria.dptofinanceiro;

import br.com.concessionaria.showroom.Carro;

public class Financeiro {
	
	
	
	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public Financeiro(Carro carro) {
		super();
		this.carro = carro;
	}

	private Carro carro;

	public Financeiro() {
		
	}

	
}
