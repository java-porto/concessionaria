package br.com.concessionaria.showroom;


import java.util.ArrayList;
import java.util.List;

import br.com.concessionaria.deptocomercial.Mecanico;
import br.com.concessionaria.deptocomercial.Vendedor;

public class Carro {

	private String nome;
	private String cor;
	private double preco;
	private String modelo;
	private int ano;
	private Vendedor vendedor;
	private Mecanico mecanico; 
	private List<Carro> lista = null;
	
	public Carro() {
		lista = new ArrayList<Carro>();
		Carro carro = new Carro();
		Mecanico mecanico = new Mecanico();
		Vendedor vendedor = new Vendedor();
		
		carro.setAno(2000);
		carro.setCor("Prata");
		carro.setNome("Civic");
		carro.setPreco(15.000);
		carro.setModelo("LX");
		mecanico.setId(1234);
		mecanico.setNome("Roseildo");
		mecanico.setCargo("Supervisor");
		carro.setMecanico(mecanico);
		vendedor.setNome("Josué");
		vendedor.setCargo("Chefe");
		vendedor.setId(1236);
		carro.setVendedor(vendedor);
		lista.add(carro);
		
		//=======================================================================================================================================================================
		
		carro = new Carro();
		mecanico = new Mecanico();
		vendedor = new Vendedor();
		
		carro.setAno(2010);
		carro.setCor("Preto");
		carro.setNome("Civic");
		carro.setPreco(70.000);
		carro.setModelo("Si");
		mecanico.setId(1123);
		mecanico.setNome("José");
		mecanico.setCargo("Mecanico 1");
		carro.setMecanico(mecanico);
		vendedor.setNome("Jeferson");
		vendedor.setCargo("Gerente");
		vendedor.setId(1235);
		carro.setVendedor(vendedor);
		lista.add(carro);
		
		//===========================================================================================================================================================================
		
		carro = new Carro();
		mecanico = new Mecanico();
		vendedor = new Vendedor();
		
		carro.setAno(2015);
		carro.setCor("Azul");
		carro.setNome("Civic");
		carro.setPreco(100.000);
		carro.setModelo("G10");
		mecanico.setId(1237);
		mecanico.setNome("Joseildo");
		mecanico.setCargo("Mecanico 1");
		carro.setMecanico(mecanico);
		vendedor.setNome("Mário");
		vendedor.setCargo("Vendedor 1");
		vendedor.setId(1240);
		carro.setVendedor(vendedor);
		lista.add(carro);
		
		//=======================================================================================================================================================================
		
		carro = new Carro();
		mecanico = new Mecanico();
		vendedor = new Vendedor();
		
		carro.setAno(2007);
		carro.setCor("Cinza");
		carro.setNome("Astra");
		carro.setPreco(35.000);
		carro.setModelo("Sunny");
		mecanico.setId(6660);
		mecanico.setNome("Jennifer");
		mecanico.setCargo("Mecanico 1");
		carro.setMecanico(mecanico);
		vendedor.setNome("Patrick");
		vendedor.setCargo("Vendedor 1");
		vendedor.setId(1140);
		carro.setVendedor(vendedor);
		lista.add(carro);
		
		//=======================================================================================================================================================================
		
		carro = new Carro();
		mecanico = new Mecanico();
		vendedor = new Vendedor();
		
		carro.setAno(2014);
		carro.setCor("Vermelho");
		carro.setNome("i30");
		carro.setPreco(95.000);
		carro.setModelo("Hatch");
		mecanico.setId(3324);
		mecanico.setNome("Jonathan");
		mecanico.setCargo("Mecanico 1");
		carro.setMecanico(mecanico);
		vendedor.setNome("Murilo");
		vendedor.setCargo("Vendedor 1");
		vendedor.setId(7890);
		carro.setVendedor(vendedor);
		lista.add(carro);
		
	}


	public void imprimir() {
		System.out.println("Você adquiriu o carro " + this.nome + " de cor " + this.cor + " por R$ "+ this.preco + " modelo " + this.modelo + " do ano " + this.ano);
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
