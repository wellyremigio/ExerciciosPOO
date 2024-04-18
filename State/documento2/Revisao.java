package documento2;

public class Revisao implements Estado{
	
	private Documento documento;

	@Override
	public void publicarDocumento(Documento documento) {
		setDocumento(documento);
		if(documento.getEhAdmin()) {
			documento.setEstado(new Publicacao());
			System.out.println("Documento foi publicado");
		}else {
			System.out.println("Somente o admin pode publicar documento");
		}
	}
	
	@Override
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
}
