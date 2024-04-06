package criptografia;

public class Rot13Algoritmo implements AlgoritmoCripto{

	@Override
	public String criptografar(String texto) {
		return texto + "\nRot13";		
	}

}
