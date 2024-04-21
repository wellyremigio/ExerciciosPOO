package ecommerce;

public class Aprovada implements OrderState{

	private String name = "Aprovada";
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void aprovar(ShoppingOrder shopping) {
		System.out.println("O pedido já está aprovado.");
	}

	@Override
	public void rejeitar(ShoppingOrder shopping) {
		shopping.setState(new Rejeitada());
		System.out.println("Compra rejeitada");
	}

	@Override
	public void esperar(ShoppingOrder shopping) {
		shopping.setState(new Pendente());
		System.out.println("Pagamento pendente");
	}

	@Override
	public void ship(ShoppingOrder shopping) {
		System.out.println("Compra enviada");
	}
}
