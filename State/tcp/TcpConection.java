package tcp;

public class TcpConection {
	
	private ConectionType conection;
	
	public TcpConection() {
		this.conection = new Listen();
	}
	
	public void setConection(ConectionType conection) {
		this.conection = conection;
	}
	
	public void open() {
		this.conection.open();
	}
	
	
	public void close() {
		this.conection.close();
	}
	
	public void acknowledge() {
		this.conection.acknowledge();
	}
}
