package scrumboard;

public class UserStorie {
	private Estado estado;
	
	public UserStorie() {
		this.estado = new ToDo();
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void moverDeEstado(String membroEquipe) {
		this.estado.moverEstado(membroEquipe, this);
	}
}
