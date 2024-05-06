package move;

public class MovCorrer implements Acao{
	
	private Deslocamento d;
	
	public MovCorrer(Deslocamento d) {
		this.d = d;
	}

	@Override
	public void executar() {
		d.correr();
	}
}
