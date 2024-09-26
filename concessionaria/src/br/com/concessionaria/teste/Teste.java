package br.com.concessionaria.teste;

import java.util.Scanner;

import br.com.concessionaria.deptocomercial.Mecanico;
import br.com.concessionaria.deptocomercial.Vendedor;
import br.com.concessionaria.showroom.Carro;

public class Teste {

	public static void main(String[] args) {

		/*
		 * // //1 - Instanciar a classe carro; // Carro carro; // //2 - Construir o
		 * objeto carro; // carro = new Carro("Celta","Branco",18000,"Manual",2020); //
		 * // //3 - Imprimir o nome do carro; // System.out.printf("O nome do carro é: "
		 * + carro.getNome() + ", cor: " + carro.getCor() + ", preço: " +
		 * carro.getPreco() + // ", modelo: " + carro.getModelo() + ", ano: " +
		 * carro.getAno());
		 * 
		 * //Instanciando o scanner Scanner scan;
		 * 
		 * //construindo o objeto scanner scan = new Scanner(System.in);
		 * 
		 * //Recebendo dados via console e colocando em uma variável String dados = "";
		 * 
		 * System.out.println("Digite algo"); dados = scan.nextLine();
		 * System.out.println("Este foi o valor digitado: " + dados);
		 * 
		 * scan.close();
		 * 
		 * 
		 * // Scanner sc = new Scanner(System.in);
		 * 
		 */
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * Carro carro = new Carro();
		 * 
		 * System.out.println("Digite o nome do carro"); carro.setNome(scan.next());
		 * 
		 * System.out.println("Digite a cor do carro"); carro.setCor(scan.next());
		 * 
		 * System.out.println("Digite o preço do carro");
		 * carro.setPreco(Double.parseDouble(scan.next()));
		 * 
		 * System.out.println("Digite o modelo do carro"); carro.setModelo(scan.next());
		 * 
		 * System.out.println("Digite o ano do carro");
		 * carro.setAno(Integer.parseInt(scan.next()));
		 * 
		 * carro.DadosCarro();
		 * 
		 * scan.close();
		 * 
		 * Vendedor vendedor = new Vendedor();
		 * 
		 * Mecanico mecanico = new Mecanico();
		 */

		Scanner scan = new Scanner(System.in);

		String venda = "Vendas";
		String financeiro = "Financeiro";
		String sac = "SAC";
		
		Vendedor vendedor = new Vendedor();
		Carro carro;

		boolean key = true;
		
		

		comando:
			while (key) {
			System.out.println("Selecione apenas uma das opções abaixo:");
			System.out.println("1 = VENDAS\n2 - FINANCEIRO\n3 - SAC");
			int opcao = 0;

			try {
				opcao = Integer.parseInt(scan.next());

				if (opcao == 1) {
					System.out.println("A opção escolhida foi: " + venda + "!");
					System.out.println("Selecione apenas uma das opções abaixo:");
					System.out.println("1 - Comprar\n2 - Vender\n3 - Representante");
					opcao = Integer.parseInt(scan.next());
					
					switch (opcao) {
						case 1:
							System.out.println("Selecionado: Comprar");
							vendedor.setCargo("Gerente");
							vendedor.setId(12345);
							vendedor.setNome("Jonas");
							vendedor.getLista(vendedor);
							System.out.println("Selecione um dos nossos carros: ");
							opcao = vendedor.getCarroByName(scan.next());
							carro = vendedor.getCarroById(opcao);
							System.out.println("Veiculo selecionado: ");
							carro.DadosCarro();
							System.out.println("Em caso positivo, digite Y para comprar\nCaso contrario, digite N");
							
							if(scan.next().equals("Y")) {
								vendedor.removerCarroDaLista(carro);
							}
							break;
							
						case 2:
							System.out.println("Selecionado: Vender");
							System.out.println("\nBem Vindo ao sistema de Cadastro: ");
							System.out.println("\nInsira abaixo as informações do seu veículo conforme solicitado: ");
							
							carro = new Carro();
							System.out.println("\nDigite o nome do veículo: ");
							carro.setNome(scan.next());
							System.out.println("\nDigite a cor do veículo: ");
							carro.setCor(scan.next());
							System.out.println("\nDigite o ano do veículo: ");
							carro.setAno(Integer.parseInt(scan.next()));
							System.out.println("\nDigite o modelo do veículo: ");
							carro.setModelo(scan.next());
							System.out.println("\nDigite o preço do veículo: ");
							carro.setPreco(Double.parseDouble(scan.next()));
							System.out.println("\nAs informações estão corretas ?\nPodemos prosseguir ?");
							carro.DadosVenda();
							
							System.out.println("\nUtilize uma das opções abaixo: \nSIM\nCANCELAR");
							
							String respVenda = scan.next();
							
							respVenda = respVenda.toUpperCase();
							
							if (respVenda.equals("SIM")) {
								vendedor.insertCarro(carro);
								System.out.println("\nVeículo inserido com sucesso!");
							} else if (respVenda.equals("CANCELAR")) {
								System.out.println("\nA solicitação foi encerrada! Redirecionado ao menu principal");
							} else {
								System.out.println("\nUtilize somente as opções disponíveis: ");
								continue comando;
							}
							
							break;
				
						case 3:
							System.out.println("Selecionado: Representante");
							key = false;
							break;
						default:
							System.out.println("Somente numeros de 1 a 3 serão permitidos!");
					}
					
				} else if (opcao == 2) {
					System.out.println("A opção escolhida foi: " + financeiro);

				} else if (opcao == 3) {
					System.out.println("A opção escolhida foi: " + sac);

				} else {
					System.out.println("Digite uma opção válida!");
				}

			} catch (NumberFormatException e) {
				System.out.println("Somente números podem ser digitados");
				continue comando;
			}
		}//Final do while
		
		scan.close();
	}//Final da main

}//Final da class
