package processo;

public class Ready implements State{
	Processo processo;

	@Override
	public void interrupcao(Processo processo) {
		setProcesso(processo);
		processo.setState(new Running());
		System.out.println("Aconteceu uma interrução -> Vai para o Running");
	}

	@Override
	public void excecao(Processo processo) {
		System.out.println("Não faz nada");
	}
	
	public void setProcesso(Processo processo) {
		this.processo = processo;
	}
}
