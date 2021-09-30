/*
 * Realizar un programa en el cual se le solicite al usuario :
 * Nombre
 * Apellido
 * DNI
 * Año de Nacimiento
 * Luego de ingresar los datos por consola, calcular la edad del usuario e imprimir.
 
 * and open the template in the editor.
 */
package programador.ejercitacion.ejercicio5;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresar Nombre: ");
        String nombre = scan.nextLine();
        System.out.print("Ingrese Apellido: ");
        String apellido = scan.nextLine();
        System.out.print("Ingrese DNI: ");
        int dni = scan.nextInt();
        scan.nextLine();
        System.out.print("Ingrese año de nacimiento: ");
        int anio = scan.nextInt();
        scan.nextLine();
        System.out.println("----Bienvenido/a----");
        System.out.println("Los datos ingresados son los siguientes:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + dni);
        Date d = new Date();
        Calendar c = new GregorianCalendar();
        c.setTime(d);
        System.out.println("Edad: " + (c.get(Calendar.YEAR) - anio));

    }

}
