package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int N = sc.nextInt();

		int[] number = new int[N];
		double mediaPar = 0;
		int soma = 0;
		int cont = 0;

		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			number[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			if (number[i] % 2 == 0) {
				cont = cont + 1;
				soma = soma + number[i];
				mediaPar = soma / cont;
			}
		}
		if (mediaPar > 0)
		System.out.println("MEDIA DOS PARES = " + mediaPar);

		else {
			System.out.println("NENHUM NUMERO PAR ");
		}

		sc.close();
	}
}