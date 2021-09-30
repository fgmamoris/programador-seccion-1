/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programador.generacionpersona;

/**
 *
 * @author Federico Mamoris
 */
public class GeneracionSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nacimiento = 1930; //HARDCODEAR EL AÑO DE NACIMIENTO
        if (nacimiento >= 1930 && nacimiento <= 1948) {
            System.out.println("Usted es de la generacion: Silent Generation");
        } else if (nacimiento >= 1949 && nacimiento <= 1968) {
            System.out.println("Usted es de la generación: Baby Boom");
        } else if (nacimiento >= 1969 && nacimiento <= 1980) {
            System.out.println("Usted es de la generacion: X");
        } else if (nacimiento >= 1981 && nacimiento <= 1993) {
            System.out.println("Usted es de la generacion: Y");
        } else if (nacimiento >= 1994 && nacimiento <= 2010) {
            System.out.println("Usted es de la generacion: Z");
        } else if (nacimiento >= 2011) {
            System.out.println("No hay generación para su año de nacimiento");
        } else if (nacimiento > 0 && nacimiento < 1930) {
            System.out.println("Usted es un dinosario!!!!");
        } else if (nacimiento == 0) {
            System.out.println("Usted es Jesucristo");
        } else {
            System.out.println("Fecha incorrecta");
        }
    }

}
