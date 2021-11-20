/*
 * Se necesita un programa en el cual simule las operaciones de un 
 * cajero automático, de la siguiente manera:
 * - Modulo 1 :
 * A) Joption con logo del banco
 * B) Pedir contraseña
 * C) Mostrar menú en Joption
 * Menu
 * 1. Saldo
 * 2. Transferir
 * 3. Retirar
 * 4. Cambiar Clave
 * 5. Salir
 * D) Consulta de Saldo

 * - Modulo 2 :
 * Punto de menú 2_Transferir
 * A)Al seleccionar transferir solicitar numero de CBU destinatario y solo 
 * permitir acceder 16 digitos. Si agrega mas mostrar error y 
 * volverlo a intentar 3 veces.
 * B)Al tener cargado el numero de CBU solicitar importe a transferir . 
 * No debe ser mas grande que el saldo de la cuenta, marcar error si es asi.
 * C)Imprimir ticket con datos de la transacción: Datos de la cuenta emisora 
 * ,la receptora(cbu ingresado) e importe que se envió.
 * d) Finalizada la operación se necesita que se reste del saldo lo transferido 
 * y mostrar el menú inicial.

 * - Modulo 3 

 * Punto de Manu 3_Retiro
 * A) Seleccione el monto en un joptionpane con las opciones (200,500,1000,2000
 * o Otros para ingresar)
 * B) Imprimir ticket de extracción
 * C) Actualizar el saldo y no debe permitir retirar mas que el saldo

 * Punto de Manu 4_Cambio de Clave
 * A)Seleccionar canal para el cambio de clave (HOME BANKING, Clave 
 * telefonica y Cajero)
 * B)La clave no puede ser la misma que tiene hoy
 * C)Imprimir comprobante de cambio de clave indicar en que canal se realizo el
 * cmabio. No mostrar la clave solo ticket informativo.
 */
package programador.ejercitacion.ejercicio16;

import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Federico Mamoris
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        int[] balance = {100000, 500};
        int operation = 0;
        int tried = 3;
        String[] passwordsArray = new String[]{"1234", "ClaveHb", "ClaveTel"};
        String pwIngresada = "1";
        ImageIcon icon = new ImageIcon("images/logo-The-World-Bank.png");
        boolean userBlock = false;
        boolean exit = false;
        JOptionPane.showMessageDialog(null, "Banco CFP N°36", "Bienvenido", JOptionPane.INFORMATION_MESSAGE, icon);

        Object passwordEntered;
        do {
            passwordEntered = JOptionPane.showInputDialog(null, "Bienvenido Federico.\nPor favor, Ingrese su contraseña:", null);
            if (passwordEntered == null) {
                userBlock = true;
                JOptionPane.showMessageDialog(
                        null, "Operacion Cancelada", "Adios!!", JOptionPane.ERROR_MESSAGE);
            } else if (passwordEntered.toString().isEmpty()) {
                JOptionPane.showMessageDialog(
                        null, "Debe ingresar una contraseña", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (passwordEntered.equals(passwordsArray[0])) {
                Object optional;
                do {
                    optional = JOptionPane.showInputDialog(null, "1. Saldo\n2. Transferir\n3. Extracción\n4. Cambio de Clave\n5. Salir", "Ingrese la opcion deseada aquí.");
                    if (optional == null) {
                        operation = 5;
                        userBlock = true;
                        exit = true;
                    } else if (optional.equals("Ingrese la opcion deseada aquí.") || optional.toString().isEmpty() || !checkIsNumber(optional.toString())) {
                        JOptionPane.showMessageDialog(
                                null, "Debe seleccionar una opción válida", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        operation = Integer.parseInt(optional.toString());
                        switch (operation) {
                            case 1:
                                viewBalance(balance);
                                break;
                            case 2:
                                balance[0] = moneyTransfer(balance[0]);
                                break;
                            case 3:
                                balance[0] = moneyExtraction(balance[0]);
                                break;
                            case 4:
                                passwordsArray = changePass(passwordsArray);
                                break;
                            case 5:
                                userBlock = true;
                                exit = true;
                                break;
                            default:
                                JOptionPane.showMessageDialog(
                                        null, "Debe seleccionar una opción válida", "Error", JOptionPane.ERROR_MESSAGE);
                                break;
                        }
                    }
                } while (operation != 5);
            } else {
                tried--;
                if (tried == 0) {
                    userBlock = true;
                    JOptionPane.showMessageDialog(
                            null, "Usuario bloqueado\n Por favor, ponganse en contacto con el administrador", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(
                            null, "Contraseña incorrecta, le queda: " + tried + " intentos, o se bloquera el usuario", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (exit) {
                JOptionPane.showMessageDialog(
                        null, "Gracias por utilizar los servicios del banco", "Hasta la proxima", JOptionPane.INFORMATION_MESSAGE);
            }

        } while (!userBlock);

    } //Modulo 1

    private static void viewBalance(int[] balance) {
        System.out.println("\n\n==============================");
        System.out.println("========BANCO CFP N°36========");
        System.out.println("==============================");
        System.out.println("==Consulta de Saldo:==========");
        System.out.println("==Cuenta corriente en Pesos:==");
        System.out.println("==$" + balance[0] + "=====================");
        System.out.println("==============================");
        System.out.println("==Cuenta corriente en ========");
        System.out.println("==Dolares:====================");
        System.out.println("==U$D-" + balance[1] + "----=================");
        System.out.println("==============================");
    }

    //Modulo 2
    private static int moneyTransfer(int balance) {
        //Declaracion de Variables
        int amountTransf = 0;
        boolean CBUValid = false;
        String CBU;
        int triedTransfer = 3;
        //Ingresar CBU
        do {
            CBU = JOptionPane.showInputDialog(null, "Ingrese el CBU de la cuenta a transferir:", "Ingrese el CBU aquí.");
            if (CBU == null) {
                JOptionPane.showMessageDialog(null, "Operacion Cancelada", "Cancelación", JOptionPane.ERROR_MESSAGE);
                return balance;
            } //Verificar que el largo del CBU es de 16 caracteres para salir del bucle
            else if (CBU.length() == 16 && checkIsNumber(CBU)) {
                CBUValid = true;
            } else {
                JOptionPane.showMessageDialog(
                        null, "Debe ingresar un CBU valido!!", "Error", JOptionPane.ERROR_MESSAGE);
                triedTransfer--;
                if (triedTransfer == 0) {
                    JOptionPane.showMessageDialog(
                            null, "Operacion cancelada por cantidad de intentos"
                            + "\n Debera volver a realizar todo el proceso nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
                    return balance;
                }
            }
        } while (!CBUValid);
        //Ingresar monto a transferir
        Object optional;
        boolean operationValid = false;
        do {
            optional = JOptionPane.showInputDialog(null, "Ingrese el monto a transferir a CBU:\n " + CBU, "Ingrese el monto aquí.");
            if (optional == null || !checkIsNumber(optional.toString())) {
                JOptionPane.showMessageDialog(
                        null, "Debe ingresar un monto de transferir", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                amountTransf = Integer.parseInt(optional.toString());
                if ((balance <= amountTransf) && (amountTransf > 0)) {
                    JOptionPane.showMessageDialog(
                            null, "No es posible transferir el monto solicitado\nPor favor ingrese un monto mayor a cero\n y menor o igual " + balance, "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    operationValid = true;
                }
            }
        } while (!operationValid);
        balance = balance - amountTransf;
        ticketTransf(balance, amountTransf, CBU);
        return balance;
    }

    private static void ticketTransf(int balance, int amountTransf, String CBU) {
        System.out.println("\n\n==============================");
        System.out.println("========BANCO CFP N°36========");
        System.out.println("==============================");
        System.out.println("==Transferencia a CBU:========");
        System.out.println("=======" + CBU + "=======");
        System.out.println("==============================");
        System.out.println("==Monto Transferido:==========");
        System.out.println("==$" + amountTransf + "=====================");
        System.out.println("==Saldo :=====================");
        System.out.println("==$" + balance + "======================");
        System.out.println("==============================");
    }

    //Modulo 3
    private static int moneyExtraction(int balance) {
        int amountExt = 0;
        String[] operations = {"200", "500", "1000", "2000", "Otro Importe"};
        do {
            Object option = JOptionPane.showInputDialog(null, "Seleccione el importe a Retirar:", "Retirar Dinero", JOptionPane.QUESTION_MESSAGE, null, operations, operations[0]);
            if (option == null) {
                JOptionPane.showMessageDialog(null, "Operacion Cancelada", "Cancelación", JOptionPane.ERROR_MESSAGE);
                return balance;
            }
            switch ((String) option) {
                case "200":
                    amountExt = 200;
                    break;
                case "500":
                    amountExt = 500;
                    break;
                case "1000":
                    amountExt = 1000;
                    break;
                case "2000":
                    amountExt = 2000;
                    break;
                case "Otro Importe":
                    Object optional;
                    do {
                        optional = JOptionPane.showInputDialog(null, "Ingrese el monto a Retirar:", "Ingrese el monto aquí.");
                        if (optional == null) {
                            JOptionPane.showMessageDialog(
                                    null, "Debe ingresar un monto de extraccion", "Error", JOptionPane.ERROR_MESSAGE);
                        } else if (checkIsNumber(optional.toString())) {
                            amountExt = Integer.parseInt(optional.toString());
                        } else {
                            JOptionPane.showMessageDialog(
                                    null, "Debe ingresar un numero valido!!", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } while (optional == null || !checkIsNumber(optional.toString()));
                    break;
            }
            if (amountExt > balance) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un monto valido menor a su saldo.\nSu saldo actual es de: $" + balance, "Retirar Dinero", JOptionPane.WARNING_MESSAGE);
            }
        } while ((amountExt >= balance) || (amountExt < 0));
        balance = balance - amountExt;
        generationOfCheck(balance, amountExt);
        return balance;
    }

    private static void generationOfCheck(int balance, int amount) {
        System.out.println("\n\n==============================");
        System.out.println("========BANCO CFP N°36========");
        System.out.println("==============================");
        System.out.println("==Extracción realizada por:===");
        System.out.println("==$" + amount + "=====================");
        System.out.println("==Saldo Restante:=============");
        System.out.println("==$" + balance + "======================");
        System.out.println("==============================");
    }

    private static String[] changePass(String[] pw) {
        System.out.println("Referencia claves" + "\nClave Cajero: " + pw[0] + "\nClave HomeBanking: " + pw[1] + "\nClave Telefonica: " + pw[2]);
        String newPass = "";
        boolean operation = true;
        String[] options = {"Clave Homebanking", "Clave Telefónica", "Clave de Cajero"};
        Object optionSelectd;
        do {
            optionSelectd = JOptionPane.showInputDialog(null, "Seleccione la clave que desea cambiar:", "Cambio de Clave", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (optionSelectd == null) {
                JOptionPane.showMessageDialog(null, "Operacion Cancelada", "Cancelación", JOptionPane.ERROR_MESSAGE);
                return pw;
            }
        } while (optionSelectd == null);

        switch (optionSelectd.toString()) {
            case "Clave Homebanking":
                do {
                    newPass = JOptionPane.showInputDialog(null, "Por favor, ingrese su nueva Clave Homebanking:", "Nueva Clave");
                    if (newPass == null) {
                        JOptionPane.showMessageDialog(null, "Operacion Cancelada", "Cancelación", JOptionPane.ERROR_MESSAGE);
                        return pw;
                    } else if (newPass.toString().equals("Nueva Clave")) {
                        JOptionPane.showMessageDialog(
                                null, "Debe ingresar una clave valida", "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (newPass.equals(pw[1])) {
                        JOptionPane.showMessageDialog(null, "La nueva Clave Homebanking no puede ser igual a la actual!", "Cambio de Clave: Homebanking", JOptionPane.ERROR_MESSAGE);
                    } else {
                        pw[1] = newPass;
                        JOptionPane.showMessageDialog(null, "La nueva Clave Homebanking ha sido cambiada con exito", "Cambio de Clave", JOptionPane.INFORMATION_MESSAGE);
                        operation = false;
                    }
                } while (operation);
                break;
            case "Clave Telefónica":
                do {
                    newPass = JOptionPane.showInputDialog(null, "Por favor, ingrese su nueva Clave Telefonica:", "Nueva Clave");
                    if (newPass == null) {
                        JOptionPane.showMessageDialog(null, "Operacion Cancelada", "Cancelación", JOptionPane.ERROR_MESSAGE);
                        return pw;
                    } else if (newPass.toString().equals("Nueva Clave")) {
                        JOptionPane.showMessageDialog(
                                null, "Debe ingresar una clave valida", "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (newPass.equals(pw[2])) {
                        JOptionPane.showMessageDialog(null, "La nueva Clave Telefonica no puede ser igual a la actual!", "Cambio de Clave: Telefonica", JOptionPane.ERROR_MESSAGE);
                    } else {
                        pw[2] = newPass;
                        JOptionPane.showMessageDialog(null, "La nueva Clave Telefonica ha sido cambiada con exito", "Cambio de Clave", JOptionPane.INFORMATION_MESSAGE);
                        operation = false;
                    }
                } while (operation);
                break;
            case "Clave de Cajero":
                do {
                    newPass = JOptionPane.showInputDialog(null, "Por favor, ingrese su nueva Clave Cajero:", "Nueva Clave");
                    if (newPass == null) {
                        JOptionPane.showMessageDialog(null, "Operacion Cancelada", "Cancelación", JOptionPane.ERROR_MESSAGE);
                        return pw;
                    } else if (newPass.toString().equals("Nueva Clave")) {
                        JOptionPane.showMessageDialog(
                                null, "Debe ingresar una clave valida", "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (newPass.equals(pw[0])) {
                        JOptionPane.showMessageDialog(null, "La nueva Clave Cajero no puede ser igual a la actual!", "Cambio de Clave: Cajero", JOptionPane.ERROR_MESSAGE);
                    } else {
                        pw[0] = newPass;
                        JOptionPane.showMessageDialog(null, "La nueva Clave Cajero ha sido cambiada con exito", "Cambio de Clave", JOptionPane.INFORMATION_MESSAGE);
                        operation = false;
                    }
                } while (operation);
                break;
        }
        System.out.println(pw[0] + " | " + pw[1] + " | " + pw[2]);
        ticketPass(optionSelectd.toString());
        return pw;
    }

    private static void ticketPass(String selected) {
        System.out.println("\n\n==============================");
        System.out.println("========BANCO CFP N°36========");
        System.out.println("==============================");
        System.out.println("==Usted ha cambiado su========");
        System.out.println("==" + selected + "==========");
        System.out.println("==correctamente!==============");
        System.out.println("==============================");
    }

    private static boolean checkIsNumber(String amount) {
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        if (amount == null) {
            return false;
        }
        return pattern.matcher(amount).matches();
    }
}
