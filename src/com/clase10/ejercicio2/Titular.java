package com.clase10.ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Titular {

    private String nombre;
    private long cedula;
    private long telefono;
     private LocalDate fechaNacimiento;

    public Titular (String nombre, long cedula, long telefono, String fechaNacimiento){

        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.fechaNacimiento = setFechaNacimiento(fechaNacimiento);
    }

    private LocalDate setFechaNacimiento(String fecha) {
        final DateTimeFormatter fechaFormato = DateTimeFormatter.ofPattern("d/M/yyyy");
       return this.fechaNacimiento = LocalDate.parse(fecha,fechaFormato);
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String formatoFecha (){

        return getFechaNacimiento().getDayOfMonth() + "/" + getFechaNacimiento().getMonthValue() + "/" + getFechaNacimiento().getYear();
    }

    @Override
    public String toString() {
        return "------------------------------------------------- \n" +
                "Titular" + "\n" +
                "nombre: " + nombre + "\n" +
                "cedula: " + cedula + "\n" +
                "telefono: " + telefono + "\n" +
                "fecha nacimiento= " + formatoFecha() + "\n" +
                    "------------------------------------------------- \n";
    }
}
