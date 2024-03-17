package br.ufcg;

public class Paypal implements Pagamento{

	@Override
	public double calcularTaxa(int qtdParcelas, double valorTotal, double i) {
		double valorParcela = valorTotal/qtdParcelas;
		double valor1 = valorParcela + 0.01* valorParcela*i;
		return (valor1 + valor1*0.02); 
	}
}
