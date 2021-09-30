/*
 * Ejercicio 1:
 * Escribe un programa Java que realice lo siguiente: declarar una variable
 * N de tipo int, una variable A de tipo double y una variable C de tipo char 
 * y asigna a cada una un valor. A continuación, muestra por pantalla:
 * El valor de cada variable.
 * La suma de N + A
 * La diferencia de A - N
 * El valor numérico correspondiente al carácter que contiene la variable C.
*************************
 * Ejercicio 2:
 * Escribe un programa Java que realice lo siguiente: declarar dos variables X 
 * e Y de tipo int, dos variables N y M de tipo double y asigna a cada una 
 * un valor. A continuación, muestra por pantalla:
 * El valor de cada variable
 * La suma X + Y
 * La diferencia X – Y
 * El producto X * Y
 * El cociente X / Y
 * El resto X % Y
 * La suma N + M
 * La diferencia N – M
 * El producto N * M
 * El cociente N / M
 * El resto N % M
 * La suma X + N
 * El cociente Y / M
 * El resto Y % M
 * El doble de cada variable
 * La suma de todas las variables
 * El producto de todas las variables
*********************
 * Ejercicio 3:
 * Programa javo que declare cuatro variables enteras A, B, C y D y asígnale un 
 * valor a cada una. A continuación, realiza las instrucciones necesarias para que:
 * B tome el valor de C
 * C tome el valor de A
 * A tome el valor de D
 * D tome el valor de B
********************
 * Ejercicio 4
 * Escribe un programa java que declare una variable A de tipo entero y asígnale
 * un valor. A continuación muestra un mensaje indicando si A es par o impar. 
 * Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
 * Si por ejemplo A = 14 la salida será
 * 14 es par
 * Si fuese por ejemplo A = 15 la salida será:
 * 15 es impar
********************
 * Ejercicio 5
 * Escribe un programa java que declare una variable B de tipo entero y asígnale 
 * un valor. A continuación muestra un mensaje indicando si el valor de B es 
 * positivo o negativo. Consideraremos el 0 como positivo. 
 * Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
 * Si por ejemplo B = 1 la salida será
 * 1 es positivo
 * Si fuese por ejemplo B = -1 la salida será:
 * -1 es negativo
********************
 * Ejercicio 6
 * Escribe un programa java que declare una variable C de tipo entero y asígnale un valor. 
 * A continuación muestra un mensaje indicando si el valor de C 
 * es positivo o negativo, si es par o impar, si es múltiplo de 5, 
 * si es múltiplo de 10 y si es mayor o menor que 100. Consideraremos el 0 como positivo. 
 * Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
 */
package programador.variablesmultiples;

import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
public class VariablesMultiples {

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
