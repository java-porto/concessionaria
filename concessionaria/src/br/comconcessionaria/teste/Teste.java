package br.comconcessionaria.teste;

import java.util.Scanner;

import br.comconcessionaria.showroom.Carro;


public class Teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in)
		;
		String venda = "vendas";
		String financeira = "Financeira";
		String sac = "Sac";
		
		boolean key = true;
		
		while(key) {
			System.out.println("Escolha uma das opcoes abaixo:");
			System.out.println(" 1 =\VENDAS\n2 - FINANCEIRO\n3 - SAC ");
			int opçao = integer.parseInt(scan.next());
			
			if (opcao == 1))System.out.println("A opçao escolhida foi : " + venda);
				key = false;
		}   else if(opcao == 2) {
			    System.out.println("A opcao escolhida foi : " + financeiro);
			    key = false;
		}   else if(opcao ==) {
			    System.out.prinln("a opcao escolhida foi :" + sac);
			    key = false;
		}   else
			
				System.out.println("Digite uma opcao valida");
				
			}
			System.out.println(nr)
			nr++;
}
		}
		
		Scanner scan = new Scanner(System.in);
		
	    Carro carro = new Carro();
		
		System.out.println("Digite o nome do carro");
		
		carro.setNome(scan.nextLine());
		
		System.out.println("Digite a cor do carro");
		carro.setCor(scan.nextLine());
		
		System.out.println("Digite o preco do carro");
		carro.setPreco(Double.parseDouble(scan.next()));
		
		System.out.println("Digite o modelo do carro");
		carro.setModelo(scan.nextLine());
		
		System.out.println("Digite o ano do carro");
		carro.setAno(Integer.parseInt(scan.next()));
		
		
		
		carro.imprimir();
		scan.close();
		
		vendedor vendedor = new Vendedor();
		
		
		
		

	
	}

	
	
	
	
}
