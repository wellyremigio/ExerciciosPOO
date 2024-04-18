package documento;

public class Rascunho implements Estado{

	@Override
	public void publicarDocumento(Documento documento) {
		if(documento.isAdmin()) {
			documento.setEstado(new Publicacao());
			System.out.println("Documento foi publicado");
		}else {
			documento.setEstado(new Revisao());
			System.out.println("Documento em revisão");
		}
	}
}
