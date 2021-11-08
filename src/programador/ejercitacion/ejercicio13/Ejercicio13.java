/*
 * A)Crear una aplicación, que permita el ingreso de 2 números, para luego 
 * calcular la suma, resta, división, multiplicación, división y residuo.
 * B)Ingrese por teclado el puntaje de un alumno que ha postulado a la 
 * Universidad, visualice un mensaje “Alumno Ingresado” si el puntaje 
 * obtenido es mayor a 500.
 * Solicitar nombre del alumno y tres notas (hacer promedio)
 * 
 */
package programador.ejercitacion.ejercicio13;

import javax.swing.JOptionPane;

/**
 *
 * @author Federico Mamoris
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        String puntos[] = {"Ejercicio A", "Ejercicio B"};
        int seleccion = JOptionPane.showOptionDialog(null,
                "Seleccione el ejercicio a resolver",
                "Ejercico número 13",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                puntos,
                null);
        System.out.println(seleccion);
        switch (seleccion) {
            case 0:
                double numeroUno = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
                double numeroDos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));
                JOptionPane.showMessageDialog(null, "Suma: " + (numeroDos + numeroUno)
                        + "\nResta: " + (numeroUno - numeroDos)
                        + "\nDivisión: " + String.format("%.2f", numeroUno / numeroDos)
                        + "\nMultiplicación: " + (numeroUno * numeroDos)
                        + "\nResiduo: " + (numeroUno % numeroDos),
                        "Operaciones con los números ingresados", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 1:
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno :");
                String apellido = JOptionPane.showInputDialog("Ingrese el apellido del alumno: ");
                double notas[] = new double[3];
                notas[0] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota del alumno: "));
                notas[0] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota del alumno: "));
                notas[0] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercera nota del alumno: "));

                int puntaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese puntaje del alumno: "));

                if (puntaje < 500) {
                    JOptionPane.showMessageDialog(null, "No tiene lógica esta válidación", "No supero el puntaje", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    double total = 0;
                    for (int i = 0; i < notas.length; i++) {
                        total = total + notas[0];
                    }
                    JOptionPane.showMessageDialog(null, "Nombre: " + nombre
                            + "\nApellido: " + apellido
                            + "\nPromedio: " + total / notas.length,
                            "Ficha del alumno", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "No seleccionó ninguna opción", "Fin del programa", JOptionPane.ERROR_MESSAGE);
        }
    }

}
