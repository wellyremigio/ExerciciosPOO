package br.ufcg;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Contrato {
	private int numero;
	private Date dataContrato;
	private double valorTotal;
	private int qtdParcelas;
	private Pagamento pagamento;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Contrato(int numero, Date dataContrato, double valor, int qtd) {
		this.numero = numero;
		this.dataContrato = dataContrato;
		this.valorTotal = valor;
		this.qtdParcelas = qtd;
		this.pagamento = new Paypal();
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getQtdParcelas() {
		return qtdParcelas;
	}

	public void setQtdParcelas(int qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}
	

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		if(pagamento == "paypal".toLowerCase()) {
			this.pagamento = new Paypal();
		}else if(pagamento == "mercado pago".toLowerCase()) {
			this.pagamento = new MercadoPago();
		}else {
			throw new IllegalArgumentException("Forma de pagamento inválida!");
		}
	}


	public String calendario(Date dataContrato, int i) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataContrato);
		calendar.add(Calendar.MONTH, i);
		return sdf.format(calendar.getTime());
	}
	
	public void gerarParcelas() {
		for(int i = 1; i<= qtdParcelas; i++) {
			double valor = pagamento.calcularTaxa(qtdParcelas, valorTotal, i);
			System.out.println(calendario(dataContrato, i));
			System.out.printf(": R$%.2f\n", valor);
		}
	}
}
