package programador.fastfood;

/**
 * Se necesita crear un progrma para una casa de comidas rapidas, la misma debe
 * tener: Presentacion de la aplicacion joption con icon de la copañia Soliictar
 * antes de la seleccion del pedido al cliente nombre y formas de pago
 * Solicitarle el tipo de Hamburguesa con joption con combo Solicitarle el tipo
 * de Papas fritas con joption con combo Solicitarle el tipo de Bebidas con
 * joption con combo Mostrar el pedido seleccionado en pantalla por joption y
 * datos del cliente Los productos deben estar en tres vectores separados
 */
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FastFood {

    public static void main(String[] args) {
        ImageIcon logoImage = new ImageIcon("images/logo.jpg");
        ImageIcon hamburguesaImage = new ImageIcon("images/hamburger.jpg");
        ImageIcon mediosImage = new ImageIcon("images/medios.png");
        ImageIcon papasImage = new ImageIcon("images/papas.jpg");
        ImageIcon gaseosaImage = new ImageIcon("images/gaseosa.jpg");
        ImageIcon comboImage = new ImageIcon("images/combo.jpg");
        String hamburgesas[] = {"Krusty Burger", "Hamburguesa fantasma",
            "Hamburguesa Varsity", "Umami Burger", "Ray’s Hell Burger", "Hamburguesa de Ramen",
            "MOS Burger", "Jucy Lucy", "Quadruple Bypass Burger",
            "ShackBurger", "Whopper", "The 21 Burger",
            "In-N-Out Burger", "The White Castle Slider"
        };
        String medioDePago[] = {"Efectivo", "Tarjeta de crédito",
            "Tarjeta de débito", "Pago QR", "MercadoPago", "PayPal"};
        String papas[] = {"Clásicas", "Rejilla", "Españolas",
            "Belgas", "Bravas", "Inglesas", "En cubo", "Con panceta", "Con chedar"
        };
        String gaseosa[] = {"Grande", "Mediana", "Chica", "Grande sin hielo",
            "Mediana sin hielo", "Chica sin hielo"};
        String nombre;
        JOptionPane.showMessageDialog(null, "", "Bienvenidos a FastFood", JOptionPane.INFORMATION_MESSAGE, logoImage);
        do {
            nombre = JOptionPane.showInputDialog("Ingrese nombre:");
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(
                        null, "Debe ingresar un nombre", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (nombre.isEmpty());
        Object pago;

        do {
            pago = JOptionPane.showInputDialog(null, "Seleccione un medio de pago", "Pago",
                    JOptionPane.QUESTION_MESSAGE, mediosImage, medioDePago, null);
            if (pago == null) {
                JOptionPane.showMessageDialog(
                        null, "Debe seleccionar un medio de pago", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (pago == null);

        Object primerConsumible;
        do {
            primerConsumible = JOptionPane.showInputDialog(null, "Seleccione Hamburguesa que desea solicitar", "Hamburguesa",
                    JOptionPane.QUESTION_MESSAGE, hamburguesaImage, hamburgesas, null);
            if (primerConsumible == null) {
                JOptionPane.showMessageDialog(
                        null, "Debe seleccionar al menos un item", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (primerConsumible == null);

        Object segundoConsumible;
        do {
            segundoConsumible = JOptionPane.showInputDialog(null, "Seleccione "
                    + "tipo de papas que desa solicitar", "Papas fritas",
                    JOptionPane.QUESTION_MESSAGE, papasImage, papas, null);
            if (segundoConsumible == null) {
                JOptionPane.showMessageDialog(
                        null, "Debe seleccionar al menos un item", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (segundoConsumible == null);

        Object tercerConsumible;
        do {
            tercerConsumible = JOptionPane.showInputDialog(null, "Seleccione "
                    + "la gasaseosa que desea", "Gaseosa",
                    JOptionPane.QUESTION_MESSAGE, gaseosaImage, gaseosa, null);
            if (tercerConsumible == null) {
                JOptionPane.showMessageDialog(
                        null, "Debe seleccionar al menos un item", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (tercerConsumible == null);

        JOptionPane.showMessageDialog(null, "Cliente: " + nombre
                + "\n Medio de pago: " + pago
                + "\n Hamburguesa: " + primerConsumible
                + "\n Papas fritas: " + segundoConsumible
                + "\n Tipo de bebida: " + tercerConsumible
                + "\n \n Gracias por su visita",
                "Sistema de comidas rápidas Fast Food", JOptionPane.INFORMATION_MESSAGE, comboImage);
    }

}
