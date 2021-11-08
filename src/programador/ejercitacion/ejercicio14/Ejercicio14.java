/*
 * Crear un programa para una compañía de seguros de automotor en donde 
 * el productor de seguros le solicite al cliente:
 * Nombre 
 * Apellido
 * Marca del vehículo (Tener un listado de marcas y cada marca identificarla con una gama)
 * Año del vehículo 
 * Dominio del vehículo.
 * En base a la gama establecer el precio y sumarle el año dependiendo en que margen se encuentra.

 * si es una marca de alta gama agregar $1800 cuota final;
 * si no es alta gama agregar $890 cuota final;

 // Crear una función
 * si el año se encuentra entre 1990-1999 = $ 480;
 * si el año se encuentra entre 2000-2010 = $ 780;
 * si el año se encuentra entre 2011-2016 = $ 950;
 * si el año se encuentra entre 2017-2020 = $ 1200;
 * SI NO SE ENCUENTRA EN LOS RANGOS MENCIONADOS = $ 350

 * crear un Joption final resultado de toda la cotización o 
 * imprimir en consola con formato de cotización 
 * (Datos de la compañía + datos cargados y calculados del sistema )
 */
package programador.ejercitacion.ejercicio14;

import com.sun.tools.javac.util.ArrayUtils;
import java.util.Arrays;
import java.util.stream.Stream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Federico Mamoris
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        String nombre = "", apellido = "", dominio = "";
        ImageIcon marcaImage = new ImageIcon("images/marcas.jpg");
        ImageIcon calendarioImage = new ImageIcon("images/calendario.jpg");
        String marcasAutosAltaGama[] = {
            "Alfa Romeo", "Aston Martin", "Audi", "BMW", "Ferrari", "Jeep",
            "Land Rover", "Mercedes-Benz", "Mini", "Nissan", "Porsche",
            "Volvo", "Smart", "Subaru", "Suzuki", "Toyota"
        };
        String marcasAutos[] = {
            "Chevrolet", "Citroen", "Dacia", "Fiat", "Ford", "Honda",
            "Kia", "Opel", "Peugeot", "Renault", "Seat", "Volkswagen", "Otro"};
        String anioFrabricacion[] = {"Anterior a 1960", "1960", "1961",
            "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969",
            "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977",
            "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985",
            "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993",
            "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001",
            "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009",
            "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017",
            "2018", "2019", "2020", "2021"};
        int cuota = 0;
        do {
            nombre = JOptionPane.showInputDialog("Ingrese nombre:");
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(
                        null, "Debe ingresar un nombre", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (nombre.isEmpty());
        do {
            apellido = JOptionPane.showInputDialog("Ingrese apellido:");
            if (apellido.isEmpty()) {
                JOptionPane.showMessageDialog(
                        null, "Debe ingresar un apellido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (apellido.isEmpty());
        Object marca;
        String[] result = Stream.of(marcasAutos, marcasAutosAltaGama).flatMap(Stream::of).toArray(String[]::new);
        do {
            marca = JOptionPane.showInputDialog(null, "Seleccione marca vehiculo", "Marcas", JOptionPane.QUESTION_MESSAGE, marcaImage, result, null);
            if (marca == null) {
                JOptionPane.showMessageDialog(
                        null, "Debe seleccionar una marca de vehiculo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (marca == null);

        Object calendario;
        do {
            calendario = JOptionPane.showInputDialog(null, "Seleccione marca vehiculo", "Año", JOptionPane.QUESTION_MESSAGE, calendarioImage, anioFrabricacion, null);
            if (calendario == null) {
                JOptionPane.showMessageDialog(
                        null, "Debe seleccionar año de fabricacion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (calendario == null);
        if (Arrays.asList(marcasAutosAltaGama).contains(marca)) {
            cuota += 1800;
        } else {
            cuota += 890;
        }
        cuota += verificarAnioFabricacion(calendario);
        do {
            dominio = JOptionPane.showInputDialog("Ingrese dominio del vehiculo:");
            if (dominio.isEmpty()) {
                JOptionPane.showMessageDialog(
                        null, "Debe ingresar un dominio", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (dominio.isEmpty());
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre
                + "\nApellido: " + apellido
                + "\nMarca: " + marca
                + "\nAño de fabricación: " + calendario
                + "\nDominio: " + dominio
                + "\nCuota mensual: " + cuota,
                "Compañia de seguros automotores", JOptionPane.INFORMATION_MESSAGE
        );
    }

    static int verificarAnioFabricacion(Object calendario) {
        int valor = 0;
        if (calendario.toString().equals("Anterior a 1960")) {
            valor = 350;
        } else {
            int anio = Integer.parseInt(calendario.toString());
            if (anio < 1990) {
                valor = 350;
            } else if (anio <= 1999 && anio >= 1990) {
                valor = 780;
            } else if (anio <= 2010 && anio >= 2000) {
                valor = 950;
            } else if (anio <= 2021 && anio >= 2011) {
                valor = 1200;
            }
        }
        return valor;
    }
}
