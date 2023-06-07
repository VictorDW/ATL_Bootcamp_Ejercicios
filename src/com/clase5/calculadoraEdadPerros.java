package com.clase5;

import java.util.Scanner;

public class calculadoraEdadPerros {

    public static void main(String[] args) {

        Scanner tomaDatos = new Scanner(System.in);

        System.out.println("Digita la edad del perro");
        int edadPerro = tomaDatos.nextInt();

        int edadHumana = edadPerro * 7;
        System.out.println("La edad del perro en edad humana es : " + edadHumana + " años");
    }
}


