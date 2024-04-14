package fabrica.bolo;

public class Baunilha extends FabricaBolo{

	public Baunilha(Cobertura cobertura) {
		super(cobertura);
	}

	@Override
	public void fazerMassa() {
		System.out.println("Faz massa baunilha");
	}
}
