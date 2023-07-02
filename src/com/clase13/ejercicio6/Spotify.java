package com.clase12.ejercicio6;

import java.util.Scanner;

public class Spotify {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int respuesta;
        boolean bandera = true;
        GestionCanciones gestorSpotify = new GestionCanciones();

        do{
            System.out.println("**************Menú Spotify**************");
            System.out.println("* 1- Agregar canción a la lista de reproducción ");
            System.out.println("* 2- Lista de reproducción ");
            System.out.println("* 0- Salir");
            System.out.println("*********************************************");
            respuesta = teclado.nextInt();


            if(respuesta == 0)
                bandera = false;

            if(respuesta == 1 || respuesta == 2)
                eleccion(respuesta,gestorSpotify);

        }while(bandera);
    }

    public static void eleccion(int respuesta, GestionCanciones gestorSpotify) {

        switch (respuesta) {
            case 1:
                gestorSpotify.agregarCanciones();
                System.out.println("*********************************************");
                break;
            case 2:
                System.out.println("*********************************************");
                gestorSpotify.consultarListaReproduccion();
                System.out.println("*********************************************");
                break;
        }
    }


}
