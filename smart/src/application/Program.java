package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String name;
		int data1, data2, classe, idade;
		double valorDiarioLocacao;

		System.out.print(" Qual o nome do cliente? ");
		name = sc.nextLine();
		System.out.print("Idade do cliente? ");
		idade = sc.nextInt();
		System.out.print("Qual o valor da diária  da locação? ");
		valorDiarioLocacao = sc.nextDouble();
		System.out.print("Qual a classe do veículo? ");
		classe = sc.nextInt();
		System.out.print("Data de  inicial: ");
		data1 = sc.nextInt();
		System.out.println("Qual a data de entrega: ");
		data2 = sc.nextInt();

		valorDiarioLocacao = (data2 - data1) * valorDiarioLocacao;
		System.out.print("O valor final da locacao é = "+valorDiarioLocacao);
sc.close();
	}

}
