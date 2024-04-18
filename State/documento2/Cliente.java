package documento2;

public class Cliente {

	public static void main(String[] args) {
		Documento d = new Documento();
		d.publicar();
		d.publicar();
		d.setEhAdmin(true);
		d.publicar();
		d.publicar();
	}
}