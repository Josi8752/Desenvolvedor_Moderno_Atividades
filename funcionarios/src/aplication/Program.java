package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Emplyee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		Emplyee emp = new Emplyee();
		
		System.out.println("Nome: ");
		emp.name = sc.nextLine();
		System.out.println("Salário bruto: ");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Imposto: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionário: "+ emp);
		System.out.println("Qual a porcentagem para aumentar o salário? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println("Dados atualizados: "+emp);
		sc.close();
	}

}
