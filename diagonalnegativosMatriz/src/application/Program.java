package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a ordem da matriz? ");
		Integer n = sc.nextInt();
		Integer[][] mat = new Integer[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.printf("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}

		}
		System.out.println("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i]+" ");
		}
System.out.println();
		Integer cont = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					cont += 1;
				}
			}
		}

		System.out.print("QUANTIDADE DE NEGATIVOS = " + cont);

		sc.close();
	}
}
