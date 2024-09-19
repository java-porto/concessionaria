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
		carro.setPreco(100.000);
		carro.setModelo("SUV");
		mecanico.setId(1234);
		mecanico.setNome("Jonas");
		mecanico.setCargo("Supervisor");
		carro.setMecanico(mecanico);
		vendedor.setCargo("Chefe");
		vendedor.setId(1236);
		vendedor.setNome("Josué");
		carro.setVendedor(vendedor);
		lista.add(carro);
		
		
		//--------------------------------
		carro = new Carro();
		mecanico = new Mecanico();
		vendedor = new Vendedor();
		
		carro.setAno(2024);
		carro.setCor("Preto");
		carro.setNome("Jeep");
		carro.setPreco(125.000);
		carro.setModelo("SUV");
		mecanico.setId(2361);
		mecanico.setNome("Gabriel");
		mecanico.setCargo("Mecânico");
		vendedor.setCargo("Consultor");
		vendedor.setId(1235);
		vendedor.setNome("Carlos");
		carro.setVendedor(vendedor);
		lista.add(carro);
		
		
		//--------------------------------
		
		carro = new Carro();
		mecanico = new Mecanico();
		vendedor = new Vendedor();
		
		carro.setAno(2025);
		carro.setCor("Vermelho");
		carro.setNome("Tesla");
		carro.setPreco(225.000);
		carro.setModelo("SEDAN");
		mecanico.setId(2345);
		mecanico.setNome("Vinicius");
		mecanico.setCargo("Mecânico 1");
		vendedor.setCargo("Auxiliar de Vendas");
		vendedor.setId(1237);
		vendedor.setNome("João");
		carro.setVendedor(vendedor);
		lista.add(carro);
		
		//--------------------------------
		
		carro = new Carro();
		mecanico = new Mecanico();
		vendedor = new Vendedor();
				
		carro.setAno(2025);
		carro.setCor("Prata");
		carro.setNome("Mercedes AMG");
		carro.setPreco(250.000);
		carro.setModelo("SEDAN");
		mecanico.setId(2373);
		mecanico.setNome("Joci");
		mecanico.setCargo("Mecânico 3");
		vendedor.setCargo("Felipe");
		vendedor.setId(1238);
		vendedor.setNome("Gerente de Vendas");
		carro.setVendedor(vendedor);
		lista.add(carro);
				
		//--------------------------------
				
		carro = new Carro();
		mecanico = new Mecanico();
		vendedor = new Vendedor();
				
		carro.setAno(2024);
		carro.setCor("Preto");
		carro.setNome("Nissan Kicks");
		carro.setPreco(105.000);
		carro.setModelo("SEDAN");
		mecanico.setId(2350);
		mecanico.setNome("Jonathan");
		mecanico.setCargo("Mecânico 2");
		vendedor.setCargo("Supervisor de Vendas");
		vendedor.setId(1239);
		vendedor.setNome("Gabriel");
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

	public void getLista() {
		
		for(Carro carro : lista) {
			System.out.println("+++++SHOW ROOM+++++");
			
			System.out.println("********************************************************************");
			System.out.println("NOME : " + carro.getNome());
			System.out.println("ANO FABRICAÇÃO : " + carro.getAno());
			System.out.println("MODELO : " + carro.getModelo());
			System.out.println("COR : " + carro.getCor());
			System.out.println("VENDEDOR RESPONSÁVEL : " + carro.getVendedor().getNome());
			System.out.println("********************************************************************");
		}
		
		
		
	}
	
	
	// Método para imprimir todos os atributos
	public void imprimirAtributos() {
		System.out.println("Nome: " + this.nome + " Cor: " + this.cor + " Preço: R$" + this.preco +
				" Modelo: " + this.modelo + " Ano: " + this.ano + ".\nParabéns!");

	}
}
