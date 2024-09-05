package br.com.concessioaria.showroom;

import java.util.Scanner;

public class teste {

	public static void main(String[] arg) {
		
//		//1 - Instanciar a classe carro;
//		Carro carro;
//		
//		//2 - Construir o objeto carro;
//		carro = new Carro ("Celta");
//		
//		
//		//3 - Imprimir o nome do carro;
//		
//		System.out.println("Carro setado com o nome de : " + carro.getNome())
		
	
	//instanciando o Scanner:
	Scanner scan;
	
	//contruindo o objeto scanner:
	scan = new Scanner(System.in); 
	
	//Recebendo dados via console e colocando em uma variavel:
	String dados = "";
	
	System.out.println("Digite algo neste terminal!: ");
	
	dados = scan.nextLine();
	
	System.out.println("Este foi o valor digitado : " + dados);
	
	
	scan.close();
	
	
	}
	
	
	
}
