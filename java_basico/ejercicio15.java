package java_basico;
import java.util.Scanner;

public class Ejercicio15 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		System.out.print("Nombre completo: ");
		String nombre= read.next();
		
		Scanner read1 = new Scanner(System.in);
		System.out.print("apellido completo: ");
		String apellido = read1.next();
		
		Scanner read2 = new Scanner(System.in);
		System.out.print("Documento: ");
		int document = read2.nextInt();
		
		Scanner read3 = new Scanner(System.in);
		System.out.print("Edad: ");
		int edad = read3.nextInt();
		
		Scanner read4 = new Scanner(System.in);
		System.out.print("Profesion: ");
		String profesion = read4.next();
		
	System.out.println("Datos ingresados");
	System.out.println("Nombre completo: "+ nombre+"\n"+ " Apellido: "+apellido + "\n"+" Documento: "+ document
	+ "\n"+"  edad: " + edad +"\n"+ " profesion: "+ profesion+"\n");
	System.out.println("Bienvenido!!!");
	}
}
