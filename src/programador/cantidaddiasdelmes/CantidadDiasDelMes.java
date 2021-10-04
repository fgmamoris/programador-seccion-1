/*
 * Crear un programa que dado un mes indique:
 * Cantidad de días del mes.
 * 
 */
package programador.cantidaddiasdelmes;

import java.util.Scanner;

/**
 *
 * @author Fernando Cancro - Federico Mamoris
 */
public class CantidadDiasDelMes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String resultado, mes;
        System.out.println("Ingrese el mes que desea saber la cantidad de días");
        System.out.println("[Enero, Febrero, Marzo, Abril, Mayo, Junio]");
        System.out.println("[Julio,Agosto, Septiembre, Octubre, Noviembre, Diciembre]");
        mes = scan.nextLine();
        switch (mes) {
            case "Enero":
            case "Marzo":
            case "Mayo":
            case "Julio":
            case "Agosto":
            case "Octubre":
            case "Diciembre":
                resultado = "31";
                break;
            case "Abril":
            case "Junio":
            case "Septiembre":
            case "Noviembre":
                resultado = "30";
                break;
            case "Febrero":
                resultado = "28";
                break;
            default:
                resultado = "";
                break;

        }
        System.out.println(resultado.isEmpty() ? "Debe ingresar un mes válido" : "La cantidad de días del mes: " + mes + " son: " + resultado + " días.");
    }

}
