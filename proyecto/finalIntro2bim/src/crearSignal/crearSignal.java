/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crearSignal;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class crearSignal {

    public static String crearSignal() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un nombre de usuario");
        String usuario = entrada.next();
        System.out.println("Ingrese su numero de telefono (movil)");
        int telefono = entrada.nextInt();
        
        entrada.nextLine();
        
        System.out.println("Ingrese su ciudad");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese su pais de nacimiento");
        String pais = entrada.nextLine();
        System.out.println("Cual es su hobby principal?");
        String hobby = entrada.nextLine();

        String mensaje;

        mensaje = String.format("\nUsuario: %s\nTelefono: %d\n"
                + "De de la ciudad: %s\nPais: %s\nSu hobby es: %s\n",
                usuario, telefono, ciudad, pais, hobby);

        return mensaje;
    }
}
