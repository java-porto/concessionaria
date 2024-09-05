package br.comconcessionaria.teste;

import java.util.Scanner;



public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciar a classe carro:Carro carro;
	
		//Constuir o objeto carro:carro=new Carro();
	
		//imprimir o nome do carro:;
		//instanciando o Scanner;
		Scanner scan;
		//construindo o objeto scanner;
		scan = new Scanner(System.in);
		//recebendo dados via console e colocando em uma variavel;
		
	    String dados ="";
	    System.out.println("Digite algo neste terminal! : " + dados);
	    
	   dados =  scan.nextLine();
	    
		System.out.println("Este foi o valor digitatdo :" + dados);
		
		
		
		
		scan.close();
		
		
		
	}	


	
	
	
	
}
