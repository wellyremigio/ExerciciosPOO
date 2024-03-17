package br.ufcg;

import java.util.HashMap;
import java.util.Map;

public class BancoController {
	
	private Map<Integer,ContaInterface> contas;
	private Integer contador;
	
	public BancoController() {
		this.contas = new HashMap<>();
		this.contador = 0;
	}
	
	
	public int cadastrarContaCorrente(String cpf, double valorInicial) {
		ContaInterface c = new ContaCorrente(cpf, valorInicial, contador);
		contas.put(contador, c);
		return contador++;
	}
	
	public int cadastrarContaPoupanca(String cpf) {
		ContaInterface c = new ContaPoupanca(cpf, contador);
		contas.put(contador, c);
		return contador++;
	}
	
	public int cadastrarContaFamilia(String cpf1, String cpf2, int valorInicial) {
		ContaInterface c = new ContaFamilia(cpf1, cpf2, valorInicial, contador);
		contas.put(contador, c);
		return contador++;
	}
	
	public boolean sacar(Integer numeroConta, double valorSaque) {
		return contas.get(numeroConta).sacar(valorSaque);
		
	}
	
	public void depositar(Integer numeroConta, double valorDeposito) {
		contas.get(numeroConta).depositar(valorDeposito);
	}
	
	public double saldo(Integer numeroConta) {
		return contas.get(numeroConta).getValorAtual();
	}
}
