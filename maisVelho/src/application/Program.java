package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int N = sc.nextInt();
		String[] name = new String[N];
		int[] idade = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			sc.nextLine();
			System.out.print("Nome : ");
			name[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		String maisVelho = "";
		for (int i = 0; i < N; i++) {
			if (idade[i] > 21) {
				maisVelho = name[i];
			}
		}
		System.out.print("PESSOA MAIS VELHA: " + maisVelho);
		sc.close();
	}

}
