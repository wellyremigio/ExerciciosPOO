package noticias;

import java.util.*;
public class DivulgacaoNoticia {
	
	private List<Canal> canais;
	private int contador;
	public String noticia;
	
	public DivulgacaoNoticia() {
		this.canais = new ArrayList<>();
		this.contador = 0;
	}
	
	public int adicionarCanal(Canal canal) {
		this.canais.add(canal);
		return contador++;
	}
	
	public void removerCanal(int index) {
		this.canais.remove(index);
	}
	
	public void adicionarNoticia(String noticia) {
		this.noticia = noticia;
		noticiarCanais(noticia);
	}
	
	private void noticiarCanais(String noticia) {
		for(Canal canal: canais) {
			canal.notificar(noticia);
		}
	}
}
