/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import java.util.Scanner;
import crearFacebook.crearFacebook;
import crearTwitter.crearTwitter;
import crearWhatsapp.crearWhatsapp;
import crearTelegram.crearTelegram;
import crearSignal.crearSignal;
import crearInstagram.crearInstagram;
import crearFlickr.crearFlickr;
//import javax.swing.JOptionPane;

/**
 *
 * @author cdm18
 */
public class FinalIntro2bim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        int opcion;
        String terminar;
        int contador = 0;

        //  task:
        while (bandera) {

            /*   opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 para crear una cuenta en Facebook\n"
                    + "Ingrese 2 para crear una cuenta en Twitter\n"
                    + "Ingrese 3 para crear una cuenta en Whatsapp\n"
                    + "Ingrese 4 para crear una cuenta en Telegram\n"
                    + "Ingrese 5 para crear una cuenta en Signal\n"
                    + "Ingrese 6 para crear una cuenta en Instagram\n"
                    + "Ingrese 7 para crear una cuenta en Flickr\n"
                    + "-------------------------------------------"));*/
            System.out.println(""
                    + "Ingrese 1 para crear una cuenta en Facebook\n"
                    + "Ingrese 2 para crear una cuenta en Twitter\n"
                    + "Ingrese 3 para crear una cuenta en Whatsapp\n"
                    + "Ingrese 4 para crear una cuenta en Telegram\n"
                    + "Ingrese 5 para crear una cuenta en Signal\n"
                    + "Ingrese 6 para crear una cuenta en Instagram\n"
                    + "Ingrese 7 para crear una cuenta en Flickr\n"
                    + "-------------------------------------------");
            opcion = entrada.nextInt();

            if (opcion == 1) {
                String mensaje = crearFacebook.crearFacebook();
                System.out.println(mensaje);
                contador = contador + 1;

            }
            if (opcion == 2) {
                crearTwitter.crearTwitter();
                contador = contador + 1;

            }
            if (opcion == 3) {
                String mensaje = crearWhatsapp.crearWhatsapp();
                System.out.println(mensaje);
                contador = contador + 1;

            }
            if (opcion == 4) {
                crearTelegram.crearTelegram();
                contador = contador + 1;

            }
            if (opcion == 5) {
                String mensaje = crearSignal.crearSignal();
                System.out.println(mensaje);
                contador = contador + 1;

            }
            if (opcion == 6) {
                crearInstagram.crearInstagram();
                contador = contador + 1;

            }
            if (opcion == 7) {
                String mensaje = crearFlickr.crearFlickr();
                System.out.println(mensaje);
                contador = contador + 1;

            }

            // terminar = JOptionPane.showInputDialog("Desea salir del menu? Si es asi presione x");
            System.out.println("\nDesea salir del menu? Si es asi presione x"
                    + ", de lo contrario presione cualquier tecla");
            terminar = entrada.next();

            if ("x".equals(terminar) || "X".equals(terminar)) {
                bandera = false;
            }

        }

        //JOptionPane.showInputDialog("Numero de cuentas creadas %d\n", contador);
        System.out.printf("Numero de cuentas creadas: %d\n", contador);

        System.out.println(obtenerMensaje(contador));

    }

    public static String obtenerMensaje(int a) {
        String[] mensajeFinal = {"Campaña con poca afluencia",
            "Campaña moderada siga adelante",
            "Excelente campaña"};
        String mensaje = "";

        if (a >= 1 && a <= 5) {
            mensaje = mensajeFinal[0];

        }
        if (a >= 6 && a <= 15) {
            mensaje = mensajeFinal[1];

        }
        if (a >= 16) {
            mensaje = mensajeFinal[2];

        }
        return mensaje;

    }
}