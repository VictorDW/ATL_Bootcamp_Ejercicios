package com.clase12.ejercicio3;

import java.util.Scanner;

public class CalculaInteresCompuesto {

    public static void main(String[] args) {

        float capitalInicial;
        int tasaInteres;
        int tiempoAnhos;
        float capitalnuevo;
        float acumulado = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el capital");
        capitalInicial = teclado.nextFloat();
        System.out.println("ingrese la tasa de interes");
        tasaInteres= teclado.nextInt();
        System.out.println("ingrese el tiempo en años");
        tiempoAnhos = teclado.nextInt();

        capitalnuevo = capitalInicial;

        for (int index = 1; index <= tiempoAnhos; index++) {

            float interes = (capitalnuevo * tasaInteres)/100;

            capitalnuevo = capitalnuevo + interes;
            acumulado += capitalnuevo;

            System.out.println("Año: " + (index) + "| interes anual  : "+ tasaInteres+" %"+ "| interes: "+ (int)interes+ "| capital final: " + (int)capitalnuevo);
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Interes compuesto acumulado: "+ (int)acumulado);

    }
}
