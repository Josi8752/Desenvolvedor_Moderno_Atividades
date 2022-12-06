package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Student stud = new Student();
		
		stud.name = sc.nextLine();
		stud.note1 = sc.nextDouble();
		stud.note2 = sc.nextDouble();
		stud.note3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL: %.2f\n",stud.endNote());
		if (stud.endNote() < 60.0) {
			 System.out.println("REPROVADO");
			 System.out.printf("FALTAM %.2f PONTOS\n",stud.situationStudent());
			}
		else {
			 System.out.println("APROVADO");
		}
sc.close();
	}

}
