package centralPerk;

public class BebidaCha extends Bebida{

	@Override
	public void preparar() {
		System.out.println("Mergulhar o saquinho de chá");		
	}

	@Override
	public void adicionarExtras() {
		System.out.println("Adicionar limão");		
	}
}
