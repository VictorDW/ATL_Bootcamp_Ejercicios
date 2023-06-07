package com.clase5;

import java.util.Scanner;

public class calculadoraPropinas {

    public static void main(String[] args) {

        Scanner tomaDatos = new Scanner(System.in);

        System.out.println("Digite el valor de la cuenta a pagar");
        double pagoCuenta = tomaDatos.nextDouble();

        System.out.println("Digite el porcentaje de propina que desea dar");
        int porcetajePropina = tomaDatos.nextInt();

        double propina = (double)porcetajePropina * (pagoCuenta / 100.0);
        System.out.println("La propina seria de: $" + propina + " Pesos");
    }

}
