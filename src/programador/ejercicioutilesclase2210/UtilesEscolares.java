/*
 * Se necesita crear un vector estático  de tipo double que tenga como resultado útiles escolares.
 * Imprimiendo en pantalla:
 * Litado de precios de los Útiles escolares
 * Lapicera  $ 40.5
 * Cuaderno  $ 139.99
 * Cartuchera  $ 560.5
 * Mochila  $ 1399.99
 */
package programador.ejercicioutilesclase2210;

/**
 *
 * @author Federico Mamoris
 */
public class UtilesEscolares {

    public static void main(String[] args) {
        double[] utilesEscolaresPrecios = new double[]{40.5, 139.99, 560.5, 1399.9};
        String utilesEscolares[] = new String[]{"Lapicera", "Cuaderno", "Cartuchera", "Mochila"};
        System.out.println("Litado de precios de los Útiles escolares");
        for (int i = 0; i < utilesEscolares.length; i++) {
            System.out.println(utilesEscolares[i] + ": $" + utilesEscolaresPrecios[i]);
        }
    }
}
