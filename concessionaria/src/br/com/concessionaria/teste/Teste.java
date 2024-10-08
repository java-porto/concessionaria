package br.com.concessionaria.teste;

import java.util.Scanner;

import br.com.concessionaria.deptocomercial.Mecanico;
import br.com.concessionaria.deptocomercial.Vendedor;
import br.com.concessionaria.showroom.Carro;

public class Teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String financeiro = "Financeiro";
		String sac = "SAC";

		Vendedor vendedor = new Vendedor();
		Carro carro = null;
		Mecanico mecanico;

		boolean key = true;

		comando:

		while (key) {
			System.out.println("Selecione apenas umas das opções abaixo:");
			System.out.println("1 - VENDAS\n2 - FINANCEIRO\n3 - SAC");

			int opcao = 0;

			try {

				opcao = Integer.parseInt(scan.next());

				if (opcao == 1) {
					System.out.println("Selecione apenas umas das opções abaixo:");
					System.out.println("1 - Comprar\n2 - Vender\n3 - Representante");
					opcao = Integer.parseInt(scan.next());

					switch (opcao) {
					case 1:
						System.out.println("Opção escolhida COMPRAR");
						vendedor.setCargo("Gerente");
						vendedor.setId(12345);
						vendedor.setNome("Jonas");
//						vendedor.getLista(vendedor);

						System.out.println("Selecione um de nossos carros:");

//						opcao = vendedor.getCarroByName(scan.next());
//
//						carro = vendedor.getCarroById(opcao);

						System.out.println("Esse é o veículo que você escolheu? ");
						carro.imprimir();

						System.out.println("Digite SIM para comprar:\nDigite CANCELAR para desistir.");

						if (scan.next().equals("SIM")) {
//							vendedor.removerCarroDaLista(carro);
						}

						break;
					case 2:

						System.out.println("Opção escolhida VENDER");
						System.out.println("\nBem Vindo ao sistema de Cadastro Nós Te Queremos:");
						System.out.println("\nInsira abaixo as informações do seu veículo conforme solicitado:");

						carro = new Carro();

						System.out.println("\nDigite o ano do veículo:");
						carro.setAno(Integer.parseInt(scan.next()));
						System.out.println("\nDigite a cor do veículo:");
						carro.setCor(scan.next());
						System.out.println("\nDigite o seu modelo de veículo:");
						carro.setModelo(scan.next());
						System.out.println("\nDigite o nome do veículo:");
						carro.setNome(scan.next());
						System.out.println("\nDigite o valor desejado pelo veículo:");
						carro.setPreco(Double.parseDouble(scan.next()));

						System.out.println("\nAs informações estão corretas:\nPodemos proseeguir?");
						carro.imprimirVenda();

						System.out.println("\nutilize uma das opçôes abaixo:\n SIM \n CANCELAR");
						
						String respVenda = scan.next();
						
						respVenda = respVenda.toUpperCase();
						
						if (respVenda.equals("SIM")) {
//							vendedor.insertCarro(carro);
							System.out.println("\nVeículo inserido com sucesso!");
						} else if (respVenda.equals("CANCELAR")) {
							System.out.println("\nA SOLICITAÇÃO FOI ENCERRADA. VOCÊ SERÀ REDIRECIONADO "
									+ "PARA O MENU PRINCIPAL AGORA!\n\n\n\n\n");
						} else {
							System.out.println("\nUtilize somente as opções disponíveis:");
							continue comando;
						}

						break;
					case 3:
						System.out.println("Opção escolhida REPRESENTANTE");
						key = false;
						break;
					default:
						System.out.println("Somentes opções entre 1 e 3 são permitidas.");
						break;
					}

				} else if (opcao == 2) {
					System.out.println("A opção escolhida foi : " + financeiro);

				} else if (opcao == 3) {
					System.out.println("A opção escolhida foi : " + sac);
					key = false;
				} else {
					System.out.println("Digite uma opção válida!");
				}

			} catch (NumberFormatException e) {
				System.out.println("SOMENTE NÚMEROS PODEM SER DIGITADOS!");
				continue comando;
			}

		} // final while

		scan.close();
	}// Final da main

}// Final da class
