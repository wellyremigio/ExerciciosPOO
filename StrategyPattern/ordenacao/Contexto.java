package ordenacao;

public class Contexto {
	
	OrdenacaoStrategy ordenacao;
	
	public Contexto(OrdenacaoStrategy ordenacao) {
		this.ordenacao = ordenacao;
	}
	
	public void setOrdenacao(OrdenacaoStrategy ordenacao) {
		this.ordenacao = ordenacao;
	}
	
	public void ordenar(int[] array) {
		ordenacao.ordenar(array);
	}
}
