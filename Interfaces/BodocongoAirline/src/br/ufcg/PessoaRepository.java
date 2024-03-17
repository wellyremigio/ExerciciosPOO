package br.ufcg;

import java.util.ArrayList;
import java.util.List;

public class PessoaRepository {
	
	private List<Papel> lista;
	//private int index;
	
	public PessoaRepository() {
		this.lista = new ArrayList<>();
		//this.index = 0;
	}

	public void cadastrar(int contador, Papel t) {
		lista.add(t);
	}
	
	public Papel getObjeto(int index) {
		return lista.get(index);
	}
}
