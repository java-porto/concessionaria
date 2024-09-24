package br.concessionaria.comercial;

import java.util.ArrayList;
import java.util.List;

import br.comconcessionaria.showroom.Carro;

public class Vendedor extends Comercial {
       private int id;
	public static List<br.comconcessionaria.showroom.Carro> lista = null;

	public Vendedor() {
		lista = new ArrayList<Carro>();

	Carro carro = new Carro();
		Mecanico mecanico = new Mecanico();
        carro.setId(1);
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
		carro.setId(2);
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
		
        carro.setId(3);
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
		carro.setId(4);
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
        carro.setId(5);
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
        carro.setId(6);
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
        carro.setId(7);
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
		System.out.println("++++++++SHOW ROOM+++++");
		for (int x = 0; x < lista.size() ; x++) {
			
			System.out.println("*********CARRO NR = "+ (lista.get(x).getNome()) +" ****************");
			System.out.println("NOME : " + lista.get(x).getNome());
			System.out.println("ANO FABRICAÇÃO : " + lista.get(x).getAno());
			System.out.println("MODELO : " + lista.get(x).getModelo());
			System.out.println("COR : " + lista.get(x).getCor());
			System.out.println("PREÇO : " + lista.get(x).getPreco());
			System.out.println("VENDEDOR RESPONSÁVEL : " + vendedor.getNome());
			System.out.println("***********************************");
		}

	}

   public int getCarroByName(String nomeCarro) {
	   for(int x = 0; x < lista.size(); x++){
		   if(lista.get(x).getNome().equals(nomeCarro)) {
			   return lista.get(x).getId();
		   }
	   }
	   
	   return 0;
   }
       public Carro getCarroById(int id){
            for(int x = 0; x < lista.size(); x ++) {
            	if(lista.get(x).getId() == id) {
            		return lista.get(x);
            	}
            	
            }
         
            return null;
        
       }
       public boolean removerCarroDaLista(Carro carro) {
    	   for(int x = 0; x < lista.size(); x ++) {
           	if(lista.get(x) == carro) {
           		return lista.remove(carro);
    	   
       }
}

             return false;
       }
       
       public boolean insertCarro(Carro carro) {
    	 int idCarro = lista.get(lista.size()).getId()+1;
    	 carro.setId(idCarro);
    	 if(lista.add(carro));
    	 return true;
       }
    	 
    	   
       }
}
