package centralPerk;

public class Barista {

	public static void main(String[] args) {
		Bebida cafe = new BebidaCafe();
		cafe.prepararBebida();
		System.out.println("------------------");
		Bebida cha = new BebidaCha();
		cha.prepararBebida();
	}
}
