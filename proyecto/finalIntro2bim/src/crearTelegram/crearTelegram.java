/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crearTelegram;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class crearTelegram {

    public static void crearTelegram() {
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

        System.out.println("Ingrese su area de interes");   
        String area = entrada.nextLine();

        System.out.printf("\nUsuario: %s\nTelefono: %d\n"
                + "De la ciudad: %s\nPais: %s\nArea de interes: %s\n",
                usuario, telefono, ciudad,  pais, area);

    }
}
