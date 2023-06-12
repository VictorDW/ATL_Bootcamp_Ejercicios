package com.clase6;

import java.util.Scanner;

public class Buscador {

    public static void main(String[] args) {

        String pais;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe el pais que deseas buscar con Google Maps");
        pais = teclado.nextLine();

        System.out.println("el enlace para que consultes el pais con Google Maps es el siguiente " +
                buscarPais(pais));

        teclado.close();
    }

    public static  String buscarPais (String pais) {
        return "https://www.google.com/maps/search/"+pais;
    }
}
