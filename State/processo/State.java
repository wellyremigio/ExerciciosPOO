package processo;

public interface State {
	public void interrupcao(Processo processo);
	public void excecao(Processo processo);
}
