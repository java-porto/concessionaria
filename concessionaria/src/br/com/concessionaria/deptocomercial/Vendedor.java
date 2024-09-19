package br.com.concessionaria.deptocomercial;

import java.util.ArrayList;
import java.util.List;

import br.com.concessionaria.showroom.Carro;

public class Vendedor extends Comercial{
	
	public static List<Carro> lista = null;
	
	public Vendedor() {
	
	
		lista = new ArrayList<Carro>();
		Carro carro = new Carro();
		Mecanico mecanico = new Mecanico();
		

		carro.setAno(2000);
		carro.setCor("Prata");
		carro.setNome("Civic");
		carro.setPreco(15.000);
		carro.setModelo("LX");
		mecanico.setId(1234);
		mecanico.setNome("Roseildo");
		mecanico.setCargo("Supervisor");
		carro.setMecanico(mecanico);
		lista.add(carro);

		// =======================================================================================================================================================================

		carro = new Carro();
		mecanico = new Mecanico();
		

		carro.setAno(2010);
		carro.setCor("Preto");
		carro.setNome("Civic");
		carro.setPreco(70.000);
		carro.setModelo("Si");
		mecanico.setId(1123);
		mecanico.setNome("José");
		mecanico.setCargo("Mecanico 1");
		carro.setMecanico(mecanico);
		lista.add(carro);

		// ===========================================================================================================================================================================

		carro = new Carro();
		mecanico = new Mecanico();
		

		carro.setAno(2015);
		carro.setCor("Azul");
		carro.setNome("Civic");
		carro.setPreco(100.000);
		carro.setModelo("G10");
		mecanico.setId(1237);
		mecanico.setNome("Joseildo");
		mecanico.setCargo("Mecanico 1");
		carro.setMecanico(mecanico);
		lista.add(carro);

		// =======================================================================================================================================================================

		carro = new Carro();
		mecanico = new Mecanico();
		

		carro.setAno(2007);
		carro.setCor("Cinza");
		carro.setNome("Astra");
		carro.setPreco(35.000);
		carro.setModelo("Sunny");
		mecanico.setId(6660);
		mecanico.setNome("Jennifer");
		mecanico.setCargo("Mecanico 1");
		carro.setMecanico(mecanico);
		lista.add(carro);

		// =======================================================================================================================================================================

		carro = new Carro();
		mecanico = new Mecanico();
		

		carro.setAno(2014);
		carro.setCor("Vermelho");
		carro.setNome("i30");
		carro.setPreco(95.000);
		carro.setModelo("Hatch");
		mecanico.setId(3324);
		mecanico.setNome("Jonathan");
		mecanico.setCargo("Mecanico 1");
		carro.setMecanico(mecanico);
		lista.add(carro);
		
	}

	public void getLista(Vendedor vendedor) {
		System.out.println("+++++SHOW ROOM+++++++");
		
		for (int x = 0; x < lista.size() ; x++) {
			
			
			
			System.out.println("*********CARRO NR = "+ (x+1) +"**************");
			System.out.println("NOME : " + lista.get(x).getNome());
			System.out.println("ANO DE FABRICAÇÃO : " + lista.get(x).getAno());
			System.out.println("COR DO CARRO ESCOLHIDO : " + lista.get(x).getCor());
			System.out.println("MODELO ESCOLHIDO : " + lista.get(x).getModelo());
			System.out.println("PREÇO : " + lista.get(x).getPreco());
			System.out.println("VENDEDOR RESPONSÁVEL : " + vendedor.getNome());
			System.out.println("******************************");

		}
		
	
		
	}

}
