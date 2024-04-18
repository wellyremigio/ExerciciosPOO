package documento2;

public class Publicacao implements Estado{
	private Documento documento;
	
	@Override
	public void publicarDocumento(Documento documento) {
		setDocumento(documento);
		System.out.println("Documento já está publicado.");
	}
	
	
	@Override
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
}
