/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crearInstagram;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class crearInstagram {

    public static void crearInstagram() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un nombre de usuario");
        String usuario = entrada.nextLine();

        System.out.println("Ingrese su ciudad");
        String ciudad = entrada.nextLine();
        
        
        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();
        
        entrada.nextLine();

        System.out.println("Ingrese su correo electronico");
        String correo = entrada.next();

        System.out.printf("\nUsuario: %s\nProveniente de la ciudad: %s\n"
                + "Edad: %d\nCorreo electronico: %s\n",
                usuario, ciudad, edad, correo);

    }
}
