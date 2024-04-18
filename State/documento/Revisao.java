package documento;

public class Revisao implements Estado{

	@Override
	public void publicarDocumento(Documento documento) {
		if(documento.isAdmin()) {
			if(!documento.isRevisao()) {
				documento.setEstado(new Revisao());
				System.out.println("Documento foi rejeitado!");
			}else {
				documento.setEstado(new Publicacao());
				System.out.println("Documento foi publicado");
			}
			
		}else {
			System.out.println("Somente o admin pode publicar documento");
		}
		
	}
}
