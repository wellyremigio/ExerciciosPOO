package br.ufcg;

public class MercadoPago implements Pagamento{

	@Override
	public double calcularTaxa(int qtdParcelas, double valorTotal, double i) {
		double valorParcela = valorTotal/qtdParcelas;
		double valor1 = valorParcela + 0.005*valorParcela*i;
		return (valor1 + 0.01*valor1);
	}
}
