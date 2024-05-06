package noticias;

public class WhatsApp implements Canal{

	@Override
	public void notificar(String noticia) {
		System.out.println("WhatsApp -> " + noticia);
	}
}
