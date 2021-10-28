/*
 * Realizar un programa con el boletín de un alumno. El mismo debe contener el nombre del alumno, fecha de nacimiento y dni. Debe contener tres notas de una materia(dos vectores estáticos con tel nombre de la materia y la nota). Al final se debe recorrer el vector eh imprimir por consola la ficha del alumno con el promedio de cada materia.
 * Realiza una función para hacer el calculo del promedio
 * ============================
 * ====== Boletín del Alumno ======
 * == Alumno : Juan C Falabrino ====
 * == Fecha Nac: 23/06/1981 ====
 * == Dni: 999999999 ====
 * == Materia ======= Nota ======
 * = Literatura =1= 4 ======
 * = =2= 6 ======
 * = =3= 9 ======
 * ============================
 * Promedio de : 6,333 =====
 * ===========================
 */
package programador.ejercitacion.ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al sistema!!!");
        System.out.println("Por favor ingrese el nombre del alumno:");
        String nombre = sc.nextLine();
        System.out.println("Por favor ingrese el apellido del apellido:");
        String apellido = sc.nextLine();
        int anio;
        do {
            System.out.println("Ingrese el año de nacimiento:[XXXX]");
            anio = sc.nextInt();
            sc.nextLine();
            if (anio > 2010 || anio < 1930) {
                System.out.println("Debe ingresar un año válido mayor a 1930 menor a 2010");
            }

        } while (anio > 2010 || anio < 1930);
        int mes;
        do {
            System.out.println("Ingrese el mes de nacimiento:[XX]");
            mes = sc.nextInt();
            sc.nextLine();

            if (mes > 12 || mes < 1) {
                System.out.println("Debe ingresar un número de mes válido del 1 al 12");
            }
        } while (mes > 12 || mes < 1);
        int dia;
        do {
            System.out.println("Ingrese el dia de nacimiento:[XX]");
            dia = sc.nextInt();
            sc.nextLine();
        } while (validarDia(mes, dia));
        String dni;
        do {
            System.out.println("Ingrese su DNI: ");
            dni = sc.next();
            sc.nextLine();
            if (dni.length() < 8 || dni.length() > 8) {
                System.out.println("Error al ingresar el dni");
            }
        } while (dni.length() != 8);
        int[] materiaNotas = {5, 7, 9};
        String materia = "Literatura";
        System.out.println("================================");
        System.out.println("====== Boletín del Alumno ======");
        System.out.println("== Alumno: " + nombre + apellido);
        System.out.println("== Fec. Nac: " + dia + "/" + mes + "/" + anio);
        System.out.println("== DNI: " + dni);
        System.out.println("== Materia ==== Nota");
        for (int i = 0; i < materiaNotas.length; i++) {
            System.out.println("== Literatura - Nota n°" + (1 + i) + ": " + materiaNotas[i]);
        }
        System.out.println("== Promedio: " + promedio(materiaNotas));

    }

    public static double promedio(int[] notas) {
        double total = 0;
        for (int i = 0; i < notas.length; i++) {
            total = notas[i] + total;
        }
        return total / notas.length;
    }

    public static boolean validarDia(int mes, int diaIngresado) {
        boolean validar = true;
        if (diaIngresado <= 0) {
            validar = true;
            System.out.println("Debe ingresar un día válido!!!");
        } else {
            switch (mes) {
                case 1:
                    if (diaIngresado > 31) {
                        validar = true;
                        System.out.println("Enero tiene 1 - 31 días");
                        System.out.println("Debe ingresar un día válido!!!");
                    } else {
                        validar = false;
                    }
                    break;
                case 2:
                    if (diaIngresado > 28) {
                        validar = true;
                        System.out.println("Febrero tiene 28 días");
                        System.out.println("Debe ingresar un día válido!!!");
                    } else {
                        validar = false;
                    }
                    break;
                case 3:
                    if (diaIngresado > 31) {
                        validar = true;
                        System.out.println("Marzo tiene 31 días");
                        System.out.println("Debe ingresar un día válido!!!");
                    } else {
                        validar = false;
                    }
                    break;
                case 4:
                    if (diaIngresado > 30) {
                        validar = true;
                        System.out.println("Abril tiene 30 días");
                        System.out.println("Debe ingresar un día válido!!!");
                    } else {
                        validar = false;
                    }
                    break;
                case 5:
                    if (diaIngresado > 31) {
                        validar = true;
                        System.out.println("Mayo tiene 31 días");
                        System.out.println("Debe ingresar un día válido!!!");
                    } else {
                        validar = false;
                    }
                    break;
                case 6:
                    if (diaIngresado > 30) {
                        validar = true;
                        System.out.println("Junio tiene 30 días");
                        System.out.println("Debe ingresar un día válido!!!");
                    } else {
                        validar = false;
                    }
                    break;
                case 7:
                    if (diaIngresado > 31) {
                        validar = true;
                        System.out.println("Julio tiene 31 días");
                        System.out.println("Debe ingresar un día válido!!!");
                    } else {
                        validar = false;
                    }
                    break;
                case 8:
                    if (diaIngresado > 31) {
                        validar = true;
                        System.out.println("Agosto tiene 31 días");
                        System.out.println("Debe ingresar un día válido!!!");
                    } else {
                        validar = false;
                    }
                    break;
                case 9:
                    if (diaIngresado > 30) {
                        validar = true;
                        System.out.println("Septiembre tiene 30 días");
                        System.out.println("Debe ingresar un día válido!!!");
                    } else {
                        validar = false;
                    }
                    break;
                case 10:
                    if (diaIngresado > 31) {
                        validar = true;
                        System.out.println("Octubre tiene 31 días");
                        System.out.println("Debe ingresar un día válido!!!");
                    } else {
                        validar = false;
                    }
                    break;
                case 11:
                    if (diaIngresado > 30) {
                        validar = true;
                        System.out.println("Noviembre tiene 30 días");
                        System.out.println("Debe ingresar un día válido!!!");
                    } else {
                        validar = false;
                    }
                    break;
                case 12:
                    if (diaIngresado > 31) {
                        validar = true;
                        System.out.println("Diciembre tiene 31 días");
                        System.out.println("Debe ingresar un día válido!!!");
                    } else {
                        validar = false;
                    }
                    break;
            }
        }
        return validar;
    }
}
