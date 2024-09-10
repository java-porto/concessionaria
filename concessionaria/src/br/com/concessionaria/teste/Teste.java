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

		//String dados = " "; 
		
		//Scanner sc;
		//sc = new Scanner(System.in);
		
		//System.out.println("Digite algo: ");
		//dados = sc.nextLine();
		
		//System.out.println("= " + dados);
		
		//sc.close();
		
		
		//AULA - 10/09/2024
		
		Scanner scan = new Scanner(System.in);
		
		Carro carro = new Carro();
		
		
		System.out.println("Digite o nome do carro: ");	
		carro.setNome(scan.next());
		
		System.out.println("Digite a cor do carro: ");	
		carro.setCor(scan.next());
		
		System.out.println("Digite o preço do carro: ");	
		carro.setPreco(Double.parseDouble(scan.next()));

		System.out.println("Digite o modelo do carro: ");	
		carro.setModelo(scan.next());
		
		System.out.println("Digite o ano do carro: ");	
		carro.setAno(Integer.parseInt(scan.next()));
		
		//Volte na classe carro e crie um metódo
		//que imprima todos os atributos da classe carro;
		//Chame o novo método para verificar o resultado:
		
		carro.imprimirAtributos();

		
		scan.close();
	}

}
