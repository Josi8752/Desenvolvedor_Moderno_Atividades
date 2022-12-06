package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Champion champion ;
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		champion = new Champion( name, life,attack, armor);
		
		System.out.println();
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String name2 = sc.nextLine();
		sc.nextLine();
		System.out.print("Vida inicial: ");
		int life2 = sc.nextInt();
		System.out.print("Ataque: ");
		int attack2 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor2 = sc.nextInt();
		champion = new Champion( name2, life2,attack2, armor2);
		
		System.out.println();
		System.out.println("Quantos turnos você deseja executar? ");
	      int n = sc.nextInt();
		System.out.println();
		for ( int i = 0; n < i; i++) {
			 champion.tackDamage(champion);
			champion.tackDamage(champion);
			
			System.out.printf("Resultado do turno: ", i + 1);
			System.out.println(champion.status());
			
			System.out.println(champion.status());
		}
		if (champion.getLife() <= 0) {
			
			System.out.println("FIM DO COMBATE");
		}
		champion.status();
sc.close();
	}

}
