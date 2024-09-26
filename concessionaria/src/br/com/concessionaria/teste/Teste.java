package br.com.concessionaria.teste;

import java.util.Scanner;

import br.com.concessionaria.deptocomercial.Mecanico;
import br.com.concessionaria.deptocomercial.Vendedor;
import br.com.concessionaria.showroom.Carro;

//import br.com.concessionaria.deptocomercial.Mecanico;
//import br.com.concessionaria.deptocomercial.Vendedor;
//import br.com.concessionaria.showroom.Carro;

//import br.com.concessionaria.showroom.Carro;

//public class Teste {
//	public static void main(String[] args) {
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

*/
//	}
//}

public class Teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String vendas = "Vendas";
		String financeiro = "Financeiros";
		String sac = "SAC";

		Vendedor vendedor = new Vendedor();
		
		Carro carro;
		
		Mecanico mecanico;

		boolean key = true;

		comando: while (key) {
			System.out.println("Selecionei uma das opções a baixo:");
			System.out.println("1 - Vendas\n2 - Financeiro\n3 - SAC");
			int opcao = 0;

			try {
				opcao = Integer.parseInt(scan.next());

				if (opcao == 1) {
					System.out.println("A opção ecolhida foi " + vendas);
					System.out.println("Selecionei uma das opções a baixo:");
					System.out.println("1 - Comprar\n2 - Vender\n3 - Representante\n0 - Voltar para o menu anterior");
					opcao = Integer.parseInt(scan.next());

					switch (opcao) {
					case 1:
						System.out.println("A opção escolhida foi Comprar");
						vendedor.setNome("Clebsu");
						vendedor.setCargo("Gerente Geral de Vendas");
						vendedor.setId(0115154);
						vendedor.getListaCarro(vendedor);

						System.out.println("Selecione um de nossos carros:");

						opcao = vendedor.getCarrobyName(scan.next());
						
						carro = vendedor.getCarroById(opcao);
						
						System.out.println("Esse foi o carro que você escolheu?"); carro.imprimirFichaCarro();
						
						System.out.println("Digite SIM para comprar.\nDigite CANCELAR para desistir da compra.");
						
						if(scan.next().equals("SIM")) {
							System.out.println("Parabéns! Um vendedor entrará em contato com você!");
							
							vendedor.removeCarroDaListaCarro(carro);
						}
						
						break;

						case 2:
						System.out.println("A opção escolhida foi Vender\n\n");
						System.out.println("Bem vindo ao sistema de cadastro Nós te Queremos:\n\n");
						System.out.println("Insira abaixo as informações do seu veículo:\n\n");
						carro = new Carro();
						System.out.println("Digite o nome do seu carro:");
						carro.setNome(scan.next());
						System.out.println("Digite o ano do seu carro:");
						carro.setAno(Integer.parseInt(scan.next()));
						System.out.println("Digite a cor do seu carro:");
						carro.setCor(scan.next());
						System.out.println("Digite o modelo do seu carro:");
						carro.setModelo(scan.next());
						System.out.println("Digite o valor desejado pelo carro:");
						carro.setPreco(Double.parseDouble(scan.next()));
						
						
						System.out.println("As informações estão corretas?\n\n");
						
						carro.imprimirFichaCarroVenda();
						
						System.out.println("Podemos proseguir?\n\nDigite SIM para continuar venda.\nDigite CANCELAR para desistir da venda.");
						
						String respVenda = scan.next();
						
						respVenda = respVenda.toUpperCase();
						
						if(respVenda.equals("SIM")) {
							vendedor.insertCarro(carro);
							System.out.println("Obrigado! Um consultor entrará em contato com você em breve!");
						}else if(respVenda.equals("CANCELAR")) {
							System.out.println("Sua solicitação foi cancelada. Você retornará ao menu incial.\n\n\n\n");
						}else {
							System.out.println("utilize somente as opções disponiveis.");
						}
						break;
						
						
					case 3:
						System.out.println("A opção escolhida foi representante");
						key = false;
						break;
					default:
						System.out.println("Somente opções entre 1 e 3 são permitidas.");
						break;
					}

				} else if (opcao == 2) {
					System.out.println("A opção escolhida foi " + financeiro);
					key = false;
				} else if (opcao == 3) {
					System.out.println("A opção escolhida foi " + sac);
					key = false;
				} else {
					System.out.println("Digite uma opção válida");
				} // final do if

			} catch (NumberFormatException e) {
				System.out.println("Somente números podem ser digitados:");
				scan.close();
				continue comando;
			} // final do try e catch

		} // final do while

		scan.close();

	}// final da main

}// final da class
