package documento;

import java.util.HashMap;
import java.util.Map;

public class Service {
	private Map<Integer, Documento> docs;
	private int contador;
	
	public Service() {
		this.docs =  new HashMap<>();
		this.contador = 0;
	}
	
	public void cadastrarDocumento() {
		docs.put(contador++, new Documento(contador));
	}
	
	public void publicar(int index) {
		docs.get(index).publicar();
	}
	
	public void setAdmin(int index, boolean ehAdmin) {
		docs.get(index).setAdmin(ehAdmin);
	}
	
	public void setTempo(int index, int tempo) {
		docs.get(index).setTempoPublicado(tempo);
	}
	
	public void setRevisao(int index, boolean revisao) {
		docs.get(index).setRevisao(revisao);
	}
	
	public String getEstado(int index) {
		return docs.get(index).getEstado();
	}
}
