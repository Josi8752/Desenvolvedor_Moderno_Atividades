package application;

import java.util.Locale;
import java.util.Scanner;

import model.Exceptions.DomainExceptions;
import model.entities.Account;

public class Program {

	public static void main(String[] args) throws DomainExceptions {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
		System.out.println("Enter account data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double initBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, initBalance, withdrawLimit);
		System.out.print("Enter amount for withdraw: ");
		 Double amount = sc.nextDouble();
		 account.withdraw(amount);
		 account.deposit(amount);
		}
		catch (DomainExceptions e){
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
