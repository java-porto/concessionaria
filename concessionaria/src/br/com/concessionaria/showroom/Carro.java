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
		
		carro.setAno(2024);
		carro.setCor("Branco");
		carro.setNome("Creta");
		carro.setPreco(119000);
		carro.setModelo("SUV");
		carro.setVendedor(vendedor);
		carro.setMecanico(mecanico);
		mecanico.setId(1234);
		mecanico.setNome("Jonas");
		mecanico.setCargo("Supervisor");
		vendedor.setId(12346);
		vendedor.setCargo("Chefe");
		vendedor.setNome("Josue");
		lista.add(carro);
		
		//==================================
		
		carro = new Carro();
		mecanico = new Mecanico();
		vendedor = new Vendedor();
		
		carro.setAno(2014);
		carro.setCor("Preto");
		carro.setNome("Civic");
		carro.setPreco(120000);
		carro.setModelo("Sedan");
		carro.setVendedor(vendedor);
		carro.setMecanico(mecanico);
		mecanico.setId(12345);
		mecanico.setNome("Jonanthan");
		mecanico.setCargo("Mecanico 1");
		vendedor.setId(123467);
		vendedor.setCargo("Vendedor 1");
		vendedor.setNome("João");
		lista.add(carro);
		
		//==================================
		
		carro = new Carro();
		mecanico = new Mecanico();
		vendedor = new Vendedor();
				
		carro.setAno(2014);
		carro.setCor("Preto");
		carro.setNome("i30");
		carro.setPreco(60000);
		carro.setModelo("Hatch");
		carro.setVendedor(vendedor);
		carro.setMecanico(mecanico);
		mecanico.setId(2123);
		mecanico.setNome("Luiz");
		mecanico.setCargo("Mecanico 2");
		vendedor.setId(2212);
		vendedor.setCargo("Vendedor 2");
		vendedor.setNome("Felipe");
		lista.add(carro);
		
		//==================================
		
		carro = new Carro();
		mecanico = new Mecanico();
		vendedor = new Vendedor();
						
		carro.setAno(2020);
		carro.setCor("Cinza");
		carro.setNome("HB20");
		carro.setPreco(45000);
		carro.setModelo("Hatch");
		carro.setVendedor(vendedor);
		carro.setMecanico(mecanico);
		mecanico.setId(21234);
		mecanico.setNome("Jossi");
		mecanico.setCargo("Mecanico 3");
		vendedor.setId(22123);
		vendedor.setCargo("Vendedor 3");
		vendedor.setNome("Jorge");
		lista.add(carro);
		
		//==================================
		
		carro = new Carro();
		mecanico = new Mecanico();
		vendedor = new Vendedor();
								
		carro.setAno(2021);
		carro.setCor("Vermelho");
		carro.setNome("Renegade");
		carro.setPreco(100000);
		carro.setModelo("SUV");
		carro.setVendedor(vendedor);
		carro.setMecanico(mecanico);
		mecanico.setId(212345);
		mecanico.setNome("Alexandre");
		mecanico.setCargo("Mecanico 4");
		vendedor.setId(221234);
		vendedor.setCargo("Vendedor 4");
		vendedor.setNome("Vinicius");
		lista.add(carro);
	}
	
	public void DadosCarro() {
		System.out.println("O nome do carro é: " + this.nome +  " cor: " + 
		this.cor + " preço: R$ " + this.preco + " modelo: " + this.modelo + " ano: " + this.ano + " Parabéns!");
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
