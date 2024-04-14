package janela;

public class JanelaAviso extends JanelaAbstrata{

	public JanelaAviso(Janela janela) {
		super(janela);
	}

	@Override
	public void desenhar() {
		System.out.println("Janela de aviso");
	}
}
