package processo;

public class Blocked implements State{
	
	Processo processo;

	@Override
	public void interrupcao(Processo processo) {
		setProcesso(processo);
		processo.setState(new Ready());
		System.out.println("Aconteceu uma interrupção -> Vai para o Ready");
	}

	@Override
	public void excecao(Processo processo) {
		setProcesso(processo);
		processo.setState(new Ready());
		System.out.println("Aconteceu uma exceção -> Vai para o Ready");
	}
	
	public void setProcesso(Processo processo) {
		this.processo = processo;
	}

}
