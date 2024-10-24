package br.com.concessionaria.bo;


import java.util.List;

import br.com.concessionaria.dao.CarroDAO;
import br.com.concessionaria.factory.ConnectionFactory;
import br.com.concessionaria.model.Carro;



public class CarroBO {
	private CarroDAO cdao;
	private ConnectionFactory cf;
	
	public List<Carro> listaCarro() {
		CarroDAO cdao = new CarroDAO((cf.getConexao));
		return cdao.select();
	}
	
	public boolean validacao(String modelo, String nome, String cor, int ano, double preco) {
		if(modelo == null || modelo.equals("")) {
			return false;
		}
		else if(nome == null || nome.equals("")) {
			return false;
		}
		else if(cor == null || nome.equals("")) {
			return false;
		}
		else if(ano == 0) {
			return false;
		} else if(preco == 0){
			return false;
		}
		
		return true;
	}
	
	
}



