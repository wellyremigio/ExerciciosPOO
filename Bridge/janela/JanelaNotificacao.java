package janela;

public class JanelaNotificacao extends JanelaAbstrata{

	public JanelaNotificacao(Janela janela) {
		super(janela);
	}

	@Override
	public void desenhar() {
		System.out.println("Janela de notificação");
	}
}
