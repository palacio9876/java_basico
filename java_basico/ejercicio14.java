package java_basico;

import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		
		System.out.println("area de un triangulo ");
		Scanner read = new Scanner(System.in);
		System.out.print("Ingrese la base: ");
		double base = read.nextDouble();
		
		Scanner read2 = new Scanner(System.in);
		System.out.print("Ingrese la altura: ");
		double altura = read.nextDouble();
		int fxy = 10;
		System.out.println("El area del triangulo es: "+ (base*altura/2));
	}
/*
	int a, b,c;
	c = 8;
	a = 2;
	b = -2;
	c = (a*b)+2;
	a = a-2 + b * ( b + 3 )-c ;
	b = c;
	
	System.out.println( "c = "+ b);
}
	
	*/
	
}
