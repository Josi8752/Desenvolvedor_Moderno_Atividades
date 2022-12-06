package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print(" Quantas pessoas serao digitadas? ");
		int N = sc.nextInt();

		String[] name = new String[N];
		int[] idade = new int[N];
		double[] altura = new double[N];

		for (int i = 0; i < N; i++) {
			System.out.println("Dados da " + (i + 1) + "a" + " pessoa:");
			sc.nextLine();
			System.out.print("Nome: ");
			name[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}

		double soma = 0;
		double media = 0;

		for (int i = 0; i < N; i++) {
			soma += altura[i];
			media = soma / N;
		}
		System.out.printf("Altura média: %.2f\n ", media);
		int cont = 0;
		for (int i = 0; i < N; i++) {
			if (idade[i] < 16) {
				cont = cont + 1;
			}
		}

		System.out.print("Pessoas com menos de 16 anos: ");

		double porcentagem = (cont * 100) / N;
		System.out.print(porcentagem + "%\n");
		for (int i = 0; i < N; i++) {
			if (idade[i] < 16) {
				System.out.println(name[i]);
			}
		}
		sc.close();
	}
}
