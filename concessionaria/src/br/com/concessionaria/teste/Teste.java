package br.com.concessionaria.teste;

import java.util.Scanner;

import br.com.concessionaria.deptocomercial.Vendedor;
import br.com.concessionaria.showroom.Carro;

public class Teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String venda = "Vendas";
		String financeiro = "Financeiro";
		String sac = "SAC";

		boolean key = true;

		

			while (key) {
				System.out.println("Digite apenas umas das opções abaixo:");
				System.out.println("1 - VENDAS\n2 - FINANCEIRO\n3 - SAC");
				int opcao = 0;
				
				try {
					opcao = Integer.parseInt(scan.next());
				} catch (NumberFormatException e) {
					System.out.println("SOMENTE NÚMEROS PODEM SER DIGITADOS!");
					opcao = Integer.parseInt(scan.next());
				}
				
				if (opcao == 1) {
					System.out.println("A opção escolhida foi : " + venda);
					key = false;
				} else if (opcao == 2) {
					System.out.println("A opção escolhida foi : " + financeiro);
					key = false;
				} else if (opcao == 3) {
					System.out.println("A opção escolhida foi : " + sac);
					key = false;
				} else {
					System.out.println("Digite uma opção válida!");
				}

			}

	

		scan.close();
	}

}
