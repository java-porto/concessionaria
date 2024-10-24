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
	
	public Carro() {
	
	}
	
	public void DadosCarro() {
		System.out.println(this.nome +  " cor: " + 
		this.cor + " preço: R$ " + this.preco + " modelo: " + this.modelo + " ano: " + this.ano + "\nCorreto ?");
	}

	public void DadosVenda() {
		System.out.println("Dados do veículo: " + this.nome +  " cor: " + 
		this.cor + " preço: R$ " + this.preco + " modelo: " + this.modelo + " ano: " + this.ano + "\nDados corretos ?");
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

	public void setMecanico(Mecanico mecanico) {
		// TODO Auto-generated method stub
		
	}

	public void setVendedor(Vendedor vendedor) {
		// TODO Auto-generated method stub
		
	}

}
