package java_basico;
import java.util.Scanner;
public class ejercicio6 {

	public static void main(String[]  args) {
		
		Scanner read = new Scanner(System.in);
		System.out.println("Ingrese la horas trabajadas");
		int horas = read.nextInt();
		int precio = 3000;
		int aumento = 0;
		int total = 0;
		for (int i = 0; i <= horas; i++) {
			aumento = i;
			total = aumento * precio;
		}
		
		System.out.println("Horas trabajadas: " + horas);
		System.out.println("Tu pago es de: " + total);
	
		if(total < 25) {
			System.out.println("Ganaste muy poquito");
		}else {
			System.out.println("Ganaste muy bien ");
		}
	}

}
