/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crearFlickr;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class crearFlickr {
    public static String crearFlickr() {

       Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un nombre de usuario");
        String usuario = entrada.next();
        System.out.println("Ingrese su correo electronico de preferencia");
        String correo = entrada.next();
        

        String mensaje;

        mensaje = String.format("\nUsuario: %s\nCorreo electronico: %s\n",
                usuario, correo);

        return mensaje;
    }
}
