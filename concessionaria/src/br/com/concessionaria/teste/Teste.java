package br.com.concessionaria.teste;

import java.util.Scanner;

import br.com.concessionaria.deptocomercial.Mecanico;
import br.com.concessionaria.deptocomercial.Vendedor;
import br.com.concessionaria.showroom.Carro;

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
		/*Scanner scan;
		
		//Construindo objeto Scanner
		scan = new Scanner(System.in);
		
		//Recebendo dados via console e colocando em uma variável.
		
		String dados = "";
		
		System.out.println("Digite algo neste terminal");		
		dados = scan.nextLine();
		System.out.println("Este foi o valor digito: " + dados);
		
		scan.close();
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		Carro carro = new Carro();
		
		//Solicitando nome do carro
		System.out.println("Digite o nome do carro:");
		carro.setNome(scan.next());
		
		//Solicitando cor do carro
		System.out.println("Digite a cor do carro:");
		carro.setCor(scan.next());
		
		//Solicitando preço do carro
		System.out.println("Digite o valor do carro:");
		carro.setPreco(Double.parseDouble(scan.next()));
		
		//Solicitando modelo do carro
		System.out.println("Digite o modelo do carro:");
		carro.setModelo(scan.next());
		
		//Solicitando ano do carro
		System.out.println("Digite ano do carro:");
		carro.setAno(Integer.parseInt( scan.next()));
		
		//Imprimindo informações do carro
		carro.fichaCarro();
		
		scan.close();
		
		Vendedor vendedor = new Vendedor();
		
		Mecanico mecanico = new Mecanico();
	}

}
