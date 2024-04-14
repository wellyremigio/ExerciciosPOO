package janela;

public class Cliente {
	public static void main(String[] args) {
		JanelaAbstrata notW = new JanelaNotificacao(new JanelaWindows());
		notW.desenhar();
		notW.desenharJanela();
		notW.desenharBotao();
		System.out.println("---------------------");
		
		JanelaAbstrata notM = new JanelaNotificacao(new JanelaMac());
		notM.desenhar();
		notM.desenharJanela();
		notM.desenharBotao();
		
		System.out.println("---------------------");
		JanelaAbstrata avW = new JanelaAviso(new JanelaWindows());
		avW.desenhar();
		avW.desenharJanela();
		avW.desenharBotao();
		
		System.out.println("---------------------");
		JanelaAbstrata avM = new JanelaAviso(new JanelaMac());
		avM.desenhar();
		avM.desenharJanela();
		avM.desenharBotao();
	}
}
