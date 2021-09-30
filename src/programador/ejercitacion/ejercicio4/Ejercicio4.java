/*
 * Realizar un programa que resuelva los condicionales que se encuentran 
 * en los diagramas de flujo
 */
package programador.ejercitacion.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int seleccion = 0;
        boolean haceSol, nevado;
        int temperatura;

        try (Scanner sc = new Scanner(System.in)) {

            do {
                System.out.println("Seleccione un ejercicio, a fin de verificar el resultado");
                System.out.println("Ejercicio [1,2,3,4,5,6,7,8,9,10]");
                System.out.println("Para finalizar el programa ingrese 0");
                seleccion = sc.nextInt();
                System.out.flush();
                switch (seleccion) {
                    // declaración case
                    // los valores deben ser del mismo tipo de la expresión
                    case 0:
                        break;
                    case 1:
                        temperatura = 27;
                        if (temperatura > 25) {
                            System.out.println("A la Playa!!!");
                        }
                        break;
                    case 2:
                        haceSol = true;
                        if (haceSol == true) {
                            System.out.println("No te olvides la sombrilla");
                        }
                        break;
                    case 3:
                        haceSol = true;
                        nevado = true;
                        if (nevado == true || haceSol == true) {
                            System.out.println("Que bien!!");
                        }
                        break;
                    case 4:
                        temperatura = 29;
                        nevado = true;
                        if ((nevado && temperatura >= 20) && temperatura <= 30) {
                            System.out.println("No me lo creo");
                        }
                        break;
                    case 5:
                        temperatura = 32;
                        haceSol = true;
                        if (temperatura < 0 || (temperatura > 30 && haceSol)) {
                            System.out.println("Mejor me quedo en casa");
                        }
                        break;
                    case 6:
                        temperatura = 32;
                        if (temperatura > 25) {
                            System.out.println("A la playa!!!");
                        }
                        break;
                    case 7:
                        temperatura = 10;
                        if (temperatura <= 25) {
                            System.out.println("Esperando el buen tiempo..-");

                        }
                        break;
                    case 8:
                        temperatura = 10;
                        if (temperatura > 25) {
                            System.out.println("A la playa");

                        } else {
                            System.out.println("Esperando al buen tiempo...");
                        }

                        break;
                    case 9:
                        temperatura = 10;
                        nevado = false;
                        if (temperatura > 25) {
                            System.out.println("A la playa!!");
                        } else {
                            if (temperatura > 15) {
                                System.out.println("A la montaña");
                            } else {
                                if (temperatura < 5 && nevado) {
                                    System.out.println("A esquiar!!!");
                                } else {
                                    System.out.println("A dormir");
                                }
                            }
                        }
                        break;
                    case 10:
                        temperatura = 10;
                        if (temperatura < 15) {
                            if (temperatura < 5) {
                                System.out.println("A esquiar!!");
                            } else {
                                System.out.println("A dormir..zzz!");
                            }

                        } else {
                            if (temperatura > 25) {
                                System.out.println("A la playa!!!");
                            } else {
                                System.out.println("A la montaña");
                            }
                        }

                        break;
                    default:
                        System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡Elija una opción válida!!!!!!!");
                }
                do {
                    System.out.println("¿Desea seguir consultado los ejercicios?");
                    System.out.println("0 = [NO] - 1 = [SI]");
                    seleccion = sc.nextInt();

                    System.out.flush();
                } while (!(seleccion == 0 || seleccion == 1));
            } while (seleccion != 0);
            System.out.println(
                    "Programa finalizado");
        } catch (Exception e) {
            System.out.println("Se ha detectado un error en el sistema");
            System.out.println(e);
        }
    }

}
