package br.comconcessionaria.teste;

import java.util.Scanner;

import br.comconcessionaria.dptcomercial.Mecanico;
import br.comconcessionaria.dptcomercial.Vendedor;
import br.comconcessionaria.showroom.Carro;


public class Teste {

	public static void main(String[] args) {
		
		Mecanico mecanico[] new Mecanico[5];
		mecanico[0]= new Mecanico();
		mecanico[1]= new Mecanico();
		mecanico[2]= new Mecanico();
		mecanico[3]=new Mecanico();
		mecanico[4]=new Mecanico();
		
		mecanico[0].setNome("Jonnatan");
		mecanico[1].setNome("Felipe");
		mecanico[2].setNome("Jojo");
		mecanico[3].setNome("Ricardo");
		mecanico[4].setNome("Jossi");
		
		for(Mecanico mecanico2 : mecanico ) {
			System.out.println("NoSSOS mecanicos");
		}
		
		
		
		
		Carro carro[]=new Carro[3];
		carro[0]= new Carro();
		carro[1]= new Carro();
		carro[2]= new Carro();
		
		carro[0].setNome("Mavecka");
		carro[1].setNome("Opala");
		carro[2].setNome("Jeep");
		
		for (carro carrinho : carro) {
			System.out.println()
		}
		
		
		
	}
	
}
		
//				
//		int[] arrayDeInteiros;
//	    arrayDeInteiros= new int[3];		
//		arrayDeInteiros[0] = 234;
//		arrayDeInteiros[1] = 967;
//		arrayDeInteiros[2] = 187;
//		
//		System.out.println(arrayDeInteiros[1]);
//		
//		
//		
//		Scanner scan = new Scanner(System.in);
//		String venda = "vendas";
//		String financeira = "Financeiro";
//		String sac = "Sac";
//		
//		boolean key = true;
//		
//		int opcao;
//		while(key) {
//			System.out.println("Escolha uma das opcoes abaixo:");
//			System.out.println(" 1 - VENDAS\n2 - FINANCEIRO\n3 - SAC ");
//			int opçao = Integer.parseInt(scan.next());
//			
//			if (opcao ==1) 
//				System.out.println("A opçao escolhida foi: " + venda);
//				key = false;
//		}  else if(opcao == 2) {
//			    System.out.println("A opcao escolhida foi: " + "Financeiro");
//			    key = false;
//		}   else if(opcao == 3) {
//			    System.out.println("a opcao escolhida foi:" + sac);
//			    key = false;
//		}   else
//			
//				System.out.println("Digite uma opcao valida");
//				
//		}
//	           System.out.println(nr)
//	           nr++;
//
//          
//		
//		Scanner scan = new Scanner(System.in);
//		
//	    Carro carro = new Carro();
//		
//		System.out.println("Digite o nome do carro");
//		
//		carro.setNome(scan.nextLine());
//		
//		System.out.println("Digite a cor do carro:" );
//		carro.setCor(scan.nextLine());
//		
//		System.out.println("Digite o preco do carro: " );
//		carro.setPreco(Double.parseDouble(scan.next()));
//		
//		System.out.println("Digite o modelo do carro:" );
//		carro.setModelo(scan.nextLine());
//		
//		System.out.println("Digite o ano do carro;" );
//		carro.setAno(Integer.parseInt(scan.next()));
//		
//		
//		
//		carro.imprimir();
//		scan.close();
//		
//		Vendedor vendedor = new Vendedor();
//
//	
//	}
//	
//package br.com.concessionaria.teste;
//
//import java.util.Scanner;
//
//import br.com.concessionaria.deptocomercial.Mecanico;
//import br.com.concessionaria.deptocomercial.Vendedor;
//import br.com.concessionaria.showroom.Carro;
//
//public class Teste {
//
//	public static void main(String[] args) {
//
//		/*
//		 * // //1 - Instanciar a classe carro; // Carro carro; // //2 - Construir o
//		 * objeto carro; // carro = new Carro("Celta","Branco",18000,"Manual",2020); //
//		 * // //3 - Imprimir o nome do carro; // System.out.printf("O nome do carro é: "
//		 * + carro.getNome() + ", cor: " + carro.getCor() + ", preço: " +
//		 * carro.getPreco() + // ", modelo: " + carro.getModelo() + ", ano: " +
//		 * carro.getAno());
//		 * 
//		 * //Instanciando o scanner Scanner scan;
//		 * 
//		 * //construindo o objeto scanner scan = new Scanner(System.in);
//		 * 
//		 * //Recebendo dados via console e colocando em uma variável String dados = "";
//		 * 
//		 * System.out.println("Digite algo"); dados = scan.nextLine();
//		 * System.out.println("Este foi o valor digitado: " + dados);
//		 * 
//		 * scan.close();
//		 * 
//		 * 
//		 * // Scanner sc = new Scanner(System.in);
//		 * 
//		 */
//		/*
//		 * Scanner scan = new Scanner(System.in);
//		 * 
//		 * Carro carro = new Carro();
//		 * 
//		 * System.out.println("Digite o nome do carro"); carro.setNome(scan.next());
//		 * 
//		 * System.out.println("Digite a cor do carro"); carro.setCor(scan.next());
//		 * 
//		 * System.out.println("Digite o preço do carro");
//		 * carro.setPreco(Double.parseDouble(scan.next()));
//		 * 
//		 * System.out.println("Digite o modelo do carro"); carro.setModelo(scan.next());
//		 * 
//		 * System.out.println("Digite o ano do carro");
//		 * carro.setAno(Integer.parseInt(scan.next()));
//		 * 
//		 * carro.DadosCarro();
//		 * 
//		 * scan.close();
//		 * 
//		 * Vendedor vendedor = new Vendedor();
//		 * 
//		 * Mecanico mecanico = new Mecanico();
//		 */
//
//		Scanner scan = new Scanner(System.in);
//
//		String venda = "Vendas";
//		String financeiro = "Financeiro";
//		String sac = "SAC";
//
//		boolean key = true;
//		
//		
//
//		comando:
//			while (key) {
//			System.out.println("Selecione apenas uma das opções abaixo:");
//			System.out.println("1 = VENDAS\n2 - FINANCEIRO\n3 - SAC");
//			int opcao = 0;
//
//			try {
//				opcao = Integer.parseInt(scan.next());
//
//				if (opcao == 1) {
//					System.out.println("A opção escolhida foi: " + venda + "!");
//					System.out.println("Selecione apenas uma das opções abaixo:");
//					System.out.println("1 - Comprar\n2 - Vender\n3 - Representante");
//					opcao = Integer.parseInt(scan.next());
//					
//					switch (opcao) {
//						case 1:
//							System.out.println("Selecionado: Comprar");
//							key = false;
//							break;
//							
//						case 2:
//							System.out.println("Selecionado: Vender");
//							key = false;
//							break;
//				
//						case 3:
//							System.out.println("Selecionado: Representante");
//							key = false;
//							break;
//						default:
//							System.out.println("Somente numeros de 1 a 3 serão permitidos!");
//					}
//					
//				} else if (opcao == 2) {
//					System.out.println("A opção escolhida foi: " + financeiro);
//
//				} else if (opcao == 3) {
//					System.out.println("A opção escolhida foi: " + sac);
//
//				} else {
//					System.out.println("Digite uma opção válida!");
//				}
//
//			} catch (NumberFormatException e) {
//				System.out.println("Somente números podem ser digitados");
//				continue comando;
//			}
//		}//Final do while
//		
//		scan.close();
//	}//Final da main
//
//}//Final da class
//
