package centralPerk;

public abstract class Bebida {
	
	public void prepararBebida() {
		esquentarAgua();
		preparar();
		servirEmCopo();
		adicionarExtras();
	}
	
	public abstract void preparar();
	public abstract void adicionarExtras();
	
	public void esquentarAgua() {
		System.out.println("Esquentar água");
	}
	
	public void servirEmCopo() {
		System.out.println("Servir em copo");
	}
}


