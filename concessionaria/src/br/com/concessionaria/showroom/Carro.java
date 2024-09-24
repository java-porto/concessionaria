package br.com.concessionaria.showroom;

import java.util.List;

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
	private List<Carro> lista = null;
	
	public Carro() {
		
	}


	public Carro(String nome, String cor, double preco, String modelo, int ano, int id, Vendedor vendedor,
			Mecanico mecanico, List<Carro> lista) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.preco = preco;
		this.modelo = modelo;
		this.ano = ano;
		this.id = id;
		this.vendedor = vendedor;
		this.mecanico = mecanico;
		this.lista = lista;
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
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	// Método para imprimir todos os atributos
	public void imprimirAtributos() {
		System.out.println("Nome: " + this.nome + " Cor: " + this.cor + " Preço: R$" + this.preco +
				" Modelo: " + this.modelo + " Ano: " + this.ano + ".\nParabéns!");

	}
}
