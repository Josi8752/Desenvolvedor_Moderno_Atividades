package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a quantidade de linhas da matriz? ");
		Integer m = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		Integer n = sc.nextInt();

		Double[][] mat = new Double[m][n];
		double[] vet = new double[m];

		for (int i = 0; i < m; i++) {
			System.out.println("Digite os elementos da " + (i + 1) + "a. linha:");
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextDouble();

			}
		}

		double somaLinha;
		for (int i = 0; i < m; i++) {
			somaLinha = 0.0;
			for (int j = 0; j < n; j++) {
				somaLinha = somaLinha + mat[i][j];
			}
			vet[i] = somaLinha;
		}
		
		System.out.println("VETOR GERADO: ");
		for (int i = 0; i < m; i++) {
			System.out.printf("%.1f\n", vet[i]);
		}

		sc.close();
	}
}
