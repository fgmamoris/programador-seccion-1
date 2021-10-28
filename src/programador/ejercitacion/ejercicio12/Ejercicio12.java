/*
 * Tomar el ejercicio 11-C y agregarle 3 intentos para que ingrese las credenciales.
 * 
 */
package programador.ejercitacion.ejercicio12;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
public class Ejercicio12 {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String user = "user";
        String pass = "1234";
        int attempts = 0;
        String passScan;
        String userScan;
        System.out.flush();
        do {
            System.out.println("*******Bienvenido**********");
            System.out.println("Ingresar nombre de usuario:");
            userScan = sc.next();
            System.out.flush();
            System.out.println("Ingresar contraseña:");
            passScan = sc.next();
            System.out.flush();

            if (!pass.equals(passScan) || !user.equals(userScan)) {

                System.out.println("Usuario/Contraseña inconrrecta!!!!!");
                System.out.println("");
                System.out.println("");
                attempts++;
                if (attempts == 3) {
                    System.out.println("Usuario bloqueado, por favor contactarse \ncon el administrador del sistema");
                    break;
                }
            } else {
                System.out.println("*********************");
                System.out.println("*  Login exitoso!!  *");
                System.out.println("*********************");
            }
        } while (!pass.equals(passScan) || !user.equals(userScan));

    }

}
