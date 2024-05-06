package noticias;

public class Main {

	public static void main(String[] args) {
		Canal email = new Email();
		Canal whats = new WhatsApp();
		Canal sms = new Sms();
		DivulgacaoNoticia d = new DivulgacaoNoticia();
		d.adicionarCanal(sms);
		d.adicionarCanal(whats);
		d.adicionarCanal(email);
		d.adicionarNoticia("As férias estão chegando!!");
		d.removerCanal(2);
		d.adicionarNoticia("Oi");
	}
}
