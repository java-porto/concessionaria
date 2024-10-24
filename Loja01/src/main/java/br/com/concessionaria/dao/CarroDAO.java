package br.com.concessionaria.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;



import br.com.concessionaria.model.Carro;

public class CarroDAO {
	
//	public static List<Carro> banco = null;
	private Connection conexao;
	
	
	public CarroDAO(Connection conexao) {
			this.conexao = conexao;
		
		
		
//		if(banco == null) {
//			banco = new ArrayList<Carro>();
//			
//			Carro carro = new Carro();
//			
//			carro.setModelo("SUV");
//			carro.setNome("Renegade");
//			carro.setCor("Prata");
//			carro.setAno(2022);
//			carro.setPreco(87.000);
//			carro.setId(1);
//			banco.add(carro);
//			
//			//CARRO 2
//			carro = new Carro();
//			
//			carro.setModelo("SEDAN");
//			carro.setNome("Onix");
//			carro.setCor("Azul Royal");
//			carro.setAno(2024);
//			carro.setPreco(105.000);
//			carro.setId(2);
//			banco.add(carro);
//			
//			//CARRO 3
//			carro = new Carro();
//			
//			carro.setModelo("Hatch");
//			carro.setNome("i30");
//			carro.setCor("Preto");
//			carro.setAno(2012);
//			carro.setPreco(53.000);
//			carro.setId(3);
//			banco.add(carro);
//			
//			//CARRO 4
//			carro = new Carro();
//			
//			carro.setModelo("SEDAN");
//			carro.setNome("Civic");
//			carro.setCor("Prata");
//			carro.setAno(2000);
//			carro.setPreco(15.000);
//			carro.setId(4);
//			banco.add(carro);
//			
		}
		
		
	
	public List<Carro> select(){
		
		String sql = "SELECT * FROM CARRO";
		List<Carro> carros = new ArrayList<Carro>();
		try {
			Statement stmt = conexao.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			Carro carro; 
			while (rs.next()) {
				carro = new Carro();
				carro.setAno(Integer.parseInt(rs.getString("ano")));
				carro.setNome(rs.getString("nome"));
				carro.setModelo(rs.getString("modelo"));
				carro.setCor(rs.getString("cor"));
				carro.setMarca(rs.getString("marca"));
				carro.setPreco(rs.getDouble("preco"));
				carros.add(carro);
			}
			
			stmt.close();
			rs.close();
			conexao.close();
			
			return carros;
			
		}catch (Exception e) {
				return null;
		}
		
		
	}
//	public Carro select(int id){
//		for (int i = 0; i < banco.size(); i++) {
//			if(banco.get(i).getId() == id) {
//				return banco.get(i);
//			}
//		}
//		return null;
//	
//	}
}