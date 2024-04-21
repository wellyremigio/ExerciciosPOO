package processo;

public class Processo {
	
	State state;
	
	public Processo() {
		this.state = new Ready();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void interruption() {
		this.state.interrupcao(this);
	}
	
	public void exception() {
		this.state.excecao(this);
	}
}
