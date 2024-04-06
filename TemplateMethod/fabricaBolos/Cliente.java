package fabricaBolos;

public class Cliente {
	public static void main(String[] args) {
		FabricaBolo boloChocolate = new BoloChocolateComCaramelo();
		boloChocolate.prepararBolo();
		System.out.println("-----------------");
		FabricaBolo boloBaunilha = new BoloBaunilhaComMorango();
		boloBaunilha.prepararBolo();
	}

}
