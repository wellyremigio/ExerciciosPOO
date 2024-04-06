package operacoesMatematicas;

public class Contexto {
	private OperacaoStrategy operacao;
	
	public Contexto(OperacaoStrategy operacao) {
		this.operacao = operacao;
	}
	
	public void setOperacao(OperacaoStrategy operacao) {
		this.operacao = operacao;
	}
	
	public int fazerOperacao(int num1, int num2) {
		return operacao.calcular(num1, num2);
	}

}
