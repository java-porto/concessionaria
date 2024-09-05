package br.com.concessionaria.teste;

import java.util.Scanner;

import br.com.concessionaria.showroom.Carro;

public class Teste {

	public static void main(String[] args) {
		
		//1- instanciar a classe carro: carro carro;
		//2- construir o objeto carro: carro = new Carro (Mustang);
		//3- imprimir o nome do carro: 
		//System.out.println ("carro setado com o nome de: " + carro.getNome());
		
		//instanciando o scanner
		Scanner scan;
		
		//construindo o objeto scanner
		scan = new Scanner(System.in);
		
		//Recebendo dados via console e colocando em uma variavel
		String dados= "";
		
		System.out.println("Digite algo neste terminal! :");
		dados = scan.nextLine();
		
		System.out.println("Este foi o valor digitado :" + dados);
		
		
		
		
		
		scan.close();
		
		
		

		
		
		
		
	
		
		
	
		}
		
	
		

	}
	
	


