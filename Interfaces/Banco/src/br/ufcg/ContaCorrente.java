package br.ufcg;

public class ContaCorrente implements ContaInterface{
	
	private String cpf;
	private double valorAtual;
	private Integer numeroConta;
	
	public ContaCorrente(String cpf, double valorInicial, Integer numeroConta) {
		this.cpf = cpf;
		this.valorAtual = valorInicial;
		this.numeroConta = numeroConta;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
