package br.ufcg;

public class Exp implements Algoritmo {
	
	@Override
	public String criptografar(String texto) {
		return texto + "Exp";
	}
}
