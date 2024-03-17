package br.ufcg;

public class ContaFamilia implements ContaInterface{
	
	private String cpf1;
	private String cpf2;
	private double valorAtual;
	private Integer numeroConta;
	
	public ContaFamilia(String cpf1, String cpf2, double valorInicial, Integer numeroConta) {
		this.cpf1 = cpf1;
		this.cpf2 = cpf2;
		this.valorAtual = valorInicial;
		this.numeroConta = numeroConta;
	}

	public String getCpf1() {
		return cpf1;
	}

	public void setCpf1(String cpf1) {
		this.cpf1 = cpf1;
	}

	public String getCpf2() {
		return cpf2;
	}

	public void setCpf2(String cpf2) {
		this.cpf2 = cpf2;
	}

	@Override
	public double getValorAtual() {
		return valorAtual;
	}

	public void setValorAtual(double valorAtual) {
		this.valorAtual = valorAtual;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	@Override
	public boolean sacar(double valorSaque) {
		boolean resp = false;
		if((this.valorAtual - valorSaque)>=0) {
			this.valorAtual-= valorSaque;
			resp = true;
		}
		return resp;
	}
	
	@Override
	public void depositar(double valorDeposito) {
		this.valorAtual += valorDeposito;
	}
}
