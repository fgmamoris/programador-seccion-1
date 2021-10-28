/*
 * Realizar un programa en el cual el resultado sea el ticket de un restaurante.
 * Que el usuario ingrese:
 * - Se ingrese el nombre del Mozo
 * - Se ingresar el total de lo consumido
 * - Seleccionar modalidad de pago
 * - Efectivo
 * - Tarjeta de crédito
 * - Tarjeta de débito
 * . En el caso de ser de crédito ingresar los números
 * - En el caso de ser de crédito ingresar cantidad de cuotas
 * - En el caso de ser de débito ingresar los números

 * Calcular descuento o interés según el medio de pago:
 * -Efectivo -30%
 * -Débito -10%
 * -Tarjeta Crédito +10%

 * Ejemplo del ticket:
 * =============================
 * RESTAURANTE CFP N°36
 * Zavaleta 204, , C1437EYF CABA
 * =============================
 * Caja # 1 - Ticket # 1
 * LO ATENDIO: XXXXXX
 * 30/04/2010 11:46:47 AM
 * =============================
 * 1 Gaseosa
 * 1 Milanesa Napolitana con fritas
 * 1 Flan con Crema
 * 1 Cafe
 * =============================
 * SUBTOTAL XXXXXX
 * FORMA DE PAGO: XXXXXXX
 * NUMERO TARJETA :XXXXXXX(si pago con tarjeta)
 * CUOTAS: XX (si pago con tarjeta credito)
 * DESCUENTO: XXXXXX

 * TOTAL : XXXXXX

 * =============================
 * Gracias por su visita
 * =============================
 *
 */
package programador.ejercitacion.ejercicio6;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
enum medioDePagoEnum {
    EFECTIVO, TARJETADECREDITO, TARJETADEDEBITO
};

public class TicketDeRestaurant {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombreDeMozo;
        double totalConsumido = 0;
        double subTotalConsumido;
        int medioDePago;
        int cuotas = 1;
        String numeroTarjeta = "";
        String numeroDeTarjeta = "4508109081018001";
        System.out.println("Bienvenido al sistema");
        System.out.println("Ingresar nombre del mozo:");
        nombreDeMozo = scan.nextLine();
        System.out.println("Ingresar monto total de lo consumido por el cliente:");
        subTotalConsumido = scan.nextDouble();
        do {
            System.out.println("Ingrese medio de pago:");
            System.out.println("1: " + medioDePagoEnum.EFECTIVO);
            System.out.println("2: " + medioDePagoEnum.TARJETADEDEBITO);
            System.out.println("3: " + medioDePagoEnum.TARJETADECREDITO);
            medioDePago = scan.nextInt();
            System.out.println(medioDePago > 3 || medioDePago < 1);
        } while (medioDePago > 3 || medioDePago < 1);
        if (medioDePago == 3) {
            do {
                System.out.println("Ingrese el número de la tarjeta utilizada:");
                System.out.println("[XXXX XXXX XXXX XXXX]");
                numeroDeTarjeta = scan.nextLine();
                if (numeroDeTarjeta.length() != 12) {
                    System.out.println("Error al ingresar los número de tarjeta ");
                }
            } while (numeroDeTarjeta.length() != 12);
            do {
                System.out.println("Ingrese la cantidad de cuatos:");
                System.out.println("[1 - 12]");
                cuotas = scan.nextInt();
            } while (cuotas > 12 || cuotas < 1);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("=============================");
        System.out.println("RESTAURANTE CFP N°36");
        System.out.println("Zavaleta 204, , C1437EYF CABA");
        System.out.println("=============================");
        System.out.println("Caja # 1 - Ticket # 1");
        System.out.println("LO ATENDIO: " + nombreDeMozo);
        System.out.println(Calendar.getInstance().getTime());
        System.out.println("=============================");
        System.out.println("1 Gaseosa");
        System.out.println("1 Milanesa Napolitana con fritas");
        System.out.println("1 Flan con Crema");
        System.out.println("1 Cafe");
        System.out.println("=============================");
        System.out.println("SUBTOTAL: $" + subTotalConsumido);
        switch (medioDePago) {
            case 1:
                totalConsumido = subTotalConsumido * 0.7;
                System.out.println("FORMA DE PAGO:" + medioDePagoEnum.EFECTIVO);
                System.out.println("DESCUENTO: " + subTotalConsumido * 0.3);
                break;
            case 2:
                totalConsumido = subTotalConsumido * 0.9;
                System.out.println("FORMA DE PAGO:" + medioDePagoEnum.TARJETADEDEBITO);
                System.out.println("NUMERO TARJETA: " + numeroDeTarjeta);
                System.out.println("DESCUENTO: $" + subTotalConsumido * 0.1);
                break;
            case 3:
                totalConsumido = subTotalConsumido * 1.1;
                System.out.println("FORMA DE PAGO:" + medioDePagoEnum.TARJETADECREDITO);
                System.out.println("NUMERO TARJETA: " + numeroDeTarjeta);
                System.out.println("CUOTAS: " + cuotas);
                System.out.println("RECARGO: $" + subTotalConsumido * 0.1);
                break;
        }

        System.out.println("TOTAL: $" + totalConsumido);
        System.out.println("=============================");
        System.out.println("Gracias por su visita");
        System.out.println("=============================");

    }

}
