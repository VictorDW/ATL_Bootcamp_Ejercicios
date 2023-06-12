package com.clase6;

import java.util.Scanner;

public class BuscadorWS {

    public static void main(String[] args) {

        int indicativo;
        long numero;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa el indicativo del pais");
        indicativo = teclado.nextInt();

        System.out.println("Ingresa el numero de celular");
        numero = teclado.nextLong();

        System.out.println("El enlace para llamar es este: "+buscarWS(indicativo,numero));

        teclado.close();
    }

    public static String buscarWS(int indicativo,long numero) {
        return "https://api.whatsapp.com/send?phone=+"+indicativo+numero;
    }

}
