package com.clase12.ejercicio2;

import java.util.Scanner;

public class CalculadoraCambio {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float valorProducto;
        float dineroPago;

        System.out.println("Digita el valor del producto :");
        valorProducto = teclado.nextFloat();

        System.out.println("Digite con cuanto va a pagar :");
        dineroPago = teclado.nextFloat();

        float devuelta = dineroPago - valorProducto;

        System.out.println("La devuelta es : $"+ (int)devuelta + " pesos");
        System.out.println(desgloseDevuelta(devuelta));
    }

    public static String desgloseDevuelta(float devuelta) {

        float[] dinero = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500,200,100,50};
        int cantidad;
        int pos = 0;
        String devueltaDesglosada ="Los billetas y monedas para devolver son: \n";
        String mensajeAux = "";


        while(devuelta > 0) {

            cantidad = cantidadBilleteMoneda(devuelta, dinero[pos]);

            if((cantidad > 0)) {
                 mensajeAux = devuelta >= 1000 ? " Billete " : " Moneda ";

                devueltaDesglosada += "- " + cantidad + mensajeAux + "de " +  (int)(dinero[pos]) +  "\n";;
                devuelta -= dinero[pos]*cantidad;
            }

            pos++;
        }

        return devueltaDesglosada;
    }

    private static int cantidadBilleteMoneda(float devuelta, float dinero) {

        int cantidad =  (int)(devuelta/dinero);

        return cantidad;
    }
}
