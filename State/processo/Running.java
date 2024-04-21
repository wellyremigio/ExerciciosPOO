package processo;

public class Running implements State{
	
	Processo processo;

	@Override
	public void interrupcao(Processo processo) {
		setProcesso(processo);
		processo.setState(new Ready());
		System.out.println("Aconteceu uma interrução -> Vai para o Ready");
	}

	@Override
	public void excecao(Processo processo) {
		setProcesso(processo);
		processo.setState(new Blocked());
		System.out.println("Aconteceu uma exceção -> Vai para o Blocked");
	}
	
	public void setProcesso(Processo processo) {
		this.processo = processo;
	}

}
