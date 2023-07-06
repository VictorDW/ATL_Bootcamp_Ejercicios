package com.clase14.ejercicio1.figuras;

import com.clase14.ejercicio1.figuras.PoligonoRegular;

public class Rectangulo extends PoligonoRegular {

    public Rectangulo(){
        cantidadLados = 2;
    }
    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return (lados[0]*2) + (lados[1]*2);
    }
}
