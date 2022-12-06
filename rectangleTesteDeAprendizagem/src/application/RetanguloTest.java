package application;

import java.util.Locale;
import java.util.Scanner;

import entities.RectangleTest;

public class RetanguloTest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		RectangleTest rec = new RectangleTest();
		
		System.out.println("Entre com a largura e altura do retângulo: ");
		rec.width = sc.nextDouble();
		rec.heigth = sc.nextDouble();
		double area = rec.area();
		double perimetro = rec.perimeter();
		double diagonal = rec.diagonal();
		System.out.printf("AREA = %.2f\n ",area);
		System.out.printf("PERIMETRO = %.2f\n ",perimetro);
		System.out.printf("DIAGONAL = %.2f\n ",diagonal);
		
sc.close();

	}

}
