package br.com.concessionaria.teste;

import br.com.concessionaria.showroom.Carro;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// 1 - Instanciar a classe carro:
		
		// 2 - Construir o objeto carro:
		
		// 3 - Imprimir o nome do carro: 
		
		//Carro carro;
		//carro = new Carro();
		
		//System.out.println("O nome do carro é: " + carro);

		String dados = " "; 
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("Digite algo: ");
		dados = sc.nextLine();
		
		System.out.println("= " + dados);
		
		sc.close();
	}

}
