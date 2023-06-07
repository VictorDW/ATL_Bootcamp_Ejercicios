package com.clase5;

import java.util.Scanner;

public class conversorMillasaKM {

    public static void main(String[] args) {

        Scanner tomaDatos = new Scanner(System.in);

        System.out.println("Digita la distancia en millas: ");
        int millas = tomaDatos.nextInt();

        int kilometros = (int)((double)millas * 1.60934);
        System.out.println("La conversion de millas a kilometros es: " + kilometros + " km");
    }

}
