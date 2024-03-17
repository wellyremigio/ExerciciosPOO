package br.ufcg;

public class Main {
	
	public static void main(String [] args) {
		BancoController b = new BancoController();
		
		System.out.println("Numero conta: "+ b.cadastrarContaCorrente("1234", 100));
		System.out.println("Saldo: "+ b.saldo(0));
		
		b.depositar(0, 50);
		System.out.println("Saldo: "+b.saldo(0));
		
		System.out.println("Deu certo? "+b.sacar(0, 200));
		System.out.println("Saldo: "+b.saldo(0));
	}

}
