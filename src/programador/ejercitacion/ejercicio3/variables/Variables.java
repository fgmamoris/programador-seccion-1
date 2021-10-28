/*
 * Crear un proyecto en NetBeans luego resolver cada enunciado en el comentario 
 * del siguiente código. Luego realizar el git push con el proyecto 
 * para su corrección. 
 * Avisar por acá con comentario al ejercicio cuando este subido al mismo 
 * repositorio creado para todos los proyectos.
 * El programa es:
 * package variables;
 * public class Variables {
 * public static void main(String[] args) {

 * Variables
 * int numero1;
 * int numero2;
 * int suma;
 * int edad;
 * String nombre;
 * Constante
 * final int NUMERO_3= 4;
 * Ingreso los valores a la variables numero1 y numero2 
 * numero1 = 30;
 * numero2 = 40;
 * operación suma
 * Muestro en pantalla las dos variables y el resultado de la suma

 * Cambio los valores de numero1,numero2 y vuelvo a realizar la operación de suma
 * numero1=100;

 * operación suma

 * Muestro en pantalla las dos variables y el resultado de la suma


 * Instancio y muestro en pantalla la variable nombre y su edad

 *  Muestro en pantalla la constante
 * }
 */
package programador.ejercitacion.ejercicio3.variables;

import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int seleccion = 0;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Seleccione un ejercicio, a fin de verificar el resultado");
            System.out.println("Ejercicio 1: ");
            System.out.println("Ejercicio 2: ");
            System.out.println("Ejercicio 3: ");
            System.out.println("Ejercicio 4: ");
            System.out.println("Ejercicio 5: ");
            System.out.println("Ejercicio 6: ");

            System.out.println("Para finalizar el programa ingrese 0");

            seleccion = sc.nextInt();
            System.out.flush();
            switch (seleccion) {
                // declaración case
                // los valores deben ser del mismo tipo de la expresión
                case 0:
                    break;
                case 1:

                    int n = 5;
                    double a = 4.56;
                    char c = 'a';
                    System.out.println("----- RESULTADO -----");
                    System.out.println("Valor variable n: " + n);
                    System.out.println("Valor variable a: " + a);
                    System.out.println("Valor variable c: " + c);
                    System.out.println("La suma de n + a: " + (n + a));
                    System.out.println("La diferencia de A - N: " + (a - n));
                    System.out.println("El valor numérico correspondiente al carácter que contiene la variable C: " + (int) c);
                    System.out.println("----------------------");
                    do {
                        System.out.println("¿Desea seguir consultado los ejercicios?");
                        System.out.println("0 = [NO] - 1 = [SI]");
                        seleccion = sc.nextInt();

                        System.out.flush();
                    } while (!(seleccion == 0 || seleccion == 1));

                    break;

                case 2:
                    int X = 1,
                     Y = 2;
                    double N = 4.7,
                     M = 3.2;

                    System.out.println("------------------- RESULTADO -------------------");
                    System.out.println("Valor variable X: " + X);
                    System.out.println("Valor variable Y: " + Y);
                    System.out.println("Valor variable N: " + N);
                    System.out.println("Valor variable M: " + M);
                    System.out.println("La suma X + Y: " + (X + Y));
                    System.out.println("La diferencia X - Y: " + (X - Y));
                    System.out.println("El producto X * Y: " + (X * Y));
                    System.out.println("El cociente X / Y: " + (X / Y));
                    System.out.println("El resto X % Y: " + (X % Y));
                    System.out.println("La suma N + M: " + (N + M));
                    System.out.println("La diferencia N - M: " + (N - M));
                    System.out.println("El producto N * M: " + (N * M));
                    System.out.println("El cociente N / M: " + (N / M));
                    System.out.println("El resto N % M: " + (N % M));
                    System.out.println("La suma X + N: " + (X + N));
                    System.out.println("El cociente Y / M: " + (Y / M));
                    System.out.println("El resto Y % M: " + (Y % M));
                    System.out.println("El doble de la variable X: " + X + " es: " + (X * 2));
                    System.out.println("El doble de la variable Y: " + Y + " es: " + (Y * 2));
                    System.out.println("El doble de la variable N: " + N + " es: " + (N * 2));
                    System.out.println("El doble de la variable M: " + M + " es: " + (M * 2));
                    System.out.println("La suma de todas las variables es: " + (X + Y + N + M));
                    System.out.println("El producto de todas las variables es: " + (X * Y * N * M));
                    System.out.println("-------------------------------------------------");
                    do {
                        System.out.println("¿Desea seguir consultado los ejercicios?");
                        System.out.println("0 = [NO] - 1 = [SI]");
                        seleccion = sc.nextInt();
                        System.out.flush();
                    } while (!(seleccion == 0 || seleccion == 1));
                    break;
                case 3:
                    int A = 1,
                     B = 2,
                     C = 3,
                     D = 4;
                    System.out.println("------------- RESULTADO -------------");
                    System.out.println("Valores iniciales");
                    System.out.println("Valor variable A: " + A);
                    System.out.println("Valor variable B: " + B);
                    System.out.println("Valor variable C: " + C);
                    System.out.println("Valor variable D: " + D);
                    System.out.println("Valores finales");
                    int temp = B;
                    B = C;
                    C = A;
                    A = D;
                    D = temp;

                    System.out.println("B toma el valor de C -> B = " + B);
                    System.out.println("C toma el valor de A -> C = " + C);
                    System.out.println("A toma el valor de D -> A = " + A);
                    System.out.println("D toma el valor de B -> D = " + D);
                    System.out.println("-------------------------------------");
                    do {
                        System.out.println("¿Desea seguir consultado los ejercicios?");
                        System.out.println("0 = [NO] - 1 = [SI]");
                        seleccion = sc.nextInt();
                        System.out.flush();
                    } while (!(seleccion == 0 || seleccion == 1));
                    break;

                case 4:
                    A = 14;
                    System.out.println("------------- RESULTADO -------------");
                    System.out.println("Operado ternario");
                    System.out.println((A % 2 == 0) ? (A + " - es par") : (A + " - es impar"));
                    A = 15;
                    System.out.println((A % 2 == 0) ? (A + " - es par") : (A + " - es impar"));
                    System.out.println("-------------------------------------");
                    do {
                        System.out.println("¿Desea seguir consultado los ejercicios?");
                        System.out.println("0 = [NO] - 1 = [SI]");
                        seleccion = sc.nextInt();
                        System.out.flush();
                    } while (!(seleccion == 0 || seleccion == 1));
                    break;
                case 5:
                    B = 1;
                    System.out.println("------------- RESULTADO -------------");
                    System.out.println("Operado ternario");
                    System.out.println((B >= 0) ? (B + " - es positivo") : (B + " - es negativo"));
                    B = -1;
                    System.out.println((B >= 0) ? (B + " - es positivo") : (B + " - es negativo"));
                    System.out.println("-------------------------------------");
                    System.out.println("¿Desea seguir consultado los ejercicios?");
                    do {
                        System.out.println("¿Desea seguir consultado los ejercicios?");
                        System.out.println("0 = [NO] - 1 = [SI]");
                        seleccion = sc.nextInt();
                        System.out.flush();
                        System.out.println(seleccion);
                    } while (!(seleccion == 0 || seleccion == 1));
                    break;
                case 6:
                    C = 55;
                    System.out.println("-------------------------- RESULTADO --------------------------");
                    System.out.println("Operado ternario");
                    System.out.println("Valor de C: " + C);
                    System.out.println((C >= 0) ? (C + " - es positivo") : (C + " - es negativo"));
                    System.out.println((C % 2 == 0) ? (C + " - es par") : (C + " - es impar"));
                    System.out.println((C % 5 == 0) ? (C + " - es multiplo de 5") : (C + " - no es multiplo de 5"));
                    System.out.println((C % 10 == 0) ? (C + " - es multiplo de 10") : (C + " - no es multiplo de 10"));
                    System.out.println((C > 100) ? (C + " - es mayor a 100") : (C + " - es menor o igual que 100"));
                    C = 150;
                    System.out.println("Operado ternario");
                    System.out.println("Valor de C: " + C);
                    System.out.println((C >= 0) ? (C + " - es positivo") : (C + " - es negativo"));
                    System.out.println((C % 2 == 0) ? (C + " - es par") : (C + " - es impar"));
                    System.out.println((C % 5 == 0) ? (C + " - es multiplo de 5") : (C + " - no es multiplo de 5"));
                    System.out.println((C % 10 == 0) ? (C + " - es multiplo de 10") : (C + " - no es multiplo de 10"));
                    System.out.println((C > 100) ? (C + " - es mayor a 100") : (C + " - es menor o igual que 100"));
                    System.out.println("-----------------------------------------------------------------");
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
        sc.close();
    }
}
