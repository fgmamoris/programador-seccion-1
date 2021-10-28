/*
 * Realizar un programa que contenga 3 vectores estáticos con la siguiente informacion :
 * -Nombre
 * -Edad
 * -Sexo
 * Cargar los tres vectores con datos (5 usuarios) y recorrer los 3 vectores, para imprimir el listado de usuarios por consola.
 * 
 */
package programador.ejercitacion.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        String nombre[] = new String[5];
        String sexo[] = new String[5];
        int edad[] = new int[5];
       
        Scanner sc = new Scanner(System.in);
        int indice = 0;
        do {
            System.out.println("Por favor Ingrese el nombre del user:");
            nombre[indice] = sc.nextLine();
            System.out.println("Por favor Ingrese el sexo:[M-F-B]");
            sexo[indice] = sc.nextLine();
            System.out.println("Por favor Ingrese la edad:");
            edad[indice] = sc.nextInt();
            sc.nextLine();
            indice++;
        } while (indice != 5);
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("Los datos ingresados son los siguientes");
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("**************************");
            System.out.println("User n°: " + i);
            System.out.println("Nombre:  " + nombre[i]);
            System.out.println("Sexo:    " + sexo[i]);
            System.out.println("Edad:    " + edad[i]);
            System.out.println("**************************");
        }
        System.out.println("---------------------------------------");
    }
}
