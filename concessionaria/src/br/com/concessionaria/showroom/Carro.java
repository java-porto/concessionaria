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
	private List<Carro> listaCarro = null;
	
	public Carro() {
		listaCarro = new ArrayList<Carro>();
		
		Carro carros = new Carro();
		
		Mecanico mecanico = new Mecanico();
		
		Vendedor vendedor = new Vendedor();
		
		//Carro 1
		carros.setNome("Creta");
		carros.setAno(2024);
		carros.setCor("Branco");
		carros.setPreco(119.990);
		carros.setModelo("SUV");
		mecanico.setId(1234);
		mecanico.setNome("Jonas");
		mecanico.setCargo("Supevisor");
		carros.setMecanico(mecanico);
		vendedor.setCargo("Chefe");
		vendedor.setNome("Josué");
		vendedor.setId(1236);
		carros.setVendedor(vendedor);
		listaCarro.add(carros);
		
		//Carro 2
		carros.setNome("Fox");
		carros.setAno(2013);
		carros.setCor("Preto");
		carros.setPreco(6.000);
		carros.setModelo("SUV Pequeno");
		mecanico.setId(6969);
		mecanico.setNome("Felphis");
		mecanico.setCargo("Mecanico 1");
		carros.setMecanico(mecanico);
		vendedor.setCargo("Vendedor 1");
		vendedor.setNome("Rubino");
		vendedor.setId(6652);
		carros.setVendedor(vendedor);
		listaCarro.add(carros);
		
		//Carro 3
		carros.setNome("Tesla");
		carros.setAno(2023);
		carros.setCor("Vermelho");
		carros.setPreco(225.000);
		carros.setModelo("SEDÃ");
		mecanico.setId(3342);
		mecanico.setNome("Jenifer");
		mecanico.setCargo("Mecanico 2");
		carros.setMecanico(mecanico);
		vendedor.setCargo("Vendedor 2");
		vendedor.setNome("Marieta");
		vendedor.setId(2132);
		carros.setVendedor(vendedor);
		listaCarro.add(carros);
		
		//Carro 4
		carros.setNome("Ford");
		carros.setAno(2025);
		carros.setCor("Amarelo");
		carros.setPreco(325.000);
		carros.setModelo("SUV");
		mecanico.setId(6255);
		mecanico.setNome("Roberta");
		mecanico.setCargo("Mecanico 3");
		carros.setMecanico(mecanico);
		vendedor.setCargo("Vendedor 3");
		vendedor.setNome("Clarinha");
		vendedor.setId(8754);
		carros.setVendedor(vendedor);
		listaCarro.add(carros);
		
		//Carro 5
		carros.setNome("GM");
		carros.setAno(2021);
		carros.setCor("Prata");
		carros.setPreco(75.000);
		carros.setModelo("HATCH");
		mecanico.setId(6244);
		mecanico.setNome("Clayton");
		mecanico.setCargo("Mecanico 2");
		carros.setMecanico(mecanico);
		vendedor.setCargo("Vendedor 2");
		vendedor.setNome("Isadora");
		vendedor.setId(5287);
		carros.setVendedor(vendedor);
		listaCarro.add(carros);
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

	public void fichaCarro() {
		System.out.println("Parabens! Você adquiriu o carro. Veja detalhes a baixo: \nNome: " + this.nome + "\nCor: " + this.cor + "\nValor: R$"
				+ this.preco + "\nModelo: " + this.modelo + " \nAno: " + this.ano);
	}
}
