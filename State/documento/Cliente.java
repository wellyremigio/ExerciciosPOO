package documento;

public class Cliente {

	public static void main(String[] args) {
		Documento d = new Documento();
		d.publicar();
		d.setRevisao(true);
		d.setAdmin(true);
		d.publicar();
		d.setTempoPublicado(10);
		d.publicar();
		System.out.println(d.getEstado());
	}
}
