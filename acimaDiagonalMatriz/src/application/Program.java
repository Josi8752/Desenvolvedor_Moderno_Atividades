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
		int soma = 0;
		int auxSoma = 0;
		for (int i = 0; i < mat.length; i++) {
			soma += mat[i][i];
			for (int j =0 ; j <mat[i].length; j++) {
	auxSoma = soma + mat[i][3]; 
}
			
		}
		System.out.print("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = "+auxSoma);
		sc.close();
	}

}
