package appliction;

import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeTest;

public class FuncionariosTest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		EmployeeTest emp = new EmployeeTest();

		
		
		
		System.out.print("Nome: ");
		emp.name = sc.nextLine();
		System.out.print("Sal�rio bruto: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Imposto: ");
		emp.tax = sc.nextDouble();
		System.out.print("Funcion�rio: " + emp);
		System.out.println("Qual a porcentagem para aumentar o sal�rio? ");
		double porcentagem = sc.nextDouble();
		emp.increaseSalary(porcentagem);
		System.out.print("Dados atualizados: " + emp);
		sc.close();
	}

}
