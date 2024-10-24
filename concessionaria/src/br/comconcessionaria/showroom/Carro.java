package br.comconcessionaria.showroom;
import br.concessionaria.comercial.Mecanico;
import br.concessionaria.comercial.Vendedor;

public class Carro {
    private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String nome;
	private String cor;
	private double preco;
	private String modelo;
	private int ano;	
	private Vendedor vendedor;
	private Mecanico mecanico;
	
	
	public Carro() {}
	
	public void imprimir() {
		System.out.println("Você adquiriu o carro " + this.nome + " de cor " +
	this.cor + " com o preço R$ "+ this.preco + " modelo " + this.modelo + " do ano " + this.ano+".\nEste correto");
	}
	public void imprimirVenda() {
       System.out.println("Os dados do carro" + this.nome + "de cor" + this.cor + "com o preço R$" + this.preco +"modelo" + this.modelo +
    		   "do ano"+ this.ano +".\n Esta correto");
		
	}
	
	public Carro(String nome, String cor, double preco, String modelo, int ano, Vendedor vendedor, Mecanico mecanico) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.preco = preco;
		this.modelo = modelo;
		this.ano = ano;
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
     

}

   