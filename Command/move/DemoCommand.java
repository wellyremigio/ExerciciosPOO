package move;

public class DemoCommand {
	public static void main(String [] args) {
		Deslocamento d = new Deslocamento();
		
		MovAndar a = new MovAndar(d);
		MovCorrer c = new MovCorrer(d);
		
		Broker b = new Broker();
		
		b.adicionarAcao(a);
		b.adicionarAcao(c);
		b.adicionarAcao(c);
		b.adicionarAcao(a);
		b.executa();
	}
}
