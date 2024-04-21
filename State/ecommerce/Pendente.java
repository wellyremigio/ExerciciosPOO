package ecommerce;

public class Pendente implements OrderState{

	private String name = "Pendente";

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void aprovar(ShoppingOrder shopping) {
		shopping.setState(new Aprovada());
		System.out.println("O pedido foi aprovado.");
	}

	@Override
	public void rejeitar(ShoppingOrder shopping) {
		shopping.setState(new Rejeitada());
		System.out.println("O pedido foi rejeitado.");
	}

	@Override
	public void esperar(ShoppingOrder shopping) {
		System.out.println("O pedido já está pendente");
	}

	@Override
	public void ship(ShoppingOrder shopping) {
		System.out.println("O pedido ainda está pendente");
	}
}
