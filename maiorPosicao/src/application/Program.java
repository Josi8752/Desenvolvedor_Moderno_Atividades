package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);
	
	System.out.print("Quantos numeros voce vai digitar? ");
int N = sc.nextInt();
double[] number = new double [N];

for(int i =0; i < N; i++) {
System.out.print("Digite um numero: ");	
 number[i] = sc.nextDouble();
}
System.out.println();
System.out.print("MAIOR VALOR = ");
for(int i = 0; i< N; i++) {
if (number[i] > 13 ) {
	double maior = i;
	System.out.println(number[i]);
	System.out.print("POSICAO DO MAIOR VALOR = "+ i);
}	


}

sc.close();
	}

}
