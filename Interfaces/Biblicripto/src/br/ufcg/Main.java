package br.ufcg;

public class Main {

	public static void main(String[] args) {
		Biblicripto b = new Biblicripto();
		System.out.println(b.criptografar("Fubica é o melhor professor da UFCG"));
		
		b.configurarAlgoritmo("EXP");
		System.out.println(b.criptografar("Massoni é o melhor professor da UFCG"));
		
		b.configurarAlgoritmo("L33T");
		System.out.println(b.criptografar("Fubica é o professor mais lindo da UFCG"));
		System.out.println("----------------------------");
		
		System.out.println(b.listarTextosOriginais());
	}

}
