package br.ufcg;

public class Rot13 implements Algoritmo{

	@Override
	public String criptografar(String texto) {
		return texto + "Rot13";
	}
}
