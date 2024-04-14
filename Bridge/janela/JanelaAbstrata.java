package janela;

public abstract class JanelaAbstrata {
	
	Janela janela;
	
	public JanelaAbstrata(Janela janela) {
		this.janela = janela;
	}
	
	public void setJanela(Janela janela) {
		this.janela = janela;
	}
	
	public void desenharJanela() {
		janela.desenharJanela();
	}
	
	public void desenharBotao() {
		janela.desenharBotao();
	}
	
	public abstract void desenhar();
}
