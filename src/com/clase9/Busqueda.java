package com.clase9;

import java.util.Scanner;

public class Busqueda {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String busqueda;

        System.out.println("Busqueda por el nombre");
        busqueda = teclado.nextLine();

        System.out.println("------------------------------");
        System.out.println("Resultado de la busqueda:");
        System.out.println("------------------------------");
        System.out.println(resultados(busqueda));

    }

    private static String resultados (String busqueda) {

        String[] nombres = {"Victor Alfonso Agudelo", "Laura Julina Solano","Luisa Maria Agudelo","Marlon Diaz",
                "Carlos Andres Agudelo","Maria Paula Solano"};

        String resultadoNombre = "";

        for (String nombre: nombres) {

            if(nombre.toLowerCase().contains(busqueda.toLowerCase())){
                resultadoNombre += nombre+"\n";
            }
        }

        return resultadoNombre;
    }


}
