/*
Crear un programa que nos pida un user, y una pass, este se tiene que comprobarse con un boolean
si user = usuario1 y pass = asdasd es true, sino es fale, estas solo se pueden probar 3 veces, 
se deben poder las veces de intentos. Repetir con una funcion.
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String user, pass;
        
        boolean login = false;

        for (int i = 0; i < 3 && !login; i++) {

            System.out.print("Indica el usuario: ");
            user = sc.nextLine();

            System.out.print("Introduce la contraseña: ");
            pass = sc.nextLine();

            if (user.equals("usuario1") && pass.equals("asdfg")) {
                login = true;
                System.out.println("Acceso permitido, el numero de intentos es: " + i++);

            } else {
                login = false;
                System.out.println("Acceso denegado, el numero de intentos es: " + i++);
            }
        }
    }
}
