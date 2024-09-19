package br.com.concessionaria.deptocomercial;

import java.util.ArrayList;
import java.util.List;

import br.com.concessionaria.showroom.Carro;

public class Vendedor extends Comercial {

	private List<Carro> lista = null;

	public Vendedor() {
		lista = new ArrayList<Carro>();

		Carro carro = new Carro();
		Mecanico mecanico = new Mecanico();

		carro.setAno(2024);
		carro.setCor("Branco");
		carro.setNome("Creta");
		carro.setPreco(100.000);
		carro.setModelo("SUV");
		mecanico.setId(1234);
		mecanico.setNome("Jonas");
		mecanico.setCargo("Supervisor");
		carro.setMecanico(mecanico);
		lista.add(carro);

		// =============================

		carro = new Carro();
		mecanico = new Mecanico();
		carro.setAno(2025);
		carro.setCor("Prata");
		carro.setNome("Jeep");
		carro.setPreco(125.000);
		carro.setModelo("SUV");
		mecanico.setId(2312);
		mecanico.setNome("Gabiru");
		mecanico.setCargo("Mecânico 1");
		carro.setMecanico(mecanico);
		lista.add(carro);

		// =============================

		carro = new Carro();
		mecanico = new Mecanico();

		carro.setAno(2023);
		carro.setCor("Vermelho");
		carro.setNome("Tesla");
		carro.setPreco(225.000);
		carro.setModelo("SEDÃ");
		mecanico.setId(3342);
		mecanico.setNome("Jennifer");
		mecanico.setCargo("Mecânico 1");
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
		
		for (Carro carro : lista) {
			System.out.println("++++++++SHOW ROOM+++++");
			
			System.out.println("***********************************");
			System.out.println("NOME : " + carro.getNome());
			System.out.println("ANO FABRICAÇÃO : " + carro.getAno());
			System.out.println("MODELO : " + carro.getModelo());
			System.out.println("COR : " + carro.getCor());
			System.out.println("VENDEDOR RESPONSÁVEL : " + vendedor.getNome());
			System.out.println("***********************************");
		}

	}

}
