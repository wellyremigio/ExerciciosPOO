package br.ufcg;

public class PessoaController {
	
	PessoaService service;
	
	public PessoaController() {
		this.service = new PessoaService();
	}
	
	
	public Integer cadastrarTripulante(String nome, String endereco) {
		return service.cadastrarTripulante(nome, endereco);
		
	}
	
	public Integer cadastrarPassageiro(String nome, String endereco) {
		return service.cadastrarPassageiro(nome, endereco);
	}
	
	public Integer cadastrarAgente(String nome, String endereco) {
		return service.cadastrarAgente(nome, endereco);
	}
	
	public Integer getId(Integer num) {
		return service.getId(num);
	}
	
	public void setId(Integer num, Integer id) {
		service.setId(num, id);
	}
	
	public String getNome(Integer id) {
		return service.getNome(id);
	}
	
	
	public void setNome(Integer id, String novoNome) {
		service.setNome(id, novoNome);
	}
	
	public String getEndereco(Integer id) {
		return service.getEndereco(id);
	}
	
	public void setEndereco(Integer id, String novoEndereco) {
		service.setEndereco(id, novoEndereco);
	}
	

}
