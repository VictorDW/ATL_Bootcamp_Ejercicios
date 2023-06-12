package com.clase6;

import java.util.Scanner;

public class Juego {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String[] opcion = {"piedra","papel","tijera"};
        String respuesta;
        String eleccionPlayer;
        String eleccionPC;
        String resultado;
        String nombrePlayer;
        Integer puntosPlayer = 0;
        Integer puntosPC = 0;
        int contador = 1;
        int eleccion;


       mostrarMensaje("Bienvenido al juego de piedra, papel y tijera\n" +
                "Las reglas de juego son las siguientes, tienes 3 intentos, quien gane 2 de los 3, sera el ganador\n"+
                "Deseas jugar (s/n)");
        respuesta = teclado.nextLine().toLowerCase();
        mostrarMensaje("----------------------------------------------------------------------------------------------------------------------------");

        mostrarMensaje("Pero primero que todo dime como te llamas");
        nombrePlayer = teclado.nextLine();
        mostrarMensaje("----------------------------------------------------------------------------------------------------------------------------");

        if(respuesta.equals("s")) {

            while(contador <=3){

                mostrarMensaje("Intento numero: " + contador + "\n" + "Elige una opcion entre (1-piedra, 2-papel o 3-tijera)");
                eleccion = teclado.nextInt();
                mostrarMensaje("----------------------------------------------------------------------------------------------------------------------------");

                if(!(eleccion > 0 && eleccion < 4)) continue;

                eleccionPlayer = opcion[eleccion-1];
                eleccionPC = opcion[(int) Math.floor(Math.random()*opcion.length)];

                mostrarMensaje("Jugador lanza " + eleccionPlayer +" vs maquina lanza "+ eleccionPC);
                resultado = decision(eleccionPlayer,eleccionPC,nombrePlayer);
                mostrarMensaje(resultado);

                if(resultado.endsWith(nombrePlayer)) puntosPlayer++;
                else if (resultado.endsWith("Maquina")) puntosPC++;

                mostrarMensaje("----------------------------------------------------------------------------------------------------------------------------");
                mostrarMensaje("Duelos ganados por "+nombrePlayer+ " " + puntosPlayer);
                mostrarMensaje("Duelos ganados por la maquina " + puntosPC);
                mostrarMensaje("----------------------------------------------------------------------------------------------------------------------------");

                if(puntosPlayer.equals(2) || puntosPC.equals(2)) {
                    mostrarMensaje("El ganador absoluto es: " + (puntosPlayer.equals(2) ? nombrePlayer : "La maquina"));
                    break;
                } else if (contador == 3)
                    mostrarMensaje("Lo siento, no has podido vencer a la maquina, has empatado con ella");

                contador++;
            }
        }else{
            mostrarMensaje("Que mal, jugaremos la proxima vez entonces, hasta pronto");
        }

        teclado.close();
    }
    public  static void mostrarMensaje(String mensaje) {

        System.out.println(mensaje);
    }

    public static String decision (String player, String pc, String nombre ) {
        String resultado;

        if(player.equals(pc)) return "Es un empate";

        if(player.equals("piedra") && pc.equals("tijera") ||
                player.equals("papel") && pc.equals("piedra") ||
                    player.equals("tijera") && pc.equals("papel")) {

            resultado = "Gano "+nombre;

        } else resultado = "Gano la Maquina";

        return resultado;
    }
}
