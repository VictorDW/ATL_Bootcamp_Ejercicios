package com.clase7;

import java.util.Scanner;

public class IngresarNumeros {


    public static void main(String[] args) {

        int   cantidadNumeros = 5;
        int[] numeros = new int[cantidadNumeros];
        Scanner teclado = new Scanner(System.in);

        registrarNumeros(teclado, numeros) ;
        numeroMaxyMin(numeros);
        promedio(numeros);
    }

   public static void registrarNumeros(Scanner teclado, int[] numeros) {

        for (int index = 0; index < numeros.length; ) {

            mostrarMensaje("Ingrese el numero " + (index + 1));

            if (validarNumero(teclado)) {
                numeros[index] = teclado.nextInt();
                index++;
            }
        }
   }

   public static boolean validarNumero(Scanner teclado) {

        while(!(teclado.hasNextInt())) {
                mostrarMensaje("Error: digita un numero entero correcto");
                teclado.next();
        }

        return true;
   }

   public static void numeroMaxyMin(int[] numeros){

       int max = Integer.MIN_VALUE;
      int  min = Integer.MAX_VALUE;

       for (int index = 0; index < numeros.length;index++) {

           if(numeros[index] > max) max = numeros[index] ;
           if (numeros[index]  < min) min = numeros[index] ;
       }

       mostrarMensaje("----------------------------------------------------------------------------------------------------------------------------");
       mostrarMensaje("El numero mayor es : " + max + "\n" +
               "El numero menor es : "+ min);
       mostrarMensaje("----------------------------------------------------------------------------------------------------------------------------");
   }

   public static void promedio(int[] numeros) {

        int suma = 0;
        float promedio;

       for (int index = 0; index < numeros.length;index++) {

           suma += numeros[index];
       }
        promedio = (float) suma / numeros.length;
       mostrarMensaje("El primedio es: " + promedio);
       mostrarMensaje("----------------------------------------------------------------------------------------------------------------------------");
   }

   public static void mostrarMensaje(String mensaje) {
       System.out.println(mensaje);
   }
}
