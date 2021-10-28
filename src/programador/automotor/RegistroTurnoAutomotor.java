/*
 * Se solicita hacer un sistema para sacar turnos en un centro de servicios para el automovil.
 * se debe solicitar al clientes :
 * Nombre del Clientes, DNI y dominio del vehículo
 * Solicitar al cliente permitir seleccionar:
 * Cambio de neumáticos
 * Cambio de aceite
 * Pastillas de frenos 
 * Alineación 
 * Balanceo
 * Imprimir el turno al cliente con detalle con los servicios seleccionados y la información del cliente
//Imprimir ticket
        System.out.println("==================================");
        System.out.println("======== Bienvenido ==============");
        System.out.println("Centro Servicios  CFP N°36");
        System.out.println("Zavaleta 204, C1437EYF, CABA");
        System.out.println("==================================");
        System.out.println("Nombre del Cliente "   + cliente);
        System.out.println("DNI del cliente  "     + dni);
        System.out.println("Marca del Vehiculo " + nmarca);
        System.out.println("Dominio del Vehiculo " + dominio);
        System.out.println("==================================");
        System.out.println("Servicios :"   + nservicio);
        System.out.println("==================================");
 * 
 */
package programador.automotor;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
public class RegistroTurnoAutomotor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("======== Bienvenido ==============");
        System.out.println("Centro Servicios  CFP N°36");
        System.out.println("Zavaleta 204, C1437EYF, CABA");
        System.out.println("Ingrese su nombre: ");
        String cliente = sc.next();

        String dni;
        do {
            System.out.println("Ingrese su DNI: ");
            dni = sc.next();
            sc.nextLine();
            if (dni.length() < 8 || dni.length() > 8) {
                System.out.println("Error al ingresar el dni");
            }
        } while (dni.length() != 8);
        System.out.println("Ingrese la marca del vehiculo");
        String marca = sc.nextLine();
        int numeroDeDominio = 0;
        System.out.println("Ingrese el dominio del vehiculo (solo números)");
        numeroDeDominio = sc.nextInt();
        sc.nextLine();
        ArrayList<String> servicios = new ArrayList<>();
        int minimo = 0;
        int quit = 0;
        do {
            System.out.println("Seleccione el servicio que desea solicitar");
            System.out.println("1 - Cambio de neumáticos");
            System.out.println("2 - Cambio de aceite");
            System.out.println("3 - Pastillas de frenos ");
            System.out.println("4 - Alineación");
            System.out.println("5 - Balanceo");
            System.out.println("0 - Para salir");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    if (minimo == 0) {
                        System.out.println("Debe ingresar al menos un servicio!!!");
                    } else {
                        quit = 1;
                    }
                    break;
                case 1:
                    if (servicios.contains("Cambio de neumáticos")) {
                        System.out.println("El servicio ya se encuentra solicitado");
                    } else {
                        servicios.add("Cambio de neumáticos");
                        System.out.println("Servicio Cambio de neumáticos Agregado!");
                        minimo = 1;
                    }

                    break;
                case 2:
                    if (servicios.contains("Cambio de aceite")) {
                        System.out.println("El servicio ya se encuentra solicitado");
                    } else {
                        servicios.add("Cambio de aceite");
                        System.out.println("Servicio Cambio de aceite Agregado!");
                        minimo = 1;
                    }

                    break;

                case 3:
                    if (servicios.contains("Pastillas de frenos")) {
                        System.out.println("El servicio ya se encuentra solicitado");
                    } else {
                        servicios.add("Pastillas de frenos");
                        System.out.println("Servicio Pastillas de frenos Agregado!");
                        minimo = 1;
                    }
                    break;
                case 4:
                    if (servicios.contains("Alineación")) {
                        System.out.println("El servicio ya se encuentra solicitado");
                    } else {
                        servicios.add("Alineación");
                        System.out.println("Servicio Alineación Agregado!");
                        minimo = 1;
                    }

                    break;
                case 5:
                    if (servicios.contains("Balanceo")) {
                        System.out.println("El servicio ya se encuentra solicitado");
                    } else {
                        servicios.add("Balanceo");
                        System.out.println("Servicio Balanceo Agregado!");
                        minimo = 1;
                    }
                    break;

                default:
                    System.out.println("Por favor ingrese una opción válida");
                    if (minimo == 1 && opcion == 0) {
                        quit = 1;
                    }
            }

        } while (quit != 1);

        System.out.println("==================================");
        System.out.println("TICKET DE COMPRA N° " + (int) (Math.random() * 2147483647 + 1));
        System.out.println("Centro Servicios  CFP N°36");
        System.out.println("Zavaleta 204, C1437EYF, CABA");
        System.out.println("==================================");
        System.out.println("Nombre del Cliente:   " + cliente);
        System.out.println("DNI del cliente:      " + dni);
        System.out.println("Marca del Vehiculo:   " + marca);
        System.out.println("Dominio del Vehiculo: " + numeroDeDominio);
        System.out.println("==================================");
        for (int i = 0; i < servicios.size(); i++) {
            System.out.println("Servicio n° " + (i + 1) + ": " + servicios.get(i));
        }
        System.out.println("==================================");

    }
}
