package com.clase6;

import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {

        double promedio;
        int sumaNumero = 0;

        Scanner teclado = new Scanner(System.in);

        for (int i=0;i<3;i++) {

            System.out.println("Digita un numero entero, " + (i+1));
            sumaNumero += teclado.nextInt();
        }
        promedio = sumaNumero / 3;
        System.out.println("El promedio es: "+promedio);

        teclado.close();
    }
}
