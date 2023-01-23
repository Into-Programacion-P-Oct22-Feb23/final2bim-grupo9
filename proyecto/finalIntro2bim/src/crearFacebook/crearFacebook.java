/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crearFacebook;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class crearFacebook {

    public static String crearFacebook() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un nombre de usuario");
        String usuario = entrada.next();
        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese su pais de nacimiento");
        String pais = entrada.nextLine();
        System.out.println("Ingrese su correo electronico");
        String correo = entrada.next();

        String mensaje;

        mensaje = String.format("\nUsuario: %s\nEdad: %d\n"
                + "De de la ciudad: %s\nPais: %s\nCorreo electronico: %s\n",
                usuario, edad, ciudad, pais, correo);

        return mensaje;
    }

}
