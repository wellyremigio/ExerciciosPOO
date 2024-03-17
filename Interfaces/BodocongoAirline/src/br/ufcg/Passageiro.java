package br.ufcg;

public class Passageiro implements Papel{
	
	private int id;
	private String nome;
	private String endereco;
	
	public Passageiro(int id, String nome, String endereco) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getEndereco() {
		return this.endereco;
	}

	@Override
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
