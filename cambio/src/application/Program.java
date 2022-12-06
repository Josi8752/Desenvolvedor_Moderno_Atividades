package application;

import java.util.Locale;
import java.util.Scanner;

import utilities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o valor do d�lar? ");
		CurrencyConverter.valueDollar = sc.nextDouble();
		System.out.print("Quantos d�lares ser�o comprados? ");
		CurrencyConverter.shopping = sc.nextDouble();
		System.out.printf("Valor a ser pago em reais: %.2f\n ", CurrencyConverter.aux());
		sc.close();
	}

}
