package com.clase6;

import java.util.Scanner;

public class Cuento {

    public static void main(String[] args) {

        String respuesta;
        int opcion1, opcion2;

        Scanner teclado = new Scanner(System.in);

        mostrarMensaje("¡Bienvenido a la aventura!");
        mostrarMensaje("Estás a punto de embarcarte en un viaje emocionante. ¿Estás listo? (s/n)");

        respuesta = teclado.nextLine();

        if(respuesta.equalsIgnoreCase("s")) {
            mostrarMensaje("Es una noche estrellada, te encuentras en un bosque misterioso. ¿Que quieres hacer? (1 o 2) \n" +
                    "1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante \n" +
                    "2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora");

            opcion1 = teclado.nextInt();

            switch (opcion1){

                case 1:
                    mostrarMensaje("No encuentras el responsable del susurro, sin embargo continuas por un camino tenebroso que te dirige hacia el pueblo");
                    break;
                case 2:
                    mostrarMensaje("Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. Al llegar a la cabaña, te das cuenta de que hay dos puertas. ¿Hacia a donde quieres ir? (1 o 2)\n" +
                            "1) Entrar por la puerta de la izquierda \n" +
                            "2) Optas por la puerta de la derecha");

                    opcion2 = teclado.nextInt();

                    if(opcion2 == 1) {
                        mostrarMensaje("Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y magicos \n" +
                                "Te maravillas con las joyas y los objetos preciosos que llenan la sala. Te das cuenta de que has encontrado el legendario tesoso \n" +
                                "perdido del bosque. Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increible aventura con el mundo \n" +
                                "¡Felicidades, has tenido un final exitoso en tu búsqueda!");

                    } else if (opcion2 == 2) {
                        mostrarMensaje("Has elegido la puerta derecha. entras por esta puerta y te encuentras un ser muy tenebroso, te asustas tanto que sales corriendo" +
                                "de la cabaña y sigues el camino hacia el pueblo muy asustado queriendo contarle el suceso a todo el mundo");
                    }
                    else mostrarMensaje("Opción invalida. Tu aventura termina aqui.");
            }

            mostrarMensaje("Tu aventura ha terminado aqui, espero que regrese pronto para que continuemos con este maravilloso cuento");
        }else{
            mostrarMensaje("Es una lástima. ¡Espero que tengas una aventura emocionante en el futuro!");
        }

        teclado.close();
    }
    public  static void mostrarMensaje(String mensaje) {

        System.out.println(mensaje);
    }
}
