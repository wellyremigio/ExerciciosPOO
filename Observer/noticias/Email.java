package noticias;

public class Email implements Canal{

	@Override
	public void notificar(String noticia) {
		System.out.println("Email -> " + noticia);
	}
}
