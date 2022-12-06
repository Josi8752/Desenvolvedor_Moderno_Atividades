package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Serao digitados dados de quantos produtos? ");
		int n = sc.nextInt();
		String[] name = new String[n];
		double[] pricePurchase = new double[n];
		double[] priceSale = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Produto " + (i + 1) + ": ");
			sc.nextLine();
			System.out.print("Nome: ");
			name[i] = sc.nextLine();
			System.out.print("Preco de compra: ");
			pricePurchase[i] = sc.nextDouble();
			System.out.print("Preco de venda: ");
			priceSale[i] = sc.nextDouble();
		}
		System.out.println();
		System.out.println("RELATORIO:");
		
		int cont = 0;
		double soma = 0;
		double somaVenda = 0;
		int maior= 0;
		for (int i = 0; i < n; i++) {
			soma = soma + pricePurchase[i];  
		   somaVenda = somaVenda + priceSale[i];
			if (pricePurchase[i] * 0.1 == 1) {
				cont = cont + 1;
				 maior = 1 ;
			}
		}
		System.out.print("Lucro abaixo de 10%:  "+ cont);
		System.out.println();
		System.out.print("Lucro entre de 10% e 20%: ");
		for (int i = 0; i < n; i++) {
			if (pricePurchase[i] * 0.1 > 1 && pricePurchase[i] * 0.2 > 2) {
				cont = cont + 1;
				System.out.print(cont);
			}
			
			 
		}
		System.out.println();
		System.out.print("Lucro acima  20%: "+ maior);
		System.out.println();
		double lucro = 0;
		
			lucro =  somaVenda - soma;

		System.out.printf("Valor total de compra: %.2f\n ", soma);
		System.out.printf("Valor total de venda: %.2f\n ", somaVenda);
		System.out.printf("Lucro total: %.2f\n", lucro);

		sc.close();
	}

}
