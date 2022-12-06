package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a ordem da matriz? ");
		Integer n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		int maior = 0;
		System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == 10) {
					maior = mat[i][j];
				}
			}
		}
		System.out.println(maior);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] > maior) {
					System.out.println(mat[i][j]);
				}
			}
		}
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					if (mat[i][j] == 9) {
						System.out.println(mat[i][j]);
					}
				}
			}
		

		sc.close();
	}

}
