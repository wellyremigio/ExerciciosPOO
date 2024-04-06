package criptografia;

public class ExpAlgoritmo implements AlgoritmoCripto{

	@Override
	public String criptografar(String texto) {
		return texto + "\nExp";		
	}

}
