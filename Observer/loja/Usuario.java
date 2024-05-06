package loja;

public class Usuario implements Users{
	
	private String nome;
	
	public Usuario(String nome) {
		this.nome = nome;
	}

	@Override
	public void notificar(String msg) {
		System.out.println("Nome do user: " + nome + "Mesagem: " +msg);
	}
}
