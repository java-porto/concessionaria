package br.com.concessionaria.showroom;

import java.util.ArrayList;
import java.util.List;

import br.com.concessionaria.dptocomercial.Mecanico;
import br.com.concessionaria.dptocomercial.Vendedor;

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
		carro.setPreco(100.000);
		carro.setModelo("SUV");
		mecanico.setId(1234);
		mecanico.setNome("Jonas");
		mecanico.setCargo("Mecânico 1");
		carro.setMecanico(mecanico);
		vendedor.setCargo("Chefe");
		vendedor.setId(1236);
		vendedor.setNome("Josué");
		carro.setVendedor(vendedor);
		lista.add(carro);
		
		//
		
		carro = new Carro();
	    mecanico = new Mecanico();
	    vendedor = new Vendedor();
		
		carro.setAno(2025);
		carro.setCor("Prata");
		carro.setNome("Jeep");
		carro.setPreco(125.000);
		carro.setModelo("SUV");
		mecanico.setId(2312);
		mecanico.setNome("Gabiru");
		mecanico.setCargo("Mecânico 2");
		carro.setMecanico(mecanico);
		vendedor.setCargo("Vendedor 1");
		vendedor.setId(1236);
		vendedor.setNome("Josué");
		carro.setVendedor(vendedor);
		lista.add(carro);
		
		
		carro = new Carro();
	    mecanico = new Mecanico();
	    vendedor = new Vendedor();
		
		carro.setAno(2023);
		carro.setCor("Vermelho");
		carro.setNome("Tesla");
		carro.setPreco(225.000);
		carro.setModelo("SEDÃ");
		mecanico.setId(3342);
		mecanico.setNome("Jeniffer");
		mecanico.setCargo("Mecânico 3");
		carro.setMecanico(mecanico);
		vendedor.setCargo("Vendedor 2");
		vendedor.setId(8956);
		vendedor.setNome("Mario");
		carro.setVendedor(vendedor);
		lista.add(carro);
		
		
		carro = new Carro();
	    mecanico = new Mecanico();
	    vendedor = new Vendedor();
		
		carro.setAno(1967);
		carro.setCor("Preto");
		carro.setNome("Impala");
		carro.setPreco(500.000);
		carro.setModelo("SEDÃ");
		mecanico.setId(9696);
		mecanico.setNome("Johnson");
		mecanico.setCargo("Mecânico 4");
		carro.setMecanico(mecanico);
		vendedor.setCargo("Vendedor 3");
		vendedor.setId(4467);
		vendedor.setNome("Joca");
		carro.setVendedor(vendedor);
		lista.add(carro);
		
		carro = new Carro();
	    mecanico = new Mecanico();
	    vendedor = new Vendedor();
		
		carro.setAno(1967);
		carro.setCor("Preto");
		carro.setNome("Mustang");
		carro.setPreco(600.000);
		carro.setModelo("Esportivo");
		mecanico.setId(6904);
		mecanico.setNome("Zóio");
		mecanico.setCargo("Mecânico 5");
		carro.setMecanico(mecanico);
		vendedor.setCargo("Vendedor 4");
		vendedor.setId(0102);
		vendedor.setNome("Alan");
		carro.setVendedor(vendedor);
		lista.add(carro);
		
		
		
		
		
		
		
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
	
	
	
	public void imprimir() {
		System.out.println("Voce adquiriu o carro:" + this.nome + ", de cor:" +
	this.cor + ", valor: R$ " + this.preco + ", modelo:" + this.modelo + ", do ano: " +this.ano);
	}



}


