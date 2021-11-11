/*
 * Realizar un programa que calcule las cuotas de un préstamo bancario. 
 * Solicitarle al Cliente por JOPTIONPANE :
 * Nombre  y apellido
 * DNI
 * Sueldo Mensual:
 * Solicitado:
 * Cuotas : hasta 12 

 * Calculo: 
      •	El banco presta hasta 100000 pesos siempre y cuando el sueldo del solicitante superé los 200000 anuales.
      •	El préstamo  no debe superar a los 10 sueldos del cliente.
      •	Calculo = solicitado / cuota

 * Imprimir la información consola
 * Logo del banco 
 * Información del cliente  
 * Monto solicitado
 * Cantidad de cuotas
 * Importe a pagar
 * Y Si esta aprobado o no (este puede contener un icono simbolizando el si o el no)
 * 
 */
package programador.cuotasbanco;

import javax.swing.JOptionPane;

/**
 *
 * @author Federico Mamoris
 */
public class EjercicioCoutasBanco {

    public static void main(String[] args) {
        String nombre = "", apellido = "", dniString = "";
        String sueldo = "", montoSolicitado = "";
        double montoOtorgado = 0;
        double cuotaMensual = 0;
        boolean estadoDelPrestamo = false;
        int cuotas = 0;
        do {
            nombre = JOptionPane.showInputDialog("Ingrese su Nombre:");
            if (nombre == null || nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No ingreso ningún dato", "Por favor vuelva a intentarlo", JOptionPane.ERROR_MESSAGE);
            }
        } while (nombre == null || nombre.isEmpty());
        do {
            apellido = JOptionPane.showInputDialog("Ingrese su Apellido:");
            if (apellido == null || apellido.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No ingreso ningún dato", "Por favor vuelva a intentarlo", JOptionPane.ERROR_MESSAGE);
            }
        } while (apellido == null || apellido.isEmpty());

        boolean verificacion = false;
        do {
            dniString = JOptionPane.showInputDialog("Ingrese su dni:");
            if (dniString == null || dniString.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No ingreso ningún dato", "Por favor vuelva a intentarlo", JOptionPane.ERROR_MESSAGE);
            } else if (dniString.length() != 8) {
                JOptionPane.showMessageDialog(null, "La cantidad de números ingresados para el dni son incorrecto", "Por favor vuelva a intentarlo", JOptionPane.ERROR_MESSAGE);
            } else {
                if (verificarDni(dniString)) {
                    verificacion = verificarDni(dniString);
                } else {
                    JOptionPane.showMessageDialog(null, "Los números ingresados para el dni son incorrecto", "Por favor vuelva a intentarlo", JOptionPane.ERROR_MESSAGE);

                }
            }
        } while (!verificacion);
        verificacion = false;
        do {
            sueldo = JOptionPane.showInputDialog("Ingrese su sueldo:");
            if (sueldo == null || sueldo.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No ingreso ningún dato", "Por favor vuelva a intentarlo", JOptionPane.ERROR_MESSAGE);
            } else {
                if (verificarStringNumeros(sueldo)) {
                    verificacion = verificarStringNumeros(sueldo);
                } else {
                    JOptionPane.showMessageDialog(null, "El sueldo contiene caracter, debe contener solo números", "Por favor vuelva a intentarlo", JOptionPane.ERROR_MESSAGE);

                }
            }
        } //Double.parseDouble
        while (!verificacion);

        verificacion = false;
        do {
            montoSolicitado = JOptionPane.showInputDialog("Ingrese el monto solicitado:");
            if (montoSolicitado == null || montoSolicitado.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No ingreso ningún dato", "Por favor vuelva a intentarlo", JOptionPane.ERROR_MESSAGE);
            } else {
                if (verificarStringNumeros(montoSolicitado)) {
                    verificacion = verificarStringNumeros(montoSolicitado);
                } else {
                    JOptionPane.showMessageDialog(null, "El monto solicitado contiene caracter, debe contener solo números", "Por favor vuelva a intentarlo", JOptionPane.ERROR_MESSAGE);
                }
            }
        } //Double.parseDouble
        while (!verificacion);

        do {
            cuotas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de coutas que necesita [1-12]:"));
            if (cuotas == 0 || (cuotas < 1 && cuotas > 12)) {
                JOptionPane.showMessageDialog(null, "Las cuotas ingresadas es incorrecta, debe ser entre 1 y 12", "Por favor vuelva a intentarlo", JOptionPane.ERROR_MESSAGE);
            }
        } while (cuotas == 0 || (cuotas < 1 && cuotas > 12));

        if (Double.parseDouble(montoSolicitado) >= (10 * Double.parseDouble(sueldo))) {
            estadoDelPrestamo = false;
        } else if (Double.parseDouble(montoSolicitado) >= (12 * Double.parseDouble(sueldo))) {
            if (Double.parseDouble(montoSolicitado) >= 1000000) {
                montoOtorgado = 1000000;
            } else {
                montoOtorgado = Double.parseDouble(montoSolicitado);
            }
            estadoDelPrestamo = true;

        } else {
            montoOtorgado = Double.parseDouble(montoSolicitado);
        }
        cuotaMensual = montoOtorgado / cuotas;

        datosUsuario(nombre, apellido, dniString, Double.parseDouble(sueldo));

        datosPrestamo(Double.parseDouble(montoSolicitado), cuotaMensual, cuotas);

        validaOtorgado(estadoDelPrestamo);

    }

    public static boolean verificarDni(String dniString) {
        for (int i = 0; i < dniString.length(); i++) {
            if (!Character.isDigit(dniString.charAt(i))) {
                return false;
            }
        }
        return true;

    }

    public static boolean verificarStringNumeros(String cadena) {

        for (int i = 0; i < cadena.length(); i++) {
            if (!Character.isDigit(cadena.charAt(i))) {
                return false;
            }
        }
        return true;

    }

    public static void datosUsuario(String nombre, String apellido, String dniString, double sueldo) {
        System.out.println("=================================\n"
                + "========== BANCO CFP36 =========\n"
                + "================================");
        System.out.println("Cliente: " + nombre + " " + apellido + "\nDNI: " + dniString + "\nSueldo:" + sueldo);

    }

    public static void datosPrestamo(double prestamo, double montoCuotas, int cuotas) {
        System.out.println("Monto solicitado: " + prestamo + "\nCuotas a Pagar: " + montoCuotas + "\nCantidad de Cuotas: " + cuotas);

    }

    public static void validaOtorgado(boolean otorgado) {
        if (otorgado) {
            System.out.println("Prestamo APROBADO");
            System.out.println("=================================");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede otorgar el prestamo\nDEDEGADO");
        }
    }

}
