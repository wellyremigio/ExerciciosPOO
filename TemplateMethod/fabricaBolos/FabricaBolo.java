package fabricaBolos;

public abstract class FabricaBolo {
	
	public void prepararBolo() {
		fazerMassa();
		levarAoForno();
		fazerCobertura();
		decorarBolo();
	}
	
	public abstract void  fazerMassa();
	public abstract void fazerCobertura();
	
	public void levarAoForno() {
		System.out.println("Leva ao forno");
	}
	
	public void decorarBolo() {
		System.out.println("Decorar bolo");
	}
}
