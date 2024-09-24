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

		Vendedor vendedor = new Vendedor();
		Carro carro;
		boolean key = true;

		comando: while (key) {
			System.out.println("Selecione apenas uma das opções abaixo:");
			System.out.println("1 - VENDAS\n2 - FINANCEIRO\n3 - SAC");
			int opcao = 0;

			try {
				opcao = Integer.parseInt(scan.next());

				if (opcao == 1) {
					System.out.println("Selecione apenas uma das opções abaixo:");
					System.out.println("1 - Comprar\n2 - Vender\n3 - Representante");
					opcao = Integer.parseInt(scan.next());

					switch (opcao) {

					case 1:
						System.out.println("Opção escolhida COMPRAR");
						vendedor.setCargo("Gerente");
						vendedor.setId(12345);
						vendedor.setNome("Jonas");
						vendedor.getLista(vendedor);

						System.out.println("Selecione um de nossos carros : ");

						opcao = vendedor.getCarroByName(scan.next());

						carro = vendedor.getCarroById(opcao);

						System.out.println("Esse é o veículo que você escolheu? ");
						carro.imprimir();

						System.out.println("Em caso positivo, digite SIM para comprar:\nDIgite CANCELAR para desistir");

						if (scan.next().equals("SIM")) {
							vendedor.removerCarroDaLista(carro);
						}

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
					System.out.println("A opção escolhida foi : " + financeiro);

				} else if (opcao == 3) {
					System.out.println("A opção escolhida foi : " + sac);

				} else {
					System.out.println("Digite uma opção valida!");
				}
			} catch (NumberFormatException e) {
				System.out.println("SOMENTE NUMEROS PODEM SER DIGITADOS!");
				continue comando;
			}

		}
		scan.close();
	}
}
