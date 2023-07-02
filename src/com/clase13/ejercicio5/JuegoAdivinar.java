package com.clase12.ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public  class JuegoAdivinar {

        public static void main(String[] args) {

            List<Frase> frases = new ArrayList<>();
            boolean bandera = true;
            Scanner teclado = new Scanner(System.in);
            int posAleatoria = 0;
            String respuesta;


            System.out.println("""
                    ¡Bienvenido al emocionante juego de adivinanzas! Prepárate para poner a prueba tu ingenio y conocimientos\s
                    con una serie de desafiantes enigmas. Cada oración te presentará una pista o descripción,\s
                    y tu objetivo será adivinar la palabra correcta. ¡Demuestra tu destreza mental y diviértete descubriendo las respuestas!\s
                    ¿Estás listo para aceptar el desafío? ¡Comencemos a jugar!""");

            registraFrases(frases);

            while(bandera) {

                posAleatoria = aletorio(posAleatoria, frases.size());

                System.out.println("*********************************************");
                System.out.println(frases.get(posAleatoria).getPista());
                respuesta = teclado.next();

                System.out.println(verificarPalabra(respuesta, frases.get(posAleatoria).getPalabraCorrecta()));

                System.out.println("¿Quieres seguir jugando? (s/n)");
                respuesta = teclado.next();

                if(!(respuesta.equals("s"))) bandera = false;
            }

        }

        public static void registraFrases (List <Frase>  frases) {

            Frase frase1 = new Frase("Se encuentra en el cielo todas las noches y brilla con luz propia. ¿Qué es?", "Luna");
            Frase frase2 = new Frase("Es una fruta tropical, de piel amarilla y pulpa jugosa. ¿Qué es?","Banana");
            Frase frase3 = new Frase("Es un objeto que se utiliza para comunicarse a larga distancia. ¿Qué es?", "Teléfono");
            Frase frase4 = new Frase("Se utiliza para escribir y está compuesto por una mina y un cuerpo de madera. ¿Qué es?","Lápiz");
            Frase frase5 = new Frase("Es un deporte en el que se golpea una pequeña bola blanca con un palo largo. ¿Qué es?","Golf");

            frases.add(frase1);
            frases.add(frase2);
            frases.add(frase3);
            frases.add(frase4);
            frases.add(frase5);
        }

        public static int aletorio(int posAnterior, int tamanho){

            boolean bandera = true;
            int aleatorio = 0;

            while(bandera) {

                Random random = new Random();
                aleatorio = random.nextInt(tamanho);

                if(posAnterior != aleatorio) bandera = false;
            }
            return aleatorio;
        }

        public static String verificarPalabra(String respuesta, String palabraCorrecta) {

            if(!(palabraCorrecta.equalsIgnoreCase(respuesta)))
                return "Lo siento, esta vez no lo has logrado";

            return "¡Felicitaciones! Has adivinado la palabra";
        }
}
