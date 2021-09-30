/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programador.referenciastring;

/**
 *
 * @author Federico Mamoris
 */
public class ReferenciaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = new String("prueba");
        String cadena2 = "Hola";
        int nombreDeLaVariable = 4;
        System.out.println(nombreDeLaVariable);
        nombreDeLaVariable = 3;
        System.out.println(nombreDeLaVariable);
        final int nombreDeLaConstante = 3;
        System.out.println(nombreDeLaConstante);      
    }
}
