package com.clase10.ejercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {

    private  String nombre;
    private long DNI;
    private int edad;
    private LocalDate fechaNacimiento;


    public Persona() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    private void setEdad() {

        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(getFechaNacimiento(), fechaActual);

        this.edad = periodo.getYears();
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fecha) {
        final DateTimeFormatter fechaFormato = DateTimeFormatter.ofPattern("d/M/yyyy");
        this.fechaNacimiento = LocalDate.parse(fecha,fechaFormato);

        setEdad();
    }

    public String formatoFecha (){

        return getFechaNacimiento().getDayOfMonth() + "/" + getFechaNacimiento().getMonthValue() + "/" + getFechaNacimiento().getYear();
    }
    public String esMayorEdad() {

        if(getEdad() >= 18)
            return "Es mayor de edad";
        else
            return "Es menor de edad";
    }

    public String mostrar() {
        return "Persona \n" +
                "nombre: "+ getNombre() + "\n" +
                "DNI: " + getDNI() + "\n" +
                "edad: " + getEdad() + " años"+ "\n" +
                "fechaNacimiento: " + formatoFecha();
    }
}
