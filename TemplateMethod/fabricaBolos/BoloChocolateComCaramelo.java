package fabricaBolos;

public class BoloChocolateComCaramelo extends FabricaBolo{

	@Override
	public void fazerMassa() {
		System.out.println("Fazer massa de chocolate");
	}

	@Override
	public void fazerCobertura() {
		System.out.println("Fazer cobertura de caramelo");
	}
}
