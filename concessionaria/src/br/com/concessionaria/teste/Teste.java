package br.com.concessionaria.teste;

import java.util.Scanner;

//import br.com.concessionaria.showroom.Carro;

public class Teste {

	public static void main(String[] args) {
//		//1 - instanciar a classe carro. (Instanciando classe).
//		Carro carro;
//		
//		//2 - Construir o objeto carro. (Criando objeto).
//		carro = new Carro();
//		
//		//3 - Imprimir o nome do carro.
//		System.out.println("O carro é: " + carro.getNome());
		
		//Instanciando Scanner
		Scanner scan;
		
		//Construindo objeto Scanner
		scan = new Scanner(System.in);
		
		//Recebendo dados via console e colocando em uma variável.
		
		String dados = "";
		
		System.out.println("Digite algo neste terminal");		
		dados = scan.nextLine();
		System.out.println("Este foi o valor digito: " + dados);
		
		scan.close();
	}

}
