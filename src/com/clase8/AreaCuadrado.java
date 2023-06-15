package com.clase8;

import java.util.Scanner;

public class AreaCuadrado {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ingresarLados(teclado);

    }


    private static void ingresarLados(Scanner teclado)  {

        int lado1, lado2;

        System.out.println("Digita el primer lado de cuadrado");
        lado1 = teclado.nextInt();

        System.out.println("Digita el segundo lado del cuadrado");
        lado2 = teclado.nextInt();

        System.out.println("El areá del cuadrado es: " + areaCuadrado(lado1,lado2) + " cm");
    }
    private static int areaCuadrado(int lado1, int lado2) {

        return lado1 * lado2;
    }
}
