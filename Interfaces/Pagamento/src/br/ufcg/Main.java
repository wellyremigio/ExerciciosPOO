package br.ufcg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Número: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Data: ");
		Date data = sdf.parse(sc.nextLine());
		System.out.println("Valor: ");
		double valor = sc.nextDouble();
		System.out.println("Qtd de parcelas: ");
		int qtd = sc.nextInt();
		
		Contrato c1 = new Contrato(numero, data, valor, qtd);
		System.out.println("---Paypal---");
		c1.gerarParcelas();
		System.out.println("----------");
		c1.setPagamento("mercado pago");
		System.out.println("--Mercado Pago--");
		c1.gerarParcelas();

		
	}

}
