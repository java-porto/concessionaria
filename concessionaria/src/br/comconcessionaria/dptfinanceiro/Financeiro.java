package br.comconcessionaria.dptfinanceiro;

import br.comconcessionaria.showroom.Carro;

public class Financeiro {
private Carro carro;
	
	public Financeiro() {
		// TODO Auto-generated constructor stub
	}

	public Financeiro(Carro carro) {
		super();
		this.carro = carro;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
}
