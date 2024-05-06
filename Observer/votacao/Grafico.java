package votacao;

import java.util.HashMap;

public class Grafico implements Representacao{

	@Override
	public void notificar(HashMap<String, Integer> votos) {
		System.out.println("Gráfico" + votos.toString());
	}
}
