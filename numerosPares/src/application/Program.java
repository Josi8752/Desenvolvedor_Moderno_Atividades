package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		int[] number = new int[N];
		int cont = 0;
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			number[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("NUMEROS PARES: ");
		for (int i = 0; i < N; i++) {
			if (number[i] % 2 == 0) {
				cont = cont + 1;
				System.out.print(number[i]+" ");
			}
		}
		System.out.println();
		System.out.print("QUANTIDADE DE PARES = " + cont);
		sc.close();
	}

}
