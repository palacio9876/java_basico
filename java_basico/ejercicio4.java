package java_basico;
import java.util.Scanner;
public class ejercicio4 {

	public static void main(String[] args) {
		
		Scanner  imprimir = new Scanner(System.in);
		System.out.println("Ingrese su salario");
		double salario = imprimir.nextDouble();
		
		double porcentaje = 25;
		 double calcular = salario * porcentaje / 100;
		 double suma = salario + calcular;
		System.out.println("Precio Antiguo. " + salario);
		System.out.println("Aumento. " + calcular);
		System.out.println("Salario total:  " + suma);
		
		if(suma > 1000000) {
			
			System.out.println("te pagan bien");
		}else {
			
			System.out.println("Te pagan mal");
		}
	}
}
