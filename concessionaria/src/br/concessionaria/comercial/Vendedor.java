package br.concessionaria.comercial;

import java.util.ArrayList;
import java.util.List;

import br.comconcessionaria.showroom.Carro;

public class Vendedor extends Comercial {
       private int id;
	public static List<br.comconcessionaria.showroom.Carro> lista = null;

	public Vendedor() {
		lista = new ArrayList<Carro>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static List<br.comconcessionaria.showroom.Carro> getLista() {
		return lista;
	}

	public static void setLista(List<br.comconcessionaria.showroom.Carro> lista) {
		Vendedor.lista = lista;
	}
}