package br.ufcg;

import java.util.ArrayList;
import java.util.List;

public class Biblicripto {
	private List<String> textosOriginais;
	private Algoritmo algoritmo;
	
	public Biblicripto() {
		this.textosOriginais = new ArrayList<>();
		this.algoritmo = new Rot13();
	}
	
	public String criptografar(String textoOriginal) {
		this.textosOriginais.add(textoOriginal);
		return this.algoritmo.criptografar(textoOriginal);
	}
	
	public void configurarAlgoritmo(String novoAlg) {
		switch(novoAlg) {
		case "ROT13":
			this.algoritmo = new Rot13();
			break;
		case "EXP":
			this.algoritmo = new Exp();
			break;
		case "L33T":
			this.algoritmo = new L33t();
			break;
			
		}
	}
	
	public String listarTextosOriginais() {
		String concat = "t";
		for(String s: this.textosOriginais) {
			concat += s + System.lineSeparator();
		}
		return concat;
	}
}
