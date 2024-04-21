package ecommerce;

public class Rejeitada implements OrderState{
	private String name = "Rejeitada";

	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public void aprovar(ShoppingOrder shopping) {
		System.out.println("O pedido já está reprovado");
		
	}

	@Override
	public void rejeitar(ShoppingOrder shopping) {
		System.out.println("Já está rejeitada");
	}

	@Override
	public void esperar(ShoppingOrder shopping) {
		shopping.setState(new Pendente());
		System.out.println("Não pode esperar pois já está recusado");
	}

	@Override
	public void ship(ShoppingOrder shopping) {
		System.out.println("O pedido não pode ser enviada, pois foi rejeitada");
	}
}
