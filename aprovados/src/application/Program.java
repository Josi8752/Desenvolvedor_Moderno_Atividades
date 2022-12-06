package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");
		int N = sc.nextInt();
		String[] aluno = new String[N];
		double[] note1 = new double[N];
		double[] note2 = new double[N];
		double [] media = new double[N] ;
		for (int i = 0; i < N; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
			sc.nextLine();
			aluno[i] = sc.nextLine();
			note1[i] = sc.nextDouble();
			note2[i] = sc.nextDouble();
					}
		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < N; i++) {
			media[i] = (note1[i] + note2[i]) / 2;

			if (media[i] >= 6.0) {
				System.out.println(aluno[i]);
			}
		
		}
		sc.close();
	}

}
