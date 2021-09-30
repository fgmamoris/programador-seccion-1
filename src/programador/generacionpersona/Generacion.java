/*
 * Ejercicio, hacer un algoritmo que indique la generación en base al año 
 * de nacimiento ingresado
 */
package programador.generacionpersona;

import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
public class Generacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int seleccion = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese su año de nacimiento:");
            System.out.println("Para finalizar el programa ingrese 0");
            seleccion = sc.nextInt();
            System.out.flush();
            if (seleccion >= 1930 && seleccion <= 1948) {
                System.out.println("Usted es de la generacion: Silent Generation");
            } else if (seleccion >= 1949 && seleccion <= 1968) {
                System.out.println("Usted es de la generación: Baby Boom");
            } else if (seleccion >= 1969 && seleccion <= 1980) {
                System.out.println("Usted es de la generacion: X");
            } else if (seleccion >= 1981 && seleccion <= 1993) {
                System.out.println("Usted es de la generacion: Y");
            } else if (seleccion >= 1994 && seleccion <= 2010) {
                System.out.println("Usted es de la generacion: Z");
            } else if (seleccion >= 2011) {
                System.out.println("No hay generación para su año de nacimiento");
            } else if (seleccion > 0 && seleccion < 1930) {
                System.out.println("Usted es un dinosario!!!!");
            } else if (seleccion == 0) {
                System.out.println("Usted es Jesucristo");
            } else {
                System.out.println("Fecha incorrecta");
            }
        } while (seleccion != 0);
        System.out.println(
                "Programa finalizado");
        sc.close();
    }
}
