package votacao;

//import java.util.HashMap;
//import java.util.List;
import java.util.*;

public class ResultadoVotacao {
	
	private Map<String, Integer> votos;
	private List<Representacao> representacoes;
	
	public ResultadoVotacao() {
		this.votos = new HashMap<>();
		this.representacoes = new ArrayList<>();
	}
	
	public void adicionarRepresentacao(Representacao r) {
		representacoes.add(r);
	}
	
	public void atualizarVotos(HashMap<String, Integer> votos) {
		this.votos = votos;
		notify(votos);
	}
	
	private void notify(HashMap<String, Integer> votos) {
		for(Representacao r: representacoes) {
			r.notificar(votos);
		}
	}
}
