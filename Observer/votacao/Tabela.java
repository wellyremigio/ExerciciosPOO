package votacao;

import java.util.HashMap;

public class Tabela implements Representacao{

	@Override
	public void notificar(HashMap<String, Integer> votos) {
		System.out.println("Tabela" + votos.toString());		
	}
}
