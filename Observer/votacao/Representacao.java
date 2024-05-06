package votacao;

import java.util.HashMap;

public interface Representacao {
	void notificar(HashMap<String, Integer> votos);
}
