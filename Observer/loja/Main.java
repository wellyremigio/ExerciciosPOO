package loja;

public class Main {

	public static void main(String[] args) {
		Produto p = new Produto();
		Users u1 = new Usuario("u1");
		Users u2 = new Usuario("u2");
		Users u3 = new Usuario("u3");
		
		p.cadastrarUsDisp(u1);
		p.cadastrarUsDisp(u3);
		p.cadastrarPromo(u3);
		p.cadastrarPromo(u2);
		
		p.setEstaDisponivel(true);
		p.setEstaDisponivel(false);
		p.setEstaEmPromocao(true);
	}
}
