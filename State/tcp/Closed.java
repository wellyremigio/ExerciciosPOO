package tcp;

public class Closed implements ConectionType{

	@Override
	public void open() {
		System.out.println("Não é possível abrir uma conexão que já está fechada.");
	}

	@Override
	public void close() {
		System.out.println("Não é possível fechar uma conexão já encerrada.");
	}

	@Override
	public void acknowledge() {
		System.out.println("Não é possível ACK numa conexão já encerrada.");

	}

}
