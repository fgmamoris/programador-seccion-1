/*
 * Crear un programa que solicite la dimensión del vector al usuario
 * El usuario deberá cargar los datos de dicho vector de forma dinámica
 * Imprimir el vector generado
 */
package programador.vectordinamico;

import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
public class VectorDinamico {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dimensionVector;
        System.out.println("Bienvenido");
        System.out.println("Ingresar cantidad de elementos del vector");
        dimensionVector = scan.nextInt();
        int vectorDinamico[] = new int[dimensionVector];
        System.out.println("Ingresar los elementos del vector, los mismos deberán ser del tipo entero");
        for (int i = 0; i < vectorDinamico.length; i++) {
            vectorDinamico[i] = scan.nextInt();
        }
        System.out.println("Los datos ingresados en el vector son los siguientes:");
        for (int i = 0; i < vectorDinamico.length; i++) {
            System.out.println("Vector Dinámico[" + i + "]: " + vectorDinamico[i]);

        }
    }

}
