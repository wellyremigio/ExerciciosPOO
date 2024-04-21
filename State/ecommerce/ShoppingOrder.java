package ecommerce;

public class ShoppingOrder {
	private OrderState state;
	
	public ShoppingOrder() {
		this.state = new Pendente();
	}

	public OrderState getState() {
		return state;
	}

	public void setState(OrderState state) {
		this.state = state;
	}
	
	public void aprove() {
		state.aprovar(this);
	}
	
	public void rejeitar() {
		state.rejeitar(this);
	}
	
	public void pendente() {
		state.esperar(this);
	}
	
	public void ship() {
		state.ship(this);
	}
	
	public String getStateName() {
		return this.state.getName();
	}
}
