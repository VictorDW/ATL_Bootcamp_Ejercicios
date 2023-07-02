package com.clase12.ejercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionCanciones {

    private final Scanner teclado = new Scanner(System.in);
    private final List <Cancion> listaCanciones = new ArrayList<>();

    public void agregarCanciones() {

        boolean bandera = true;
        String respuesta;

        while (bandera) {

            Cancion cancion = new Cancion();

            System.out.println("*********************************************");
            System.out.println("Escribe el titulo de la canción: ");
            cancion.setTitulo(teclado.nextLine());

            System.out.println("Escriba el nombre del artista");
            cancion.setArtista(teclado.nextLine());

            System.out.println("Escriba la duración de la canción (mm:ss)");
            cancion.setDuracion(teclado.nextLine());

            listaCanciones.add(cancion);
            System.out.println("¡Listo! Canción agregada con exito.");

            System.out.println("¿Quieres agregar otro canción? (s/n)");
            respuesta = teclado.next();
            teclado.nextLine();

            if (!(respuesta.equals("s"))) {
                bandera = false;
            }
        }
    }

    private void reproductor(){

        boolean bandera = true;
        String respuesta;
        int posCancion = 0;

        while(bandera){

            System.out.println("Reproductor");

            listaReproducion(posCancion);

            System.out.println("(Anterior/Siguiente/Salir)");
            respuesta = teclado.next();


            if (respuesta.equalsIgnoreCase("salir"))
                bandera = false;

            posCancion = BarraReproductor(respuesta,posCancion);
        }
        teclado.nextLine(); // con esto evito que se salte la linea del nombre de la canción cuando quiero agregar otra
    }

    private void  listaReproducion(int posicionCancion){

        Cancion cancion = listaCanciones.get(posicionCancion);

        System.out.println("******************************************************************************************");
        System.out.println("Canción: " + cancion.getTitulo() + " Duración: "+ cancion.getDuracion() + " Artista: " + cancion.getArtista());
        System.out.println("******************************************************************************************");
    }

    private int BarraReproductor(String respuesta, int posCancion) {

        if(respuesta.equalsIgnoreCase("anterior"))
            if(posCancion != 0) posCancion--;

        if (respuesta.equalsIgnoreCase("siguiente"))
            posCancion++;

        if (posCancion > listaCanciones.size()-1) posCancion = 0;

        return posCancion;
    }

    public void consultarListaReproduccion() {

        if(  listaCanciones.size() != 0)
            reproductor();
        else
            mensajeError();
    }

    private   void mensajeError() {
        System.out.println("La lista de reproducción  no tiene ninguna canción");
    }
}
