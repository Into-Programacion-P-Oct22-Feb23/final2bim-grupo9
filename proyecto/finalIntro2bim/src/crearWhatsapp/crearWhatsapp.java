/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crearWhatsapp;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class crearWhatsapp {

    public static String crearWhatsapp() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un nombre de usuario");
        String usuario = entrada.next();
        System.out.println("Ingrese su numero de telefono (movil)");
        int telefono = entrada.nextInt();
        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();

        System.out.println("Ingrese su ciudad");
        String ciudad = entrada.next();
        System.out.println("Ingrese su pais de nacimiento");
        String pais = entrada.next();

        String mensaje;

        mensaje = String.format("\nUsuario: %s\nEdad: %d\n"
                + "De de la ciudad: %s\nPais: %s\nCorreo electronico: %s\n",
                usuario, telefono, edad, ciudad, pais);

        return mensaje;
    }

}
