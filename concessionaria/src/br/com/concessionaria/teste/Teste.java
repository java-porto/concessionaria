package br.com.concessionaria.teste;

import java.util.Scanner;

import br.com.concessionaria.showroom.Carro;

public class Teste {

	public static void main(String[] args) {
		
//		//1 - Instanciar a classe carro;
//		Carro carro;
//		//2 - Construir o objeto carro;
//		carro = new Carro("Celta","Branco",18000,"Manual",2020);
//		
//		//3 - Imprimir o nome do carro;
//		System.out.printf("O nome do carro é: " + carro.getNome() + ", cor: " + carro.getCor() + ", preço: " + carro.getPreco() +
//		", modelo: " + carro.getModelo() + ", ano: " + carro.getAno());
		
		//Instanciando o scanner
		Scanner scan;
		
		//construindo o objeto scanner
		scan = new Scanner(System.in);
		
		//Recebendo dados via console e colocando em uma variável
		String dados = "";
		
		System.out.println("Digite algo");
		dados = scan.nextLine();
		System.out.println("Este foi o valor digitado: " + dados);
		
		scan.close();
		
		
		// Scanner sc = new Scanner(System.in);
	}

}
