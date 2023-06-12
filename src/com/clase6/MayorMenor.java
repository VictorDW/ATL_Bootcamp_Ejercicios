package com.clase6;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MayorMenor {

    public static void main(String[] args) {

        int numero1, numero2, numero3;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite el primer numero");
        numero1 = teclado.nextInt();

        System.out.println("Digite el segundo numero");
        numero2 = teclado.nextInt();

        System.out.println("Digite el tercer numero");
        numero3 = teclado.nextInt();

        System.out.println(numeroMayorMenor(numero1,numero2,numero3));

        teclado.close();
    }

    public static String numeroMayorMenor(int n1, int n2, int n3){

        int max = n1;
        int min = n1;

        if(n2 > max) {
            max = n2;
        }else if(n2 < min){
            min = n2;
        }

        if(n3 > max) {
            max = n3;
        }else if(n3 < min){
            min = n3;
        }

        return "El numero mayor es: " + max+ "\nel numero menor es: "+ min;

    }
}
