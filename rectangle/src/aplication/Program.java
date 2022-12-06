package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program { 
public static void main(String[] args) { 
 Locale.setDefault(Locale.US);
 Scanner sc = new Scanner (System.in);
 
 Rectangle rec = new Rectangle();
 
 System.out.println("Entre com a largura e altura do retângulo:");
 rec.width = sc.nextDouble();
 rec.heigth = sc.nextDouble();
 double area = rec.area(); 
 double perimetro = rec.perimeter(); 
 double diagonal = rec.diagonal(); 
 System.out.printf("Area = %.2f\n",area);
 System.out.printf("Perimetro = %.2f\n",perimetro);
 System.out.printf("diagonal = %.2f\n",diagonal);
 
 sc.close(); 
 } 
}