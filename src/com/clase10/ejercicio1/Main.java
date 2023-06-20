package com.clase10.ejercicio1;

import com.clase10.ejercicio2.Titular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Persona persona = new Persona();
        ingresarPersona(persona,teclado);
        System.out.println(persona.esMayorEdad());
        System.out.println(persona.mostrar());
    }

    private static void ingresarPersona(Persona persona, Scanner teclado) {

        System.out.println("Ingresa los datos de la persona");
        System.out.println("------------------------------------");

        System.out.println("Ingrese el nombre");
         persona.setNombre(teclado.nextLine());

        System.out.println("Ingrese el DNI");
        persona.setDNI(teclado.nextLong());

        System.out.println("Ingrese la fecha de nacimiento (dd/mm/anho)");
        persona.setFechaNacimiento(teclado.next());
    }
}
