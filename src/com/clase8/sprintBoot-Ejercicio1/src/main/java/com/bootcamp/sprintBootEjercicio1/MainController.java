package com.bootcamp.sprintBootEjercicio1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {

    /*
     * Getmapping me permite hacerle un seguimiento a la funcion, para que sprint boot sepa
     * que hacer con esta, ademas le especificamos que por la URL va a recibir un parametro
     * */
    @GetMapping("/generar-password/{longitud}")

    //ParhVariable permite especificar que ese parametro se va a recibir desde la URL
    public String generarContrasenha(@PathVariable int longitud) {

        String contrasenha = "";

        for (int index = 0;index<longitud;index++) {

            contrasenha +=  generarCaracter();
        }

        return "La contrseña es:  "+contrasenha;
    }

    private  char generarCaracter() {

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ~@_/+:abcdefghijklmnopqrstuvwxyz0123456789";

        int  posicion = (int) (Math.random()* caracteres.length()+1);

        return  caracteres.charAt(posicion);
    }


    @GetMapping("/cifrar-texto/{texto}")

    public  String cifrarMorse(@PathVariable String texto) {

        String mensajeMorse = "";

        /*
         * recorremos el arreglo, y se lo enviamos a la funcion que me retorna el caracter equivalente
         * luego, es Char que se retorna se transforma en String y final mente le agregagamos un espacio
         * con codigo unicode para separar las letras en el morce, tambien para agregar el doble espacio
         * que sirve para representar el espacio entre palabras
        * */
        for (int index=0; index < texto.length(); index++) {

            mensajeMorse += getAlfabeto(String.valueOf(texto.charAt(index))) + "\u00A0";
        }

        return mensajeMorse;
    }

    @GetMapping("/decifrar-codigo-morse/{textMorse}")

     public String decifrarMorse(@PathVariable String textMorse) {

        /*
        String textMorse = ".... --- .-.. .-  -.-. --- -- ---  . ... - .- ...";
        String textMorse = ".... --- .-.. .-   -- ..- -. -.. --- ";


        * Separamos el codigo morce obtenido, mediante un exprecion regular
        * esta expresion, lo que hace es que si detecta dos espacios al inicio o al final
        * separe por morce pero agregando ese espacio tambien al arreglo, y la ultima expresion
        * detecta los que sean de un solo espacio y tambien separa pero este ya sin tenerlo en cuenta
        *
        * Ejemplo:
        *
        * morcer: ... --- .-.. .-   -- ..- -. -.. ---
        *
        * array: ["...","---",".-..",".-","  ","--","..-","-.","-..","---"]
        *
        * */
        String[] arrayMorse = textMorse.split("(?=\s{2})|(?<=\s{2}) |\s");
        String mensajeLetras = "";


        //ahora se recorre el array y se envia el caracter para recibir el caracter equivalente
        for(String caracterMorse : arrayMorse) {
            mensajeLetras += getAlfabeto(caracterMorse);
        }

        return mensajeLetras;
    }

    public String getAlfabeto(String caracterEntrada) {

        String caracterSalida = "";
        String caracter;

        String[] alfabetoLetras = {" ","A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        String[] alfabetoMorse = {" ",".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        /*
        * Se recorre el array que tiene el alfabetoLetras o el alfabetoMorse, dependiendo la necesidad
        * */
        for(int index = 0; index < alfabetoMorse.length; index++) {

            //se evalua si el caracter que entra por parametro es una letra o espacio, mediante expresion regular
            if(caracterEntrada.matches("[A-Za-z|\s]")) {
                caracter = alfabetoLetras[index];
                if(caracter.equalsIgnoreCase(caracterEntrada)) caracterSalida = alfabetoMorse[index];

            }else{
                caracter = alfabetoMorse[index];
                 if (caracter.equals(caracterEntrada)) caracterSalida = alfabetoLetras[index];
            }
        }

        return caracterSalida;
    }


    @GetMapping("/juego/{eleccionPlayer}")
    public String juego( @PathVariable String eleccionPlayer){

        String[] opcion = {"piedra","papel","tijera"};
        String eleccionPC;
        String resultado;
        String ganador;


        // obtenemos un numero aletario entre 0 - 2 y asi accedemos a cualquiera de las tres posiciones del array
        eleccionPC = opcion[(int) Math.floor(Math.random()*opcion.length)];
        //envia la eleccion de jugar y maquina para evaluar quien gana o si en un empate
        resultado = decision(eleccionPlayer.toLowerCase(),eleccionPC);


        // este bloque de codigo, permite saber si el resultado fue empate, sino entonces si gano el jugaor o la maquina
        // tambien se probaron estilos dentro del String
        ganador = (resultado.endsWith("Empate")) ?
                            "<h3>Lo siento, no has podido vencer a la maquina, has empatado con ella<h3>" :
                            (resultado.endsWith("Player")) ?
                                    "<h3> El ganador absoluto es: </h3>" + "<h3 style= \"color: blue\"> Jugador </h3>"  :
                                    "<h3> El ganador absoluto es: </h3>" + "<h3 style= \"color: red\"> Maquina </h3>";

        return "<br><br>"+ "<h2>Jugador lanza " + eleccionPlayer + " vs maquina lanza " + eleccionPC+"</h2>" + "<br>" +  ganador;
    }

    public  String decision (String player, String pc ) {

        String resultado;

        if(player.equals(pc)) return "Es un Empate";

        if(player.equals("piedra") && pc.equals("tijera") ||
                player.equals("papel") && pc.equals("piedra") ||
                player.equals("tijera") && pc.equals("papel")) {

            resultado = "Gano Player";

        } else resultado = "Gano la Maquina";

        return resultado;
    }

}
