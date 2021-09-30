/*
 * Realizar un programa que utilice tres variables con valores instanciados. 
 * Luego realizar la operación de suma con esas dos variables y guardar 
 * el resultado en la tercera variable. Para finalizar imprimir mensaje con el 
 * resultado
 */
package programador.ejercicio2;

/**
 *
 * @author Federico Mamoris
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        int suma;
        System.out.println("El valor de la variable numero1 es: " + numero1);
        System.out.println("El valor de la variable numero2 es: " + numero2);
        suma = numero1 + numero2;
        System.out.println("El resultado de la operación suma es: " + suma);
    }

}
