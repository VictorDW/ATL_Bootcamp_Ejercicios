package com.clase8;

import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ingresarValores(teclado);
    }
    private static void ingresarValores(Scanner teclado)  {

        int base, altura;

        System.out.println("Digita la base del Triangulo");
        base = teclado.nextInt();

        System.out.println("Digita la altura del Triangulo");
        altura = teclado.nextInt();

        System.out.println("El areá del Triangulo es: " + areaTriangulo(base,altura) + " cm");
    }
    private static int areaTriangulo(int base, int altura) {

        return (base * altura) /2;
    }
}

