package br.com.concessionaria.teste;

import java.util.Scanner;

import br.com.concessionaria.showroom.Carro;

public class teste {
//
	public static void main(String[] args) {
//		// 1 - Instanciar a Classe carro;
//		Carro carro;
//		// 2 - Construir o Objeto carro;
//		carro = new Carro("Fit");
//		// 3 - Imprimir o nome do Carro;
//		System.out.println("Carro getado com o nome de : " + carro.getNome());}
//

	
	//instanciando o scanner;
	Scanner scan;
	
	//construindo o objeto scanner;
	scan = new Scanner(System.in);
	
	//recebendo dados via console e colocando em uma variavel;		
	String dados = "";		
	
	System.out.println("Digite algo neste terminak! : ");
	dados = scan.nextLine();
			
	System.out.println("Este foi o valor digitado : " + dados);
	
	
	
	
	
	
	scan.close();	
			
	}

}

