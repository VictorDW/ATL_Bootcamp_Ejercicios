package com.clase10.ejercicio2;


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        LocalDate fechaActual = LocalDate.now();

        // Cuenta 1

        Titular titular1 = crearTitular(teclado);
        Cuenta cuenta1 = crearCuenta(titular1,fechaActual);

        movimiento(cuenta1,"depositar",1000000);
        movimiento(cuenta1,"retirar",100000);
        movimiento(cuenta1, "mostrar",0);

        // Cuenta 2

        Titular titular2 = crearTitular(teclado);
        Cuenta cuenta2 = crearCuenta(titular2,fechaActual);

        movimiento(cuenta2,"retirar",100000);
        movimiento(cuenta2,"mostrar",0);
    }

    private static Titular crearTitular(Scanner teclado) {
        String nombre;
        long cedula;
        long telefono;
        String fechaNacimiento;

        System.out.println("Primero se creara el titular de la cuenta");

        System.out.println("Ingrese el nombre del titular ");
        nombre = teclado.nextLine();

        System.out.println("Ingrese la cedula");
        cedula = teclado.nextLong();

        System.out.println("Ingrese la fecha de nacimiento (dd/mm/anho)");
        fechaNacimiento = teclado.next();

        System.out.println("Ingrese el telefono");
        telefono = teclado.nextLong();
        teclado.nextLine();

        return new Titular(nombre, cedula, telefono, fechaNacimiento);
    }

    private static Cuenta  crearCuenta(Titular titular,LocalDate fechaActual) {
        Period periodo = Period.between(titular.getFechaNacimiento(), fechaActual);
        boolean isMayor = periodo.getYears() >= 18;

        if (!isMayor) {
            System.out.println("Lo siento, no tienes la edad para abrir una cuenta");
            return null;
        }

        return  new Cuenta(titular);
    }

    private static void movimiento(Cuenta cuenta, String operacion, long monto) {

        if(!(cuenta == null)) {

            switch (operacion){
                case "depositar":
                    System.out.println(cuenta.depositar(monto));
                    break;
                case "retirar":
                    System.out.println(cuenta.retirar(monto));
                    break;
                case "mostrar":
                    System.out.println(cuenta.mostrar());
                    break;
                default:
                    System.out.println("operacion erronea");
            }
        }
    }

}


