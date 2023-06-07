package com.clase5;

import java.util.Scanner;

public class juegoAdivinar {

    public static void main(String[] args) {

        double numeroAleatorio = Math.random() * 100;

        Scanner tomarDato = new Scanner(System.in);

        System.out.println("Vamos a jugar adivina el numero, solo tienes una oportunidad, buena suerte!");
        int numero = tomarDato.nextInt();

        if (numero == (int)numeroAleatorio) {
            System.out.println("Excelente, lo has logrado");
        } else {
            System.out.println(" lo siento, el numero era : " + (int)numeroAleatorio);
        }

    }
}
