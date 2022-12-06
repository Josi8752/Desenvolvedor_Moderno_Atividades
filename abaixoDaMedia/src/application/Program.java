package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);
	
System.out.print("Quantos elementos vai ter o vetor? ");
int N = sc.nextInt();

double[] n = new double [N];
double soma = 0;
double media = 0;
for (int i = 0; i<N;i++) {
	System.out.print("Digite um numero: ");
n[i] = sc.nextDouble();
soma = soma + n[i];
}
System.out.println();
media = soma /N;
System.out.printf("MEDIA DO VETOR = %.3f\n", media);
System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
for (int i = 0; i<N;i++) {
	if (n[i] < media) {
		System.out.println(n[i]);
	}
}

sc.close();
	}

}
