/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programador.leerdatos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
public class LeerDatosEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = leer.nextLine();
        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();
        System.out.println("Ingrese su año");
        int anio = leer.nextInt();
        //leer.nextLine(); 
        System.out.println("Ingrese su estado civil");
        String estado = leer.nextLine();
        System.out.println("---------- Bienvenido ----------");
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(anio);
        System.out.println(estado);
        System.out.println((edad >= 18) ? (nombre + " Felicitaciones podes tomar alcohol") : (nombre + " No podes tomar alcohol hasta que cumplas 18"));
        System.out.println("---------------------------------");
    }

}
