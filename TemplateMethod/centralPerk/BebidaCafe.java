package centralPerk;

public class BebidaCafe extends Bebida{

	@Override
	public void preparar() {
		System.out.println("Moer e coar o café");
		
	}

	@Override
	public void adicionarExtras() {
		System.out.println("Adicionar leite e açúcar");		
	}
}
