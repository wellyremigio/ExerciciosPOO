package ecommerce;

public class Cliente {
	
	public static void main(String[] args) {
		ShoppingOrder shopping = new ShoppingOrder();
		shopping.aprove();
		shopping.pendente();
		shopping.ship();
		shopping.aprove();
		shopping.ship();;
	}

}
