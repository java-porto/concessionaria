package br.com.concessionaria.showroom;

public class Carro {
	private String nome;
	private String cor;
	private double preco;
	private String modelo;
	private int ano;

	public Carro() {
	}

	public Carro(String nome, String cor, double preco, String modelo, int ano) {
		this.nome = nome;
		this.cor = cor;
		this.preco = preco;
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void fichaCarro() {
		System.out.println("Parabens! Você adquiriu o carro. Veja detalhes a baixo: \nNome: " + this.nome + "\nCor: " + this.cor + "\nValor: R$"
				+ this.preco + "\nModelo: " + this.modelo + " \nAno: " + this.ano);
	}
}
