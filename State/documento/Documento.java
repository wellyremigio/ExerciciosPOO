package documento;

public class Documento {
	
	private int id;
	private Estado estado;
	private boolean admin;
	private int tempoPublicado;
	private boolean revisao;
	
	public Documento(int id) {
		this.id = id;
		this.estado = new Rascunho();
		this.admin = false;
		this.tempoPublicado = 0;
		this.revisao = true;
	}
	
	public void publicar() {
		estado.publicarDocumento(this);
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean ehAdmin) {
		this.admin = ehAdmin;
	}

	public int getTempoPublicado() {
		return tempoPublicado;
	}

	public void setTempoPublicado(int tempoPublicado) {
		this.tempoPublicado = tempoPublicado;
	}

	public boolean isRevisao() {
		return revisao;
	}

	public void setRevisao(boolean revisao) {
		this.revisao = revisao;
	}
	
	public String getEstado() {
		return this.estado.toString();
	}
}
