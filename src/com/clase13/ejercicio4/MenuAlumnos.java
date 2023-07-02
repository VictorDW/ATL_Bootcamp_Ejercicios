package com.clase12.ejercicio4;

import java.util.Scanner;

public class MenuAlumnos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int respuesta;
        boolean bandera = true;
        GestionAlumnos gestion = new GestionAlumnos();

        do{
            System.out.println("**************Menú Alumnos**************");
            System.out.println("* 1- Registrar Alumnos ");
            System.out.println("* 2- Mostrar los Alumnos ");
            System.out.println("* 0- Salir");
            System.out.println("*********************************************");
            respuesta = teclado.nextInt();

            if(respuesta == 0)
                bandera = false;

            if(respuesta == 1 || respuesta == 2)
                eleccion(respuesta,gestion);

        }while(bandera);
    }

    public static void eleccion(int respuesta,GestionAlumnos gestion) {

        switch (respuesta) {
            case 1:
                gestion.registrarAlumnos();
                System.out.println("*********************************************");
                break;
            case 2:
                System.out.println("*********************************************");
                gestion.consultarAlumnos();
                System.out.println("*********************************************");
                break;
        }
    }



}
