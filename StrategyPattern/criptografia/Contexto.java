package criptografia;

public class Contexto {
	AlgoritmoCripto algoritmo;
	
	public Contexto(AlgoritmoCripto algoritmo) {
		this.algoritmo = algoritmo;
	}
	
	public void setAlgoritmo(AlgoritmoCripto algoritmo) {
		this.algoritmo = algoritmo;
	}
	
	public String criptografar(String texto) {
		return algoritmo.criptografar(texto);
	}

}
