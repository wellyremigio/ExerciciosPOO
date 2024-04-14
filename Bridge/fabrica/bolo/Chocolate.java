package fabrica.bolo;

public class Chocolate extends FabricaBolo{

	public Chocolate(Cobertura cobertura) {
		super(cobertura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fazerMassa() {
		System.out.println("Faz massa chocolate");
	}

}
