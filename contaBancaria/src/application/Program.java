package application;

import java.util.Locale;
import java.util.Scanner;

import utilites.Accout;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Accout accout;

		System.out.print("Enter accout number: ");
		int number = sc.nextInt();
		System.out.print("Enter accout holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit(y/n): ");
		char initialDep = sc.next().charAt(0);

		if (initialDep == 'y') {
			System.out.print("Enter initial deposit value: ");
			double valueDepInitial = sc.nextDouble();
			accout = new Accout(number, holder, valueDepInitial);
		}
		else {
			accout = new Accout(number, holder);
		}

		System.out.println();
		System.out.println("Accout data: ");
		System.out.print(accout);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		accout.deposit(depositValue);
		System.out.println("Updated accout date: ");
		System.out.println(accout);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double depositwith = sc.nextDouble();
		accout.withdraw(depositwith);
		System.out.println("Updated accout date: ");
		System.out.println(accout);
		sc.close();
	}

}
