package br.com.concessionaria.teste;

import br.com.concessionaria.deptocomercial.Vendedor;
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
		
		
		//AULA - 05/09/2024
		
		//Scanner scan = new Scanner(System.in);
		
		//Carro carro = new Carro();
		
		
		//System.out.println("Digite o nome do carro: ");	
		//carro.setNome(scan.next());
		
		//System.out.println("Digite a cor do carro: ");	
		//carro.setCor(scan.next());
		
		//System.out.println("Digite o preço do carro: ");	
		//carro.setPreco(Double.parseDouble(scan.next()));

		//System.out.println("Digite o modelo do carro: ");	
		//carro.setModelo(scan.next());
		
		//System.out.println("Digite o ano do carro: ");	
		//carro.setAno(Integer.parseInt(scan.next()));
		
		//Volte na classe carro e crie um metódo
		//que imprima todos os atributos da classe carro;
		//Chame o novo método para verificar o resultado:
		
		//carro.imprimirAtributos();
		//scan.close();
		
		//Vendedor vendedor = new Vendedor();
		
		//Aula 10/09/2024
		
		Scanner scan = new Scanner(System.in);
		
		String venda = "Vendas";
		String financeiro = "Financeiro";
		String sac = "SAC";
		
		boolean key = true;
		
		comando:
		while(key) {
			System.out.println("Digite apenas uma das opções abaixo: ");
			System.out.println("1 - VENDAS\n2 - FINANCEIRO\n3 - SAC");
			
			int opcao = 0;
			
			
			try {
			    opcao = Integer.parseInt(scan.next());
			
			if(opcao == 1) {
				System.out.println("Selecione apenas uma das opções abaixo: ");
				System.out.println("1 - Comprar Carro \n2 - Vender\n3 - Representante ");
				opcao = Integer.parseInt(scan.next());
				
				switch(opcao) {
				case 1:
					System.out.println("opção escolhida COMPRAR");
					key = false;
					break;
				case 2:
					System.out.println("opção escolhida VENDER");
					key = false;
					break;
				case 3:
					System.out.println("opção escolhida REPRESENTANTE");
					key = false;
					break;
				default:
					System.out.println("Somente opções entre 1, 2 e 3 são permitidas.");
					break;
				}
			}
			else if (opcao == 2) {
				System.out.println("A opção escolhida foi: " + financeiro);
				key = false;
			}
			else if(opcao == 3) {
				System.out.println("A opção escolhida foi: " + sac);
				key = false;
			}
			else {
				System.out.println("Digite uma opção válida!");
			  }
			}  catch (NumberFormatException e) {
				System.out.println("Somente números podem ser digitados!!!");
				continue comando;
			}
			
		} //Final While
		
		
		
		
		
		
		scan.close();
		
		
		//-- Aula 17/09/2024--
		
		} //Final da Main
}  //Final da CLASS
