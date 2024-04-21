package tcp;

public class Estabelecida implements ConectionType{

	@Override
	public void open() {
		System.out.println("Não é possível abrir uma conexão já estabelecida.");
	}

	@Override
	public void close() {
		System.out.println("Conexão fechada.");
	}

	@Override
	public void acknowledge() {
		System.out.println("ACK");
	}

}
