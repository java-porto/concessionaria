package br.com.concessionaria.model;

public class Carro {
	
	private int id;
	private String nome;
	private String modelo;
	private String cor;
	private int ano;
	private double preco;
	
	public Carro() {}

	public Carro(int id, String nome, String modelo, String cor, int ano, double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
