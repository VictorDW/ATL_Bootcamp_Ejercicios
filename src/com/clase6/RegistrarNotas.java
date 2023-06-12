package com.clase6;

import java.util.Arrays;
import java.util.Scanner;

public class RegistrarNotas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] alumnos = new  String[3] ;
        double[][] notas = new double[alumnos.length][] ;

        registrarNotas(alumnos,notas,teclado);
        ordenarNotas(notas);
        promedioNotas(alumnos,notas);
        notaMayoryMenor(alumnos,notas);
        mostrarAlumnos(alumnos,notas);
    }

    public static void registrarNotas(String[] alumnos, double[][] notas, Scanner teclado) {

        int cantidadNotas;

        mostrarMensaje("Por favor ingresa la cantidad de notas que vas a registrar");
        cantidadNotas = teclado.nextInt();

        for(int i=0;i<3;i++) {

            notas[i] = new double[cantidadNotas];

            mostrarMensaje("----------------------------------------------------------------------------------------------------------------------------");
            mostrarMensaje("Ingrese el nombre del alumno");
            teclado.nextLine();
            alumnos[i] = teclado.nextLine();

            for (int j=0; j<cantidadNotas;j++){
                mostrarMensaje("ingrese la nota numero: "+(j+1));
                notas[i][j] = teclado.nextDouble();
            }
            mostrarMensaje("----------------------------------------------------------------------------------------------------------------------------");
        }

    }

    public static  void ordenarNotas(double[][] notas) {

        for (double[] fila : notas) {
            Arrays.sort(fila);
        }
    }

    public static void promedioNotas(String[] alumnos, double[][] notas) {

        for (int i=0;i<alumnos.length;i++){

            double promedio = 0.0;
            mostrarMensaje("----------------------------------------------------------------------------------------------------------------------------");
            mostrarMensaje("Alumno: "+alumnos[i]);

            for (int j=0;j<notas[i].length;j++) {

                promedio +=  notas[i][j];
            }

            System.out.printf("Promedio: %.2f \n",(promedio / notas[i].length));
            mostrarMensaje("----------------------------------------------------------------------------------------------------------------------------");
        }

    }

    public static void notaMayoryMenor(String[] alumnos, double[][] notas) {

        double max = notas[0][notas[0].length-1];
        double min = notas[0][0];
        String alumnoNotaMax = alumnos[0];
        String alumnoNotaMin = alumnos[0];

        for(int i=1; i<notas.length;i++) {

            if(notas[i][notas[i].length-1] > max) {

                max = notas[i][notas[i].length-1];
                alumnoNotaMax = alumnos[i];

            } else if (notas[i][0] < min) {

                min = notas[i][0];
                alumnoNotaMin = alumnos[i];
            }
        }
        mostrarMensaje("----------------------------------------------------------------------------------------------------------------------------");
        mostrarMensaje("El alumno con la nota mas alta \n" + alumnoNotaMax + "\n" + max + "\n" +
                "El alumno con la nota mas baja \n" + alumnoNotaMin + "\n" + min);
        mostrarMensaje("----------------------------------------------------------------------------------------------------------------------------");
    }

    public  static void mostrarAlumnos(String[] alumnos, double[][] notas){

        for (int i=0; i<alumnos.length;i++) {

            mostrarMensaje("----------------------------------------------------------------------------------------------------------------------------");
            mostrarMensaje("Alumno : " + alumnos[i]);

            for (int j=0; j<notas[i].length;j++) {

                mostrarMensaje("Nota "+(j+1)+" : "+ notas[i][j]);
            }
        }
    }
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
