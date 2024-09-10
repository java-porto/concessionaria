package br.comconcessionaria.showroom;

import br.comconcessionaria.dptcomercial.Mecanico;
import br.comconcessionaria.dptcomercial.Vendedor;

public class Carro {
	private String nome;
	private String cor;
	private double preco;
	private String modelo;
	private int ano;
	public String getNome;
	private Vendedor vendedor;
	private Mecanico mecanico;
	
	public Carro(String nome) {
		this.nome = nome;
		
	}
	
	 public Carro() {
		// TODO Auto-generated constructor stub
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
	public double getPreco() {
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
    public void imprimir() {
    	System.out.println("Voce adquiriu o carro " + this.nome +" de cor" + this.cor + " com o preco r$ " + this.preco + "modelo" + this.modelo + "do ano" + this.ano);
    	
    }
    
    	
    	
    	
    	

	

}
