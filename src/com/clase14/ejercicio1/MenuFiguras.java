package com.clase14.ejercicio1;
import com.clase14.ejercicio1.GestionFiguras;

import java.util.Scanner;

public class MenuFiguras {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        MenuInicial(teclado);
    }

    public static void MenuInicial(Scanner teclado) {

        int respuesta;
        boolean bandera = true;
        GestionFiguras gestionFiguras = new GestionFiguras();

        do{
            System.out.println("**************Menú Figuras**************");
            System.out.println("* 1- Calcular el Area");
            System.out.println("* 2- Calcular el Perimetro");
            System.out.println("* 0- Salir");
            System.out.println("*********************************************");
            respuesta = teclado.nextInt();


            if(respuesta == 0)
                bandera = false;

            if(respuesta == 1 || respuesta == 2)
                SubMenu(respuesta, teclado, gestionFiguras);

        }while(bandera);
    }

    public static void SubMenu(int eleccion, Scanner teclado, GestionFiguras gestionFiguras ) {

        String respuesta;
        boolean bandera = true;

        do{
            System.out.println("**************Menú**************");
            System.out.println("* - Rectangulo");
            System.out.println("* - Triangulo");
            System.out.println("* - Circulo");
            System.out.println("* - Salir");
            System.out.println("*********************************************");
            respuesta = teclado.next();

            if (respuesta.equals("salir")) bandera = false;

            eleccionSubMenu(eleccion, respuesta.toLowerCase(), gestionFiguras);

        }while(bandera);
    }

    public static void eleccionSubMenu(int eleccion, String respuesta, GestionFiguras gestionFiguras) {

        if (respuesta.equals("rectangulo") || respuesta.equals("triangulo")) {

            if(eleccion == 1)
                gestionFiguras.consultarAreaRegular(respuesta);
            else
                gestionFiguras.consultarPerimetroRegular(respuesta);

            System.out.println("*********************************************");

        } else if(respuesta.equals("circulo")) {

            if(eleccion == 1)
                gestionFiguras.areaNoPoligono(respuesta);
            else
                gestionFiguras.perimetroNoPoligono(respuesta);

            System.out.println("*********************************************");
        }
    }
}
