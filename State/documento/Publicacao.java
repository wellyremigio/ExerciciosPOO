package documento;

public class Publicacao implements Estado{

	@Override
	public void publicarDocumento(Documento documento) {
		if(documento.getTempoPublicado()>5) {
			documento.setEstado(new Rascunho());
			System.out.println("Documento está muito tempo publicado.");
		}else {
			System.out.println("Documento já está publicado.");
		}
	}
}
