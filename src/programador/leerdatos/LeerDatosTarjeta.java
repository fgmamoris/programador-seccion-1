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
public class LeerDatosTarjeta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
// TODO code application logic here
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingrese su telefono");
        String telefono = leer.nextLine();
        System.out.println("Ingrese su peso");

        int peso = leer.nextInt();
        Random rand = new Random();
        int numeroSocio = rand.nextInt();
        System.out.println("---------- Bienvenido ----------");
        System.out.println("| Su número de socio es: " + numeroSocio);
        System.out.println("| Nombre: " + nombre);
        System.out.println("| telefono: " + telefono);
        System.out.println("| peso: " + peso + " KG");
        System.out.println("---------------------------------");
    }

}
