package loja;

public class Loja {
	private Produto produto;
	
	public Loja(Produto produto) {
		this.produto = produto;
	}
	
	public void criarAlertaDisp(Users usuario) {
		produto.cadastrarUsDisp(usuario);
	}
	
	public void criarAlertaPromo(Users usuario) {
		produto.cadastrarPromo(usuario);
	}
	
	public void alterarDisp(Boolean disp) {
		produto.setEstaDisponivel(disp);
	}
	
	public void alterarPromo(Boolean promo) {
		produto.setEstaEmPromocao(promo);
	}
}
