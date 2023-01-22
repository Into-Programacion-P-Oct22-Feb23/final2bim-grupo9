/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crearTwitter;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class crearTwitter {

    public static void crearTwitter() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un nombre de usuario");
        String usuario = entrada.nextLine();
        System.out.println("Ingrese sus nombres");
        String nombres = entrada.nextLine();
        System.out.println("Ingrese sus apellidos");
        String apellidos = entrada.nextLine();

        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();
        System.out.println("Ingrese su ciudad");
        String ciudad = entrada.next();
        System.out.println("Ingrese su pais de nacimiento");
        String pais = entrada.next();

        System.out.println("Ingrese su idioma ( que mas domine)");
        String idioma = entrada.next();

        System.out.println("Ingrese su correo electronico");
        String correo = entrada.next();


        System.out.printf("\nUsuario: %s\nNombres: %s\nApellidos: %s\n"
                + "Edad: %d\nProveniente de la ciudad: %s\nPais: %s\n"
                + "De idioma: %s\nCorreo electronico: %s\n",
                usuario, nombres, apellidos, edad,
                ciudad, pais, idioma, correo);

    }
}


