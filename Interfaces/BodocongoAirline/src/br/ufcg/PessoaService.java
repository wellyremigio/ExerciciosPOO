package br.ufcg;

public class PessoaService {
	PessoaRepository repository;
	int id;
	
	public PessoaService() {
		this.repository = new PessoaRepository();
		this.id = 0;
	}

	public Integer cadastrarTripulante(String nome, String endereco) {
		Papel t = new Tripulacao(id, nome, endereco);
		this.repository.cadastrar(id, t);
		return id++;
	}

	public Integer cadastrarPassageiro(String nome, String endereco) {
		Papel t = new Passageiro(id, nome, endereco);
		this.repository.cadastrar(id, t);
		return id++;
	}
	
	public Integer cadastrarAgente(String nome, String endereco) {
		Papel t = new Agente(id, nome, endereco);
		this.repository.cadastrar(id, t);
		return id++;
	}

	public Integer getId(int num) {
		Papel p = this.repository.getObjeto(num);
		return p.getId();
	}

	public void setId(int num, int novoId) {
		Papel p = this.repository.getObjeto(num);
		p.setId(novoId);
	}

	public String getNome(int num) {
		Papel p = this.repository.getObjeto(num);
		return p.getNome();
	}

	public void setNome(Integer id, String novoNome) {
		Papel p = this.repository.getObjeto(id);
		p.setNome(novoNome);
	}

	public String getEndereco(Integer id) {
		Papel p = this.repository.getObjeto(id);
		return p.getEndereco();
	}

	public void setEndereco(Integer id, String novoEndereco) {
		Papel p = this.repository.getObjeto(id);
		p.setEndereco(novoEndereco);
	}
}
