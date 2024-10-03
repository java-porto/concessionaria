package br.com.concessionaria.model;


public class Carro {
	
	private int id;
	private String nome;
	private String modelo;
	private int ano;
	private String cor;
	private double preco;

	public Carro() {
		
	}

	public Carro(String nome, String cor, double preco, String modelo, int ano, int id) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.preco = preco;
		this.modelo = modelo;
		this.ano = ano;
		this.id = id;
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

	
	

}
