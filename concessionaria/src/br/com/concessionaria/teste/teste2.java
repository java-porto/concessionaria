package br.com.concessionaria.teste;

import java.util.List;

import br.com.concessionaria.dao.CarroDAO;
import br.com.concessionaria.dptocomercial.Mecanico;
import br.com.concessionaria.dptocomercial.Vendedor;
import br.com.concessionaria.showroom.Carro;
import java.util.Scanner;
public class teste2 {

	public teste2() {
		
	}
			
	public static void main(String[] args) {
				
	//Carro carro[] = new Carro[3];
	//carro[0] = new Carro();
	//carro[1] = new Carro();
	//carro[2] = new Carro();
	
	//carro[0].setNome("Mavecka");
	//carro[1].setNome("Opala");
	//carro[2].setNome("Jeep");
		
	//for (Carro carrinho : carro) {
		//System.out.println("Nome do carro : " + carrinho.getNome());
		
	//}
		
	//Exercício:
	//crie um array de mecânicos com 5 mecanicos e imprima através do foreach
	
	//Mecanico mecanico[] = new Mecanico [5];
	//mecanico[0] = new Mecanico();
	//mecanico[1] = new Mecanico();
	//qmecanico[2] = new Mecanico();
	//mecanico[3] = new Mecanico();
	//mecanico[4] = new Mecanico();
	
	//mecanico[0].setNome("Arrascaeta");
	//mecanico[1].setNome("Datena");
	//mecanico[2].setNome("Kety <3");
	//mecanico[3].setNome("Pablo marçal");
	//mecanico[4].setNome("Joca");
	
	//for (Mecanico mecaninho : mecanico) {
		//System.out.println("Nome do mecânico : " + mecaninho.getNome());
	//}
	
	//int nrLinhas = 21;
	//int nrColunas = 4;
	
	//String[][] assentos = new String[nrLinhas][nrColunas];
	
	//for (int x = 0; x < assentos.length; x++) {
		
		//for (int i = 0; i < nrColunas; i++) {
			//assentos[x][i] = "O";
		//}
		
		
		
	//}
	
//for (int x = 0; x < assentos.length; x++) {
		
		//for (int i = 0; i < nrColunas; i++) {
			//if(i == 2) {
				//System.out.print("-");
			//}
			//System.out.print("["+ assentos[x][i] +"]");
			
		
     //System.out.println("");

//    Vendedor vendedor = new Vendedor();
//    
//   vendedor.setCargo("Gerente");
//   vendedor.setId(1234);
//   vendedor.setNome("Joca");
//   
//    
//    Mecanico mecanico = new Mecanico();
//    mecanico.setCargo("SUPERVISOR");
//    mecanico.setId(232232);
//    mecanico.setNome("Joaquim");
//    
//    
// Carro carro = new Carro();
//   carro.setAno(2021);
//   carro.setCor("PRETA");
//   carro.setMecanico(mecanico);
//   carro.setModelo("Coupê");
//   carro.setNome("Miura");
//   carro.setPreco(87.986d);
//   carro.setVendedor(vendedor);
    
//    if (vendedor.insertCarro(carro)) {
//    	vendedor.getLista(vendedor);
//    }else {
//    	throw new NullPointerException();
//    }
    
// Carro carro = vendedor.getCarroById(vendedor.getCarroByName("Mustang"));
	

	
	//}
	
	
	//}
		
		CarroDAO cdao = new CarroDAO();
		
        Carro carro = cdao.select(5);
		Carro carro2 = new Carro();
		carro2.setNome("Chevette chavelle");
		carro2.setAno(carro.getAno());
		carro2.setCor("Preto");
		carro2.setPreco(300.000);
		carro2.setModelo("Sedã");
		System.out.println(carro.getNome());							
	    cdao.insert(carro2);
	
		List<Carro> lista = cdao.select();
		
		
		
		for (Carro car: lista) {
			System.out.println("Ano: " + car.getAno());
			System.out.println("Nome: " + car.getNome());
			System.out.println("Cor: " + car.getCor());
			System.out.println("Modelo: " + car.getModelo());
			System.out.println("Preço: " + car.getPreco());
			System.out.println("ID: " + car.getId());
			
			
		}
		
		Carro carro3 = cdao.select(3);
		carro3.imprimir();
		
		carro3.setAno(1990);
		carro3.setCor("Rosa");
		carro3.setPreco(30000);
		
		if(cdao.update(carro3.getId(), carro3)) {
			
			carro3.imprimir();
		}else {
			System.out.println("Ocorreu um erro durante a atualização!");
		}
		
	
		
		
		
	}//final da main
	
}//final da class




