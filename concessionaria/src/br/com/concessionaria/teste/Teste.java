package br.com.concessionaria.teste;

import java.util.Scanner;

import br.com.concessionaria.showroom.Carro;

public class Teste {

	public static void main(String[] args) {
		/*
		 * //1 - Instanciar a classe carro: Carro carro;
		 * 
		 * //2 - Construir o objeto carro: carro = new Carro();
		 * 
		 * //3 - Imprimir o nome do carro:
		 * System.out.println("Carro setado com o nome de : " + carro.getNome());
		 */
		
		//instanciando o scanner
		Scanner scan;
		
		//construindo o objeto scanner
		scan = new Scanner(System.in);
		
		//Recebendo dados via console e colocando em uma variável:
		String dados = "";
		
		System.out.println("Digite algo neste terminal! :");
		dados = scan.nextLine();

		System.out.println("Este foi o valor digitado : " + dados);
		
		
		
		
		scan.close();
		
		
		
	}

}
