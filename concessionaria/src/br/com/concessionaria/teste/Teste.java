package br.com.concessionaria.teste;

import java.util.Scanner;

import br.com.concessionaria.showroom.Carro;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String venda = "Vendas";
		String financeiro = "Financeiro";
		String sac = "SAC";
		
		
		boolean key = true;
		
		comando:		
		while (key) {
			System.out.println("Selecione apenas uma das opções abaixo:");
			System.out.println("1 - VENDAS\n2 - FINANCEIRO\n3 - SAC");
			
			int opcao = 0;
			
			try {
				
			 opcao = Integer.parseInt(scan.next());
			} 	 catch (NumberFormatException e) {
				System.out.println("Somente números podem ser digitados!!");
				continue comando;
				
			}
			
			if(opcao == 1) {
				System.out.println("Selecione apenas uma das opções abaixo:");
				System.out.println("1 - Comprar\n2 - Vender\n3 - Representante");
				opcao = Integer.parseInt(scan.next());
				
				switch (opcao) {
				case 1:
					System.out.println("Opção escolhida COMPRAR");
					key = false;
					break;
				case 2:
					System.out.println("Opção escolhida VENDER");
					key = false;
					break;
				case 3:
					System.out.println("Opção escolhida REPRESENTANTE");
					key = false;
					break;
					default:
						System.out.println("Somente opções entre 1 e 3 são permitidas.");
						break;
				}
				
			} else if (opcao == 2) {
			
				System.out.println("A opção escolhida foi: " + financeiro);
				key = false;
			}else if (opcao == 3) {
					System.out.println("A opção escolhida foi: " + sac);
					key = false;
				}else {
					System.out.println("Digite uma opção válida!");
				}
				
			scan.close();
		}//final while
		

		
	}//final main
	
}//final class
		
	
	
	

	
		
			
			
		
		
	
	


	
		
	
		

	
	
	


