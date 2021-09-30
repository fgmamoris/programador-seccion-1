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
package programador.ejercicio3.variables;

/**
 *
 * @author Federico Mamoris
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int numero1;
        int numero2;
        int suma;
        int edad;
        String nombre;
        // Constante
        final int NUMERO_3 = 4;
        //Ingreso los valores a la variables numero1 y numero2 
        numero1 = 30;
        numero2 = 40;
        suma = numero1 + numero2;

        //Muestro en pantalla las dos variables y el resultado de la suma
        System.out.println("El primer número es: " + numero1);
        System.out.println("El segundo número es: " + numero2);
        System.out.println("El resultado de la suma es: " + suma);
        //Cambio los valores de numero1, numero2 y vuelvo a realizar la operación de suma
        numero1 = 100;
        numero2 = 50;
        suma = numero1 + numero2;
        //Muestro en pantalla las dos variables y el resultado de la suma
        System.out.println("El primer número es: " + numero1);
        System.out.println("El segundo número es: " + numero2);
        System.out.println("El resultado de la suma es: " + suma);
        int a = 3;

        //Instancio y muestro en pantalla la variable nombre y su edad
        nombre = "Nombre";
        edad = 100;
        System.out.println("El valor de la variable nombre es: " + nombre);
        System.out.println("El valor de la variable edad es: " + edad);
        // Muestro en pantalla la constante 
        System.out.println("Valor de la constante: ");
        System.out.println(NUMERO_3);
    }

}
