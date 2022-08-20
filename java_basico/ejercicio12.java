package java_basico;

import javax.swing.JOptionPane;

public class ejercicio12 {

    public static void main(String arg[])
    {
        int cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes"));
        int i=0;
        do {
            JOptionPane.showMessageDialog(null, "Estudiante "+(i+1));
            //
            String nombre=JOptionPane.showInputDialog("Ingrese su nombre");
            double n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 1"));
            double n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 2"));
            double n3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 3"));
           
            double prom=(n1+n2+n3)/3;
            System.out.println(nombre+" El promedio es: "+prom);
           
            if (prom>=3.5) {
                System.out.println("Gana la materia");
            }else {
                System.out.println("Pierde la materia");
               
                if (prom>=2.5) {
                    System.out.println("Puede recuperar");
                }else {
                    System.out.println("No puede recuperar.");
                }            
            }
            //    
            System.out.println("******************************");
            System.out.println();
            i++;
        } while (i<cant);
       
       
       
       
    }
   
}