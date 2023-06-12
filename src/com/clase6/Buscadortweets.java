package com.clase6;

import java.util.Scanner;

public class Buscadortweets {

    public static void main(String[] args) {

        String tweet;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe el nombre de la celebridad que quieres buscar, solo el primer nombre");
        tweet = teclado.nextLine();

        System.out.println("el tweet es el siguiente " + buscarTweet(tweet));

        teclado.close();
    }

    public static  String buscarTweet (String tweet) {
        return "https://twitter.com/search?q=" + tweet;
    }
}
