package com.clase12.ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionAlumnos {

   private Scanner teclado = new Scanner(System.in);
   private List<Alumnos> alumnos = new ArrayList<>();


   public  void registrarAlumnos () {

      boolean bandera = true;
      String respuesta;

      while (bandera) {

         Alumnos alumno = new Alumnos();

         System.out.println("*********************************************");
         System.out.println("Escribe el nombre del alumno: ");
         alumno.setNombre(teclado.next());

         System.out.println("Escriba el apellido del alumno");
         alumno.setApellido(teclado.next());

         System.out.println("--------------------------------------");
         System.out.println("Digita la notas");
         System.out.println("--------------------------------------");
         ingresarNotas(alumno);

         alumnos.add(alumno);
         System.out.println("¡Listo! Alumno agregado con exito.");

         System.out.println("¿Quieres agregar otro alumno? (s/n)");
         respuesta = teclado.next();

         if(!(respuesta.equals("s"))) {
            bandera = false;
         }
      }
   }

   private  void ingresarNotas(Alumnos alumno) {

      boolean bandera = true;
      String respuesta;
      int cont = 1;

      while(bandera) {

         System.out.println("Nota "+cont);
         alumno.agregarNota(teclado.nextDouble());
         cont++;

         System.out.println("¿Quieres agregar otra nota? (s/n)");
         respuesta = teclado.next();

         if(!(respuesta.equals("s"))) bandera = false;
      }
      System.out.println("--------------------------------------");
   }

   private void mostrarAlumnos() {

      int index = 1;

      for (Alumnos alumno : alumnos) {
         System.out.println(index + "-" + "| Nombre: " + alumno.getNombre() +
                                                       "| Apellido: " + alumno.getApellido() +
                                                       "| Notas: " + mostrarNotas(alumno));
         index++;
      }
   }

   private String mostrarNotas(Alumnos alumno) {

      String mensaje = "";

      for (double nota : alumno.getNotas()){
         mensaje += nota +", ";
      }

      return mensaje;
   }

   public void consultarAlumnos(){

      if(alumnos.size() == 0)
         mensajeError();
      else
         mostrarAlumnos();

   }

   private void mensajeError() {
      System.out.println("no hay ningún alumno registrado");
   }
}
