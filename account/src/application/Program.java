package application;

import java.util.Locale;
import java.util.Scanner;

import utilities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account account ;
		
		System.out.print("Enter account number: ");
int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit(y/n) ");
		char initial = sc.next().charAt(0);
		
		if (initial == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account( accountNumber, holder,  initialDeposit);
		
			}
		else {
			 account = new Account( accountNumber, holder);
			
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		System.out.println();
		 System.out.print("Enter a deposit value: ");
		  double update= sc.nextDouble();
		 System.out.println("Updated account data: ");
		 account.deposit(update);
		 System.out.println(account);
		 System.out.println();
		
		System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
		System.out.println("Updated account data: ");
		account.withdraw(withdraw);
		System.out.println(account);
		System.out.println();
			
	
		sc.close();
	
	}
	}

