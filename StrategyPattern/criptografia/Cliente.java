package criptografia;

public class Cliente {
	public static void main(String[] args) {
		Contexto c = new Contexto(new L33tAlgoritmo());
		String texto = "teste criptografia";
		System.out.println(c.criptografar(texto));
		
		c.setAlgoritmo(new ExpAlgoritmo());
		System.out.println(c.criptografar(texto));
		
		c.setAlgoritmo(new Rot13Algoritmo());
		System.out.println(c.criptografar(texto));
	}
}
