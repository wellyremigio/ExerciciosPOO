package ecommerce;

public interface OrderState {
	
	public String getName();
	public void aprovar(ShoppingOrder shopping);
	public void rejeitar(ShoppingOrder shopping);
	public void esperar(ShoppingOrder shopping);
	public void ship(ShoppingOrder shopping);
}
