/*
 * Crear un Programa que calcule los aumentos de sueldo de los empleados dependiendo el área en donde se desarrollan.
 * Solicitar el nombre apellido del empleado  luego mostrar opciones para que seleccione el área y la categoría.
 * Realizar el calculo del aumento de sueldo que le corresponde.
 * imprimir la ficha del empleado con :
 * Nombre
 * Fecha de Nacimiento
 * Área
 * Categoría
 * Años de antigüedad
 * Sueldo actual
 * Porcentaje de aumento
 * Sueldo con el aumento

Nota : los datos deben solicitarse o darle opción a que los seleccione 


Categoría    Aumento
A                     18%
B                      12%
C                       9%
D                       6%
 */
package programador.sueldoconswitch;

import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
public class EjercicioSueldoConSwitch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingresar nombre completo:");
        String nombreCompleto = scan.nextLine();
        System.out.println("Ingresar fecha de nacimiento: dd/mm/aaaa");
        String fechaNacimiento = scan.nextLine();
        System.out.println("Ingresar area de trabajo:");
        String area = scan.nextLine();
        System.out.println("Ingresar categoria actual:[A,B,C,D]");
        char categoria = scan.next().charAt(0);
        System.out.println("Ingresar años de antiguedad (en número): ");
        int antiguedad = scan.nextInt();
        System.out.println("Ingresar sueldo actual:");
        double sueldo = scan.nextLong();
        int aumento = 0;

        switch (categoria) {
            case 'A':
                aumento = 18;
                break;
            case 'B':
                aumento = 12;
                break;
            case 'C':
                aumento = 9;
                break;
            case 'D':
                aumento = 6;
                break;
            default:
                System.out.println("Debe ingresar una categoria válida");
        }
        if (aumento != 0) {
            System.out.println("-------------- Ficha del empleado -------------");
            System.out.println("Nombre y apellido: " + nombreCompleto);
            System.out.println("Fecha de nacimiento: " + fechaNacimiento);
            System.out.println("Área: " + area);
            System.out.println("Categoría: " + categoria);
            System.out.println("Años de antiguedad: " + antiguedad);
            System.out.println("Sueldo actual: " + sueldo);
            System.out.println("Porcentaje de aumento: " + aumento + "%");
            System.out.println("Sueldo con aumento: " + String.format("%.2f", (sueldo * (1 + aumento / 100d))));
        } else {
            System.out.println("Ha ingresado al menos un dato inválido");
        }
    }
}
