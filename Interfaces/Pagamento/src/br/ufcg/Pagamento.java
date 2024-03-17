package br.ufcg;

public interface Pagamento {
	public double calcularTaxa(int qtdParcelas, double valorTotal, double juros); 

}
