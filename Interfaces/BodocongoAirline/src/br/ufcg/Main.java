package br.ufcg;

public class Main {

	public static void main(String[] args) {
		PessoaController p = new PessoaController();
		System.out.println(p.cadastrarAgente("Welly", "Rua 1"));
		System.out.println(p.cadastrarPassageiro("Fubica", "Rua 2"));
		System.out.println(p.cadastrarTripulante("Massoni", "Rua 3"));
		
		p.setEndereco(0, "Avenida de Boa Viagem");
		System.out.println(p.getEndereco(0));
		System.out.println(p.getEndereco(2));

	}

}
