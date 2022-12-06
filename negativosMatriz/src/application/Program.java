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

	int [][] mat = new int [m][n];
	
	for (int i =0; i < mat.length; i++) {
		for(int j =0; j<mat[i].length; j++) {
			System.out.print("Elemento["+ i +","+j +"]: ");
		mat[i][j] = sc.nextInt();
		}	
	}
	System.out.println("VALORES NEGATIVOS: ");
	for (int i =0; i < mat.length; i++) {
		for(int j =0; j<mat[i].length; j++) {
			if(mat[i][j] < 0) {
				System.out.println(mat[i][j]);
			}
		}	
	}
	sc.close();
	}

}
