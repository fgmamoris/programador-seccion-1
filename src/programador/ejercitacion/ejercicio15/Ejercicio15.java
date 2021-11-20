/*
 * El juego de la pelotita y 3 vasos con dos jugadores
 */
package programador.ejercitacion.ejercicio15;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Federico Mamoris
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        int[] puntaje = new int[]{0, 0};
        String jugadorUno = "";
        String jugadorDos = "";
        String jugadores[] = new String[]{"", ""};
        do {
            jugadores[0] = (String) JOptionPane.showInputDialog(null, "Ingrese el nombre del Jugador 1:", "Juego del vaso", JOptionPane.PLAIN_MESSAGE, null, null, null);
            if (jugadores[0].isEmpty()) {
                JOptionPane.showMessageDialog(
                        null, "Debe ingresar un nombre", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (jugadores[0].isEmpty());
        do {
            jugadores[1] = (String) JOptionPane.showInputDialog(null, "Ingrese el nombre del Jugador 2:", "Juego del vaso", JOptionPane.PLAIN_MESSAGE, null, null, null);
            if (jugadores[1].isEmpty()) {
                JOptionPane.showMessageDialog(
                        null, "Debe ingresar un nombre", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (jugadores[1].isEmpty());
        Random rand = new Random();
        int pelotita;
        for (int ronda = 0; ronda < 3; ronda++) {
            int jugador = 0;
            for (jugador = 0; jugador < 2; jugador += 1) {
                pelotita = rand.nextInt(3);
                int seleccion;
                do {
                    seleccion = JOptionPane.showOptionDialog(null, "Encuentre la pelotita escondida", "Jugador : " + jugadores[jugador] + " - Ronda: " + (ronda + 1), JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"Vaso 1", "Vaso 2", "Vaso 3"}, null);
                    if (seleccion == -1) {
                        JOptionPane.showMessageDialog(null, "Erro debe seleccion una opción!", "Juego del vaso", JOptionPane.ERROR_MESSAGE, null);
                    }
                } while (seleccion == -1);
                if (pelotita == seleccion) {
                    JOptionPane.showMessageDialog(null, "Correcto!", "Jugador : " + jugadores[jugador] + " - Ronda: " + (ronda + 1), JOptionPane.INFORMATION_MESSAGE, null);
                    puntaje[jugador] += 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrecto!", "Jugador : " + jugadores[jugador] + " - Ronda: " + (ronda + 1), JOptionPane.ERROR_MESSAGE, null);
                }
            }
        }
        if (puntaje[0] == puntaje[1]) {
            JOptionPane.showMessageDialog(null, "Se produjo un empate de puntaje de los jugadores!", "Juego del vaso", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "Ganador: " + (puntaje[0] > puntaje[1] ? jugadores[0] : jugadores[1])
                    + "\nPuntaje ganador: " + (puntaje[0] > puntaje[1] ? puntaje[0] : puntaje[1]),
                    "Juego del vaso",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }

}
