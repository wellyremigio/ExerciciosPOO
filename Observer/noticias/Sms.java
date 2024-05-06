package noticias;

public class Sms implements Canal{

	@Override
	public void notificar(String noticia) {
		System.out.println("SMS -> " + noticia);
	}
}
