package fabrica.bolo;

public class Cliente {
	
	public static void main(String[] args) {
		FabricaBolo bauMor = new Baunilha(new Morango());
		bauMor.prepararBolo();
		System.out.println("----------------");
		FabricaBolo bauCar = new Baunilha(new Caramelo());
		bauCar.prepararBolo();
		
		System.out.println("----------------");
		FabricaBolo choMor = new Chocolate(new Morango());
		choMor.prepararBolo();
		
		System.out.println("----------------");
		FabricaBolo choCar = new Chocolate(new Caramelo());
		choCar.prepararBolo();
	}
}
