package com.clase8;

import java.util.Scanner;

public class GeneradorContrasenhas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("La contraseña generada es : "+ definirLongitudContra(teclado));

    }

    private static String definirLongitudContra(Scanner teclado) {

        int longitud;

        System.out.println("Escribe la longitud de la contraseña");
        longitud = teclado.nextInt();
        String contrasenha = "";

        for (int index = 0;index<longitud;index++) {

            contrasenha +=  generarContrasenha();
        }

        return contrasenha;
    }

    private static char generarContrasenha () {

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ~@_/+:abcdefghijklmnopqrstuvwxyz0123456789";

        int  posicion = (int) (Math.random()* caracteres.length()+1);

        return  caracteres.charAt(posicion);
    }
}
