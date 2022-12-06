package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int N = sc.nextInt();

		int[] A = new int[N];
		int[] B = new int[N];
		int result = 0;

		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
			System.out.println("Digite os valores do vetor B: ");
			for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for (int i = 0; i < N; i++) {
			result = A[i] + B[i];
			System.out.println(result);
		}

		sc.close();
	}

}
