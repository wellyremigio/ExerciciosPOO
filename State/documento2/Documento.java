package documento2;

public class Documento {
	
	private Estado estado;
	private boolean ehAdmin;
	
	public Documento() {
		this.estado = new Rascunho();
		this.ehAdmin = false;
	}
	
	public void publicar() {
		estado.publicarDocumento(this);
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public boolean getEhAdmin() {
		return ehAdmin;
	}

	public void setEhAdmin(boolean ehAdmin) {
		this.ehAdmin = ehAdmin;
	}
}
