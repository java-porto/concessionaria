package br.com.concessionaria.teste;

import java.util.Scanner;

import br.com.concessionaria.showroom.Carro;

public class Teste {

	public static void main(String[] args) {
		
//		//1 - Instanciar a classe carro:
//		
//		//2 - Construir o objeto carro:
//		
//		//3 - Imprimir o nome do carro :
//		
//		Carro carro;
//		
//		carro = new Carro("Civic", "Prata", 15.000, "LX", 2000);
//		
//		System.out.println("Carro setado com o nome de : " + carro.getNome());
//		
		
		//Instanciando o scanner
		Scanner scan;
		
		//contruindo o objeto Scanner
		scan = new Scanner(System.in);
		
		//Recebendo dados via console e colocando em uma variável:
		String dados = "";
		
		System.out.println("digite algo neste terminal! :");
		dados = scan.nextLine();
		
		System.out.println("este foi o valor digitado : " + dados);
		
		
		
		
		scan.close();
		
		
	}

}
