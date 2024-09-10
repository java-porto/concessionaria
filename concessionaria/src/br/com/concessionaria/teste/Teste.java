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
//		Scanner scan;
		
		//contruindo o objeto Scanner
//		scan = new Scanner(System.in);
		
		//Recebendo dados via console e colocando em uma variável:
//		String dados = "";
		
	//	System.out.println("digite algo neste terminal! :");
	//	dados = scan.nextLine();
		
//		System.out.println("este foi o valor digitado : " + dados);
		
		
		
		
//		scan.close();
		
//=====================================================================================================================================		
		//Crie entradas para cada atributo da classe carro:
		//Respeite o tipo de dados
		Scanner scan = new Scanner(System.in);
		
		Carro carro = new Carro("Civic", "Prata", 15.000, "LX", 2000);
		
		System.out.println("Digite o nome do carro!");
		carro.setNome(scan.next());
		
		System.out.println("Digite a cor carro!");
		carro.setCor(scan.next());
		
		System.out.println("Digite o preço do carro!");
		carro.setPreco( Double.parseDouble(scan.next()) );
		
		System.out.println("Digite o modelo do carro!");
		carro.setModelo(scan.next());
		
		System.out.println("Digite o ano do carro!");
		carro.setAno( Integer.parseInt( scan.next()) );
		//Volte na classe carro e crie um método que imprima todos os atributos da classe;
		
		//Chame o novo método para verificar o resultado:
		
	
	
		carro.imprimir();
		scan.close();
	
	
	
	}
	

}
