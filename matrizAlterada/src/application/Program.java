package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a ordem da matriz? ");
		Integer n = sc.nextInt();

		double[][] mat = new double[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Elemento[" + i + "," + j + "]: ");
				mat[i][j] = sc.nextDouble();
			}
		}

		System.out.println();
		System.out.println();
		double soma = 0.0;

		System.out.print("SOMA DOS POSITIVOS: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] > 0) {
					soma += mat[i][j];
				}
			}
		}
		System.out.print(soma + " ");

		System.out.println();
		System.out.println();
		int linhaQuant = 0;

		System.out.print(" Escolha uma linha: ");
		linhaQuant = sc.nextInt();

		System.out.print("LINHA ESCOLHIDA:  ");

		for (int i = 2; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (linhaQuant == 0) {
					System.out.print(mat[0][j] + "  ");
				}
				if (linhaQuant == 1) {
					System.out.print(mat[1][j] + "   ");
				} else {
					System.out.print(mat[2][j] + "   ");
				}
			}
		}
		System.out.println();
		System.out.println();

		int colunaQuant = 0;

		System.out.print(" Escolha uma coluna: ");
		colunaQuant = sc.nextInt();

		System.out.print("COLUNA ESCOLHIDA:  ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 2; j < mat[i].length; j++) {
				if (colunaQuant == 0) {
					System.out.print(mat[i][0] + "   ");
				}
				if (colunaQuant == 1) {
					System.out.print(mat[i][1] + "   ");
				} else {
					System.out.print(mat[i][2] + "   ");
				}
			}
		}

		System.out.println();
		System.out.println();
		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + "  ");
		}
		System.out.println();
		System.out.println();
		System.out.println("MATRIZ ALTERADA: ");

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					mat[i][j] *= mat[i][j];

				}

			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%.1f ", mat[i][j]);
			}
			System.out.println();
		}

		sc.close();
	}

}
