package com.clase14.ejercicio1.figuras;

public class Circulo extends NoPoligonos {
    @Override
    public double area() {
        return pi * (radio * radio);
    }

    @Override
    public double perimetro() {
        return (2 * pi) * radio;
    }
}
