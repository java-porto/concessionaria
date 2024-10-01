package br.com.concessionaria.teste;

import br.com.concessionaria.deptocomercial.Mecanico;
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
		
		
		Vendedor vendedor = new Vendedor();
		Carro carro;
		Mecanico mecanico;
		
		
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
					vendedor.setCargo("Gerente");
					vendedor.setId(1234);
					vendedor.setNome("Felipe");
					vendedor.getLista(vendedor);
					
					System.out.print("Selecione um de nossos carros: ");
					opcao = vendedor.getCarroByName(scan.next());
					
					carro = vendedor.getCarroById(opcao);
					
					System.out.println("Esse é o veículo que você escolheu? "); carro.imprimirAtributos();
					
					
					System.out.println("Digite SIM para comprar:\nDigite CANCELAR para desistir.");
					
					if(scan.next().equals("SIM")) {
						System.out.println("Parabéns! O vendedor entrará em contato com você!");
						vendedor.removerCarroDaLista(carro);
					}
					
					break;
					
				case 2:
					System.out.println("opção escolhida VENDER");
					System.out.println("\nBem vindo ao sistema de cadastro nós te queremos: ");
					System.out.println("\nInsira abaixo os dados do seu veículo: ");
					
					carro = new Carro();
					
					System.out.println("Digite o nome do seu carro: ");
					carro.setNome(scan.next());
					
					System.out.println("Digite o ano do seu carro: ");
					carro.setAno(Integer.parseInt(scan.next()));
					
					System.out.println("Digite a cor do seu veículo: ");
					carro.setCor(scan.next());
					
					System.out.println("Digite o modelo do seu veículo: ");
					carro.setModelo(scan.next());
					
					System.out.println("Digite o valor desejado pelo carro: ");
					carro.setPreco(Double.parseDouble(scan.next()));
					
					System.out.println("\nAs informações estão corretas? \n\n");
					carro.imprimirAtributos();
					
					System.out.println("Podemos prosseguir? Digite SIM para continuar venda. \nDigite CANCELAR para desistir da venda.");
					
					String respVenda = scan.next();
					
					respVenda = respVenda.toUpperCase();
					
					if(respVenda.equals("SIM")) {
						vendedor.insertCarro(carro);
						System.out.println("\n Obrigado Um consultor entrará em contato com você em breve!");
					} else if(respVenda.equals("CANCELAR")) {
						System.out.println("Sua solicitação foi cancelada. Você retornará para o menu principal.\n\n\n");
					} else {
						System.out.println("Digite uma opção válida (SIM ou CANCELAR)!!!");
					}
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
				scan.close();
				continue comando;
			}
			
		} //Final While
		
		
		
		
		
		
		scan.close();
		
		
		//-- Aula 17/09/2024--
		
		} //Final da Main
}  //Final da CLASS
