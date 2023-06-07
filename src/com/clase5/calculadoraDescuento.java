package com.clase5;

import java.util.Scanner;

public class calculadoraDescuento {

    public static void main(String[] args) {

        Scanner tomaDatos = new Scanner(System.in);

        System.out.println("Ingrese el precio original de un producto");
        double precioOriginal = tomaDatos.nextDouble();

        System.out.println("ingrese el porcentaje de descuento");
        int descuento = tomaDatos.nextInt();

        double precioFinal = precioOriginal - precioOriginal * (double)descuento / 100.0;
        System.out.println("El precio del producto con el descuento de " + descuento + " % es de : " + precioFinal + " Pesos");
    }
}
