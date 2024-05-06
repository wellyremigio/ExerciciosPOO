package move;

public class MovAndar implements Acao{
	
	private Deslocamento d;
	
	public MovAndar(Deslocamento d) {
		this.d = d;
	}

	@Override
	public void executar() {
		d.andar();
	}
}
