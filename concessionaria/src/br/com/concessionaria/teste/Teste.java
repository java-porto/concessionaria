package br.com.concessionaria.teste;

import java.util.Scanner;

import br.com.concessionaria.deptocomercial.Vendedor;
import br.com.concessionaria.showroom.Carro;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Carro carro = new Carro();
		
		//Crie entradas para cada atributo da classe carro:
		//Respeite o tipo de dados
		System.out.println("Digite o nome do carro!");
		carro.setNome(scan.next());
		
		System.out.println("Digite a cor do carro!");
		carro.setCor(scan.next());
		
		System.out.println("Digite o preço do carro!");
		carro.setPreco( Double.parseDouble(scan.next()) );
		
		System.out.println("Digite o modelo do carro!");
		carro.setModelo(scan.next());
		
		System.out.println("Digite o ano do carro!");
		carro.setAno(Integer.parseInt(scan.next()));
		//Volte na classe carro e rie 
		// um método que imprima todos os atributos da classe;
		
		//Chame o novo método para verificar o resultado:
		carro.imprimir();
		scan.close();
		
	
		Vendedor vendedor = new Vendedor();
		
		
		
		
		
		
	}

}
