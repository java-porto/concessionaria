package br.com.concessionaria.teste;

import java.util.Scanner;

import br.com.concessionaria.showroom.Carro;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Carro carro = new Carro(null, null, 0, null, 0);
		
		System.out.println("Digite o nome do carro");
		carro.setNome(scan.nextLine());
	
		
		System.out.println("Digite a cor do carro");
		carro.setCor(scan.nextLine());
		
		System.out.println("Digite o preço");
		carro.setPreco(Double.parseDouble(scan.next()));
		
		System.out.println("Digite o modelo");
		carro.setModelo(scan.next());
		
		System.out.println("Digite o ano");
		carro.setAno(Integer.parseInt(scan.next()));
		
		carro.imprimir();
		scan.close();
	

	}
		
		
		
	
		
		
	
		}
		
	
		

	
	
	


