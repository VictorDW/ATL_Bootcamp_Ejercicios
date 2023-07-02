package com.clase12.ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class AmigoSecreto {

    public static int cantidadAmigos;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String[] rondaAmigos;
        String[] rondaSecreta;

        rondaAmigos = ingresarAmigos(teclado);
        rondaSecreta = amigoSecreto(rondaAmigos);
        darRegalo(rondaAmigos, rondaSecreta,teclado);
    }

    public  static String[] ingresarAmigos(Scanner teclado){

        System.out.println("Cuantos amigos van a jugar amigo secreto: ");
        cantidadAmigos = teclado.nextInt();

        String[] amigos  = new String[cantidadAmigos];

        for (int index = cantidadAmigos-1; index >= 0 ; index--) {

            System.out.println("Ingresa el nombre: ");
            amigos[index] = teclado.next();
        }

        return amigos;
    }


    public static String[] amigoSecreto(String[] rondaAmigos){

        String[] rondaSecreta = new String[cantidadAmigos];

        for (int index = 0; index < cantidadAmigos;) {

            int posAleatoria = posicionAletoria(index, rondaSecreta);

            if( posAleatoria != -1) {
                rondaSecreta[posAleatoria] = rondaAmigos[index];
                index++;
            }
        }
        return rondaSecreta;
    }

    public static int posicionAletoria(int posicion, String[] rondaSecreta) {

        Random random = new Random();
        int posicionAleatoria = random.nextInt(rondaSecreta.length);

        if(rondaSecreta[posicionAleatoria] == null && posicion != posicionAleatoria) return posicionAleatoria;

        return -1;
    }

    public static void darRegalo(String[] amigos, String[] amigosSecretos,Scanner teclado) {

        String respuesta;

        for(int index=0;index<amigos.length;index++) {

            System.out.println("Pase al frente de la pantalla: " + amigos[index] + "\n\n" +
                                       "¿Estas listo? Entonces escribes \"Listo\" para continuar");
            respuesta = teclado.next();

            respuestaCorrecta(respuesta, teclado);

            System.out.println("Dale el regalo a tu amigo secreto que es: " + amigosSecretos[index]);
            System.out.println("Presiona (cualquier tecla + enter) para ocultar tu amigo secreto");
            teclado.next();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }

    }

    private static void respuestaCorrecta(String respuesta, Scanner teclado) {

        do {
            if(!(respuesta.toLowerCase().equals("listo"))) {
                System.out.println("Escribe \"Listo\" para continuar \n");
                respuesta = teclado.next();
            }

        }while((!respuesta.equals("listo")));

    }
}
