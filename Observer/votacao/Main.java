package votacao;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		ResultadoVotacao r = new ResultadoVotacao();
		Representacao g = new Grafico();
		Representacao t = new Tabela();
		r.adicionarRepresentacao(g);
		r.adicionarRepresentacao(t);
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Francisco", 10);
		map.put("Tiago", 9);
		r.atualizarVotos(map);
	}
}
