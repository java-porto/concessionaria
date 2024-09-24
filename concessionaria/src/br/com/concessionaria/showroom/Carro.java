package br.com.concessionaria.showroom;

import br.com.concessionaria.deptocomercial.Mecanico;
import br.com.concessionaria.deptocomercial.Vendedor;

public class Carro {
	private String nome;
	private String cor;
	private double preco;
	private String modelo;
	private int ano;
	private int id;
	private Vendedor vendedor;
	private Mecanico mecanico;
	
	public Carro() {}

	public Carro(String nome, String cor, double preco, String modelo, int ano, int id, Vendedor vendedor,
			Mecanico mecanico) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.preco = preco;
		this.modelo = modelo;
		this.ano = ano;
		this.id = id;
		this.vendedor = vendedor;
		this.mecanico = mecanico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Mecanico getMecanico() {
		return mecanico;
	}

	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}

	public void imprimirFichaCarro() {
		System.out.println("\nNome: " + this.nome + "\nCor: " + this.cor + "\nValor: R$"
				+ this.preco + "\nModelo: " + this.modelo + " \nAno: " + this.ano + "\nEstá correto?");
	}
	
}
