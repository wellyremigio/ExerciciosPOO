package tcp;

public class Listen implements ConectionType{

	@Override
	public void open() {
		System.out.println("Abriu a conexão.");
	}

	@Override
	public void close() {
		System.out.println("Fechou a conexão.");
	}

	@Override
	public void acknowledge() {
		System.out.println("ACK");		
	}

}
