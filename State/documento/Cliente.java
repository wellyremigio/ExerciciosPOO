package documento;

public class Cliente {

	public static void main(String[] args) {
		Service s = new Service();
		s.cadastrarDocumento();
//		System.out.println(s.getEstado(0));
//		s.publicar(0);
//		System.out.println(s.getEstado(0));
//		s.publicar(0);
//		s.setAdmin(0, true);
//		s.publicar(0);
//		System.out.println(s.getEstado(0));
//		s.setTempo(0, 10);
//		s.publicar(0);
//		System.out.println(s.getEstado(0));
		s.cadastrarDocumento();
		s.publicar(1);
		System.out.println(s.getEstado(1));
		s.setAdmin(1, true);
		s.setRevisao(1, false);
		s.publicar(1);
		s.setRevisao(1, true);
		s.publicar(1);
	
		System.out.println(s.getEstado(1));
		//Documento d = new Documento();
//		d.publicar();
//		d.setRevisao(true);
//		d.setAdmin(true);
//		d.publicar();
//		d.setTempoPublicado(10);
//		d.publicar();
//		System.out.println(d.getEstado());
	}
}
