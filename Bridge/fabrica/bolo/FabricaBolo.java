package fabrica.bolo;

public abstract class FabricaBolo {
	
	private Cobertura cobertura;
	
	public FabricaBolo(Cobertura cobertura) {
		this.cobertura = cobertura;
	}
	
	public void setCobertura(Cobertura cobertura) {
		this.cobertura = cobertura;
	}
	
	public void prepararBolo() {
		fazerMassa();
		levarAoForno();
		fazerCobertura();
		decorarBolo();
	}
	
	public void fazerCobertura() {
		cobertura.fazerCobertura();
	}
	
	public abstract void fazerMassa();
	
	public void levarAoForno() {
		System.out.println("Levar ao forno");
	}
	
	public void decorarBolo() {
		System.out.println("Decorar bolo");
	}
}
