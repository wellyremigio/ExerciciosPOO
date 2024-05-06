package move;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	
	private List<Acao> acoes;
	
	public Broker() {
		this.acoes = new ArrayList<>();
	}
	
	public void adicionarAcao(Acao acao) {
		acoes.add(acao);
	}
	
	public void executa() {
		for(Acao a:acoes) {
			a.executar();
		}
		this.acoes.clear();
	}
}
