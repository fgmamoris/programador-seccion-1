/*
 * a) Incrementar una variable entera de valor 1 mientas sea menor o igual a 100, 
 * mostrando el valor actual de esta en cada iteración. Utilizando estructura FOR/WHILE/DOWHILE
 * b)Realizar un programa utilizando WHILE que  le pida al usuario un valor 
 * inicial y un valor final por consola, 
 * e incrementemos el valor inicial dado hasta el tope establecido, 
 * mostrando el valor de la variable contadora en cada iteración.
 * Imprimir en consola cada resultado.
 * c)Utilizar do while y realizar un programa de login . 
 * La contraseña y usuario deben estar guardados en el mismo programa.
 * 
 */
package programador.ejercitacion.ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        int seleccion;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("Seleccione un ejercicio, a fin de verificar el resultado");
                System.out.println("1 - Ejercicio a - Ciclos de iteracion");
                System.out.println("2 - Ejercicio b - Iteracion dinámica");
                System.out.println("3 - Ejercicio c - Login");
                System.out.println("Para finalizar el programa ingrese \'0\'");
                seleccion = sc.nextInt();
                System.out.flush();
                switch (seleccion) {
                    case 0:
                        break;
                    case 1:
                        int opcion;
                        do {
                            System.out.println("Seleccione una opcion para ver el resultado según el ciclo de repetición:");
                            System.out.println("1 - Ciclo FOR ");
                            System.out.println("2 - Ciclo WHILE");
                            System.out.println("3 - DO-WHILE");
                            System.out.println("Para volver al menu principal ingrese \'0\'");
                            opcion = sc.nextInt();
                            System.out.flush();
                            int variableDeIteracion = 1;
                            switch (opcion) {
                                case 0:
                                    break;
                                // declaración case
                                // los valores deben ser del mismo tipo de la expresión
                                case 1:
                                    System.out.println("----- RESULTADO FOR -----");
                                    for (int i = 1; i <= 100; i++) {
                                        System.out.println("Valor de la variable: " + i);
                                    }
                                    break;
                                case 2:
                                    System.out.println("----- RESULTADO WHILE -----");
                                    while (variableDeIteracion <= 100) {
                                        System.out.println("Valor de la variable: " + variableDeIteracion);
                                        variableDeIteracion++;
                                    }
                                    break;

                                case 3:
                                    variableDeIteracion = 1;
                                    System.out.println("----- RESULTADO DO WHILE -----");
                                    do {
                                        System.out.println("Valor de la variable: " + variableDeIteracion);
                                        variableDeIteracion++;

                                    } while (variableDeIteracion <= 100);
                                    break;
                                default:
                                    System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡Elija una opción válida!!!!!!!");
                            }
                        } while (opcion != 0);

                        break;
                    case 2:
                        System.out.println("Ingrese un valor inicial:");
                        int valorInicial = sc.nextInt();
                        System.out.println("Ingrese un valor final:");
                        int valorFinal = sc.nextInt();
                        System.out.println("----- RESULTADO -----");
                        while (valorInicial <= valorFinal) {
                            System.out.println("Variable contadora: " + valorInicial);
                            valorInicial++;
                        }
                        do {
                            System.out.println("¿Desea seguir consultado los ejercicios?");
                            System.out.println("0 = [NO] - 1 = [SI]");
                            seleccion = sc.nextInt();
                            System.out.flush();
                        } while (!(seleccion == 0 || seleccion == 1));
                        break;

                    case 3:
                        String user = "user";
                        String pass = "1234";
                        String passScan;
                        String userScan;
                        System.out.flush();
                        do {
                            System.out.println("*******Bienvenido**********");
                            System.out.println("Ingresar nombre de usuario:");
                            userScan = sc.next();
                            System.out.flush();
                            System.out.println("Ingresar contraseña:");
                            passScan = sc.next();
                            System.out.flush();
                            if (!pass.equals(passScan) || !user.equals(userScan)) {
                                System.out.println("Usuario/Contraseña inconrrecta");
                            }
                        } while (!pass.equals(passScan) || !user.equals(userScan));
                        System.out.println("*********************");
                        System.out.println("*  Login exitoso!!  *");
                        System.out.println("*********************");
                        do {
                            System.out.println("¿Desea seguir consultado los ejercicios?");
                            System.out.println("0 = [NO] - 1 = [SI]");
                            seleccion = sc.nextInt();
                            System.out.flush();
                        } while (!(seleccion == 0 || seleccion == 1));
                        break;

                    default:
                        System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡Elija una opción válida!!!!!!!");
                }

            } while (seleccion != 0);
            System.out.println(
                    "Programa finalizado");
        }
    }
}
