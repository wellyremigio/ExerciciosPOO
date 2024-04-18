package documento2;

public class Rascunho implements Estado{
	private Documento documento;
	
	@Override
	public void publicarDocumento(Documento documento) {
		documento.setEstado(new Revisao());
		setDocumento(documento);
		System.out.println("Documento em revisão");
	}
	
	@Override
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
}
